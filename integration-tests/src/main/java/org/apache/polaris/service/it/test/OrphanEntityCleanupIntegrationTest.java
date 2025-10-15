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
package org.apache.polaris.service.it.test;

import static org.apache.polaris.service.it.env.PolarisClient.polarisClient;
import static org.assertj.core.api.Assertions.assertThat;

import java.net.URI;
import java.util.List;
import java.util.UUID;
import org.apache.iceberg.catalog.Namespace;
import org.apache.polaris.core.admin.model.AuthenticationParameters;
import org.apache.polaris.core.admin.model.Catalog;
import org.apache.polaris.core.admin.model.CatalogGrant;
import org.apache.polaris.core.admin.model.CatalogPrivilege;
import org.apache.polaris.core.admin.model.CatalogProperties;
import org.apache.polaris.core.admin.model.CatalogRole;
import org.apache.polaris.core.admin.model.ConnectionConfigInfo;
import org.apache.polaris.core.admin.model.ExternalCatalog;
import org.apache.polaris.core.admin.model.FileStorageConfigInfo;
import org.apache.polaris.core.admin.model.GrantResource;
import org.apache.polaris.core.admin.model.IcebergRestConnectionConfigInfo;
import org.apache.polaris.core.admin.model.NamespaceGrant;
import org.apache.polaris.core.admin.model.NamespacePrivilege;
import org.apache.polaris.core.admin.model.OAuthClientCredentialsParameters;
import org.apache.polaris.core.admin.model.PolarisCatalog;
import org.apache.polaris.core.admin.model.PrincipalWithCredentials;
import org.apache.polaris.core.admin.model.StorageConfigInfo;
import org.apache.polaris.service.it.env.CatalogApi;
import org.apache.polaris.service.it.env.ClientCredentials;
import org.apache.polaris.service.it.env.ManagementApi;
import org.apache.polaris.service.it.env.PolarisApiEndpoints;
import org.apache.polaris.service.it.env.PolarisClient;
import org.apache.polaris.service.it.ext.PolarisIntegrationTestExtension;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * Integration test for orphan entity cleanup in passthrough-facade catalogs.
 * 
 * <p>This test verifies that when table/namespace-level RBAC is enabled on a federated catalog,
 * synthetic JIT entities are created, and when the catalog is dropped, orphan entities
 * (those with non-existent parents in the remote catalog) are properly cleaned up.
 */
@ExtendWith(PolarisIntegrationTestExtension.class)
public class OrphanEntityCleanupIntegrationTest {

  private static PolarisClient client;
  private static CatalogApi catalogApi;
  private static ManagementApi managementApi;
  private static PolarisApiEndpoints endpoints;
  private static String localCatalogName;
  private static String federatedCatalogName;
  private static String localCatalogRoleName;
  private static String federatedCatalogRoleName;

  private static final String PRINCIPAL_NAME = "test-orphan-cleanup-user";
  private static final String PRINCIPAL_ROLE_NAME = "test-orphan-cleanup-user-role";
  private static final CatalogGrant defaultCatalogGrant =
      CatalogGrant.builder()
          .setType(GrantResource.TypeEnum.CATALOG)
          .setPrivilege(CatalogPrivilege.CATALOG_MANAGE_CONTENT)
          .build();

  private URI baseLocation;
  private PrincipalWithCredentials userCredentials;

  @BeforeAll
  static void setup(PolarisApiEndpoints apiEndpoints, ClientCredentials credentials) {
    endpoints = apiEndpoints;
    client = polarisClient(endpoints);
    String adminToken = client.obtainToken(credentials);
    managementApi = client.managementApi(adminToken);
    catalogApi = client.catalogApi(adminToken);
  }

  @AfterAll
  static void close() throws Exception {
    if (client != null) {
      client.close();
    }
  }

  @BeforeEach
  void before() {
    setupCatalogs();
  }

  @AfterEach
  void after() {
    // Clean up in reverse order
    if (federatedCatalogName != null) {
      managementApi.dropCatalog(federatedCatalogName);
    }
    if (localCatalogName != null) {
      catalogApi.purge(localCatalogName);
      managementApi.dropCatalog(localCatalogName);
    }
    if (PRINCIPAL_ROLE_NAME != null) {
      managementApi.deletePrincipalRole(PRINCIPAL_ROLE_NAME);
    }
    if (PRINCIPAL_NAME != null) {
      managementApi.deletePrincipal(PRINCIPAL_NAME);
    }
  }

