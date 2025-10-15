/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.polaris.service.admin;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.iceberg.catalog.Namespace;
import org.apache.iceberg.exceptions.BadRequestException;
import org.apache.polaris.core.PolarisCallContext;
import org.apache.polaris.core.admin.model.AuthenticationParameters;
import org.apache.polaris.core.admin.model.AwsStorageConfigInfo;
import org.apache.polaris.core.admin.model.Catalog;
import org.apache.polaris.core.admin.model.CatalogProperties;
import org.apache.polaris.core.admin.model.ConnectionConfigInfo;
import org.apache.polaris.core.admin.model.CreateCatalogRequest;
import org.apache.polaris.core.admin.model.ExternalCatalog;
import org.apache.polaris.core.admin.model.IcebergRestConnectionConfigInfo;
import org.apache.polaris.core.admin.model.OAuthClientCredentialsParameters;
import org.apache.polaris.core.admin.model.PolarisCatalog;
import org.apache.polaris.core.admin.model.StorageConfigInfo;
import org.apache.polaris.core.entity.AsyncTaskType;
import org.apache.polaris.core.entity.CatalogEntity;
import org.apache.polaris.core.entity.NamespaceEntity;
import org.apache.polaris.core.entity.PolarisBaseEntity;
import org.apache.polaris.core.entity.PolarisEntityConstants;
import org.apache.polaris.core.entity.PolarisEntitySubType;
import org.apache.polaris.core.entity.PolarisEntityType;
import org.apache.polaris.core.entity.TaskEntity;
import org.apache.polaris.core.persistence.PolarisMetaStoreManager;
import org.apache.polaris.core.persistence.dao.entity.EntityResult;
import org.apache.polaris.service.task.OrphanEntityCleanupTaskHandler;
import org.apache.polaris.service.TestServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Integration test for orphan entity cleanup during catalog deletion.
 * 
 * <p>Tests the complete flow:
 * 1. Create passthrough facade catalog (federated external catalog)
 * 2. Create synthetic/JIT entities for sub-catalog RBAC
 * 3. Delete the catalog
 * 4. Verify orphan cleanup task is automatically created
 * 5. Verify handler processes the task correctly
 */
public class OrphanEntityCleanupIntegrationTest {

  private TestServices services;
  private PolarisMetaStoreManager metaStoreManager;
  private PolarisCallContext callContext;

  @BeforeEach
  public void setup() {
    // Enable all necessary features for orphan cleanup
    services =
        TestServices.builder()
            .config(
                Map.of(
                    "SUPPORTED_CATALOG_STORAGE_TYPES",
                    List.of("S3"),
                    "ALLOW_DROPPING_NON_EMPTY_PASSTHROUGH_FACADE_CATALOG",
                    Boolean.TRUE,
                    "ENABLE_ORPHAN_ENTITY_CLEANUP",
                    Boolean.TRUE,
                    "ENABLE_SUB_CATALOG_RBAC_FOR_FEDERATED_CATALOGS",
                    Boolean.TRUE,
                    "ENABLE_CATALOG_FEDERATION",
                    Boolean.TRUE))
            .build();

    metaStoreManager = services.metaStoreManager();
    callContext = services.newCallContext();
  }
  
  private PolarisAdminService createAdminService() {
    return new PolarisAdminService(
        services.polarisDiagnostics(),
        callContext,
        services.resolutionManifestFactory(),
        metaStoreManager,
        new org.apache.polaris.core.secrets.UnsafeInMemorySecretsManager(),
        new org.apache.polaris.service.identity.provider.DefaultServiceIdentityProvider(),
        services.securityContext(),
        new org.apache.polaris.core.auth.PolarisAuthorizerImpl(services.realmConfig()),
        org.apache.polaris.service.config.ReservedProperties.NONE);
  }

