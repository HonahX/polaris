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
package org.apache.polaris.service.task;

import static org.assertj.core.api.Assertions.assertThat;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.QuarkusTestProfile;
import io.quarkus.test.junit.TestProfile;
import jakarta.inject.Inject;
import java.util.List;
import java.util.Map;
import org.apache.polaris.core.PolarisCallContext;
import org.apache.polaris.core.config.PolarisConfigurationStore;
import org.apache.polaris.core.context.RealmContext;
import org.apache.polaris.core.entity.AsyncTaskType;
import org.apache.polaris.core.entity.CatalogEntity;
import org.apache.polaris.core.entity.PolarisBaseEntity;
import org.apache.polaris.core.entity.PolarisEntityCore;
import org.apache.polaris.core.entity.PolarisEntitySubType;
import org.apache.polaris.core.entity.PolarisEntityType;
import org.apache.polaris.core.entity.TaskEntity;
import org.apache.polaris.core.persistence.BasePersistence;
import org.apache.polaris.core.persistence.MetaStoreManagerFactory;
import org.apache.polaris.core.persistence.PolarisMetaStoreManager;
import org.apache.polaris.core.config.FeatureConfiguration;
import org.apache.polaris.core.storage.PolarisStorageConfigurationInfo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for OrphanEntityCleanupTaskHandler using in-memory metastore.
 *
 * <p>These tests verify that the handler correctly:
 * 1. Constructs catalog paths for orphan entities
 * 2. Cleans up entities after catalog deletion
 * 3. Handles nested namespaces correctly
 */
@QuarkusTest
@TestProfile(OrphanEntityCleanupTaskHandlerTest.TestFeatureProfile.class)
class OrphanEntityCleanupTaskHandlerTest {
  
  /**
   * Test profile that enables ALLOW_DROPPING_NON_EMPTY_PASSTHROUGH_FACADE_CATALOG
   * This allows dropping catalogs even if they have child entities, which creates orphans.
   */
  public static class TestFeatureProfile implements QuarkusTestProfile {
    @Override
    public Map<String, String> getConfigOverrides() {
      // Feature configs are under "polaris.features" prefix
      return Map.of(
          "polaris.features." + FeatureConfiguration.ALLOW_DROPPING_NON_EMPTY_PASSTHROUGH_FACADE_CATALOG.key(), "true"
      );
    }
  }
  
  @Inject MetaStoreManagerFactory metaStoreManagerFactory;
  @Inject PolarisConfigurationStore configurationStore;
  
  private final RealmContext realmContext = () -> "test-realm";
  private PolarisMetaStoreManager metaStoreManager;
  private PolarisCallContext callContext;
  private OrphanEntityCleanupTaskHandler handler;
  
  @BeforeEach
  void setUp() {
    BasePersistence metaStore = metaStoreManagerFactory.getOrCreateSession(realmContext);
    // Pass configurationStore to get feature flags from test profile
    callContext = new PolarisCallContext(realmContext, metaStore, configurationStore);
    metaStoreManager = metaStoreManagerFactory.getOrCreateMetaStoreManager(realmContext);
    handler = new OrphanEntityCleanupTaskHandler(metaStoreManagerFactory);
  }
  