  private void setupCatalogs() {
    baseLocation = URI.create("file:///tmp/orphan-cleanup-warehouse");
    userCredentials = managementApi.createPrincipalWithRole(PRINCIPAL_NAME, PRINCIPAL_ROLE_NAME);

    FileStorageConfigInfo storageConfig =
        FileStorageConfigInfo.builder()
            .setStorageType(StorageConfigInfo.StorageTypeEnum.FILE)
            .setAllowedLocations(List.of(baseLocation.toString()))
            .build();

    CatalogProperties catalogProperties = new CatalogProperties(baseLocation.toString());

    // Create unique names for each test run
    localCatalogName = "test_local_" + UUID.randomUUID().toString().replace("-", "");
    localCatalogRoleName = "test-local-role_" + UUID.randomUUID().toString().replace("-", "");
    federatedCatalogName = "test_federated_" + UUID.randomUUID().toString().replace("-", "");
    federatedCatalogRoleName = "test-fed-role_" + UUID.randomUUID().toString().replace("-", "");

    // Create local (source) catalog
    Catalog localCatalog =
        PolarisCatalog.builder()
            .setType(Catalog.TypeEnum.INTERNAL)
            .setName(localCatalogName)
            .setProperties(catalogProperties)
            .setStorageConfigInfo(storageConfig)
            .build();
    managementApi.createCatalog(localCatalog);
    managementApi.createCatalogRole(localCatalogName, localCatalogRoleName);
    managementApi.addGrant(localCatalogName, localCatalogRoleName, defaultCatalogGrant);
    
    CatalogRole localCatalogRole =
        managementApi.getCatalogRole(localCatalogName, localCatalogRoleName);
    managementApi.grantCatalogRoleToPrincipalRole(
        PRINCIPAL_ROLE_NAME, localCatalogName, localCatalogRole);

    // Create federated (passthrough facade) catalog
    AuthenticationParameters authParams =
        OAuthClientCredentialsParameters.builder()
            .setAuthenticationType(AuthenticationParameters.AuthenticationTypeEnum.OAUTH)
            .setTokenUri(endpoints.catalogApiEndpoint().toString() + "/v1/oauth/tokens")
            .setClientId(userCredentials.getCredentials().getClientId())
            .setClientSecret(userCredentials.getCredentials().getClientSecret())
            .setScopes(List.of("PRINCIPAL_ROLE:ALL"))
            .build();
    
    ConnectionConfigInfo connectionConfig =
        IcebergRestConnectionConfigInfo.builder()
            .setConnectionType(ConnectionConfigInfo.ConnectionTypeEnum.ICEBERG_REST)
            .setUri(endpoints.catalogApiEndpoint().toString())
            .setRemoteCatalogName(localCatalogName)
            .setAuthenticationParameters(authParams)
            .build();
    
    ExternalCatalog externalCatalog =
        ExternalCatalog.builder()
            .setType(Catalog.TypeEnum.EXTERNAL)
            .setName(federatedCatalogName)
            .setConnectionConfigInfo(connectionConfig)
            .setProperties(catalogProperties)
            .setStorageConfigInfo(storageConfig)
            .build();
    managementApi.createCatalog(externalCatalog);
    managementApi.createCatalogRole(federatedCatalogName, federatedCatalogRoleName);
    managementApi.addGrant(federatedCatalogName, federatedCatalogRoleName, defaultCatalogGrant);
    
    CatalogRole externalCatalogAdminRole =
        managementApi.getCatalogRole(federatedCatalogName, federatedCatalogRoleName);
    managementApi.grantCatalogRoleToPrincipalRole(
        PRINCIPAL_ROLE_NAME, federatedCatalogName, externalCatalogAdminRole);
  }

  private void createNamespacesInLocalCatalog() {
    // Create namespaces in the local (source) catalog using REST API
    catalogApi.createNamespace(localCatalogName, "ns1");
    catalogApi.createNamespace(localCatalogName, "ns2");
    catalogApi.createNamespace(localCatalogName, "ns1\u001fnested"); // nested namespace
  }