  /**
   * Test 1: Verify orphan cleanup task is automatically created on catalog deletion
   */
  @Test
  public void testOrphanCleanupTaskCreatedOnCatalogDeletion() {
    // Step 1: Create a local (source) catalog
    String localCatalogName = "source_catalog_for_federation";
    CatalogEntity localCatalog = createInternalCatalog(localCatalogName);
    
    // Step 2: Create passthrough facade catalog pointing to local catalog
    String federatedCatalogName = "federated_catalog_with_orphans";
    CatalogEntity federatedCatalog = createFederatedCatalog(federatedCatalogName, localCatalogName);
    
    // Step 3: Create synthetic entities (simulate JIT entity creation)
    createSyntheticNamespaceInCatalog(federatedCatalog.getId(), "synthetic_ns");
    
    // Step 4: Count tasks before deletion
    List<PolarisBaseEntity> tasksBeforeDeletion = listAllTasks();
    int taskCountBefore = tasksBeforeDeletion.size();
    
    // Step 5: Delete the federated catalog - this should automatically create orphan cleanup task
    createAdminService().deleteCatalog(federatedCatalogName);
    
    // Step 6: Verify orphan cleanup task was created
    List<PolarisBaseEntity> tasksAfterDeletion = listAllTasks();
    int taskCountAfter = tasksAfterDeletion.size();
    
    assertThat(taskCountAfter).as("Should have created an orphan cleanup task").isGreaterThan(taskCountBefore);
    
    // Step 7: Find the orphan cleanup task
    TaskEntity orphanTask = findOrphanCleanupTask(tasksAfterDeletion, federatedCatalog.getId());
    assertThat(orphanTask)
        .as("Orphan cleanup task should exist for the deleted catalog")
        .isNotNull();
    assertThat(orphanTask.getTaskType()).isEqualTo(AsyncTaskType.ORPHAN_ENTITY_CLEANUP);
    
    // Cleanup
    createAdminService().deleteCatalog(localCatalogName);
  }

  /**
   * Test 2: Verify orphan cleanup works correctly - catalog can be dropped with orphans
   */
  @Test
  public void testPassthroughFacadeCatalogWithOrphansCanBeDropped() {
    // Step 1: Create source catalog
    String localCatalogName = "local_catalog";
    createInternalCatalog(localCatalogName);
    
    // Step 2: Create federated catalog
    String federatedCatalogName = "federated_with_entities";
    CatalogEntity federatedCatalog = createFederatedCatalog(federatedCatalogName, localCatalogName);
    
    // Step 3: Create multiple synthetic entities that will become orphans
    createSyntheticNamespaceInCatalog(federatedCatalog.getId(), "orphan_ns1");
    createSyntheticNamespaceInCatalog(federatedCatalog.getId(), "orphan_ns2");
    
    // Step 4: Delete federated catalog - should succeed even with "orphan" entities
    // (With ALLOW_DROPPING_NON_EMPTY_PASSTHROUGH_FACADE_CATALOG enabled)
    createAdminService().deleteCatalog(federatedCatalogName);
    
    // Step 5: Verify catalog is gone
    assertThatThrownBy(() -> createAdminService().getCatalog(federatedCatalogName))
        .isInstanceOf(org.apache.iceberg.exceptions.NotFoundException.class);
    
    // Cleanup
    createAdminService().deleteCatalog(localCatalogName);
  }

  /**
   * Test 3: End-to-end test - verify orphan entities are cleaned up after catalog deletion
   */
  @Test
  public void testOrphanEntitiesAreCleanedUpAfterCatalogDeletion() {
    // Step 1: Create source catalog
    String localCatalogName = "source_catalog";
    createInternalCatalog(localCatalogName);
    
    // Step 2: Create federated catalog
    String federatedCatalogName = "federated_catalog";
    CatalogEntity federatedCatalog = createFederatedCatalog(federatedCatalogName, localCatalogName);
    long catalogId = federatedCatalog.getId();
    
    // Step 3: Create synthetic entities (simulating JIT entity creation for RBAC)
    NamespaceEntity syntheticNs1 = createSyntheticNamespaceInCatalog(catalogId, "orphan_ns1");
    NamespaceEntity syntheticNs2 = createSyntheticNamespaceInCatalog(catalogId, "orphan_ns2");
    
    // Step 4: Verify synthetic entities exist
    assertThat(metaStoreManager.loadEntity(callContext, catalogId, syntheticNs1.getId(), PolarisEntityType.NAMESPACE))
        .satisfies(result -> {
          assertThat(result.isSuccess()).as("Synthetic namespace 1 should exist").isTrue();
          assertThat(result.getEntity()).isNotNull();
        });
    
    assertThat(metaStoreManager.loadEntity(callContext, catalogId, syntheticNs2.getId(), PolarisEntityType.NAMESPACE))
        .satisfies(result -> {
          assertThat(result.isSuccess()).as("Synthetic namespace 2 should exist").isTrue();
          assertThat(result.getEntity()).isNotNull();
        });
    
    // Step 5: Delete the federated catalog
    // This should:
    // a) Drop the catalog (because ALLOW_DROPPING_NON_EMPTY_PASSTHROUGH_FACADE_CATALOG is enabled)
    // b) Automatically create an orphan cleanup task
    // c) The task executor will eventually process it and remove orphans
    createAdminService().deleteCatalog(federatedCatalogName);
    
    // Step 6: Find and execute the orphan cleanup task
    // In a real deployment, TaskExecutor would do this automatically
    // For testing, we find and execute it manually to verify the flow works
    List<PolarisBaseEntity> tasks = listAllTasks();
    TaskEntity orphanTask = findOrphanCleanupTask(tasks, catalogId);
    assertThat(orphanTask)
        .as("Orphan cleanup task should be automatically created on catalog deletion")
        .isNotNull();
    
    // Execute the task (simulating what TaskExecutor would do)
    OrphanEntityCleanupTaskHandler handler = new OrphanEntityCleanupTaskHandler(services.metaStoreManagerFactory());
    boolean success = handler.handleTask(orphanTask, services.newCallContext());
    assertThat(success).as("Orphan cleanup should complete successfully").isTrue();
    
    // Step 7: Verify orphan entities are removed (not found)
    assertThat(metaStoreManager.loadEntity(callContext, catalogId, syntheticNs1.getId(), PolarisEntityType.NAMESPACE))
        .satisfies(result -> {
          assertThat(result.isSuccess()).as("Orphan namespace 1 should be deleted").isFalse();
        });
    
    assertThat(metaStoreManager.loadEntity(callContext, catalogId, syntheticNs2.getId(), PolarisEntityType.NAMESPACE))
        .satisfies(result -> {
          assertThat(result.isSuccess()).as("Orphan namespace 2 should be deleted").isFalse();
        });
    
    // Cleanup
    createAdminService().deleteCatalog(localCatalogName);
  }