  /**
   * Test understanding: What is the correct catalog path structure?
   * 
   * For a table at path: catalog -> ns1 -> ns2 -> table
   * What should catalogPath be when calling dropEntityIfExists?
   * 
   * This test will help us understand the correct structure by creating
   * a real entity hierarchy and observing how it works.
   */
  @Test
  void testUnderstandCatalogPathStructure() {
    // Create a catalog
    PolarisBaseEntity catalog = createCatalog("test_catalog");
    long catalogId = catalog.getId();
    
    // Create nested namespaces: ns1 -> ns2
    PolarisBaseEntity ns1 = createNamespace(catalog, "ns1");
    PolarisBaseEntity ns2 = createNamespace(catalog, ns1, "ns2");
    
    // Create a table under ns2: catalog -> ns1 -> ns2 -> table
    PolarisBaseEntity table = createTable(catalog, ns2, "my_table");
    
    // Verify entities were created
    assertThat(metaStoreManager.loadEntity(callContext, 0L, catalogId, PolarisEntityType.CATALOG))
        .satisfies(result -> {
          assertThat(result.isSuccess()).isTrue();
          assertThat(result.getEntity()).isNotNull();
        });
    
    assertThat(metaStoreManager.loadEntity(callContext, catalogId, ns1.getId(), PolarisEntityType.NAMESPACE))
        .satisfies(result -> {
          assertThat(result.isSuccess()).isTrue();
          assertThat(result.getEntity()).isNotNull();
          assertThat(result.getEntity().getParentId()).isEqualTo(catalogId);
        });
    
    assertThat(metaStoreManager.loadEntity(callContext, catalogId, ns2.getId(), PolarisEntityType.NAMESPACE))
        .satisfies(result -> {
          assertThat(result.isSuccess()).isTrue();
          assertThat(result.getEntity()).isNotNull();
          assertThat(result.getEntity().getParentId()).isEqualTo(ns1.getId());
        });
    
    assertThat(metaStoreManager.loadEntity(callContext, catalogId, table.getId(), PolarisEntityType.TABLE_LIKE))
        .satisfies(result -> {
          assertThat(result.isSuccess()).isTrue();
          assertThat(result.getEntity()).isNotNull();
          assertThat(result.getEntity().getParentId()).isEqualTo(ns2.getId());
        });
    
    // Now test: What is the correct catalogPath for dropping the table?
    // According to the API docs, catalogPath is "path to that entity"
    // For table under catalog -> ns1 -> ns2 -> table
    // The catalogPath should be: [catalog, ns1, ns2]  (NOT including the table itself)
    
    List<PolarisEntityCore> catalogPath = List.of(
        new PolarisEntityCore.Builder<>(catalog).build(),
        new PolarisEntityCore.Builder<>(ns1).build(),
        new PolarisEntityCore.Builder<>(ns2).build()
    );
    
    // Try to drop the table with this path
    var dropResult = metaStoreManager.dropEntityIfExists(callContext, catalogPath, table, null, false);
    
    assertThat(dropResult).satisfies(result -> {
      assertThat(result.isSuccess())
          .as("Drop should succeed with catalogPath = [catalog, ns1, ns2] for table under ns2")
          .isTrue();
    });
    
    // Verify table was deleted
    assertThat(metaStoreManager.loadEntity(callContext, catalogId, table.getId(), PolarisEntityType.TABLE_LIKE))
        .satisfies(result -> {
          // Entity might still exist but should be marked as dropped
          if (result.isSuccess() && result.getEntity() != null) {
            assertThat(result.getEntity().isDropped())
                .as("Table should be marked as dropped")
                .isTrue();
          }
        });
  }
  