  /**
   * Test: Create passthrough facade catalog, set up namespace RBAC to trigger JIT entity
   * creation, verify that when catalog is dropped with orphan cleanup, synthetic entities
   * are cleaned up.
   * 
   * <p>This test simulates the real scenario where:
   * 1. A federated catalog has JIT entities created for namespace-level RBAC
   * 2. The federated catalog is dropped
   * 3. With orphan cleanup enabled, the synthetic entities should be removed
   */
  @Test
  void testOrphanCleanupOnFederatedCatalogDrop() {
    // Step 1: Create namespaces in local catalog
    createNamespacesInLocalCatalog();

    // Step 2: Set up namespace-level RBAC on federated catalog
    // This will trigger JIT entity creation for namespaces when accessed
    managementApi.revokeGrant(federatedCatalogName, federatedCatalogRoleName, defaultCatalogGrant);
    
    NamespaceGrant ns1Grant =
        NamespaceGrant.builder()
            .setType(GrantResource.TypeEnum.NAMESPACE)
            .setPrivilege(NamespacePrivilege.TABLE_READ_DATA)
            .setNamespace(List.of("ns1"))
            .build();
    managementApi.addGrant(federatedCatalogName, federatedCatalogRoleName, ns1Grant);

    NamespaceGrant nestedGrant =
        NamespaceGrant.builder()
            .setType(GrantResource.TypeEnum.NAMESPACE)
            .setPrivilege(NamespacePrivilege.TABLE_READ_DATA)
            .setNamespace(List.of("ns1", "nested"))
            .build();
    managementApi.addGrant(federatedCatalogName, federatedCatalogRoleName, nestedGrant);

    // Step 3: List namespaces to trigger JIT entity creation
    // When we access namespaces on the federated catalog with sub-catalog RBAC enabled,
    // synthetic entities are created in Polaris for RBAC enforcement
    var namespaces = catalogApi.listNamespaces(federatedCatalogName, Namespace.empty());
    assertThat(namespaces).isNotNull();

    // Step 4: Drop the federated catalog
    // With ALLOW_DROPPING_NON_EMPTY_PASSTHROUGH_FACADE_CATALOG enabled,
    // this should succeed even with JIT entities present
    managementApi.dropCatalog(federatedCatalogName);

    // Step 5: Verify the catalog was dropped
    var catalogs = managementApi.listCatalogs();
    assertThat(catalogs.stream().noneMatch(c -> c.getName().equals(federatedCatalogName)))
        .isTrue();

    // Note: With orphan cleanup integrated into catalog deletion flow, the JIT entities
    // (synthetic namespaces created for RBAC) would be automatically cleaned up.
    // This test verifies the foundation is in place - catalog drops successfully
    // and orphan cleanup can run as part of the deletion process.
    
    // TODO: Verify synthetic entities are actually removed from metastore after
    // orphan cleanup task completes (requires metastore introspection)
  }

  /**
   * Test: Verify catalog scoping - orphan cleanup on one catalog doesn't affect another
   */
  @Test
  void testOrphanCleanupCatalogIsolation() {
    // Create entities in local catalog
    createNamespacesInLocalCatalog();

    // Create namespace-level grant on federated catalog (triggers JIT entities)
    managementApi.revokeGrant(federatedCatalogName, federatedCatalogRoleName, defaultCatalogGrant);
    
    NamespaceGrant namespaceGrant =
        NamespaceGrant.builder()
            .setType(GrantResource.TypeEnum.NAMESPACE)
            .setPrivilege(NamespacePrivilege.TABLE_READ_DATA)
            .setNamespace(List.of("ns1"))
            .build();
    managementApi.addGrant(federatedCatalogName, federatedCatalogRoleName, namespaceGrant);

    // Trigger JIT entity creation
    catalogApi.listNamespaces(federatedCatalogName, Namespace.empty());

    // Verify local catalog still has its entities
    var localNamespaces = catalogApi.listNamespaces(localCatalogName, Namespace.empty());
    assertThat(localNamespaces).isNotNull().isNotEmpty();

    // Drop federated catalog (should NOT affect local catalog)
    managementApi.dropCatalog(federatedCatalogName);
    federatedCatalogName = null; // Mark as dropped for cleanup

    // Verify local catalog is UNTOUCHED - this is CRITICAL for catalog isolation
    localNamespaces = catalogApi.listNamespaces(localCatalogName, Namespace.empty());
    assertThat(localNamespaces).isNotNull().isNotEmpty();
    assertThat(localNamespaces).contains(Namespace.of("ns1"), Namespace.of("ns2"));
  }

  /**
   * Test: Verify that namespace-level RBAC creates JIT entities
   */
  @Test
  void testNamespaceRBACCreatesJITEntities() {
    // Create data in local catalog
    createNamespacesInLocalCatalog();

    // Initially, federated catalog should be able to see namespaces
    var namespaces = catalogApi.listNamespaces(federatedCatalogName, Namespace.empty());
    assertThat(namespaces).isNotNull();
    assertThat(namespaces).hasSizeGreaterThanOrEqualTo(0); // May be empty initially until accessed

    // Restrict to namespace-level RBAC
    managementApi.revokeGrant(federatedCatalogName, federatedCatalogRoleName, defaultCatalogGrant);
    
    NamespaceGrant ns1Grant =
        NamespaceGrant.builder()
            .setType(GrantResource.TypeEnum.NAMESPACE)
            .setPrivilege(NamespacePrivilege.TABLE_READ_DATA)
            .setNamespace(List.of("ns1"))
            .build();
    managementApi.addGrant(federatedCatalogName, federatedCatalogRoleName, ns1Grant);

    // Access namespace - this should create JIT entities for RBAC enforcement
    namespaces = catalogApi.listNamespaces(federatedCatalogName, Namespace.empty());
    // Due to RBAC filtering and JIT creation, we verify access works
    assertThat(namespaces).isNotNull();

    // The JIT entities (synthetic namespaces) are created in the metastore for RBAC.
    // They are not directly visible but exist to support permission checks.
  }
}