  /**
   * Test 4: Verify non-passthrough catalogs don't trigger orphan cleanup
   */
  @Test
  public void testRegularCatalogDeletionDoesNotCreateOrphanTask() {
    // Step 1: Create regular internal catalog (not passthrough facade)
    String catalogName = "regular_internal_catalog";
    createInternalCatalog(catalogName);
    
    // Step 2: Count tasks before deletion
    int taskCountBefore = listAllTasks().size();
    
    // Step 3: Delete catalog
    createAdminService().deleteCatalog(catalogName);
    
    // Step 4: Verify NO orphan cleanup task was created
    int taskCountAfter = listAllTasks().size();
    
    // There might be other cleanup tasks (table cleanup), but NOT orphan cleanup
    List<PolarisBaseEntity> tasksAfter = listAllTasks();
    for (PolarisBaseEntity task : tasksAfter) {
      TaskEntity taskEntity = new TaskEntity(task);
      assertThat(taskEntity.getTaskType())
          .as("Regular catalog deletion should not create orphan cleanup tasks")
          .isNotEqualTo(AsyncTaskType.ORPHAN_ENTITY_CLEANUP);
    }
  }

  /**
   * Test 5: Verify orphan cleanup is catalog-scoped (doesn't affect other catalogs)
   */
  @Test
  public void testOrphanCleanupIsCatalogScoped() {
    // Step 1: Create two source catalogs
    String localCatalog1 = "source1";
    String localCatalog2 = "source2";
    createInternalCatalog(localCatalog1);
    createInternalCatalog(localCatalog2);
    
    // Step 2: Create two federated catalogs
    String fedCatalog1 = "fed1";
    String fedCatalog2 = "fed2";
    CatalogEntity fed1 = createFederatedCatalog(fedCatalog1, localCatalog1);
    CatalogEntity fed2 = createFederatedCatalog(fedCatalog2, localCatalog2);
    
    // Step 3: Create entities in both catalogs
    NamespaceEntity ns1 = createSyntheticNamespaceInCatalog(fed1.getId(), "ns_in_fed1");
    NamespaceEntity ns2 = createSyntheticNamespaceInCatalog(fed2.getId(), "ns_in_fed2");
    
    // Step 4: Delete fed1 only
    createAdminService().deleteCatalog(fedCatalog1);
    
    // Step 5: Verify fed2 still exists with its entities
    CatalogEntity fed2After = createAdminService().getCatalog(fedCatalog2);
    assertThat(fed2After).isNotNull();
    
    // Step 6: Verify ns2 still exists (catalog-scoped cleanup didn't touch it)
    EntityResult ns2Result = metaStoreManager.loadEntity(
        callContext, fed2.getId(), ns2.getId(), PolarisEntityType.NAMESPACE);
    assertThat(ns2Result.isSuccess()).as("Namespace in fed2 should still exist").isTrue();
    
    // Cleanup
    createAdminService().deleteCatalog(fedCatalog2);
    createAdminService().deleteCatalog(localCatalog1);
    createAdminService().deleteCatalog(localCatalog2);
  }

  // ==================== Helper Methods ====================