  /**
   * Test: After catalog deletion, can we still clean up orphan entities?
   * 
   * Scenario:
   * 1. Create catalog with nested entities
   * 2. Delete the catalog
   * 3. Run orphan cleanup task
   * 4. Verify orphans are removed
   */
  @Test
  void testOrphanCleanupAfterCatalogDeletion() {
    // Create a passthrough-facade catalog
    // This type of catalog can be dropped even with children when the feature flag is enabled
    PolarisBaseEntity catalog = createCatalog("orphan_test_catalog", true);
    long catalogId = catalog.getId();
    
    // Verify it's a passthrough-facade catalog
    CatalogEntity catalogEntity = CatalogEntity.of(catalog);
    assertThat(catalogEntity.isPassthroughFacade())
        .as("Catalog should be a passthrough-facade catalog")
        .isTrue();
    
    // Create entities: catalog -> ns1 -> table1
    PolarisBaseEntity ns1 = createNamespace(catalog, "ns1");
    PolarisBaseEntity table1 = createTable(catalog, ns1, "table1");
    
    // Verify entities exist
    assertThat(metaStoreManager.loadEntity(callContext, catalogId, ns1.getId(), PolarisEntityType.NAMESPACE))
        .satisfies(result -> assertThat(result.isSuccess()).isTrue());
    assertThat(metaStoreManager.loadEntity(callContext, catalogId, table1.getId(), PolarisEntityType.TABLE_LIKE))
        .satisfies(result -> assertThat(result.isSuccess()).isTrue());
    
    // Delete the catalog (this marks it as dropped)
    // For top-level entities like catalogs, catalogPath must be null (not empty list)
    var catalogDropResult = metaStoreManager.dropEntityIfExists(
        callContext, 
        null, // null path for top-level catalog
        catalog, 
        null, 
        false);
    
    // Debug: print the drop result
    System.out.println("Drop result status: " + catalogDropResult.getReturnStatus());
    System.out.println("Drop result message: " + catalogDropResult.getExtraInformation());
    System.out.println("Is passthrough facade: " + catalogEntity.isPassthroughFacade());
    System.out.println("Feature flag value: " + callContext.getRealmConfig().getConfig(
        FeatureConfiguration.ALLOW_DROPPING_NON_EMPTY_PASSTHROUGH_FACADE_CATALOG, catalogEntity));
    
    assertThat(catalogDropResult.isSuccess())
        .as("Catalog drop should succeed. Status: " + catalogDropResult.getReturnStatus() + 
            ", Message: " + catalogDropResult.getExtraInformation())
        .isTrue();
    
    // At this point:
    // - Catalog is marked as dropped
    // - ns1 and table1 are still ACTIVE (orphans)
    // - They have catalogId pointing to the deleted catalog
    
    // Create orphan cleanup task
    TaskEntity task = new TaskEntity.Builder()
        .withTaskType(AsyncTaskType.ORPHAN_ENTITY_CLEANUP)
        .withData(catalogId)
        .setName("orphan_cleanup_" + catalogId)
        .build();
    
    // Run the handler
    boolean success = handler.handleTask(task, callContext);
    
    assertThat(success)
        .as("Orphan cleanup task should complete successfully")
        .isTrue();
    
    // Verify orphans are cleaned up
    // The entities should now be dropped (or purged)
    assertThat(metaStoreManager.loadEntity(callContext, catalogId, table1.getId(), PolarisEntityType.TABLE_LIKE))
        .satisfies(result -> {
          if (result.isSuccess() && result.getEntity() != null) {
            assertThat(result.getEntity().isDropped())
                .as("Orphan table should be dropped")
                .isTrue();
          }
        });
    
    assertThat(metaStoreManager.loadEntity(callContext, catalogId, ns1.getId(), PolarisEntityType.NAMESPACE))
        .satisfies(result -> {
          if (result.isSuccess() && result.getEntity() != null) {
            assertThat(result.getEntity().isDropped())
                .as("Orphan namespace should be dropped")
                .isTrue();
          }
        });
  }
  
  // Helper methods to create entities using PolarisBaseEntity
  
  private PolarisBaseEntity createCatalog(String name) {
    return createCatalog(name, false);
  }
  
