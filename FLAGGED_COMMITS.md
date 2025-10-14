# Flagged Commits Report
**Analysis Period:** From commit `94c94f197f1375ac5b7f949f611a4ac03579d9f0` to current `main`
---

## Overview

This report flags commits that meet one or both of the following criteria:
1. **Large commits**: More than 10 files changed
2. **Critical file commits**: Modifications to key infrastructure files

### Summary
- **Total commits analyzed:** 795
- **Large commits (>10 files):** 100
- **Critical file commits:** 54
- **Commits that are both large AND critical:** 30

---

## 1. Large Commits (>10 files changed)

**Total:** 100 commits

### Details

#### 1. `af26732` - 638 files changed

**Date:** 2025-05-23
**PR:** [#1347](https://github.com/apache/polaris/pull/1347)
**Title:** Create a wrapper script to generate python client; regenerate the python client (#1347)
**Stats:** +32824 / -2386

**Description:**
```
I've also run the script, which necessitated several things to get tests passing:
1. There were small nonfunctional spec changes needed in order to keep the Python client working
2. The CLI and its tests required a few fixes to work with the updated Python client
3. Many of the regtests required fixes to work with the updated Python client
```

**Sample files changed:**
- `build.gradle.kts`
- `client/python/.github/workflows/python.yml`
- `client/python/.gitlab-ci.yml`
- `client/python/.openapi-generator/FILES`
- `client/python/.travis.yml`
- `client/python/README.md`
- `client/python/cli/command/__init__.py`
- `client/python/cli/command/catalogs.py`
- `client/python/cli/command/namespaces.py`
- `client/python/cli/command/principals.py`
- `client/python/cli/constants.py`
- `client/python/cli/options/option_tree.py`
- `client/python/docs/AddGrantRequest.md`
- `client/python/docs/AddPartitionSpecUpdate.md`
- `client/python/docs/AddSchemaUpdate.md`

*... and 623 more files*

---

#### 2. `a8a78c4` - 429 files changed

**Date:** 2025-06-12
**PR:** [#1878](https://github.com/apache/polaris/pull/1878)
**Title:** Cleanup unnecessary files in client/python (#1878)
**Stats:** +45 / -39207
**Sample files changed:**
- `.gitignore`
- `client/python/.openapi-generator-ignore`
- `client/python/.openapi-generator/FILES`
- `client/python/.openapi-generator/VERSION`
- `client/python/README.md`
- `client/python/docs/.keep`
- `client/python/docs/AddGrantRequest.md`
- `client/python/docs/AddPartitionSpecUpdate.md`
- `client/python/docs/AddSchemaUpdate.md`
- `client/python/docs/AddSnapshotUpdate.md`
- `client/python/docs/AddSortOrderUpdate.md`
- `client/python/docs/AddViewVersionUpdate.md`
- `client/python/docs/AndOrExpression.md`
- `client/python/docs/ApplicablePolicy.md`
- `client/python/docs/AssertCreate.md`

*... and 414 more files*

---

#### 3. `20febda` - 290 files changed

**Date:** 2025-08-05
**PR:** [#2233](https://github.com/apache/polaris/pull/2233)
**Title:** Merge polaris-service-common into polaris-runtime-service (#2233)
**Stats:** +779 / -1150
**Sample files changed:**
- `.github/workflows/check-md-link.yml`
- `LICENSE`
- `README.md`
- `bom/build.gradle.kts`
- `build.gradle.kts`
- `gradle/projects.main.properties`
- `plugins/spark/v3.5/integration/build.gradle.kts`
- `plugins/spark/v3.5/integration/src/intTest/resources/META-INF/services/org.apache.polaris.service.it.ext.PolarisServerManager`
- `runtime/admin/src/main/java/org/apache/polaris/admintool/config/{QuarkusProducers.java => AdminToolProducers.java}`
- `runtime/defaults/src/main/resources/application.properties`
- `runtime/server/build.gradle.kts`
- `runtime/service/build.gradle.kts`
- `runtime/service/src/intTest/java/org/apache/polaris/service/{quarkus/it/QuarkusApplicationIT.java => it/ApplicationIT.java}`
- `runtime/service/src/intTest/java/org/apache/polaris/service/{quarkus/it/QuarkusManagementServiceIT.java => it/ManagementServiceIT.java}`
- `runtime/service/src/intTest/java/org/apache/polaris/service/{quarkus/it/QuarkusPolarisRestCatalogMinIOIT.java => it/PolarisRestCatalogMinIOIT.java}`

*... and 275 more files*

---

#### 4. `3958ded` - 233 files changed

**Date:** 2025-06-11
**PR:** [#1810](https://github.com/apache/polaris/pull/1810)
**Title:** Remove generated Python client from git tracking (#1810)
**Stats:** +14 / -58614
**Sample files changed:**
- `.gitignore`
- `client/python/polaris/.keep`
- `client/python/polaris/catalog/.keep`
- `client/python/polaris/catalog/__init__.py`
- `client/python/polaris/catalog/api/.keep`
- `client/python/polaris/catalog/api/__init__.py`
- `client/python/polaris/catalog/api/catalog_api.py`
- `client/python/polaris/catalog/api/configuration_api.py`
- `client/python/polaris/catalog/api/generic_table_api.py`
- `client/python/polaris/catalog/api/iceberg_catalog_api.py`
- `client/python/polaris/catalog/api/iceberg_configuration_api.py`
- `client/python/polaris/catalog/api/iceberg_o_auth2_api.py`
- `client/python/polaris/catalog/api/o_auth2_api.py`
- `client/python/polaris/catalog/api/policy_api.py`
- `client/python/polaris/catalog/api_client.py`

*... and 218 more files*

---

#### 5. `ab228af` - 212 files changed

**Date:** 2025-06-17
**PR:** [#1695](https://github.com/apache/polaris/pull/1695)
**Title:** Rename quarkus as runtime (#1695)
**Stats:** +137 / -137
**Sample files changed:**
- `.github/workflows/check-md-link.yml`
- `.github/workflows/gradle.yml`
- `.github/workflows/helm.yml`
- `.github/workflows/python-client.yml`
- `.github/workflows/regtest.yml`
- `.github/workflows/spark_client_regtests.yml`
- `LICENSE`
- `README.md`
- `aggregated-license-report/build.gradle.kts`
- `bom/build.gradle.kts`
- `build-logic/src/main/kotlin/{polaris-quarkus.gradle.kts => polaris-runtime.gradle.kts}`
- `getting-started/assets/cloud_providers/deploy-aws.sh`
- `getting-started/assets/cloud_providers/deploy-azure.sh`
- `getting-started/assets/cloud_providers/deploy-gcp.sh`
- `getting-started/eclipselink/README.md`

*... and 197 more files*

---

#### 6. `3b18e0d` - 93 files changed

**Date:** 2025-06-04
**PR:** [#1675](https://github.com/apache/polaris/pull/1675)
**Title:** Automate regeneration of Python client (#1675)
**Stats:** +1446 / -685

**Description:**
```
As part of this change, I've also updated the generator to 7.12 to match what's in the `libs.version.toml` and regenerated the code managed in github.
Once the automatic generation works as part of CI, we can remove the generated code from the repo altogether. In the future, it can be added to .gitignore.
```

**Sample files changed:**
- `.github/workflows/python-client.yml`
- `.github/workflows/regtest.yml`
- `.github/workflows/spark_client_regtests.yml`
- `client/python/.openapi-generator-ignore`
- `client/python/.openapi-generator/FILES`
- `client/python/.openapi-generator/VERSION`
- `client/python/.travis.yml`
- `client/python/README.md`
- `client/python/docs/CatalogAPI.md`
- `client/python/docs/ConfigurationAPI.md`
- `client/python/docs/GenericTableAPI.md`
- `client/python/docs/IcebergCatalogAPI.md`
- `client/python/docs/IcebergConfigurationAPI.md`
- `client/python/docs/IcebergOAuth2API.md`
- `client/python/docs/OAuth2API.md`

*... and 78 more files*

---

#### 7. `96f1459` - 62 files changed

**Date:** 2025-08-18
**PR:** [#2307](https://github.com/apache/polaris/pull/2307)
**Title:** Refactor Authenticator and PolarisPrincipal (#2307)
**Stats:** +460 / -426

**Description:**
```
- `AuthenticatedPolarisPrincipal` becomes an interface `PolarisPrincipal`, as the original class leaks implementation details (references to `PrincipalEntity` and thus to the storage layer). The new interface does not reference the storage layer. This is one step further towards easy pluggability of authentication in Polaris.
- The `Authenticator.authenticate()` method does not return an `Optional` anymore, as this was ambiguous (returning `Optional.empty()` vs throwing `NotAuthorizedExceptio...
```

**Sample files changed:**
- `polaris-core/src/main/java/org/apache/polaris/core/auth/AuthenticatedPolarisPrincipal.java`
- `polaris-core/src/main/java/org/apache/polaris/core/auth/PolarisAuthorizer.java`
- `polaris-core/src/main/java/org/apache/polaris/core/auth/PolarisAuthorizerImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/auth/PolarisPrincipal.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/resolver/PolarisResolutionManifest.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/resolver/Resolver.java`
- `polaris-core/src/testFixtures/java/org/apache/polaris/core/persistence/BaseResolverTest.java`
- `runtime/service/build.gradle.kts`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisAdminService.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisServiceImpl.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/ActiveRolesAugmentor.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/ActiveRolesProvider.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/AuthenticatingAugmentor.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/Authenticator.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/DecodedToken.java`

*... and 47 more files*

---

#### 8. `c3f5001` - 59 files changed

**Date:** 2025-09-03
**PR:** [#1844](https://github.com/apache/polaris/pull/1844)
**Title:** Add Polaris Events to Persistence (#1844)
**Stats:** +2000 / -83
**Sample files changed:**
- `persistence/relational-jdbc/build.gradle.kts`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/DatabaseType.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/DatasourceOperations.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/QueryGenerator.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/models/ModelEvent.java`
- `persistence/relational-jdbc/src/main/resources/h2/schema-v3.sql`
- `persistence/relational-jdbc/src/main/resources/postgres/schema-v3.sql`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/DatasourceOperationsTest.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/models/ModelEventTest.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/PolarisEvent.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/PolarisEventManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/BasePersistence.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/PolarisMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/TransactionWorkspaceMetaStoreManager.java`

*... and 44 more files*

---

#### 9. `6b4f8e1` - 55 files changed

**Date:** 2025-09-02
**PR:** [#2415](https://github.com/apache/polaris/pull/2415)
**Title:** Remove PolarisCallContext.getDiagServices (#2415)
**Stats:** +279 / -217

**Description:**
```
* Remove diagnostics from PolarisCallContext
```

**Sample files changed:**
- `persistence/eclipselink/src/test/java/org/apache/polaris/extension/persistence/impl/eclipselink/PolarisEclipseLinkMetaStoreManagerTest.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcMetaStoreManagerFactory.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/AtomicMetastoreManagerWithJdbcBasePersistenceImplTest.java`
- `polaris-core/src/main/java/org/apache/polaris/core/PolarisCallContext.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/TransactionWorkspaceMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/cache/InMemoryEntityCache.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/resolver/PolarisResolutionManifest.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/resolver/ResolutionManifestFactoryImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/resolver/Resolver.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/PolarisEntityResolver.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalMetaStoreManagerImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/cache/StorageCredentialCache.java`
- `polaris-core/src/test/java/org/apache/polaris/core/persistence/PolarisTreeMapAtomicOperationMetaStoreManagerTest.java`

*... and 40 more files*

---

#### 10. `de351de` - 51 files changed

**Date:** 2025-07-14
**PR:** [#2015](https://github.com/apache/polaris/pull/2015)
**Title:** Introduce RealmConfig (#2015)
**Stats:** +365 / -429

**Description:**
```
```
ctx.getPolarisCallContext()
   .getConfigurationStore()
   .getConfiguration(ctx.getRealmContext(), "ALLOW_WILDCARD_LOCATION", false))
```
since a `PolarisConfigurationStore` cant be used without a `RealmContext` it makes sense to add a dedicated interface. this allows removal of verbose code and also moves towards injecting that interface via CDI at a request/realm scope in the future.
```

**Sample files changed:**
- `persistence/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/EclipseLinkPolarisMetaStoreManagerFactory.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcMetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/PolarisCallContext.java`
- `polaris-core/src/main/java/org/apache/polaris/core/auth/PolarisAuthorizerImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/config/FeatureConfiguration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/config/RealmConfig.java`
- `polaris-core/src/main/java/org/apache/polaris/core/config/RealmConfigImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/context/CallContext.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/CatalogEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/AtomicOperationMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/MetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/cache/InMemoryEntityCache.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalMetaStoreManagerImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/rest/PolarisEndpoints.java`

*... and 36 more files*

---

#### 11. `7b985e2` - 44 files changed

**Date:** 2025-05-30
**PR:** [#1751](https://github.com/apache/polaris/pull/1751)
**Title:** Regenerate bundled spec & Regenerate Python client (#1751)
**Stats:** +1743 / -170

**Description:**
```
```
redocly bundle spec/polaris-catalog-service.yaml -o spec/generated/bundled-polaris-catalog-service.yaml
./gradlew regeneratePythonClient
```
I didn't realize before that some Python types are generated form the bundled spec, so some of the fixes from #1347 didn't get properly applied before.
```

**Sample files changed:**
- `client/python/docs/AuthenticationParameters.md`
- `client/python/docs/AwsIamServiceIdentityInfo.md`
- `client/python/docs/CatalogPrivilege.md`
- `client/python/docs/ConnectionConfigInfo.md`
- `client/python/docs/HadoopConnectionConfigInfo.md`
- `client/python/docs/IcebergCatalogAPI.md`
- `client/python/docs/NamespacePrivilege.md`
- `client/python/docs/PolicyGrant.md`
- `client/python/docs/PolicyPrivilege.md`
- `client/python/docs/PrincipalRole.md`
- `client/python/docs/ServiceIdentityInfo.md`
- `client/python/docs/SigV4AuthenticationParameters.md`
- `client/python/docs/TablePrivilege.md`
- `client/python/polaris/catalog/api/iceberg_catalog_api.py`
- `client/python/polaris/management/__init__.py`

*... and 29 more files*

---

#### 12. `519e127` - 41 files changed

**Date:** 2025-10-08
**PR:** [#2759](https://github.com/apache/polaris/pull/2759)
**Title:** SigV4 Auth Support for Catalog Federation - Part 4: Connection Credential Manager (#2759)
**Stats:** +1234 / -30

**Description:**
```
The core of this PR is the new ConnectionCredentialVendor interface, which:
Generates connection credentials by combining service identity with user auth parameters
Supports different authentication types (AWS SIGV4, AZURE Entra, GCP IAM) through CDI, currently only supports SigV4.
Provides on-demand credential generation
Enables easy extension for new authentication types
In the long term, we should move the storage credential management logic out of PolarisMetastoreManager, PolarisMetastore...
```

**Sample files changed:**
- `extensions/federation/hadoop/src/main/java/org/apache/polaris/extensions/federation/hadoop/HadoopFederatedCatalogFactory.java`
- `extensions/federation/hive/src/main/java/org/apache/polaris/extensions/federation/hive/HiveFederatedCatalogFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/catalog/ExternalCatalogFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/connection/BearerAuthenticationParametersDpo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/connection/ImplicitAuthenticationParametersDpo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/connection/OAuthClientCredentialsParametersDpo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/connection/SigV4AuthenticationParametersDpo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/connection/hadoop/HadoopConnectionConfigInfoDpo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/connection/hive/HiveConnectionConfigInfoDpo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/connection/iceberg/IcebergCatalogPropertiesProvider.java`
- `polaris-core/src/main/java/org/apache/polaris/core/connection/iceberg/IcebergRestConnectionConfigInfoDpo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/credentials/PolarisCredentialManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/credentials/connection/CatalogAccessProperty.java`
- `polaris-core/src/main/java/org/apache/polaris/core/credentials/connection/ConnectionCredentialVendor.java`
- `polaris-core/src/main/java/org/apache/polaris/core/credentials/connection/ConnectionCredentials.java`

*... and 26 more files*

---

#### 13. `dd987b6` - 41 files changed

**Date:** 2025-06-02
**PR:** [#1724](https://github.com/apache/polaris/pull/1724)
**Title:** Restructure the directory and package name for persistence modules (#1724)
**Stats:** +38 / -38
**Sample files changed:**
- `.github/workflows/check-md-link.yml`
- `gradle/projects.main.properties`
- `{extension/persistence => persistence}/eclipselink/build.gradle.kts`
- `{extension/persistence => persistence}/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/EclipseLinkConfiguration.java`
- `{extension/persistence => persistence}/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/EclipseLinkPolarisMetaStoreManagerFactory.java`
- `{extension/persistence => persistence}/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/EclipseLinkProductionReadinessChecks.java`
- `{extension/persistence => persistence}/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/PolarisEclipseLinkMetaStoreSessionImpl.java`
- `{extension/persistence => persistence}/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/PolarisEclipseLinkPersistenceUnit.java`
- `{extension/persistence => persistence}/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/PolarisEclipseLinkSessionCustomizer.java`
- `{extension/persistence => persistence}/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/PolarisEclipseLinkStore.java`
- `{extension/persistence => persistence}/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/PolarisSequenceUtil.java`
- `{extension/persistence => persistence}/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/models/ModelEntity.java`
- `{extension/persistence => persistence}/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/models/ModelEntityActive.java`
- `{extension/persistence => persistence}/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/models/ModelEntityChangeTracking.java`
- `{extension/persistence => persistence}/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/models/ModelGrantRecord.java`

*... and 26 more files*

---

#### 14. `8942f68` - 35 files changed

**Date:** 2025-06-11
**PR:** [#1858](https://github.com/apache/polaris/pull/1858)
**Title:** Remove PolarisConfiguration.loadConfig (v2) (#1858)
**Stats:** +221 / -135
**Sample files changed:**
- `persistence/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/EclipseLinkPolarisMetaStoreManagerFactory.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcMetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/config/PolarisConfiguration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/CatalogEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/AtomicOperationMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/cache/InMemoryEntityCache.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalMetaStoreManagerImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/PolarisStorageIntegration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/aws/AwsCredentialsStorageIntegration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/azure/AzureCredentialsStorageIntegration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/cache/StorageCredentialCache.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/gcp/GcpCredentialsStorageIntegration.java`
- `polaris-core/src/test/java/org/apache/polaris/core/persistence/cache/InMemoryEntityCacheTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/BaseStorageIntegrationTest.java`

*... and 20 more files*

---

#### 15. `793a118` - 34 files changed

**Date:** 2025-10-03
**PR:** [#2523](https://github.com/apache/polaris/pull/2523)
**Title:** SigV4 Auth Support for Catalog Federation - Part 3: Service Identity Info Injection (#2523)
**Stats:** +1663 / -73

**Description:**
```
* Service Identity Injection
* Return injected service identity info in response
* Use AwsCredentialsProvider to retrieve the credentials
* Move some logic to ServiceIdentityConfiguration
* Rename ServiceIdentityRegistry to ServiceIdentityProvider
* Rename ResolvedServiceIdentity to ServiceIdentityCredential
* Simplify the logic and add more tests
* Use SecretReference and fix some small issues
* Disable Catalog Federation
```

**Sample files changed:**
- `polaris-core/src/main/java/org/apache/polaris/core/config/FeatureConfiguration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/connection/ConnectionConfigInfoDpo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/connection/hadoop/HadoopConnectionConfigInfoDpo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/connection/hive/HiveConnectionConfigInfoDpo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/connection/iceberg/IcebergRestConnectionConfigInfoDpo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/CatalogEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/identity/credential/AwsIamServiceIdentityCredential.java`
- `polaris-core/src/main/java/org/apache/polaris/core/identity/credential/ServiceIdentityCredential.java`
- `polaris-core/src/main/java/org/apache/polaris/core/identity/dpo/AwsIamServiceIdentityInfoDpo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/identity/dpo/ServiceIdentityInfoDpo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/identity/provider/ServiceIdentityProvider.java`
- `polaris-core/src/test/java/org/apache/polaris/core/connection/ConnectionConfigInfoDpoTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/identity/credential/AwsIamServiceIdentityCredentialTest.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisAdminService.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisServiceImpl.java`

*... and 19 more files*

---

#### 16. `149aaa6` - 33 files changed

**Date:** 2025-09-26
**PR:** [#2634](https://github.com/apache/polaris/pull/2634)
**Title:** Auth: reorganize internal authentication components (#2634)
**Stats:** +298 / -436

**Description:**
```
Summary of changes:
- Moved all internal authentication components to the `org.apache.polaris.service.auth.internal` package and subpackages
- Reduced visibility of utility classes
- Renamed `TokenBroker` class hierarchy to stick to the naming standard: `<Algorithm>JWTBroker`
- Introduced `@PolarisImmutable` whenever appropriate
- Removed unused `NoneTokenBrokerFactory` (we already have `DisabledOAuth2ApiService`)
- Removed unused `TokenBrokerFactoryConfig`
```

**Sample files changed:**
- `runtime/service/src/main/java/org/apache/polaris/service/auth/AuthenticationRealmConfiguration.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/NoneTokenBrokerFactory.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/OAuthTokenErrorResponse.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/TokenResponse.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/internal/InternalAuthenticationMechanism.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/{ => internal/broker}/InternalPolarisToken.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/{ => internal/broker}/JWTBroker.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/{ => internal/broker}/KeyProvider.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/{ => internal/broker}/LocalRSAKeyProvider.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/{ => internal/broker}/PemUtils.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/{JWTRSAKeyPair.java => internal/broker/RSAKeyPairJWTBroker.java}`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/{JWTRSAKeyPairFactory.java => internal/broker/RSAKeyPairJWTBrokerFactory.java}`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/{JWTSymmetricKeyBroker.java => internal/broker/SymmetricKeyJWTBroker.java}`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/{JWTSymmetricKeyFactory.java => internal/broker/SymmetricKeyJWTBrokerFactory.java}`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/{ => internal/broker}/TokenBroker.java`

*... and 18 more files*

---

#### 17. `fb418a2` - 32 files changed

**Date:** 2025-07-16
**PR:** [#1938](https://github.com/apache/polaris/pull/1938)
**Title:** Extensible pagination token implementation (#1938)
**Stats:** +1329 / -506

**Description:**
```
* Allows multiple implementations of `Token` referencing the "next page", encapsulated in `PageToken`. No changes to `polaris-core` needed to add custom `Token` implementations.
* Extensible to (later) support (cryptographic) signatures to prevent tampered page-token
* Refactor pagination code to delineate API-level page tokens and internal "pointers to data"
* Requests deal with the "previous" token, user-provided page size (optional) and the previous request's page size.
* Concentrate the l...
```

**Sample files changed:**
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/CatalogApi.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisRestCatalogIntegrationBase.java`
- `persistence/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/PolarisEclipseLinkMetaStoreSessionImpl.java`
- `persistence/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/PolarisEclipseLinkStore.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/QueryGenerator.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/models/ModelEntity.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/QueryGeneratorTest.java`
- `polaris-core/build.gradle.kts`
- `polaris-core/src/main/java/org/apache/polaris/core/catalog/PolarisCatalogHelpers.java`
- `polaris-core/src/main/java/org/apache/polaris/core/config/FeatureConfiguration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/AtomicOperationMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/dao/entity/EntitiesResult.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/dao/entity/ListEntitiesResult.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/pagination/DonePageToken.java`

*... and 17 more files*

---

#### 18. `c4fc848` - 31 files changed

**Date:** 2025-08-15
**PR:** [#2343](https://github.com/apache/polaris/pull/2343)
**Title:** Add integration tests with Keycloak (#2343)
**Stats:** +743 / -200
**Sample files changed:**
- `gradle/libs.versions.toml`
- `integration-tests/build.gradle.kts`
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/CatalogApi.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/ClientCredentials.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/ClientPrincipal.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/GenericTableApi.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/IcebergHelper.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/IcebergTokenAccessManager.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/ManagementApi.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/OAuth2Api.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/PolarisClient.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/PolarisRestApi.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/PolicyApi.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/RestApi.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/ext/PolarisServerManager.java`

*... and 16 more files*

---

#### 19. `ef177b5` - 31 files changed

**Date:** 2025-08-07
**PR:** [#2250](https://github.com/apache/polaris/pull/2250)
**Title:** Remove PolarisCallContext.getClock (#2250)
**Stats:** +129 / -165

**Description:**
```
realm or call specific context class.
```

**Sample files changed:**
- `persistence/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/EclipseLinkPolarisMetaStoreManagerFactory.java`
- `persistence/eclipselink/src/test/java/org/apache/polaris/extension/persistence/impl/eclipselink/PolarisEclipseLinkMetaStoreManagerTest.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcMetaStoreManagerFactory.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/AtomicMetastoreManagerWithJdbcBasePersistenceImplTest.java`
- `polaris-core/src/main/java/org/apache/polaris/core/PolarisCallContext.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/AtomicOperationMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalMetaStoreManagerImpl.java`
- `polaris-core/src/test/java/org/apache/polaris/core/persistence/PolarisTreeMapAtomicOperationMetaStoreManagerTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/persistence/PolarisTreeMapMetaStoreManagerTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/persistence/ResolverTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/persistence/cache/InMemoryEntityCacheTest.java`
- `polaris-core/src/testFixtures/java/org/apache/polaris/core/persistence/BasePolarisMetaStoreManagerTest.java`
- `runtime/service/src/main/java/org/apache/polaris/service/config/ServiceProducers.java`
- `runtime/service/src/main/java/org/apache/polaris/service/persistence/InMemoryAtomicOperationMetaStoreManagerFactory.java`

*... and 16 more files*

---

#### 20. `8a059aa` - 31 files changed

**Date:** 2025-07-15
**PR:** [#2087](https://github.com/apache/polaris/pull/2087)
**Title:** Revert PR 2033 (#2087)
**Stats:** +229 / -169

**Description:**
```
There are concerns that the PR #2033 will interfere with the whole effort to automate releases. Since there was no change to review and raise the concerns, I'd like to revert it to not cause any friction with that bigger effort.
Revert "Fix invalid redirect from public page (#2041)", commit 493bc8eeb21632801b8f900caeb727493d67bc9f.
Revert "[Site] Simplify the doc directory structure (#2033)", commit 2db2f10eb289e74fa84933542d27006906de37bb.
```

**Sample files changed:**
- `README.md`
- `docs`
- `site/content/_index.adoc`
- `site/content/in-dev/_index.md`
- `site/content/in-dev/release_index.md`
- `site/content/in-dev/unreleased/_index.md`
- `site/content/in-dev/{ => unreleased}/access-control.md`
- `site/content/in-dev/{ => unreleased}/admin-tool.md`
- `site/content/in-dev/{ => unreleased}/command-line-interface.md`
- `site/content/in-dev/{ => unreleased}/configuration.md`
- `site/content/in-dev/{ => unreleased}/configuring-polaris-for-production.md`
- `site/content/in-dev/{ => unreleased}/entities.md`
- `site/content/in-dev/{ => unreleased}/evolution.md`
- `site/content/in-dev/{ => unreleased}/generic-table.md`
- `site/content/in-dev/{ => unreleased}/getting-started/_index.md`

*... and 16 more files*

---

#### 21. `d03c717` - 30 files changed

**Date:** 2025-09-17
**PR:** [#2480](https://github.com/apache/polaris/pull/2480)
**Title:** Add Events for Iceberg REST APIs (#2480)
**Stats:** +861 / -549
**Sample files changed:**
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisServiceImpl.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogHandler.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergRestCatalogEventServiceDelegator.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergRestConfigurationEventServiceDelegator.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/{AfterTaskAttemptedEvent.java => AfterAttemptTaskEvent.java}`
- `runtime/service/src/main/java/org/apache/polaris/service/events/AfterCatalogCreatedEvent.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/AfterTableCommitedEvent.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/AfterTableCreatedEvent.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/AfterTableRefreshedEvent.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/AfterViewCommitedEvent.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/AfterViewRefreshedEvent.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/{BeforeTaskAttemptedEvent.java => BeforeAttemptTaskEvent.java}`
- `runtime/service/src/main/java/org/apache/polaris/service/events/{BeforeRequestRateLimitedEvent.java => BeforeLimitRequestRateEvent.java}`
- `runtime/service/src/main/java/org/apache/polaris/service/events/BeforeTableCommitedEvent.java`

*... and 15 more files*

---

#### 22. `253321c` - 30 files changed

**Date:** 2025-08-04
**PR:** [#2210](https://github.com/apache/polaris/pull/2210)
**Title:** Add ResolutionManifestFactory (#2210)
**Stats:** +229 / -329

**Description:**
```
was left in `PolarisEntityManager`.
by splitting out the more dedicated `ResolutionManifestFactory` we can remove
`PolarisEntityManager` and `RealmEntityManagerFactory` completely it seems.
```

**Sample files changed:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/PolarisEntityManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/resolver/PolarisResolutionManifest.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/resolver/ResolutionManifestFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/resolver/ResolutionManifestFactoryImpl.java`
- `runtime/service/src/main/java/org/apache/polaris/service/quarkus/config/QuarkusProducers.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/admin/ManagementServiceTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/admin/PolarisAdminServiceAuthzTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/admin/PolarisAuthzTestBase.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/AbstractIcebergCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/AbstractIcebergCatalogViewTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/AbstractPolarisGenericTableCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/AbstractPolicyCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/IcebergCatalogHandlerAuthzTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/PolarisGenericTableCatalogHandlerAuthzTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/PolicyCatalogHandlerAuthzTest.java`

*... and 15 more files*

---

#### 23. `2db2f10` - 30 files changed

**Date:** 2025-07-11
**PR:** [#2033](https://github.com/apache/polaris/pull/2033)
**Title:** [Site] Simplify the doc directory structure (#2033)
**Stats:** +168 / -228
**Sample files changed:**
- `README.md`
- `docs`
- `site/content/in-dev/_index.md`
- `site/content/in-dev/{unreleased => }/access-control.md`
- `site/content/in-dev/{unreleased => }/admin-tool.md`
- `site/content/in-dev/{unreleased => }/command-line-interface.md`
- `site/content/in-dev/{unreleased => }/configuration.md`
- `site/content/in-dev/{unreleased => }/configuring-polaris-for-production.md`
- `site/content/in-dev/{unreleased => }/entities.md`
- `site/content/in-dev/{unreleased => }/evolution.md`
- `site/content/in-dev/{unreleased => }/generic-table.md`
- `site/content/in-dev/{unreleased => }/getting-started/_index.md`
- `site/content/in-dev/{unreleased => }/getting-started/deploying-polaris/_index.md`
- `site/content/in-dev/{unreleased => }/getting-started/deploying-polaris/quickstart-deploy-aws.md`
- `site/content/in-dev/{unreleased => }/getting-started/deploying-polaris/quickstart-deploy-azure.md`

*... and 15 more files*

---

#### 24. `1e69373` - 30 files changed

**Date:** 2025-06-26
**PR:** [#1686](https://github.com/apache/polaris/pull/1686)
**Title:** Optimize the location overlap check with an index (#1686)
**Stats:** +863 / -95

**Description:**
```
<hr>
### Current Behavior
The current logic is that when we create a table, we list all sibling tables and check each and every one to ensure there is no location overlap. This results in O(N^2) checks when adding N tables to a namespace, quickly becoming untenable.
With the `CreateTreeDataset` [benchmark](https://github.com/eric-maynard/polaris-tools/blob/main/benchmarks/src/gatling/scala/org/apache/polaris/benchmarks/simulations/CreateTreeDataset.scala) I tested creating 5000 sibling tables...
```

**Sample files changed:**
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisApplicationIntegrationTest.java`
- `persistence/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/PolarisEclipseLinkMetaStoreSessionImpl.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/DatabaseType.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/QueryGenerator.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/models/ModelEntity.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/models/SchemaVersion.java`
- `persistence/relational-jdbc/src/main/resources/h2/schema-v1.sql`
- `persistence/relational-jdbc/src/main/resources/h2/schema-v2.sql`
- `persistence/relational-jdbc/src/main/resources/postgres/schema-v1.sql`
- `persistence/relational-jdbc/src/main/resources/postgres/schema-v2.sql`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/AtomicMetastoreManagerWithJdbcBasePersistenceImplTest.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/QueryGeneratorTest.java`
- `polaris-core/src/main/java/org/apache/polaris/core/config/FeatureConfiguration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/connection/ConnectionType.java`

*... and 15 more files*

---

#### 25. `dedda29` - 29 files changed

**Date:** 2025-09-30
**PR:** [#2527](https://github.com/apache/polaris/pull/2527)
**Title:** NoSQL persistence: add Java/Vert.X executor abstraction layer (#2527)
**Stats:** +1941 / -0
**Sample files changed:**
- `bom/build.gradle.kts`
- `gradle/libs.versions.toml`
- `gradle/projects.main.properties`
- `persistence/nosql/async/README.md`
- `persistence/nosql/async/api/build.gradle.kts`
- `persistence/nosql/async/api/src/main/java/org/apache/polaris/nosql/async/AsyncConfiguration.java`
- `persistence/nosql/async/api/src/main/java/org/apache/polaris/nosql/async/AsyncExec.java`
- `persistence/nosql/async/api/src/main/java/org/apache/polaris/nosql/async/Cancelable.java`
- `persistence/nosql/async/api/src/main/resources/META-INF/beans.xml`
- `persistence/nosql/async/api/src/testFixtures/java/org/apache/polaris/nosql/async/AppScopedChecker.java`
- `persistence/nosql/async/api/src/testFixtures/java/org/apache/polaris/nosql/async/AsyncExecTestBase.java`
- `persistence/nosql/async/api/src/testFixtures/java/org/apache/polaris/nosql/async/AsyncTestConfigProvider.java`
- `persistence/nosql/async/api/src/testFixtures/java/org/apache/polaris/nosql/async/MockAsyncExec.java`
- `persistence/nosql/async/api/src/testFixtures/resources/META-INF/beans.xml`
- `persistence/nosql/async/java/build.gradle.kts`

*... and 14 more files*

---

#### 26. `9e6d929` - 29 files changed

**Date:** 2025-08-28
**PR:** [#2341](https://github.com/apache/polaris/pull/2341)
**Title:** add refresh credentials property to loadTableResult (#2341)
**Stats:** +341 / -93

**Description:**
```
* IcebergCatalogAdapterTest: Added test to ensure refresh credentials endpoint is included
* delegate refresh credential endpoint configuration to storage integration
* GCP: Add refresh credential properties
```

**Sample files changed:**
- `CHANGELOG.md`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/AtomicOperationMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/TransactionWorkspaceMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalMetaStoreManagerImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/rest/PolarisResourcePaths.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/PolarisCredentialVendor.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/PolarisStorageIntegration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/StorageAccessProperty.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/aws/AwsCredentialsStorageIntegration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/azure/AzureCredentialsStorageIntegration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/cache/StorageCredentialCache.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/cache/StorageCredentialCacheKey.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/gcp/GcpCredentialsStorageIntegration.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/InMemoryStorageIntegrationTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/azure/AzureCredentialsStorageIntegrationTest.java`

*... and 14 more files*

---

#### 27. `5132312` - 28 files changed

**Date:** 2025-06-04
**PR:** [#1813](https://github.com/apache/polaris/pull/1813)
**Title:** Remove deprecated constructor for PolarisCallContext (#1813)
**Stats:** +55 / -36

**Description:**
```
This PR removes the usage of the old constructors.
```

**Sample files changed:**
- `persistence/eclipselink/src/test/java/org/apache/polaris/extension/persistence/impl/eclipselink/PolarisEclipseLinkMetaStoreManagerTest.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcMetaStoreManagerFactory.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/AtomicMetastoreManagerWithJdbcBasePersistenceImplTest.java`
- `polaris-core/src/main/java/org/apache/polaris/core/PolarisCallContext.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`
- `polaris-core/src/test/java/org/apache/polaris/core/persistence/PolarisTreeMapAtomicOperationMetaStoreManagerTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/persistence/PolarisTreeMapMetaStoreManagerTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/persistence/ResolverTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/persistence/cache/InMemoryEntityCacheTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/InMemoryStorageIntegrationTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/cache/StorageCredentialCacheTest.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/admin/ManagementServiceTest.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/admin/PolarisAuthzTestBase.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/auth/JWTRSAKeyPairTest.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/auth/JWTSymmetricKeyGeneratorTest.java`

*... and 13 more files*

---

#### 28. `c783de9` - 27 files changed

**Date:** 2025-09-03
**PR:** [#2131](https://github.com/apache/polaris/pull/2131)
**Title:** feat(idgen): Start Implementation of NoSQL with the ID Generation Framework (#2131)
**Stats:** +3165 / -0

**Description:**
```
Related to #650 & #844
Co-authored-by: Robert Stupp <snazy@snazy.de>
Co-authored-by: Dmitri Bourlatchkov <dmitri.bourlatchkov@gmail.com>
```

**Sample files changed:**
- `gradle/libs.versions.toml`
- `gradle/projects.main.properties`
- `persistence/nosql/idgen/README.md`
- `persistence/nosql/idgen/api/build.gradle.kts`
- `persistence/nosql/idgen/api/src/main/java/org/apache/polaris/ids/api/IdGenerator.java`
- `persistence/nosql/idgen/api/src/main/java/org/apache/polaris/ids/api/IdGeneratorSpec.java`
- `persistence/nosql/idgen/api/src/main/java/org/apache/polaris/ids/api/MonotonicClock.java`
- `persistence/nosql/idgen/api/src/main/java/org/apache/polaris/ids/api/SnowflakeIdGenerator.java`
- `persistence/nosql/idgen/impl/build.gradle.kts`
- `persistence/nosql/idgen/impl/src/jcstress/java/org/apache/polaris/ids/impl/MonotonicClockStress.java`
- `persistence/nosql/idgen/impl/src/jcstress/java/org/apache/polaris/ids/impl/SnowflakeIdGeneratorStress.java`
- `persistence/nosql/idgen/impl/src/jmh/java/org/apache/polaris/ids/impl/MonotonicClockBench.java`
- `persistence/nosql/idgen/impl/src/jmh/java/org/apache/polaris/ids/impl/SnowflakeIdGeneratorBench.java`
- `persistence/nosql/idgen/impl/src/main/java/org/apache/polaris/ids/impl/MonotonicClockImpl.java`
- `persistence/nosql/idgen/impl/src/main/java/org/apache/polaris/ids/impl/SnowflakeIdGeneratorFactory.java`

*... and 12 more files*

---

#### 29. `b6e247d` - 25 files changed

**Date:** 2025-08-27
**PR:** [#2431](https://github.com/apache/polaris/pull/2431)
**Title:** Build: Make jandex dependency used for index generation managed (#2431)
**Stats:** +41 / -30

**Description:**
```
This is a preparation step contributing to #2204, once a jandex fix for reproducible builds is available.
Co-authored-by: Alexandre Dutra <adutra@apache.org>
```

**Sample files changed:**
- `api/iceberg-service/build.gradle.kts`
- `api/management-model/build.gradle.kts`
- `api/management-service/build.gradle.kts`
- `api/polaris-catalog-service/build.gradle.kts`
- `build-logic/build.gradle.kts`
- `build-logic/src/main/kotlin/polaris-java.gradle.kts`
- `build.gradle.kts`
- `extensions/federation/hadoop/build.gradle.kts`
- `extensions/federation/hive/build.gradle.kts`
- `gradle/baselibs.versions.toml`
- `gradle/libs.versions.toml`
- `persistence/eclipselink/build.gradle.kts`
- `persistence/relational-jdbc/build.gradle.kts`
- `plugins/spark/v3.5/integration/build.gradle.kts`
- `polaris-core/build.gradle.kts`

*... and 10 more files*

---

#### 30. `95d1eac` - 25 files changed

**Date:** 2025-07-04
**PR:** [#1913](https://github.com/apache/polaris/pull/1913)
**Title:** feat: Support customizing S3 endpoints (#1913)
**Stats:** +1261 / -22

**Description:**
```
Introduce a dedicated interface for `StsClient` suppliers and implement it using a pool of cached clients.
All client are "thin" and share the same `SdkHttpClient`. The latter is closed when the server shuts down.
This is a step towards supporting non-AWS S3 storage (#1530).
For this reason the STS endpoint is present in new interfaces, but is not used yet.
```

**Sample files changed:**
- `CHANGELOG.md`
- `LICENSE`
- `bom/build.gradle.kts`
- `gradle/projects.main.properties`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/CatalogEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/aws/AwsCredentialsStorageIntegration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/aws/AwsStorageConfigurationInfo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/aws/StsClientProvider.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/aws/AwsStorageConfigurationInfoTest.java`
- `runtime/service/build.gradle.kts`
- `runtime/service/src/intTest/java/org/apache/polaris/service/quarkus/it/QuarkusRestCatalogMinIoIT.java`
- `runtime/service/src/main/java/org/apache/polaris/service/quarkus/config/QuarkusProducers.java`
- `runtime/service/src/main/java/org/apache/polaris/service/quarkus/storage/QuarkusStorageConfiguration.java`
- `runtime/service/src/main/java/org/apache/polaris/service/storage/aws/S3AccessConfig.java`
- `runtime/service/src/main/java/org/apache/polaris/service/storage/aws/StsClientsPool.java`

*... and 10 more files*

---

#### 31. `756e535` - 24 files changed

**Date:** 2025-07-28
**PR:** [#2176](https://github.com/apache/polaris/pull/2176)
**Title:** Remove PolarisDiagnostics from json utils (#2176)
**Stats:** +81 / -229
**Sample files changed:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcMetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/connection/ConnectionConfigInfoDpo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/CatalogEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/TaskEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/AtomicOperationMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/BaseMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/PolarisObjectMapperUtil.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalMetaStoreManagerImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/PolarisStorageConfigurationInfo.java`
- `polaris-core/src/test/java/org/apache/polaris/core/connection/ConnectionConfigInfoDpoTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/persistence/cache/EntityWeigherTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/cache/StorageCredentialCacheTest.java`
- `polaris-core/src/testFixtures/java/org/apache/polaris/core/persistence/BasePolarisMetaStoreManagerTest.java`
- `polaris-core/src/testFixtures/java/org/apache/polaris/core/persistence/PolarisTestMetaStoreManager.java`

*... and 9 more files*

---

#### 32. `2c77fbf` - 22 files changed

**Date:** 2025-09-19
**PR:** [#2600](https://github.com/apache/polaris/pull/2600)
**Title:** chore(errorprone): Enabling EqualsGetClass, PatternMatchingInstanceof, and UnusedMethod in ErrorProne (#2600)
**Stats:** +47 / -237
**Sample files changed:**
- `api/iceberg-service/src/main/java/org/apache/polaris/service/types/NotificationRequest.java`
- `api/iceberg-service/src/main/java/org/apache/polaris/service/types/TableUpdateNotification.java`
- `api/polaris-catalog-service/src/main/java/org/apache/polaris/service/types/PolicyIdentifier.java`
- `codestyle/errorprone-rules.properties`
- `plugins/spark/v3.5/integration/src/intTest/java/org/apache/polaris/spark/quarkus/it/SparkIntegrationBase.java`
- `plugins/spark/v3.5/spark/src/main/java/org/apache/polaris/spark/rest/CreateGenericTableRequest.java`
- `plugins/spark/v3.5/spark/src/main/java/org/apache/polaris/spark/rest/GenericTable.java`
- `plugins/spark/v3.5/spark/src/main/java/org/apache/polaris/spark/rest/ListGenericTablesResponse.java`
- `plugins/spark/v3.5/spark/src/main/java/org/apache/polaris/spark/rest/LoadGenericTableResponse.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/PolarisEntityId.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/PolarisGrantRecord.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/cache/EntityCacheByNameKey.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/resolver/ResolverEntityName.java`
- `polaris-core/src/main/java/org/apache/polaris/core/policy/PolarisPolicyMappingRecord.java`
- `polaris-core/src/testFixtures/java/org/apache/polaris/core/persistence/BaseResolverTest.java`

*... and 7 more files*

---

#### 33. `7b04abe` - 21 files changed

**Date:** 2025-07-25
**PR:** [#2171](https://github.com/apache/polaris/pull/2171)
**Title:** Push AccessConfig creation to PolarisStorageIntegration (#2171)
**Stats:** +413 / -361

**Description:**
```
* Move storage-specific access properties processing logic from
  core code to storage integration implementations.
* Add `isExpirationTimestamp` flag to `StorageAccessProperty` to
  allow them to be processed uniformly.
* Prepare for supporting access config properties that may have
  different values in Polaris Servers and Clients. This enables
  future enhancements to support different S3 endpoint DNS names
  in servers and clients for #1530
```

**Sample files changed:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/AtomicOperationMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/dao/entity/ScopedCredentialsResult.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalMetaStoreManagerImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/AccessConfig.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/PolarisStorageIntegration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/StorageAccessProperty.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/aws/AwsCredentialsStorageIntegration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/azure/AzureCredentialsStorageIntegration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/cache/StorageCredentialCache.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/cache/StorageCredentialCacheEntry.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/gcp/GcpCredentialsStorageIntegration.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/AccessConfigTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/InMemoryStorageIntegrationTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/azure/AzureCredentialsStorageIntegrationTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/cache/StorageCredentialCacheTest.java`

*... and 6 more files*

---

#### 34. `d035344` - 21 files changed

**Date:** 2025-07-16
**PR:** [#1960](https://github.com/apache/polaris/pull/1960)
**Title:** Spark 3.5.6 and Iceberg 1.9.1 (#1960)
**Stats:** +55 / -55

**Description:**
```
* Cleanup
```

**Sample files changed:**
- `.github/workflows/spark_client_regtests.yml`
- `getting-started/eclipselink/docker-compose.yml`
- `getting-started/jdbc/docker-compose.yml`
- `getting-started/spark/notebooks/SparkPolaris.ipynb`
- `gradle/libs.versions.toml`
- `plugins/pluginlibs.versions.toml`
- `plugins/spark/README.md`
- `plugins/spark/v3.5/getting-started/README.md`
- `plugins/spark/v3.5/getting-started/notebooks/Dockerfile`
- `plugins/spark/v3.5/getting-started/notebooks/SparkPolaris.ipynb`
- `plugins/spark/v3.5/regtests/run.sh`
- `plugins/spark/v3.5/regtests/setup.sh`
- `regtests/run.sh`
- `regtests/run_spark_sql.sh`
- `regtests/setup.sh`

*... and 6 more files*

---

#### 35. `93938fd` - 21 files changed

**Date:** 2025-06-23
**PR:** [#1908](https://github.com/apache/polaris/pull/1908)
**Title:** Update spark client to use the shaded iceberg-core in iceberg-spark-runtime to avoid spark compatibilities issue (#1908)
**Stats:** +961 / -81

**Description:**
```
* add comment
* update change
* add comment
* add change
* add tests
* add comment
* clean up style check
* update build
* Revert "Reuse shadowJar for spark client bundle jar maven publish (#1857)"
This reverts commit 1f7f127536a088911bf940addd1d05c07ff99a68.
* Reuse shadowJar for spark client bundle jar maven publish (#1857)
* fix spark client
* fix test failure and address feedback
* fix error
* update regression test
* update classifier name
* address comment
* add change
* update doc
* up...
```

**Sample files changed:**
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/CatalogApi.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/ManagementApi.java`
- `plugins/spark/v3.5/integration/build.gradle.kts`
- `plugins/spark/v3.5/integration/src/intTest/java/org/apache/polaris/spark/quarkus/it/PolarisManagementClient.java`
- `plugins/spark/v3.5/integration/src/intTest/java/org/apache/polaris/spark/quarkus/it/SparkCatalogIcebergIT.java`
- `plugins/spark/v3.5/integration/src/intTest/java/org/apache/polaris/spark/quarkus/it/SparkIntegrationBase.java`
- `plugins/spark/v3.5/spark/build.gradle.kts`
- `plugins/spark/v3.5/spark/checkstyle_suppressions.xml`
- `plugins/spark/v3.5/spark/src/main/java/org/apache/polaris/spark/PolarisCatalog.java`
- `plugins/spark/v3.5/spark/src/main/java/org/apache/polaris/spark/PolarisRESTCatalog.java`
- `plugins/spark/v3.5/spark/src/main/java/org/apache/polaris/spark/PolarisSparkCatalog.java`
- `plugins/spark/v3.5/spark/src/main/java/org/apache/polaris/spark/rest/CreateGenericTableRESTRequest.java`
- `plugins/spark/v3.5/spark/src/main/java/org/apache/polaris/spark/rest/CreateGenericTableRequest.java`
- `plugins/spark/v3.5/spark/src/main/java/org/apache/polaris/spark/rest/GenericTable.java`
- `plugins/spark/v3.5/spark/src/main/java/org/apache/polaris/spark/rest/ListGenericTablesRESTResponse.java`

*... and 6 more files*

---

#### 36. `ce3efe6` - 21 files changed

**Date:** 2025-05-28
**PR:** [#1718](https://github.com/apache/polaris/pull/1718)
**Title:** Merge JPA module with EclipseLink Module (#1718)
**Stats:** +64 / -100
**Sample files changed:**
- `README.md`
- `bom/build.gradle.kts`
- `extension/persistence/eclipselink/build.gradle.kts`
- `extension/persistence/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/PolarisEclipseLinkMetaStoreSessionImpl.java`
- `extension/persistence/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/PolarisEclipseLinkStore.java`
- `extension/persistence/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/PolarisSequenceUtil.java`
- `extension/persistence/{jpa-model/src/main/java/org/apache/polaris/jpa => eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink}/models/ModelEntity.java`
- `extension/persistence/{jpa-model/src/main/java/org/apache/polaris/jpa => eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink}/models/ModelEntityActive.java`
- `extension/persistence/{jpa-model/src/main/java/org/apache/polaris/jpa => eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink}/models/ModelEntityChangeTracking.java`
- `extension/persistence/{jpa-model/src/main/java/org/apache/polaris/jpa => eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink}/models/ModelGrantRecord.java`
- `extension/persistence/{jpa-model/src/main/java/org/apache/polaris/jpa => eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink}/models/ModelPolicyMappingRecord.java`
- `extension/persistence/{jpa-model/src/main/java/org/apache/polaris/jpa => eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink}/models/ModelPrincipalSecrets.java`
- `extension/persistence/{jpa-model/src/main/java/org/apache/polaris/jpa => eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink}/models/ModelSequenceId.java`
- `extension/persistence/eclipselink/src/main/resources/META-INF/persistence.xml`
- `extension/persistence/eclipselink/src/test/java/org/apache/polaris/extension/persistence/impl/eclipselink/PolarisEclipseLinkMetaStoreManagerTest.java`

*... and 6 more files*

---

#### 37. `e45be14` - 20 files changed

**Date:** 2025-08-15
**PR:** [#2190](https://github.com/apache/polaris/pull/2190)
**Title:** SigV4 Auth Support for Catalog Federation - Part 2: Connection Config Persistence (#2190)
**Stats:** +649 / -77

**Description:**
```
* Rename UserSecretReference to SecretReference and fix some small issues
```

**Sample files changed:**
- `polaris-core/src/main/java/org/apache/polaris/core/connection/AuthenticationParametersDpo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/connection/AuthenticationType.java`
- `polaris-core/src/main/java/org/apache/polaris/core/connection/BearerAuthenticationParametersDpo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/connection/ConnectionConfigInfoDpo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/connection/OAuthClientCredentialsParametersDpo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/connection/SigV4AuthenticationParametersDpo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/connection/hadoop/HadoopConnectionConfigInfoDpo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/connection/iceberg/IcebergRestConnectionConfigInfoDpo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/CatalogEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/identity/ServiceIdentityType.java`
- `polaris-core/src/main/java/org/apache/polaris/core/identity/dpo/AwsIamServiceIdentityInfoDpo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/identity/dpo/ServiceIdentityInfoDpo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/secrets/{UserSecretReference.java => SecretReference.java}`
- `polaris-core/src/main/java/org/apache/polaris/core/secrets/ServiceSecretReference.java`
- `polaris-core/src/main/java/org/apache/polaris/core/secrets/UnsafeInMemorySecretsManager.java`

*... and 5 more files*

---

#### 38. `ca85339` - 20 files changed

**Date:** 2025-07-24
**PR:** [#2161](https://github.com/apache/polaris/pull/2161)
**Title:** Rework getOrCreateSessionSupplier (#2161)
**Stats:** +32 / -43

**Description:**
```
it seems like the `Supplier` was an leaking implementation detail of the
`MetaStoreManagerFactor` implementations.
```

**Sample files changed:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcMetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/MetaStoreManagerFactory.java`
- `runtime/service/src/main/java/org/apache/polaris/service/quarkus/config/QuarkusProducers.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/admin/ManagementServiceTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/admin/PolarisAuthzTestBase.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/AbstractIcebergCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/AbstractIcebergCatalogViewTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/AbstractPolarisGenericTableCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/AbstractPolicyCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/entity/CatalogEntityTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/task/BatchFileCleanupTaskHandlerTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/task/ManifestFileCleanupTaskHandlerTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/task/TableCleanupTaskHandlerTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/test/PolarisIntegrationTestFixture.java`

*... and 5 more files*

---

#### 39. `9ff2ca1` - 20 files changed

**Date:** 2025-06-27
**PR:** [#1596](https://github.com/apache/polaris/pull/1596)
**Title:** Mutable objects used for immutable values (#1596)
**Stats:** +648 / -504
**Sample files changed:**
- `persistence/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/models/ModelEntity.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/models/ModelEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/PolarisBaseEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/PolarisEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/PolarisEntityCore.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/AtomicOperationMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/BaseMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/ResolvedPolarisEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/PolarisEntityResolver.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalMetaStoreManagerImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TreeMapMetaStore.java`
- `polaris-core/src/test/java/org/apache/polaris/core/persistence/PolarisObjectMapperUtilTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/persistence/cache/EntityWeigherTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/cache/StorageCredentialCacheTest.java`
- `polaris-core/src/testFixtures/java/org/apache/polaris/core/persistence/PolarisTestMetaStoreManager.java`

*... and 5 more files*

---

#### 40. `30acee6` - 20 files changed

**Date:** 2025-06-27
**PR:** [#1967](https://github.com/apache/polaris/pull/1967)
**Title:** Fix hugo blockquote (#1967)
**Stats:** +142 / -88

**Description:**
```
* Add license header
```

**Sample files changed:**
- `site/content/in-dev/unreleased/_index.md`
- `site/content/in-dev/unreleased/access-control.md`
- `site/content/in-dev/unreleased/admin-tool.md`
- `site/content/in-dev/unreleased/command-line-interface.md`
- `site/content/in-dev/unreleased/configuration.md`
- `site/content/in-dev/unreleased/configuring-polaris-for-production.md`
- `site/content/in-dev/unreleased/entities.md`
- `site/content/in-dev/unreleased/evolution.md`
- `site/content/in-dev/unreleased/generic-table.md`
- `site/content/in-dev/unreleased/getting-started/_index.md`
- `site/content/in-dev/unreleased/getting-started/deploying-polaris/_index.md`
- `site/content/in-dev/unreleased/getting-started/deploying-polaris/quickstart-deploy-aws.md`
- `site/content/in-dev/unreleased/getting-started/deploying-polaris/quickstart-deploy-azure.md`
- `site/content/in-dev/unreleased/getting-started/deploying-polaris/quickstart-deploy-gcp.md`
- `site/content/in-dev/unreleased/metastores.md`

*... and 5 more files*

---

#### 41. `359388e` - 19 files changed

**Date:** 2025-10-02
**PR:** [#2540](https://github.com/apache/polaris/pull/2540)
**Title:** Make ResolverFactory + ResolutionManifestFactory request-scoped (#2540)
**Stats:** +103 / -147

**Description:**
```
note that ideally the `SecurityContext` would also be injected from
the request however our tests around `PolarisAuthzTestBase` are
written in a way that does not easily support this currently.
```

**Sample files changed:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/resolver/PolarisResolutionManifest.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/resolver/ResolutionManifestFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/resolver/ResolutionManifestFactoryImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/resolver/ResolverFactory.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisAdminService.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/common/CatalogHandler.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogAdapter.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/policy/PolicyCatalogHandler.java`
- `runtime/service/src/main/java/org/apache/polaris/service/config/ServiceProducers.java`
- `runtime/service/src/test/java/org/apache/polaris/service/admin/PolarisAdminServiceTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/admin/PolarisAuthzTestBase.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/generic/AbstractPolarisGenericTableCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/iceberg/AbstractIcebergCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/iceberg/AbstractIcebergCatalogViewTest.java`

*... and 4 more files*

---

#### 42. `0c790e0` - 19 files changed

**Date:** 2025-08-06
**PR:** [#2268](https://github.com/apache/polaris/pull/2268)
**Title:** Standardize logging libraries in tests (#2268)
**Stats:** +277 / -96

**Description:**
```
- Non-Quarkus modules use Logback Classic, configured via logback-test.xml
- Quarkus modules use JBoss Logging Manager, configured in Quarkus configuration files.
This change also introduces a workaround for the "duplicate log messages" issues with Gradle + JBoss Logging Manager. See this issue for context:
https://github.com/quarkusio/quarkus/issues/22844
The workaround implemented in this PR is very similar to the one proposed in this comment:
https://github.com/quarkusio/quarkus/issues/228...
```

**Sample files changed:**
- `build-logic/src/main/kotlin/polaris-java.gradle.kts`
- `build-logic/src/main/kotlin/polaris-runtime.gradle.kts`
- `{runtime/service => persistence/relational-jdbc}/src/test/resources/logback-test.xml`
- `plugins/spark/v3.5/integration/build.gradle.kts`
- `plugins/spark/v3.5/{integration/src/intTest/resources/logback.xml => spark/src/test/resources/logback-test.xml}`
- `runtime/admin/build.gradle.kts`
- `runtime/common/build.gradle.kts`
- `runtime/defaults/build.gradle.kts`
- `runtime/defaults/src/main/resources/application-it.properties`
- `runtime/defaults/src/main/resources/application-test.properties`
- `runtime/defaults/src/main/resources/application.properties`
- `runtime/service/build.gradle.kts`
- `runtime/service/src/main/java/org/apache/polaris/service/exception/IcebergExceptionMapper.java`
- `runtime/service/src/main/java/org/apache/polaris/service/exception/IcebergJsonProcessingExceptionMapper.java`
- `runtime/service/src/main/java/org/apache/polaris/service/exception/PolarisExceptionMapper.java`

*... and 4 more files*

---

#### 43. `eb7618b` - 18 files changed

**Date:** 2025-09-22
**PR:** [#2611](https://github.com/apache/polaris/pull/2611)
**Title:** chore(docs): reorganize getting-started section (#2611)
**Stats:** +564 / -34
**Sample files changed:**
- `site/content/in-dev/unreleased/_index.md`
- `site/content/in-dev/unreleased/getting-started/_index.md`
- `site/content/in-dev/unreleased/getting-started/creating-a-catalog/_index.md`
- `site/content/in-dev/unreleased/getting-started/creating-a-catalog/catalog-azure.md`
- `site/content/in-dev/unreleased/getting-started/creating-a-catalog/catalog-gcs.md`
- `site/content/in-dev/unreleased/getting-started/creating-a-catalog/s3/_index.md`
- `site/content/in-dev/unreleased/getting-started/creating-a-catalog/s3/catalog-aws.md`
- `site/content/in-dev/unreleased/getting-started/{minio.md => creating-a-catalog/s3/catalog-minio.md}`
- `site/content/in-dev/unreleased/getting-started/deploying-polaris/_index.md`
- `site/content/in-dev/unreleased/getting-started/deploying-polaris/cloud-deploy/_index.md`
- `site/content/in-dev/unreleased/getting-started/deploying-polaris/{quickstart-deploy-aws.md => cloud-deploy/deploy-aws.md}`
- `site/content/in-dev/unreleased/getting-started/deploying-polaris/{quickstart-deploy-azure.md => cloud-deploy/deploy-azure.md}`
- `site/content/in-dev/unreleased/getting-started/deploying-polaris/{quickstart-deploy-gcp.md => cloud-deploy/deploy-gcp.md}`
- `site/content/in-dev/unreleased/getting-started/{quickstart.md => deploying-polaris/local-deploy.md}`
- `site/content/in-dev/unreleased/managing-security/_index.md`

*... and 3 more files*

---

#### 44. `d1d359a` - 18 files changed

**Date:** 2025-09-19
**PR:** [#2390](https://github.com/apache/polaris/pull/2390)
**Title:** Remove ActiveRolesProvider (#2390)
**Stats:** +456 / -559

**Description:**
```
- As proposed on the ML, `ActiveRolesProvider` is removed, and `DefaultActiveRolesProvider` is merged into `DefaultAuthenticator`. `ActiveRolesAugmentor` is also merged into `AuthenticatingAugmentor`.
- The implicit convention that no roles in credentials == all roles requested is removed as it is ambiguous. Credentials must explicitly include the `PRINCIPAL_ROLE:ALL` pseudo-role to request all roles available.
- PersistedPolarisPrincipal is removed. It existed merely as a means of passing th...
```

**Sample files changed:**
- `CHANGELOG.md`
- `helm/polaris/README.md`
- `helm/polaris/ci/authentication-values.yaml`
- `helm/polaris/templates/_helpers.tpl`
- `helm/polaris/tests/configmap_test.yaml`
- `helm/polaris/values.yaml`
- `runtime/defaults/src/main/resources/application.properties`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/ActiveRolesAugmentor.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/ActiveRolesProvider.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/AuthenticatingAugmentor.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/AuthenticationRealmConfiguration.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/DefaultActiveRolesProvider.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/DefaultAuthenticator.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/PersistedPolarisPrincipal.java`
- `runtime/service/src/main/java/org/apache/polaris/service/config/ServiceProducers.java`

*... and 3 more files*

---

#### 45. `97b6fe8` - 18 files changed

**Date:** 2025-09-15
**PR:** [#2557](https://github.com/apache/polaris/pull/2557)
**Title:** Support sdist client distribution (#2557)
**Stats:** +53 / -13

**Description:**
```
. The goal is to include only the files required for an end-user to build the client locally (the repository already supports wheel distribution).
For the sdist build, this PR takes a slightly different approach than the symbolic link solution proposed in [#2419]. Instead of using symbolic links, it copies the necessary files from the project root into the client directory (if they do not already exist) and then uses that directory during sdist mode. This approach avoids errors caused by Poet...
```

**Sample files changed:**
- `Makefile`
- `client/python/.gitignore`
- `client/python/README.md`
- `client/python/generate_clients.py`
- `client/python/pyproject.toml`
- `client/{ => python}/templates/header-cfg.txt`
- `client/{ => python}/templates/header-ini.txt`
- `client/{ => python}/templates/header-json5.txt`
- `client/{ => python}/templates/header-md.txt`
- `client/{ => python}/templates/header-py.txt`
- `client/{ => python}/templates/header-sh.txt`
- `client/{ => python}/templates/header-toml.txt`
- `client/{ => python}/templates/header-txt.txt`
- `client/{ => python}/templates/header-typed.txt`
- `client/{ => python}/templates/header-xml.txt`

*... and 3 more files*

---

#### 46. `886d111` - 18 files changed

**Date:** 2025-07-22
**PR:** [#2133](https://github.com/apache/polaris/pull/2133)
**Title:** Remove PolarisEntityManager.getCredentialCache (#2133)
**Stats:** +98 / -129

**Description:**
```
the only caller of `getCredentialCache` is `FileIOUtil.refreshAccessConfig`, which in in turn is only called by `DefaultFileIOFactory` and `IcebergCatalog`.
note that in a follow-up we will likely be able to remove `PolarisEntityManager` usage completely from `IcebergCatalog`.
additional cleanups:
- use `StorageCredentialCache` injection in tests (but we need to invalidate all entries on test start)
- remove unused `UserSecretsManagerFactory` from `PolarisCallContextCatalogFactory`
```

**Sample files changed:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/PolarisEntityManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/cache/StorageCredentialCache.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/admin/PolarisAuthzTestBase.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/admin/PolarisS3InteroperabilityTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/AbstractIcebergCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/AbstractIcebergCatalogViewTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/AbstractPolarisGenericTableCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/AbstractPolicyCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/IcebergCatalogHandlerAuthzTest.java`
- `service/common/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`
- `service/common/src/main/java/org/apache/polaris/service/catalog/io/DefaultFileIOFactory.java`
- `service/common/src/main/java/org/apache/polaris/service/catalog/io/FileIOUtil.java`
- `service/common/src/main/java/org/apache/polaris/service/catalog/io/WasbTranslatingFileIOFactory.java`
- `service/common/src/main/java/org/apache/polaris/service/config/RealmEntityManagerFactory.java`
- `service/common/src/main/java/org/apache/polaris/service/context/catalog/PolarisCallContextCatalogFactory.java`

*... and 3 more files*

---

#### 47. `5fe9fd9` - 18 files changed

**Date:** 2025-06-02
**PR:** [#1780](https://github.com/apache/polaris/pull/1780)
**Title:** Replace getConfiguration usage with PolarisCallContext to use RealmContext (PART 1) (#1780)
**Stats:** +88 / -79
**Sample files changed:**
- `polaris-core/src/main/java/org/apache/polaris/core/auth/PolarisAuthorizerImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/config/FeatureConfiguration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/config/PolarisConfiguration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/config/PolarisConfigurationStore.java`
- `polaris-core/src/main/java/org/apache/polaris/core/rest/PolarisEndpoints.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/InMemoryStorageIntegration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/PolarisStorageConfigurationInfo.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/InMemoryStorageIntegrationTest.java`
- `polaris-core/src/test/java/org/apache/polaris/service/storage/PolarisConfigurationStoreTest.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/catalog/IcebergCatalogTest.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/config/DefaultConfigurationStoreTest.java`
- `service/common/src/main/java/org/apache/polaris/service/admin/PolarisAdminService.java`
- `service/common/src/main/java/org/apache/polaris/service/admin/PolarisServiceImpl.java`
- `service/common/src/main/java/org/apache/polaris/service/catalog/iceberg/CatalogHandlerUtils.java`
- `service/common/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`

*... and 3 more files*

---

#### 48. `327697c` - 17 files changed

**Date:** 2025-09-02
**PR:** [#2197](https://github.com/apache/polaris/pull/2197)
**Title:** Feature: Expose resetCredentials via a new reset api to allow root user to reset credentials for an existing principal with custom values  (#2197)
**Stats:** +479 / -5
**Sample files changed:**
- `CHANGELOG.md`
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/ManagementApi.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisManagementServiceIntegrationTest.java`
- `persistence/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/PolarisEclipseLinkMetaStoreSessionImpl.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/auth/PolarisAuthorizerImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/auth/PolarisSecretsManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/config/FeatureConfiguration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/PolarisPrincipalSecrets.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/AtomicOperationMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/IntegrationPersistence.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/TransactionWorkspaceMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalMetaStoreManagerImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TreeMapTransactionalPersistenceImpl.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisAdminService.java`

*... and 2 more files*

---

#### 49. `eb6b6ad` - 17 files changed

**Date:** 2025-07-01
**PR:** [#1912](https://github.com/apache/polaris/pull/1912)
**Title:** Add support for catalog federation in the CLI (#1912)
**Stats:** +570 / -649
**Sample files changed:**
- `client/python/cli/command/__init__.py`
- `client/python/cli/command/catalogs.py`
- `client/python/cli/command/namespaces.py`
- `client/python/cli/command/principal_roles.py`
- `client/python/cli/constants.py`
- `client/python/cli/options/option_tree.py`
- `client/python/cli/options/parser.py`
- `client/python/cli/polaris_cli.py`
- `client/python/test/test_cli_parsing.py`
- `getting-started/spark/notebooks/SparkPolaris.ipynb`
- `plugins/spark/v3.5/getting-started/notebooks/SparkPolaris.ipynb`
- `regtests/t_cli/src/test_cli.py`
- `regtests/t_oauth/test_oauth2_tokens.py`
- `regtests/t_pyspark/src/conftest.py`
- `regtests/t_pyspark/src/iceberg_spark.py`

*... and 2 more files*

---

#### 50. `438d06c` - 17 files changed

**Date:** 2025-06-27
**PR:** [#1934](https://github.com/apache/polaris/pull/1934)
**Title:** test(integration): refactor PolarisRestCatalogIntegrationTest to run against any cloud provider (#1934)
**Stats:** +348 / -203
**Sample files changed:**
- `LICENSE`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisRestCatalogAwsIntegrationTest.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisRestCatalogAzureIntegrationTest.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisRestCatalogFileIntegrationTest.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisRestCatalogGcpIntegrationTest.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/{PolarisRestCatalogIntegrationTest.java => PolarisRestCatalogIntegrationBase.java}`
- `integration-tests/src/main/resources/META-INF/LICENSE`
- `runtime/service/README-quarkus.md`
- `runtime/service/src/intTest/java/org/apache/polaris/service/quarkus/it/{QuarkusRestCatalogIT.java => QuarkusRestCatalogAwsIT.java}`
- `runtime/service/src/intTest/java/org/apache/polaris/service/quarkus/it/QuarkusRestCatalogAzureIT.java`
- `runtime/service/src/intTest/java/org/apache/polaris/service/quarkus/it/QuarkusRestCatalogFileIT.java`
- `runtime/service/src/intTest/java/org/apache/polaris/service/quarkus/it/QuarkusRestCatalogGcpIT.java`
- `runtime/service/src/intTest/java/org/apache/polaris/service/quarkus/it/relational/jdbc/JdbcRestCatalogIT.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/it/{QuarkusRestCatalogIntegrationTest.java => QuarkusRestCatalogFileIntegrationTest.java}`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/it/QuarkusRestCatalogViewAwsIntegrationTest.java`

*... and 2 more files*

---

#### 51. `9957e24` - 16 files changed

**Date:** 2025-10-08
**PR:** [#2736](https://github.com/apache/polaris/pull/2736)
**Title:** Extract IcebergCatalog.getAccessConfig to a separate class AccessConfigProvider (#2736)
**Stats:** +204 / -124

**Description:**
```
The old SupportsCredentialVending is removed in this PR upon discussion
```

**Sample files changed:**
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/common/CatalogUtils.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogAdapter.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogHandler.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/SupportsCredentialDelegation.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/io/AccessConfigProvider.java`
- `runtime/service/src/main/java/org/apache/polaris/service/context/catalog/PolarisCallContextCatalogFactory.java`
- `runtime/service/src/test/java/org/apache/polaris/service/admin/PolarisAuthzTestBase.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/generic/AbstractPolarisGenericTableCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/iceberg/AbstractIcebergCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/iceberg/AbstractIcebergCatalogViewTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogHandlerAuthzTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogHandlerFineGrainedDisabledTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/io/FileIOFactoryTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/policy/AbstractPolicyCatalogTest.java`

*... and 1 more files*

---

#### 52. `b49cbc5` - 16 files changed

**Date:** 2025-08-20
**PR:** [#2290](https://github.com/apache/polaris/pull/2290)
**Title:** Add PolarisMetaStoreManager.loadEntities (#2290)
**Stats:** +223 / -167

**Description:**
```
currently `PolarisMetaStoreManager.listEntities` only exposes a limited
subset of the underlying `BasePersistence.listEntities` functionality.
most of the callers have to post-process the `EntityNameLookupRecord` of
`ListEntitiesResult` and call `PolarisMetaStoreManager.loadEntity`
on the individual items sequentually to transform and filter them.
this is bad for the following reasons:
- suboptimal performance as we run N+1 queries to basically load every
  entity twice from the persistence b...
```

**Sample files changed:**
- `persistence/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/PolarisEclipseLinkMetaStoreSessionImpl.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/PolarisEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/AtomicOperationMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/BasePersistence.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/PolarisMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/TransactionWorkspaceMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/AbstractTransactionalPersistence.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalMetaStoreManagerImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalPersistence.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TreeMapTransactionalPersistenceImpl.java`
- `polaris-core/src/testFixtures/java/org/apache/polaris/core/persistence/BasePolarisMetaStoreManagerTest.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisAdminService.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/policy/PolicyCatalog.java`

*... and 1 more files*

---

#### 53. `83d09cc` - 16 files changed

**Date:** 2025-08-18
**PR:** [#2379](https://github.com/apache/polaris/pull/2379)
**Title:** Modularize generic table federation (#2379)
**Stats:** +187 / -30
**Sample files changed:**
- `extensions/federation/hadoop/src/main/java/org/apache/polaris/extensions/federation/hadoop/HadoopFederatedCatalogFactory.java`
- `extensions/federation/hive/src/main/java/org/apache/polaris/extensions/federation/hive/HiveFederatedCatalogFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/catalog/ExternalCatalogFactory.java`
- `{runtime/service/src/main/java/org/apache/polaris/service/catalog/generic => polaris-core/src/main/java/org/apache/polaris/core/catalog}/GenericTableCatalog.java`
- `polaris-core/src/main/java/org/apache/polaris/core/connection/ConnectionConfigInfoDpo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/connection/hive/HiveConnectionConfigInfoDpo.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/common/CatalogHandler.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/generic/GenericTableCatalogAdapter.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/generic/GenericTableCatalogHandler.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/generic/PolarisGenericTableCatalog.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogHandler.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergRESTExternalCatalogFactory.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/policy/PolicyCatalogAdapter.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/policy/PolicyCatalogHandler.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/PolarisGenericTableCatalogHandlerAuthzTest.java`

*... and 1 more files*

---

#### 54. `8a5b80a` - 16 files changed

**Date:** 2025-08-11
**PR:** [#2283](https://github.com/apache/polaris/pull/2283)
**Title:** Separate Cloud Integration Tests (#2283)
**Stats:** +116 / -112

**Description:**
```
but require cloud credentials to execute properly. This creates
unnecessary overhead for developers who just want to run local builds
or for CI jobs that don't have cloud access configured.
```

**Sample files changed:**
- `build-logic/src/main/kotlin/polaris-runtime.gradle.kts`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/{PolarisRestCatalogAwsIntegrationTest.java => PolarisRestCatalogAwsIntegrationTestBase.java}`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/{PolarisRestCatalogAzureIntegrationTest.java => PolarisRestCatalogAzureIntegrationTestBase.java}`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisRestCatalogFileIntegrationTest.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/{PolarisRestCatalogGcpIntegrationTest.java => PolarisRestCatalogGcpIntegrationTestBase.java}`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisRestCatalogIntegrationBase.java`
- `runtime/service/README.md`
- `runtime/service/build.gradle.kts`
- `runtime/service/src/{intTest => cloudTest}/java/org/apache/polaris/service/it/RestCatalogAwsIT.java`
- `runtime/service/src/{intTest => cloudTest}/java/org/apache/polaris/service/it/RestCatalogAzureIT.java`
- `runtime/service/src/{intTest => cloudTest}/java/org/apache/polaris/service/it/RestCatalogGcpIT.java`
- `runtime/service/src/{intTest => cloudTest}/java/org/apache/polaris/service/it/RestCatalogViewAwsIT.java`
- `runtime/service/src/{intTest => cloudTest}/java/org/apache/polaris/service/it/RestCatalogViewAzureIT.java`
- `runtime/service/src/{intTest => cloudTest}/java/org/apache/polaris/service/it/RestCatalogViewGcpIT.java`
- `runtime/service/src/cloudTest/resources/META-INF/services/org.apache.polaris.service.it.ext.PolarisServerManager`

*... and 1 more files*

---

#### 55. `532ee51` - 16 files changed

**Date:** 2025-08-05
**PR:** [#2235](https://github.com/apache/polaris/pull/2235)
**Title:** Remove config parameter from `PolarisStorageIntegration#getSubscopedCreds` (#2235)
**Stats:** +104 / -136

**Description:**
```
This change removes the config parameter, as it's already known when `PolarisStorageIntegration` instances are created.
```

**Sample files changed:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/AtomicOperationMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalMetaStoreManagerImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/InMemoryStorageIntegration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/PolarisStorageIntegration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/PolarisStorageIntegrationProvider.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/aws/AwsCredentialsStorageIntegration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/azure/AzureCredentialsStorageIntegration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/gcp/GcpCredentialsStorageIntegration.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/InMemoryStorageIntegrationTest.java`
- `polaris-core/src/test/java/org/apache/polaris/service/storage/aws/AwsCredentialsStorageIntegrationTest.java`
- `polaris-core/src/test/java/org/apache/polaris/service/storage/azure/AzureCredentialStorageIntegrationTest.java`
- `polaris-core/src/test/java/org/apache/polaris/service/storage/gcp/GcpCredentialsStorageIntegrationTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/AbstractIcebergCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/AbstractPolarisGenericTableCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/AbstractPolicyCatalogTest.java`

*... and 1 more files*

---

#### 56. `95358a9` - 16 files changed

**Date:** 2025-07-23
**PR:** [#2148](https://github.com/apache/polaris/pull/2148)
**Title:** Extract ResolverFactory from PolarisEntityManager (#2148)
**Stats:** +148 / -80

**Description:**
```
Note that the little left-over functionality of `PolarisEntityManager` can
be split out to more dedicated interfaces in a follow-up most likely.
```

**Sample files changed:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/PolarisEntityManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/resolver/PolarisResolutionManifest.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/resolver/ResolverFactory.java`
- `runtime/service/src/main/java/org/apache/polaris/service/quarkus/config/QuarkusProducers.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/admin/PolarisAuthzTestBase.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/AbstractIcebergCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/AbstractIcebergCatalogViewTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/AbstractPolarisGenericTableCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/AbstractPolicyCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/IcebergCatalogHandlerAuthzTest.java`
- `service/common/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`
- `service/common/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogAdapter.java`
- `service/common/src/main/java/org/apache/polaris/service/config/RealmEntityManagerFactory.java`
- `service/common/src/main/java/org/apache/polaris/service/context/catalog/PolarisCallContextCatalogFactory.java`
- `service/common/src/test/java/org/apache/polaris/service/catalog/io/FileIOFactoryTest.java`

*... and 1 more files*

---

#### 57. `b48cfb6` - 16 files changed

**Date:** 2025-07-18
**PR:** [#2122](https://github.com/apache/polaris/pull/2122)
**Title:** Add server and client support for the new generic table `baseLocation` field (#2122)
**Stats:** +128 / -40
**Sample files changed:**
- `plugins/spark/v3.5/spark/src/main/java/org/apache/polaris/spark/PolarisCatalog.java`
- `plugins/spark/v3.5/spark/src/main/java/org/apache/polaris/spark/PolarisRESTCatalog.java`
- `plugins/spark/v3.5/spark/src/main/java/org/apache/polaris/spark/PolarisSparkCatalog.java`
- `plugins/spark/v3.5/spark/src/main/java/org/apache/polaris/spark/utils/PolarisCatalogUtils.java`
- `plugins/spark/v3.5/spark/src/test/java/org/apache/polaris/spark/PolarisInMemoryCatalog.java`
- `plugins/spark/v3.5/spark/src/test/java/org/apache/polaris/spark/rest/DeserializationTest.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/table/GenericTableEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/table/IcebergTableLikeEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/table/TableLikeEntity.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/admin/PolarisAuthzTestBase.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/AbstractPolarisGenericTableCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/PolarisGenericTableCatalogHandlerAuthzTest.java`
- `service/common/src/main/java/org/apache/polaris/service/catalog/generic/GenericTableCatalog.java`
- `service/common/src/main/java/org/apache/polaris/service/catalog/generic/GenericTableCatalogAdapter.java`
- `service/common/src/main/java/org/apache/polaris/service/catalog/generic/GenericTableCatalogHandler.java`

*... and 1 more files*

---

#### 58. `e91d2c3` - 16 files changed

**Date:** 2025-06-06
**PR:** [#1823](https://github.com/apache/polaris/pull/1823)
**Title:** Downgrade open api generator to 7.11 (#1823)
**Stats:** +99 / -290
**Sample files changed:**
- `client/python/.openapi-generator/VERSION`
- `client/python/README.md`
- `client/python/docs/CatalogAPI.md`
- `client/python/docs/ConfigurationAPI.md`
- `client/python/docs/GenericTableAPI.md`
- `client/python/docs/IcebergCatalogAPI.md`
- `client/python/docs/IcebergConfigurationAPI.md`
- `client/python/docs/IcebergOAuth2API.md`
- `client/python/docs/OAuth2API.md`
- `client/python/docs/PolarisDefaultApi.md`
- `client/python/docs/PolicyAPI.md`
- `client/python/polaris/catalog/configuration.py`
- `client/python/polaris/catalog/rest.py`
- `client/python/polaris/management/configuration.py`
- `client/python/polaris/management/rest.py`

*... and 1 more files*

---

#### 59. `b1142b5` - 15 files changed

**Date:** 2025-10-03
**PR:** [#2714](https://github.com/apache/polaris/pull/2714)
**Title:** JDBC: Handle schema evolution (#2714)
**Stats:** +396 / -54
**Sample files changed:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/QueryGenerator.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/models/Converter.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/models/ModelEntity.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/AtomicMetastoreManagerWithJdbcBasePersistenceImplTest.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/AtomicMetastoreManagerWithJdbcBasePersistenceImplV0SchemaTest.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/AtomicMetastoreManagerWithJdbcBasePersistenceImplV1SchemaTest.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/AtomicMetastoreManagerWithJdbcBasePersistenceImplV2SchemaTest.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/AtomicMetastoreManagerWithJdbcBasePersistenceImplV3SchemaTest.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/DatasourceOperationsTest.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/QueryGeneratorTest.java`
- `persistence/relational-jdbc/src/test/resources/h2/schema-v0.sql`
- `polaris-core/src/main/java/org/apache/polaris/core/config/FeatureConfiguration.java`
- `polaris-core/src/testFixtures/java/org/apache/polaris/core/persistence/BasePolarisMetaStoreManagerTest.java`
- `runtime/service/src/main/java/org/apache/polaris/service/config/ProductionReadinessChecks.java`

---

#### 60. `8ad8f74` - 15 files changed

**Date:** 2025-09-11
**PR:** [#2492](https://github.com/apache/polaris/pull/2492)
**Title:** Add subtype-check to PolarisEntity subclass ctors (#2492)
**Stats:** +84 / -23
**Sample files changed:**
- `polaris-core/src/main/java/org/apache/polaris/core/entity/CatalogEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/CatalogRoleEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/NamespaceEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/PrincipalEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/PrincipalRoleEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/TaskEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/table/GenericTableEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/table/IcebergTableLikeEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/policy/PolicyEntity.java`
- `polaris-core/src/test/java/org/apache/polaris/core/persistence/cache/EntityWeigherTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/persistence/cache/InMemoryEntityCacheTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/policy/PolicyValidatorsTest.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/generic/PolarisGenericTableCatalog.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`
- `runtime/service/src/test/java/org/apache/polaris/service/task/TableCleanupTaskHandlerTest.java`

---

#### 61. `d7d8990` - 15 files changed

**Date:** 2025-08-13
**PR:** [#2329](https://github.com/apache/polaris/pull/2329)
**Title:** Make S3 `roleARN` optional (#2329)
**Stats:** +122 / -140
**Sample files changed:**
- `CHANGELOG.md`
- `api/management-model/src/test/java/org/apache/polaris/core/admin/model/CatalogSerializationTest.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisManagementServiceIntegrationTest.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisPolicyServiceIntegrationTest.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/CatalogEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/aws/AwsCredentialsStorageIntegration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/aws/AwsStorageConfigurationInfo.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/InMemoryStorageIntegrationTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/aws/AwsStorageConfigurationInfoTest.java`
- `polaris-core/src/test/java/org/apache/polaris/service/storage/PolarisStorageConfigurationInfoTest.java`
- `runtime/service/src/intTest/java/org/apache/polaris/service/it/PolarisRestCatalogMinIOIT.java`
- `runtime/service/src/intTest/java/org/apache/polaris/service/it/RestCatalogMinIOSpecialIT.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisAdminService.java`
- `runtime/service/src/test/java/org/apache/polaris/service/entity/CatalogEntityTest.java`
- `spec/polaris-management-service.yml`

---

#### 62. `e46f8c6` - 15 files changed

**Date:** 2025-07-28
**PR:** [#2174](https://github.com/apache/polaris/pull/2174)
**Title:** Add Principal lookup helpers to PolarisMetaStoreManager (#2174)
**Stats:** +115 / -210

**Description:**
```
- add `PolarisMetaStoreManager.findRootPrincipal`
- add `PolarisMetaStoreManager.findPrincipalByName`
- add `PolarisMetaStoreManager.findPrincipalRoleByName`
also we now prefer `PolarisEntityConstants` where applicable
```

**Sample files changed:**
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/ManagementApi.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisManagementServiceIntegrationTest.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcMetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/PolarisEntityManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/PolarisMetaStoreManager.java`
- `polaris-core/src/testFixtures/java/org/apache/polaris/core/persistence/BaseResolverTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/admin/ManagementServiceTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/admin/PolarisAuthzTestBase.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/AbstractIcebergCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/AbstractIcebergCatalogViewTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/AbstractPolarisGenericTableCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/AbstractPolicyCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/test/PolarisIntegrationTestFixture.java`
- `service/common/src/main/java/org/apache/polaris/service/auth/DefaultAuthenticator.java`

---

#### 63. `2c2052c` - 15 files changed

**Date:** 2025-07-15
**PR:** [#2022](https://github.com/apache/polaris/pull/2022)
**Title:** Use application-scoped StorageCredentialCache (#2022)
**Stats:** +118 / -57
**Sample files changed:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcMetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/MetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/cache/StorageCredentialCache.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/cache/StorageCredentialCacheConfig.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/cache/StorageCredentialCacheTest.java`
- `runtime/service/src/main/java/org/apache/polaris/service/quarkus/config/QuarkusProducers.java`
- `runtime/service/src/main/java/org/apache/polaris/service/quarkus/storage/QuarkusStorageCredentialCacheConfig.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/IcebergCatalogHandlerAuthzTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/IcebergCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/IcebergCatalogViewTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/PolarisGenericTableCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/PolicyCatalogTest.java`
- `service/common/src/main/java/org/apache/polaris/service/config/RealmEntityManagerFactory.java`
- `service/common/src/testFixtures/java/org/apache/polaris/service/TestServices.java`

---

#### 64. `511df8c` - 15 files changed

**Date:** 2025-06-04
**PR:** [#1812](https://github.com/apache/polaris/pull/1812)
**Title:** Remove CallContext.of (#1812)
**Stats:** +71 / -110
**Sample files changed:**
- `polaris-core/src/main/java/org/apache/polaris/core/context/CallContext.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/InMemoryStorageIntegrationTest.java`
- `polaris-core/src/testFixtures/java/org/apache/polaris/core/persistence/BasePolarisMetaStoreManagerTest.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/admin/ManagementServiceTest.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/admin/PolarisAuthzTestBase.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/catalog/IcebergCatalogTest.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/catalog/IcebergCatalogViewTest.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/catalog/PolarisGenericTableCatalogTest.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/catalog/PolicyCatalogTest.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/entity/CatalogEntityTest.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/task/BatchFileCleanupTaskHandlerTest.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/task/ManifestFileCleanupTaskHandlerTest.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/task/TableCleanupTaskHandlerTest.java`
- `service/common/src/test/java/org/apache/polaris/service/auth/DefaultAuthenticatorTest.java`
- `service/common/src/test/java/org/apache/polaris/service/task/TaskExecutorImplTest.java`

---

#### 65. `453e9fb` - 14 files changed

**Date:** 2025-09-04
**PR:** [#2422](https://github.com/apache/polaris/pull/2422)
**Title:** Disable custom namespace locations (#2422)
**Stats:** +216 / -17

**Description:**
```
Fixes: #2417
```

**Sample files changed:**
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisApplicationIntegrationTest.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisRestCatalogIntegrationBase.java`
- `plugins/spark/v3.5/integration/src/intTest/java/org/apache/polaris/spark/quarkus/it/SparkIntegrationBase.java`
- `polaris-core/src/main/java/org/apache/polaris/core/config/BehaviorChangeConfiguration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/config/PolarisConfiguration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/StorageLocation.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/aws/S3Location.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/azure/AzureLocation.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/aws/S3LocationTest.java`
- `regtests/t_cli/src/test_cli.py`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`
- `runtime/service/src/test/java/org/apache/polaris/service/admin/PolarisAuthzTestBase.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/iceberg/AbstractIcebergCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/it/RestCatalogFileIntegrationTest.java`

---

#### 66. `3bc92b4` - 14 files changed

**Date:** 2025-08-28
**PR:** [#2469](https://github.com/apache/polaris/pull/2469)
**Title:** Service: Move tests to the right package (#2469)
**Stats:** +23 / -23
**Sample files changed:**
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/{ => generic}/AbstractPolarisGenericTableCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/{ => generic}/PolarisGenericTableCatalogHandlerAuthzTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/{ => generic}/PolarisGenericTableCatalogRelationalTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/{ => iceberg}/AbstractIcebergCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/{ => iceberg}/AbstractIcebergCatalogViewTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/{ => iceberg}/GetConfigTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/{ => iceberg}/IcebergCatalogHandlerAuthzTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/{ => iceberg}/IcebergCatalogRelationalNoEntityCacheTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/{ => iceberg}/IcebergCatalogRelationalWithEntityCacheTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/{admin/PolarisOverlappingTableTest.java => catalog/iceberg/IcebergOverlappingTableTest.java}`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/{ => iceberg}/IcebergViewCatalogRelationalTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/{ => policy}/AbstractPolicyCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/{ => policy}/PolicyCatalogHandlerAuthzTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/{ => policy}/PolicyCatalogRelationalTest.java`

---

#### 67. `95ebdd3` - 14 files changed

**Date:** 2025-08-28
**PR:** [#2456](https://github.com/apache/polaris/pull/2456)
**Title:** Remove commons-lang3 dependency (#2456)
**Stats:** +24 / -29

**Description:**
```
also stop using `org.assertj.core.util` as its a non-public api.
```

**Sample files changed:**
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisRestCatalogViewAwsIntegrationTest.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisRestCatalogViewAzureIntegrationTest.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisRestCatalogViewGcpIntegrationTest.java`
- `polaris-core/build.gradle.kts`
- `polaris-core/src/test/java/org/apache/polaris/service/storage/azure/AzureCredentialStorageIntegrationTest.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisAdminService.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/DefaultActiveRolesProvider.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/DefaultAuthenticator.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/JWTBroker.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/io/ExceptionMappingFileIO.java`
- `runtime/service/src/main/java/org/apache/polaris/service/exception/IcebergExceptionMapper.java`
- `runtime/service/src/main/java/org/apache/polaris/service/task/TaskFileIOSupplier.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogAdapterTest.java`

---

#### 68. `9c455ed` - 14 files changed

**Date:** 2025-08-20
**PR:** [#2192](https://github.com/apache/polaris/pull/2192)
**Title:** Python client auto generate (#2192)
**Stats:** +289 / -253

**Description:**
```
* Python client auto generate
* Python client auto generate
* Python client auto generate
* Python client auto generate
* Python client auto generate
* Remove auto generated doc
* undo
* Fix doc
* Fix docker ref from CONTAINER_TOOL to DOCKER
* Add client help manual to GH action
```

**Sample files changed:**
- `.github/workflows/python-client.yml`
- `.github/workflows/regtest.yml`
- `.github/workflows/spark_client_regtests.yml`
- `Makefile`
- `build.gradle.kts`
- `client/python/.openapi-generator-ignore`
- `client/python/generate_clients.py`
- `client/python/pyproject.toml`
- `client/templates/regenerate.sh`
- `getting-started/spark/launch-docker.sh`
- `polaris`
- `regtests/Dockerfile`
- `regtests/run.sh`
- `spec/README.md`

---

#### 69. `e1b9833` - 14 files changed

**Date:** 2025-08-19
**PR:** [#2337](https://github.com/apache/polaris/pull/2337)
**Title:** Reduce getRealmConfig calls (#2337)
**Stats:** +78 / -104

**Description:**
```
The idea is that long term we would want to stop relying on the `CallContext` itself but instead inject its individual items. Thus we also add `RealmConfig` to `TestServices`.
```

**Sample files changed:**
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisAdminService.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisServiceImpl.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/common/CatalogHandler.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/generic/GenericTableCatalogAdapter.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogHandler.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/policy/PolicyCatalogAdapter.java`
- `runtime/service/src/test/java/org/apache/polaris/service/admin/ManagementServiceTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/admin/PolarisAuthzTestBase.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/AbstractIcebergCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/AbstractIcebergCatalogViewTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/AbstractPolarisGenericTableCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/AbstractPolicyCatalogTest.java`
- `runtime/service/src/testFixtures/java/org/apache/polaris/service/TestServices.java`

---

#### 70. `4117551` - 13 files changed

**Date:** 2025-10-07
**PR:** [#2697](https://github.com/apache/polaris/pull/2697)
**Title:** Implement Finer Grained Operations and Privileges For Update Table (#2697)
**Stats:** +1683 / -46

**Description:**
```
The idea is that all the existing privileges and operations will work and continue to work even after this change. (i.e. TABLE_WRITE_PROPERTIES will still ensure update table is authorized even after these changes).
However, because Polaris will now be able to identify each operation within an UpdateTable request and has a privilege model with inheritance that maps to each operation, users will now have the option of restricting permissions at a finer level if desired.
```

**Sample files changed:**
- `polaris-core/src/main/java/org/apache/polaris/core/auth/PolarisAuthorizableOperation.java`
- `polaris-core/src/main/java/org/apache/polaris/core/auth/PolarisAuthorizerImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/config/FeatureConfiguration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/PolarisPrivilege.java`
- `polaris-core/src/test/java/org/apache/polaris/core/entity/PolarisPrivilegeTest.java`
- `regtests/t_pyspark/src/conftest.py`
- `regtests/t_pyspark/src/iceberg_spark.py`
- `regtests/t_pyspark/src/test_spark_sql_fine_grained_authz.py`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/common/CatalogHandler.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogHandler.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogHandlerAuthzTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogHandlerFineGrainedDisabledTest.java`
- `spec/polaris-management-service.yml`

---

#### 71. `ac31963` - 13 files changed

**Date:** 2025-09-02
**PR:** [#2302](https://github.com/apache/polaris/pull/2302)
**Title:** Add type-check to PolarisEntity subclass ctors (#2302)
**Stats:** +57 / -20

**Description:**
```
specific type via their constructors.
this can lead to subtle bugs like we fixed in
a29f8006fe9d259df755d02ec6386c2bd6932610
by adding type checks we discover a few more places where we need to be
more careful about how we construct new or handle existing entities.
note that we can add a check for `PolarisEntitySubType` in a followup,
but it requires more fixes currently.
```

**Sample files changed:**
- `polaris-core/src/main/java/org/apache/polaris/core/entity/CatalogEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/CatalogRoleEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/NamespaceEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/PolarisEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/PrincipalEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/PrincipalRoleEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/TaskEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/table/GenericTableEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/table/IcebergTableLikeEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/table/TableLikeEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/policy/PolicyEntity.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogHandler.java`

---

#### 72. `355adae` - 13 files changed

**Date:** 2025-08-05
**PR:** [#2236](https://github.com/apache/polaris/pull/2236)
**Title:** Make `*StorageConfigurationInfo` types immutable (#2236)
**Stats:** +395 / -382
**Sample files changed:**
- `polaris-core/src/main/java/org/apache/polaris/core/entity/CatalogEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/FileStorageConfigurationInfo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/PolarisStorageConfigurationInfo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/StorageConfigurationOverride.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/aws/AwsStorageConfigurationInfo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/azure/AzureStorageConfigurationInfo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/gcp/GcpStorageConfigurationInfo.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/InMemoryStorageIntegrationTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/aws/AwsStorageConfigurationInfoTest.java`
- `polaris-core/src/test/java/org/apache/polaris/service/storage/PolarisStorageConfigurationInfoTest.java`
- `polaris-core/src/test/java/org/apache/polaris/service/storage/aws/AwsCredentialsStorageIntegrationTest.java`
- `polaris-core/src/test/java/org/apache/polaris/service/storage/azure/AzureCredentialStorageIntegrationTest.java`
- `polaris-core/src/test/java/org/apache/polaris/service/storage/gcp/GcpCredentialsStorageIntegrationTest.java`

---

#### 73. `eefe572` - 13 files changed

**Date:** 2025-07-31
**PR:** [#2045](https://github.com/apache/polaris/pull/2045)
**Title:** Remove postgres_latest as image tag (#2045)
**Stats:** +7 / -13

**Description:**
```
* Change image tag to latest for getting started examples
* Change image tag to latest from helm
```

**Sample files changed:**
- `getting-started/assets/cloud_providers/deploy-aws.sh`
- `getting-started/assets/cloud_providers/deploy-azure.sh`
- `getting-started/assets/cloud_providers/deploy-gcp.sh`
- `getting-started/eclipselink/README.md`
- `getting-started/eclipselink/docker-compose-bootstrap-db.yml`
- `getting-started/eclipselink/docker-compose.yml`
- `getting-started/jdbc/README.md`
- `getting-started/jdbc/docker-compose-bootstrap-db.yml`
- `getting-started/jdbc/docker-compose.yml`
- `helm/polaris/README.md`
- `helm/polaris/values.yaml`
- `site/content/in-dev/unreleased/getting-started/quickstart.md`
- `site/content/in-dev/unreleased/helm.md`

---

#### 74. `cd59302` - 13 files changed

**Date:** 2025-06-21
**PR:** [#1905](https://github.com/apache/polaris/pull/1905)
**Title:** fix: unify bootstrap credentials and standardize POLARIS setup (#1905)
**Stats:** +20 / -20

**Description:**
```
- reverted secret to s3cr3t
- updated docker-compose, README, conftest.py
use POLARIS for consistency across docker, gradle and others.
```

**Sample files changed:**
- `README.md`
- `client/python/docker-compose.yml`
- `client/python/integration_tests/conftest.py`
- `getting-started/spark/docker-compose.yml`
- `getting-started/spark/notebooks/SparkPolaris.ipynb`
- `plugins/spark/v3.5/getting-started/docker-compose.yml`
- `plugins/spark/v3.5/getting-started/notebooks/SparkPolaris.ipynb`
- `plugins/spark/v3.5/regtests/docker-compose.yml`
- `plugins/spark/v3.5/regtests/run.sh`
- `regtests/docker-compose.yml`
- `regtests/run.sh`
- `regtests/run_spark_sql.sh`
- `runtime/server/build.gradle.kts`

---

#### 75. `0faf948` - 13 files changed

**Date:** 2025-06-12
**PR:** [#1831](https://github.com/apache/polaris/pull/1831)
**Title:** Removing star import and adding errorprone rule (#1831)
**Stats:** +47 / -12
**Sample files changed:**
- `codestyle/errorprone-rules.properties`
- `persistence/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/PolarisSequenceUtil.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/QueryGenerator.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/QueryGeneratorTest.java`
- `plugins/spark/v3.5/integration/src/intTest/java/org/apache/polaris/spark/quarkus/it/SparkCatalogBaseIT.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalMetaStoreManagerImpl.java`
- `quarkus/service/src/main/java/org/apache/polaris/service/quarkus/storage/QuarkusStorageConfiguration.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/catalog/AccessDelegationModeTest.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/catalog/GetConfigTest.java`
- `service/common/src/main/java/org/apache/polaris/service/storage/StorageConfiguration.java`
- `service/common/src/test/java/org/apache/polaris/service/catalog/io/FileIOFactoryTest.java`
- `service/common/src/test/java/org/apache/polaris/service/storage/StorageConfigurationTest.java`
- `tools/misc-types/src/main/java/org/apache/polaris/misc/types/memorysize/MemorySize.java`

---

#### 76. `f393a1d` - 13 files changed

**Date:** 2025-06-06
**PR:** [#1802](https://github.com/apache/polaris/pull/1802)
**Title:** JDBC: Use PreparedStatement (#1802)
**Stats:** +620 / -374
**Sample files changed:**
- `persistence/relational-jdbc/build.gradle.kts`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/DatasourceOperations.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcMetaStoreManagerFactory.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/QueryGenerator.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/models/Converter.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/models/ModelEntity.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/models/ModelGrantRecord.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/models/ModelPolicyMappingRecord.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/models/ModelPrincipalAuthenticationData.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/AtomicMetastoreManagerWithJdbcBasePersistenceImplTest.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/DatasourceOperationsTest.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/QueryGeneratorTest.java`

---

#### 77. `a534193` - 13 files changed

**Date:** 2025-05-22
**PR:** [#1628](https://github.com/apache/polaris/pull/1628)
**Title:** [Policy Store] Add policyTypeCode to Slice/Index for Future Filtering Support and Update Policy Persistence Method (#1628)
**Stats:** +131 / -60

**Description:**
```
It also updates the loadAllTargetsOnPolicy method to accept policyTypeCode, enabling it to use the new index for better performance.
```

**Sample files changed:**
- `extension/persistence/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/PolarisEclipseLinkMetaStoreSessionImpl.java`
- `extension/persistence/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/PolarisEclipseLinkStore.java`
- `extension/persistence/jpa-model/src/main/java/org/apache/polaris/jpa/models/ModelPolicyMappingRecord.java`
- `extension/persistence/relational-jdbc/src/main/java/org/apache/polaris/extension/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`
- `extension/persistence/relational-jdbc/src/main/java/org/apache/polaris/extension/persistence/relational/jdbc/QueryGenerator.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/AtomicOperationMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/AbstractTransactionalPersistence.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalMetaStoreManagerImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TreeMapMetaStore.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TreeMapTransactionalPersistenceImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/policy/PolicyMappingPersistence.java`
- `polaris-core/src/main/java/org/apache/polaris/core/policy/TransactionalPolicyMappingPersistence.java`
- `polaris-core/src/testFixtures/java/org/apache/polaris/core/persistence/PolarisTestMetaStoreManager.java`

---

#### 78. `413e293` - 12 files changed

**Date:** 2025-10-07
**PR:** [#2762](https://github.com/apache/polaris/pull/2762)
**Title:** JDBC: Fix Bootstrap with schema options (#2762)
**Stats:** +364 / -77
**Sample files changed:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/DatabaseType.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/DatasourceOperations.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBootstrapUtils.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcMetaStoreManagerFactory.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/QueryGenerator.java`
- `persistence/relational-jdbc/src/main/resources/h2/schema-v3.sql`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/JdbcBootstrapUtilsTest.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/bootstrap/SchemaOptions.java`
- `runtime/admin/src/main/java/org/apache/polaris/admintool/BootstrapCommand.java`
- `runtime/admin/src/test/java/org/apache/polaris/admintool/BootstrapCommandTestBase.java`
- `runtime/admin/src/test/java/org/apache/polaris/admintool/relational/jdbc/RelationalJdbcBootstrapCommandTest.java`

---

#### 79. `2cfa41b` - 12 files changed

**Date:** 2025-09-29
**PR:** [#2695](https://github.com/apache/polaris/pull/2695)
**Title:** Docs/improve idp documentation (#2695)
**Stats:** +231 / -123

**Description:**
```
* Separate IDP docs for usage and development
* - Add telemetry config example
- Fix link to getting started from landing page
- Fix mentioning role-arn as required
* Fix some relative links (local Hugo resolves them properly, but PR auto checks still fails)
* Docs: narrow down --role-arn usage for AWS S3 only; fix a link in keycloak guide.
* Docs: fix a link in keycloak guide.
```

**Sample files changed:**
- `client/python/cli/command/__init__.py`
- `client/python/cli/constants.py`
- `site/content/_index.adoc`
- `site/content/in-dev/unreleased/command-line-interface.md`
- `site/content/in-dev/unreleased/getting-started/creating-a-catalog/s3/_index.md`
- `site/content/in-dev/unreleased/getting-started/{using-polaris.md => using-polaris/_index.md}`
- `site/content/in-dev/unreleased/{managing-security/external-idp => getting-started/using-polaris}/keycloak-idp.md`
- `site/content/in-dev/unreleased/getting-started/using-polaris/telemetry-tools.md`
- `site/content/in-dev/unreleased/managing-security/_index.md`
- `site/content/in-dev/unreleased/managing-security/external-idp/_index.md`
- `site/content/in-dev/unreleased/managing-security/external-idp/idp-dev-notes.md`
- `site/content/in-dev/unreleased/telemetry.md`

---

#### 80. `19742cc` - 12 files changed

**Date:** 2025-09-26
**PR:** [#2629](https://github.com/apache/polaris/pull/2629)
**Title:** Fix & enhancements to the Events API hierarchy (#2629)
**Stats:** +1247 / -457

**Description:**
```
- Turned `PolarisEventListener` into an interface to facilitate implementation / mocking
- Added missing `implements PolarisEvent` to many event records
- Removed unused method overrides
- Added missing method overrides to `TestPolarisEventListener`
```

**Sample files changed:**
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisCatalogsEventServiceDelegator.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/CatalogGenericTableServiceEvents.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/CatalogPolicyServiceEvents.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/CatalogsServiceEvents.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/IcebergRestCatalogEvents.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/jsonEventListener/PropertyMapEventListener.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/listeners/NoOpPolarisEventListener.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/listeners/PolarisEventListener.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/listeners/PolarisPersistenceEventListener.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/listeners/TestPolarisEventListener.java`
- `runtime/service/src/test/java/org/apache/polaris/service/events/listeners/PolarisEventListenerTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/events/listeners/TestPolarisEventListenerTest.java`

---

#### 81. `88f58fc` - 12 files changed

**Date:** 2025-08-15
**PR:** [#2340](https://github.com/apache/polaris/pull/2340)
**Title:** Make PolarisAuthorizer RequestScoped (#2340)
**Stats:** +21 / -45

**Description:**
```
parameter.
in its only implementation only `CallContext.getRealmConfig` is getting
used.
so since `PolarisAuthorizer` cant be used outside a request, we can
simply make it request-scoped and inject the request-scoped `RealmConfig`
directly.
```

**Sample files changed:**
- `polaris-core/src/main/java/org/apache/polaris/core/auth/PolarisAuthorizer.java`
- `polaris-core/src/main/java/org/apache/polaris/core/auth/PolarisAuthorizerImpl.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisAdminService.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/common/CatalogHandler.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/policy/PolicyCatalogHandler.java`
- `runtime/service/src/main/java/org/apache/polaris/service/config/ServiceProducers.java`
- `runtime/service/src/test/java/org/apache/polaris/service/admin/ManagementServiceTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/admin/PolarisAuthzTestBase.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/AbstractIcebergCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/AbstractIcebergCatalogViewTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/AbstractPolarisGenericTableCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/AbstractPolicyCatalogTest.java`

---

#### 82. `7774613` - 12 files changed

**Date:** 2025-08-05
**PR:** [#2234](https://github.com/apache/polaris/pull/2234)
**Title:** Only pass `RealmConfig` to `PolarisStorageIntegration` (#2234)
**Stats:** +32 / -40
**Sample files changed:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/AtomicOperationMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalMetaStoreManagerImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/PolarisStorageIntegration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/aws/AwsCredentialsStorageIntegration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/azure/AzureCredentialsStorageIntegration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/gcp/GcpCredentialsStorageIntegration.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/BaseStorageIntegrationTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/InMemoryStorageIntegrationTest.java`
- `polaris-core/src/test/java/org/apache/polaris/service/storage/aws/AwsCredentialsStorageIntegrationTest.java`
- `polaris-core/src/test/java/org/apache/polaris/service/storage/azure/AzureCredentialStorageIntegrationTest.java`
- `polaris-core/src/test/java/org/apache/polaris/service/storage/gcp/GcpCredentialsStorageIntegrationTest.java`
- `service/common/src/main/java/org/apache/polaris/service/storage/PolarisStorageIntegrationProviderImpl.java`

---

#### 83. `46a2a03` - 12 files changed

**Date:** 2025-07-17
**PR:** [#2104](https://github.com/apache/polaris/pull/2104)
**Title:** feat(helm): Add support for external authentication (#2104)
**Stats:** +527 / -67
**Sample files changed:**
- `CHANGELOG.md`
- `helm/polaris/README.md`
- `helm/polaris/ci/authentication-values.yaml`
- `helm/polaris/ci/fixtures/oidc.yaml`
- `helm/polaris/ci/fixtures/token-broker.yaml`
- `helm/polaris/templates/_helpers.tpl`
- `helm/polaris/templates/configmap.yaml`
- `helm/polaris/templates/deployment.yaml`
- `helm/polaris/tests/configmap_test.yaml`
- `helm/polaris/tests/deployment_test.yaml`
- `helm/polaris/values.yaml`
- `site/content/in-dev/unreleased/helm.md`

---

#### 84. `bd83252` - 12 files changed

**Date:** 2025-07-08
**PR:** [#1966](https://github.com/apache/polaris/pull/1966)
**Title:** Introduce an option to add object storage prefix to table locations (#1966)
**Stats:** +589 / -62

**Description:**
```
Currently, Polaris enforces that the physical layout of entities maps to the logical layout:
```
catalog
└── ns1
    ├── ns2
    │   └── table_b
    └── table_a
```
In the above example, the base locations of `table_a` and `ns2` are expected to be children of `ns1`, and the location of `table_b` is expected to be a child of `ns2`.
This behavior is controlled by `ALLOW_UNSTRUCTURED_TABLE_LOCATION` and is the basis for the sibling overlap check when `OPTIMIZED_SIBLING_CHECK` is disabled or pers...
```

**Sample files changed:**
- `CHANGELOG.md`
- `LICENSE`
- `polaris-core/src/main/java/org/apache/polaris/core/config/FeatureConfiguration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalMetaStoreManagerImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TreeMapMetaStore.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TreeMapTransactionalPersistenceImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/PolarisStorageConfigurationInfo.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/admin/PolarisOverlappingTableTest.java`
- `service/common/src/main/java/org/apache/polaris/service/catalog/common/LocationUtils.java`
- `service/common/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`
- `service/common/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogHandler.java`
- `service/common/src/test/java/org/apache/polaris/service/catalog/common/LocationUtilsTest.java`

---

#### 85. `8784135` - 12 files changed

**Date:** 2025-06-27
**PR:** [#1954](https://github.com/apache/polaris/pull/1954)
**Title:** Python code format (#1954)
**Stats:** +1212 / -575
**Sample files changed:**
- `client/python/cli/command/__init__.py`
- `client/python/cli/command/catalog_roles.py`
- `client/python/cli/command/catalogs.py`
- `client/python/cli/command/namespaces.py`
- `client/python/cli/command/principal_roles.py`
- `client/python/cli/command/principals.py`
- `client/python/cli/command/privileges.py`
- `client/python/cli/command/profiles.py`
- `client/python/cli/constants.py`
- `client/python/cli/options/option_tree.py`
- `client/python/cli/options/parser.py`
- `client/python/cli/polaris_cli.py`

---

#### 86. `9b5325b` - 12 files changed

**Date:** 2025-06-24
**PR:** [#1918](https://github.com/apache/polaris/pull/1918)
**Title:** Testing: admin-tool testing workaround (#1918)
**Stats:** +109 / -15
**Sample files changed:**
- `runtime/admin/build.gradle.kts`
- `runtime/admin/src/main/resources/application.properties`
- `runtime/admin/src/test/java/org/apache/polaris/admintool/el/EclipselinkProfile.java`
- `runtime/admin/src/test/java/org/apache/polaris/admintool/relational/jdbc/RelationalJdbcAdminProfile.java`
- `runtime/admin/src/testFixtures/java/org/apache/polaris/admintool/{PostgresTestResourceLifecycleManager.java => PostgresEclipselinkTestResourceLifecycleManager.java}`
- `runtime/admin/src/testFixtures/resources/org/apache/polaris/admintool/Dockerfile-postgres-version`
- `runtime/defaults/src/main/resources/application-test.properties`
- `runtime/service/build.gradle.kts`
- `runtime/service/src/test/resources/logback-test.xml`
- `runtime/test-common/build.gradle.kts`
- `runtime/test-common/src/main/java/org/apache/polaris/test/commons/PostgresRelationalJdbcLifeCycleManagement.java`
- `runtime/test-common/src/main/resources/org/apache/polaris/test/commons/Dockerfile-postgres-version`

---

#### 87. `0a9a5d9` - 12 files changed

**Date:** 2025-06-03
**PR:** [#1776](https://github.com/apache/polaris/pull/1776)
**Title:** feat(cdi): Remove CallContext.close() (#1776)
**Stats:** +470 / -607

**Description:**
```
This simplification will hopefully pave the way to a more robust handling of request-scoped beans in task executor threads.
```

**Sample files changed:**
- `polaris-core/src/main/java/org/apache/polaris/core/context/CallContext.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/InMemoryStorageIntegrationTest.java`
- `polaris-core/src/testFixtures/java/org/apache/polaris/core/persistence/BasePolarisMetaStoreManagerTest.java`
- `quarkus/service/src/main/java/org/apache/polaris/service/quarkus/config/QuarkusProducers.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/auth/JWTSymmetricKeyGeneratorTest.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/task/BatchFileCleanupTaskHandlerTest.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/task/ManifestFileCleanupTaskHandlerTest.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/test/PolarisIntegrationTestFixture.java`
- `service/common/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`
- `service/common/src/main/java/org/apache/polaris/service/context/catalog/PolarisCallContextCatalogFactory.java`
- `service/common/src/test/java/org/apache/polaris/service/catalog/io/FileIOFactoryTest.java`
- `service/common/src/testFixtures/java/org/apache/polaris/service/TestServices.java`

---

#### 88. `ff0b754` - 11 files changed

**Date:** 2025-10-07
**PR:** [#2753](https://github.com/apache/polaris/pull/2753)
**Title:** Site: Add puppygraph integration (#2753)
**Stats:** +384 / -0
**Sample files changed:**
- `site/content/blog/2025/10/02/puppygraph-polaris-integration.md`
- `site/static/img/blog/2025/10/02/fig1-what-is-apache-polaris.png`
- `site/static/img/blog/2025/10/02/fig10-puppygraph-sample-query.png`
- `site/static/img/blog/2025/10/02/fig2-cross-engine-rw.png`
- `site/static/img/blog/2025/10/02/fig3-apache-polaris-puppygraph-architecture.png`
- `site/static/img/blog/2025/10/02/fig4-puppygraph-login-page.png`
- `site/static/img/blog/2025/10/02/fig5-puppygraph-schema-upload-page.png`
- `site/static/img/blog/2025/10/02/fig6-puppygraph-schema-builder-ui.png`
- `site/static/img/blog/2025/10/02/fig7-puppygraph-add-vertex.png`
- `site/static/img/blog/2025/10/02/fig8-puppygraph-auto-suggestion.png`
- `site/static/img/blog/2025/10/02/fig9-finished-schema.png`

---

#### 89. `80f0456` - 11 files changed

**Date:** 2025-09-30
**PR:** [#2518](https://github.com/apache/polaris/pull/2518)
**Title:** Use PrincipalEntity in PolarisMetaStoreManager.createPrincipal (#2518)
**Stats:** +77 / -163

**Description:**
```
if we pass and return a more specific `PrincipalEntity` we can simplify
the surrounding code and implementation
```

**Sample files changed:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcMetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/AtomicOperationMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/PolarisMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/TransactionWorkspaceMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/dao/entity/CreatePrincipalResult.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalMetaStoreManagerImpl.java`
- `polaris-core/src/testFixtures/java/org/apache/polaris/core/persistence/PolarisTestMetaStoreManager.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisAdminService.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogHandlerAuthzTest.java`
- `runtime/service/src/testFixtures/java/org/apache/polaris/service/TestServices.java`

---

#### 90. `553cb06` - 11 files changed

**Date:** 2025-09-19
**PR:** [#2482](https://github.com/apache/polaris/pull/2482)
**Title:** Service: Add Events for PolarisServiceImpl APIs (#2482)
**Stats:** +801 / -66
**Sample files changed:**
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisCatalogsEventServiceDelegator.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisPrincipalRolesEventServiceDelegator.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisPrincipalsEventServiceDelegator.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisServiceImpl.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/CatalogsServiceEvents.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/PrincipalRolesServiceEvents.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/PrincipalsServiceEvents.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/listeners/PolarisEventListener.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/listeners/PolarisPersistenceEventListener.java`
- `runtime/service/src/test/java/org/apache/polaris/service/admin/PolarisServiceImplTest.java`
- `runtime/service/src/testFixtures/java/org/apache/polaris/service/TestServices.java`

---

#### 91. `fcd4777` - 11 files changed

**Date:** 2025-08-20
**PR:** [#2372](https://github.com/apache/polaris/pull/2372)
**Title:** Add PolarisDiagnostics field to AbstractTransactionalPersistence (#2372)
**Stats:** +61 / -48
**Sample files changed:**
- `persistence/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/EclipseLinkPolarisMetaStoreManagerFactory.java`
- `persistence/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/PolarisEclipseLinkMetaStoreSessionImpl.java`
- `persistence/eclipselink/src/test/java/org/apache/polaris/extension/persistence/impl/eclipselink/PolarisEclipseLinkMetaStoreManagerTest.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/AbstractTransactionalPersistence.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TreeMapTransactionalPersistenceImpl.java`
- `polaris-core/src/test/java/org/apache/polaris/core/persistence/PolarisTreeMapAtomicOperationMetaStoreManagerTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/persistence/PolarisTreeMapMetaStoreManagerTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/persistence/ResolverTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/persistence/cache/InMemoryEntityCacheTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/cache/StorageCredentialCacheTest.java`
- `runtime/service/src/main/java/org/apache/polaris/service/persistence/InMemoryPolarisMetaStoreManagerFactory.java`

---

#### 92. `c165249` - 11 files changed

**Date:** 2025-08-15
**PR:** [#2336](https://github.com/apache/polaris/pull/2336)
**Title:** Replace CallContext with RealmConfig in CatalogEntity (#2336)
**Stats:** +61 / -68
**Sample files changed:**
- `polaris-core/src/main/java/org/apache/polaris/core/entity/CatalogEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/PolarisStorageConfigurationInfo.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisAdminService.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`
- `runtime/service/src/test/java/org/apache/polaris/service/admin/PolarisAuthzTestBase.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/AbstractIcebergCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/AbstractIcebergCatalogViewTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/AbstractPolarisGenericTableCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/AbstractPolicyCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/IcebergCatalogHandlerAuthzTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/entity/CatalogEntityTest.java`

---

#### 93. `b2b1453` - 11 files changed

**Date:** 2025-08-14
**PR:** [#2332](https://github.com/apache/polaris/pull/2332)
**Title:** Modularize federation (Option 2) (#2332)
**Stats:** +303 / -52

**Description:**
```
* Move polaris-extensions-federation-hadoop dependency
* Change identifier to lowerCase
* Change identifiers to constants
```

**Sample files changed:**
- `extensions/federation/hadoop/build.gradle.kts`
- `extensions/federation/hadoop/src/main/java/org/apache/polaris/extensions/federation/hadoop/HadoopFederatedCatalogFactory.java`
- `gradle/projects.main.properties`
- `polaris-core/src/main/java/org/apache/polaris/core/catalog/ExternalCatalogFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/connection/ConnectionType.java`
- `runtime/server/build.gradle.kts`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogAdapter.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogHandler.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergRESTExternalCatalogFactory.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/IcebergCatalogHandlerAuthzTest.java`
- `runtime/service/src/testFixtures/java/org/apache/polaris/service/TestServices.java`

---

#### 94. `82ae2cf` - 11 files changed

**Date:** 2025-07-17
**PR:** [#2106](https://github.com/apache/polaris/pull/2106)
**Title:** Abstract polaris-runtime-service tests for all persistence implementations (#2106)
**Stats:** +182 / -121

**Description:**
```
This change moves the actual tests to `Abstract*` classes and refactors the existing tests to extend those. The NoSQL persistence work extends the same `Abstract*` classes but runs with different Quarkus test profiles.
```

**Sample files changed:**
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/admin/PolarisAuthzTestBase.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/{IcebergCatalogTest.java => AbstractIcebergCatalogTest.java}`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/{IcebergCatalogViewTest.java => AbstractIcebergCatalogViewTest.java}`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/{PolarisGenericTableCatalogTest.java => AbstractPolarisGenericTableCatalogTest.java}`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/{PolicyCatalogTest.java => AbstractPolicyCatalogTest.java}`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/{CatalogNoEntityCacheTest.java => IcebergCatalogRelationalNoEntityCacheTest.java}`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/{PolarisCatalogWithEntityCacheTest.java => IcebergCatalogRelationalWithEntityCacheTest.java}`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/IcebergViewCatalogRelationalTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/PolarisGenericTableCatalogRelationalTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/PolicyCatalogRelationalTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/Profiles.java`

---

#### 95. `987c554` - 11 files changed

**Date:** 2025-07-16
**PR:** [#2012](https://github.com/apache/polaris/pull/2012)
**Title:** Add `pathStyleAccess` to AwsStorageConfigInfo (#2012)
**Stats:** +173 / -21

**Description:**
```
This change allows configuring the "path-style" access
mode in S3 clients (both in Polaris Servers and Iceberg
REST Catalog API clients).
This change is applicable both to AWS storage and to
non-AWS S3-compatible storage (#1530).
```

**Sample files changed:**
- `CHANGELOG.md`
- `api/management-model/src/test/java/org/apache/polaris/core/admin/model/CatalogSerializationTest.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/CatalogApi.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/RestApi.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/CatalogEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/aws/AwsCredentialsStorageIntegration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/aws/AwsStorageConfigurationInfo.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/aws/AwsStorageConfigurationInfoTest.java`
- `runtime/service/src/intTest/java/org/apache/polaris/service/quarkus/it/QuarkusRestCatalogMinIoIT.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/entity/CatalogEntityTest.java`
- `spec/polaris-management-service.yml`

---

#### 96. `6ddd148` - 11 files changed

**Date:** 2025-07-13
**PR:** [#2021](https://github.com/apache/polaris/pull/2021)
**Title:** Make StorageCredentialCache safe for mutli-realm usage (#2021)
**Stats:** +83 / -87

**Description:**
```
Similarly `StorageCredentialCacheKey` having a `@Nullable callContext` makes it more difficult to reason about.
Instead we can determine all realm-specific values at the time of insertion (from the `PolarisCallContext` param of `getOrGenerateSubScopeCreds`).
```

**Sample files changed:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcMetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/cache/StorageCredentialCache.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/cache/StorageCredentialCacheEntry.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/cache/StorageCredentialCacheKey.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/cache/StorageCredentialCacheTest.java`
- `runtime/service/src/main/java/org/apache/polaris/service/quarkus/config/QuarkusProducers.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/IcebergCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/IcebergCatalogViewTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/PolarisGenericTableCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/PolicyCatalogTest.java`

---

#### 97. `bed1ac5` - 11 files changed

**Date:** 2025-07-11
**PR:** [#2026](https://github.com/apache/polaris/pull/2026)
**Title:** Use the 0.9.0 doc from the versioned-docs branch (#2026)
**Stats:** +7 / -2260
**Sample files changed:**
- `site/content/in-dev/0.9.0/_index.md`
- `site/content/in-dev/0.9.0/access-control.md`
- `site/content/in-dev/0.9.0/command-line-interface.md`
- `site/content/in-dev/0.9.0/configuring-polaris-for-production.md`
- `site/content/in-dev/0.9.0/entities.md`
- `site/content/in-dev/0.9.0/metastores.md`
- `site/content/in-dev/0.9.0/overview.md`
- `site/content/in-dev/0.9.0/polaris-management-service.md`
- `site/content/in-dev/0.9.0/quickstart.md`
- `site/content/in-dev/0.9.0/rest-catalog-open-api.md`
- `site/hugo.yaml`

---

#### 98. `a385268` - 11 files changed

**Date:** 2025-06-30
**PR:** [#1932](https://github.com/apache/polaris/pull/1932)
**Title:** Added support for `s3a` scheme (#1932)
**Stats:** +537 / -49
**Sample files changed:**
- `polaris-core/src/main/java/org/apache/polaris/core/storage/PolarisStorageConfigurationInfo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/StorageLocation.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/aws/S3Location.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/InMemoryStorageIntegrationTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/StorageUtilTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/aws/S3LocationTest.java`
- `polaris-core/src/test/java/org/apache/polaris/service/storage/aws/AwsCredentialsStorageIntegrationTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/admin/PolarisOverlappingCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/admin/PolarisS3InteroperabilityTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/entity/CatalogEntityTest.java`
- `service/common/src/test/java/org/apache/polaris/service/catalog/io/FileIOFactoryTest.java`

---

#### 99. `9001785` - 11 files changed

**Date:** 2025-05-27
**PR:** [#1589](https://github.com/apache/polaris/pull/1589)
**Title:** Create a single binary distribution bundle (#1589)
**Stats:** +274 / -308
**Sample files changed:**
- `gradle/projects.main.properties`
- `quarkus/admin/build.gradle.kts`
- `quarkus/admin/distribution/README.md`
- `quarkus/distribution/DISCLAIMER`
- `quarkus/distribution/README.md`
- `quarkus/{run-script/scripts/run.sh => distribution/bin/admin}`
- `quarkus/distribution/bin/server`
- `quarkus/distribution/build.gradle.kts`
- `quarkus/run-script/build.gradle.kts`
- `quarkus/server/build.gradle.kts`
- `quarkus/server/distribution/README.md`

---

#### 100. `0eafcaa` - 11 files changed

**Date:** 2025-05-23
**PR:** [#1610](https://github.com/apache/polaris/pull/1610)
**Title:** Fix quickstart doc with docker compose (#1610)
**Stats:** +55 / -36
**Sample files changed:**
- `getting-started/assets/postgres/docker-compose-postgres.yml`
- `getting-started/eclipselink/README.md`
- `getting-started/eclipselink/docker-compose-bootstrap-db.yml`
- `getting-started/eclipselink/docker-compose.yml`
- `getting-started/jdbc/README.md`
- `getting-started/jdbc/docker-compose.yml`
- `site/content/in-dev/unreleased/getting-started/deploying-polaris/quickstart-deploy-aws.md`
- `site/content/in-dev/unreleased/getting-started/deploying-polaris/quickstart-deploy-azure.md`
- `site/content/in-dev/unreleased/getting-started/deploying-polaris/quickstart-deploy-gcp.md`
- `site/content/in-dev/unreleased/getting-started/quickstart.md`
- `site/content/in-dev/unreleased/getting-started/using-polaris.md`

---

## 2. Critical File Commits

**Total:** 54 commits

**Critical files tracked:**
- `PolarisMetaStoreManager`
- `BasePersistence`
- `TransactionalPersistence`
- `CallContext`
- `PolarisCallContext`

### Details

#### 1. `9957e24` - Extract IcebergCatalog.getAccessConfig to a separate class AccessConfigProvider (#2736) 🔥 **LARGE & CRITICAL**

**Date:** 2025-10-08
**PR:** [#2736](https://github.com/apache/polaris/pull/2736)
**Files changed:** 16
**Stats:** +204 / -124

**Critical files affected:**
- `runtime/service/src/main/java/org/apache/polaris/service/context/catalog/PolarisCallContextCatalogFactory.java`

**Description:**
```
The old SupportsCredentialVending is removed in this PR upon discussion
```

---

#### 2. `413e293` - JDBC: Fix Bootstrap with schema options (#2762) 🔥 **LARGE & CRITICAL**

**Date:** 2025-10-07
**PR:** [#2762](https://github.com/apache/polaris/pull/2762)
**Files changed:** 12
**Stats:** +364 / -77

**Critical files affected:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`

---

#### 3. `b190b77` - Add PolarisResolutionManifestCatalogView.getResolvedCatalogEntity helper (#2750)

**Date:** 2025-10-03
**PR:** [#2750](https://github.com/apache/polaris/pull/2750)
**Files changed:** 9
**Stats:** +31 / -45

**Critical files affected:**
- `runtime/service/src/main/java/org/apache/polaris/service/context/catalog/PolarisCallContextCatalogFactory.java`

---

#### 4. `b1142b5` - JDBC: Handle schema evolution (#2714) 🔥 **LARGE & CRITICAL**

**Date:** 2025-10-03
**PR:** [#2714](https://github.com/apache/polaris/pull/2714)
**Files changed:** 15
**Stats:** +396 / -54

**Critical files affected:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/AtomicMetastoreManagerWithJdbcBasePersistenceImplTest.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/AtomicMetastoreManagerWithJdbcBasePersistenceImplV0SchemaTest.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/AtomicMetastoreManagerWithJdbcBasePersistenceImplV1SchemaTest.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/AtomicMetastoreManagerWithJdbcBasePersistenceImplV2SchemaTest.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/AtomicMetastoreManagerWithJdbcBasePersistenceImplV3SchemaTest.java`
- `polaris-core/src/testFixtures/java/org/apache/polaris/core/persistence/BasePolarisMetaStoreManagerTest.java`

---

#### 5. `80f0456` - Use PrincipalEntity in PolarisMetaStoreManager.createPrincipal (#2518) 🔥 **LARGE & CRITICAL**

**Date:** 2025-09-30
**PR:** [#2518](https://github.com/apache/polaris/pull/2518)
**Files changed:** 11
**Stats:** +77 / -163

**Critical files affected:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/PolarisMetaStoreManager.java`

**Description:**
```
if we pass and return a more specific `PrincipalEntity` we can simplify
the surrounding code and implementation
```

---

#### 6. `5ea215a` - Add fallback in case the VERSION table is not present (#2653)

**Date:** 2025-09-29
**PR:** [#2653](https://github.com/apache/polaris/pull/2653)
**Files changed:** 5
**Stats:** +30 / -2

**Critical files affected:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`

**Description:**
```
* wire up
* pastefix
* change to postgres specific code
```

---

#### 7. `c3f5001` - Add Polaris Events to Persistence (#1844) 🔥 **LARGE & CRITICAL**

**Date:** 2025-09-03
**PR:** [#1844](https://github.com/apache/polaris/pull/1844)
**Files changed:** 59
**Stats:** +2000 / -83

**Critical files affected:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/BasePersistence.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/PolarisMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/AbstractTransactionalPersistence.java`
- `runtime/service/src/main/java/org/apache/polaris/service/context/catalog/PolarisCallContextCatalogFactory.java`

---

#### 8. `f6bcbd2` - perf(refactor): optimizing JdbcBasePersistenceImpl.listEntities (#2465)

**Date:** 2025-09-03
**PR:** [#2465](https://github.com/apache/polaris/pull/2465)
**Files changed:** 7
**Stats:** +151 / -42

**Critical files affected:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`

**Description:**
```
- Eliminated Object Creation Overhead: Direct conversion to EntityNameLookupRecord without intermediate PolarisBaseEntity
```

---

#### 9. `327697c` - Feature: Expose resetCredentials via a new reset api to allow root user to reset credentials for an existing principal with custom values  (#2197) 🔥 **LARGE & CRITICAL**

**Date:** 2025-09-02
**PR:** [#2197](https://github.com/apache/polaris/pull/2197)
**Files changed:** 17
**Stats:** +479 / -5

**Critical files affected:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TreeMapTransactionalPersistenceImpl.java`

---

#### 10. `6b4f8e1` - Remove PolarisCallContext.getDiagServices (#2415) 🔥 **LARGE & CRITICAL**

**Date:** 2025-09-02
**PR:** [#2415](https://github.com/apache/polaris/pull/2415)
**Files changed:** 55
**Stats:** +279 / -217

**Critical files affected:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/AtomicMetastoreManagerWithJdbcBasePersistenceImplTest.java`
- `polaris-core/src/main/java/org/apache/polaris/core/PolarisCallContext.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`
- `runtime/service/src/main/java/org/apache/polaris/service/context/catalog/PolarisCallContextCatalogFactory.java`

**Description:**
```
* Remove diagnostics from PolarisCallContext
```

---

#### 11. `ad450d4` - Add PolarisDiagnostics field to BaseMetaStoreManager (#2381)

**Date:** 2025-08-26
**PR:** [#2381](https://github.com/apache/polaris/pull/2381)
**Files changed:** 8
**Stats:** +203 / -201

**Critical files affected:**
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/AtomicMetastoreManagerWithJdbcBasePersistenceImplTest.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`

**Description:**
```
the ultimate goal is removing the `PolarisCallContext` parameter from every
`PolarisMetaStoreManager` interface method, so we make steps towards
reducing its usage first.
```

---

#### 12. `b49cbc5` - Add PolarisMetaStoreManager.loadEntities (#2290) 🔥 **LARGE & CRITICAL**

**Date:** 2025-08-20
**PR:** [#2290](https://github.com/apache/polaris/pull/2290)
**Files changed:** 16
**Stats:** +223 / -167

**Critical files affected:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/BasePersistence.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/PolarisMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/AbstractTransactionalPersistence.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalPersistence.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TreeMapTransactionalPersistenceImpl.java`
- `polaris-core/src/testFixtures/java/org/apache/polaris/core/persistence/BasePolarisMetaStoreManagerTest.java`

**Description:**
```
currently `PolarisMetaStoreManager.listEntities` only exposes a limited
subset of the underlying `BasePersistence.listEntities` functionality.
most of the callers have to post-process the `EntityNameLookupRecord` of
`ListEntitiesResult` and call `PolarisMetaStoreManager.loadEntity`
on the individ...
```

---

#### 13. `fcd4777` - Add PolarisDiagnostics field to AbstractTransactionalPersistence (#2372) 🔥 **LARGE & CRITICAL**

**Date:** 2025-08-20
**PR:** [#2372](https://github.com/apache/polaris/pull/2372)
**Files changed:** 11
**Stats:** +61 / -48

**Critical files affected:**
- `persistence/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/EclipseLinkPolarisMetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/AbstractTransactionalPersistence.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TreeMapTransactionalPersistenceImpl.java`
- `runtime/service/src/main/java/org/apache/polaris/service/persistence/InMemoryPolarisMetaStoreManagerFactory.java`

---

#### 14. `22e0c1c` - Add PolarisDiagnostics field to TransactionalMetaStoreManagerImpl (#2361)

**Date:** 2025-08-18
**PR:** [#2361](https://github.com/apache/polaris/pull/2361)
**Files changed:** 6
**Stats:** +114 / -159

**Critical files affected:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`

**Description:**
```
PolarisMetaStoreManager interface method, so we make steps towards reducing
its usage first.
```

---

#### 15. `96f1459` - Refactor Authenticator and PolarisPrincipal (#2307) 🔥 **LARGE & CRITICAL**

**Date:** 2025-08-18
**PR:** [#2307](https://github.com/apache/polaris/pull/2307)
**Files changed:** 62
**Stats:** +460 / -426

**Critical files affected:**
- `runtime/service/src/main/java/org/apache/polaris/service/context/catalog/CallContextCatalogFactory.java`
- `runtime/service/src/main/java/org/apache/polaris/service/context/catalog/PolarisCallContextCatalogFactory.java`

**Description:**
```
- `AuthenticatedPolarisPrincipal` becomes an interface `PolarisPrincipal`, as the original class leaks implementation details (references to `PrincipalEntity` and thus to the storage layer). The new interface does not reference the storage layer. This is one step further towards easy pluggability...
```

---

#### 16. `7af85be` - Use asMap property helpers (#2347)

**Date:** 2025-08-15
**PR:** [#2347](https://github.com/apache/polaris/pull/2347)
**Files changed:** 7
**Stats:** +35 / -91

**Critical files affected:**
- `polaris-core/src/testFixtures/java/org/apache/polaris/core/persistence/BasePolarisMetaStoreManagerTest.java`

**Description:**
```
getting used consistently
```

---

#### 17. `efc68e8` - Use PolarisTaskConstants (#2346)

**Date:** 2025-08-14
**PR:** [#2346](https://github.com/apache/polaris/pull/2346)
**Files changed:** 3
**Stats:** +7 / -4

**Critical files affected:**
- `polaris-core/src/testFixtures/java/org/apache/polaris/core/persistence/BasePolarisMetaStoreManagerTest.java`

---

#### 18. `ee04df4` - Add entitySubType param to BasePersistence.listEntities (#2317)

**Date:** 2025-08-13
**PR:** [#2317](https://github.com/apache/polaris/pull/2317)
**Files changed:** 9
**Stats:** +73 / -167

**Critical files affected:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/BasePersistence.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/AbstractTransactionalPersistence.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalPersistence.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TreeMapTransactionalPersistenceImpl.java`

**Description:**
```
```
Page<EntityNameLookupRecord> listEntities(..., PageToken);
Page<EntityNameLookupRecord> listEntities(..., Predicate<PolarisBaseEntity>, PageToken)
<T> Page<T> listEntities(..., Predicate<PolarisBaseEntity>, Function<PolarisBaseEntity, T>, PageToken);
```
the 1st method exists to only return t...
```

---

#### 19. `ef177b5` - Remove PolarisCallContext.getClock (#2250) 🔥 **LARGE & CRITICAL**

**Date:** 2025-08-07
**PR:** [#2250](https://github.com/apache/polaris/pull/2250)
**Files changed:** 31
**Stats:** +129 / -165

**Critical files affected:**
- `persistence/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/EclipseLinkPolarisMetaStoreManagerFactory.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/AtomicMetastoreManagerWithJdbcBasePersistenceImplTest.java`
- `polaris-core/src/main/java/org/apache/polaris/core/PolarisCallContext.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`
- `polaris-core/src/testFixtures/java/org/apache/polaris/core/persistence/BasePolarisMetaStoreManagerTest.java`
- `runtime/service/src/main/java/org/apache/polaris/service/persistence/InMemoryPolarisMetaStoreManagerFactory.java`

**Description:**
```
realm or call specific context class.
```

---

#### 20. `04e65af` - Use injected PolarisDiagnostics in MetaStoreManagerFactory impls (#2251)

**Date:** 2025-08-06
**PR:** [#2251](https://github.com/apache/polaris/pull/2251)
**Files changed:** 7
**Stats:** +23 / -23

**Critical files affected:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`
- `runtime/service/src/main/java/org/apache/polaris/service/persistence/InMemoryPolarisMetaStoreManagerFactory.java`

---

#### 21. `af69d9f` - JdbcMetaStoreManagerFactory determines schemaVersion once per realm (#2217)

**Date:** 2025-08-05
**PR:** [#2217](https://github.com/apache/polaris/pull/2217)
**Files changed:** 3
**Stats:** +14 / -8

**Critical files affected:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/AtomicMetastoreManagerWithJdbcBasePersistenceImplTest.java`

**Description:**
```
running the query.
```

---

#### 22. `20febda` - Merge polaris-service-common into polaris-runtime-service (#2233) 🔥 **LARGE & CRITICAL**

**Date:** 2025-08-05
**PR:** [#2233](https://github.com/apache/polaris/pull/2233)
**Files changed:** 290
**Stats:** +779 / -1150

**Critical files affected:**
- `{service/common => runtime/service}/src/main/java/org/apache/polaris/service/context/catalog/CallContextCatalogFactory.java`
- `{service/common => runtime/service}/src/main/java/org/apache/polaris/service/context/catalog/PolarisCallContextCatalogFactory.java`
- `{service/common => runtime/service}/src/main/java/org/apache/polaris/service/persistence/InMemoryPolarisMetaStoreManagerFactory.java`

---

#### 23. `b476779` - JDBC: SERIALIZABLE/EntityNotFoundException (#2219)

**Date:** 2025-08-05
**PR:** [#2219](https://github.com/apache/polaris/pull/2219)
**Files changed:** 1
**Stats:** +10 / -4

**Critical files affected:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`

---

#### 24. `0449d9b` - Remove CallContext.CURRENT_CONTEXT (#2203)

**Date:** 2025-08-01
**PR:** [#2203](https://github.com/apache/polaris/pull/2203)
**Files changed:** 6
**Stats:** +7 / -38

**Critical files affected:**
- `polaris-core/src/main/java/org/apache/polaris/core/context/CallContext.java`

**Description:**
```
removed in the following commits:
- 756e535fabe150eefdfe16f3c61c1207217d2e2f
- e7eb59f6d89a5891381c805c9ed4244601d5b430
- 4d94745db36c5d4907cf34d749a3a2690f8e4fff
thus we can now remove the `CURRENT_CONTEXT` threadlocal and all
associated methods.
```

---

#### 25. `a6656c3` - Remove CallContextResolver (#2215)

**Date:** 2025-07-31
**PR:** [#2215](https://github.com/apache/polaris/pull/2215)
**Files changed:** 2
**Stats:** +0 / -100

**Critical files affected:**
- `service/common/src/main/java/org/apache/polaris/service/context/CallContextResolver.java`
- `service/common/src/main/java/org/apache/polaris/service/context/DefaultCallContextResolver.java`

---

#### 26. `3d354f8` - Remove PolarisCallContext from TreeMapMetaStore (#2195)

**Date:** 2025-07-30
**PR:** [#2195](https://github.com/apache/polaris/pull/2195)
**Files changed:** 2
**Stats:** +28 / -41

**Critical files affected:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TreeMapTransactionalPersistenceImpl.java`

**Description:**
```
* reset diagnosticServices in TreeMapMetaStore
* simplify ensure methods
```

---

#### 27. `2332f63` - Simplify BaseMetaStoreManager.extractStorageConfiguration (#2194)

**Date:** 2025-07-30
**PR:** [#2194](https://github.com/apache/polaris/pull/2194)
**Files changed:** 6
**Stats:** +15 / -14

**Critical files affected:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TreeMapTransactionalPersistenceImpl.java`

**Description:**
```
the full `PolarisCallContext` if not necessary.
```

---

#### 28. `756e535` - Remove PolarisDiagnostics from json utils (#2176) 🔥 **LARGE & CRITICAL**

**Date:** 2025-07-28
**PR:** [#2176](https://github.com/apache/polaris/pull/2176)
**Files changed:** 24
**Stats:** +81 / -229

**Critical files affected:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`
- `polaris-core/src/testFixtures/java/org/apache/polaris/core/persistence/BasePolarisMetaStoreManagerTest.java`

---

#### 29. `e46f8c6` - Add Principal lookup helpers to PolarisMetaStoreManager (#2174) 🔥 **LARGE & CRITICAL**

**Date:** 2025-07-28
**PR:** [#2174](https://github.com/apache/polaris/pull/2174)
**Files changed:** 15
**Stats:** +115 / -210

**Critical files affected:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/PolarisMetaStoreManager.java`

**Description:**
```
- add `PolarisMetaStoreManager.findRootPrincipal`
- add `PolarisMetaStoreManager.findPrincipalByName`
- add `PolarisMetaStoreManager.findPrincipalRoleByName`
also we now prefer `PolarisEntityConstants` where applicable
```

---

#### 30. `2256df0` - Simplify bootstrapServiceAndCreatePolarisPrincipalForRealm (#2172)

**Date:** 2025-07-24
**PR:** [#2172](https://github.com/apache/polaris/pull/2172)
**Files changed:** 2
**Stats:** +23 / -32

**Critical files affected:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`

**Description:**
```
because the same pattern existed for this method.
note that we do some minor additional "formatting" changes to minimize
the diff between the two files (as they were originally copy pasted).
this could lead to having a common base class in the future.
```

---

#### 31. `ca85339` - Rework getOrCreateSessionSupplier (#2161) 🔥 **LARGE & CRITICAL**

**Date:** 2025-07-24
**PR:** [#2161](https://github.com/apache/polaris/pull/2161)
**Files changed:** 20
**Stats:** +32 / -43

**Critical files affected:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`
- `service/common/src/main/java/org/apache/polaris/service/context/DefaultCallContextResolver.java`
- `service/common/src/main/java/org/apache/polaris/service/persistence/InMemoryPolarisMetaStoreManagerFactory.java`

**Description:**
```
it seems like the `Supplier` was an leaking implementation detail of the
`MetaStoreManagerFactor` implementations.
```

---

#### 32. `5faa371` - Simplify checkPolarisServiceBootstrappedForRealm (#2162)

**Date:** 2025-07-23
**PR:** [#2162](https://github.com/apache/polaris/pull/2162)
**Files changed:** 2
**Stats:** +10 / -18

**Critical files affected:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`

---

#### 33. `95358a9` - Extract ResolverFactory from PolarisEntityManager (#2148) 🔥 **LARGE & CRITICAL**

**Date:** 2025-07-23
**PR:** [#2148](https://github.com/apache/polaris/pull/2148)
**Files changed:** 16
**Stats:** +148 / -80

**Critical files affected:**
- `service/common/src/main/java/org/apache/polaris/service/context/catalog/PolarisCallContextCatalogFactory.java`

**Description:**
```
Note that the little left-over functionality of `PolarisEntityManager` can
be split out to more dedicated interfaces in a follow-up most likely.
```

---

#### 34. `886d111` - Remove PolarisEntityManager.getCredentialCache (#2133) 🔥 **LARGE & CRITICAL**

**Date:** 2025-07-22
**PR:** [#2133](https://github.com/apache/polaris/pull/2133)
**Files changed:** 18
**Stats:** +98 / -129

**Critical files affected:**
- `service/common/src/main/java/org/apache/polaris/service/context/catalog/PolarisCallContextCatalogFactory.java`

**Description:**
```
the only caller of `getCredentialCache` is `FileIOUtil.refreshAccessConfig`, which in in turn is only called by `DefaultFileIOFactory` and `IcebergCatalog`.
note that in a follow-up we will likely be able to remove `PolarisEntityManager` usage completely from `IcebergCatalog`.
additional cleanups...
```

---

#### 35. `fb418a2` - Extensible pagination token implementation (#1938) 🔥 **LARGE & CRITICAL**

**Date:** 2025-07-16
**PR:** [#1938](https://github.com/apache/polaris/pull/1938)
**Files changed:** 32
**Stats:** +1329 / -506

**Critical files affected:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TreeMapTransactionalPersistenceImpl.java`

**Description:**
```
* Allows multiple implementations of `Token` referencing the "next page", encapsulated in `PageToken`. No changes to `polaris-core` needed to add custom `Token` implementations.
* Extensible to (later) support (cryptographic) signatures to prevent tampered page-token
* Refactor pagination code to...
```

---

#### 36. `2c2052c` - Use application-scoped StorageCredentialCache (#2022) 🔥 **LARGE & CRITICAL**

**Date:** 2025-07-15
**PR:** [#2022](https://github.com/apache/polaris/pull/2022)
**Files changed:** 15
**Stats:** +118 / -57

**Critical files affected:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`

---

#### 37. `de351de` - Introduce RealmConfig (#2015) 🔥 **LARGE & CRITICAL**

**Date:** 2025-07-14
**PR:** [#2015](https://github.com/apache/polaris/pull/2015)
**Files changed:** 51
**Stats:** +365 / -429

**Critical files affected:**
- `persistence/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/EclipseLinkPolarisMetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/PolarisCallContext.java`
- `polaris-core/src/main/java/org/apache/polaris/core/context/CallContext.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`
- `service/common/src/main/java/org/apache/polaris/service/persistence/InMemoryPolarisMetaStoreManagerFactory.java`

**Description:**
```
```
ctx.getPolarisCallContext()
   .getConfigurationStore()
   .getConfiguration(ctx.getRealmContext(), "ALLOW_WILDCARD_LOCATION", false))
```
since a `PolarisConfigurationStore` cant be used without a `RealmContext` it makes sense to add a dedicated interface. this allows removal of verbose code...
```

---

#### 38. `6ddd148` - Make StorageCredentialCache safe for mutli-realm usage (#2021) 🔥 **LARGE & CRITICAL**

**Date:** 2025-07-13
**PR:** [#2021](https://github.com/apache/polaris/pull/2021)
**Files changed:** 11
**Stats:** +83 / -87

**Critical files affected:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`

**Description:**
```
Similarly `StorageCredentialCacheKey` having a `@Nullable callContext` makes it more difficult to reason about.
Instead we can determine all realm-specific values at the time of insertion (from the `PolarisCallContext` param of `getOrGenerateSubScopeCreds`).
```

---

#### 39. `bd83252` - Introduce an option to add object storage prefix to table locations (#1966) 🔥 **LARGE & CRITICAL**

**Date:** 2025-07-08
**PR:** [#1966](https://github.com/apache/polaris/pull/1966)
**Files changed:** 12
**Stats:** +589 / -62

**Critical files affected:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TreeMapTransactionalPersistenceImpl.java`

**Description:**
```
Currently, Polaris enforces that the physical layout of entities maps to the logical layout:
```
catalog
└── ns1
    ├── ns2
    │   └── table_b
    └── table_a
```
In the above example, the base locations of `table_a` and `ns2` are expected to be children of `ns1`, and the location of `table_b` ...
```

---

#### 40. `44d52d4` - Add options to the bootstrap command to specify a schema file (#1942)

**Date:** 2025-06-30
**PR:** [#1942](https://github.com/apache/polaris/pull/1942)
**Files changed:** 9
**Stats:** +237 / -58

**Critical files affected:**
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/AtomicMetastoreManagerWithJdbcBasePersistenceImplTest.java`

---

#### 41. `1e69373` - Optimize the location overlap check with an index (#1686) 🔥 **LARGE & CRITICAL**

**Date:** 2025-06-26
**PR:** [#1686](https://github.com/apache/polaris/pull/1686)
**Files changed:** 30
**Stats:** +863 / -95

**Critical files affected:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/AtomicMetastoreManagerWithJdbcBasePersistenceImplTest.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/BasePersistence.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/PolarisMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TreeMapTransactionalPersistenceImpl.java`
- `service/common/src/main/java/org/apache/polaris/service/context/catalog/PolarisCallContextCatalogFactory.java`

**Description:**
```
<hr>
### Current Behavior
The current logic is that when we create a table, we list all sibling tables and check each and every one to ensure there is no location overlap. This results in O(N^2) checks when adding N tables to a namespace, quickly becoming untenable.
With the `CreateTreeDataset` [...
```

---

#### 42. `2a2bcde` - JDBC: Refactor DatabaseOps (#1843)

**Date:** 2025-06-12
**PR:** [#1843](https://github.com/apache/polaris/pull/1843)
**Files changed:** 5
**Stats:** +71 / -64

**Critical files affected:**
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/AtomicMetastoreManagerWithJdbcBasePersistenceImplTest.java`

**Description:**
```
* wraps the bootstrap in a transaction !
* refactor Production Readiness checks for Postgres
```

---

#### 43. `8942f68` - Remove PolarisConfiguration.loadConfig (v2) (#1858) 🔥 **LARGE & CRITICAL**

**Date:** 2025-06-11
**PR:** [#1858](https://github.com/apache/polaris/pull/1858)
**Files changed:** 35
**Stats:** +221 / -135

**Critical files affected:**
- `persistence/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/EclipseLinkPolarisMetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`
- `service/common/src/main/java/org/apache/polaris/service/persistence/InMemoryPolarisMetaStoreManagerFactory.java`

---

#### 44. `f393a1d` - JDBC: Use PreparedStatement (#1802) 🔥 **LARGE & CRITICAL**

**Date:** 2025-06-06
**PR:** [#1802](https://github.com/apache/polaris/pull/1802)
**Files changed:** 13
**Stats:** +620 / -374

**Critical files affected:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/AtomicMetastoreManagerWithJdbcBasePersistenceImplTest.java`

---

#### 45. `187d700` - Turn CallContext.copyOf into an interface instead of static function (#1816)

**Date:** 2025-06-05
**PR:** [#1816](https://github.com/apache/polaris/pull/1816)
**Files changed:** 5
**Stats:** +27 / -60

**Critical files affected:**
- `polaris-core/src/main/java/org/apache/polaris/core/PolarisCallContext.java`
- `polaris-core/src/main/java/org/apache/polaris/core/context/CallContext.java`

---

#### 46. `a59942a` - Remove CallContext.getDiagnostics (#1815)

**Date:** 2025-06-04
**PR:** [#1815](https://github.com/apache/polaris/pull/1815)
**Files changed:** 1
**Stats:** +0 / -5

**Critical files affected:**
- `polaris-core/src/main/java/org/apache/polaris/core/context/CallContext.java`

---

#### 47. `511df8c` - Remove CallContext.of (#1812) 🔥 **LARGE & CRITICAL**

**Date:** 2025-06-04
**PR:** [#1812](https://github.com/apache/polaris/pull/1812)
**Files changed:** 15
**Stats:** +71 / -110

**Critical files affected:**
- `polaris-core/src/main/java/org/apache/polaris/core/context/CallContext.java`
- `polaris-core/src/testFixtures/java/org/apache/polaris/core/persistence/BasePolarisMetaStoreManagerTest.java`

---

#### 48. `5132312` - Remove deprecated constructor for PolarisCallContext (#1813) 🔥 **LARGE & CRITICAL**

**Date:** 2025-06-04
**PR:** [#1813](https://github.com/apache/polaris/pull/1813)
**Files changed:** 28
**Stats:** +55 / -36

**Critical files affected:**
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/AtomicMetastoreManagerWithJdbcBasePersistenceImplTest.java`
- `polaris-core/src/main/java/org/apache/polaris/core/PolarisCallContext.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`

**Description:**
```
This PR removes the usage of the old constructors.
```

---

#### 49. `0a8d8b8` - Core: Consolidate CallContext with PolarisCallContext part 1(#1806)

**Date:** 2025-06-04
**PR:** [#1806](https://github.com/apache/polaris/pull/1806)
**Files changed:** 6
**Stats:** +74 / -30

**Critical files affected:**
- `polaris-core/src/main/java/org/apache/polaris/core/PolarisCallContext.java`
- `polaris-core/src/main/java/org/apache/polaris/core/context/CallContext.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`
- `service/common/src/main/java/org/apache/polaris/service/context/DefaultCallContextResolver.java`

---

#### 50. `2a71098` - Remove the unused field in CallContextCatalogFactory (#1784)

**Date:** 2025-06-03
**PR:** [#1784](https://github.com/apache/polaris/pull/1784)
**Files changed:** 2
**Stats:** +10 / -9

**Critical files affected:**
- `service/common/src/main/java/org/apache/polaris/service/context/catalog/CallContextCatalogFactory.java`
- `service/common/src/main/java/org/apache/polaris/service/context/catalog/PolarisCallContextCatalogFactory.java`

---

#### 51. `0a9a5d9` - feat(cdi): Remove CallContext.close() (#1776) 🔥 **LARGE & CRITICAL**

**Date:** 2025-06-03
**PR:** [#1776](https://github.com/apache/polaris/pull/1776)
**Files changed:** 12
**Stats:** +470 / -607

**Critical files affected:**
- `polaris-core/src/main/java/org/apache/polaris/core/context/CallContext.java`
- `polaris-core/src/testFixtures/java/org/apache/polaris/core/persistence/BasePolarisMetaStoreManagerTest.java`
- `service/common/src/main/java/org/apache/polaris/service/context/catalog/PolarisCallContextCatalogFactory.java`

**Description:**
```
This simplification will hopefully pave the way to a more robust handling of request-scoped beans in task executor threads.
```

---

#### 52. `dd987b6` - Restructure the directory and package name for persistence modules (#1724) 🔥 **LARGE & CRITICAL**

**Date:** 2025-06-02
**PR:** [#1724](https://github.com/apache/polaris/pull/1724)
**Files changed:** 41
**Stats:** +38 / -38

**Critical files affected:**
- `{extension/persistence => persistence}/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/EclipseLinkPolarisMetaStoreManagerFactory.java`
- `{extension/persistence/relational-jdbc/src/main/java/org/apache/polaris/extension => persistence/relational-jdbc/src/main/java/org/apache/polaris}/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`
- `{extension/persistence/relational-jdbc/src/test/java/org/apache/polaris/extension => persistence/relational-jdbc/src/test/java/org/apache/polaris}/persistence/relational/jdbc/AtomicMetastoreManagerWithJdbcBasePersistenceImplTest.java`

---

#### 53. `3b9d2b0` - Fix credentials printing twice (#1682)

**Date:** 2025-05-28
**PR:** [#1682](https://github.com/apache/polaris/pull/1682)
**Files changed:** 3
**Stats:** +6 / -34

**Critical files affected:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`
- `service/common/src/main/java/org/apache/polaris/service/persistence/InMemoryPolarisMetaStoreManagerFactory.java`

---

#### 54. `a534193` - [Policy Store] Add policyTypeCode to Slice/Index for Future Filtering Support and Update Policy Persistence Method (#1628) 🔥 **LARGE & CRITICAL**

**Date:** 2025-05-22
**PR:** [#1628](https://github.com/apache/polaris/pull/1628)
**Files changed:** 13
**Stats:** +131 / -60

**Critical files affected:**
- `extension/persistence/relational-jdbc/src/main/java/org/apache/polaris/extension/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/AbstractTransactionalPersistence.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TreeMapTransactionalPersistenceImpl.java`

**Description:**
```
It also updates the loadAllTargetsOnPolicy method to accept policyTypeCode, enabling it to use the new index for better performance.
```

---

## 3. High Priority: Large AND Critical Commits

**Total:** 30 commits

These commits modified critical infrastructure files AND changed more than 10 files.

| Hash | Date | PR | Title | Files | Critical Files | +/- |
|------|------|-----|-------|-------|----------------|-----|
| `20febda` | 2025-08-05 | [#2233](https://github.com/apache/polaris/pull/2233) | Merge polaris-service-common into polaris-runtime-service (#2233) | 290 | 3 | +779/-1150 |
| `96f1459` | 2025-08-18 | [#2307](https://github.com/apache/polaris/pull/2307) | Refactor Authenticator and PolarisPrincipal (#2307) | 62 | 2 | +460/-426 |
| `c3f5001` | 2025-09-03 | [#1844](https://github.com/apache/polaris/pull/1844) | Add Polaris Events to Persistence (#1844) | 59 | 5 | +2000/-83 |
| `6b4f8e1` | 2025-09-02 | [#2415](https://github.com/apache/polaris/pull/2415) | Remove PolarisCallContext.getDiagServices (#2415) | 55 | 5 | +279/-217 |
| `de351de` | 2025-07-14 | [#2015](https://github.com/apache/polaris/pull/2015) | Introduce RealmConfig (#2015) | 51 | 5 | +365/-429 |
| `dd987b6` | 2025-06-02 | [#1724](https://github.com/apache/polaris/pull/1724) | Restructure the directory and package name for persistence modules (#1724) | 41 | 3 | +38/-38 |
| `8942f68` | 2025-06-11 | [#1858](https://github.com/apache/polaris/pull/1858) | Remove PolarisConfiguration.loadConfig (v2) (#1858) | 35 | 3 | +221/-135 |
| `fb418a2` | 2025-07-16 | [#1938](https://github.com/apache/polaris/pull/1938) | Extensible pagination token implementation (#1938) | 32 | 2 | +1329/-506 |
| `ef177b5` | 2025-08-07 | [#2250](https://github.com/apache/polaris/pull/2250) | Remove PolarisCallContext.getClock (#2250) | 31 | 6 | +129/-165 |
| `1e69373` | 2025-06-26 | [#1686](https://github.com/apache/polaris/pull/1686) | Optimize the location overlap check with an index (#1686) | 30 | 6 | +863/-95 |
| `5132312` | 2025-06-04 | [#1813](https://github.com/apache/polaris/pull/1813) | Remove deprecated constructor for PolarisCallContext (#1813) | 28 | 3 | +55/-36 |
| `756e535` | 2025-07-28 | [#2176](https://github.com/apache/polaris/pull/2176) | Remove PolarisDiagnostics from json utils (#2176) | 24 | 2 | +81/-229 |
| `ca85339` | 2025-07-24 | [#2161](https://github.com/apache/polaris/pull/2161) | Rework getOrCreateSessionSupplier (#2161) | 20 | 3 | +32/-43 |
| `886d111` | 2025-07-22 | [#2133](https://github.com/apache/polaris/pull/2133) | Remove PolarisEntityManager.getCredentialCache (#2133) | 18 | 1 | +98/-129 |
| `327697c` | 2025-09-02 | [#2197](https://github.com/apache/polaris/pull/2197) | Feature: Expose resetCredentials via a new reset api to allow root user to re... | 17 | 2 | +479/-5 |
| `9957e24` | 2025-10-08 | [#2736](https://github.com/apache/polaris/pull/2736) | Extract IcebergCatalog.getAccessConfig to a separate class AccessConfigProvid... | 16 | 1 | +204/-124 |
| `b49cbc5` | 2025-08-20 | [#2290](https://github.com/apache/polaris/pull/2290) | Add PolarisMetaStoreManager.loadEntities (#2290) | 16 | 7 | +223/-167 |
| `95358a9` | 2025-07-23 | [#2148](https://github.com/apache/polaris/pull/2148) | Extract ResolverFactory from PolarisEntityManager (#2148) | 16 | 1 | +148/-80 |
| `b1142b5` | 2025-10-03 | [#2714](https://github.com/apache/polaris/pull/2714) | JDBC: Handle schema evolution (#2714) | 15 | 7 | +396/-54 |
| `e46f8c6` | 2025-07-28 | [#2174](https://github.com/apache/polaris/pull/2174) | Add Principal lookup helpers to PolarisMetaStoreManager (#2174) | 15 | 2 | +115/-210 |
| `2c2052c` | 2025-07-15 | [#2022](https://github.com/apache/polaris/pull/2022) | Use application-scoped StorageCredentialCache (#2022) | 15 | 1 | +118/-57 |
| `511df8c` | 2025-06-04 | [#1812](https://github.com/apache/polaris/pull/1812) | Remove CallContext.of (#1812) | 15 | 2 | +71/-110 |
| `f393a1d` | 2025-06-06 | [#1802](https://github.com/apache/polaris/pull/1802) | JDBC: Use PreparedStatement (#1802) | 13 | 2 | +620/-374 |
| `a534193` | 2025-05-22 | [#1628](https://github.com/apache/polaris/pull/1628) | [Policy Store] Add policyTypeCode to Slice/Index for Future Filtering Support... | 13 | 3 | +131/-60 |
| `413e293` | 2025-10-07 | [#2762](https://github.com/apache/polaris/pull/2762) | JDBC: Fix Bootstrap with schema options (#2762) | 12 | 1 | +364/-77 |
| `bd83252` | 2025-07-08 | [#1966](https://github.com/apache/polaris/pull/1966) | Introduce an option to add object storage prefix to table locations (#1966) | 12 | 1 | +589/-62 |
| `0a9a5d9` | 2025-06-03 | [#1776](https://github.com/apache/polaris/pull/1776) | feat(cdi): Remove CallContext.close() (#1776) | 12 | 3 | +470/-607 |
| `80f0456` | 2025-09-30 | [#2518](https://github.com/apache/polaris/pull/2518) | Use PrincipalEntity in PolarisMetaStoreManager.createPrincipal (#2518) | 11 | 2 | +77/-163 |
| `fcd4777` | 2025-08-20 | [#2372](https://github.com/apache/polaris/pull/2372) | Add PolarisDiagnostics field to AbstractTransactionalPersistence (#2372) | 11 | 4 | +61/-48 |
| `6ddd148` | 2025-07-13 | [#2021](https://github.com/apache/polaris/pull/2021) | Make StorageCredentialCache safe for mutli-realm usage (#2021) | 11 | 1 | +83/-87 |