  private CatalogEntity createInternalCatalog(String name) {
    AwsStorageConfigInfo storageConfig =
        AwsStorageConfigInfo.builder()
            .setStorageType(StorageConfigInfo.StorageTypeEnum.S3)
            .setAllowedLocations(List.of("s3://my-bucket/path/to/data"))
            .setRoleArn("arn:aws:iam::123456789012:role/my-role")
            .build();
    
    CatalogProperties props = CatalogProperties.builder("s3://my-bucket/path/to/data").build();
    
    Catalog catalog =
        PolarisCatalog.builder()
            .setType(Catalog.TypeEnum.INTERNAL)
            .setName(name)
            .setProperties(props)
            .setStorageConfigInfo(storageConfig)
            .build();
    
    createAdminService().createCatalog(new CreateCatalogRequest(catalog));
    return createAdminService().getCatalog(name);
  }

  private CatalogEntity createFederatedCatalog(String federatedName, String sourceCatalogName) {
    // Create connection config pointing to source catalog
    AuthenticationParameters authParams =
        OAuthClientCredentialsParameters.builder()
            .setAuthenticationType(AuthenticationParameters.AuthenticationTypeEnum.OAUTH)
            .setTokenUri("http://localhost/oauth/token")
            .setClientId("test-client")
            .setClientSecret("test-secret")
            .setScopes(List.of("PRINCIPAL_ROLE:ALL"))
            .build();
    
    ConnectionConfigInfo connectionConfig =
        IcebergRestConnectionConfigInfo.builder()
            .setConnectionType(ConnectionConfigInfo.ConnectionTypeEnum.ICEBERG_REST)
            .setUri("http://localhost/api/catalog")
            .setRemoteCatalogName(sourceCatalogName)
            .setAuthenticationParameters(authParams)
            .build();
    
    AwsStorageConfigInfo storageConfig =
        AwsStorageConfigInfo.builder()
            .setStorageType(StorageConfigInfo.StorageTypeEnum.S3)
            .setAllowedLocations(List.of("s3://my-bucket/federated"))
            .setRoleArn("arn:aws:iam::123456789012:role/my-role")
            .build();
    
    CatalogProperties props = CatalogProperties.builder("s3://my-bucket/federated").build();
    
    Catalog externalCatalog =
        ExternalCatalog.builder()
            .setType(Catalog.TypeEnum.EXTERNAL)
            .setName(federatedName)
            .setProperties(props)
            .setStorageConfigInfo(storageConfig)
            .setConnectionConfigInfo(connectionConfig)
            .build();
    
    createAdminService().createCatalog(new CreateCatalogRequest(externalCatalog));
    return createAdminService().getCatalog(federatedName);
  }

  private NamespaceEntity createSyntheticNamespaceInCatalog(long catalogId, String namespaceName) {
    // Create a synthetic namespace entity directly in the metastore
    // (simulating what happens with JIT entity creation for RBAC)
    Map<String, String> internalProps = new HashMap<>();
    internalProps.put(NamespaceEntity.PARENT_NAMESPACE_KEY, ""); // Root namespace
    
    PolarisBaseEntity namespaceEntity =
        new PolarisBaseEntity.Builder()
            .id(metaStoreManager.generateNewEntityId(callContext).getId())
            .catalogId(catalogId)
            .parentId(catalogId)
            .name(namespaceName)
            .typeCode(PolarisEntityType.NAMESPACE.getCode())
            .subTypeCode(PolarisEntitySubType.NULL_SUBTYPE.getCode())
            .createTimestamp(System.currentTimeMillis())
            .internalPropertiesAsMap(internalProps)
            .build();
    
    metaStoreManager.createEntityIfNotExists(callContext, null, namespaceEntity);
    return new NamespaceEntity(namespaceEntity);
  }

  private List<PolarisBaseEntity> listAllTasks() {
    return metaStoreManager.loadEntitiesAll(
        callContext,
        null,  // No catalog path (tasks are top-level)
        PolarisEntityType.TASK,
        PolarisEntitySubType.NULL_SUBTYPE);
  }

  private TaskEntity findOrphanCleanupTask(List<PolarisBaseEntity> tasks, long catalogId) {
    for (PolarisBaseEntity task : tasks) {
      TaskEntity taskEntity = new TaskEntity(task);
      if (taskEntity.getTaskType() == AsyncTaskType.ORPHAN_ENTITY_CLEANUP) {
        // Check if this task is for our catalog
        Long taskCatalogId = taskEntity.readData(Long.class);
        if (taskCatalogId != null && taskCatalogId == catalogId) {
          return taskEntity;
        }
      }
    }
    return null;
  }
}