  /**
   * Create a catalog, optionally as a passthrough-facade catalog.
   * A passthrough-facade catalog is an external federated catalog that creates JIT entities.
   */
  private PolarisBaseEntity createCatalog(String name, boolean isPassthroughFacade) {
    long catalogId = metaStoreManager.generateNewEntityId(callContext).getId();
    
    Map<String, String> internalProps = new java.util.HashMap<>();
    internalProps.put(CatalogEntity.CATALOG_TYPE_PROPERTY, "EXTERNAL");
    
    if (isPassthroughFacade) {
      // Add connection config to make it a passthrough-facade catalog
      // The presence of this key makes isPassthroughFacade() return true
      internalProps.put(
          org.apache.polaris.core.entity.PolarisEntityConstants.getConnectionConfigInfoPropertyName(),
          "{\"connectionUrl\": \"dummy://test\"}");
    }
    
    PolarisBaseEntity catalog = new PolarisBaseEntity.Builder()
        .id(catalogId)
        .catalogId(0L)
        .parentId(0L)
        .name(name)
        .typeCode(PolarisEntityType.CATALOG.getCode())
        .subTypeCode(PolarisEntitySubType.NULL_SUBTYPE.getCode())
        .createTimestamp(System.currentTimeMillis())
        .internalPropertiesAsMap(internalProps)
        .build();
    
    var createResult = metaStoreManager.createEntityIfNotExists(callContext, null, catalog);
    assertThat(createResult.isSuccess()).isTrue();
    
    return catalog;
  }
  
  private PolarisBaseEntity createNamespace(PolarisBaseEntity catalog, String name) {
    long namespaceId = metaStoreManager.generateNewEntityId(callContext).getId();
    
    PolarisBaseEntity namespace = new PolarisBaseEntity.Builder()
        .id(namespaceId)
        .catalogId(catalog.getId())
        .parentId(catalog.getId())
        .name(name)
        .typeCode(PolarisEntityType.NAMESPACE.getCode())
        .subTypeCode(PolarisEntitySubType.NULL_SUBTYPE.getCode())
        .createTimestamp(System.currentTimeMillis())
        .build();
    
    List<PolarisEntityCore> catalogPath = List.of(
        new PolarisEntityCore.Builder<>(catalog).build()
    );
    
    var createResult = metaStoreManager.createEntityIfNotExists(callContext, catalogPath, namespace);
    assertThat(createResult.isSuccess()).isTrue();
    
    return namespace;
  }
  
  private PolarisBaseEntity createNamespace(PolarisBaseEntity catalog, PolarisBaseEntity parent, String name) {
    long namespaceId = metaStoreManager.generateNewEntityId(callContext).getId();
    
    PolarisBaseEntity namespace = new PolarisBaseEntity.Builder()
        .id(namespaceId)
        .catalogId(catalog.getId())
        .parentId(parent.getId())
        .name(name)
        .typeCode(PolarisEntityType.NAMESPACE.getCode())
        .subTypeCode(PolarisEntitySubType.NULL_SUBTYPE.getCode())
        .createTimestamp(System.currentTimeMillis())
        .build();
    
    List<PolarisEntityCore> catalogPath = List.of(
        new PolarisEntityCore.Builder<>(catalog).build(),
        new PolarisEntityCore.Builder<>(parent).build()
    );
    
    var createResult = metaStoreManager.createEntityIfNotExists(callContext, catalogPath, namespace);
    assertThat(createResult.isSuccess()).isTrue();
    
    return namespace;
  }
  
  private PolarisBaseEntity createTable(PolarisBaseEntity catalog, PolarisBaseEntity namespace, String name) {
    long tableId = metaStoreManager.generateNewEntityId(callContext).getId();
    
    PolarisBaseEntity table = new PolarisBaseEntity.Builder()
        .id(tableId)
        .catalogId(catalog.getId())
        .parentId(namespace.getId())
        .name(name)
        .typeCode(PolarisEntityType.TABLE_LIKE.getCode())
        .subTypeCode(PolarisEntitySubType.ICEBERG_TABLE.getCode())
        .createTimestamp(System.currentTimeMillis())
        .build();
    
    List<PolarisEntityCore> catalogPath = List.of(
        new PolarisEntityCore.Builder<>(catalog).build(),
        new PolarisEntityCore.Builder<>(namespace).build()
    );
    
    var createResult = metaStoreManager.createEntityIfNotExists(callContext, catalogPath, table);
    assertThat(createResult.isSuccess()).isTrue();
    
    return table;
  }
}
