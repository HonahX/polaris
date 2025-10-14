# Focused Commit Analysis - Core Changes Only
**Analysis Period:** From commit `94c94f197f1375ac5b7f949f611a4ac03579d9f0` to current `main`
**Total Commits in Range:** 795
**Core Commits Analyzed:** 441
**Filtered Out:** 354
---

## Filtering Criteria

This document excludes:
1. **Python client commits** - Title contains 'python' or only modifies `client/python/`
2. **Trivial dependency updates** - Title contains 'main:' or 'dependency' with ≤2 files and ≤5 line changes
3. **Quickstart/getting-started updates** - Only touches example/tutorial code
4. **Peripheral modules** - Only touches `integration-tests/`, `site/`, `plugins/`, `extensions/`
5. **One-line changes** - Single file with 1 line added or deleted

### Exclusion Statistics
- Dependency update - trivial change: **162** commits
- Only touches excluded directories (integration-tests/site/plugins/extensions): **80** commits
- Python client - only touches client/python: **48** commits
- Python client - title contains 'python': **29** commits
- Quickstart/getting-started - only touches quickstart files: **16** commits
- Quickstart/getting-started update: **13** commits
- One line change: **6** commits

---

## How to Read This Document

Each commit includes:
- **PURPOSE**: Why was this commit made? (bug fix, feature, refactor, etc.)
- **WHAT CHANGED**: Which components and areas were modified
- **WHY NEEDED**: The rationale and business value
- **IMPACT**: What this affects and deployment considerations

---

## Summary Statistics
- **Core commits:** 441
- **Files changed:** 3,403
- **Additions:** 62,815
- **Deletions:** 25,742

---

## Focused Commit Analysis

### 1. `cc7bb95` - Correct invalid example in management service OpenAPI spec (#2801)

**Date:** 2025-10-13 | **Author:** Yong Zheng | **PR:** [#2801](https://github.com/apache/polaris/pull/2801)
**Files:** 1 | **Changes:** +6/-6

**PURPOSE:** Bug fix; CI/CD improvement

**WHAT CHANGED:** in OpenAPI Specs

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: API Contracts | Focused change | May affect API consumers

**Files modified:**
- `spec/polaris-management-service.yml`

**Additional details from commit message:**
```
This was causing a `NullPointerException` in OpenAPI Generator v7.13.0+ due to a change in how examples are processed. The generator now expects all `examples` to be valid and non-empty, and a misplaced `example` can lead to a null reference when the generator tries to access it (we are not yet using v7.13.0+, thus not a problem at the moment).
This commit moves the `example` to be a sibling of the `schema` object, which is the correct placement according to the OpenAPI specification.
Referen...
```

---

### 2. `ed029d1` - [Catalog Federation] Block credential vending for remote tables outside allowed location list (#2791)

**Date:** 2025-10-13 | **Author:** Honah (Jonas) J. | **PR:** [#2791](https://github.com/apache/polaris/pull/2791)
**Files:** 4 | **Changes:** +164/-45

**PURPOSE:** Code modification

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to support catalog federation features

**IMPACT:** Focused change

**Files modified:**
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/CatalogFederationIntegrationTest.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/common/CatalogUtils.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogHandler.java`

---

### 3. `491a9e3` - FIX REG tests with cloud providers (#2793)

**Date:** 2025-10-12 | **Author:** Prashant Singh | **PR:** [#2793](https://github.com/apache/polaris/pull/2793)
**Files:** 2 | **Changes:** +3/-1

**PURPOSE:** Bug fix; Test improvement

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `regtests/README.md`
- `regtests/docker-compose.yml`

---

### 4. `04a9950` - [Catalog Federation] Enable Credential Vending for Passthrough Facade Catalog (#2784)

**Date:** 2025-10-10 | **Author:** Honah (Jonas) J. | **PR:** [#2784](https://github.com/apache/polaris/pull/2784)
**Files:** 6 | **Changes:** +178/-50

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** in Core, Documentation, Runtime Service including test updates

**WHY NEEDED:** to support catalog federation features

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `CHANGELOG.md`
- `integration-tests/build.gradle.kts`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/CatalogFederationIntegrationTest.java`
- `polaris-core/src/main/java/org/apache/polaris/core/config/FeatureConfiguration.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogHandler.java`
- `runtime/spark-tests/src/intTest/java/org/apache/polaris/service/spark/it/CatalogFederationIT.java`

**Additional details from commit message:**
```
When creating a passthrough-facade catalog, the configuration currently requires two components:
StorageConfig – specifies the storage info for the remote catalog.
ConnectionInfo – defines connection parameters for the underlying remote catalog.
With this change, the StorageConfig is now also used to vend temporary credentials for user requests.
Credential vending honors table-level RBAC policies to determine whether to issue read-only or read-write credentials, ensuring access control consis...
```

---

### 5. `622031a` - Freeze 1.2 change log (#2783)

**Date:** 2025-10-10 | **Author:** Prashant Singh | **PR:** [#2783](https://github.com/apache/polaris/pull/2783)
**Files:** 1 | **Changes:** +32/-15

**PURPOSE:** Code modification

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `CHANGELOG.md`

---

### 6. `07a099c` - Update Pull Request Template (#2788)

**Date:** 2025-10-09 | **Author:** Prashant Singh | **PR:** [#2788](https://github.com/apache/polaris/pull/2788)
**Files:** 1 | **Changes:** +41/-0

**PURPOSE:** Code modification

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `.github/pull_request_template.md`

---

### 7. `d449f59` - Update immutables to v2.11.6 (#2780)

**Date:** 2025-10-09 | **Author:** Mend Renovate | **PR:** [#2780](https://github.com/apache/polaris/pull/2780)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 8. `9957e24` - Extract IcebergCatalog.getAccessConfig to a separate class AccessConfigProvider (#2736)

**Date:** 2025-10-08 | **Author:** Honah (Jonas) J. | **PR:** [#2736](https://github.com/apache/polaris/pull/2736)
**Files:** 16 | **Changes:** +204/-124

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Admin Service in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Management Operations | Medium-scale change

**Sample files (showing 15 of 16):**
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

**Additional details from commit message:**
```
The old SupportsCredentialVending is removed in this PR upon discussion
```

---

### 9. `519e127` - SigV4 Auth Support for Catalog Federation - Part 4: Connection Credential Manager (#2759)

**Date:** 2025-10-08 | **Author:** Rulin Xing | **PR:** [#2759](https://github.com/apache/polaris/pull/2759)
**Files:** 41 | **Changes:** +1234/-30

**PURPOSE:** Security enhancement

**WHAT CHANGED:** Modified Admin Service, Catalog, Connection Management in Core, Runtime Service including test updates

**WHY NEEDED:** to enhance catalog functionality; to support catalog federation features

**IMPACT:** Affects: Catalog Operations, External Integrations, Management Operations | Large-scale change affecting multiple modules

**Sample files (showing 15 of 41):**
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

**Additional details from commit message:**
```
The core of this PR is the new ConnectionCredentialVendor interface, which:
Generates connection credentials by combining service identity with user auth parameters
Supports different authentication types (AWS SIGV4, AZURE Entra, GCP IAM) through CDI, currently only supports SigV4.
Provides on-demand credential generation
Enables easy extension for new authentication types
In the long term, we should move the storage credential management logic out of PolarisMetastoreManager, PolarisMetastore...
```

---

### 10. `031a551` - Update the LICENSE and NOTICE files in the runtime (#2779)

**Date:** 2025-10-08 | **Author:** JB Onofré | **PR:** [#2779](https://github.com/apache/polaris/pull/2779)
**Files:** 6 | **Changes:** +874/-831

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 6 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/admin/distribution/LICENSE`
- `runtime/admin/distribution/NOTICE`
- `runtime/distribution/LICENSE`
- `runtime/distribution/NOTICE`
- `runtime/server/distribution/LICENSE`
- `runtime/server/distribution/NOTICE`

---

### 11. `69c546a` - Client: add support for policy management (#2701)

**Date:** 2025-10-07 | **Author:** Yong Zheng | **PR:** [#2701](https://github.com/apache/polaris/pull/2701)
**Files:** 10 | **Changes:** +853/-21

**PURPOSE:** Bug fix; New feature; Code removal; CI/CD improvement

**WHAT CHANGED:** Modified CLI, Client Library in Documentation, Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API, Command Line Tools, User Documentation | Focused change | May affect API consumers

**Files modified:**
- `client/python/cli/command/__init__.py`
- `client/python/cli/command/namespaces.py`
- `client/python/cli/command/policies.py`
- `client/python/cli/command/utils.py`
- `client/python/cli/constants.py`
- `client/python/cli/options/option_tree.py`
- `client/python/cli/polaris_cli.py`
- `client/python/integration_tests/conftest.py`
- `client/python/integration_tests/test_catalog_apis.py`
- `site/content/in-dev/unreleased/command-line-interface.md`

**Additional details from commit message:**
```
Here are the subcommands to API mapping:
attach
 - PUT /polaris/v1/{prefix}/namespaces/{namespace}/policies/{policy-name}/mappings
create
 - POST /polaris/v1/{prefix}/namespaces/{namespace}/policies/{policy-name}/mappings
delete
 - DELETE /polaris/v1/{prefix}/namespaces/{namespace}/policies/{policy-name}
detach
 - POST /polaris/v1/{prefix}/namespaces/{namespace}/policies/{policy-name}/mappings
get
 - GET /polaris/v1/{prefix}/namespaces/{namespace}/policies/{policy-name}
list
 - GET /polaris/v...
```

---

### 12. `7f971cb` - Update immutables to v2.11.5 (#2776)

**Date:** 2025-10-08 | **Author:** Mend Renovate | **PR:** [#2776](https://github.com/apache/polaris/pull/2776)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 13. `980e206` - Add Arguments to Various Event Records (#2765)

**Date:** 2025-10-07 | **Author:** Adnan Hemani | **PR:** [#2765](https://github.com/apache/polaris/pull/2765)
**Files:** 2 | **Changes:** +39/-11

**PURPOSE:** New feature

**WHAT CHANGED:** Modified REST API in Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Client Integration | Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergRestCatalogEventServiceDelegator.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/IcebergRestCatalogEvents.java`

---

### 14. `1387ed9` - Update Changelog with finer grained authz (#2775)

**Date:** 2025-10-07 | **Author:** Travis Bowen | **PR:** [#2775](https://github.com/apache/polaris/pull/2775)
**Files:** 1 | **Changes:** +2/-0

**PURPOSE:** Security enhancement

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `CHANGELOG.md`

---

### 15. `413e293` - JDBC: Fix Bootstrap with schema options (#2762)

**Date:** 2025-10-07 | **Author:** Prashant Singh | **PR:** [#2762](https://github.com/apache/polaris/pull/2762)
**Files:** 12 | **Changes:** +364/-77

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified JDBC Persistence, Persistence Layer in Core, Persistence including test updates with database schema changes

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage, Relational Databases | Medium-scale change | Requires careful deployment

**Files modified:**
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

### 16. `e973100` - Delete ServiceSecretReference (#2768)

**Date:** 2025-10-07 | **Author:** Rulin Xing | **PR:** [#2768](https://github.com/apache/polaris/pull/2768)
**Files:** 1 | **Changes:** +0/-53

**PURPOSE:** Code removal

**WHAT CHANGED:** Modified Secrets Management in Core

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Credentials | Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/secrets/ServiceSecretReference.java`

---

### 17. `4117551` - Implement Finer Grained Operations and Privileges For Update Table (#2697)

**Date:** 2025-10-07 | **Author:** Travis Bowen | **PR:** [#2697](https://github.com/apache/polaris/pull/2697)
**Files:** 13 | **Changes:** +1683/-46

**PURPOSE:** New feature

**WHAT CHANGED:** Modified Authentication/Authorization, Entity Management in Core, OpenAPI Specs, Runtime Service including test updates

**WHY NEEDED:** to improve security and access control

**IMPACT:** Affects: API Contracts, Data Model, Security | Medium-scale change | Security-sensitive change | May affect API consumers

**Files modified:**
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

**Additional details from commit message:**
```
The idea is that all the existing privileges and operations will work and continue to work even after this change. (i.e. TABLE_WRITE_PROPERTIES will still ensure update table is authorized even after these changes).
However, because Polaris will now be able to identify each operation within an UpdateTable request and has a privilege model with inheritance that maps to each operation, users will now have the option of restricting permissions at a finer level if desired.
```

---

### 18. `62a1e70` - Refactor resolutionManifest handling in PolarisAdminService (#2748)

**Date:** 2025-10-07 | **Author:** Christopher Lambert | **PR:** [#2748](https://github.com/apache/polaris/pull/2748)
**Files:** 1 | **Changes:** +259/-268

**PURPOSE:** Code refactoring

**WHAT CHANGED:** Modified Admin Service in Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Management Operations | Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisAdminService.java`

**Additional details from commit message:**
```
"authorize" methods return their `PolarisResolutionManifest`
- replace "find" helpers with "get" helpers that have built-in error
  handling
```

---

### 19. `10f4bc5` - Service: RealmContextFilter test refactor (#2747)

**Date:** 2025-10-04 | **Author:** Alexandre Dutra | **PR:** [#2747](https://github.com/apache/polaris/pull/2747)
**Files:** 3 | **Changes:** +118/-123

**PURPOSE:** Code refactoring; Test improvement

**WHAT CHANGED:** Modified Admin Service in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Management Operations | Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/context/RealmContextFilter.java`
- `runtime/service/src/test/java/org/apache/polaris/service/admin/RealmHeaderTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/context/RealmContextFilterTest.java`

---

### 20. `7b45d82` - Update actions/stale digest to 5f858e3 (#2758)

**Date:** 2025-10-04 | **Author:** Mend Renovate | **PR:** [#2758](https://github.com/apache/polaris/pull/2758)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/stale.yml`

---

### 21. `793a118` - SigV4 Auth Support for Catalog Federation - Part 3: Service Identity Info Injection (#2523)

**Date:** 2025-10-03 | **Author:** Rulin Xing | **PR:** [#2523](https://github.com/apache/polaris/pull/2523)
**Files:** 34 | **Changes:** +1663/-73

**PURPOSE:** Bug fix; Code refactoring; Security enhancement

**WHAT CHANGED:** Modified Admin Service, Connection Management, Entity Management in Core, Runtime Service including test updates

**WHY NEEDED:** to support catalog federation features

**IMPACT:** Affects: Data Model, External Integrations, Management Operations | Large-scale change affecting multiple modules

**Sample files (showing 15 of 34):**
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

**Additional details from commit message:**
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

---

### 22. `3e80675` - [Catalog Federation] Ignore JIT entities when deleting federated catalogs, add integration test for namespace/table-level RBAC (#2690)

**Date:** 2025-10-03 | **Author:** Honah (Jonas) J. | **PR:** [#2690](https://github.com/apache/polaris/pull/2690)
**Files:** 6 | **Changes:** +244/-71

**PURPOSE:** New feature; Code refactoring; Code removal; Test improvement

**WHAT CHANGED:** Modified Persistence Layer in Core, Persistence including test updates

**WHY NEEDED:** to enhance data storage reliability; to support catalog federation features

**IMPACT:** Affects: Database/Storage | Focused change | Requires careful deployment

**Files modified:**
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/ManagementApi.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/CatalogFederationIntegrationTest.java`
- `polaris-core/src/main/java/org/apache/polaris/core/config/FeatureConfiguration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/AtomicOperationMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalMetaStoreManagerImpl.java`
- `runtime/spark-tests/src/intTest/java/org/apache/polaris/service/spark/it/CatalogFederationIT.java`

**Additional details from commit message:**
```
This will be the first step towards JIT entity clean-up:
1. Ignore JIT entities when dropping federated catalog (orphan entities)
2. Register tasks/in-place cleanup JIT entities during catalog drop
3. Add new functionality to PolarisMetastoreManager to support atomic delete non-used JIT entities during revoke.
4. Global Garbage Collector to clean-up unreachable entities (entities with non-existing catalog path/parent)
```

---

### 23. `927bb5e` - Enforce that S3 credentials are vended when requested (#2711)

**Date:** 2025-10-03 | **Author:** Dmitri Bourlatchkov | **PR:** [#2711](https://github.com/apache/polaris/pull/2711)
**Files:** 5 | **Changes:** +88/-9

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** Modified Storage Integration in Core, Runtime Service including test updates

**WHY NEEDED:** to improve cloud storage integration

**IMPACT:** Affects: Cloud Storage | Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/storage/AccessConfig.java`
- `runtime/service/src/intTest/java/org/apache/polaris/service/it/RestCatalogMinIOSpecialIT.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogHandler.java`
- `runtime/service/src/main/java/org/apache/polaris/service/storage/PolarisStorageIntegrationProviderImpl.java`

**Additional details from commit message:**
```
* Add property to `AccessConfig` to indicate whether the backing storage integration can produce credentials.
* Add a check to `IcebergCatalogHandler` (leading to 400) that storage credentials are vended when requested and the backend is capable of vending credentials in principle.
* Update `PolarisStorageIntegrationProviderImpl` to indicate that FILE storage does not support credential vending (requesitng redential vending with FILE storage does not produce any credentials and does not flag ...
```

---

### 24. `b190b77` - Add PolarisResolutionManifestCatalogView.getResolvedCatalogEntity helper (#2750)

**Date:** 2025-10-03 | **Author:** Christopher Lambert | **PR:** [#2750](https://github.com/apache/polaris/pull/2750)
**Files:** 9 | **Changes:** +31/-45

**PURPOSE:** New feature

**WHAT CHANGED:** Modified Admin Service, Persistence Layer in Core, Persistence, Runtime Service including test updates

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage, Management Operations | Focused change | Requires careful deployment

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/resolver/PolarisResolutionManifestCatalogView.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisAdminService.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/generic/GenericTableCatalogHandler.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/generic/PolarisGenericTableCatalog.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogHandler.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/policy/PolicyCatalog.java`
- `runtime/service/src/main/java/org/apache/polaris/service/context/catalog/PolarisCallContextCatalogFactory.java`
- `runtime/service/src/test/java/org/apache/polaris/service/admin/PolarisAdminServiceTest.java`

---

### 25. `94b4961` - Deprecate legacy management endpoints for removal (#2749)

**Date:** 2025-10-03 | **Author:** Alexandre Dutra | **PR:** [#2749](https://github.com/apache/polaris/pull/2749)
**Files:** 2 | **Changes:** +6/-2

**PURPOSE:** Deprecation

**WHAT CHANGED:** in Documentation, Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `CHANGELOG.md`
- `runtime/service/src/main/java/org/apache/polaris/service/legacy/LegacyManagementEndpoints.java`

---

### 26. `b1142b5` - JDBC: Handle schema evolution (#2714)

**Date:** 2025-10-03 | **Author:** Prashant Singh | **PR:** [#2714](https://github.com/apache/polaris/pull/2714)
**Files:** 15 | **Changes:** +396/-54

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified JDBC Persistence in Core, Persistence, Runtime Service including test updates with database schema changes

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Relational Databases | Medium-scale change

**Files modified:**
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

### 27. `d2a607a` - Extract interface for RequestIdGenerator (#2720)

**Date:** 2025-10-03 | **Author:** Alexandre Dutra | **PR:** [#2720](https://github.com/apache/polaris/pull/2720)
**Files:** 9 | **Changes:** +321/-229

**PURPOSE:** New feature

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/tracing/DefaultRequestIdGenerator.java`
- `runtime/service/src/main/java/org/apache/polaris/service/tracing/RequestIdFilter.java`
- `runtime/service/src/main/java/org/apache/polaris/service/tracing/RequestIdGenerator.java`
- `runtime/service/src/main/java/org/apache/polaris/service/tracing/RequestIdResponseFilter.java`
- `runtime/service/src/main/java/org/apache/polaris/service/tracing/TracingFilter.java`
- `runtime/service/src/test/java/org/apache/polaris/service/tracing/DefaultRequestIdGeneratorTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/tracing/RequestIdFilterTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/tracing/RequestIdGeneratorTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/tracing/RequestIdHeaderTest.java`

**Additional details from commit message:**
```
1. Extracted an interface from `RequestIdGenerator`.
2. The `generateRequestId` method now returns a `Uni<String>` in case custom implementations need to perform I/O or other blocking calls during request ID generation.
3. Also addressed comments in #2602.
```

---

### 28. `058f63a` - fix(enhancement): squash commits (#2643)

**Date:** 2025-10-03 | **Author:** Artur Rakhmatulin | **PR:** [#2643](https://github.com/apache/polaris/pull/2643)
**Files:** 7 | **Changes:** +254/-146

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified CLI, Client Library in Documentation, Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API, Command Line Tools, User Documentation | Focused change | May affect API consumers

**Files modified:**
- `client/python/cli/api_client_builder.py`
- `client/python/cli/command/profiles.py`
- `client/python/cli/constants.py`
- `client/python/cli/options/parser.py`
- `client/python/cli/polaris_cli.py`
- `client/python/generate_clients.py`
- `site/content/in-dev/unreleased/command-line-interface.md`

---

### 29. `c3fe141` - Fix javadocs of `PolarisPrincipal.getPrincipalRoles()` (#2752)

**Date:** 2025-10-03 | **Author:** Alexandre Dutra | **PR:** [#2752](https://github.com/apache/polaris/pull/2752)
**Files:** 1 | **Changes:** +1/-7

**PURPOSE:** Bug fix; Documentation update; CI/CD improvement

**WHAT CHANGED:** Modified Service Authentication in Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: API Security | Focused change | May affect API consumers

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/auth/PolarisCredential.java`

---

### 30. `a4e62bd` - fix(enhancement): add .idea, .vscode, .venv to top level .gitignore (#2718)

**Date:** 2025-10-03 | **Author:** Artur Rakhmatulin | **PR:** [#2718](https://github.com/apache/polaris/pull/2718)
**Files:** 1 | **Changes:** +7/-1

**PURPOSE:** Bug fix; New feature

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `.gitignore`

---

### 31. `8f05d1b` - Service: Add events for APIs awaiting API changes (#2712)

**Date:** 2025-10-02 | **Author:** Adnan Hemani | **PR:** [#2712](https://github.com/apache/polaris/pull/2712)
**Files:** 2 | **Changes:** +71/-12

**PURPOSE:** New feature

**WHAT CHANGED:** Modified Admin Service in Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Management Operations | Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisCatalogsEventServiceDelegator.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisPrincipalRolesEventServiceDelegator.java`

---

### 32. `baacb47` - Build: remove code to post-process generated Quarkus jars (#2667)

**Date:** 2025-10-02 | **Author:** Robert Stupp | **PR:** [#2667](https://github.com/apache/polaris/pull/2667)
**Files:** 2 | **Changes:** +0/-61

**PURPOSE:** Bug fix; Code removal; CI/CD improvement

**WHAT CHANGED:** Modified 2 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `build-logic/src/main/kotlin/Utilities.kt`
- `build-logic/src/main/kotlin/polaris-java.gradle.kts`

**Additional details from commit message:**
```
Since Quarkus 3.28, the generated jars use a fixed timestamp for all ZIP entries, so the custom code is no longer necessary.
This PR depends on Quarkus 3.28.
```

---

### 33. `359388e` - Make ResolverFactory + ResolutionManifestFactory request-scoped (#2540)

**Date:** 2025-10-02 | **Author:** Christopher Lambert | **PR:** [#2540](https://github.com/apache/polaris/pull/2540)
**Files:** 19 | **Changes:** +103/-147

**PURPOSE:** Security enhancement

**WHAT CHANGED:** Modified Admin Service, Persistence Layer in Core, Persistence, Runtime Service including test updates

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage, Management Operations | Medium-scale change | Requires careful deployment

**Sample files (showing 15 of 19):**
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

**Additional details from commit message:**
```
note that ideally the `SecurityContext` would also be injected from
the request however our tests around `PolarisAuthzTestBase` are
written in a way that does not easily support this currently.
```

---

### 34. `770a9d7` - fix(deps): update quarkus platform and group to v3.28.2 (#2648)

**Date:** 2025-10-02 | **Author:** Mend Renovate | **PR:** [#2648](https://github.com/apache/polaris/pull/2648)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 35. `c18c38d` - Testing: add test-parallelism-constraint and unify testing constaints (#2726)

**Date:** 2025-10-02 | **Author:** Robert Stupp | **PR:** [#2726](https://github.com/apache/polaris/pull/2726)
**Files:** 6 | **Changes:** +57/-25

**PURPOSE:** New feature; Test improvement

**WHAT CHANGED:** in Runtime Service, Spark Plugin

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Spark Integration | Focused change

**Files modified:**
- `build-logic/src/main/kotlin/polaris-java.gradle.kts`
- `build-logic/src/main/kotlin/polaris-runtime.gradle.kts`
- `plugins/spark/v3.5/integration/build.gradle.kts`
- `runtime/admin/build.gradle.kts`
- `runtime/service/build.gradle.kts`
- `runtime/spark-tests/build.gradle.kts`

**Additional details from commit message:**
```
* "num-available-processory / 4" for `Test` tasks except `test`, optionally configurable via the system property `polaris.intTestParallelism`
* "num-available-processory / 2" for `Test` tasks named `test`, optionally configurable via the system property `polaris.testParallelism`
This change also moves the common fork and heap related settings for Quarkus tests to the `polaris-runtime` build plugin.
Overall, this change helps constraining the CPU/heap pressure to any developer system.
```

---

### 36. `f8aa0fa` - Fix: Build task syncNoticeAndLicense fails on Windows (#2742)

**Date:** 2025-10-02 | **Author:** olsoloviov | **PR:** [#2742](https://github.com/apache/polaris/pull/2742)
**Files:** 1 | **Changes:** +3/-1

**PURPOSE:** Bug fix; CI/CD improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `tools/version/build.gradle.kts`

**Additional details from commit message:**
```
* Fix: Build task syncNoticeAndLicense fails on Windows
```

---

### 37. `97c62cb` - NoSQL: minor change to polaris-core for paging (#2740)

**Date:** 2025-10-02 | **Author:** Robert Stupp | **PR:** [#2740](https://github.com/apache/polaris/pull/2740)
**Files:** 1 | **Changes:** +5/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Persistence Layer in Core, Persistence

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage | Focused change | Requires careful deployment

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/pagination/Page.java`

---

### 38. `aaa81b8` - Remove unused EntityCacheMode (#2662)

**Date:** 2025-10-01 | **Author:** Christopher Lambert | **PR:** [#2662](https://github.com/apache/polaris/pull/2662)
**Files:** 2 | **Changes:** +0/-53

**PURPOSE:** Code removal

**WHAT CHANGED:** Modified Persistence Layer in Core, Persistence

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage | Focused change | Requires careful deployment

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/cache/EntityCacheMode.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/cache/InMemoryEntityCache.java`

---

### 39. `6815de9` - chore(deps): update gradle/actions action to v5 (#2741)

**Date:** 2025-10-01 | **Author:** Mend Renovate | **PR:** [#2741](https://github.com/apache/polaris/pull/2741)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `.github/actions/ci-incr-build-cache-prepare/action.yml`

---

### 40. `f7b5646` - IRC SPEC v3 support: Change the IRC spec to use 1.10 yaml (#2731)

**Date:** 2025-10-01 | **Author:** Prashant Singh | **PR:** [#2731](https://github.com/apache/polaris/pull/2731)
**Files:** 2 | **Changes:** +116/-27

**PURPOSE:** Code modification

**WHAT CHANGED:** in OpenAPI Specs, Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: API Contracts | Focused change | May affect API consumers

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/exception/IcebergExceptionMapper.java`
- `spec/iceberg-rest-catalog-open-api.yaml`

---

### 41. `abf1e35` - CI: Split-jobs - fix store-cache dependencies (#2737)

**Date:** 2025-10-01 | **Author:** Robert Stupp | **PR:** [#2737](https://github.com/apache/polaris/pull/2737)
**Files:** 1 | **Changes:** +2/-0

**PURPOSE:** Bug fix; CI/CD improvement

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/gradle.yml`

---

### 42. `8906672` - CI: GHCR docker.io mirror - testcontainers (#2725)

**Date:** 2025-10-01 | **Author:** Robert Stupp | **PR:** [#2725](https://github.com/apache/polaris/pull/2725)
**Files:** 3 | **Changes:** +68/-0

**PURPOSE:** New feature; Test improvement; Documentation update; CI/CD improvement

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/actions/setup-test-env/action.yml`
- `.github/workflows/gradle.yml`
- `LICENSE`

**Additional details from commit message:**
```
* Disable testcontainers startup checks, saving a few seconds, see https://www.testcontainers.org/features/configuration/#disabling-the-startup-checks
* Use GitHub's docker.io mirror for containers. This works around potential rate limits, and should also be a bit faster (network distance).
```

---

### 43. `6a6dc38` - Build: make jcstress task cacheable (#2734)

**Date:** 2025-10-01 | **Author:** Robert Stupp | **PR:** [#2734](https://github.com/apache/polaris/pull/2734)
**Files:** 1 | **Changes:** +19/-0

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** Modified NoSQL Persistence in Persistence

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: NoSQL Databases | Focused change

**Files modified:**
- `persistence/nosql/idgen/impl/build.gradle.kts`

---

### 44. `12f3ad2` - Split CI jobs, improve overall CI duration (#2733)

**Date:** 2025-10-01 | **Author:** Robert Stupp | **PR:** [#2733](https://github.com/apache/polaris/pull/2733)
**Files:** 2 | **Changes:** +89/-8

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.asf.yaml`
- `.github/workflows/gradle.yml`

**Additional details from commit message:**
```
* `Quarkus Admin Tests` removes 6 minutes from `Quarkus Tests` (leaving 20 minutes total test task runtime)
Intentionally not changing the name of `Quarkus Tests` as it's a required check, changing it would render this change in unmergeable.
Note that the time refer to the test _task_ runtimes. Test task execution overlaps with other tasks.
```

---

### 45. `ea50fe3` - TestEventsListener - reduce memory pressure (#2724)

**Date:** 2025-09-30 | **Author:** Robert Stupp | **PR:** [#2724](https://github.com/apache/polaris/pull/2724)
**Files:** 3 | **Changes:** +170/-158

**PURPOSE:** Test improvement

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/events/listeners/TestPolarisEventListener.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/iceberg/AbstractIcebergCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/iceberg/AbstractIcebergCatalogViewTest.java`

**Additional details from commit message:**
```
Also uses a thread-safe collection now.
```

---

### 46. `80f0456` - Use PrincipalEntity in PolarisMetaStoreManager.createPrincipal (#2518)

**Date:** 2025-09-30 | **Author:** Christopher Lambert | **PR:** [#2518](https://github.com/apache/polaris/pull/2518)
**Files:** 11 | **Changes:** +77/-163

**PURPOSE:** New feature; Code refactoring; CI/CD improvement

**WHAT CHANGED:** Modified Admin Service, Entity Management, JDBC Persistence, Persistence Layer in Core, Persistence, Runtime Service including test updates

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Data Model, Database/Storage, Management Operations, Relational Databases | Medium-scale change | Requires careful deployment

**Files modified:**
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

**Additional details from commit message:**
```
if we pass and return a more specific `PrincipalEntity` we can simplify
the surrounding code and implementation
```

---

### 47. `5811b12` - Build: remove unnecessary explicit vertx-core dependency (#2730)

**Date:** 2025-09-30 | **Author:** Robert Stupp | **PR:** [#2730](https://github.com/apache/polaris/pull/2730)
**Files:** 2 | **Changes:** +5/-3

**PURPOSE:** Code removal; CI/CD improvement

**WHAT CHANGED:** Modified NoSQL Persistence in Persistence

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: NoSQL Databases | Focused change

**Files modified:**
- `gradle/libs.versions.toml`
- `persistence/nosql/async/vertx/build.gradle.kts`

---

### 48. `6844069` - Fix RDS devservices config + adopt for `:polaris-admin:test` (#2723)

**Date:** 2025-09-30 | **Author:** Robert Stupp | **PR:** [#2723](https://github.com/apache/polaris/pull/2723)
**Files:** 2 | **Changes:** +5/-5

**PURPOSE:** Bug fix; Test improvement; CI/CD improvement

**WHAT CHANGED:** Modified 2 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/admin/src/main/resources/application.properties`
- `runtime/defaults/src/main/resources/application.properties`

**Additional details from commit message:**
```
* Disables devservices for `:polaris-admin` tests as well, which is necessary to _not_ spin up test containers.
* Use the explicit devservices-config as everywhere else.
The first bullet point can cause excessive memory usage, especially with more test classes, eventually killing the whole GH runner.
```

---

### 49. `dedda29` - NoSQL persistence: add Java/Vert.X executor abstraction layer (#2527)

**Date:** 2025-09-30 | **Author:** Robert Stupp | **PR:** [#2527](https://github.com/apache/polaris/pull/2527)
**Files:** 29 | **Changes:** +1941/-0

**PURPOSE:** New feature

**WHAT CHANGED:** Modified NoSQL Persistence in Documentation, Persistence including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: NoSQL Databases, User Documentation | Large-scale change affecting multiple modules

**Sample files (showing 15 of 29):**
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

---

### 50. `2f0c7a4` - Generate Request IDs (if not specified); Return Request ID as a Header (#2602)

**Date:** 2025-09-30 | **Author:** Adnan Hemani | **PR:** [#2602](https://github.com/apache/polaris/pull/2602)
**Files:** 9 | **Changes:** +402/-10

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/config/FilterPriorities.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/listeners/inmemory/InMemoryBufferEventListener.java`
- `runtime/service/src/main/java/org/apache/polaris/service/logging/LoggingMDCFilter.java`
- `runtime/service/src/main/java/org/apache/polaris/service/tracing/RequestIdFilter.java`
- `runtime/service/src/main/java/org/apache/polaris/service/tracing/RequestIdGenerator.java`
- `runtime/service/src/main/java/org/apache/polaris/service/tracing/RequestIdResponseFilter.java`
- `runtime/service/src/main/java/org/apache/polaris/service/tracing/TracingFilter.java`
- `runtime/service/src/test/java/org/apache/polaris/service/tracing/RequestIdGeneratorTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/tracing/RequestIdHeaderTest.java`

---

### 51. `3b4b995` - Fix `delegationModes` parameter propagation in `createTableStaged()` (#2713)

**Date:** 2025-09-29 | **Author:** Dmitri Bourlatchkov | **PR:** [#2713](https://github.com/apache/polaris/pull/2713)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix

**WHAT CHANGED:** in Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogHandler.java`

**Additional details from commit message:**
```
The bugfix part #2711 is extracted here since #2711 proved to be
non-trivial and may require extra time.
* Use the `delegationModes` method parameter as intended (as opposed
  to a local constant).
```

---

### 52. `aeae51f` - [Catalog Federation] Add feature flag to disallow setting sub-RBAC for federated catalog at catalog level (#2696)

**Date:** 2025-09-29 | **Author:** Honah (Jonas) J. | **PR:** [#2696](https://github.com/apache/polaris/pull/2696)
**Files:** 4 | **Changes:** +172/-2

**PURPOSE:** New feature

**WHAT CHANGED:** Modified Admin Service in Core, Documentation, Runtime Service including test updates

**WHY NEEDED:** to support catalog federation features

**IMPACT:** Affects: Management Operations, User Documentation | Focused change

**Files modified:**
- `CHANGELOG.md`
- `polaris-core/src/main/java/org/apache/polaris/core/config/FeatureConfiguration.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisServiceImpl.java`
- `runtime/service/src/test/java/org/apache/polaris/service/admin/ManagementServiceTest.java`

**Additional details from commit message:**
```
This PR add a feature flag, ALLOW_SETTING_SUB_CATALOG_RBAC_FOR_FEDERATED_CATALOGS to allow owner to disable catalog level setting polaris.config.enable-sub-catalog-rbac-for-federated-catalogs
```

---

### 53. `5ea215a` - Add fallback in case the VERSION table is not present (#2653)

**Date:** 2025-09-29 | **Author:** Eric Maynard | **PR:** [#2653](https://github.com/apache/polaris/pull/2653)
**Files:** 5 | **Changes:** +30/-2

**PURPOSE:** Bug fix; New feature; CI/CD improvement

**WHAT CHANGED:** Modified JDBC Persistence in Core, Persistence

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Relational Databases | Focused change

**Files modified:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/DatasourceOperations.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcMetaStoreManagerFactory.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/models/SchemaVersion.java`
- `polaris-core/src/main/java/org/apache/polaris/core/config/BehaviorChangeConfiguration.java`

**Additional details from commit message:**
```
* wire up
* pastefix
* change to postgres specific code
```

---

### 54. `d8d0f81` - Client: fix integration testing (#2700)

**Date:** 2025-09-29 | **Author:** Yong Zheng | **PR:** [#2700](https://github.com/apache/polaris/pull/2700)
**Files:** 3 | **Changes:** +2/-10

**PURPOSE:** Bug fix; Test improvement

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/python-client.yml`
- `Makefile`
- `runtime/server/build.gradle.kts`

---

### 55. `bd94b25` - chore(deps): update gradle/actions digest to 748248d (#2708)

**Date:** 2025-09-29 | **Author:** Mend Renovate | **PR:** [#2708](https://github.com/apache/polaris/pull/2708)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `.github/actions/ci-incr-build-cache-prepare/action.yml`

---

### 56. `2cfa41b` - Docs/improve idp documentation (#2695)

**Date:** 2025-09-29 | **Author:** olsoloviov | **PR:** [#2695](https://github.com/apache/polaris/pull/2695)
**Files:** 12 | **Changes:** +231/-123

**PURPOSE:** Bug fix; Documentation update

**WHAT CHANGED:** Modified CLI in Documentation, Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Command Line Tools, User Documentation | Medium-scale change

**Files modified:**
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

**Additional details from commit message:**
```
* Separate IDP docs for usage and development
* - Add telemetry config example
- Fix link to getting started from landing page
- Fix mentioning role-arn as required
* Fix some relative links (local Hugo resolves them properly, but PR auto checks still fails)
* Docs: narrow down --role-arn usage for AWS S3 only; fix a link in keycloak guide.
* Docs: fix a link in keycloak guide.
```

---

### 57. `f97c5eb` - Support S3 storage that does not have STS (#2672)

**Date:** 2025-09-29 | **Author:** Dmitri Bourlatchkov | **PR:** [#2672](https://github.com/apache/polaris/pull/2672)
**Files:** 9 | **Changes:** +118/-53

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Admin Service, Entity Management, Storage Integration in Core, Documentation, OpenAPI Specs, Runtime Service including test updates

**WHY NEEDED:** to improve cloud storage integration

**IMPACT:** Affects: API Contracts, Cloud Storage, Data Model, Management Operations, User Documentation | Focused change | May affect API consumers

**Files modified:**
- `CHANGELOG.md`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/CatalogEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/aws/AwsCredentialsStorageIntegration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/aws/AwsStorageConfigurationInfo.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/aws/AwsStorageConfigurationInfoTest.java`
- `runtime/service/src/intTest/java/org/apache/polaris/service/it/RestCatalogMinIOSpecialIT.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisServiceImpl.java`
- `runtime/service/src/test/java/org/apache/polaris/service/admin/ManagementServiceTest.java`
- `spec/polaris-management-service.yml`

**Additional details from commit message:**
```
This change is backward compatible with old catalogs that have storage configuration for S3 systems with STS.
* Add new property to S3 storage config: `stsUnavailable` (defaults to "available").
* Do not call STS when unavailable in `AwsCredentialsStorageIntegration`, but still put other properties (e.g. s3.endpoint) into `AccessConfig`
Relates to #2615
Relates #2207
```

---

### 58. `0764745` - Client: add credential reset option (#2698)

**Date:** 2025-09-28 | **Author:** Yong Zheng | **PR:** [#2698](https://github.com/apache/polaris/pull/2698)
**Files:** 9 | **Changes:** +197/-2

**PURPOSE:** Bug fix; New feature

**WHAT CHANGED:** Modified CLI, Client Library in Documentation, Python Client including test updates

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API, Command Line Tools, User Documentation | Focused change | May affect API consumers

**Files modified:**
- `client/python/cli/command/__init__.py`
- `client/python/cli/command/principals.py`
- `client/python/cli/constants.py`
- `client/python/cli/options/option_tree.py`
- `client/python/integration_tests/conftest.py`
- `client/python/integration_tests/test_catalog_apis.py`
- `client/python/integration_tests/test_management_apis.py`
- `client/python/test/test_cli_parsing.py`
- `site/content/in-dev/unreleased/command-line-interface.md`

**Additional details from commit message:**
```
* Client: add credential reset option
* Client: add credential reset option
* Add integration testing
* Fix lint
```

---

### 59. `f2e3848` - Fix a race condition in sendNotification where concurrent parent-namespace creation causes failures (#2693)

**Date:** 2025-09-26 | **Author:** Dennis Huo | **PR:** [#2693](https://github.com/apache/polaris/pull/2693)
**Files:** 2 | **Changes:** +101/-11

**PURPOSE:** Bug fix; CI/CD improvement

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/iceberg/AbstractIcebergCatalogTest.java`

**Additional details from commit message:**
```
The semantics of the createNonExistingNamespaces method used during sendNotification were supposed
to be "create if needed". However, the behavior ended up surfacing an AlreadyExistsException
if multiple concurrent sendNotification attempts were made for a brand-new namespace (where
the notifications may be different tables). This would cause a table sync to fail if a sibling
table was being synced at the same time, even though the new table should successfully get created
under the shared na...
```

---

### 60. `c4fee3d` - Remove unused `name` arg from findCatalogByName in PolarisAdminService (#2691)

**Date:** 2025-09-26 | **Author:** Honah (Jonas) J. | **PR:** [#2691](https://github.com/apache/polaris/pull/2691)
**Files:** 1 | **Changes:** +19/-22

**PURPOSE:** Code removal

**WHAT CHANGED:** Modified Admin Service in Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Management Operations | Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisAdminService.java`

**Additional details from commit message:**
```
* Rename for better readability
```

---

### 61. `965bd53` - Enhancement : adding support for Aurora postgres AWS IAM authentication (#2650)

**Date:** 2025-09-26 | **Author:** fabio-rizzo-01 | **PR:** [#2650](https://github.com/apache/polaris/pull/2650)
**Files:** 5 | **Changes:** +13/-1

**PURPOSE:** New feature

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `CHANGELOG.md`
- `gradle/libs.versions.toml`
- `runtime/admin/src/main/resources/application.properties`
- `runtime/common/build.gradle.kts`
- `runtime/defaults/src/main/resources/application.properties`

---

### 62. `149aaa6` - Auth: reorganize internal authentication components (#2634)

**Date:** 2025-09-26 | **Author:** Alexandre Dutra | **PR:** [#2634](https://github.com/apache/polaris/pull/2634)
**Files:** 33 | **Changes:** +298/-436

**PURPOSE:** Security enhancement

**WHAT CHANGED:** Modified Service Authentication in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: API Security | Large-scale change affecting multiple modules | May affect API consumers

**Sample files (showing 15 of 33):**
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

**Additional details from commit message:**
```
Summary of changes:
- Moved all internal authentication components to the `org.apache.polaris.service.auth.internal` package and subpackages
- Reduced visibility of utility classes
- Renamed `TokenBroker` class hierarchy to stick to the naming standard: `<Algorithm>JWTBroker`
- Introduced `@PolarisImmutable` whenever appropriate
- Removed unused `NoneTokenBrokerFactory` (we already have `DisabledOAuth2ApiService`)
- Removed unused `TokenBrokerFactoryConfig`
```

---

### 63. `19742cc` - Fix & enhancements to the Events API hierarchy (#2629)

**Date:** 2025-09-26 | **Author:** Alexandre Dutra | **PR:** [#2629](https://github.com/apache/polaris/pull/2629)
**Files:** 12 | **Changes:** +1247/-457

**PURPOSE:** Bug fix; New feature; CI/CD improvement

**WHAT CHANGED:** Modified Admin Service, REST API in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Client Integration, Management Operations | Medium-scale change

**Files modified:**
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

**Additional details from commit message:**
```
- Turned `PolarisEventListener` into an interface to facilitate implementation / mocking
- Added missing `implements PolarisEvent` to many event records
- Removed unused method overrides
- Added missing method overrides to `TestPolarisEventListener`
```

---

### 64. `0492496` - Publish Develocity builds scans for PRs and local use (#2596)

**Date:** 2025-09-26 | **Author:** Robert Stupp | **PR:** [#2596](https://github.com/apache/polaris/pull/2596)
**Files:** 8 | **Changes:** +101/-16

**PURPOSE:** Documentation update; CI/CD improvement

**WHAT CHANGED:** in CI/CD, Documentation

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation, User Documentation | Focused change

**Files modified:**
- `.github/workflows/gradle.yml`
- `.github/workflows/helm.yml`
- `.github/workflows/nightly.yml`
- `.github/workflows/python-client.yml`
- `.github/workflows/regtest.yml`
- `.github/workflows/spark_client_regtests.yml`
- `README.md`
- `settings.gradle.kts`

**Additional details from commit message:**
```
CI build scans in the `apache/polaris` repo against branches and tags and having access to the ASF's Develocity secret continue to publish to the ASF's Develocity instance (no behavioral change).
All other build scans are published to Gradle's public Develocity instance:
- Build scans from local developer (non-CI) runs are only published, if Gradle is invoked with the `--scan` option.
- Build scans from or targeting another repository than `apache/polaris` do need be enabled explicity by acce...
```

---

### 65. `1e4e1be` - chore(deps): update postgres docker tag to v18 (#2692)

**Date:** 2025-09-26 | **Author:** Mend Renovate | **PR:** [#2692](https://github.com/apache/polaris/pull/2692)
**Files:** 2 | **Changes:** +2/-2

**PURPOSE:** Documentation update

**WHAT CHANGED:** Modified 2 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `getting-started/assets/postgres/docker-compose-postgres.yml`
- `runtime/admin/src/testFixtures/resources/org/apache/polaris/admintool/Dockerfile-postgres-version`

---

### 66. `41968a7` - Make ENABLE_SUB_CATALOG_RBAC_FOR_FEDERATED_CATALOGS configurable per catalog (#2688)

**Date:** 2025-09-25 | **Author:** Honah (Jonas) J. | **PR:** [#2688](https://github.com/apache/polaris/pull/2688)
**Files:** 4 | **Changes:** +24/-4

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Admin Service in Core, Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Management Operations | Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/config/FeatureConfiguration.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisAdminService.java`
- `runtime/service/src/test/java/org/apache/polaris/service/admin/PolarisAdminServiceTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/admin/PolarisAuthzTestBase.java`

---

### 67. `8ea68e1` - Docs: Add more details about v1 schema user to upgrade from 1.0 to 1.1 (#2674)

**Date:** 2025-09-25 | **Author:** Prashant Singh | **PR:** [#2674](https://github.com/apache/polaris/pull/2674)
**Files:** 2 | **Changes:** +6/-0

**PURPOSE:** New feature; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `CHANGELOG.md`
- `site/content/downloads/_index.md`

---

### 68. `f1d71a9` - (Based on PR#2223)Support Namespace/Table level RBAC for external passthrough catalogs (#2673)

**Date:** 2025-09-25 | **Author:** Honah (Jonas) J. | **PR:** [#2673](https://github.com/apache/polaris/pull/2673)
**Files:** 5 | **Changes:** +775/-34

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Admin Service in Core, Runtime Service including test updates

**WHY NEEDED:** to support catalog federation features

**IMPACT:** Affects: Management Operations | Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/config/FeatureConfiguration.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisAdminService.java`
- `runtime/service/src/test/java/org/apache/polaris/service/admin/PolarisAdminServiceAuthzTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/admin/PolarisAdminServiceTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/admin/PolarisAuthzTestBase.java`

**Additional details from commit message:**
```
Based on Option 1 discussed in the RBAC section of catalog federation design doc.
In the future, we could remove calls to PolarisEntity.Builder() and replace them with entities fetched from the remote catalog. (enabling Option 2).
---------
Co-authored-by: Pooja Nilangekar <poojan@umd.edu>
```

---

### 69. `a756b57` - fix(deps): update immutables to v2.11.4 (#2679)

**Date:** 2025-09-25 | **Author:** Mend Renovate | **PR:** [#2679](https://github.com/apache/polaris/pull/2679)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 70. `53aa531` - fix(auth): let ServiceFailureException bubble up for proper HTTP status mapping during auth (#2670)

**Date:** 2025-09-24 | **Author:** Sushant Raikar | **PR:** [#2670](https://github.com/apache/polaris/pull/2670)
**Files:** 2 | **Changes:** +26/-0

**PURPOSE:** Bug fix; Security enhancement

**WHAT CHANGED:** Modified Service Authentication in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: API Security | Focused change | May affect API consumers

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/auth/AuthenticatingAugmentor.java`
- `runtime/service/src/test/java/org/apache/polaris/service/auth/AuthenticatingAugmentorTest.java`

---

### 71. `7409939` - Doc: Add breaking changes section for 1.1 release (#2654)

**Date:** 2025-09-24 | **Author:** Prashant Singh | **PR:** [#2654](https://github.com/apache/polaris/pull/2654)
**Files:** 2 | **Changes:** +29/-0

**PURPOSE:** New feature; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** NOTE: This may include breaking changes

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `CHANGELOG.md`
- `site/content/downloads/_index.md`

---

### 72. `2e4afa8` - Minio testcontainer: allow setting a specific region (#2664)

**Date:** 2025-09-24 | **Author:** Robert Stupp | **PR:** [#2664](https://github.com/apache/polaris/pull/2664)
**Files:** 4 | **Changes:** +22/-11

**PURPOSE:** Test improvement; CI/CD improvement

**WHAT CHANGED:** including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `tools/minio-testcontainer/src/main/java/org/apache/polaris/test/minio/Minio.java`
- `tools/minio-testcontainer/src/main/java/org/apache/polaris/test/minio/MinioAccess.java`
- `tools/minio-testcontainer/src/main/java/org/apache/polaris/test/minio/MinioContainer.java`
- `tools/minio-testcontainer/src/main/java/org/apache/polaris/test/minio/MinioExtension.java`

---

### 73. `b1eb9bd` - fix: fix broken markdown-link-check CI job after #2611 got merged (#2655)

**Date:** 2025-09-23 | **Author:** Artur Rakhmatulin | **PR:** [#2655](https://github.com/apache/polaris/pull/2655)
**Files:** 2 | **Changes:** +2/-2

**PURPOSE:** Bug fix; CI/CD improvement

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `getting-started/keycloak/README.md`
- `site/content/in-dev/unreleased/managing-security/external-idp/keycloak-idp.md`

---

### 74. `3e08c90` - [OpenAPI Modification] Return created objects (#2603)

**Date:** 2025-09-22 | **Author:** Adnan Hemani | **PR:** [#2603](https://github.com/apache/polaris/pull/2603)
**Files:** 4 | **Changes:** +19/-5

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Admin Service in Documentation, OpenAPI Specs, Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: API Contracts, Management Operations, User Documentation | Focused change | May affect API consumers

**Files modified:**
- `CHANGELOG.md`
- `regtests/t_catalog_federation/src/catalog_federation.sh`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisServiceImpl.java`
- `spec/polaris-management-service.yml`

---

### 75. `5ca3fdc` - Always propagate non-credential properties from AccessConfig to clients (#2615)

**Date:** 2025-09-22 | **Author:** Dmitri Bourlatchkov | **PR:** [#2615](https://github.com/apache/polaris/pull/2615)
**Files:** 3 | **Changes:** +96/-34

**PURPOSE:** New feature

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/intTest/java/org/apache/polaris/service/it/RestCatalogMinIOSpecialIT.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogHandler.java`
- `runtime/service/src/testFixtures/java/org/apache/polaris/service/TestServices.java`

**Additional details from commit message:**
```
This change builds on top of #2589 and further prepares Polaris code to
support non-STS S3 implementations for #2589.
For S3 implementations that do have STS, this change enables clients to
run with local credentials (no credential vending) and still receive
endpoint configuration from the catalog.
* Call `SupportsCredentialDelegation.getAccessConfig()` on all relevant
  create/load requests (previously it was called only when
  `vended-credentials` was requested
* Always sent `AccessConfig.e...
```

---

### 76. `da8c9af` - fix(deps): update quarkus platform and group (#2595)

**Date:** 2025-09-22 | **Author:** Mend Renovate | **PR:** [#2595](https://github.com/apache/polaris/pull/2595)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 77. `e53a352` - chore(events): unify in-memory buffer listeners implementations (#2628)

**Date:** 2025-09-22 | **Author:** Alexandre Dutra | **PR:** [#2628](https://github.com/apache/polaris/pull/2628)
**Files:** 7 | **Changes:** +14/-541

**PURPOSE:** New feature

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/events/listeners/InMemoryBufferPolarisPersistenceEventListener.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/listeners/inmemory/{InMemoryEventListener.java => InMemoryBufferEventListener.java}`
- `runtime/service/src/main/java/org/apache/polaris/service/events/listeners/{ => inmemory}/InMemoryBufferEventListenerConfiguration.java`
- `runtime/service/src/test/java/org/apache/polaris/service/events/listeners/InMemoryBufferPolarisPersistenceEventListenerTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/events/listeners/inmemory/{InMemoryEventListenerBufferSizeTest.java => InMemoryBufferEventListenerBufferSizeTest.java}`
- `runtime/service/src/test/java/org/apache/polaris/service/events/listeners/inmemory/{InMemoryEventListenerBufferTimeTest.java => InMemoryBufferEventListenerBufferTimeTest.java}`
- `runtime/service/src/test/java/org/apache/polaris/service/events/listeners/inmemory/{InMemoryEventListenerTestBase.java => InMemoryBufferEventListenerTestBase.java}`

---

### 78. `b26e97c` - fix(deps): update mockito monorepo to v5.20.0 (#2641)

**Date:** 2025-09-22 | **Author:** Mend Renovate | **PR:** [#2641](https://github.com/apache/polaris/pull/2641)
**Files:** 1 | **Changes:** +2/-2

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 79. `7f5fb06` - Azure: Fix azure expires at prefix for the credentials refresh (#2633)

**Date:** 2025-09-19 | **Author:** Prashant Singh | **PR:** [#2633](https://github.com/apache/polaris/pull/2633)
**Files:** 4 | **Changes:** +24/-6

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified Storage Integration in Core, Documentation including test updates

**WHY NEEDED:** to improve cloud storage integration

**IMPACT:** Affects: Cloud Storage, User Documentation | Focused change

**Files modified:**
- `CHANGELOG.md`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/StorageAccessProperty.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/azure/AzureCredentialsStorageIntegration.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/azure/AzureCredentialsStorageIntegrationTest.java`

---

### 80. `01f4baa` - Re-add CHANGELOG.md entry for #2197 (#2638)

**Date:** 2025-09-19 | **Author:** Dmitri Bourlatchkov | **PR:** [#2638](https://github.com/apache/polaris/pull/2638)
**Files:** 1 | **Changes:** +2/-0

**PURPOSE:** New feature

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `CHANGELOG.md`

---

### 81. `a3a87e7` - CHANGELOG: Freeze change log for 1.1 and clear out unreleased version (#2635)

**Date:** 2025-09-19 | **Author:** Prashant Singh | **PR:** [#2635](https://github.com/apache/polaris/pull/2635)
**Files:** 1 | **Changes:** +45/-59

**PURPOSE:** Code modification

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `CHANGELOG.md`

---

### 82. `553cb06` - Service: Add Events for PolarisServiceImpl APIs (#2482)

**Date:** 2025-09-19 | **Author:** Adnan Hemani | **PR:** [#2482](https://github.com/apache/polaris/pull/2482)
**Files:** 11 | **Changes:** +801/-66

**PURPOSE:** New feature

**WHAT CHANGED:** Modified Admin Service in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Management Operations | Medium-scale change

**Files modified:**
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

### 83. `d1d359a` - Remove ActiveRolesProvider (#2390)

**Date:** 2025-09-19 | **Author:** Alexandre Dutra | **PR:** [#2390](https://github.com/apache/polaris/pull/2390)
**Files:** 18 | **Changes:** +456/-559

**PURPOSE:** Code removal; CI/CD improvement

**WHAT CHANGED:** Modified Service Authentication in Documentation, Helm Charts, Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: API Security, Kubernetes Deployment, User Documentation | Medium-scale change | May affect API consumers

**Sample files (showing 15 of 18):**
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

**Additional details from commit message:**
```
- As proposed on the ML, `ActiveRolesProvider` is removed, and `DefaultActiveRolesProvider` is merged into `DefaultAuthenticator`. `ActiveRolesAugmentor` is also merged into `AuthenticatingAugmentor`.
- The implicit convention that no roles in credentials == all roles requested is removed as it is ambiguous. Credentials must explicitly include the `PRINCIPAL_ROLE:ALL` pseudo-role to request all roles available.
- PersistedPolarisPrincipal is removed. It existed merely as a means of passing th...
```

---

### 84. `ae9f1a2` - main: bump to 1.2.0-incubating-SNAPSHOT (#2624)

**Date:** 2025-09-19 | **Author:** Robert Stupp | **PR:** [#2624](https://github.com/apache/polaris/pull/2624)
**Files:** 7 | **Changes:** +10/-10

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Client Library in Documentation, Helm Charts, Python Client, Spark Plugin

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API, Kubernetes Deployment, Spark Integration, User Documentation | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`
- `helm/polaris/Chart.yaml`
- `helm/polaris/README.md`
- `plugins/spark/README.md`
- `plugins/spark/v3.5/getting-started/notebooks/SparkPolaris.ipynb`
- `site/content/in-dev/unreleased/helm.md`
- `version.txt`

---

### 85. `d91dbd0` - Include principal name in Polaris tokens (#2389)

**Date:** 2025-09-19 | **Author:** Alexandre Dutra | **PR:** [#2389](https://github.com/apache/polaris/pull/2389)
**Files:** 8 | **Changes:** +105/-95

**PURPOSE:** New feature; Code refactoring; CI/CD improvement

**WHAT CHANGED:** Modified Service Authentication in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: API Security | Focused change | May affect API consumers

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/auth/DecodedToken.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/InternalPolarisToken.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/JWTBroker.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/NoneTokenBrokerFactory.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/TokenBroker.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/internal/InternalAuthenticationMechanism.java`
- `runtime/service/src/test/java/org/apache/polaris/service/auth/DefaultAuthenticatorTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/auth/internal/InternalAuthenticationMechanismTest.java`

**Additional details from commit message:**
```
Summary of changes:
- Instead of including the principal id twice in the token, the principal name is now used as the subject claim. While the default authenticator doesn't need the principal name and works with just the principal id, not having the "real" principal name available could be a problem for other authenticator implementations.
- `DecodedToken` has been refactored and renamed to `InternalPolarisCredential`. It is also now a package-private component.
- `TokenBroker.verify()` now r...
```

---

### 86. `f334d1a` - Remove numeric identifier from PolarisPrincipal (#2388)

**Date:** 2025-09-19 | **Author:** Alexandre Dutra | **PR:** [#2388](https://github.com/apache/polaris/pull/2388)
**Files:** 5 | **Changes:** +34/-37

**PURPOSE:** Code removal; CI/CD improvement

**WHAT CHANGED:** Modified Admin Service, Authentication/Authorization, Persistence Layer, Service Authentication in Core, Persistence, Runtime Service including test updates

**WHY NEEDED:** to improve security and access control; to enhance data storage reliability

**IMPACT:** Affects: API Security, Database/Storage, Management Operations, Security | Focused change | Security-sensitive change | May affect API consumers | Requires careful deployment

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/auth/PolarisPrincipal.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/resolver/Resolver.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisAdminService.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/PersistedPolarisPrincipal.java`
- `runtime/service/src/test/java/org/apache/polaris/service/admin/PolarisAuthzTestBase.java`

**Additional details from commit message:**
```
- In the `Resolver`. Instead, the `Resolver` now performs a lookup by principal name.
- In  `PolarisAdminService`. Instead, the code now compares the principal name against the entity name.
Note: the lookup in the `Resolver` is still necessary, because the `Resolver` also needs to fetch the grant records.
```

---

### 87. `ce015b6` - Unify create/loadTable call paths (#2589)

**Date:** 2025-09-19 | **Author:** Dmitri Bourlatchkov | **PR:** [#2589](https://github.com/apache/polaris/pull/2589)
**Files:** 2 | **Changes:** +119/-93

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** in Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogAdapter.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogHandler.java`

**Additional details from commit message:**
```
to REST Catalog clients for #2207 this PR unifies calls paths
for create/load table operations.
This change does not have any differences in authorization.
This change is not expecte to have any material behaviour
differences to the affected code paths.
The main idea is to consolidate decision-making for that
to include into REST responses and use method parameters
like `EnumSet<AccessDelegationMode> delegationModes` for
driving those decisions.
```

---

### 88. `2c77fbf` - chore(errorprone): Enabling EqualsGetClass, PatternMatchingInstanceof, and UnusedMethod in ErrorProne (#2600)

**Date:** 2025-09-19 | **Author:** Adam Christian | **PR:** [#2600](https://github.com/apache/polaris/pull/2600)
**Files:** 22 | **Changes:** +47/-237

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Admin Service, Entity Management, Persistence Layer, Policy Management, Service Authentication in Core, Persistence, Runtime Service, Spark Plugin including test updates

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: API Security, Access Control, Data Model, Database/Storage, Management Operations, Spark Integration | Large-scale change affecting multiple modules | May affect API consumers | Requires careful deployment

**Sample files (showing 15 of 22):**
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

---

### 89. `4e2facb` - Introduce alternate in-memory buffering event listener (#2574)

**Date:** 2025-09-19 | **Author:** Alexandre Dutra | **PR:** [#2574](https://github.com/apache/polaris/pull/2574)
**Files:** 7 | **Changes:** +425/-12

**PURPOSE:** Code modification

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/build.gradle.kts`
- `runtime/service/src/main/java/org/apache/polaris/service/events/listeners/InMemoryBufferPolarisPersistenceEventListener.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/listeners/PolarisPersistenceEventListener.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/listeners/inmemory/InMemoryEventListener.java`
- `runtime/service/src/test/java/org/apache/polaris/service/events/listeners/inmemory/InMemoryEventListenerBufferSizeTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/events/listeners/inmemory/InMemoryEventListenerBufferTimeTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/events/listeners/inmemory/InMemoryEventListenerTestBase.java`

---

### 90. `57b3351` - Update registry.access.redhat.com/ubi9/openjdk-21-runtime Docker tag to v1.23-6.1758133907 (#2612)

**Date:** 2025-09-19 | **Author:** Mend Renovate | **PR:** [#2612](https://github.com/apache/polaris/pull/2612)
**Files:** 2 | **Changes:** +2/-2

**PURPOSE:** Documentation update

**WHAT CHANGED:** Modified 2 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/admin/src/main/docker/Dockerfile.jvm`
- `runtime/server/src/main/docker/Dockerfile.jvm`

---

### 91. `cd1971a` - Add Code of Conduct entry to the ASF menu (#2537)

**Date:** 2025-09-19 | **Author:** JB Onofré | **PR:** [#2537](https://github.com/apache/polaris/pull/2537)
**Files:** 5 | **Changes:** +19/-130

**PURPOSE:** New feature

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `CODE_OF_CONDUCT.md`
- `site/content/code-of-conduct.md`
- `site/content/community/_index.adoc`
- `site/content/community/code-of-conduct.md`
- `site/hugo.yaml`

**Additional details from commit message:**
```
* Update site/hugo.yaml
Co-authored-by: Robert Stupp <snazy@snazy.de>
---------
Co-authored-by: Robert Stupp <snazy@snazy.de>
```

---

### 92. `7af79e5` - docs(README): Updating the READMEs to Reflect the Project Structure (#2599)

**Date:** 2025-09-18 | **Author:** Adam Christian | **PR:** [#2599](https://github.com/apache/polaris/pull/2599)
**Files:** 4 | **Changes:** +56/-17

**PURPOSE:** Documentation update

**WHAT CHANGED:** Modified NoSQL Persistence in Documentation, Persistence, Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: NoSQL Databases, User Documentation | Focused change

**Files modified:**
- `README.md`
- `persistence/nosql/idgen/impl/src/main/java/org/apache/polaris/ids/impl/SnowflakeIdGeneratorFactory.java`
- `runtime/service/README.md`
- `site/content/in-dev/unreleased/metastores.md`

---

### 93. `ab91f27` - Add doc notes about EclipseLink removal (#2605)

**Date:** 2025-09-18 | **Author:** Dmitri Bourlatchkov | **PR:** [#2605](https://github.com/apache/polaris/pull/2605)
**Files:** 3 | **Changes:** +8/-2

**PURPOSE:** New feature; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `CHANGELOG.md`
- `README.md`
- `site/content/in-dev/unreleased/metastores.md`

---

### 94. `333eb3b` - Avoid calling deprecated `TableMetadataParser.read(FileIO, InputFile)` method. (#2609)

**Date:** 2025-09-18 | **Author:** Dmitri Bourlatchkov | **PR:** [#2609](https://github.com/apache/polaris/pull/2609)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Deprecation

**WHAT CHANGED:** in Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`

---

### 95. `d8602f6` - CI/Caching: Fix Gradle cache retention (#2604)

**Date:** 2025-09-18 | **Author:** Robert Stupp | **PR:** [#2604](https://github.com/apache/polaris/pull/2604)
**Files:** 3 | **Changes:** +25/-8

**PURPOSE:** Bug fix; Code refactoring; CI/CD improvement

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/actions/ci-incr-build-cache-prepare/action.yml`
- `.github/actions/ci-incr-build-cache-save/action.yml`
- `.github/workflows/gradle.yml`

**Additional details from commit message:**
```
Nowadays, that action triggers a "noop build" to explicitly trigger stale cache entry cleanup, but uses somewhat different defaults than [described here](https://docs.gradle.org/current/userguide/directory_layout.html#dir:gradle_user_home:configure_cache_cleanup).
This change adds an explicit configuration for Gradle cache cleanup/retention with reasonable values considering the total 10GB limit for all GitHub caches per repository.
The change described above lead to a behavioral change, whic...
```

---

### 96. `f9a2165` - Add content to contributing guidelines. (#2536)

**Date:** 2025-09-18 | **Author:** JB Onofré | **PR:** [#2536](https://github.com/apache/polaris/pull/2536)
**Files:** 3 | **Changes:** +56/-4

**PURPOSE:** New feature

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `CONTRIBUTING.md`
- `site/content/community/community-guidelines.md`
- `site/hugo.yaml`

---

### 97. `149c19e` - Add client build to Gradle (#2590)

**Date:** 2025-09-17 | **Author:** Yong Zheng | **PR:** [#2590](https://github.com/apache/polaris/pull/2590)
**Files:** 2 | **Changes:** +23/-2

**PURPOSE:** New feature; CI/CD improvement

**WHAT CHANGED:** Modified 2 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `Makefile`
- `build.gradle.kts`

**Additional details from commit message:**
```
* Add overwrite option for python build
* Match client build behavior
```

---

### 98. `8f1614c` - Bump: Iceberg client in tests and documentation to 1.10 (#2588)

**Date:** 2025-09-17 | **Author:** Prashant Singh | **PR:** [#2588](https://github.com/apache/polaris/pull/2588)
**Files:** 10 | **Changes:** +14/-14

**PURPOSE:** Documentation update

**WHAT CHANGED:** in Documentation, Spark Plugin

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Spark Integration, User Documentation | Focused change

**Files modified:**
- `getting-started/eclipselink/docker-compose.yml`
- `getting-started/jdbc/docker-compose.yml`
- `getting-started/spark/notebooks/SparkPolaris.ipynb`
- `plugins/pluginlibs.versions.toml`
- `plugins/spark/README.md`
- `plugins/spark/v3.5/getting-started/notebooks/SparkPolaris.ipynb`
- `regtests/setup.sh`
- `regtests/t_pyspark/src/iceberg_spark.py`
- `site/content/in-dev/unreleased/getting-started/using-polaris.md`
- `site/content/in-dev/unreleased/polaris-spark-client.md`

---

### 99. `d03c717` - Add Events for Iceberg REST APIs (#2480)

**Date:** 2025-09-17 | **Author:** Adnan Hemani | **PR:** [#2480](https://github.com/apache/polaris/pull/2480)
**Files:** 30 | **Changes:** +861/-549

**PURPOSE:** New feature

**WHAT CHANGED:** Modified Admin Service, REST API in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Client Integration, Management Operations | Large-scale change affecting multiple modules

**Sample files (showing 15 of 30):**
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

---

### 100. `9648582` - docs(README): Create Polaris-Core README (#2585)

**Date:** 2025-09-17 | **Author:** Adam Christian | **PR:** [#2585](https://github.com/apache/polaris/pull/2585)
**Files:** 2 | **Changes:** +56/-3

**PURPOSE:** Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `README.md`
- `polaris-core/README.md`

---

### 101. `f3d53f0` - CI: Fix Gradle cache usages (#2593)

**Date:** 2025-09-17 | **Author:** Robert Stupp | **PR:** [#2593](https://github.com/apache/polaris/pull/2593)
**Files:** 4 | **Changes:** +3/-30

**PURPOSE:** Bug fix; CI/CD improvement

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/gradle.yml`
- `.github/workflows/nightly.yml`
- `.github/workflows/regtest.yml`
- `.github/workflows/spark_client_regtests.yml`

**Additional details from commit message:**
```
"Which cache" is then restored, is rather non-deterministic, but almost always at least "partial" leading to unnecessary (re)builds.
```

---

### 102. `f237d94` - Revert "Update plugin com.gradle.develocity to v4.2 (#2583)" (#2594)

**Date:** 2025-09-17 | **Author:** Robert Stupp | **PR:** [#2583](https://github.com/apache/polaris/pull/2583)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `settings.gradle.kts`

---

### 103. `ca0cd9a` - docs(changelog): Update the Changelog with 1.0.1, 1.0.0, & 0.9.0 Releases (#2587)

**Date:** 2025-09-17 | **Author:** Adam Christian | **PR:** [#2587](https://github.com/apache/polaris/pull/2587)
**Files:** 1 | **Changes:** +40/-4

**PURPOSE:** Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `CHANGELOG.md`

---

### 104. `633f775` - Build: remove unnecessary openapigenerator plugin usages (#2592)

**Date:** 2025-09-17 | **Author:** Robert Stupp | **PR:** [#2592](https://github.com/apache/polaris/pull/2592)
**Files:** 2 | **Changes:** +0/-2

**PURPOSE:** Code removal; CI/CD improvement

**WHAT CHANGED:** Modified 2 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/admin/build.gradle.kts`
- `runtime/server/build.gradle.kts`

---

### 105. `8cc0fad` - Update plugin com.gradle.develocity to v4.2 (#2583)

**Date:** 2025-09-17 | **Author:** Mend Renovate | **PR:** [#2583](https://github.com/apache/polaris/pull/2583)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `settings.gradle.kts`

---

### 106. `d165f51` - Update plugin com.gradle.common-custom-user-data-gradle-plugin to v2.4.0 (#2582)

**Date:** 2025-09-17 | **Author:** Mend Renovate | **PR:** [#2582](https://github.com/apache/polaris/pull/2582)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `settings.gradle.kts`

---

### 107. `eb28eda` - Bump: iceberg 1.10 (#2586)

**Date:** 2025-09-16 | **Author:** Prashant Singh | **PR:** [#2586](https://github.com/apache/polaris/pull/2586)
**Files:** 5 | **Changes:** +8/-4

**PURPOSE:** Code modification

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisApplicationIntegrationTest.java`
- `polaris-core/build.gradle.kts`
- `runtime/service/build.gradle.kts`
- `tools/minio-testcontainer/build.gradle.kts`

---

### 108. `27ec215` - Publish build scans to develocity.apache.org for build insights (#2559)

**Date:** 2025-09-16 | **Author:** Clay Johnson | **PR:** [#2559](https://github.com/apache/polaris/pull/2559)
**Files:** 8 | **Changes:** +49/-1

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** in CI/CD, Documentation

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation, User Documentation | Focused change

**Files modified:**
- `.github/workflows/gradle.yml`
- `.github/workflows/helm.yml`
- `.github/workflows/nightly.yml`
- `.github/workflows/python-client.yml`
- `.github/workflows/regtest.yml`
- `.github/workflows/spark_client_regtests.yml`
- `README.md`
- `settings.gradle.kts`

---

### 109. `4885d77` - Avoid exceptions on ETag matches (#2578)

**Date:** 2025-09-16 | **Author:** Dmitri Bourlatchkov | **PR:** [#2578](https://github.com/apache/polaris/pull/2578)
**Files:** 1 | **Changes:** +10/-11

**PURPOSE:** Code modification

**WHAT CHANGED:** in Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogAdapter.java`

---

### 110. `6c4e1b8` - Update registry.access.redhat.com/ubi9/openjdk-21-runtime Docker tag to v1.23-6.1757607786 (#2577)

**Date:** 2025-09-16 | **Author:** Mend Renovate | **PR:** [#2577](https://github.com/apache/polaris/pull/2577)
**Files:** 2 | **Changes:** +2/-2

**PURPOSE:** Documentation update

**WHAT CHANGED:** Modified 2 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/admin/src/main/docker/Dockerfile.jvm`
- `runtime/server/src/main/docker/Dockerfile.jvm`

---

### 111. `4cda818` - Revert "fix password in README.md for ``./gradlew run` (#2572)" (#2576)

**Date:** 2025-09-15 | **Author:** Dmitri Bourlatchkov | **PR:** [#2572](https://github.com/apache/polaris/pull/2572)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `README.md`

---

### 112. `08086b3` - fix password in README.md for ``./gradlew run` (#2572)

**Date:** 2025-09-15 | **Author:** Dmitri Bourlatchkov | **PR:** [#2572](https://github.com/apache/polaris/pull/2572)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `README.md`

---

### 113. `112d80b` - Avoid using jackson method for parsing YAML from any URL in RootCredentialsSet (#2543)

**Date:** 2025-09-15 | **Author:** Dmitri Bourlatchkov | **PR:** [#2543](https://github.com/apache/polaris/pull/2543)
**Files:** 4 | **Changes:** +40/-17

**PURPOSE:** Deprecation; Security enhancement

**WHAT CHANGED:** Modified Persistence Layer in Core, Persistence including test updates

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage | Focused change | Requires careful deployment

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/bootstrap/RootCredentialsSet.java`
- `polaris-core/src/test/java/org/apache/polaris/core/persistence/bootstrap/RootCredentialsSetTest.java`
- `runtime/admin/src/main/java/org/apache/polaris/admintool/BootstrapCommand.java`
- `runtime/admin/src/test/java/org/apache/polaris/admintool/BootstrapCommandTestBase.java`

**Additional details from commit message:**
```
As discussed https://github.com/FasterXML/jackson-core/issues/803
this method can lead to hidden issues and got deprecated.
Instead, we manage URL steams locally in RootCredentialsSet
and permit only those URLs that do not have the host component
(such as files and java resources)... which makes sense to
do from a general security perspective too.
```

---

### 114. `e02bb71` - Remove DROP statements from SQL init scripts (#2565)

**Date:** 2025-09-15 | **Author:** Alexandre Dutra | **PR:** [#2565](https://github.com/apache/polaris/pull/2565)
**Files:** 2 | **Changes:** +0/-5

**PURPOSE:** Code removal

**WHAT CHANGED:** Modified JDBC Persistence in Persistence with database schema changes

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Relational Databases | Focused change

**Files modified:**
- `persistence/relational-jdbc/src/main/resources/h2/schema-v3.sql`
- `persistence/relational-jdbc/src/main/resources/postgres/schema-v3.sql`

**Additional details from commit message:**
```
It is therefore not possible to put any DROP statements in the scripts.
```

---

### 115. `23e5130` - Make column events.request_id nullable (#2566)

**Date:** 2025-09-15 | **Author:** Alexandre Dutra | **PR:** [#2566](https://github.com/apache/polaris/pull/2566)
**Files:** 6 | **Changes:** +26/-16

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** Modified Entity Management, JDBC Persistence in Core, Persistence, Runtime Service with database schema changes

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Data Model, Relational Databases | Focused change

**Files modified:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/models/ModelEvent.java`
- `persistence/relational-jdbc/src/main/resources/h2/schema-v3.sql`
- `persistence/relational-jdbc/src/main/resources/postgres/schema-v3.sql`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/PolarisEvent.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/listeners/InMemoryBufferPolarisPersistenceEventListener.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/listeners/PolarisPersistenceEventListener.java`

**Additional details from commit message:**
```
This PR also annotates the `ModelEvent.principalName` and `PolarisEvent.principalName` fields as nullable in code (the corresponding column was already nullable in the database schema).
```

---

### 116. `a650937` - Fix H2 JDBC schema init script (#2564)

**Date:** 2025-09-15 | **Author:** Alexandre Dutra | **PR:** [#2564](https://github.com/apache/polaris/pull/2564)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified JDBC Persistence in Persistence with database schema changes

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Relational Databases | Focused change

**Files modified:**
- `persistence/relational-jdbc/src/main/resources/h2/schema-v3.sql`

---

### 117. `97b6fe8` - Support sdist client distribution (#2557)

**Date:** 2025-09-15 | **Author:** Yong Zheng | **PR:** [#2557](https://github.com/apache/polaris/pull/2557)
**Files:** 18 | **Changes:** +53/-13

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Client Library in Documentation, Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API, User Documentation | Medium-scale change | May affect API consumers

**Sample files (showing 15 of 18):**
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

**Additional details from commit message:**
```
. The goal is to include only the files required for an end-user to build the client locally (the repository already supports wheel distribution).
For the sdist build, this PR takes a slightly different approach than the symbolic link solution proposed in [#2419]. Instead of using symbolic links, it copies the necessary files from the project root into the client directory (if they do not already exist) and then uses that directory during sdist mode. This approach avoids errors caused by Poet...
```

---

### 118. `4034b28` - Testing: Let runtime-service tests use Quarkus via `enforcedPlatform()` (#2545)

**Date:** 2025-09-15 | **Author:** Robert Stupp | **PR:** [#2545](https://github.com/apache/polaris/pull/2545)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Test improvement

**WHAT CHANGED:** in Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/build.gradle.kts`

---

### 119. `b3366e5` - Minor fix for README.md (#2558)

**Date:** 2025-09-13 | **Author:** Yong Zheng | **PR:** [#2558](https://github.com/apache/polaris/pull/2558)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `README.md`

---

### 120. `d69d7ef` - Reduce getOrCreateMetaStoreManager callers (#2532)

**Date:** 2025-09-13 | **Author:** Christopher Lambert | **PR:** [#2532](https://github.com/apache/polaris/pull/2532)
**Files:** 8 | **Changes:** +20/-42

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Admin Service, Service Authentication in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: API Security, Management Operations | Focused change | May affect API consumers

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/auth/DefaultActiveRolesProvider.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/DefaultAuthenticator.java`
- `runtime/service/src/test/java/org/apache/polaris/service/admin/ManagementServiceTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/auth/DefaultAuthenticatorTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/io/FileIOFactoryTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/task/TableCleanupTaskHandlerTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/task/TaskExecutorImplTest.java`
- `runtime/service/src/testFixtures/java/org/apache/polaris/service/TestServices.java`

**Additional details from commit message:**
```
beans or build it only once in tests that operate in a single realm.
```

---

### 121. `be4175c` - Inject PolarisAdminService into PolarisServiceImpl (#2533)

**Date:** 2025-09-12 | **Author:** Christopher Lambert | **PR:** [#2533](https://github.com/apache/polaris/pull/2533)
**Files:** 5 | **Changes:** +53/-118

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Admin Service, Authentication/Authorization in Core, Runtime Service including test updates

**WHY NEEDED:** to improve security and access control

**IMPACT:** Affects: Management Operations, Security | Focused change | Security-sensitive change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/auth/PolarisSecretsManager.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisAdminService.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisServiceImpl.java`
- `runtime/service/src/test/java/org/apache/polaris/service/admin/PolarisServiceImplTest.java`
- `runtime/service/src/testFixtures/java/org/apache/polaris/service/TestServices.java`

**Additional details from commit message:**
```
if we apply the same to `PolarisAdminService` we can simply
inject it into `PolarisServiceImpl`.
```

---

### 122. `8ad8f74` - Add subtype-check to PolarisEntity subclass ctors (#2492)

**Date:** 2025-09-11 | **Author:** Christopher Lambert | **PR:** [#2492](https://github.com/apache/polaris/pull/2492)
**Files:** 15 | **Changes:** +84/-23

**PURPOSE:** New feature

**WHAT CHANGED:** Modified Entity Management, Policy Management in Core, Persistence, Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Access Control, Data Model | Medium-scale change

**Files modified:**
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

### 123. `adaae48` - Fix deprecation warnings in GcpCredentialsStorageIntegrationTest (#2544)

**Date:** 2025-09-11 | **Author:** Dmitri Bourlatchkov | **PR:** [#2544](https://github.com/apache/polaris/pull/2544)
**Files:** 1 | **Changes:** +11/-15

**PURPOSE:** Bug fix; Code refactoring; Deprecation; Test improvement; CI/CD improvement

**WHAT CHANGED:** including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/src/test/java/org/apache/polaris/service/storage/gcp/GcpCredentialsStorageIntegrationTest.java`

**Additional details from commit message:**
```
Refactor the code to use an explicit InputStream
Cf. https://github.com/FasterXML/jackson-core/issues/803
```

---

### 124. `81035e0` - Update Quarkus Platform and Group to v3.26.3 (#2461)

**Date:** 2025-09-11 | **Author:** Mend Renovate | **PR:** [#2461](https://github.com/apache/polaris/pull/2461)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 125. `c2e932b` - Fix arg-matching in ExceptionMapperTest.testFullExceptionIsLogged() (#2531)

**Date:** 2025-09-11 | **Author:** Robert Stupp | **PR:** [#2531](https://github.com/apache/polaris/pull/2531)
**Files:** 3 | **Changes:** +76/-29

**PURPOSE:** Bug fix; Test improvement; CI/CD improvement

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/exception/IcebergExceptionMapper.java`
- `runtime/service/src/main/java/org/apache/polaris/service/exception/IcebergJsonProcessingExceptionMapper.java`
- `runtime/service/src/test/java/org/apache/polaris/service/exception/ExceptionMapperTest.java`

**Additional details from commit message:**
```
But eventually the test failure's caused by using `getLogger()` for all logging, which may provide the _wrong_ log record and cause the test to fail.
This change renames the `getLogger()` functions to make their special meaning clear, and adds some clarifying comments in the code.
Also adding some more test cases for the various exception mapper code paths.
Co-authored-by: Alexandre Dutra <adutra@apache.org>
```

---

### 126. `9b3d7d2` - Use same content on website home page and README.md (#2534)

**Date:** 2025-09-10 | **Author:** JB Onofré | **PR:** [#2534](https://github.com/apache/polaris/pull/2534)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `README.md`

---

### 127. `cef59e6` - fix deprecated ObjectMapper calls (#2542)

**Date:** 2025-09-10 | **Author:** Dmitri Bourlatchkov | **PR:** [#2542](https://github.com/apache/polaris/pull/2542)
**Files:** 2 | **Changes:** +2/-2

**PURPOSE:** Bug fix; Deprecation

**WHAT CHANGED:** Modified Connection Management, Storage Integration in Core

**WHY NEEDED:** to improve cloud storage integration

**IMPACT:** Affects: Cloud Storage, External Integrations | Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/connection/ConnectionConfigInfoDpo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/PolarisStorageConfigurationInfo.java`

**Additional details from commit message:**
```
as suggested by javadoc.
```

---

### 128. `026fabe` - NoSQL: Move varint implementation into the "right" directory (#2528)

**Date:** 2025-09-09 | **Author:** Robert Stupp | **PR:** [#2528](https://github.com/apache/polaris/pull/2528)
**Files:** 5 | **Changes:** +3/-2

**PURPOSE:** New feature

**WHAT CHANGED:** Modified NoSQL Persistence in Persistence including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: NoSQL Databases | Focused change

**Files modified:**
- `bom/build.gradle.kts`
- `gradle/projects.main.properties`
- `{nosql => persistence/nosql}/persistence/varint/build.gradle.kts`
- `{nosql => persistence/nosql}/persistence/varint/src/main/java/org/apache/polaris/persistence/varint/VarInt.java`
- `{nosql => persistence/nosql}/persistence/varint/src/test/java/org/apache/polaris/persistence/varint/TestVarInt.java`

---

### 129. `1d15128` - Build: Make META-INF/MANIFEST.MF content reproducible (#2421)

**Date:** 2025-09-09 | **Author:** Robert Stupp | **PR:** [#2421](https://github.com/apache/polaris/pull/2421)
**Files:** 5 | **Changes:** +35/-76

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `build-logic/src/main/kotlin/publishing/MemoizedGitInfo.kt`
- `build-logic/src/main/kotlin/publishing/PublishingHelperPlugin.kt`
- `tools/version/src/jarTest/java/org/apache/polaris/version/TestPolarisVersion.java`
- `tools/version/src/jarTest/resources/META-INF/FAKE_MANIFEST.MF`
- `tools/version/src/main/java/org/apache/polaris/version/PolarisVersion.java`

**Additional details from commit message:**
```
This change changes the jar manifest attributes:
* `Apache-Polaris-Is-Release` is now also set to `true`, if `-PjarWithGitInfo` is specified
* `Apache-Polaris-Build-Git-Describe` is now also generated, if `-PjarWithGitInfo` is specified
* `Apache-Polaris-Build-Java-Version` has been removed
* `Apache-Polaris-Build-Java-Specification-Version` has been added (it's only the Java major version)
* `Apache-Polaris-Build-Timestamp` has been removed
* `Apache-Polaris-Build-System` has been removed
Co...
```

---

### 130. `3fa1df3` - Update hadoop to v3.4.2 (#2466)

**Date:** 2025-09-09 | **Author:** Mend Renovate | **PR:** [#2466](https://github.com/apache/polaris/pull/2466)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 131. `87490a5` - Update gradle/actions digest to ed40850 (#2524)

**Date:** 2025-09-09 | **Author:** Mend Renovate | **PR:** [#2524](https://github.com/apache/polaris/pull/2524)
**Files:** 5 | **Changes:** +8/-8

**PURPOSE:** Code modification

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/actions/ci-incr-build-cache-prepare/action.yml`
- `.github/workflows/gradle.yml`
- `.github/workflows/nightly.yml`
- `.github/workflows/regtest.yml`
- `.github/workflows/spark_client_regtests.yml`

---

### 132. `a1d1176` - Core: Clarify the purpose of REPLACE_NEW_LOCATION_PREFIX_WITH_CATALOG_DEFAULT_KEY (#2509)

**Date:** 2025-09-08 | **Author:** Yufei Gu | **PR:** [#2509](https://github.com/apache/polaris/pull/2509)
**Files:** 1 | **Changes:** +12/-5

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified Entity Management in Core

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Data Model | Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/entity/CatalogEntity.java`

---

### 133. `d1a329f` - Add support for poetry build with wheel (#2425)

**Date:** 2025-09-08 | **Author:** Yong Zheng | **PR:** [#2425](https://github.com/apache/polaris/pull/2425)
**Files:** 3 | **Changes:** +9/-5

**PURPOSE:** New feature; CI/CD improvement

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `Makefile`
- `client/python/generate_clients.py`
- `client/python/pyproject.toml`

---

### 134. `ee7f370` - Allow `PolarisServerManager` implementations to define custom client headers (#2510)

**Date:** 2025-09-08 | **Author:** Dmitri Bourlatchkov | **PR:** [#2510](https://github.com/apache/polaris/pull/2510)
**Files:** 8 | **Changes:** +40/-30

**PURPOSE:** New feature

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/IcebergHelper.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/PolarisApiEndpoints.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/PolarisRestApi.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/Server.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/ext/PolarisIntegrationTestExtension.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisApplicationIntegrationTest.java`
- `runtime/service/src/intTest/java/org/apache/polaris/service/it/RestCatalogMinIOSpecialIT.java`
- `runtime/service/src/test/java/org/apache/polaris/service/it/ApplicationIntegrationTest.java`

**Additional details from commit message:**
```
to define runtime env. for tests under `integration-tests`.
This change allows more flexibility for test runtime environments
by allowing injecting extra headers into test clients.
```

---

### 135. `37a9221` - Remove PolarisTestMetaStoreManager.jsonNode helper (#2513)

**Date:** 2025-09-06 | **Author:** Christopher Lambert | **PR:** [#2513](https://github.com/apache/polaris/pull/2513)
**Files:** 1 | **Changes:** +8/-23

**PURPOSE:** Code removal; Test improvement

**WHAT CHANGED:** in Persistence including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/src/testFixtures/java/org/apache/polaris/core/persistence/PolarisTestMetaStoreManager.java`

---

### 136. `b8d210a` - Add Events for Policy Service APIs (#2479)

**Date:** 2025-09-05 | **Author:** Adnan Hemani | **PR:** [#2479](https://github.com/apache/polaris/pull/2479)
**Files:** 3 | **Changes:** +255/-22

**PURPOSE:** New feature

**WHAT CHANGED:** in Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/policy/CatalogPolicyEventServiceDelegator.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/CatalogPolicyServiceEvents.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/listeners/PolarisEventListener.java`

---

### 137. `1361bd4` - fix for IcebergAllowedLocationTest (#2511)

**Date:** 2025-09-04 | **Author:** Eric Maynard | **PR:** [#2511](https://github.com/apache/polaris/pull/2511)
**Files:** 2 | **Changes:** +3/-1

**PURPOSE:** Bug fix; Test improvement

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/iceberg/AbstractIcebergCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/iceberg/IcebergAllowedLocationTest.java`

---

### 138. `453e9fb` - Disable custom namespace locations (#2422)

**Date:** 2025-09-04 | **Author:** Eric Maynard | **PR:** [#2422](https://github.com/apache/polaris/pull/2422)
**Files:** 14 | **Changes:** +216/-17

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified Admin Service, Storage Integration in Core, Runtime Service, Spark Plugin including test updates

**WHY NEEDED:** to improve cloud storage integration

**IMPACT:** Affects: Cloud Storage, Management Operations, Spark Integration | Medium-scale change

**Files modified:**
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

### 139. `d7ec8f2` - Add Events for Generic Table APIs (#2481)

**Date:** 2025-09-04 | **Author:** Adnan Hemani | **PR:** [#2481](https://github.com/apache/polaris/pull/2481)
**Files:** 3 | **Changes:** +126/-8

**PURPOSE:** New feature

**WHAT CHANGED:** in Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/generic/CatalogGenericTableEventServiceDelegator.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/CatalogGenericTableServiceEvents.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/listeners/PolarisEventListener.java`

---

### 140. `923a2e1` - Remove readInternalProperties helpers (#2506)

**Date:** 2025-09-04 | **Author:** Christopher Lambert | **PR:** [#2506](https://github.com/apache/polaris/pull/2506)
**Files:** 2 | **Changes:** +1/-15

**PURPOSE:** Code removal

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/test/java/org/apache/polaris/service/test/PolarisIntegrationTestFixture.java`
- `runtime/service/src/test/java/org/apache/polaris/service/test/PolarisIntegrationTestHelper.java`

---

### 141. `90c981a` - CLI: Remove SCRIPT_DIR and default config location to user home (#2448)

**Date:** 2025-09-04 | **Author:** Yong Zheng | **PR:** [#2448](https://github.com/apache/polaris/pull/2448)
**Files:** 5 | **Changes:** +4/-8

**PURPOSE:** Code removal

**WHAT CHANGED:** Modified CLI in Documentation, Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Command Line Tools, User Documentation | Focused change

**Files modified:**
- `Makefile`
- `client/python/cli/command/profiles.py`
- `client/python/cli/constants.py`
- `polaris`
- `site/content/in-dev/unreleased/command-line-interface.md`

---

### 142. `cbdc12b` - Remove commons-codec dependency (#2474)

**Date:** 2025-09-04 | **Author:** Christopher Lambert | **PR:** [#2474](https://github.com/apache/polaris/pull/2474)
**Files:** 6 | **Changes:** +35/-5

**PURPOSE:** Code removal

**WHAT CHANGED:** Modified Entity Management, Secrets Management in Core, Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Credentials, Data Model | Focused change

**Files modified:**
- `gradle/libs.versions.toml`
- `polaris-core/build.gradle.kts`
- `polaris-core/src/main/java/org/apache/polaris/core/DigestUtils.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/PolarisPrincipalSecrets.java`
- `polaris-core/src/main/java/org/apache/polaris/core/secrets/UnsafeInMemorySecretsManager.java`
- `runtime/service/src/main/java/org/apache/polaris/service/http/IcebergHttpUtil.java`

**Additional details from commit message:**
```
we can simply use guava instead and eliminate the extra dependency
```

---

### 143. `a8431dc` - Update registry.access.redhat.com/ubi9/openjdk-21-runtime Docker tag to v1.23-6.1756793420 (#2504)

**Date:** 2025-09-04 | **Author:** Mend Renovate | **PR:** [#2504](https://github.com/apache/polaris/pull/2504)
**Files:** 2 | **Changes:** +2/-2

**PURPOSE:** Documentation update

**WHAT CHANGED:** Modified 2 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/admin/src/main/docker/Dockerfile.jvm`
- `runtime/server/src/main/docker/Dockerfile.jvm`

---

### 144. `40283b2` - Service: Add location tests for views (#2496)

**Date:** 2025-09-03 | **Author:** Yufei Gu | **PR:** [#2496](https://github.com/apache/polaris/pull/2496)
**Files:** 1 | **Changes:** +171/-0

**PURPOSE:** New feature; Test improvement

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/iceberg/IcebergAllowedLocationTest.java`

---

### 145. `32b2c27` - Core: Prevent AIOOBE for negative policy codes in PredefinedPolicyType (#2486)

**Date:** 2025-09-03 | **Author:** Yufei Gu | **PR:** [#2486](https://github.com/apache/polaris/pull/2486)
**Files:** 2 | **Changes:** +14/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Policy Management in Core including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Access Control | Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/policy/PredefinedPolicyTypes.java`
- `polaris-core/src/test/java/org/apache/polaris/core/policy/PolicyTypeTest.java`

---

### 146. `84c9473` - Update actions/stale digest to 3a9db7e (#2499)

**Date:** 2025-09-03 | **Author:** Mend Renovate | **PR:** [#2499](https://github.com/apache/polaris/pull/2499)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/stale.yml`

---

### 147. `62ca26c` - Fix failing CI (#2498)

**Date:** 2025-09-03 | **Author:** Adnan Hemani | **PR:** [#2498](https://github.com/apache/polaris/pull/2498)
**Files:** 2 | **Changes:** +4/-3

**PURPOSE:** Bug fix; CI/CD improvement

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/events/jsonEventListener/PropertyMapEventListener.java`
- `runtime/service/src/test/java/org/apache/polaris/service/events/jsonEventListener/aws/cloudwatch/AwsCloudWatchEventListenerTest.java`

---

### 148. `20753ed` - AWS CloudWatch Event Sink Implementation (#1965)

**Date:** 2025-09-03 | **Author:** Adnan Hemani | **PR:** [#1965](https://github.com/apache/polaris/pull/1965)
**Files:** 9 | **Changes:** +781/-40

**PURPOSE:** New feature

**WHAT CHANGED:** in Documentation, Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `gradle/libs.versions.toml`
- `runtime/service/build.gradle.kts`
- `runtime/service/src/main/java/org/apache/polaris/service/events/jsonEventListener/PropertyMapEventListener.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/jsonEventListener/aws/cloudwatch/AwsCloudWatchConfiguration.java`
- `runtime/service/src/main/java/org/apache/polaris/service/events/jsonEventListener/aws/cloudwatch/AwsCloudWatchEventListener.java`
- `runtime/service/src/main/java/org/apache/polaris/service/quarkus/events/jsonEventListener/aws/cloudwatch/QuarkusAwsCloudWatchConfiguration.java`
- `runtime/service/src/test/java/org/apache/polaris/service/events/jsonEventListener/aws/cloudwatch/AwsCloudWatchEventListenerTest.java`
- `runtime/service/src/test/resources/org/apache/polaris/service/events/jsonEventListener/aws/cloudwatch/Dockerfile-localstack-version`
- `site/content/in-dev/unreleased/configuration.md`

---

### 149. `c3f5001` - Add Polaris Events to Persistence (#1844)

**Date:** 2025-09-03 | **Author:** Adnan Hemani | **PR:** [#1844](https://github.com/apache/polaris/pull/1844)
**Files:** 59 | **Changes:** +2000/-83

**PURPOSE:** New feature

**WHAT CHANGED:** Modified Admin Service, Entity Management, JDBC Persistence, Persistence Layer in Core, Persistence, Runtime Service including test updates with database schema changes

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Data Model, Database/Storage, Management Operations, Relational Databases | Large-scale change affecting multiple modules | Requires careful deployment

**Sample files (showing 15 of 59):**
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

---

### 150. `f6bcbd2` - perf(refactor): optimizing JdbcBasePersistenceImpl.listEntities (#2465)

**Date:** 2025-09-03 | **Author:** Artur Rakhmatulin | **PR:** [#2465](https://github.com/apache/polaris/pull/2465)
**Files:** 7 | **Changes:** +151/-42

**PURPOSE:** Code refactoring

**WHAT CHANGED:** Modified Entity Management, JDBC Persistence, Persistence Layer in Core, Persistence

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Data Model, Database/Storage, Relational Databases | Focused change | Requires careful deployment

**Files modified:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/models/EntityNameLookupRecordConverter.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/models/ModelEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/EntityNameLookupRecord.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/Identifiable.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/PolarisEntityCore.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/pagination/EntityIdToken.java`

**Additional details from commit message:**
```
- Eliminated Object Creation Overhead: Direct conversion to EntityNameLookupRecord without intermediate PolarisBaseEntity
```

---

### 151. `c783de9` - feat(idgen): Start Implementation of NoSQL with the ID Generation Framework (#2131)

**Date:** 2025-09-03 | **Author:** Adam Christian | **PR:** [#2131](https://github.com/apache/polaris/pull/2131)
**Files:** 27 | **Changes:** +3165/-0

**PURPOSE:** New feature

**WHAT CHANGED:** Modified NoSQL Persistence in Documentation, Persistence including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: NoSQL Databases, User Documentation | Large-scale change affecting multiple modules

**Sample files (showing 15 of 27):**
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

**Additional details from commit message:**
```
Related to #650 & #844
Co-authored-by: Robert Stupp <snazy@snazy.de>
Co-authored-by: Dmitri Bourlatchkov <dmitri.bourlatchkov@gmail.com>
```

---

### 152. `6137e42` - Core: Prevent AIOOBE for negative codes in PolarisEntityType, PolarisPrivilege, ReturnStatus (#2490)

**Date:** 2025-09-02 | **Author:** Honah (Jonas) J. | **PR:** [#2490](https://github.com/apache/polaris/pull/2490)
**Files:** 6 | **Changes:** +237/-3

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Entity Management, Persistence Layer in Core, Persistence including test updates

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Data Model, Database/Storage | Focused change | Requires careful deployment

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/entity/PolarisEntityType.java`
- `polaris-core/src/main/java/org/apache/polaris/core/entity/PolarisPrivilege.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/dao/entity/BaseResult.java`
- `polaris-core/src/test/java/org/apache/polaris/core/entity/PolarisEntityTypeTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/entity/PolarisPrivilegeTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/persistence/dao/entity/ReturnStatusTest.java`

---

### 153. `f41d5bf` - Fix CI (#2489)

**Date:** 2025-09-02 | **Author:** Dmitri Bourlatchkov | **PR:** [#2489](https://github.com/apache/polaris/pull/2489)
**Files:** 2 | **Changes:** +12/-3

**PURPOSE:** Bug fix; CI/CD improvement

**WHAT CHANGED:** Modified Admin Service, Persistence Layer in Core, Persistence, Runtime Service

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage, Management Operations | Focused change | Requires careful deployment

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/TransactionWorkspaceMetaStoreManager.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisPrincipalsEventServiceDelegator.java`

**Additional details from commit message:**
```
* Use local diagnostics in TransactionWorkspaceMetaStoreManager
* Add resetCredentials to PolarisPrincipalsEventServiceDelegator
```

---

### 154. `ac31963` - Add type-check to PolarisEntity subclass ctors (#2302)

**Date:** 2025-09-02 | **Author:** Christopher Lambert | **PR:** [#2302](https://github.com/apache/polaris/pull/2302)
**Files:** 13 | **Changes:** +57/-20

**PURPOSE:** Bug fix; New feature; CI/CD improvement

**WHAT CHANGED:** Modified Entity Management, Policy Management in Core, Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Access Control, Data Model | Medium-scale change

**Files modified:**
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

**Additional details from commit message:**
```
specific type via their constructors.
this can lead to subtle bugs like we fixed in
a29f8006fe9d259df755d02ec6386c2bd6932610
by adding type checks we discover a few more places where we need to be
more careful about how we construct new or handle existing entities.
note that we can add a check for `PolarisEntitySubType` in a followup,
but it requires more fixes currently.
```

---

### 155. `327697c` - Feature: Expose resetCredentials via a new reset api to allow root user to reset credentials for an existing principal with custom values  (#2197)

**Date:** 2025-09-02 | **Author:** fivetran-arunsuri | **PR:** [#2197](https://github.com/apache/polaris/pull/2197)
**Files:** 17 | **Changes:** +479/-5

**PURPOSE:** New feature; CI/CD improvement

**WHAT CHANGED:** Modified Admin Service, Authentication/Authorization, EclipseLink Persistence, Entity Management, JDBC Persistence, Persistence Layer in Core, Documentation, OpenAPI Specs, Persistence, Runtime Service including test updates

**WHY NEEDED:** to improve security and access control; to enhance data storage reliability

**IMPACT:** Affects: API Contracts, Data Model, Database/Storage, JPA/ORM, Management Operations, Relational Databases, Security, User Documentation | Medium-scale change | Security-sensitive change | May affect API consumers | Requires careful deployment

**Sample files (showing 15 of 17):**
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

---

### 156. `6b4f8e1` - Remove PolarisCallContext.getDiagServices (#2415)

**Date:** 2025-09-02 | **Author:** Christopher Lambert | **PR:** [#2415](https://github.com/apache/polaris/pull/2415)
**Files:** 55 | **Changes:** +279/-217

**PURPOSE:** Code removal

**WHAT CHANGED:** Modified Admin Service, EclipseLink Persistence, JDBC Persistence, Persistence Layer, Service Authentication, Storage Integration in Core, Persistence, Runtime Service including test updates

**WHY NEEDED:** to enhance data storage reliability; to improve cloud storage integration

**IMPACT:** Affects: API Security, Cloud Storage, Database/Storage, JPA/ORM, Management Operations, Relational Databases | Large-scale change affecting multiple modules | May affect API consumers | Requires careful deployment

**Sample files (showing 15 of 55):**
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

**Additional details from commit message:**
```
* Remove diagnostics from PolarisCallContext
```

---

### 157. `4ed1d41` - Service: Always validate allowed locations from Storage Config (#2473)

**Date:** 2025-08-30 | **Author:** Yufei Gu | **PR:** [#2473](https://github.com/apache/polaris/pull/2473)
**Files:** 9 | **Changes:** +367/-197

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Storage Integration in Core, Runtime Service including test updates

**WHY NEEDED:** to improve cloud storage integration

**IMPACT:** Affects: Cloud Storage | Focused change

**Files modified:**
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisRestCatalogViewIntegrationBase.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/InMemoryStorageIntegration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/LocationRestrictions.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/PolarisStorageConfigurationInfo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/StorageConfigurationOverride.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/StorageUtil.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/StorageUtilTest.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/iceberg/IcebergAllowedLocationTest.java`

---

### 158. `17a359b` - Service: Remove hadoop-common from polaris-runtime-service (#2462)

**Date:** 2025-08-30 | **Author:** Christopher Lambert | **PR:** [#2462](https://github.com/apache/polaris/pull/2462)
**Files:** 4 | **Changes:** +9/-24

**PURPOSE:** Code removal

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/build.gradle.kts`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/io/DefaultFileIOFactory.java`
- `runtime/service/src/main/java/org/apache/polaris/service/context/RealmContextResolver.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogHandlerAuthzTest.java`

---

### 159. `680f974` - Update versions in runtime LICENSE and NOTICE (#2468)

**Date:** 2025-08-29 | **Author:** JB Onofré | **PR:** [#2468](https://github.com/apache/polaris/pull/2468)
**Files:** 2 | **Changes:** +271/-312

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 2 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/distribution/LICENSE`
- `runtime/distribution/NOTICE`

---

### 160. `3bc92b4` - Service: Move tests to the right package (#2469)

**Date:** 2025-08-28 | **Author:** Yufei Gu | **PR:** [#2469](https://github.com/apache/polaris/pull/2469)
**Files:** 14 | **Changes:** +23/-23

**PURPOSE:** Code modification

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Medium-scale change

**Files modified:**
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

### 161. `f8ad77a` - Prefer java.util.Base64 over commons-codec (#2463)

**Date:** 2025-08-28 | **Author:** Christopher Lambert | **PR:** [#2463](https://github.com/apache/polaris/pull/2463)
**Files:** 6 | **Changes:** +52/-57

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Service Authentication in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: API Security | Focused change | May affect API consumers

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/auth/DefaultOAuth2ApiService.java`
- `runtime/service/src/main/java/org/apache/polaris/service/task/ManifestFileCleanupTaskHandler.java`
- `runtime/service/src/main/java/org/apache/polaris/service/task/TableCleanupTaskHandler.java`
- `runtime/service/src/main/java/org/apache/polaris/service/task/TaskUtils.java`
- `runtime/service/src/test/java/org/apache/polaris/service/task/ManifestFileCleanupTaskHandlerTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/task/TableCleanupTaskHandlerTest.java`

**Additional details from commit message:**
```
in a few other spots.
in a follow-up we might be able to get rid of our `commons-codec` dependency
completely.
```

---

### 162. `b33c321` - Add Delegator to all API Implementations (#2434)

**Date:** 2025-08-28 | **Author:** Adnan Hemani | **PR:** [#2434](https://github.com/apache/polaris/pull/2434)
**Files:** 7 | **Changes:** +961/-0

**PURPOSE:** New feature

**WHAT CHANGED:** Modified Admin Service, REST API in Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Client Integration, Management Operations | Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisCatalogsEventServiceDelegator.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisPrincipalRolesEventServiceDelegator.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisPrincipalsEventServiceDelegator.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/generic/CatalogGenericTableEventServiceDelegator.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergRestCatalogEventServiceDelegator.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergRestConfigurationEventServiceDelegator.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/policy/CatalogPolicyEventServiceDelegator.java`

---

### 163. `9e6d929` - add refresh credentials property to loadTableResult (#2341)

**Date:** 2025-08-28 | **Author:** Jason | **PR:** [#2341](https://github.com/apache/polaris/pull/2341)
**Files:** 29 | **Changes:** +341/-93

**PURPOSE:** New feature

**WHAT CHANGED:** Modified Persistence Layer, Storage Integration in Core, Documentation, Persistence, Runtime Service including test updates

**WHY NEEDED:** to enhance data storage reliability; to improve cloud storage integration

**IMPACT:** Affects: Cloud Storage, Database/Storage, User Documentation | Large-scale change affecting multiple modules | Requires careful deployment

**Sample files (showing 15 of 29):**
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

**Additional details from commit message:**
```
* IcebergCatalogAdapterTest: Added test to ensure refresh credentials endpoint is included
* delegate refresh credential endpoint configuration to storage integration
* GCP: Add refresh credential properties
```

---

### 164. `95ebdd3` - Remove commons-lang3 dependency (#2456)

**Date:** 2025-08-28 | **Author:** Christopher Lambert | **PR:** [#2456](https://github.com/apache/polaris/pull/2456)
**Files:** 14 | **Changes:** +24/-29

**PURPOSE:** Code removal

**WHAT CHANGED:** Modified Admin Service, Service Authentication in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: API Security, Management Operations | Medium-scale change | May affect API consumers

**Files modified:**
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

**Additional details from commit message:**
```
also stop using `org.assertj.core.util` as its a non-public api.
```

---

### 165. `00ca832` - Built: improve reproducible archive files (#2432)

**Date:** 2025-08-27 | **Author:** Robert Stupp | **PR:** [#2432](https://github.com/apache/polaris/pull/2432)
**Files:** 5 | **Changes:** +87/-5

**PURPOSE:** Bug fix; CI/CD improvement

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `build-logic/src/main/kotlin/Utilities.kt`
- `build-logic/src/main/kotlin/polaris-java.gradle.kts`
- `build-logic/src/main/kotlin/polaris-reproducible.gradle.kts`
- `runtime/distribution/build.gradle.kts`
- `tools/config-docs/site/build.gradle.kts`

**Additional details from commit message:**
```
Some Gradle projects produce archive files, but don't get the necessary Gradle archive-tasks settings applied: one not-published project but also the tarball&zip of the distribution. This change moves the logic to the new build-plugin `polaris-reproducible`.
Another change is to have some Quarkus generated jar files adhere to the same conventions, which are constant timestamps for the zip entries and a deterministic order of the entries. That's sadly not a full fix, as the classes that are ge...
```

---

### 166. `b6e247d` - Build: Make jandex dependency used for index generation managed (#2431)

**Date:** 2025-08-27 | **Author:** Robert Stupp | **PR:** [#2431](https://github.com/apache/polaris/pull/2431)
**Files:** 25 | **Changes:** +41/-30

**PURPOSE:** Bug fix; CI/CD improvement

**WHAT CHANGED:** Modified EclipseLink Persistence, JDBC Persistence in Persistence, Runtime Service, Spark Plugin

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: JPA/ORM, Relational Databases, Spark Integration | Large-scale change affecting multiple modules

**Sample files (showing 15 of 25):**
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

**Additional details from commit message:**
```
This is a preparation step contributing to #2204, once a jandex fix for reproducible builds is available.
Co-authored-by: Alexandre Dutra <adutra@apache.org>
```

---

### 167. `3f1dfb3` - Add user principal tag in metrics (#2445)

**Date:** 2025-08-27 | **Author:** fivetran-kostaszoumpatianos | **PR:** [#2445](https://github.com/apache/polaris/pull/2445)
**Files:** 8 | **Changes:** +145/-2

**PURPOSE:** New feature; CI/CD improvement

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/config/ProductionReadinessChecks.java`
- `runtime/service/src/main/java/org/apache/polaris/service/metrics/MetricsConfiguration.java`
- `runtime/service/src/main/java/org/apache/polaris/service/metrics/PolarisValueExpressionResolver.java`
- `runtime/service/src/test/java/org/apache/polaris/service/metrics/MetricsTestBase.java`
- `runtime/service/src/test/java/org/apache/polaris/service/metrics/RealmIdTagEnabledMetricsTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/metrics/UserPrincipalTagDisabledMetricsTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/metrics/UserPrincipalTagEnabledMetricsTest.java`
- `server-templates/api.mustache`

**Additional details from commit message:**
```
* Added test
* Added production readiness check
```

---

### 168. `f0ee460` - Client: fix openapi verbose output, remove doc generate, and skip test generations (#2439)

**Date:** 2025-08-26 | **Author:** Yong Zheng | **PR:** [#2439](https://github.com/apache/polaris/pull/2439)
**Files:** 4 | **Changes:** +53/-22

**PURPOSE:** Bug fix; Code removal; Test improvement; Documentation update; CI/CD improvement

**WHAT CHANGED:** Modified Client Library in Documentation, Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API, User Documentation | Focused change | May affect API consumers

**Files modified:**
- `Makefile`
- `client/python/.openapi-generator-ignore`
- `client/python/docs/.keep`
- `client/python/generate_clients.py`

**Additional details from commit message:**
```
* Use logger instead of print
* Add back exclude on __pycache__ as CI is not via Makefile
* Add back exclude on __pycache__ as CI is not via Makefile
```

---

### 169. `76a5073` - Deprecate ActiveRolesProvider for removal (#2404)

**Date:** 2025-08-26 | **Author:** Alexandre Dutra | **PR:** [#2404](https://github.com/apache/polaris/pull/2404)
**Files:** 7 | **Changes:** +8/-3

**PURPOSE:** Deprecation

**WHAT CHANGED:** Modified Service Authentication in Documentation, Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: API Security, User Documentation | Focused change | May affect API consumers

**Files modified:**
- `CHANGELOG.md`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/ActiveRolesAugmentor.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/ActiveRolesProvider.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/AuthenticationRealmConfiguration.java`
- `runtime/service/src/main/java/org/apache/polaris/service/auth/DefaultActiveRolesProvider.java`
- `runtime/service/src/main/java/org/apache/polaris/service/config/ServiceProducers.java`
- `runtime/service/src/test/java/org/apache/polaris/service/auth/ActiveRolesAugmentorTest.java`

---

### 170. `92ead05` - Add feature flag to disallow custom S3 endpoints (#2442)

**Date:** 2025-08-26 | **Author:** Dmitri Bourlatchkov | **PR:** [#2442](https://github.com/apache/polaris/pull/2442)
**Files:** 4 | **Changes:** +87/-0

**PURPOSE:** Bug fix; New feature

**WHAT CHANGED:** Modified Admin Service in Core, Documentation, Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Management Operations, User Documentation | Focused change

**Files modified:**
- `CHANGELOG.md`
- `polaris-core/src/main/java/org/apache/polaris/core/config/FeatureConfiguration.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisServiceImpl.java`
- `runtime/service/src/test/java/org/apache/polaris/service/admin/ManagementServiceTest.java`

**Additional details from commit message:**
```
* Enforce in `PolarisServiceImpl.validateStorageConfig()`
Fixes #2436
```

---

### 171. `ad450d4` - Add PolarisDiagnostics field to BaseMetaStoreManager (#2381)

**Date:** 2025-08-26 | **Author:** Christopher Lambert | **PR:** [#2381](https://github.com/apache/polaris/pull/2381)
**Files:** 8 | **Changes:** +203/-201

**PURPOSE:** New feature; CI/CD improvement

**WHAT CHANGED:** Modified JDBC Persistence, Persistence Layer in Core, Persistence, Runtime Service including test updates

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage, Relational Databases | Focused change | Requires careful deployment

**Files modified:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcMetaStoreManagerFactory.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/AtomicMetastoreManagerWithJdbcBasePersistenceImplTest.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/AtomicOperationMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/BaseMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalMetaStoreManagerImpl.java`
- `polaris-core/src/test/java/org/apache/polaris/core/persistence/PolarisTreeMapAtomicOperationMetaStoreManagerTest.java`
- `runtime/service/src/main/java/org/apache/polaris/service/persistence/InMemoryAtomicOperationMetaStoreManagerFactory.java`

**Additional details from commit message:**
```
the ultimate goal is removing the `PolarisCallContext` parameter from every
`PolarisMetaStoreManager` interface method, so we make steps towards
reducing its usage first.
```

---

### 172. `eceaadd` - Optimize PolicyCatalog.listPolicies (#2370)

**Date:** 2025-08-26 | **Author:** Christopher Lambert | **PR:** [#2370](https://github.com/apache/polaris/pull/2370)
**Files:** 3 | **Changes:** +35/-11

**PURPOSE:** Performance optimization; CI/CD improvement

**WHAT CHANGED:** Modified Policy Management in Core, Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Access Control | Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/policy/PolicyEntity.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/policy/PolicyCatalog.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/policy/PolicyCatalogHandler.java`

**Additional details from commit message:**
```
the optimization is to use `listEntities` instead of `loadEntities` when
there is `policyType` filter to apply
```

---

### 173. `05db610` - Fix NPE in CreateCatalog (#2435)

**Date:** 2025-08-23 | **Author:** Honah (Jonas) J. | **PR:** [#2435](https://github.com/apache/polaris/pull/2435)
**Files:** 3 | **Changes:** +51/-1

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified Admin Service in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Management Operations | Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisAdminService.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisServiceImpl.java`
- `runtime/service/src/test/java/org/apache/polaris/service/admin/ManagementServiceTest.java`

---

### 174. `a29f800` - Fix TableIdentifier in TaskFileIOSupplier (#2304)

**Date:** 2025-08-22 | **Author:** Christopher Lambert | **PR:** [#2304](https://github.com/apache/polaris/pull/2304)
**Files:** 6 | **Changes:** +22/-21

**PURPOSE:** Bug fix

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/task/BatchFileCleanupTaskHandler.java`
- `runtime/service/src/main/java/org/apache/polaris/service/task/ManifestFileCleanupTaskHandler.java`
- `runtime/service/src/main/java/org/apache/polaris/service/task/TableCleanupTaskHandler.java`
- `runtime/service/src/main/java/org/apache/polaris/service/task/TaskFileIOSupplier.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/AbstractIcebergCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/io/FileIOFactoryTest.java`

**Additional details from commit message:**
```
`getTableIdentifier()` method will not return a correct value by using
the name of the task and its parent namespace (which is empty?).
task handlers instead need to pass in the `TableIdentifier` that they
already inferred via `TaskEntity.readData`.
```

---

### 175. `bc5d0c4` - chore(deps): update registry.access.redhat.com/ubi9/openjdk-21-runtime docker tag to v1.23-6.1755674729 (#2416)

**Date:** 2025-08-22 | **Author:** Mend Renovate | **PR:** [#2416](https://github.com/apache/polaris/pull/2416)
**Files:** 2 | **Changes:** +2/-2

**PURPOSE:** Documentation update

**WHAT CHANGED:** Modified 2 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/admin/src/main/docker/Dockerfile.jvm`
- `runtime/server/src/main/docker/Dockerfile.jvm`

---

### 176. `c2209cf` - Integration tests for Catalog Federation (#2344)

**Date:** 2025-08-21 | **Author:** Pooja Nilangekar | **PR:** [#2344](https://github.com/apache/polaris/pull/2344)
**Files:** 2 | **Changes:** +279/-0

**PURPOSE:** Test improvement

**WHAT CHANGED:** including test updates

**WHY NEEDED:** to support catalog federation features

**IMPACT:** Focused change

**Files modified:**
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/CatalogFederationIntegrationTest.java`
- `runtime/spark-tests/src/intTest/java/org/apache/polaris/service/spark/it/CatalogFederationIT.java`

---

### 177. `82cd416` - fix(deps): update quarkus platform and group to v3.25.4 (#2279)

**Date:** 2025-08-21 | **Author:** Mend Renovate | **PR:** [#2279](https://github.com/apache/polaris/pull/2279)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 178. `2047dc2` - Update changelog prior to 1.1.0 release (#2406)

**Date:** 2025-08-21 | **Author:** Pierre Laporte | **PR:** [#2406](https://github.com/apache/polaris/pull/2406)
**Files:** 1 | **Changes:** +28/-2

**PURPOSE:** Code modification

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `CHANGELOG.md`

---

### 179. `d30232e` - chore(deps): update actions/setup-java action to v5 (#2414)

**Date:** 2025-08-21 | **Author:** Mend Renovate | **PR:** [#2414](https://github.com/apache/polaris/pull/2414)
**Files:** 6 | **Changes:** +9/-9

**PURPOSE:** Code modification

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/gradle.yml`
- `.github/workflows/helm.yml`
- `.github/workflows/nightly.yml`
- `.github/workflows/python-client.yml`
- `.github/workflows/regtest.yml`
- `.github/workflows/spark_client_regtests.yml`

---

### 180. `d417fda` - chore: fix Page javadoc (#2412)

**Date:** 2025-08-20 | **Author:** Dmitri Bourlatchkov | **PR:** [#2412](https://github.com/apache/polaris/pull/2412)
**Files:** 1 | **Changes:** +3/-2

**PURPOSE:** Bug fix; Documentation update

**WHAT CHANGED:** Modified Persistence Layer in Core, Persistence

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage | Focused change | Requires careful deployment

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/pagination/Page.java`

---

### 181. `b49cbc5` - Add PolarisMetaStoreManager.loadEntities (#2290)

**Date:** 2025-08-20 | **Author:** Christopher Lambert | **PR:** [#2290](https://github.com/apache/polaris/pull/2290)
**Files:** 16 | **Changes:** +223/-167

**PURPOSE:** New feature; Code removal; Performance optimization; CI/CD improvement

**WHAT CHANGED:** Modified Admin Service, EclipseLink Persistence, Entity Management, JDBC Persistence, Persistence Layer in Core, Persistence, Runtime Service including test updates

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Data Model, Database/Storage, JPA/ORM, Management Operations, Relational Databases | Medium-scale change | Requires careful deployment

**Sample files (showing 15 of 16):**
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

**Additional details from commit message:**
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

---

### 182. `a0a2b87` - feat: enforce LIST_PAGINATION_ENABLED (#2401)

**Date:** 2025-08-20 | **Author:** Dmitri Bourlatchkov | **PR:** [#2401](https://github.com/apache/polaris/pull/2401)
**Files:** 8 | **Changes:** +97/-17

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Persistence Layer in Core, Documentation, Persistence, Runtime Service including test updates

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage, User Documentation | Focused change | Requires careful deployment

**Files modified:**
- `CHANGELOG.md`
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/CatalogApi.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisRestCatalogIntegrationBase.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/pagination/PageToken.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/pagination/PageTokenUtil.java`
- `polaris-core/src/test/java/org/apache/polaris/core/persistence/pagination/PageTokenTest.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogHandler.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/AbstractIcebergCatalogTest.java`

**Additional details from commit message:**
```
The enforcement of the LIST_PAGINATION_ENABLED flag was missed in #1938.
This change make the flag effective as discussed in #2296.
Note: this causes a change in the default Polaris behaviour (no pagination
by default) with respect to the previous state of `main`. However, there
is no behaviour change with respect to 1.0.0 or 1.0.1 as previous releases
did not have #1938.
```

---

### 183. `c97b150` - Add feature config to allow dropping views without purging (#2369)

**Date:** 2025-08-20 | **Author:** Dmitri Bourlatchkov | **PR:** [#2369](https://github.com/apache/polaris/pull/2369)
**Files:** 4 | **Changes:** +44/-1

**PURPOSE:** Bug fix; New feature; CI/CD improvement

**WHAT CHANGED:** in Core, Documentation, Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `CHANGELOG.md`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisRestCatalogIntegrationBase.java`
- `polaris-core/src/main/java/org/apache/polaris/core/config/FeatureConfiguration.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`

**Additional details from commit message:**
```
With tables, the client can decide whether to purge the table
on drop or not. However, Polaris Servers used to unconditionally
perform the purge on dropping a view.
After #1619 that behaviour effectively prevents dropping views
if the admin user does not set `DROP_WITH_PURGE_ENABLED`. The
latter, though, is not currently advisable per #1617.
This change introduces a new feature configuration
(`PURGE_VIEWS_ON_DROP`) that allows the admin user to instruct
Polaris servers to drop views without p...
```

---

### 184. `c3aa720` - Mention Helm chart support for PodDisruptionBudget in CHANGELOG.md (#2408)

**Date:** 2025-08-20 | **Author:** Alexandre Dutra | **PR:** [#2408](https://github.com/apache/polaris/pull/2408)
**Files:** 1 | **Changes:** +3/-0

**PURPOSE:** Code modification

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `CHANGELOG.md`

---

### 185. `c5fd368` - feat: Add Pod Disruption Budget support to Helm chart (#2380)

**Date:** 2025-08-20 | **Author:** Bryan Maloyer | **PR:** [#2380](https://github.com/apache/polaris/pull/2380)
**Files:** 4 | **Changes:** +275/-0

**PURPOSE:** New feature

**WHAT CHANGED:** in Documentation, Helm Charts

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Kubernetes Deployment, User Documentation | Focused change

**Files modified:**
- `helm/polaris/README.md`
- `helm/polaris/templates/poddisruptionbudget.yaml`
- `helm/polaris/tests/poddisruptionbudget_test.yaml`
- `helm/polaris/values.yaml`

---

### 186. `fcd4777` - Add PolarisDiagnostics field to AbstractTransactionalPersistence (#2372)

**Date:** 2025-08-20 | **Author:** Christopher Lambert | **PR:** [#2372](https://github.com/apache/polaris/pull/2372)
**Files:** 11 | **Changes:** +61/-48

**PURPOSE:** New feature

**WHAT CHANGED:** Modified EclipseLink Persistence, Persistence Layer in Core, Persistence, Runtime Service including test updates

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage, JPA/ORM | Medium-scale change | Requires careful deployment

**Files modified:**
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

### 187. `4ae3959` - chore(deps): update azure/setup-helm action to v4.3.1 (#2402)

**Date:** 2025-08-20 | **Author:** Mend Renovate | **PR:** [#2402](https://github.com/apache/polaris/pull/2402)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/helm.yml`

---

### 188. `a07ea01` - Remove BaseMetaStoreManager.serializeProperties (#2374)

**Date:** 2025-08-19 | **Author:** Christopher Lambert | **PR:** [#2374](https://github.com/apache/polaris/pull/2374)
**Files:** 3 | **Changes:** +10/-77

**PURPOSE:** Code removal

**WHAT CHANGED:** Modified Persistence Layer in Core, Persistence

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage | Focused change | Requires careful deployment

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/AtomicOperationMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/BaseMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalMetaStoreManagerImpl.java`

**Additional details from commit message:**
```
the existing helper methods on the entity instead
```

---

### 189. `12ab618` - Minor refactor of integration test classes (#2384)

**Date:** 2025-08-19 | **Author:** Alexandre Dutra | **PR:** [#2384](https://github.com/apache/polaris/pull/2384)
**Files:** 7 | **Changes:** +265/-141

**PURPOSE:** Code refactoring; Test improvement

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/CatalogConfig.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/IcebergHelper.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/IntegrationTestsHelper.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/RestCatalogConfig.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisPolicyServiceIntegrationTest.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisRestCatalogIntegrationBase.java`
- `runtime/service/src/intTest/java/org/apache/polaris/service/it/PolarisRestCatalogMinIOIT.java`

**Additional details from commit message:**
```
This change is a preparatory work for #2280 (S3 remote signing).
```

---

### 190. `1fe6205` - Nit: add methods isExternal and isStaticFacade to CatalogEntity (#2386)

**Date:** 2025-08-19 | **Author:** Alexandre Dutra | **PR:** [#2386](https://github.com/apache/polaris/pull/2386)
**Files:** 2 | **Changes:** +20/-18

**PURPOSE:** New feature

**WHAT CHANGED:** Modified Entity Management in Core, Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Data Model | Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/entity/CatalogEntity.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogHandler.java`

---

### 191. `42245cb` - Nit: remove transitive dependencies from runtime/server/build.gradle.kts (#2385)

**Date:** 2025-08-19 | **Author:** Alexandre Dutra | **PR:** [#2385](https://github.com/apache/polaris/pull/2385)
**Files:** 1 | **Changes:** +0/-3

**PURPOSE:** Code removal; CI/CD improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/server/build.gradle.kts`

---

### 192. `76c5d54` - Nit: extract getResolvedCatalogEntity method in IcebergCatalogHandler (#2387)

**Date:** 2025-08-19 | **Author:** Alexandre Dutra | **PR:** [#2387](https://github.com/apache/polaris/pull/2387)
**Files:** 1 | **Changes:** +22/-83

**PURPOSE:** Code modification

**WHAT CHANGED:** in Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogHandler.java`

---

### 193. `850792c` - chore(deps): bump s3mock from 3.11.0 to 4.7.0 (#2375)

**Date:** 2025-08-19 | **Author:** Artur Rakhmatulin | **PR:** [#2375](https://github.com/apache/polaris/pull/2375)
**Files:** 6 | **Changes:** +91/-72

**PURPOSE:** Code modification

**WHAT CHANGED:** in Spark Plugin including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Spark Integration | Focused change

**Files modified:**
- `integration-tests/build.gradle.kts`
- `integration-tests/src/main/java/org/apache/polaris/service/it/ext/PolarisSparkIntegrationTestBase.java`
- `plugins/spark/v3.5/integration/src/intTest/java/org/apache/polaris/spark/quarkus/it/SparkIntegrationBase.java`
- `runtime/test-common/build.gradle.kts`
- `runtime/test-common/src/main/java/org/apache/polaris/test/commons/s3mock/S3Mock.java`
- `runtime/test-common/src/main/resources/org/apache/polaris/test/commons/s3mock/Dockerfile-s3mock-version`

**Additional details from commit message:**
```
Changes
    Upgraded S3Mock testcontainer to 4.7.0
    Created S3Mock wrapper class for consistent configuration
    Consolidated S3 config properties generation
    Updated integration tests to use new wrapper
No functional changes to test behavior.
```

---

### 194. `e1b9833` - Reduce getRealmConfig calls (#2337)

**Date:** 2025-08-19 | **Author:** Christopher Lambert | **PR:** [#2337](https://github.com/apache/polaris/pull/2337)
**Files:** 14 | **Changes:** +78/-104

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Admin Service in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Management Operations | Medium-scale change

**Files modified:**
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

**Additional details from commit message:**
```
The idea is that long term we would want to stop relying on the `CallContext` itself but instead inject its individual items. Thus we also add `RealmConfig` to `TestServices`.
```

---

### 195. `83d09cc` - Modularize generic table federation (#2379)

**Date:** 2025-08-18 | **Author:** Eric Maynard | **PR:** [#2379](https://github.com/apache/polaris/pull/2379)
**Files:** 16 | **Changes:** +187/-30

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Catalog, Connection Management in Core, Runtime Service including test updates

**WHY NEEDED:** to enhance catalog functionality; to support catalog federation features

**IMPACT:** Affects: Catalog Operations, External Integrations | Medium-scale change

**Sample files (showing 15 of 16):**
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

---

### 196. `dc23a1c` - Add PolarisDiagnostics field to TransactionWorkspaceMetaStoreManager (#2359)

**Date:** 2025-08-18 | **Author:** Christopher Lambert | **PR:** [#2359](https://github.com/apache/polaris/pull/2359)
**Files:** 3 | **Changes:** +45/-85

**PURPOSE:** New feature; CI/CD improvement

**WHAT CHANGED:** Modified Persistence Layer in Core, Persistence, Runtime Service

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage | Focused change | Requires careful deployment

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/TransactionWorkspaceMetaStoreManager.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/common/CatalogHandler.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogHandler.java`

**Additional details from commit message:**
```
`PolarisMetaStoreManager` interface method, so we make steps towards
reducing its usage first.
```

---

### 197. `7f50667` - Support HMS Federation (#2355)

**Date:** 2025-08-18 | **Author:** Pooja Nilangekar | **PR:** [#2355](https://github.com/apache/polaris/pull/2355)
**Files:** 10 | **Changes:** +301/-0

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** Modified Connection Management in Core, Documentation, OpenAPI Specs

**WHY NEEDED:** to support catalog federation features

**IMPACT:** Affects: API Contracts, External Integrations, User Documentation | Focused change | May affect API consumers

**Files modified:**
- `extensions/federation/hive/README.md`
- `extensions/federation/hive/build.gradle.kts`
- `extensions/federation/hive/src/main/java/org/apache/polaris/extensions/federation/hive/HiveFederatedCatalogFactory.java`
- `gradle/libs.versions.toml`
- `gradle/projects.main.properties`
- `polaris-core/src/main/java/org/apache/polaris/core/connection/ConnectionConfigInfoDpo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/connection/ConnectionType.java`
- `polaris-core/src/main/java/org/apache/polaris/core/connection/hive/HiveConnectionConfigInfoDpo.java`
- `runtime/server/build.gradle.kts`
- `spec/polaris-management-service.yml`

**Additional details from commit message:**
```
All hive dependencies are added in an independent module, i.e., `polaris-extensions-federation-hive` and can be removed/converted to a compile time flag if necessary. 
Similar to HadoopCatalog, HMS federation support is currently restricted to `IMPLICIT` auth. The underlying authentication can be any form that Hive supports, however Polaris will not store and manage any of these credentials. Again, similar to HadoopCatalog, this version supports federating to a single Hive instance. 
This PR ...
```

---

### 198. `22e0c1c` - Add PolarisDiagnostics field to TransactionalMetaStoreManagerImpl (#2361)

**Date:** 2025-08-18 | **Author:** Christopher Lambert | **PR:** [#2361](https://github.com/apache/polaris/pull/2361)
**Files:** 6 | **Changes:** +114/-159

**PURPOSE:** New feature; CI/CD improvement

**WHAT CHANGED:** Modified EclipseLink Persistence, Persistence Layer in Core, Persistence including test updates

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage, JPA/ORM | Focused change | Requires careful deployment

**Files modified:**
- `persistence/eclipselink/src/test/java/org/apache/polaris/extension/persistence/impl/eclipselink/PolarisEclipseLinkMetaStoreManagerTest.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalMetaStoreManagerImpl.java`
- `polaris-core/src/test/java/org/apache/polaris/core/persistence/PolarisTreeMapMetaStoreManagerTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/persistence/ResolverTest.java`
- `polaris-core/src/test/java/org/apache/polaris/core/persistence/cache/InMemoryEntityCacheTest.java`

**Additional details from commit message:**
```
PolarisMetaStoreManager interface method, so we make steps towards reducing
its usage first.
```

---

### 199. `96f1459` - Refactor Authenticator and PolarisPrincipal (#2307)

**Date:** 2025-08-18 | **Author:** Alexandre Dutra | **PR:** [#2307](https://github.com/apache/polaris/pull/2307)
**Files:** 62 | **Changes:** +460/-426

**PURPOSE:** New feature; Code refactoring; Security enhancement; CI/CD improvement

**WHAT CHANGED:** Modified Admin Service, Authentication/Authorization, Persistence Layer, Service Authentication in Core, Documentation, Persistence, Runtime Service including test updates

**WHY NEEDED:** to improve security and access control; to enhance data storage reliability

**IMPACT:** Affects: API Security, Database/Storage, Management Operations, Security, User Documentation | Large-scale change affecting multiple modules | Security-sensitive change | May affect API consumers | Requires careful deployment

**Sample files (showing 15 of 62):**
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

**Additional details from commit message:**
```
- `AuthenticatedPolarisPrincipal` becomes an interface `PolarisPrincipal`, as the original class leaks implementation details (references to `PrincipalEntity` and thus to the storage layer). The new interface does not reference the storage layer. This is one step further towards easy pluggability of authentication in Polaris.
- The `Authenticator.authenticate()` method does not return an `Optional` anymore, as this was ambiguous (returning `Optional.empty()` vs throwing `NotAuthorizedExceptio...
```

---

### 200. `5a7686b` - Rat-check: exclude venv, cleanup excludes, include .svg (#2363)

**Date:** 2025-08-18 | **Author:** Robert Stupp | **PR:** [#2363](https://github.com/apache/polaris/pull/2363)
**Files:** 9 | **Changes:** +187/-36

**PURPOSE:** Code refactoring

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `build.gradle.kts`
- `site/static/favicons/favicon.svg`
- `site/static/img/apache-incubator.svg`
- `site/static/img/example-workflow.svg`
- `site/static/img/logos/polaris-catalog-stacked-logo.svg`
- `site/static/img/overview.svg`
- `site/static/img/rbac-example.svg`
- `site/static/img/rbac-model.svg`
- `site/static/img/sample-catalog-structure.svg`

**Additional details from commit message:**
```
* Re-grouped the exclusion rat patterns
* Added exclude for `.venv`
* Added exclude for `.ruff_cache`
```

---

### 201. `e45be14` - SigV4 Auth Support for Catalog Federation - Part 2: Connection Config Persistence (#2190)

**Date:** 2025-08-15 | **Author:** Rulin Xing | **PR:** [#2190](https://github.com/apache/polaris/pull/2190)
**Files:** 20 | **Changes:** +649/-77

**PURPOSE:** Bug fix; Security enhancement

**WHAT CHANGED:** Modified Admin Service, Connection Management, Entity Management, Secrets Management in Core, Runtime Service including test updates

**WHY NEEDED:** to support catalog federation features

**IMPACT:** Affects: Credentials, Data Model, External Integrations, Management Operations | Medium-scale change

**Sample files (showing 15 of 20):**
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

**Additional details from commit message:**
```
* Rename UserSecretReference to SecretReference and fix some small issues
```

---

### 202. `7af85be` - Use asMap property helpers (#2347)

**Date:** 2025-08-15 | **Author:** Christopher Lambert | **PR:** [#2347](https://github.com/apache/polaris/pull/2347)
**Files:** 7 | **Changes:** +35/-91

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Entity Management, Persistence Layer in Core, Persistence including test updates

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Data Model, Database/Storage | Focused change | Requires careful deployment

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/entity/PolarisBaseEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/AtomicOperationMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/BaseMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalMetaStoreManagerImpl.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/cache/StorageCredentialCacheTest.java`
- `polaris-core/src/testFixtures/java/org/apache/polaris/core/persistence/BasePolarisMetaStoreManagerTest.java`
- `polaris-core/src/testFixtures/java/org/apache/polaris/core/persistence/PolarisTestMetaStoreManager.java`

**Additional details from commit message:**
```
getting used consistently
```

---

### 203. `f7745c2` - IntelliJ: fix project icon in IJ project list (#2366)

**Date:** 2025-08-15 | **Author:** Robert Stupp | **PR:** [#2366](https://github.com/apache/polaris/pull/2366)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `build.gradle.kts`

---

### 204. `260438f` - Fix soft-merge conflict on `main` (#2364)

**Date:** 2025-08-15 | **Author:** Robert Stupp | **PR:** [#2364](https://github.com/apache/polaris/pull/2364)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/AbstractPolicyCatalogTest.java`

---

### 205. `c9efc6c` - fix(deps): update mockito monorepo to v5.19.0 (#2360)

**Date:** 2025-08-15 | **Author:** Mend Renovate | **PR:** [#2360](https://github.com/apache/polaris/pull/2360)
**Files:** 1 | **Changes:** +2/-2

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 206. `88f58fc` - Make PolarisAuthorizer RequestScoped (#2340)

**Date:** 2025-08-15 | **Author:** Christopher Lambert | **PR:** [#2340](https://github.com/apache/polaris/pull/2340)
**Files:** 12 | **Changes:** +21/-45

**PURPOSE:** New feature; Security enhancement

**WHAT CHANGED:** Modified Admin Service, Authentication/Authorization in Core, Runtime Service including test updates

**WHY NEEDED:** to improve security and access control

**IMPACT:** Affects: Management Operations, Security | Medium-scale change | Security-sensitive change

**Files modified:**
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

**Additional details from commit message:**
```
parameter.
in its only implementation only `CallContext.getRealmConfig` is getting
used.
so since `PolarisAuthorizer` cant be used outside a request, we can
simply make it request-scoped and inject the request-scoped `RealmConfig`
directly.
```

---

### 207. `6e036e0` - Fix REST responses for failed Admin operations (#2291)

**Date:** 2025-08-15 | **Author:** Christopher Lambert | **PR:** [#2291](https://github.com/apache/polaris/pull/2291)
**Files:** 9 | **Changes:** +479/-523

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified Admin Service in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Management Operations | Focused change

**Files modified:**
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisManagementServiceIntegrationTest.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisAdminService.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisServiceImpl.java`
- `runtime/service/src/test/java/org/apache/polaris/service/admin/PolarisAdminServiceAuthzTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/admin/PolarisAdminServiceTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/admin/PolarisAuthzTestBase.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/IcebergCatalogHandlerAuthzTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/PolarisGenericTableCatalogHandlerAuthzTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/PolicyCatalogHandlerAuthzTest.java`

**Additional details from commit message:**
```
the `boolean` return values of many methods in `PolarisAdminService`
were often simply not getting used at all, thus the REST api returned
success in those cases even though the `PrivilegeResult` was marked
as failed.
due to this fix a silently failing test now needs to be adjusted.
we return the `PrivilegeResult` instead of a `boolean` to give the
client at least some indication of what has gone wrong on the server
side.
note that some of the other operations were throwing Expcetions already...
```

---

### 208. `c4fc848` - Add integration tests with Keycloak (#2343)

**Date:** 2025-08-15 | **Author:** Alexandre Dutra | **PR:** [#2343](https://github.com/apache/polaris/pull/2343)
**Files:** 31 | **Changes:** +743/-200

**PURPOSE:** New feature

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Large-scale change affecting multiple modules

**Sample files (showing 15 of 31):**
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

---

### 209. `e041a01` - chore(deps): update postgres docker tag to v17.6 (#2354)

**Date:** 2025-08-15 | **Author:** Mend Renovate | **PR:** [#2354](https://github.com/apache/polaris/pull/2354)
**Files:** 2 | **Changes:** +2/-2

**PURPOSE:** Documentation update

**WHAT CHANGED:** Modified 2 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `getting-started/assets/postgres/docker-compose-postgres.yml`
- `runtime/admin/src/testFixtures/resources/org/apache/polaris/admintool/Dockerfile-postgres-version`

---

### 210. `61fb1fe` - chore(deps): update registry.access.redhat.com/ubi9/openjdk-21-runtime docker tag to v1.23-6 (#2353)

**Date:** 2025-08-15 | **Author:** Mend Renovate | **PR:** [#2353](https://github.com/apache/polaris/pull/2353)
**Files:** 2 | **Changes:** +2/-2

**PURPOSE:** Documentation update

**WHAT CHANGED:** Modified 2 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/admin/src/main/docker/Dockerfile.jvm`
- `runtime/server/src/main/docker/Dockerfile.jvm`

---

### 211. `c165249` - Replace CallContext with RealmConfig in CatalogEntity (#2336)

**Date:** 2025-08-15 | **Author:** Christopher Lambert | **PR:** [#2336](https://github.com/apache/polaris/pull/2336)
**Files:** 11 | **Changes:** +61/-68

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Admin Service, Entity Management, Storage Integration in Core, Runtime Service including test updates

**WHY NEEDED:** to improve cloud storage integration

**IMPACT:** Affects: Cloud Storage, Data Model, Management Operations | Medium-scale change

**Files modified:**
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

### 212. `fac650a` - Replace CallContext with RealmConfig in enforceFeatureEnabledOrThrow (#2348)

**Date:** 2025-08-15 | **Author:** Christopher Lambert | **PR:** [#2348](https://github.com/apache/polaris/pull/2348)
**Files:** 5 | **Changes:** +6/-7

**PURPOSE:** New feature

**WHAT CHANGED:** Modified Admin Service in Core, Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Management Operations | Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/config/FeatureConfiguration.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisAdminService.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/generic/GenericTableCatalogAdapter.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogHandler.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/policy/PolicyCatalogAdapter.java`

---

### 213. `b2b1453` - Modularize federation (Option 2) (#2332)

**Date:** 2025-08-14 | **Author:** Pooja Nilangekar | **PR:** [#2332](https://github.com/apache/polaris/pull/2332)
**Files:** 11 | **Changes:** +303/-52

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Catalog, Connection Management in Core, Runtime Service including test updates

**WHY NEEDED:** to enhance catalog functionality; to support catalog federation features

**IMPACT:** Affects: Catalog Operations, External Integrations | Medium-scale change

**Files modified:**
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

**Additional details from commit message:**
```
* Move polaris-extensions-federation-hadoop dependency
* Change identifier to lowerCase
* Change identifiers to constants
```

---

### 214. `22e4c68` - Add a regression test for Catalog Federation (#2286)

**Date:** 2025-08-14 | **Author:** Pooja Nilangekar | **PR:** [#2286](https://github.com/apache/polaris/pull/2286)
**Files:** 5 | **Changes:** +269/-2

**PURPOSE:** Bug fix; New feature; Test improvement; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to support catalog federation features

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `regtests/Dockerfile`
- `regtests/README.md`
- `regtests/docker-compose.yml`
- `regtests/t_catalog_federation/ref/catalog_federation.sh.ref`
- `regtests/t_catalog_federation/src/catalog_federation.sh`

**Additional details from commit message:**
```
* Install jq dependency
* Fix token issues
* Update regtests/README.md
Co-authored-by: Eric Maynard <emaynard@apache.org>
* Update README.md
---------
Co-authored-by: Eric Maynard <emaynard@apache.org>
```

---

### 215. `efc68e8` - Use PolarisTaskConstants (#2346)

**Date:** 2025-08-14 | **Author:** Christopher Lambert | **PR:** [#2346](https://github.com/apache/polaris/pull/2346)
**Files:** 3 | **Changes:** +7/-4

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Persistence Layer in Core, Persistence including test updates

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage | Focused change | Requires careful deployment

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/AtomicOperationMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalMetaStoreManagerImpl.java`
- `polaris-core/src/testFixtures/java/org/apache/polaris/core/persistence/BasePolarisMetaStoreManagerTest.java`

---

### 216. `ee04df4` - Add entitySubType param to BasePersistence.listEntities (#2317)

**Date:** 2025-08-13 | **Author:** Christopher Lambert | **PR:** [#2317](https://github.com/apache/polaris/pull/2317)
**Files:** 9 | **Changes:** +73/-167

**PURPOSE:** New feature; Performance optimization; CI/CD improvement

**WHAT CHANGED:** Modified EclipseLink Persistence, JDBC Persistence, Persistence Layer in Core, Persistence

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage, JPA/ORM, Relational Databases | Focused change | Requires careful deployment

**Files modified:**
- `persistence/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/PolarisEclipseLinkMetaStoreSessionImpl.java`
- `persistence/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/PolarisEclipseLinkStore.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/AtomicOperationMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/BasePersistence.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/AbstractTransactionalPersistence.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalMetaStoreManagerImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalPersistence.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TreeMapTransactionalPersistenceImpl.java`

**Additional details from commit message:**
```
```
Page<EntityNameLookupRecord> listEntities(..., PageToken);
Page<EntityNameLookupRecord> listEntities(..., Predicate<PolarisBaseEntity>, PageToken)
<T> Page<T> listEntities(..., Predicate<PolarisBaseEntity>, Function<PolarisBaseEntity, T>, PageToken);
```
the 1st method exists to only return the subset of entity properties required to build an `EntityNameLookupRecord`.
the 3rd method supports a predicate and transformer function on the underlying `PolarisBaseEntity`, which means it has to ...
```

---

### 217. `cdb58e5` - Remove CallContext from IcebergPropertiesValidation (#2338)

**Date:** 2025-08-13 | **Author:** Christopher Lambert | **PR:** [#2338](https://github.com/apache/polaris/pull/2338)
**Files:** 4 | **Changes:** +21/-21

**PURPOSE:** Code removal

**WHAT CHANGED:** in Core, Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/rest/PolarisEndpoints.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogAdapter.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/validation/IcebergPropertiesValidation.java`

**Additional details from commit message:**
```
same applies to helpers in `PolarisEndpoints`.
```

---

### 218. `027d80b` - Remove redundant locations when constructing access policies (#2149)

**Date:** 2025-08-13 | **Author:** Eric Maynard | **PR:** [#2149](https://github.com/apache/polaris/pull/2149)
**Files:** 5 | **Changes:** +117/-83

**PURPOSE:** Code refactoring; Code removal; CI/CD improvement

**WHAT CHANGED:** Modified Storage Integration in Core, Runtime Service including test updates

**WHY NEEDED:** to improve cloud storage integration

**IMPACT:** Affects: Cloud Storage | Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/storage/PolarisStorageConfigurationInfo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/StorageLocation.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/StorageUtil.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/StorageUtilTest.java`
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`

**Additional details from commit message:**
```
1. The table's base location
2. The table's `write.data.path`, if set
3. The table's `write.metadata.path`, if set
This was intended to capture scenarios where e.g. (2) is not a child path of (1), so that the vended credentials can still be valid for reading the entire table. However, there are systems that seem to always set (2) and (3), such as:
1. `s3:/my-bucket/base/iceberg`
2. `s3:/my-bucket/base/iceberg/data`
3. `s3:/my-bucket/base/iceberg/metadata`
In such cases the extra paths (e.g. e...
```

---

### 219. `1277eff` - Remove spotbugs-annotations (#2320)

**Date:** 2025-08-13 | **Author:** Christopher Lambert | **PR:** [#2320](https://github.com/apache/polaris/pull/2320)
**Files:** 4 | **Changes:** +3/-8

**PURPOSE:** Bug fix; Code removal

**WHAT CHANGED:** Modified Persistence Layer in Core, Persistence, Runtime Service

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage | Focused change | Requires careful deployment

**Files modified:**
- `gradle/libs.versions.toml`
- `polaris-core/build.gradle.kts`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalMetaStoreManagerImpl.java`
- `runtime/service/build.gradle.kts`

**Additional details from commit message:**
```
on the annotations is not necessary.
also fix name of common-codec lib.
```

---

### 220. `d7d8990` - Make S3 `roleARN` optional (#2329)

**Date:** 2025-08-13 | **Author:** Robert Stupp | **PR:** [#2329](https://github.com/apache/polaris/pull/2329)
**Files:** 15 | **Changes:** +122/-140

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Admin Service, Entity Management, Storage Integration in Core, Documentation, OpenAPI Specs, Runtime Service including test updates

**WHY NEEDED:** to improve cloud storage integration

**IMPACT:** Affects: API Contracts, Cloud Storage, Data Model, Management Operations, User Documentation | Medium-scale change | May affect API consumers

**Files modified:**
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

### 221. `cc03796` - Let CI archive html test reports (#2327)

**Date:** 2025-08-13 | **Author:** Christopher Lambert | **PR:** [#2327](https://github.com/apache/polaris/pull/2327)
**Files:** 1 | **Changes:** +3/-0

**PURPOSE:** Test improvement; CI/CD improvement

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/gradle.yml`

**Additional details from commit message:**
```
able to download the html report compared to the XML reports (as the
latter requires to you find the right file/failure manually).
```

---

### 222. `a0f3f0d` - JWTBroker: move error message (#2330)

**Date:** 2025-08-13 | **Author:** Alexandre Dutra | **PR:** [#2330](https://github.com/apache/polaris/pull/2330)
**Files:** 1 | **Changes:** +3/-2

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** Modified Service Authentication in Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: API Security | Focused change | May affect API consumers

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/auth/JWTBroker.java`

**Additional details from commit message:**
```
On the token generation path, this should be a no-op; however, on the authentication path, this log message was excessive, especially when using mixed authentication since a failure to decode a token is perfectly normal when the token is from an external IDP.
```

---

### 223. `6647374` - fix(deps): update immutables to v2.11.3 (#2333)

**Date:** 2025-08-13 | **Author:** Mend Renovate | **PR:** [#2333](https://github.com/apache/polaris/pull/2333)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 224. `2f985ab` - CatalogEntity: internal endpoint not considered (#2292)

**Date:** 2025-08-11 | **Author:** Robert Stupp | **PR:** [#2292](https://github.com/apache/polaris/pull/2292)
**Files:** 2 | **Changes:** +10/-0

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Entity Management in Core, Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Data Model | Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/entity/CatalogEntity.java`
- `runtime/service/src/intTest/java/org/apache/polaris/service/it/RestCatalogMinIOSpecialIT.java`

---

### 225. `ad33b48` - chore(deps): update actions/checkout action to v5 (#2319)

**Date:** 2025-08-11 | **Author:** Mend Renovate | **PR:** [#2319](https://github.com/apache/polaris/pull/2319)
**Files:** 7 | **Changes:** +11/-11

**PURPOSE:** Code modification

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/gradle.yml`
- `.github/workflows/helm.yml`
- `.github/workflows/nightly.yml`
- `.github/workflows/python-client.yml`
- `.github/workflows/regtest.yml`
- `.github/workflows/site.yml`
- `.github/workflows/spark_client_regtests.yml`

---

### 226. `8a5b80a` - Separate Cloud Integration Tests (#2283)

**Date:** 2025-08-11 | **Author:** Tamas Mate | **PR:** [#2283](https://github.com/apache/polaris/pull/2283)
**Files:** 16 | **Changes:** +116/-112

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** in Documentation, Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Medium-scale change

**Sample files (showing 15 of 16):**
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

**Additional details from commit message:**
```
but require cloud credentials to execute properly. This creates
unnecessary overhead for developers who just want to run local builds
or for CI jobs that don't have cloud access configured.
```

---

### 227. `f6a2abb` - Perform force repair when polaris not found (#2313)

**Date:** 2025-08-09 | **Author:** Yong Zheng | **PR:** [#2313](https://github.com/apache/polaris/pull/2313)
**Files:** 1 | **Changes:** +7/-0

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris`

---

### 228. `1b93169` - Fix Hadoop federation to initialize the configuration prior to catalog initialization (#2282)

**Date:** 2025-08-08 | **Author:** Pooja Nilangekar | **PR:** [#2282](https://github.com/apache/polaris/pull/2282)
**Files:** 1 | **Changes:** +18/-2

**PURPOSE:** Bug fix; CI/CD improvement

**WHAT CHANGED:** in Runtime Service

**WHY NEEDED:** to support catalog federation features

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogHandler.java`

**Additional details from commit message:**
```
The iceberg library expects the hadoop configuration to be initialized before creating a HadoopCatalog object. This change ensures that Polaris is compatible with the underlying iceberg library. Additionally, since the config initialization is based on the underlying (default) core-site.xml file, the change ensures that the federated catalog was created using `IMPLICIT` authentication mode. 
Testing: 
Due to current limitations in the current test setup, tested the change manually.
[TODO] Add...
```

---

### 229. `d753e3d` - fix: typo in server template files. (#2288)

**Date:** 2025-08-07 | **Author:** Yujiang Zhong | **PR:** [#2288](https://github.com/apache/polaris/pull/2288)
**Files:** 2 | **Changes:** +2/-2

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 2 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `server-templates/apiService.mustache`
- `server-templates/apiServiceImpl.mustache`

---

### 230. `c2b5de1` - Add PolarisAdminService.loadEntities helper (#2261)

**Date:** 2025-08-07 | **Author:** Christopher Lambert | **PR:** [#2261](https://github.com/apache/polaris/pull/2261)
**Files:** 3 | **Changes:** +71/-98

**PURPOSE:** Bug fix; New feature

**WHAT CHANGED:** Modified Admin Service in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Management Operations | Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisAdminService.java`
- `runtime/service/src/main/java/org/apache/polaris/service/admin/PolarisServiceImpl.java`
- `runtime/service/src/test/java/org/apache/polaris/service/admin/ManagementServiceTest.java`

**Additional details from commit message:**
```
sub-optimal `PolarisMetaStoreManager` APIs.
This results in multiple fixes like #1949 and #2258
While eventually the underlying APIs should be improved, for now we can
make a single central workaround and clean up some redundant code.
Also we can improve the return types as callers are not interested in
details of the entity layer.
```

---

### 231. `ef177b5` - Remove PolarisCallContext.getClock (#2250)

**Date:** 2025-08-07 | **Author:** Christopher Lambert | **PR:** [#2250](https://github.com/apache/polaris/pull/2250)
**Files:** 31 | **Changes:** +129/-165

**PURPOSE:** Code removal; CI/CD improvement

**WHAT CHANGED:** Modified Admin Service, EclipseLink Persistence, JDBC Persistence, Persistence Layer, Service Authentication in Core, Persistence, Runtime Service including test updates

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: API Security, Database/Storage, JPA/ORM, Management Operations, Relational Databases | Large-scale change affecting multiple modules | May affect API consumers | Requires careful deployment

**Sample files (showing 15 of 31):**
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

**Additional details from commit message:**
```
realm or call specific context class.
```

---

### 232. `35b31ca` - Clean exit when running repair mode for client (#2287)

**Date:** 2025-08-06 | **Author:** Yong Zheng | **PR:** [#2287](https://github.com/apache/polaris/pull/2287)
**Files:** 1 | **Changes:** +7/-2

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris`

**Additional details from commit message:**
```
* Clean exit when running repair mode for client
```

---

### 233. `04e65af` - Use injected PolarisDiagnostics in MetaStoreManagerFactory impls (#2251)

**Date:** 2025-08-06 | **Author:** Christopher Lambert | **PR:** [#2251](https://github.com/apache/polaris/pull/2251)
**Files:** 7 | **Changes:** +23/-23

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Admin Service, JDBC Persistence, Persistence Layer in Core, Persistence, Runtime Service including test updates

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage, Management Operations, Relational Databases | Focused change | Requires careful deployment

**Files modified:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcMetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`
- `runtime/service/src/main/java/org/apache/polaris/service/persistence/InMemoryAtomicOperationMetaStoreManagerFactory.java`
- `runtime/service/src/main/java/org/apache/polaris/service/persistence/InMemoryPolarisMetaStoreManagerFactory.java`
- `runtime/service/src/main/java/org/apache/polaris/service/task/TaskExecutorImpl.java`
- `runtime/service/src/test/java/org/apache/polaris/service/admin/PolarisAuthzTestBase.java`
- `runtime/service/src/test/java/org/apache/polaris/service/entity/CatalogEntityTest.java`

---

### 234. `7fbd3ab` - Use Mockito Java agent for mock instrumentation (#2275)

**Date:** 2025-08-06 | **Author:** Alexandre Dutra | **PR:** [#2275](https://github.com/apache/polaris/pull/2275)
**Files:** 1 | **Changes:** +10/-2

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `build-logic/src/main/kotlin/polaris-java.gradle.kts`

**Additional details from commit message:**
```
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
    WARNING: A Java agent has been loaded dynamically (.../byte-buddy-agent-1.17.5.jar)
    WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hid...
```

---

### 235. `0c790e0` - Standardize logging libraries in tests (#2268)

**Date:** 2025-08-06 | **Author:** Alexandre Dutra | **PR:** [#2268](https://github.com/apache/polaris/pull/2268)
**Files:** 19 | **Changes:** +277/-96

**PURPOSE:** New feature

**WHAT CHANGED:** Modified JDBC Persistence in Persistence, Runtime Service, Spark Plugin including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Relational Databases, Spark Integration | Medium-scale change

**Sample files (showing 15 of 19):**
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

**Additional details from commit message:**
```
- Non-Quarkus modules use Logback Classic, configured via logback-test.xml
- Quarkus modules use JBoss Logging Manager, configured in Quarkus configuration files.
This change also introduces a workaround for the "duplicate log messages" issues with Gradle + JBoss Logging Manager. See this issue for context:
https://github.com/quarkusio/quarkus/issues/22844
The workaround implemented in this PR is very similar to the one proposed in this comment:
https://github.com/quarkusio/quarkus/issues/228...
```

---

### 236. `565a3ee` - Nit: simplify runtime-service dependencies (#2273)

**Date:** 2025-08-06 | **Author:** Alexandre Dutra | **PR:** [#2273](https://github.com/apache/polaris/pull/2273)
**Files:** 1 | **Changes:** +3/-6

**PURPOSE:** Code refactoring; CI/CD improvement

**WHAT CHANGED:** in Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/build.gradle.kts`

---

### 237. `f34adca` - Add TestServices.newCallContext (#2249)

**Date:** 2025-08-06 | **Author:** Christopher Lambert | **PR:** [#2249](https://github.com/apache/polaris/pull/2249)
**Files:** 6 | **Changes:** +33/-61

**PURPOSE:** New feature; Test improvement

**WHAT CHANGED:** Modified Admin Service in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Management Operations | Focused change

**Files modified:**
- `runtime/service/src/test/java/org/apache/polaris/service/admin/ManagementServiceTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/io/FileIOFactoryTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/task/BatchFileCleanupTaskHandlerTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/task/ManifestFileCleanupTaskHandlerTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/task/TaskExecutorImplTest.java`
- `runtime/service/src/testFixtures/java/org/apache/polaris/service/TestServices.java`

---

### 238. `4e82cd1` - Stop mocking PolarisDiagnostics (#2248)

**Date:** 2025-08-06 | **Author:** Christopher Lambert | **PR:** [#2248](https://github.com/apache/polaris/pull/2248)
**Files:** 2 | **Changes:** +3/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/test/java/org/apache/polaris/service/task/TaskExecutorImplTest.java`
- `runtime/service/src/testFixtures/java/org/apache/polaris/service/TestServices.java`

---

### 239. `3858a16` - Prefer diagnostics field in Resolver (#2247)

**Date:** 2025-08-06 | **Author:** Christopher Lambert | **PR:** [#2247](https://github.com/apache/polaris/pull/2247)
**Files:** 1 | **Changes:** +3/-3

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Persistence Layer in Core, Persistence

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage | Focused change | Requires careful deployment

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/resolver/Resolver.java`

---

### 240. `7095fd6` - chore(deps): update actions/download-artifact action to v5 (#2271)

**Date:** 2025-08-06 | **Author:** Mend Renovate | **PR:** [#2271](https://github.com/apache/polaris/pull/2271)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `.github/actions/ci-incr-build-cache-prepare/action.yml`

---

### 241. `af69d9f` - JdbcMetaStoreManagerFactory determines schemaVersion once per realm (#2217)

**Date:** 2025-08-05 | **Author:** Christopher Lambert | **PR:** [#2217](https://github.com/apache/polaris/pull/2217)
**Files:** 3 | **Changes:** +14/-8

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified JDBC Persistence in Persistence including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Relational Databases | Focused change

**Files modified:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcMetaStoreManagerFactory.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/AtomicMetastoreManagerWithJdbcBasePersistenceImplTest.java`

---

### 242. `20febda` - Merge polaris-service-common into polaris-runtime-service (#2233)

**Date:** 2025-08-05 | **Author:** Alexandre Dutra | **PR:** [#2233](https://github.com/apache/polaris/pull/2233)
**Files:** 290 | **Changes:** +779/-1150

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Admin Service, Service Authentication in CI/CD, Documentation, Persistence, Runtime Service, Spark Plugin including test updates

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: API Security, Build/Test Automation, Management Operations, Spark Integration, User Documentation | Large-scale change affecting multiple modules | May affect API consumers

**Sample files (showing 15 of 290):**
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

---

### 243. `b476779` - JDBC: SERIALIZABLE/EntityNotFoundException (#2219)

**Date:** 2025-08-05 | **Author:** Robert Stupp | **PR:** [#2219](https://github.com/apache/polaris/pull/2219)
**Files:** 1 | **Changes:** +10/-4

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified JDBC Persistence in Persistence

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Relational Databases | Focused change

**Files modified:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`

---

### 244. `355adae` - Make `*StorageConfigurationInfo` types immutable (#2236)

**Date:** 2025-08-05 | **Author:** Robert Stupp | **PR:** [#2236](https://github.com/apache/polaris/pull/2236)
**Files:** 13 | **Changes:** +395/-382

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Entity Management, Storage Integration in Core including test updates

**WHY NEEDED:** to improve cloud storage integration

**IMPACT:** Affects: Cloud Storage, Data Model | Medium-scale change

**Files modified:**
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

### 245. `5fb38c5` - chore(deps): update registry.access.redhat.com/ubi9/openjdk-21-runtime docker tag to v1.22-1.1753981256 (#2266)

**Date:** 2025-08-05 | **Author:** Mend Renovate | **PR:** [#2266](https://github.com/apache/polaris/pull/2266)
**Files:** 2 | **Changes:** +2/-2

**PURPOSE:** Documentation update

**WHAT CHANGED:** Modified 2 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/admin/src/main/docker/Dockerfile.jvm`
- `runtime/server/src/main/docker/Dockerfile.jvm`

---

### 246. `532ee51` - Remove config parameter from `PolarisStorageIntegration#getSubscopedCreds` (#2235)

**Date:** 2025-08-05 | **Author:** Robert Stupp | **PR:** [#2235](https://github.com/apache/polaris/pull/2235)
**Files:** 16 | **Changes:** +104/-136

**PURPOSE:** Code removal

**WHAT CHANGED:** Modified Persistence Layer, Storage Integration in Core, Persistence, Runtime Service including test updates

**WHY NEEDED:** to enhance data storage reliability; to improve cloud storage integration

**IMPACT:** Affects: Cloud Storage, Database/Storage | Medium-scale change | Requires careful deployment

**Sample files (showing 15 of 16):**
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

**Additional details from commit message:**
```
This change removes the config parameter, as it's already known when `PolarisStorageIntegration` instances are created.
```

---

### 247. `64d815a` - chore(deps): update gradle/actions digest to 017a9ef (#2265)

**Date:** 2025-08-05 | **Author:** Mend Renovate | **PR:** [#2265](https://github.com/apache/polaris/pull/2265)
**Files:** 5 | **Changes:** +8/-8

**PURPOSE:** Code modification

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/actions/ci-incr-build-cache-prepare/action.yml`
- `.github/workflows/gradle.yml`
- `.github/workflows/nightly.yml`
- `.github/workflows/regtest.yml`
- `.github/workflows/spark_client_regtests.yml`

---

### 248. `ff9fdcd` - chore(deps): update plugin jetbrains-changelog to v2.4.0 (#2264)

**Date:** 2025-08-05 | **Author:** Mend Renovate | **PR:** [#2264](https://github.com/apache/polaris/pull/2264)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 249. `bbb7b43` - Use application-scope clock when generating GCP credentials (#2241)

**Date:** 2025-08-05 | **Author:** Alexandre Dutra | **PR:** [#2241](https://github.com/apache/polaris/pull/2241)
**Files:** 3 | **Changes:** +15/-10

**PURPOSE:** Code modification

**WHAT CHANGED:** including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `service/common/src/main/java/org/apache/polaris/service/storage/PolarisStorageIntegrationProviderImpl.java`
- `service/common/src/main/java/org/apache/polaris/service/storage/StorageConfiguration.java`
- `service/common/src/test/java/org/apache/polaris/service/storage/StorageConfigurationTest.java`

---

### 250. `f2a54cb` - QuarkusProducers: remove unneeded `BasePersistence` producer (#2255)

**Date:** 2025-08-05 | **Author:** Robert Stupp | **PR:** [#2255](https://github.com/apache/polaris/pull/2255)
**Files:** 1 | **Changes:** +8/-15

**PURPOSE:** Code removal

**WHAT CHANGED:** in Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/quarkus/config/QuarkusProducers.java`

---

### 251. `7774613` - Only pass `RealmConfig` to `PolarisStorageIntegration` (#2234)

**Date:** 2025-08-05 | **Author:** Robert Stupp | **PR:** [#2234](https://github.com/apache/polaris/pull/2234)
**Files:** 12 | **Changes:** +32/-40

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Persistence Layer, Storage Integration in Core, Persistence including test updates

**WHY NEEDED:** to enhance data storage reliability; to improve cloud storage integration

**IMPACT:** Affects: Cloud Storage, Database/Storage | Medium-scale change | Requires careful deployment

**Files modified:**
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

### 252. `2f7e8a6` - fix(deps): update immutables to v2.11.2 (#2257)

**Date:** 2025-08-05 | **Author:** Mend Renovate | **PR:** [#2257](https://github.com/apache/polaris/pull/2257)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 253. `a660903` - Remove obsolete information from README-quarkus.md (#2252)

**Date:** 2025-08-04 | **Author:** Alexandre Dutra | **PR:** [#2252](https://github.com/apache/polaris/pull/2252)
**Files:** 2 | **Changes:** +43/-121

**PURPOSE:** Code removal; Documentation update

**WHAT CHANGED:** in Documentation, Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `runtime/service/README-quarkus.md`
- `runtime/service/README.md`

---

### 254. `97bbc39` - Replace TestPolarisMetaStoreManager with Mockito.spy (#2230)

**Date:** 2025-08-04 | **Author:** Christopher Lambert | **PR:** [#2230](https://github.com/apache/polaris/pull/2230)
**Files:** 1 | **Changes:** +16/-33

**PURPOSE:** Test improvement

**WHAT CHANGED:** Modified Admin Service in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Management Operations | Focused change

**Files modified:**
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/admin/ManagementServiceTest.java`

---

### 255. `14c9394` - Prepare upgrade to Gradle 9 (#2237)

**Date:** 2025-08-04 | **Author:** Robert Stupp | **PR:** [#2237](https://github.com/apache/polaris/pull/2237)
**Files:** 5 | **Changes:** +21/-24

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 5 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `api/iceberg-service/build.gradle.kts`
- `api/management-model/build.gradle.kts`
- `api/management-service/build.gradle.kts`
- `api/polaris-catalog-service/build.gradle.kts`
- `build-logic/src/main/kotlin/publishing/shadowPub.kt`

**Additional details from commit message:**
```
* `api/...` build scripts - changes due to nullable type handling (`Property<String>` vs `Property<String?>` - latter is ... weird)
```

---

### 256. `253321c` - Add ResolutionManifestFactory (#2210)

**Date:** 2025-08-04 | **Author:** Christopher Lambert | **PR:** [#2210](https://github.com/apache/polaris/pull/2210)
**Files:** 30 | **Changes:** +229/-329

**PURPOSE:** New feature

**WHAT CHANGED:** Modified Admin Service, Persistence Layer in Core, Persistence, Runtime Service including test updates

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage, Management Operations | Large-scale change affecting multiple modules | Requires careful deployment

**Sample files (showing 15 of 30):**
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

**Additional details from commit message:**
```
was left in `PolarisEntityManager`.
by splitting out the more dedicated `ResolutionManifestFactory` we can remove
`PolarisEntityManager` and `RealmEntityManagerFactory` completely it seems.
```

---

### 257. `7fa497c` - JDBC: Log SQL statements at debug level (#2221)

**Date:** 2025-08-04 | **Author:** Robert Stupp | **PR:** [#2221](https://github.com/apache/polaris/pull/2221)
**Files:** 1 | **Changes:** +17/-0

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified JDBC Persistence in Persistence

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Relational Databases | Focused change

**Files modified:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/DatasourceOperations.java`

---

### 258. `d3dbe0c` - Fix deprecated Quarkus log properties (#2216)

**Date:** 2025-08-01 | **Author:** Christopher Lambert | **PR:** [#2216](https://github.com/apache/polaris/pull/2216)
**Files:** 4 | **Changes:** +7/-7

**PURPOSE:** Bug fix; Deprecation; CI/CD improvement

**WHAT CHANGED:** in Documentation, Helm Charts

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Kubernetes Deployment, User Documentation | Focused change

**Files modified:**
- `helm/polaris/templates/configmap.yaml`
- `helm/polaris/tests/configmap_test.yaml`
- `runtime/defaults/src/main/resources/application.properties`
- `site/content/in-dev/unreleased/telemetry.md`

**Additional details from commit message:**
```
CI Quarkus tests were logging this repeatedly:
```
The "quarkus.log.file.json" config property is deprecated and should not be used anymore.
The "quarkus.log.console.json" config property is deprecated and should not be used anymore.
The "quarkus.log.file.json" config property is deprecated and should not be used anymore.
The "quarkus.log.console.json" config property is deprecated and should not be used anymore.
```
```

---

### 259. `e439ff5` - feat: Add `endpointInternal` to `AwsStorageConfigInfo` (#2213)

**Date:** 2025-08-01 | **Author:** Dmitri Bourlatchkov | **PR:** [#2213](https://github.com/apache/polaris/pull/2213)
**Files:** 6 | **Changes:** +134/-33

**PURPOSE:** New feature

**WHAT CHANGED:** Modified Entity Management, Storage Integration in Core, OpenAPI Specs, Runtime Service including test updates

**WHY NEEDED:** to improve cloud storage integration

**IMPACT:** Affects: API Contracts, Cloud Storage, Data Model | Focused change | May affect API consumers

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/entity/CatalogEntity.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/aws/AwsCredentialsStorageIntegration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/aws/AwsStorageConfigurationInfo.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/aws/AwsStorageConfigurationInfoTest.java`
- `runtime/service/src/intTest/java/org/apache/polaris/service/quarkus/it/QuarkusRestCatalogMinIOSpecialIT.java`
- `spec/polaris-management-service.yml`

**Additional details from commit message:**
```
This API change is backward compatible with older clients
and server using old storage configuration.
* The `endpointInternal` allows Polaris Servers to use a different
  host name (or IP address) for accessing S3 storage than clients.
  This is not a common use case, but may be relevant is more complex
  environments.
* If not set `endpointInternal` defaults to `endpoint`.
* The STS endpoint default changes to `endpointInternal`.
Contributes to #1530
```

---

### 260. `0449d9b` - Remove CallContext.CURRENT_CONTEXT (#2203)

**Date:** 2025-08-01 | **Author:** Christopher Lambert | **PR:** [#2203](https://github.com/apache/polaris/pull/2203)
**Files:** 6 | **Changes:** +7/-38

**PURPOSE:** Code removal; CI/CD improvement

**WHAT CHANGED:** Modified Context Management in Core, Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Request Handling | Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/context/CallContext.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/AbstractIcebergCatalogViewTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/test/PolarisIntegrationTestFixture.java`
- `service/common/src/main/java/org/apache/polaris/service/admin/PolarisServiceImpl.java`
- `service/common/src/main/java/org/apache/polaris/service/catalog/generic/GenericTableCatalogAdapter.java`
- `service/common/src/main/java/org/apache/polaris/service/catalog/policy/PolicyCatalogAdapter.java`

**Additional details from commit message:**
```
removed in the following commits:
- 756e535fabe150eefdfe16f3c61c1207217d2e2f
- e7eb59f6d89a5891381c805c9ed4244601d5b430
- 4d94745db36c5d4907cf34d749a3a2690f8e4fff
thus we can now remove the `CURRENT_CONTEXT` threadlocal and all
associated methods.
```

---

### 261. `0b3a129` - Fix compilation warnings in AzureCredentialStorageIntegrationTest (#2231)

**Date:** 2025-08-01 | **Author:** Alexandre Dutra | **PR:** [#2231](https://github.com/apache/polaris/pull/2231)
**Files:** 1 | **Changes:** +6/-4

**PURPOSE:** Bug fix; Test improvement

**WHAT CHANGED:** including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/src/test/java/org/apache/polaris/service/storage/azure/AzureCredentialStorageIntegrationTest.java`

---

### 262. `482dbba` - Fix Awaitility build configuration (#2232)

**Date:** 2025-08-01 | **Author:** Alexandre Dutra | **PR:** [#2232](https://github.com/apache/polaris/pull/2232)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; CI/CD improvement

**WHAT CHANGED:** in Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/build.gradle.kts`

---

### 263. `f6097d9` - chore(deps): update actions/stale digest to 8f717f0 (#2224)

**Date:** 2025-08-01 | **Author:** Mend Renovate | **PR:** [#2224](https://github.com/apache/polaris/pull/2224)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/stale.yml`

---

### 264. `8f488d5` - JDBC: Include error code + SQL state in exception messages (#2220)

**Date:** 2025-07-31 | **Author:** Robert Stupp | **PR:** [#2220](https://github.com/apache/polaris/pull/2220)
**Files:** 2 | **Changes:** +8/-4

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified JDBC Persistence in Persistence including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Relational Databases | Focused change

**Files modified:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/DatasourceOperations.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/DatasourceOperationsTest.java`

---

### 265. `5e43a07` - Replace CommitFailedException with CommitConflictException (#2198)

**Date:** 2025-07-31 | **Author:** Tamas Mate | **PR:** [#2198](https://github.com/apache/polaris/pull/2198)
**Files:** 4 | **Changes:** +13/-12

**PURPOSE:** Code modification

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/AbstractIcebergCatalogTest.java`
- `service/common/src/main/java/org/apache/polaris/service/admin/PolarisAdminService.java`
- `service/common/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`
- `service/common/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogHandler.java`

**Additional details from commit message:**
```
In some cases, we were using CommitFailedException to represent commit
conflicts, which returns the correct 409 response but is tied to Iceberg.
However, some of these conflicts originate from Polaris, making
CommitConflictException a more appropriate and accurate choice.
This change updates those instances to improve clarity and exception
handling semantics.
Resolves #2168
```

---

### 266. `a6656c3` - Remove CallContextResolver (#2215)

**Date:** 2025-07-31 | **Author:** Christopher Lambert | **PR:** [#2215](https://github.com/apache/polaris/pull/2215)
**Files:** 2 | **Changes:** +0/-100

**PURPOSE:** Code removal

**WHAT CHANGED:** Modified 2 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `service/common/src/main/java/org/apache/polaris/service/context/CallContextResolver.java`
- `service/common/src/main/java/org/apache/polaris/service/context/DefaultCallContextResolver.java`

---

### 267. `eefe572` - Remove postgres_latest as image tag (#2045)

**Date:** 2025-07-31 | **Author:** Yong Zheng | **PR:** [#2045](https://github.com/apache/polaris/pull/2045)
**Files:** 13 | **Changes:** +7/-13

**PURPOSE:** Code removal

**WHAT CHANGED:** in Documentation, Helm Charts

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Kubernetes Deployment, User Documentation | Medium-scale change

**Files modified:**
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

**Additional details from commit message:**
```
* Change image tag to latest for getting started examples
* Change image tag to latest from helm
```

---

### 268. `4d94745` - Remove getCurrentContext from JWTBroker (#2202)

**Date:** 2025-07-30 | **Author:** Christopher Lambert | **PR:** [#2202](https://github.com/apache/polaris/pull/2202)
**Files:** 4 | **Changes:** +10/-52

**PURPOSE:** Code removal

**WHAT CHANGED:** Modified 4 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `service/common/src/main/java/org/apache/polaris/service/auth/DefaultOAuth2ApiService.java`
- `service/common/src/main/java/org/apache/polaris/service/auth/JWTBroker.java`
- `service/common/src/main/java/org/apache/polaris/service/auth/NoneTokenBrokerFactory.java`
- `service/common/src/main/java/org/apache/polaris/service/auth/TokenBroker.java`

---

### 269. `e7eb59f` - Remove getCurrentContext from InMemoryStorageIntegration (#2201)

**Date:** 2025-07-30 | **Author:** Christopher Lambert | **PR:** [#2201](https://github.com/apache/polaris/pull/2201)
**Files:** 5 | **Changes:** +51/-33

**PURPOSE:** Code removal

**WHAT CHANGED:** Modified Storage Integration in Core including test updates

**WHY NEEDED:** to improve cloud storage integration

**IMPACT:** Affects: Cloud Storage | Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/storage/InMemoryStorageIntegration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/PolarisStorageIntegration.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/InMemoryStorageIntegrationTest.java`
- `service/common/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`
- `service/common/src/main/java/org/apache/polaris/service/storage/PolarisStorageIntegrationProviderImpl.java`

---

### 270. `3d354f8` - Remove PolarisCallContext from TreeMapMetaStore (#2195)

**Date:** 2025-07-30 | **Author:** Christopher Lambert | **PR:** [#2195](https://github.com/apache/polaris/pull/2195)
**Files:** 2 | **Changes:** +28/-41

**PURPOSE:** Code refactoring; Code removal

**WHAT CHANGED:** Modified Persistence Layer in Core, Persistence

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage | Focused change | Requires careful deployment

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TreeMapMetaStore.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TreeMapTransactionalPersistenceImpl.java`

**Additional details from commit message:**
```
* reset diagnosticServices in TreeMapMetaStore
* simplify ensure methods
```

---

### 271. `2332f63` - Simplify BaseMetaStoreManager.extractStorageConfiguration (#2194)

**Date:** 2025-07-30 | **Author:** Christopher Lambert | **PR:** [#2194](https://github.com/apache/polaris/pull/2194)
**Files:** 6 | **Changes:** +15/-14

**PURPOSE:** Code refactoring

**WHAT CHANGED:** Modified EclipseLink Persistence, JDBC Persistence, Persistence Layer in Core, Persistence

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage, JPA/ORM, Relational Databases | Focused change | Requires careful deployment

**Files modified:**
- `persistence/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/PolarisEclipseLinkMetaStoreSessionImpl.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/AtomicOperationMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/BaseMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalMetaStoreManagerImpl.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TreeMapTransactionalPersistenceImpl.java`

**Additional details from commit message:**
```
the full `PolarisCallContext` if not necessary.
```

---

### 272. `914be46` - fix(deps): update quarkus platform and group to v3.25.0 (#2167)

**Date:** 2025-07-30 | **Author:** Mend Renovate | **PR:** [#2167](https://github.com/apache/polaris/pull/2167)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 273. `1b51590` - chore(deps): update actions/stale digest to a92fd57 (#2208)

**Date:** 2025-07-30 | **Author:** Mend Renovate | **PR:** [#2208](https://github.com/apache/polaris/pull/2208)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/stale.yml`

---

### 274. `364b53c` - Fix Namespace resolution on grant/revoke privilege operations (#2170)

**Date:** 2025-07-28 | **Author:** Pooja Nilangekar | **PR:** [#2170](https://github.com/apache/polaris/pull/2170)
**Files:** 4 | **Changes:** +476/-2

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified Persistence Layer in Core, Persistence including test updates

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage | Focused change | Requires careful deployment

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/PolarisResolvedPathWrapper.java`
- `polaris-core/src/test/java/org/apache/polaris/core/persistence/PolarisResolvedPathWrapperTest.java`
- `service/common/src/main/java/org/apache/polaris/service/admin/PolarisAdminService.java`
- `service/common/src/test/java/org/apache/polaris/service/admin/PolarisAdminServiceTest.java`

**Additional details from commit message:**
```
* Move isFullyResolvedNamespace to PolarisResolvedPathWrapper
```

---

### 275. `756e535` - Remove PolarisDiagnostics from json utils (#2176)

**Date:** 2025-07-28 | **Author:** Christopher Lambert | **PR:** [#2176](https://github.com/apache/polaris/pull/2176)
**Files:** 24 | **Changes:** +81/-229

**PURPOSE:** Code removal

**WHAT CHANGED:** Modified Admin Service, Connection Management, Entity Management, JDBC Persistence, Persistence Layer, Storage Integration in Core, Persistence, Runtime Service including test updates

**WHY NEEDED:** to enhance data storage reliability; to improve cloud storage integration

**IMPACT:** Affects: Cloud Storage, Data Model, Database/Storage, External Integrations, Management Operations, Relational Databases | Large-scale change affecting multiple modules | Requires careful deployment

**Sample files (showing 15 of 24):**
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

---

### 276. `e46f8c6` - Add Principal lookup helpers to PolarisMetaStoreManager (#2174)

**Date:** 2025-07-28 | **Author:** Christopher Lambert | **PR:** [#2174](https://github.com/apache/polaris/pull/2174)
**Files:** 15 | **Changes:** +115/-210

**PURPOSE:** New feature; CI/CD improvement

**WHAT CHANGED:** Modified Admin Service, JDBC Persistence, Persistence Layer in Core, Persistence, Runtime Service including test updates

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage, Management Operations, Relational Databases | Medium-scale change | Requires careful deployment

**Files modified:**
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

**Additional details from commit message:**
```
- add `PolarisMetaStoreManager.findRootPrincipal`
- add `PolarisMetaStoreManager.findPrincipalByName`
- add `PolarisMetaStoreManager.findPrincipalRoleByName`
also we now prefer `PolarisEntityConstants` where applicable
```

---

### 277. `181fda6` - chore(deps): update plugin jetbrains-changelog to v2.3.0 (#2187)

**Date:** 2025-07-27 | **Author:** Mend Renovate | **PR:** [#2187](https://github.com/apache/polaris/pull/2187)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 278. `7b04abe` - Push AccessConfig creation to PolarisStorageIntegration (#2171)

**Date:** 2025-07-25 | **Author:** Dmitri Bourlatchkov | **PR:** [#2171](https://github.com/apache/polaris/pull/2171)
**Files:** 21 | **Changes:** +413/-361

**PURPOSE:** New feature; CI/CD improvement

**WHAT CHANGED:** Modified Entity Management, Persistence Layer, Storage Integration in Core, Persistence, Runtime Service including test updates

**WHY NEEDED:** to enhance data storage reliability; to improve cloud storage integration

**IMPACT:** Affects: Cloud Storage, Data Model, Database/Storage | Large-scale change affecting multiple modules | Requires careful deployment

**Sample files (showing 15 of 21):**
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

**Additional details from commit message:**
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

---

### 279. `6764a88` - Add podman support (#2143)

**Date:** 2025-07-24 | **Author:** Yong Zheng | **PR:** [#2143](https://github.com/apache/polaris/pull/2143)
**Files:** 2 | **Changes:** +17/-15

**PURPOSE:** New feature

**WHAT CHANGED:** Modified 2 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `Makefile`
- `client/templates/regenerate.sh`

---

### 280. `2256df0` - Simplify bootstrapServiceAndCreatePolarisPrincipalForRealm (#2172)

**Date:** 2025-07-24 | **Author:** Christopher Lambert | **PR:** [#2172](https://github.com/apache/polaris/pull/2172)
**Files:** 2 | **Changes:** +23/-32

**PURPOSE:** Code refactoring; CI/CD improvement

**WHAT CHANGED:** Modified JDBC Persistence, Persistence Layer in Core, Persistence

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage, Relational Databases | Focused change | Requires careful deployment

**Files modified:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcMetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`

**Additional details from commit message:**
```
because the same pattern existed for this method.
note that we do some minor additional "formatting" changes to minimize
the diff between the two files (as they were originally copy pasted).
this could lead to having a common base class in the future.
```

---

### 281. `e9267b6` - Respond with 409 in case of concurrent Namespace update failures instead of 500 (#1989)

**Date:** 2025-07-24 | **Author:** fabio-rizzo-01 | **PR:** [#1989](https://github.com/apache/polaris/pull/1989)
**Files:** 4 | **Changes:** +65/-19

**PURPOSE:** Code modification

**WHAT CHANGED:** in Core including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/exceptions/CommitConflictException.java`
- `service/common/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`
- `service/common/src/main/java/org/apache/polaris/service/exception/PolarisExceptionMapper.java`
- `service/common/src/test/java/org/apache/polaris/service/exception/ExceptionMapperTest.java`

---

### 282. `ca85339` - Rework getOrCreateSessionSupplier (#2161)

**Date:** 2025-07-24 | **Author:** Christopher Lambert | **PR:** [#2161](https://github.com/apache/polaris/pull/2161)
**Files:** 20 | **Changes:** +32/-43

**PURPOSE:** New feature

**WHAT CHANGED:** Modified Admin Service, JDBC Persistence, Persistence Layer in Core, Persistence, Runtime Service including test updates

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage, Management Operations, Relational Databases | Medium-scale change | Requires careful deployment

**Sample files (showing 15 of 20):**
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

**Additional details from commit message:**
```
it seems like the `Supplier` was an leaking implementation detail of the
`MetaStoreManagerFactor` implementations.
```

---

### 283. `218ce64` - chore(deps): update plugin jandex to v2.2.0 (#2175)

**Date:** 2025-07-24 | **Author:** Mend Renovate | **PR:** [#2175](https://github.com/apache/polaris/pull/2175)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 284. `d898764` - Improve Realm ID resolution for Quarkus 3.24+ (#2163)

**Date:** 2025-07-24 | **Author:** Alexandre Dutra | **PR:** [#2163](https://github.com/apache/polaris/pull/2163)
**Files:** 2 | **Changes:** +5/-29

**PURPOSE:** Code modification

**WHAT CHANGED:** in Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/quarkus/metrics/QuarkusValueExpressionResolver.java`
- `runtime/service/src/main/java/org/apache/polaris/service/quarkus/metrics/RealmIdTagContributor.java`

**Additional details from commit message:**
```
It is also now possible to return null from ValueExpressionResolver. This is not a big deal, but still better than returning "".
```

---

### 285. `5faa371` - Simplify checkPolarisServiceBootstrappedForRealm (#2162)

**Date:** 2025-07-23 | **Author:** Christopher Lambert | **PR:** [#2162](https://github.com/apache/polaris/pull/2162)
**Files:** 2 | **Changes:** +10/-18

**PURPOSE:** Code refactoring

**WHAT CHANGED:** Modified JDBC Persistence, Persistence Layer in Core, Persistence

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage, Relational Databases | Focused change | Requires careful deployment

**Files modified:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcMetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`

---

### 286. `91fee87` - fix(deps): update quarkus platform and group (#2166)

**Date:** 2025-07-23 | **Author:** Mend Renovate | **PR:** [#2166](https://github.com/apache/polaris/pull/2166)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 287. `07ee3fd` - Run standard (sharable) REST Catalog integrations tests with MinIO (#2158)

**Date:** 2025-07-23 | **Author:** Dmitri Bourlatchkov | **PR:** [#2158](https://github.com/apache/polaris/pull/2158)
**Files:** 3 | **Changes:** +125/-9

**PURPOSE:** Test improvement; CI/CD improvement

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisRestCatalogIntegrationBase.java`
- `runtime/service/src/intTest/java/org/apache/polaris/service/quarkus/it/QuarkusPolarisRestCatalogMinIOIT.java`
- `runtime/service/src/intTest/java/org/apache/polaris/service/quarkus/it/{QuarkusRestCatalogMinIoIT.java => QuarkusRestCatalogMinIOSpecialIT.java}`

**Additional details from commit message:**
```
Keep special edge case tests (path style, STS endpoint and
client-side FileIO) in `QuarkusRestCatalogMinIoSpecialIT`.
```

---

### 288. `95358a9` - Extract ResolverFactory from PolarisEntityManager (#2148)

**Date:** 2025-07-23 | **Author:** Christopher Lambert | **PR:** [#2148](https://github.com/apache/polaris/pull/2148)
**Files:** 16 | **Changes:** +148/-80

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Admin Service, Persistence Layer in Core, Persistence, Runtime Service including test updates

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage, Management Operations | Medium-scale change | Requires careful deployment

**Sample files (showing 15 of 16):**
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

**Additional details from commit message:**
```
Note that the little left-over functionality of `PolarisEntityManager` can
be split out to more dedicated interfaces in a follow-up most likely.
```

---

### 289. `89deb5f` - chore(deps): update registry.access.redhat.com/ubi9/openjdk-21-runtime docker tag to v1.22-1.1752676419 (#2150)

**Date:** 2025-07-22 | **Author:** Mend Renovate | **PR:** [#2150](https://github.com/apache/polaris/pull/2150)
**Files:** 2 | **Changes:** +2/-2

**PURPOSE:** Documentation update

**WHAT CHANGED:** Modified 2 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/admin/src/main/docker/Dockerfile.jvm`
- `runtime/server/src/main/docker/Dockerfile.jvm`

---

### 290. `886d111` - Remove PolarisEntityManager.getCredentialCache (#2133)

**Date:** 2025-07-22 | **Author:** Christopher Lambert | **PR:** [#2133](https://github.com/apache/polaris/pull/2133)
**Files:** 18 | **Changes:** +98/-129

**PURPOSE:** Code refactoring; Code removal

**WHAT CHANGED:** Modified Admin Service, Persistence Layer, Storage Integration in Core, Persistence, Runtime Service including test updates

**WHY NEEDED:** to enhance data storage reliability; to improve cloud storage integration

**IMPACT:** Affects: Cloud Storage, Database/Storage, Management Operations | Medium-scale change | Requires careful deployment

**Sample files (showing 15 of 18):**
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

**Additional details from commit message:**
```
the only caller of `getCredentialCache` is `FileIOUtil.refreshAccessConfig`, which in in turn is only called by `DefaultFileIOFactory` and `IcebergCatalog`.
note that in a follow-up we will likely be able to remove `PolarisEntityManager` usage completely from `IcebergCatalog`.
additional cleanups:
- use `StorageCredentialCache` injection in tests (but we need to invalidate all entries on test start)
- remove unused `UserSecretsManagerFactory` from `PolarisCallContextCatalogFactory`
```

---

### 291. `81ad206` - CI: Address failure from accessing GH API (#2132)

**Date:** 2025-07-21 | **Author:** Robert Stupp | **PR:** [#2132](https://github.com/apache/polaris/pull/2132)
**Files:** 4 | **Changes:** +28/-2

**PURPOSE:** New feature; CI/CD improvement

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/gradle.yml`
- `.github/workflows/nightly.yml`
- `.github/workflows/spark_client_regtests.yml`
- `build-logic/src/main/kotlin/publishing/util.kt`

**Additional details from commit message:**
```
```
* What went wrong:
Execution failed for task ':generatePomFileForMavenPublication'.
> Unable to process url: https://api.github.com/repos/apache/polaris/contributors?per_page=1000
```
The sometimes failing request fetches the list of contributors to be published in the "root" POM. Unauthorized GH API requests have an hourly(?) limit of 60 requests per source IP. Authorized requests have a much higher rate limit. We do have a GitHub token available in every CI run, which can be used in GH ...
```

---

### 292. `bc111fc` - Use Makefile to simplify setup and commands (#2027)

**Date:** 2025-07-19 | **Author:** Yong Zheng | **PR:** [#2027](https://github.com/apache/polaris/pull/2027)
**Files:** 2 | **Changes:** +280/-0

**PURPOSE:** Bug fix; Code refactoring; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `Makefile`
- `README.md`

**Additional details from commit message:**
```
* Add targets for minikube state management
* Add podman support and spark plugin build
* Add version target
* Update README.md for Makefile usage and relation to the project
* Fix nit
```

---

### 293. `b48cfb6` - Add server and client support for the new generic table `baseLocation` field (#2122)

**Date:** 2025-07-18 | **Author:** Yun Zou | **PR:** [#2122](https://github.com/apache/polaris/pull/2122)
**Files:** 16 | **Changes:** +128/-40

**PURPOSE:** New feature

**WHAT CHANGED:** Modified Admin Service, Entity Management in Core, Runtime Service, Spark Plugin including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Data Model, Management Operations, Spark Integration | Medium-scale change

**Sample files (showing 15 of 16):**
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

---

### 294. `633cedf` - Add newIcebergCatalog helper (#2134)

**Date:** 2025-07-18 | **Author:** Christopher Lambert | **PR:** [#2134](https://github.com/apache/polaris/pull/2134)
**Files:** 3 | **Changes:** +34/-113

**PURPOSE:** New feature

**WHAT CHANGED:** Modified Admin Service in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Management Operations | Focused change

**Files modified:**
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/admin/PolarisAuthzTestBase.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/admin/PolarisS3InteroperabilityTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/AbstractIcebergCatalogTest.java`

**Additional details from commit message:**
```
mostly use the same parameters most of the time.
also remove an unused field in 2 other tests.
```

---

### 295. `79b9ce8` - fix(deps): update quarkus platform and group to v3.24.4 (#2128)

**Date:** 2025-07-18 | **Author:** Mend Renovate | **PR:** [#2128](https://github.com/apache/polaris/pull/2128)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 296. `46a2a03` - feat(helm): Add support for external authentication (#2104)

**Date:** 2025-07-17 | **Author:** Alexandre Dutra | **PR:** [#2104](https://github.com/apache/polaris/pull/2104)
**Files:** 12 | **Changes:** +527/-67

**PURPOSE:** New feature; Security enhancement

**WHAT CHANGED:** in Documentation, Helm Charts

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Kubernetes Deployment, User Documentation | Medium-scale change

**Files modified:**
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

### 297. `82ae2cf` - Abstract polaris-runtime-service tests for all persistence implementations (#2106)

**Date:** 2025-07-17 | **Author:** Robert Stupp | **PR:** [#2106](https://github.com/apache/polaris/pull/2106)
**Files:** 11 | **Changes:** +182/-121

**PURPOSE:** New feature; Code refactoring

**WHAT CHANGED:** Modified Admin Service in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Management Operations | Medium-scale change

**Files modified:**
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

**Additional details from commit message:**
```
This change moves the actual tests to `Abstract*` classes and refactors the existing tests to extend those. The NoSQL persistence work extends the same `Abstract*` classes but runs with different Quarkus test profiles.
```

---

### 298. `7ca4970` - Add TestFileIOFactory helper (#2105)

**Date:** 2025-07-16 | **Author:** Christopher Lambert | **PR:** [#2105](https://github.com/apache/polaris/pull/2105)
**Files:** 4 | **Changes:** +60/-72

**PURPOSE:** New feature; Test improvement

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/task/BatchFileCleanupTaskHandlerTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/task/ManifestFileCleanupTaskHandlerTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/task/TableCleanupTaskHandlerTest.java`
- `service/common/src/testFixtures/java/org/apache/polaris/service/TestFileIOFactory.java`

---

### 299. `987c554` - Add `pathStyleAccess` to AwsStorageConfigInfo (#2012)

**Date:** 2025-07-16 | **Author:** Dmitri Bourlatchkov | **PR:** [#2012](https://github.com/apache/polaris/pull/2012)
**Files:** 11 | **Changes:** +173/-21

**PURPOSE:** New feature

**WHAT CHANGED:** Modified Entity Management, Storage Integration in Core, Documentation, OpenAPI Specs, Runtime Service including test updates

**WHY NEEDED:** to improve cloud storage integration

**IMPACT:** Affects: API Contracts, Cloud Storage, Data Model, User Documentation | Medium-scale change | May affect API consumers

**Files modified:**
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

**Additional details from commit message:**
```
This change allows configuring the "path-style" access
mode in S3 clients (both in Polaris Servers and Iceberg
REST Catalog API clients).
This change is applicable both to AWS storage and to
non-AWS S3-compatible storage (#1530).
```

---

### 300. `d035344` - Spark 3.5.6 and Iceberg 1.9.1 (#1960)

**Date:** 2025-07-16 | **Author:** Yong Zheng | **PR:** [#1960](https://github.com/apache/polaris/pull/1960)
**Files:** 21 | **Changes:** +55/-55

**PURPOSE:** Code refactoring

**WHAT CHANGED:** in CI/CD, Documentation, Spark Plugin

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation, Spark Integration, User Documentation | Large-scale change affecting multiple modules

**Sample files (showing 15 of 21):**
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

---

### 301. `fb418a2` - Extensible pagination token implementation (#1938)

**Date:** 2025-07-16 | **Author:** Robert Stupp | **PR:** [#1938](https://github.com/apache/polaris/pull/1938)
**Files:** 32 | **Changes:** +1329/-506

**PURPOSE:** New feature; Code refactoring; CI/CD improvement

**WHAT CHANGED:** Modified Catalog, EclipseLink Persistence, Entity Management, JDBC Persistence, Persistence Layer in Core, Persistence, Runtime Service including test updates

**WHY NEEDED:** to enhance data storage reliability; to enhance catalog functionality

**IMPACT:** Affects: Catalog Operations, Data Model, Database/Storage, JPA/ORM, Relational Databases | Large-scale change affecting multiple modules | Requires careful deployment

**Sample files (showing 15 of 32):**
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

**Additional details from commit message:**
```
* Allows multiple implementations of `Token` referencing the "next page", encapsulated in `PageToken`. No changes to `polaris-core` needed to add custom `Token` implementations.
* Extensible to (later) support (cryptographic) signatures to prevent tampered page-token
* Refactor pagination code to delineate API-level page tokens and internal "pointers to data"
* Requests deal with the "previous" token, user-provided page size (optional) and the previous request's page size.
* Concentrate the l...
```

---

### 302. `1cb85e0` - chore: Avoid deprecated `DefaultCredentialsProvider.create()` (#2119)

**Date:** 2025-07-15 | **Author:** Dmitri Bourlatchkov | **PR:** [#2119](https://github.com/apache/polaris/pull/2119)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Deprecation

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `service/common/src/main/java/org/apache/polaris/service/storage/StorageConfiguration.java`

---

### 303. `39a10d3` - fix(deps): update immutables to v2.11.1 (#2113)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2113](https://github.com/apache/polaris/pull/2113)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 304. `bd164f5` - Disable renovatebot on release branches (#2085)

**Date:** 2025-07-15 | **Author:** Eric Maynard | **PR:** [#2085](https://github.com/apache/polaris/pull/2085)
**Files:** 1 | **Changes:** +0/-8

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `.github/renovate.json5`

---

### 305. `9ecf29b` - Use PolarisImmutable for StorageCredentialCacheKey (#2029)

**Date:** 2025-07-15 | **Author:** Christopher Lambert | **PR:** [#2029](https://github.com/apache/polaris/pull/2029)
**Files:** 3 | **Changes:** +30/-97

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Storage Integration in Core including test updates

**WHY NEEDED:** to improve cloud storage integration

**IMPACT:** Affects: Cloud Storage | Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/storage/cache/StorageCredentialCache.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/cache/StorageCredentialCacheKey.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/cache/StorageCredentialCacheTest.java`

**Additional details from commit message:**
```
* convert StorageCredentialCacheKey to immutables
```

---

### 306. `38d7dbf` - Simplify RealmEntityManagerFactory usage in tests (#2050)

**Date:** 2025-07-15 | **Author:** Christopher Lambert | **PR:** [#2050](https://github.com/apache/polaris/pull/2050)
**Files:** 3 | **Changes:** +10/-27

**PURPOSE:** Code refactoring; Test improvement

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/IcebergCatalogHandlerAuthzTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/IcebergCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/IcebergCatalogViewTest.java`

**Additional details from commit message:**
```
can do the same for `RealmEntityManagerFactory`
`PolarisAuthzTestBase.entityManager` is already getting derived from
`realmEntityManagerFactory`:
https://github.com/apache/polaris/blob/2c2052c28f899aaa85e5f11a9131d9812ec62679/runtime/service/src/test/java/org/apache/polaris/service/quarkus/admin/PolarisAuthzTestBase.java#L247
```

---

### 307. `c72986f` - Renovate PRs, branch name + PR subject (#2060)

**Date:** 2025-07-15 | **Author:** Robert Stupp | **PR:** [#2060](https://github.com/apache/polaris/pull/2060)
**Files:** 1 | **Changes:** +0/-2

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `.github/renovate.json5`

**Additional details from commit message:**
```
I also noticed that the branch name is repeated in the PR subject, which started to be that way some longer ago.
This change removes both duplications.
```

---

### 308. `8a059aa` - Revert PR 2033 (#2087)

**Date:** 2025-07-15 | **Author:** Robert Stupp | **PR:** [#2087](https://github.com/apache/polaris/pull/2087)
**Files:** 31 | **Changes:** +229/-169

**PURPOSE:** Bug fix; Code refactoring

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Large-scale change affecting multiple modules

**Sample files (showing 15 of 31):**
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

**Additional details from commit message:**
```
There are concerns that the PR #2033 will interfere with the whole effort to automate releases. Since there was no change to review and raise the concerns, I'd like to revert it to not cause any friction with that bigger effort.
Revert "Fix invalid redirect from public page (#2041)", commit 493bc8eeb21632801b8f900caeb727493d67bc9f.
Revert "[Site] Simplify the doc directory structure (#2033)", commit 2db2f10eb289e74fa84933542d27006906de37bb.
```

---

### 309. `3b629dd` - Attempt to make Renovate work again (#2052)

**Date:** 2025-07-15 | **Author:** Robert Stupp | **PR:** [#2052](https://github.com/apache/polaris/pull/2052)
**Files:** 1 | **Changes:** +2/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `.github/renovate.json5`

**Additional details from commit message:**
```
The plan here is to:
1. remove the regex from our `baseBranches` option - if that doesn't work then
2. just use the default branch
```

---

### 310. `2c2052c` - Use application-scoped StorageCredentialCache (#2022)

**Date:** 2025-07-15 | **Author:** Christopher Lambert | **PR:** [#2022](https://github.com/apache/polaris/pull/2022)
**Files:** 15 | **Changes:** +118/-57

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified JDBC Persistence, Persistence Layer, Storage Integration in Core, Persistence, Runtime Service including test updates

**WHY NEEDED:** to enhance data storage reliability; to improve cloud storage integration

**IMPACT:** Affects: Cloud Storage, Database/Storage, Relational Databases | Medium-scale change | Requires careful deployment

**Files modified:**
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

### 311. `1b073bc` - Bump Quarkus version to unblock IntelliJ build (#1958)

**Date:** 2025-07-14 | **Author:** Adnan Hemani | **PR:** [#1958](https://github.com/apache/polaris/pull/1958)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 312. `c43c546` - Fix CI (no 2) (#2044)

**Date:** 2025-07-14 | **Author:** Robert Stupp | **PR:** [#2044](https://github.com/apache/polaris/pull/2044)
**Files:** 1 | **Changes:** +8/-0

**PURPOSE:** Bug fix; CI/CD improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `build.gradle.kts`

---

### 313. `de351de` - Introduce RealmConfig (#2015)

**Date:** 2025-07-14 | **Author:** Christopher Lambert | **PR:** [#2015](https://github.com/apache/polaris/pull/2015)
**Files:** 51 | **Changes:** +365/-429

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Admin Service, Authentication/Authorization, Context Management, EclipseLink Persistence, Entity Management, JDBC Persistence, Persistence Layer, Storage Integration in Core, Persistence, Runtime Service including test updates

**WHY NEEDED:** to improve security and access control; to enhance data storage reliability; to improve cloud storage integration

**IMPACT:** Affects: Cloud Storage, Data Model, Database/Storage, JPA/ORM, Management Operations, Relational Databases, Request Handling, Security | Large-scale change affecting multiple modules | Security-sensitive change | Requires careful deployment

**Sample files (showing 15 of 51):**
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

**Additional details from commit message:**
```
```
ctx.getPolarisCallContext()
   .getConfigurationStore()
   .getConfiguration(ctx.getRealmContext(), "ALLOW_WILDCARD_LOCATION", false))
```
since a `PolarisConfigurationStore` cant be used without a `RealmContext` it makes sense to add a dedicated interface. this allows removal of verbose code and also moves towards injecting that interface via CDI at a request/realm scope in the future.
```

---

### 314. `ad77bd9` - feat(ci): Improve Gradle cache in CI (#1928)

**Date:** 2025-07-14 | **Author:** Alexandre Dutra | **PR:** [#1928](https://github.com/apache/polaris/pull/1928)
**Files:** 6 | **Changes:** +219/-1

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/actions/ci-incr-build-cache-prepare/action.yml`
- `.github/actions/ci-incr-build-cache-save/action.yml`
- `.github/workflows/gradle.yml`
- `.github/workflows/regtest.yml`
- `.github/workflows/spark_client_regtests.yml`
- `LICENSE`

---

### 315. `6ddd148` - Make StorageCredentialCache safe for mutli-realm usage (#2021)

**Date:** 2025-07-13 | **Author:** Christopher Lambert | **PR:** [#2021](https://github.com/apache/polaris/pull/2021)
**Files:** 11 | **Changes:** +83/-87

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** Modified JDBC Persistence, Persistence Layer, Storage Integration in Core, Persistence, Runtime Service including test updates

**WHY NEEDED:** to enhance data storage reliability; to improve cloud storage integration

**IMPACT:** Affects: Cloud Storage, Database/Storage, Relational Databases | Medium-scale change | Requires careful deployment

**Files modified:**
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

**Additional details from commit message:**
```
Similarly `StorageCredentialCacheKey` having a `@Nullable callContext` makes it more difficult to reason about.
Instead we can determine all realm-specific values at the time of insertion (from the `PolarisCallContext` param of `getOrGenerateSubScopeCreds`).
```

---

### 316. `bb93edd` - Fix the LICENSE and NOTICE with the latest dependency updates (#1939)

**Date:** 2025-07-12 | **Author:** JB Onofré | **PR:** [#1939](https://github.com/apache/polaris/pull/1939)
**Files:** 6 | **Changes:** +477/-396

**PURPOSE:** Bug fix; Dependency update; Test improvement

**WHAT CHANGED:** Modified 6 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/admin/distribution/LICENSE`
- `runtime/admin/distribution/NOTICE`
- `runtime/distribution/LICENSE`
- `runtime/distribution/NOTICE`
- `runtime/server/distribution/LICENSE`
- `runtime/server/distribution/NOTICE`

---

### 317. `4f57506` - Using the closer.lua download script (#2038)

**Date:** 2025-07-11 | **Author:** Dongjoon Hyun | **PR:** [#2038](https://github.com/apache/polaris/pull/2038)
**Files:** 4 | **Changes:** +6/-6

**PURPOSE:** Code modification

**WHAT CHANGED:** in Documentation, Spark Plugin

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Spark Integration, User Documentation | Focused change

**Files modified:**
- `plugins/spark/v3.5/getting-started/notebooks/Dockerfile`
- `plugins/spark/v3.5/regtests/setup.sh`
- `regtests/setup.sh`
- `site/content/in-dev/polaris-spark-client.md`

---

### 318. `7c2909c` - Fix gralde command for helm image and remove simple-values.yaml (#2036)

**Date:** 2025-07-11 | **Author:** Yong Zheng | **PR:** [#2036](https://github.com/apache/polaris/pull/2036)
**Files:** 4 | **Changes:** +0/-33

**PURPOSE:** Bug fix; Code removal

**WHAT CHANGED:** in Documentation, Helm Charts

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Kubernetes Deployment, User Documentation | Focused change

**Files modified:**
- `helm/polaris/README.md`
- `helm/polaris/README.md.gotmpl`
- `helm/polaris/ci/simple-values.yaml`
- `site/content/in-dev/helm.md`

---

### 319. `2db2f10` - [Site] Simplify the doc directory structure (#2033)

**Date:** 2025-07-11 | **Author:** Yufei Gu | **PR:** [#2033](https://github.com/apache/polaris/pull/2033)
**Files:** 30 | **Changes:** +168/-228

**PURPOSE:** Code refactoring; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Large-scale change affecting multiple modules

**Sample files (showing 15 of 30):**
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

---

### 320. `d5f661e` - Remove kind (#2028)

**Date:** 2025-07-11 | **Author:** Yong Zheng | **PR:** [#2028](https://github.com/apache/polaris/pull/2028)
**Files:** 7 | **Changes:** +2/-232

**PURPOSE:** Code removal

**WHAT CHANGED:** in CI/CD, Documentation, Helm Charts

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation, Kubernetes Deployment, User Documentation | Focused change

**Files modified:**
- `.github/workflows/check-md-link.yml`
- `README.md`
- `helm/polaris/README.md`
- `helm/polaris/README.md.gotmpl`
- `k8/deployment.yaml`
- `run.sh`
- `site/content/in-dev/unreleased/helm.md`

**Additional details from commit message:**
```
* Remove k8 dir from check-md-link.yml
```

---

### 321. `3019a5c` - Helm key grouping and test cases (#2002)

**Date:** 2025-07-11 | **Author:** Yong Zheng | **PR:** [#2002](https://github.com/apache/polaris/pull/2002)
**Files:** 4 | **Changes:** +169/-14

**PURPOSE:** Bug fix; Test improvement; Documentation update

**WHAT CHANGED:** in Documentation, Helm Charts

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Kubernetes Deployment, User Documentation | Focused change

**Files modified:**
- `helm/polaris/README.md`
- `helm/polaris/templates/_helpers.tpl`
- `helm/polaris/tests/deployment_test.yaml`
- `helm/polaris/values.yaml`

**Additional details from commit message:**
```
* Update README.md
* Added backwards compatible
* Fix conflict
* Use coalesce instead of if else
```

---

### 322. `15f23ca` - Make PolarisConfiguration member variables private (#2007)

**Date:** 2025-07-11 | **Author:** Pooja Nilangekar | **PR:** [#2007](https://github.com/apache/polaris/pull/2007)
**Files:** 10 | **Changes:** +57/-45

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Admin Service, Storage Integration in Core, Runtime Service including test updates

**WHY NEEDED:** to improve cloud storage integration

**IMPACT:** Affects: Cloud Storage, Management Operations | Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/config/FeatureConfiguration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/config/PolarisConfiguration.java`
- `polaris-core/src/main/java/org/apache/polaris/core/config/PolarisConfigurationStore.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/cache/StorageCredentialCache.java`
- `polaris-core/src/test/java/org/apache/polaris/service/storage/PolarisConfigurationStoreTest.java`
- `runtime/service/src/main/java/org/apache/polaris/service/quarkus/config/ProductionReadinessChecks.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/admin/PolarisOverlappingTableTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/IcebergCatalogTest.java`
- `service/common/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`
- `service/common/src/main/java/org/apache/polaris/service/catalog/io/FileIOUtil.java`

---

### 323. `ccc97bf` - Publish helm doc (#2014)

**Date:** 2025-07-10 | **Author:** Yong Zheng | **PR:** [#2014](https://github.com/apache/polaris/pull/2014)
**Files:** 3 | **Changes:** +424/-40

**PURPOSE:** Documentation update

**WHAT CHANGED:** in Documentation, Helm Charts

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Kubernetes Deployment, User Documentation | Focused change

**Files modified:**
- `helm/polaris/README.md`
- `helm/polaris/README.md.gotmpl`
- `site/content/in-dev/unreleased/helm.md`

---

### 324. `19f44d8` - Remove duplicate MetaStoreManagerFactory mocks (#2023)

**Date:** 2025-07-10 | **Author:** Christopher Lambert | **PR:** [#2023](https://github.com/apache/polaris/pull/2023)
**Files:** 4 | **Changes:** +29/-151

**PURPOSE:** Code removal

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/IcebergCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/IcebergCatalogViewTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/PolarisGenericTableCatalogTest.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/PolicyCatalogTest.java`

---

### 325. `a0e31b0` - Fix bunch of OpenAPI generation issues (#2005)

**Date:** 2025-07-09 | **Author:** Robert Stupp | **PR:** [#2005](https://github.com/apache/polaris/pull/2005)
**Files:** 5 | **Changes:** +97/-41

**PURPOSE:** Bug fix; CI/CD improvement

**WHAT CHANGED:** Modified 5 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `api/iceberg-service/build.gradle.kts`
- `api/management-model/build.gradle.kts`
- `api/management-service/build.gradle.kts`
- `api/polaris-catalog-service/build.gradle.kts`
- `build-logic/src/main/kotlin/polaris-java.gradle.kts`

**Additional details from commit message:**
```
* Changes to any of the source spec files requires a Gradle `clean`, otherwise old generated Java source will remain - i.e. "no longer" existing sources are not removed. This is addressed by adding an additional action to `GenerateTask`.
* The output of `GenerateTask` was explicitly not cached, this is removed, so the output is cached.
* Add explicit inputs to `GenerateTask` to the whole templates and spec folders.
```

---

### 326. `f80b4f3` - Cleanup collaborators in `.asf.yaml` (#2008)

**Date:** 2025-07-09 | **Author:** Robert Stupp | **PR:** [#2008](https://github.com/apache/polaris/pull/2008)
**Files:** 1 | **Changes:** +2/-4

**PURPOSE:** Code refactoring

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `.asf.yaml`

---

### 327. `bd83252` - Introduce an option to add object storage prefix to table locations (#1966)

**Date:** 2025-07-08 | **Author:** Eric Maynard | **PR:** [#1966](https://github.com/apache/polaris/pull/1966)
**Files:** 12 | **Changes:** +589/-62

**PURPOSE:** Bug fix; New feature; Performance optimization; CI/CD improvement

**WHAT CHANGED:** Modified Admin Service, Persistence Layer, Storage Integration in Core, Documentation, Persistence, Runtime Service including test updates

**WHY NEEDED:** to enhance data storage reliability; to improve cloud storage integration

**IMPACT:** Affects: Cloud Storage, Database/Storage, Management Operations, User Documentation | Medium-scale change | Requires careful deployment

**Files modified:**
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

**Additional details from commit message:**
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

---

### 328. `b96461a` - feat(auth): Ability to override active roles provider per realm (#2000)

**Date:** 2025-07-08 | **Author:** Alexandre Dutra | **PR:** [#2000](https://github.com/apache/polaris/pull/2000)
**Files:** 6 | **Changes:** +141/-3

**PURPOSE:** Deprecation; Security enhancement

**WHAT CHANGED:** Modified Service Authentication in Documentation, Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: API Security, User Documentation | Focused change | May affect API consumers

**Files modified:**
- `CHANGELOG.md`
- `runtime/defaults/src/main/resources/application.properties`
- `runtime/service/src/main/java/org/apache/polaris/service/quarkus/auth/QuarkusAuthenticationRealmConfiguration.java`
- `runtime/service/src/main/java/org/apache/polaris/service/quarkus/config/QuarkusProducers.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/auth/AuthenticationConfigurationTest.java`
- `service/common/src/main/java/org/apache/polaris/service/auth/AuthenticationRealmConfiguration.java`

**Additional details from commit message:**
```
* deprecate old property
* add tests
```

---

### 329. `145ad3e` - Fix helm doc (#2001)

**Date:** 2025-07-08 | **Author:** Yong Zheng | **PR:** [#2001](https://github.com/apache/polaris/pull/2001)
**Files:** 8 | **Changes:** +213/-372

**PURPOSE:** Bug fix; Documentation update

**WHAT CHANGED:** in Documentation, Helm Charts

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Kubernetes Deployment, User Documentation | Focused change

**Files modified:**
- `helm/polaris/README.md`
- `helm/polaris/README.md.gotmpl`
- `helm/polaris/templates/_helpers.tpl`
- `helm/polaris/templates/configmap.yaml`
- `helm/polaris/tests/configmap_test.yaml`
- `helm/polaris/tests/deployment_test.yaml`
- `helm/polaris/values.yaml`
- `run.sh`

**Additional details from commit message:**
```
* Remove persistent ref
* Remove persistent ref
* Fixes based on feedback
* Fixes based on feedback
* Fixes based on feedback
* Fixes based on feedback
```

---

### 330. `daf4476` - Support IMPLICIT authentication type for federated catalogs (#1925)

**Date:** 2025-07-07 | **Author:** Pooja Nilangekar | **PR:** [#1925](https://github.com/apache/polaris/pull/1925)
**Files:** 7 | **Changes:** +165/-28

**PURPOSE:** New feature; Security enhancement; CI/CD improvement

**WHAT CHANGED:** Modified Connection Management in Core, Documentation, OpenAPI Specs including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: API Contracts, External Integrations, User Documentation | Focused change | May affect API consumers

**Files modified:**
- `CHANGELOG.md`
- `polaris-core/src/main/java/org/apache/polaris/core/connection/AuthenticationParametersDpo.java`
- `polaris-core/src/main/java/org/apache/polaris/core/connection/AuthenticationType.java`
- `polaris-core/src/main/java/org/apache/polaris/core/connection/ImplicitAuthenticationParametersDpo.java`
- `polaris-core/src/test/java/org/apache/polaris/core/connection/ConnectionConfigInfoDpoTest.java`
- `service/common/src/main/java/org/apache/polaris/service/admin/PolarisAdminService.java`
- `spec/polaris-management-service.yml`

**Additional details from commit message:**
```
The `IMPLICIT` option is guarded by the `SUPPORTED_EXTERNAL_CATALOG_AUTHENTICATION_TYPES`. Hence users may create federated catalogs with `IMPLICIT` authentication only when the administrator explicitly enables this feature.
```

---

### 331. `d962c64` - Update CatalogEntity::Builder to set default CatalogType as INTERNAL (#1998)

**Date:** 2025-07-07 | **Author:** Pooja Nilangekar | **PR:** [#1998](https://github.com/apache/polaris/pull/1998)
**Files:** 2 | **Changes:** +74/-6

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** Modified Entity Management in Core, Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Data Model | Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/entity/CatalogEntity.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/entity/CatalogEntityTest.java`

**Additional details from commit message:**
```
Testing:
Updated CatalogEntityTest to ensure that the default is set to `INTERNAL`.
```

---

### 332. `1ce77e9` - OpenAPI-generate: Omit generation timestamp (#2004)

**Date:** 2025-07-07 | **Author:** Robert Stupp | **PR:** [#2004](https://github.com/apache/polaris/pull/2004)
**Files:** 4 | **Changes:** +4/-0

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 4 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `api/iceberg-service/build.gradle.kts`
- `api/management-model/build.gradle.kts`
- `api/management-service/build.gradle.kts`
- `api/polaris-catalog-service/build.gradle.kts`

---

### 333. `f099d60` - Ignore regenerate.sh on README.md (#1999)

**Date:** 2025-07-04 | **Author:** Yong Zheng | **PR:** [#1999](https://github.com/apache/polaris/pull/1999)
**Files:** 1 | **Changes:** +4/-4

**PURPOSE:** Documentation update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `client/templates/regenerate.sh`

---

### 334. `95d1eac` - feat: Support customizing S3 endpoints (#1913)

**Date:** 2025-07-04 | **Author:** Dmitri Bourlatchkov | **PR:** [#1913](https://github.com/apache/polaris/pull/1913)
**Files:** 25 | **Changes:** +1261/-22

**PURPOSE:** New feature

**WHAT CHANGED:** Modified Admin Service, Entity Management, Storage Integration in Core, Documentation, OpenAPI Specs, Runtime Service including test updates

**WHY NEEDED:** to improve cloud storage integration

**IMPACT:** Affects: API Contracts, Cloud Storage, Data Model, Management Operations, User Documentation | Large-scale change affecting multiple modules | May affect API consumers

**Sample files (showing 15 of 25):**
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

**Additional details from commit message:**
```
Introduce a dedicated interface for `StsClient` suppliers and implement it using a pool of cached clients.
All client are "thin" and share the same `SdkHttpClient`. The latter is closed when the server shuts down.
This is a step towards supporting non-AWS S3 storage (#1530).
For this reason the STS endpoint is present in new interfaces, but is not used yet.
```

---

### 335. `8fa6bf2` - Materialize Realm ID for Session Supplier in JDBC (#1988)

**Date:** 2025-07-03 | **Author:** Adnan Hemani | **PR:** [#1988](https://github.com/apache/polaris/pull/1988)
**Files:** 1 | **Changes:** +9/-7

**PURPOSE:** New feature

**WHAT CHANGED:** Modified JDBC Persistence in Persistence

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Relational Databases | Focused change

**Files modified:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcMetaStoreManagerFactory.java`

**Additional details from commit message:**
```
As a result, if any work is being done outside the scope of the request, such as during a Task, any calls to getOrCreateSessionSupplier for creating a BasePersistence implementation will fail as the RealmContext object is no longer available.
This PR will ensure for the JdbcMetaStoreManagerFactory that the Realm ID is materialized from the RealmContext and used inside the supplier so that the potentially deactivated RealmContext object does not need to be used in creating the BasePersistence ...
```

---

### 336. `7f3b781` - Remove unnecessary `InputStream.close` call (#1982)

**Date:** 2025-07-03 | **Author:** Eric Maynard | **PR:** [#1982](https://github.com/apache/polaris/pull/1982)
**Files:** 1 | **Changes:** +8/-15

**PURPOSE:** Code removal

**WHAT CHANGED:** Modified JDBC Persistence in Persistence

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Relational Databases | Focused change

**Files modified:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/DatasourceOperations.java`

---

### 337. `c5907e6` - Add regression test coverage for Spark Client with package conf (#1997)

**Date:** 2025-07-03 | **Author:** Yun Zou | **PR:** [#1997](https://github.com/apache/polaris/pull/1997)
**Files:** 5 | **Changes:** +81/-38

**PURPOSE:** New feature; Test improvement

**WHAT CHANGED:** in CI/CD, Documentation, Spark Plugin

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation, Spark Integration, User Documentation | Focused change

**Files modified:**
- `.github/workflows/spark_client_regtests.yml`
- `plugins/spark/v3.5/regtests/README.md`
- `plugins/spark/v3.5/regtests/docker-compose.yml`
- `plugins/spark/v3.5/regtests/run.sh`
- `plugins/spark/v3.5/regtests/setup.sh`

---

### 338. `9cb71f8` - Refactor relationalJdbc in helm (#1996)

**Date:** 2025-07-04 | **Author:** Jiwon Park | **PR:** [#1996](https://github.com/apache/polaris/pull/1996)
**Files:** 5 | **Changes:** +177/-168

**PURPOSE:** Code refactoring

**WHAT CHANGED:** in Documentation, Helm Charts

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Kubernetes Deployment, User Documentation | Focused change

**Files modified:**
- `helm/polaris/README.md`
- `helm/polaris/ci/persistence-values.yaml`
- `helm/polaris/templates/deployment.yaml`
- `helm/polaris/tests/deployment_test.yaml`
- `helm/polaris/values.yaml`

---

### 339. `b0c85e3` - Improve createPrincipal example in API docs (#1992)

**Date:** 2025-07-02 | **Author:** Eric Maynard | **PR:** [#1992](https://github.com/apache/polaris/pull/1992)
**Files:** 1 | **Changes:** +6/-0

**PURPOSE:** Bug fix; Documentation update; CI/CD improvement

**WHAT CHANGED:** in OpenAPI Specs

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: API Contracts | Focused change | May affect API consumers

**Files modified:**
- `spec/polaris-management-service.yml`

**Additional details from commit message:**
```
. . .
This PR attempts to fix this by adding an explicit example to the spec.
```

---

### 340. `bdcc26f` - fix: Remove db-kind in helm chart (#1987)

**Date:** 2025-07-03 | **Author:** Jiwon Park | **PR:** [#1987](https://github.com/apache/polaris/pull/1987)
**Files:** 4 | **Changes:** +1/-9

**PURPOSE:** Bug fix; Code removal

**WHAT CHANGED:** in Helm Charts

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Kubernetes Deployment | Focused change

**Files modified:**
- `helm/polaris/ci/persistence-values.yaml`
- `helm/polaris/templates/configmap.yaml`
- `helm/polaris/tests/deployment_test.yaml`
- `helm/polaris/values.yaml`

---

### 341. `eb6b6ad` - Add support for catalog federation in the CLI (#1912)

**Date:** 2025-07-01 | **Author:** Eric Maynard | **PR:** [#1912](https://github.com/apache/polaris/pull/1912)
**Files:** 17 | **Changes:** +570/-649

**PURPOSE:** New feature

**WHAT CHANGED:** Modified CLI, Client Library in Documentation, Python Client, Spark Plugin including test updates

**WHY NEEDED:** to support catalog federation features; to improve client usability

**IMPACT:** Affects: Client API, Command Line Tools, Spark Integration, User Documentation | Medium-scale change | May affect API consumers

**Sample files (showing 15 of 17):**
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

---

### 342. `35cc9b6` - Fix the sign failure (#1926)

**Date:** 2025-06-30 | **Author:** Yufei Gu | **PR:** [#1926](https://github.com/apache/polaris/pull/1926)
**Files:** 1 | **Changes:** +3/-0

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/distribution/build.gradle.kts`

---

### 343. `a385268` - Added support for `s3a` scheme (#1932)

**Date:** 2025-06-30 | **Author:** Pavan Lanka | **PR:** [#1932](https://github.com/apache/polaris/pull/1932)
**Files:** 11 | **Changes:** +537/-49

**PURPOSE:** New feature

**WHAT CHANGED:** Modified Admin Service, Storage Integration in Core, Runtime Service including test updates

**WHY NEEDED:** to improve cloud storage integration

**IMPACT:** Affects: Cloud Storage, Management Operations | Medium-scale change

**Files modified:**
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

### 344. `44d52d4` - Add options to the bootstrap command to specify a schema file (#1942)

**Date:** 2025-06-30 | **Author:** Eric Maynard | **PR:** [#1942](https://github.com/apache/polaris/pull/1942)
**Files:** 9 | **Changes:** +237/-58

**PURPOSE:** New feature; CI/CD improvement

**WHAT CHANGED:** Modified JDBC Persistence, Persistence Layer in Core, Persistence including test updates

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage, Relational Databases | Focused change | Requires careful deployment

**Files modified:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/DatabaseType.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/DatasourceOperations.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcMetaStoreManagerFactory.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/AtomicMetastoreManagerWithJdbcBasePersistenceImplTest.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/MetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/bootstrap/BootstrapOptions.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/bootstrap/SchemaOptions.java`
- `runtime/admin/src/main/java/org/apache/polaris/admintool/BootstrapCommand.java`
- `runtime/admin/src/test/java/org/apache/polaris/admintool/BootstrapCommandTestBase.java`

---

### 345. `9c0d209` - Add additional unit and integration tests for etag functionality (#1972)

**Date:** 2025-06-30 | **Author:** Sandhya Sundaresan | **PR:** [#1972](https://github.com/apache/polaris/pull/1972)
**Files:** 2 | **Changes:** +631/-0

**PURPOSE:** New feature; Test improvement

**WHAT CHANGED:** including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisRestCatalogIntegrationBase.java`
- `service/common/src/test/java/org/apache/polaris/service/http/IfNoneMatchTest.java`

**Additional details from commit message:**
```
* Added a few corner case IT tests for testing etags with schema changes.
* Added IT tests to test changes after DDL and DML
```

---

### 346. `595e689` - Do not serialize null properties in the management model (#1955)

**Date:** 2025-06-30 | **Author:** Dmitri Bourlatchkov | **PR:** [#1955](https://github.com/apache/polaris/pull/1955)
**Files:** 2 | **Changes:** +4/-6

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `api/management-model/build.gradle.kts`
- `api/management-model/src/test/java/org/apache/polaris/core/admin/model/CatalogSerializationTest.java`

**Additional details from commit message:**
```
* This may have an impact on existing client, but it is not
  likely to be substantial because normally absent properties
  should be treated the same as having `null` values.
* This change enables adding new optional fields to the
  Management API while maintaining backward compatibility in
  the future: New properties will not be exposed to clients
  unless a value for them in explicitly set.
```

---

### 347. `e920a1d` - Correct javadoc text in generateOverlapQuery() (#1975)

**Date:** 2025-06-30 | **Author:** Dmitri Bourlatchkov | **PR:** [#1975](https://github.com/apache/polaris/pull/1975)
**Files:** 1 | **Changes:** +4/-4

**PURPOSE:** Documentation update

**WHAT CHANGED:** Modified JDBC Persistence in Persistence

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Relational Databases | Focused change

**Files modified:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/QueryGenerator.java`

**Additional details from commit message:**
```
* Correct javadoc text in generateOverlapQuery()
```

---

### 348. `ed008e4` - Add CHANGELOG (#1952)

**Date:** 2025-06-30 | **Author:** Dmitri Bourlatchkov | **PR:** [#1952](https://github.com/apache/polaris/pull/1952)
**Files:** 4 | **Changes:** +94/-0

**PURPOSE:** New feature

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `CHANGELOG.md`
- `build.gradle.kts`
- `gradle/libs.versions.toml`
- `site/content/release-guide.md`

**Additional details from commit message:**
```
* Add the Jetbrains Changelog Gradle plugin to help managing CHANGELOG.md
```

---

### 349. `d410e9c` - Add relational-jdbc to helm (#1937)

**Date:** 2025-06-30 | **Author:** Jiwon Park | **PR:** [#1937](https://github.com/apache/polaris/pull/1937)
**Files:** 7 | **Changes:** +68/-36

**PURPOSE:** New feature; CI/CD improvement

**WHAT CHANGED:** in Helm Charts

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Kubernetes Deployment | Focused change

**Files modified:**
- `helm/polaris/ci/fixtures/persistence.yaml`
- `helm/polaris/ci/persistence-values.yaml`
- `helm/polaris/templates/configmap.yaml`
- `helm/polaris/templates/deployment.yaml`
- `helm/polaris/tests/configmap_test.yaml`
- `helm/polaris/tests/deployment_test.yaml`
- `helm/polaris/values.yaml`

**Additional details from commit message:**
```
Polaris needs to support relational-jdbc as the default persistence type for simpler database configuration and better cloud-native deployment experience.
Description of the Status Quo (Current Behavior)
Currently, the Helm chart only supports eclipse-link persistence type as the default, which requires complex JPA configuration with persistence.xml files.
Desired Behavior
    Add relational-jdbc persistence type support to Helm chart
    Use relational-jdbc as the default persistence type
  ...
```

---

### 350. `438d06c` - test(integration): refactor PolarisRestCatalogIntegrationTest to run against any cloud provider (#1934)

**Date:** 2025-06-27 | **Author:** Sushant Raikar | **PR:** [#1934](https://github.com/apache/polaris/pull/1934)
**Files:** 17 | **Changes:** +348/-203

**PURPOSE:** Code refactoring

**WHAT CHANGED:** in Documentation, Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Medium-scale change

**Sample files (showing 15 of 17):**
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

---

### 351. `9ff2ca1` - Mutable objects used for immutable values (#1596)

**Date:** 2025-06-27 | **Author:** fabio-rizzo-01 | **PR:** [#1596](https://github.com/apache/polaris/pull/1596)
**Files:** 20 | **Changes:** +648/-504

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified EclipseLink Persistence, Entity Management, JDBC Persistence, Persistence Layer in Core, Persistence, Runtime Service including test updates

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Data Model, Database/Storage, JPA/ORM, Relational Databases | Medium-scale change | Requires careful deployment

**Sample files (showing 15 of 20):**
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

---

### 352. `90153aa` - Remove the maintainer list in Helm Chart README (#1962)

**Date:** 2025-06-26 | **Author:** Yufei Gu | **PR:** [#1962](https://github.com/apache/polaris/pull/1962)
**Files:** 2 | **Changes:** +1/-9

**PURPOSE:** Code removal; Documentation update

**WHAT CHANGED:** in Documentation, Helm Charts

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Kubernetes Deployment, User Documentation | Focused change

**Files modified:**
- `helm/polaris/Chart.yaml`
- `helm/polaris/README.md`

---

### 353. `fa36aa3` - Update Helm chart version (#1957)

**Date:** 2025-06-26 | **Author:** Yufei Gu | **PR:** [#1957](https://github.com/apache/polaris/pull/1957)
**Files:** 3 | **Changes:** +5/-3

**PURPOSE:** Code modification

**WHAT CHANGED:** in Documentation, Helm Charts

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Kubernetes Deployment, User Documentation | Focused change

**Files modified:**
- `helm/polaris/Chart.yaml`
- `helm/polaris/README.md`
- `helm/polaris/values.yaml`

---

### 354. `96b8be3` - Add SUPPORTED_EXTERNAL_CATALOG_AUTHENTICATION_TYPES feature configuration (#1931)

**Date:** 2025-06-26 | **Author:** Pooja Nilangekar | **PR:** [#1931](https://github.com/apache/polaris/pull/1931)
**Files:** 4 | **Changes:** +295/-18

**PURPOSE:** New feature; Security enhancement

**WHAT CHANGED:** in Core including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/config/FeatureConfiguration.java`
- `runtime/defaults/src/main/resources/application.properties`
- `service/common/src/main/java/org/apache/polaris/service/admin/PolarisServiceImpl.java`
- `service/common/src/test/java/org/apache/polaris/service/admin/PolarisServiceImplTest.java`

---

### 355. `1e69373` - Optimize the location overlap check with an index (#1686)

**Date:** 2025-06-26 | **Author:** Eric Maynard | **PR:** [#1686](https://github.com/apache/polaris/pull/1686)
**Files:** 30 | **Changes:** +863/-95

**PURPOSE:** New feature; Performance optimization

**WHAT CHANGED:** Modified Connection Management, EclipseLink Persistence, Entity Management, JDBC Persistence, Persistence Layer, Storage Integration in Core, Persistence, Runtime Service including test updates with database schema changes

**WHY NEEDED:** to enhance data storage reliability; to improve cloud storage integration

**IMPACT:** Affects: Cloud Storage, Data Model, Database/Storage, External Integrations, JPA/ORM, Relational Databases | Large-scale change affecting multiple modules | Requires careful deployment

**Sample files (showing 15 of 30):**
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

**Additional details from commit message:**
```
<hr>
### Current Behavior
The current logic is that when we create a table, we list all sibling tables and check each and every one to ensure there is no location overlap. This results in O(N^2) checks when adding N tables to a namespace, quickly becoming untenable.
With the `CreateTreeDataset` [benchmark](https://github.com/eric-maynard/polaris-tools/blob/main/benchmarks/src/gatling/scala/org/apache/polaris/benchmarks/simulations/CreateTreeDataset.scala) I tested creating 5000 sibling tables...
```

---

### 356. `3fea897` - Fix NPE in listCatalogs (#1949)

**Date:** 2025-06-26 | **Author:** Andrew Guterman | **PR:** [#1949](https://github.com/apache/polaris/pull/1949)
**Files:** 2 | **Changes:** +83/-5

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified Admin Service in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Management Operations | Focused change

**Files modified:**
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/admin/ManagementServiceTest.java`
- `service/common/src/main/java/org/apache/polaris/service/admin/PolarisAdminService.java`

**Additional details from commit message:**
```
I don't think it's ever useful for listCatalogsUnsafe to return null since the caller isn't expecting a certain length of elements, so I just filtered it there.
```

---

### 357. `e7a009f` - fix(build): Fix deprecation warnings in FeatureConfiguration (#1894)

**Date:** 2025-06-26 | **Author:** Alexandre Dutra | **PR:** [#1894](https://github.com/apache/polaris/pull/1894)
**Files:** 1 | **Changes:** +8/-0

**PURPOSE:** Bug fix; New feature; Deprecation; CI/CD improvement

**WHAT CHANGED:** in Core

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/config/FeatureConfiguration.java`

---

### 358. `d51beed` - Fix admin tool for quick start (#1945)

**Date:** 2025-06-25 | **Author:** MonkeyCanCode | **PR:** [#1945](https://github.com/apache/polaris/pull/1945)
**Files:** 5 | **Changes:** +1/-5

**PURPOSE:** Bug fix

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `getting-started/jdbc/docker-compose-bootstrap-db.yml`
- `getting-started/jdbc/docker-compose.yml`
- `runtime/admin/src/main/resources/application.properties`
- `site/content/in-dev/unreleased/configuring-polaris-for-production.md`
- `site/content/in-dev/unreleased/metastores.md`

**Additional details from commit message:**
```
This issue occurs because `quarkus.datasource.db-kind`is a build-time property in Quarkus. Its value must be defined during the application's build process to enable the datasource extension and generate the necessary CDI bean producer (ref: https://quarkus.io/guides/all-config#quarkus-datasource_quarkus-datasource-db-kind).
I think we only support postgres for now, thus, I set `quarkus.datasource.db-kind=postgresql`. This can be problematic if we later want to support more data sources other...
```

---

### 359. `22eaff4` - Fix Pagination for Catalog Federation (#1849)

**Date:** 2025-06-25 | **Author:** Rulin Xing | **PR:** [#1849](https://github.com/apache/polaris/pull/1849)
**Files:** 5 | **Changes:** +272/-20

**PURPOSE:** Bug fix

**WHAT CHANGED:** including test updates

**WHY NEEDED:** to support catalog federation features

**IMPACT:** Focused change

**Files modified:**
- `service/common/src/main/java/org/apache/polaris/service/catalog/iceberg/CatalogHandlerUtils.java`
- `service/common/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogAdapter.java`
- `service/common/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogHandler.java`
- `service/common/src/test/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogAdapterTest.java`
- `service/common/src/testFixtures/java/org/apache/polaris/service/TestServices.java`

---

### 360. `9b5325b` - Testing: admin-tool testing workaround (#1918)

**Date:** 2025-06-24 | **Author:** Robert Stupp | **PR:** [#1918](https://github.com/apache/polaris/pull/1918)
**Files:** 12 | **Changes:** +109/-15

**PURPOSE:** Code modification

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Medium-scale change

**Files modified:**
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

### 361. `fe81542` - fix(build): Gradle caching effectively not working (#1922)

**Date:** 2025-06-23 | **Author:** Robert Stupp | **PR:** [#1922](https://github.com/apache/polaris/pull/1922)
**Files:** 1 | **Changes:** +0/-16

**PURPOSE:** Bug fix; CI/CD improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `build-logic/src/main/kotlin/polaris-spotless.gradle.kts`

**Additional details from commit message:**
```
We also already have a errorprone rule, so we can get rid entirely of the spotless step.
```

---

### 362. `f5871c5` - Revert "Reuse shadowJar for spark client bundle jar maven publish (#1857)" (#1921)

**Date:** 2025-06-22 | **Author:** Yun Zou | **PR:** [#1857](https://github.com/apache/polaris/pull/1857)
**Files:** 4 | **Changes:** +12/-26

**PURPOSE:** Code modification

**WHAT CHANGED:** in Documentation, Spark Plugin

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Spark Integration, User Documentation | Focused change

**Files modified:**
- `build-logic/src/main/kotlin/publishing/PublishingHelperPlugin.kt`
- `plugins/spark/README.md`
- `plugins/spark/v3.5/spark/build.gradle.kts`
- `site/content/in-dev/unreleased/polaris-spark-client.md`

**Additional details from commit message:**
```
This reverts commit 1f7f127536a088911bf940addd1d05c07ff99a68.
The shadowJar plugin actually stops publish the original jar, which is not what spark client intend to publish for the --package usage. 
Revert it for now, will follow up with a better way to reuse the shadow jar plugin, likely with a separate bundle project
```

---

### 363. `cd59302` - fix: unify bootstrap credentials and standardize POLARIS setup (#1905)

**Date:** 2025-06-21 | **Author:** Seungchul Lee | **PR:** [#1905](https://github.com/apache/polaris/pull/1905)
**Files:** 13 | **Changes:** +20/-20

**PURPOSE:** Bug fix; Documentation update

**WHAT CHANGED:** Modified Client Library in Documentation, Python Client, Spark Plugin

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API, Spark Integration, User Documentation | Medium-scale change | May affect API consumers

**Files modified:**
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

**Additional details from commit message:**
```
- reverted secret to s3cr3t
- updated docker-compose, README, conftest.py
use POLARIS for consistency across docker, gradle and others.
```

---

### 364. `793cf08` - Feature: Rollback compaction on conflict (#1285)

**Date:** 2025-06-20 | **Author:** Prashant Singh | **PR:** [#1285](https://github.com/apache/polaris/pull/1285)
**Files:** 3 | **Changes:** +636/-23

**PURPOSE:** New feature

**WHAT CHANGED:** in Core, Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/config/FeatureConfiguration.java`
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/catalog/IcebergCatalogTest.java`
- `service/common/src/main/java/org/apache/polaris/service/catalog/iceberg/CatalogHandlerUtils.java`

**Additional details from commit message:**
```
Presently the rest catalog client creates the snapshot and asks the Rest Server to apply the snapshot and gives this in a combination of requirement and update.
Polaris could apply some basic inference and generate some updates to metadata given a property is enabled at a table level, by saying that It will revert back the commit which was created by compaction and let the write succeed.
I had this PR in OSS, which was essentially doing this at the client end, but we think its best if we do t...
```

---

### 365. `9fd13c4` - fix(ci): Remove dummy "build" job from Gradle CI (#1911)

**Date:** 2025-06-19 | **Author:** Alexandre Dutra | **PR:** [#1911](https://github.com/apache/polaris/pull/1911)
**Files:** 1 | **Changes:** +0/-10

**PURPOSE:** Bug fix; Code removal; CI/CD improvement

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/gradle.yml`

---

### 366. `1f7f127` - Reuse shadowJar for spark client bundle jar maven publish (#1857)

**Date:** 2025-06-18 | **Author:** Yun Zou | **PR:** [#1857](https://github.com/apache/polaris/pull/1857)
**Files:** 4 | **Changes:** +26/-12

**PURPOSE:** Bug fix; Documentation update

**WHAT CHANGED:** in Documentation, Spark Plugin

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Spark Integration, User Documentation | Focused change

**Files modified:**
- `build-logic/src/main/kotlin/publishing/PublishingHelperPlugin.kt`
- `plugins/spark/README.md`
- `plugins/spark/v3.5/spark/build.gradle.kts`
- `site/content/in-dev/unreleased/polaris-spark-client.md`

**Additional details from commit message:**
```
* fix test failure and address feedback
* fix error
* update regression test
* update classifier name
* address comment
* add change
* update doc
* update build and readme
* add back jr
* udpate dependency
* add change
* update
* update tests
* remove merge service file
* update readme
* update readme
```

---

### 367. `45df8ac` - Improve the parsing and validation of UserSecretReferenceUrns (#1840)

**Date:** 2025-06-18 | **Author:** Pooja Nilangekar | **PR:** [#1840](https://github.com/apache/polaris/pull/1840)
**Files:** 4 | **Changes:** +213/-16

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Secrets Management in Core including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Credentials | Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/secrets/UnsafeInMemorySecretsManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/secrets/UserSecretReference.java`
- `polaris-core/src/main/java/org/apache/polaris/core/secrets/UserSecretsManager.java`
- `polaris-core/src/test/java/org/apache/polaris/core/secrets/UserSecretReferenceTest.java`

**Additional details from commit message:**
```
Main changes:
- Create a helper to parse, validate and build the URN strings. 
- Use Regex instead of `String.split()`.
- Add Precondition checks to ensure that the URN is valid and the UserSecretManager matches the expected type. 
- Remove the now unused `GLOBAL_INSTANCE` of the UnsafeInMemorySecretsManager.
Testing 
- Existing `UnsafeInMemorySecretsManagerTest` captures most of the functional changes. 
- Added `UserSecretReferenceUrnHelperTest` to capture the utilities exposed.
```

---

### 368. `5441bb6` - feat(ci): Split Java Gradle CI in many jobs to reduce execution time (#1897)

**Date:** 2025-06-18 | **Author:** Alexandre Dutra | **PR:** [#1897](https://github.com/apache/polaris/pull/1897)
**Files:** 2 | **Changes:** +65/-29

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.asf.yaml`
- `.github/workflows/gradle.yml`

---

### 369. `fccc51a` - Rename runtime/test-commons to runtime/test-common (for consistency with module name) (#1906)

**Date:** 2025-06-17 | **Author:** JB Onofré | **PR:** [#1906](https://github.com/apache/polaris/pull/1906)
**Files:** 4 | **Changes:** +1/-1

**PURPOSE:** Test improvement

**WHAT CHANGED:** including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/projects.main.properties`
- `runtime/{test-commons => test-common}/build.gradle.kts`
- `runtime/{test-commons => test-common}/src/main/java/org/apache/polaris/test/commons/PostgresRelationalJdbcLifeCycleManagement.java`
- `runtime/{test-commons => test-common}/src/main/java/org/apache/polaris/test/commons/RelationalJdbcProfile.java`

---

### 370. `ab228af` - Rename quarkus as runtime (#1695)

**Date:** 2025-06-17 | **Author:** JB Onofré | **PR:** [#1695](https://github.com/apache/polaris/pull/1695)
**Files:** 212 | **Changes:** +137/-137

**PURPOSE:** Code modification

**WHAT CHANGED:** in CI/CD, Documentation, Helm Charts, Persistence, Spark Plugin including test updates with database schema changes

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation, Kubernetes Deployment, Spark Integration, User Documentation | Large-scale change affecting multiple modules

**Sample files (showing 15 of 212):**
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

---

### 371. `c15e62b` - Remove `.github/CODEOWNERS` (#1902)

**Date:** 2025-06-17 | **Author:** Robert Stupp | **PR:** [#1902](https://github.com/apache/polaris/pull/1902)
**Files:** 1 | **Changes:** +0/-20

**PURPOSE:** Code removal

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `.github/CODEOWNERS`

---

### 372. `f38ac8a` - feat(build): Add Checkstyle plugin and an IllegalImport rule (#1880)

**Date:** 2025-06-16 | **Author:** Alexandre Dutra | **PR:** [#1880](https://github.com/apache/polaris/pull/1880)
**Files:** 6 | **Changes:** +73/-46

**PURPOSE:** New feature; CI/CD improvement

**WHAT CHANGED:** in Spark Plugin

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Spark Integration | Focused change

**Files modified:**
- `build-logic/src/main/kotlin/polaris-java.gradle.kts`
- `build-logic/src/main/kotlin/polaris-spotless.gradle.kts`
- `codestyle/checkstyle.xml`
- `gradle/libs.versions.toml`
- `plugins/spark/v3.5/spark/build.gradle.kts`
- `quarkus/test-commons/build.gradle.kts`

---

### 373. `2d3d0d0` - Do not use relative path inside CLI script

**Date:** 2025-06-14 | **Author:** Eric Maynard | **PR:** N/A
**Files:** 1 | **Changes:** +2/-2

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris`

---

### 374. `5aefa18` - Enable patch version updates for maintained Polaris version (#1891)

**Date:** 2025-06-13 | **Author:** Robert Stupp | **PR:** [#1891](https://github.com/apache/polaris/pull/1891)
**Files:** 1 | **Changes:** +4/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `.github/renovate.json5`

**Additional details from commit message:**
```
Therefore, this change enables patch-version updates for Polaris 1.*
```

---

### 375. `01b7322` - Avoid using org.testcontainers.shaded.** (#1876)

**Date:** 2025-06-12 | **Author:** Dmitri Bourlatchkov | **PR:** [#1876](https://github.com/apache/polaris/pull/1876)
**Files:** 8 | **Changes:** +9/-6

**PURPOSE:** Test improvement

**WHAT CHANGED:** including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`
- `integration-tests/build.gradle.kts`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisApplicationIntegrationTest.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisManagementServiceIntegrationTest.java`
- `quarkus/admin/src/test/java/org/apache/polaris/admintool/el/EclipselinkPurgeCommandTest.java`
- `quarkus/admin/src/test/java/org/apache/polaris/admintool/relational/jdbc/RelationalJdbcPurgeCommandTest.java`
- `quarkus/service/build.gradle.kts`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/metrics/MetricsTestBase.java`

---

### 376. `ea47367` - Fix two wrong links in README.md (#1879)

**Date:** 2025-06-12 | **Author:** Yufei Gu | **PR:** [#1879](https://github.com/apache/polaris/pull/1879)
**Files:** 1 | **Changes:** +4/-4

**PURPOSE:** Bug fix; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `README.md`

---

### 377. `2a2bcde` - JDBC: Refactor DatabaseOps (#1843)

**Date:** 2025-06-12 | **Author:** Prashant Singh | **PR:** [#1843](https://github.com/apache/polaris/pull/1843)
**Files:** 5 | **Changes:** +71/-64

**PURPOSE:** Code refactoring

**WHAT CHANGED:** Modified JDBC Persistence in Persistence including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Relational Databases | Focused change

**Files modified:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/DatasourceOperations.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcMetaStoreManagerFactory.java`
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/RelationalJdbcProductionReadinessChecks.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/AtomicMetastoreManagerWithJdbcBasePersistenceImplTest.java`
- `persistence/relational-jdbc/src/test/java/org/apache/polaris/persistence/relational/jdbc/DatasourceOperationsTest.java`

**Additional details from commit message:**
```
* wraps the bootstrap in a transaction !
* refactor Production Readiness checks for Postgres
```

---

### 378. `7899d93` - Bump version in version.txt

**Date:** 2025-06-12 | **Author:** Eric Maynard | **PR:** N/A
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `version.txt`

---

### 379. `0faf948` - Removing star import and adding errorprone rule (#1831)

**Date:** 2025-06-12 | **Author:** gfakbar20 | **PR:** [#1831](https://github.com/apache/polaris/pull/1831)
**Files:** 13 | **Changes:** +47/-12

**PURPOSE:** New feature

**WHAT CHANGED:** Modified EclipseLink Persistence, JDBC Persistence, Persistence Layer in Core, Persistence, Spark Plugin including test updates

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage, JPA/ORM, Relational Databases, Spark Integration | Medium-scale change | Requires careful deployment

**Files modified:**
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

### 380. `8942f68` - Remove PolarisConfiguration.loadConfig (v2) (#1858)

**Date:** 2025-06-11 | **Author:** Eric Maynard | **PR:** [#1858](https://github.com/apache/polaris/pull/1858)
**Files:** 35 | **Changes:** +221/-135

**PURPOSE:** Code removal

**WHAT CHANGED:** Modified EclipseLink Persistence, Entity Management, JDBC Persistence, Persistence Layer, Storage Integration in Core, Persistence including test updates

**WHY NEEDED:** to enhance data storage reliability; to improve cloud storage integration

**IMPACT:** Affects: Cloud Storage, Data Model, Database/Storage, JPA/ORM, Relational Databases | Large-scale change affecting multiple modules | Requires careful deployment

**Sample files (showing 15 of 35):**
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

---

### 381. `97c9440` - Update LICENSE for binary distributions (#1855)

**Date:** 2025-06-11 | **Author:** Yufei Gu | **PR:** [#1855](https://github.com/apache/polaris/pull/1855)
**Files:** 6 | **Changes:** +214/-214

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 6 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `quarkus/admin/distribution/LICENSE`
- `quarkus/admin/distribution/NOTICE`
- `quarkus/distribution/LICENSE`
- `quarkus/distribution/NOTICE`
- `quarkus/server/distribution/LICENSE`
- `quarkus/server/distribution/NOTICE`

---

### 382. `6cd6558` - [SPEC] Add base-location keyword for GenericTable API (#1543)

**Date:** 2025-06-11 | **Author:** Yun Zou | **PR:** [#1543](https://github.com/apache/polaris/pull/1543)
**Files:** 5 | **Changes:** +42/-15

**PURPOSE:** New feature

**WHAT CHANGED:** in OpenAPI Specs, Spark Plugin including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: API Contracts, Spark Integration | Focused change | May affect API consumers

**Files modified:**
- `api/polaris-catalog-service/build.gradle.kts`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisRestCatalogIntegrationTest.java`
- `plugins/spark/v3.5/spark/src/main/java/org/apache/polaris/spark/rest/CreateGenericTableRESTRequest.java`
- `spec/generated/bundled-polaris-catalog-service.yaml`
- `spec/polaris-catalog-apis/generic-tables-api.yaml`

---

### 383. `e2ab322` - Add Yun Zou as the new committer

**Date:** 2025-06-10 | **Author:** Yufei Gu | **PR:** N/A
**Files:** 2 | **Changes:** +1/-2

**PURPOSE:** New feature

**WHAT CHANGED:** Modified 2 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `.asf.yaml`
- `.github/CODEOWNERS`

---

### 384. `21bd498` - Update LICENCE (#1851)

**Date:** 2025-06-10 | **Author:** Yufei Gu | **PR:** [#1851](https://github.com/apache/polaris/pull/1851)
**Files:** 1 | **Changes:** +0/-2

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `LICENSE`

---

### 385. `9470d0d` - docs: fix broken 'Polaris Overview' link in README.md (#1846)

**Date:** 2025-06-10 | **Author:** Joy Haldar | **PR:** [#1846](https://github.com/apache/polaris/pull/1846)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `README.md`

**Additional details from commit message:**
```
Co-authored-by: Joy Haldar <Joy.Haldar@target.com>
```

---

### 386. `5c8c429` - Fix LICENSE and NOTICE in Spark plugin (#1834)

**Date:** 2025-06-09 | **Author:** JB Onofré | **PR:** [#1834](https://github.com/apache/polaris/pull/1834)
**Files:** 5 | **Changes:** +862/-149

**PURPOSE:** Bug fix

**WHAT CHANGED:** in Spark Plugin

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Spark Integration | Focused change

**Files modified:**
- `plugins/spark/v3.5/spark/LICENSE`
- `plugins/spark/v3.5/spark/NOTICE`
- `quarkus/admin/distribution/LICENSE`
- `quarkus/distribution/LICENSE`
- `quarkus/server/distribution/LICENSE`

---

### 387. `dcd68db` - Fix the issue where the Polaris Server exposes backend metadata in the error response body when the database is not bootstrapped. (#1837)

**Date:** 2025-06-09 | **Author:** Bo Wang | **PR:** [#1837](https://github.com/apache/polaris/pull/1837)
**Files:** 2 | **Changes:** +3/-2

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified EclipseLink Persistence in Persistence including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: JPA/ORM | Focused change

**Files modified:**
- `persistence/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/PolarisEclipseLinkMetaStoreSessionImpl.java`
- `service/common/src/test/java/org/apache/polaris/service/exception/IcebergExceptionMapperTest.java`

---

### 388. `a9ad720` - Core: Fix  maxCode generation for ConnectionTypeEnum (#1827)

**Date:** 2025-06-08 | **Author:** Pooja Nilangekar | **PR:** [#1827](https://github.com/apache/polaris/pull/1827)
**Files:** 1 | **Changes:** +1/-4

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified Connection Management in Core

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: External Integrations | Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/connection/ConnectionType.java`

---

### 389. `9fbcf8d` - Update versions in LICENSE and NOTICE (#1833)

**Date:** 2025-06-08 | **Author:** JB Onofré | **PR:** [#1833](https://github.com/apache/polaris/pull/1833)
**Files:** 6 | **Changes:** +240/-240

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 6 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `quarkus/admin/distribution/LICENSE`
- `quarkus/admin/distribution/NOTICE`
- `quarkus/distribution/LICENSE`
- `quarkus/distribution/NOTICE`
- `quarkus/server/distribution/LICENSE`
- `quarkus/server/distribution/NOTICE`

---

### 390. `be3fee8` - Spark: Add license and notice to spark client jar and push jar to maven (#1830)

**Date:** 2025-06-07 | **Author:** gh-yzou | **PR:** [#1830](https://github.com/apache/polaris/pull/1830)
**Files:** 8 | **Changes:** +360/-11

**PURPOSE:** New feature

**WHAT CHANGED:** in Documentation, Spark Plugin

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Spark Integration, User Documentation | Focused change

**Files modified:**
- `build-logic/src/main/kotlin/publishing/PublishingHelperPlugin.kt`
- `plugins/spark/README.md`
- `plugins/spark/v3.5/getting-started/notebooks/SparkPolaris.ipynb`
- `plugins/spark/v3.5/regtests/run.sh`
- `plugins/spark/v3.5/spark/LICENSE`
- `plugins/spark/v3.5/spark/NOTICE`
- `plugins/spark/v3.5/spark/build.gradle.kts`
- `site/content/in-dev/unreleased/polaris-spark-client.md`

---

### 391. `f393a1d` - JDBC: Use PreparedStatement (#1802)

**Date:** 2025-06-06 | **Author:** Prashant Singh | **PR:** [#1802](https://github.com/apache/polaris/pull/1802)
**Files:** 13 | **Changes:** +620/-374

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified JDBC Persistence in Persistence including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Relational Databases | Medium-scale change

**Files modified:**
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

### 392. `e91d2c3` - Downgrade open api generator to 7.11 (#1823)

**Date:** 2025-06-06 | **Author:** Honah (Jonas) J. | **PR:** [#1823](https://github.com/apache/polaris/pull/1823)
**Files:** 16 | **Changes:** +99/-290

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Client Library in Documentation, Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API, User Documentation | Medium-scale change | May affect API consumers

**Sample files (showing 15 of 16):**
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

---

### 393. `3185adf` - Refactor getConfiguration to use RealmContext (Part 2) (#1783)

**Date:** 2025-06-05 | **Author:** gh-yzou | **PR:** [#1783](https://github.com/apache/polaris/pull/1783)
**Files:** 7 | **Changes:** +24/-110

**PURPOSE:** Code refactoring

**WHAT CHANGED:** Modified Persistence Layer in Core, Persistence including test updates

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage | Focused change | Requires careful deployment

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/config/PolarisConfigurationStore.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/AtomicOperationMetaStoreManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalMetaStoreManagerImpl.java`
- `polaris-core/src/test/java/org/apache/polaris/core/storage/InMemoryStorageIntegrationTest.java`
- `polaris-core/src/test/java/org/apache/polaris/service/storage/PolarisConfigurationStoreTest.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/config/DefaultConfigurationStoreTest.java`
- `service/common/src/main/java/org/apache/polaris/service/config/DefaultConfigurationStore.java`

---

### 394. `187d700` - Turn CallContext.copyOf into an interface instead of static function (#1816)

**Date:** 2025-06-05 | **Author:** gh-yzou | **PR:** [#1816](https://github.com/apache/polaris/pull/1816)
**Files:** 5 | **Changes:** +27/-60

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Context Management in Core including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Request Handling | Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/PolarisCallContext.java`
- `polaris-core/src/main/java/org/apache/polaris/core/context/CallContext.java`
- `service/common/src/main/java/org/apache/polaris/service/task/TaskExecutorImpl.java`
- `service/common/src/test/java/org/apache/polaris/service/catalog/io/FileIOFactoryTest.java`
- `service/common/src/testFixtures/java/org/apache/polaris/service/TestServices.java`

---

### 395. `a59942a` - Remove CallContext.getDiagnostics (#1815)

**Date:** 2025-06-04 | **Author:** Honah (Jonas) J. | **PR:** [#1815](https://github.com/apache/polaris/pull/1815)
**Files:** 1 | **Changes:** +0/-5

**PURPOSE:** Code removal

**WHAT CHANGED:** Modified Context Management in Core

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Request Handling | Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/context/CallContext.java`

---

### 396. `511df8c` - Remove CallContext.of (#1812)

**Date:** 2025-06-04 | **Author:** Honah (Jonas) J. | **PR:** [#1812](https://github.com/apache/polaris/pull/1812)
**Files:** 15 | **Changes:** +71/-110

**PURPOSE:** Code removal

**WHAT CHANGED:** Modified Context Management in Core, Persistence including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Request Handling | Medium-scale change

**Files modified:**
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

### 397. `5132312` - Remove deprecated constructor for PolarisCallContext (#1813)

**Date:** 2025-06-04 | **Author:** gh-yzou | **PR:** [#1813](https://github.com/apache/polaris/pull/1813)
**Files:** 28 | **Changes:** +55/-36

**PURPOSE:** Deprecation; Code removal

**WHAT CHANGED:** Modified EclipseLink Persistence, JDBC Persistence, Persistence Layer in Core, Persistence including test updates

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage, JPA/ORM, Relational Databases | Large-scale change affecting multiple modules | Requires careful deployment

**Sample files (showing 15 of 28):**
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

**Additional details from commit message:**
```
This PR removes the usage of the old constructors.
```

---

### 398. `0a8d8b8` - Core: Consolidate CallContext with PolarisCallContext part 1(#1806)

**Date:** 2025-06-04 | **Author:** Yufei Gu | **PR:** [#1806](https://github.com/apache/polaris/pull/1806)
**Files:** 6 | **Changes:** +74/-30

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Context Management, JDBC Persistence, Persistence Layer in Core, Persistence

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage, Relational Databases, Request Handling | Focused change | Requires careful deployment

**Files modified:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcMetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/PolarisCallContext.java`
- `polaris-core/src/main/java/org/apache/polaris/core/context/CallContext.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`
- `quarkus/service/src/main/java/org/apache/polaris/service/quarkus/config/QuarkusProducers.java`
- `service/common/src/main/java/org/apache/polaris/service/context/DefaultCallContextResolver.java`

---

### 399. `da0ceff` - Don't rotate root's credentials on startup in JdbcMetaStoreManagerFactory (#1804)

**Date:** 2025-06-03 | **Author:** Eric Maynard | **PR:** [#1804](https://github.com/apache/polaris/pull/1804)
**Files:** 1 | **Changes:** +7/-18

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified JDBC Persistence in Persistence

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Relational Databases | Focused change

**Files modified:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcMetaStoreManagerFactory.java`

---

### 400. `65cb39e` - Update ascii banner (#1654)

**Date:** 2025-06-03 | **Author:** Scott Teal | **PR:** [#1654](https://github.com/apache/polaris/pull/1654)
**Files:** 1 | **Changes:** +21/-20

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `service/common/src/main/resources/org/apache/polaris/service/banner.txt`

---

### 401. `d9397a5` - Test: silence CDS warning from admin tool tests (#1800)

**Date:** 2025-06-03 | **Author:** Robert Stupp | **PR:** [#1800](https://github.com/apache/polaris/pull/1800)
**Files:** 1 | **Changes:** +6/-0

**PURPOSE:** Test improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `quarkus/admin/build.gradle.kts`

---

### 402. `2a71098` - Remove the unused field in CallContextCatalogFactory (#1784)

**Date:** 2025-06-03 | **Author:** Yufei Gu | **PR:** [#1784](https://github.com/apache/polaris/pull/1784)
**Files:** 2 | **Changes:** +10/-9

**PURPOSE:** Code removal

**WHAT CHANGED:** Modified 2 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `service/common/src/main/java/org/apache/polaris/service/context/catalog/CallContextCatalogFactory.java`
- `service/common/src/main/java/org/apache/polaris/service/context/catalog/PolarisCallContextCatalogFactory.java`

---

### 403. `0a9a5d9` - feat(cdi): Remove CallContext.close() (#1776)

**Date:** 2025-06-03 | **Author:** Alexandre Dutra | **PR:** [#1776](https://github.com/apache/polaris/pull/1776)
**Files:** 12 | **Changes:** +470/-607

**PURPOSE:** Code removal

**WHAT CHANGED:** Modified Context Management in Core, Persistence including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Request Handling | Medium-scale change

**Files modified:**
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

**Additional details from commit message:**
```
This simplification will hopefully pave the way to a more robust handling of request-scoped beans in task executor threads.
```

---

### 404. `a827d26` - Run renovatebot only on the main branch (#1786)

**Date:** 2025-06-03 | **Author:** JB Onofré | **PR:** [#1786](https://github.com/apache/polaris/pull/1786)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `.github/renovate.json5`

---

### 405. `980011e` - main: Pin dependencies (#1701)

**Date:** 2025-06-03 | **Author:** Mend Renovate | **PR:** [#1701](https://github.com/apache/polaris/pull/1701)
**Files:** 8 | **Changes:** +19/-19

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/check-md-link.yml`
- `.github/workflows/gradle.yml`
- `.github/workflows/helm.yml`
- `.github/workflows/nightly.yml`
- `.github/workflows/python-client.yml`
- `.github/workflows/regtest.yml`
- `.github/workflows/site.yml`
- `.github/workflows/spark_client_regtests.yml`

---

### 406. `5fe9fd9` - Replace getConfiguration usage with PolarisCallContext to use RealmContext (PART 1) (#1780)

**Date:** 2025-06-02 | **Author:** gh-yzou | **PR:** [#1780](https://github.com/apache/polaris/pull/1780)
**Files:** 18 | **Changes:** +88/-79

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Authentication/Authorization, Storage Integration in Core including test updates

**WHY NEEDED:** to improve security and access control; to improve cloud storage integration

**IMPACT:** Affects: Cloud Storage, Security | Medium-scale change | Security-sensitive change

**Sample files (showing 15 of 18):**
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

---

### 407. `dd987b6` - Restructure the directory and package name for persistence modules (#1724)

**Date:** 2025-06-02 | **Author:** Yufei Gu | **PR:** [#1724](https://github.com/apache/polaris/pull/1724)
**Files:** 41 | **Changes:** +38/-38

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified EclipseLink Persistence, JDBC Persistence in CI/CD, Persistence including test updates with database schema changes

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation, JPA/ORM, Relational Databases | Large-scale change affecting multiple modules

**Sample files (showing 15 of 41):**
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

---

### 408. `dd2fdf9` - Handle RequestScoped instance injection gracefully for DefaultConfigurationStore (#1758)

**Date:** 2025-06-02 | **Author:** gh-yzou | **PR:** [#1758](https://github.com/apache/polaris/pull/1758)
**Files:** 5 | **Changes:** +99/-23

**PURPOSE:** Bug fix

**WHAT CHANGED:** in Core including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/config/PolarisConfigurationStore.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/config/DefaultConfigurationStoreTest.java`
- `service/common/src/main/java/org/apache/polaris/service/catalog/io/FileIOUtil.java`
- `service/common/src/main/java/org/apache/polaris/service/config/DefaultConfigurationStore.java`
- `service/common/src/main/java/org/apache/polaris/service/task/TableCleanupTaskHandler.java`

**Additional details from commit message:**
```
This actually fails the TaskExecutor because it runs in a separate thread.
In order to fix the problem, we introduces a new getConfiguration function to handle the background tasks, and also use isResolvable instead of isUnsatisfied to handle ambiguities.
```

---

### 409. `9c09e03` - Add unit test for legacy config lookup (#1774)

**Date:** 2025-06-02 | **Author:** Dmitri Bourlatchkov | **PR:** [#1774](https://github.com/apache/polaris/pull/1774)
**Files:** 1 | **Changes:** +38/-0

**PURPOSE:** New feature; Test improvement

**WHAT CHANGED:** including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/src/test/java/org/apache/polaris/service/storage/PolarisConfigurationStoreTest.java`

---

### 410. `23f6480` - Testing: silence a bunch of harmless test warnings (#1773)

**Date:** 2025-06-02 | **Author:** Robert Stupp | **PR:** [#1773](https://github.com/apache/polaris/pull/1773)
**Files:** 3 | **Changes:** +21/-0

**PURPOSE:** Test improvement

**WHAT CHANGED:** Modified 3 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `quarkus/defaults/src/main/resources/application-test.properties`
- `quarkus/defaults/src/main/resources/application.properties`
- `quarkus/service/build.gradle.kts`

**Additional details from commit message:**
```
* Hibernate Validator cannot instrument static methods (`Hibernate Validator does not support constraints on static methods yet. ...`)
* ForkJoinPool test lifecycle warning
* Couple of split-package warnings
```

---

### 411. `f158f2e` - Unblock test `createViewWithCustomMetadataLocation` (#1320)

**Date:** 2025-06-02 | **Author:** Liam Bao | **PR:** [#1320](https://github.com/apache/polaris/pull/1320)
**Files:** 2 | **Changes:** +84/-8

**PURPOSE:** Test improvement

**WHAT CHANGED:** Modified Storage Integration in Core including test updates

**WHY NEEDED:** to improve cloud storage integration

**IMPACT:** Affects: Cloud Storage | Focused change

**Files modified:**
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisRestCatalogViewIntegrationBase.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/PolarisStorageConfigurationInfo.java`

**Additional details from commit message:**
```
* Add missing properties during table/view creation
```

---

### 412. `370b74c` - Fix regression test docker setup for purge (#1768)

**Date:** 2025-06-02 | **Author:** gh-yzou | **PR:** [#1768](https://github.com/apache/polaris/pull/1768)
**Files:** 2 | **Changes:** +6/-4

**PURPOSE:** Bug fix; Test improvement; Documentation update

**WHAT CHANGED:** Modified 2 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `regtests/docker-compose.yml`
- `regtests/t_pyspark/src/conftest.py`

---

### 413. `f1a521e` - Fix test_spark_credentials_s3_exception_on_metadata_file_deletion (#1759)

**Date:** 2025-05-30 | **Author:** gh-yzou | **PR:** [#1759](https://github.com/apache/polaris/pull/1759)
**Files:** 1 | **Changes:** +8/-5

**PURPOSE:** Bug fix; Test improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `regtests/t_pyspark/src/test_spark_sql_s3_with_privileges.py`

---

### 414. `0bb062e` - fix: Improve reliability of metrics tests (#1763)

**Date:** 2025-05-30 | **Author:** Dmitri Bourlatchkov | **PR:** [#1763](https://github.com/apache/polaris/pull/1763)
**Files:** 1 | **Changes:** +20/-4

**PURPOSE:** Bug fix; Test improvement

**WHAT CHANGED:** including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/metrics/MetricsTestBase.java`

**Additional details from commit message:**
```
in the reported metrics.
This looks like a race between the Quarkus metrics producer and the
tests asking for these metrics.
This change adds a time-limited retry loop until the expected metrics
are available, before proceeding with other assertions.
Note: in normal cases the loop finishes fast because the metrics are
available. The two-minute timeout would apply only when the expected
metrics fail to be produced at all.
```

---

### 415. `59ab382` - Fixes for direct usage of client_secret #1756

**Date:** 2025-05-29 | **Author:** Eric Maynard | **PR:** N/A
**Files:** 3 | **Changes:** +12/-12

**PURPOSE:** Bug fix

**WHAT CHANGED:** in Spark Plugin

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Spark Integration | Focused change

**Files modified:**
- `getting-started/spark/notebooks/SparkPolaris.ipynb`
- `plugins/spark/v3.5/getting-started/notebooks/SparkPolaris.ipynb`
- `regtests/t_pyspark/src/test_spark_sql_s3_with_privileges.py`

---

### 416. `81798f1` - Production readiness for Persistence (#1707)

**Date:** 2025-05-29 | **Author:** Prashant Singh | **PR:** [#1707](https://github.com/apache/polaris/pull/1707)
**Files:** 4 | **Changes:** +70/-8

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified EclipseLink Persistence, JDBC Persistence in Persistence

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: JPA/ORM, Relational Databases | Focused change

**Files modified:**
- `extension/persistence/eclipselink/src/main/java/org/apache/polaris/extension/persistence/impl/eclipselink/EclipseLinkProductionReadinessChecks.java`
- `extension/persistence/relational-jdbc/build.gradle.kts`
- `extension/persistence/relational-jdbc/src/main/java/org/apache/polaris/extension/persistence/relational/jdbc/JdbcMetaStoreManagerFactory.java`
- `extension/persistence/relational-jdbc/src/main/java/org/apache/polaris/extension/persistence/relational/jdbc/RelationalJdbcProductionReadinessChecks.java`

---

### 417. `721614a` - Remove unused adminDocs artifact (#1749)

**Date:** 2025-05-29 | **Author:** Yufei Gu | **PR:** [#1749](https://github.com/apache/polaris/pull/1749)
**Files:** 2 | **Changes:** +0/-20

**PURPOSE:** Code removal; Documentation update

**WHAT CHANGED:** Modified 2 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `quarkus/admin/build.gradle.kts`
- `quarkus/distribution/build.gradle.kts`

---

### 418. `046fa70` - Fix a failing task with the release profile (#1693)

**Date:** 2025-05-29 | **Author:** Yufei Gu | **PR:** [#1693](https://github.com/apache/polaris/pull/1693)
**Files:** 1 | **Changes:** +15/-7

**PURPOSE:** Bug fix

**WHAT CHANGED:** including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `tools/version/src/jarTest/java/org/apache/polaris/version/TestPolarisVersion.java`

---

### 419. `56d1609` - Create LICENSE and NOTICE for "single" distribution (#1694)

**Date:** 2025-05-29 | **Author:** JB Onofré | **PR:** [#1694](https://github.com/apache/polaris/pull/1694)
**Files:** 7 | **Changes:** +3107/-177

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 7 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `quarkus/admin/distribution/LICENSE`
- `quarkus/admin/distribution/NOTICE`
- `quarkus/distribution/LICENSE`
- `quarkus/distribution/NOTICE`
- `quarkus/distribution/build.gradle.kts`
- `quarkus/server/distribution/LICENSE`
- `quarkus/server/distribution/NOTICE`

---

### 420. `ce3efe6` - Merge JPA module with EclipseLink Module (#1718)

**Date:** 2025-05-28 | **Author:** Yufei Gu | **PR:** [#1718](https://github.com/apache/polaris/pull/1718)
**Files:** 21 | **Changes:** +64/-100

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified EclipseLink Persistence in Documentation, Helm Charts, Persistence including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: JPA/ORM, Kubernetes Deployment, User Documentation | Large-scale change affecting multiple modules

**Sample files (showing 15 of 21):**
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

---

### 421. `a0436f0` - Keep generated RSA-key-pair for JWT token broker on heap (#1661)

**Date:** 2025-05-28 | **Author:** Robert Stupp | **PR:** [#1661](https://github.com/apache/polaris/pull/1661)
**Files:** 7 | **Changes:** +151/-62

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** in Documentation including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/auth/JWTRSAKeyPairTest.java`
- `service/common/src/main/java/org/apache/polaris/service/auth/JWTRSAKeyPair.java`
- `service/common/src/main/java/org/apache/polaris/service/auth/JWTRSAKeyPairFactory.java`
- `service/common/src/main/java/org/apache/polaris/service/auth/LocalRSAKeyProvider.java`
- `service/common/src/main/java/org/apache/polaris/service/auth/PemUtils.java`
- `service/common/src/test/java/org/apache/polaris/service/auth/LocalRSAKeyProviderTest.java`
- `site/content/in-dev/unreleased/configuration.md`

**Additional details from commit message:**
```
However, if only `polaris.authentication.token-broker.type=rsa-key-pair` but not the `public/private-key-pair` options are configured, Polaris generates those and stores them in `/tmp` using random file names (using `Files.createTempFile()`) - this happens for each (matching) realm. Each Polaris startup generates new key-pairs for each of those realms. It's practically not possible to associate the files to a realm. There is already a [production readiness check](https://github.com/apache/pol...
```

---

### 422. `f16f50b` - Site/contributing: add recommendations for working with PRs (#1625)

**Date:** 2025-05-28 | **Author:** Robert Stupp | **PR:** [#1625](https://github.com/apache/polaris/pull/1625)
**Files:** 2 | **Changes:** +52/-24

**PURPOSE:** New feature; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `CONTRIBUTING.md`
- `README.md`

**Additional details from commit message:**
```
Also adopt `gradlew test` to `gradlew check` in README, following the intent (all tests, incl ITs)
```

---

### 423. `97d16d3` - feat(metrics): Mitigate potential performance issues with realm_id tag (#1662)

**Date:** 2025-05-28 | **Author:** Alexandre Dutra | **PR:** [#1662](https://github.com/apache/polaris/pull/1662)
**Files:** 10 | **Changes:** +296/-89

**PURPOSE:** Performance optimization

**WHAT CHANGED:** in Documentation including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `quarkus/service/src/main/java/org/apache/polaris/service/quarkus/metrics/QuarkusMeterFilterProducer.java`
- `quarkus/service/src/main/java/org/apache/polaris/service/quarkus/metrics/QuarkusMetricsConfiguration.java`
- `quarkus/service/src/main/java/org/apache/polaris/service/quarkus/metrics/QuarkusValueExpressionResolver.java`
- `quarkus/service/src/main/java/org/apache/polaris/service/quarkus/metrics/RealmIdTagContributor.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/{TimedApplicationEventListenerTest.java => metrics/MetricsTestBase.java}`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/metrics/RealmIdTagDisabledMetricsTest.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/metrics/RealmIdTagEnabledMetricsTest.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/ratelimiter/RateLimiterFilterTest.java`
- `site/content/in-dev/unreleased/configuration.md`
- `site/content/in-dev/unreleased/telemetry.md`

**Additional details from commit message:**
```
They are both disabled by default.
There is also a new safeguard: if the cardinality of realm IDs in HTTP metrics goes above a configurable threshold (100 by default), a warning is printed and no more HTTP metrics will be recorded. (Quarkus has a similar safeguard for URI tags in HTTP metrics.)
```

---

### 424. `3b9d2b0` - Fix credentials printing twice (#1682)

**Date:** 2025-05-28 | **Author:** Christopher Lambert | **PR:** [#1682](https://github.com/apache/polaris/pull/1682)
**Files:** 3 | **Changes:** +6/-34

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified JDBC Persistence, Persistence Layer in Core, Persistence

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage, Relational Databases | Focused change | Requires careful deployment

**Files modified:**
- `extension/persistence/relational-jdbc/src/main/java/org/apache/polaris/extension/persistence/relational/jdbc/JdbcMetaStoreManagerFactory.java`
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/LocalPolarisMetaStoreManagerFactory.java`
- `service/common/src/main/java/org/apache/polaris/service/persistence/InMemoryPolarisMetaStoreManagerFactory.java`

---

### 425. `7961fdd` - Fix the manual test broken by PR #1532 (#1688)

**Date:** 2025-05-27 | **Author:** Yufei Gu | **PR:** [#1688](https://github.com/apache/polaris/pull/1688)
**Files:** 1 | **Changes:** +7/-1

**PURPOSE:** Bug fix; Test improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `quarkus/server/build.gradle.kts`

---

### 426. `ef7cefe` - Remove Java URI validations for Blob Storage providers (#1604)

**Date:** 2025-05-27 | **Author:** Adnan Hemani | **PR:** [#1604](https://github.com/apache/polaris/pull/1604)
**Files:** 2 | **Changes:** +50/-5

**PURPOSE:** Bug fix; Code removal

**WHAT CHANGED:** Modified Storage Integration in Core including test updates

**WHY NEEDED:** to improve cloud storage integration

**IMPACT:** Affects: Cloud Storage | Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/storage/StorageLocation.java`
- `polaris-core/src/test/java/org/apache/polaris/service/storage/StorageLocationTest.java`

**Additional details from commit message:**
```
Java URI does not actually apply any normalization to URIs if we do not call URI.normalize() (which we currently do not). Additionally, blob storage providers like S3 and GCS can provide ".." and "." as valid fragments in URLs - which Java URI would attempt to normalize incorrectly. As a result, attempting to validate and/or normalize URIs for blob storage providers using the Java URI class is the incorrect behavior. While we may want to add location validation via regex later, removing it fi...
```

---

### 427. `9001785` - Create a single binary distribution bundle (#1589)

**Date:** 2025-05-27 | **Author:** Yufei Gu | **PR:** [#1589](https://github.com/apache/polaris/pull/1589)
**Files:** 11 | **Changes:** +274/-308

**PURPOSE:** Code modification

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Medium-scale change

**Files modified:**
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

### 428. `e5bc87e` - fix: Remove info log about deprecated internal method from PolarisConfiguration (#1672)

**Date:** 2025-05-27 | **Author:** Dmitri Bourlatchkov | **PR:** [#1672](https://github.com/apache/polaris/pull/1672)
**Files:** 1 | **Changes:** +2/-1

**PURPOSE:** Bug fix; Deprecation; Code removal

**WHAT CHANGED:** in Core

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/config/PolarisConfiguration.java`

**Additional details from commit message:**
```
Phasing out old property names requires coordination with users (e.g. release notes), so it is not a matter of merely avoiding calls to that method in Polaris code.
Fixes #1666
```

---

### 429. `0a484bb` - fix: Remove duplicated code in IcebergCatalog (#1681)

**Date:** 2025-05-27 | **Author:** Alexandre Dutra | **PR:** [#1681](https://github.com/apache/polaris/pull/1681)
**Files:** 1 | **Changes:** +0/-8

**PURPOSE:** Bug fix; Code removal

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `service/common/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`

---

### 430. `acd2ad3` - feat(build): make archive builds reproducible (#1664)

**Date:** 2025-05-26 | **Author:** Robert Stupp | **PR:** [#1664](https://github.com/apache/polaris/pull/1664)
**Files:** 1 | **Changes:** +7/-0

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `build-logic/src/main/kotlin/polaris-java.gradle.kts`

---

### 431. `6e6da48` - fix and enforce more errorprone checks (#1663)

**Date:** 2025-05-23 | **Author:** Christopher Lambert | **PR:** [#1663](https://github.com/apache/polaris/pull/1663)
**Files:** 5 | **Changes:** +20/-19

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified Secrets Management, Storage Integration in Core

**WHY NEEDED:** to improve cloud storage integration

**IMPACT:** Affects: Cloud Storage, Credentials | Focused change

**Files modified:**
- `api/iceberg-service/src/main/java/org/apache/polaris/service/types/NotificationType.java`
- `codestyle/errorprone-rules.properties`
- `polaris-core/src/main/java/org/apache/polaris/core/secrets/UnsafeInMemorySecretsManager.java`
- `polaris-core/src/main/java/org/apache/polaris/core/storage/PolarisStorageIntegration.java`
- `quarkus/service/src/main/java/org/apache/polaris/service/quarkus/config/ProductionReadinessChecks.java`

**Additional details from commit message:**
```
https://errorprone.info/bugpattern/ObjectsHashCodePrimitive
https://errorprone.info/bugpattern/OptionalMapToOptional
https://errorprone.info/bugpattern/StringCharset
https://errorprone.info/bugpattern/VariableNameSameAsType
```

---

### 432. `0bdc3f4` - Refactor: Use per-request STS credentials (#1629)

**Date:** 2025-05-23 | **Author:** Dmitri Bourlatchkov | **PR:** [#1629](https://github.com/apache/polaris/pull/1629)
**Files:** 6 | **Changes:** +73/-27

**PURPOSE:** Code refactoring

**WHAT CHANGED:** Modified Storage Integration in Core including test updates

**WHY NEEDED:** to improve cloud storage integration

**IMPACT:** Affects: Cloud Storage | Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/storage/aws/AwsCredentialsStorageIntegration.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/admin/PolarisAuthzTestBase.java`
- `service/common/src/main/java/org/apache/polaris/service/storage/PolarisStorageIntegrationProviderImpl.java`
- `service/common/src/main/java/org/apache/polaris/service/storage/StorageConfiguration.java`
- `service/common/src/test/java/org/apache/polaris/service/storage/StorageConfigurationTest.java`
- `service/common/src/testFixtures/java/org/apache/polaris/service/TestServices.java`

**Additional details from commit message:**
```
No functional changes.
This is mostly to allow more storage integration
flexibility in downstream build.
This might also be useful for non-AWS storage.
```

---

### 433. `463682f` - Refactor IcebergCatalog to isolate internal state (#1659)

**Date:** 2025-05-23 | **Author:** Dmitri Bourlatchkov | **PR:** [#1659](https://github.com/apache/polaris/pull/1659)
**Files:** 2 | **Changes:** +19/-82

**PURPOSE:** New feature; Code refactoring

**WHAT CHANGED:** including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/catalog/IcebergCatalogTest.java`
- `service/common/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`

**Additional details from commit message:**
```
* Restore `private` scope on internal fields in `IcebergCatalog`
* Use a test-only setter instead of sub-classing to manage injecting
  test FileIO implementations
```

---

### 434. `5e4a6f0` - Add CATALOG_MANAGE_METADATA to super privilege set of policy attachment privileges (#1643)

**Date:** 2025-05-22 | **Author:** Honah (Jonas) J. | **PR:** [#1643](https://github.com/apache/polaris/pull/1643)
**Files:** 2 | **Changes:** +22/-8

**PURPOSE:** New feature

**WHAT CHANGED:** Modified Authentication/Authorization in Core including test updates

**WHY NEEDED:** to improve security and access control

**IMPACT:** Affects: Security | Focused change | Security-sensitive change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/auth/PolarisAuthorizerImpl.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/catalog/PolicyCatalogHandlerAuthzTest.java`

---

### 435. `a106f4e` - fix(testing): Do not let PolarisOverlappingTableTest spam `/tmp` (#1641)

**Date:** 2025-05-23 | **Author:** Robert Stupp | **PR:** [#1641](https://github.com/apache/polaris/pull/1641)
**Files:** 1 | **Changes:** +9/-2

**PURPOSE:** Bug fix; Test improvement

**WHAT CHANGED:** including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/admin/PolarisOverlappingTableTest.java`

---

### 436. `c9e0202` - fix(test): Do not let some more tests spam `/tmp` (#1651)

**Date:** 2025-05-23 | **Author:** Robert Stupp | **PR:** [#1651](https://github.com/apache/polaris/pull/1651)
**Files:** 7 | **Changes:** +36/-34

**PURPOSE:** Bug fix; Test improvement

**WHAT CHANGED:** Modified EclipseLink Persistence in Persistence including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: JPA/ORM | Focused change

**Files modified:**
- `extension/persistence/eclipselink/src/test/java/org/apache/polaris/extension/persistence/impl/eclipselink/PolarisEclipseLinkMetaStoreManagerTest.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/{PolarisRestCatalogViewFileIntegrationTest.java => PolarisRestCatalogViewFileIntegrationTestBase.java}`
- `quarkus/service/src/intTest/java/org/apache/polaris/service/quarkus/it/QuarkusRestCatalogViewFileIT.java`
- `quarkus/service/src/intTest/java/org/apache/polaris/service/quarkus/it/relational/jdbc/JdbcQuarkusViewFileIT.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/auth/JWTRSAKeyPairTest.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/catalog/io/FileIOExceptionsTest.java`
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/it/QuarkusRestCatalogViewFileIntegrationTest.java`

**Additional details from commit message:**
```
* `PolarisRestCatalogViewFileIntegrationTest`
* `FileIOExceptionsTest`
* `PolarisRestCatalogViewFileIntegrationTest`
Changes the tests to leverage JUnit's `@TempDir`.
Simplifies `PolarisEclipseLinkMetaStoreManagerTest`
* review: rename the (now) abstract class
```

---

### 437. `a534193` - [Policy Store] Add policyTypeCode to Slice/Index for Future Filtering Support and Update Policy Persistence Method (#1628)

**Date:** 2025-05-22 | **Author:** Honah (Jonas) J. | **PR:** [#1628](https://github.com/apache/polaris/pull/1628)
**Files:** 13 | **Changes:** +131/-60

**PURPOSE:** New feature; Performance optimization

**WHAT CHANGED:** Modified EclipseLink Persistence, JDBC Persistence, Persistence Layer, Policy Management in Core, Persistence including test updates

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Access Control, Database/Storage, JPA/ORM, Relational Databases | Medium-scale change | Requires careful deployment

**Files modified:**
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

**Additional details from commit message:**
```
It also updates the loadAllTargetsOnPolicy method to accept policyTypeCode, enabling it to use the new index for better performance.
```

---

### 438. `b72214a` - Use echo to print script errors (#1648)

**Date:** 2025-05-22 | **Author:** ModEtchFill | **PR:** [#1648](https://github.com/apache/polaris/pull/1648)
**Files:** 1 | **Changes:** +2/-2

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `regtests/run_spark_sql.sh`

---

### 439. `b3bbede` - fix(CI): Resolve ambiguous `regtests` GH WF job name (#1636)

**Date:** 2025-05-22 | **Author:** Robert Stupp | **PR:** [#1636](https://github.com/apache/polaris/pull/1636)
**Files:** 2 | **Changes:** +2/-1

**PURPOSE:** Bug fix; Test improvement; CI/CD improvement

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.asf.yaml`
- `.github/workflows/spark_client_regtests.yml`

---

### 440. `ae7afcf` - Add DISCLAIMER in Helm chart, fix LICENSE and NOTICE regarding code coming from Project Nessie in Helm chart (#1632)

**Date:** 2025-05-22 | **Author:** JB Onofré | **PR:** [#1632](https://github.com/apache/polaris/pull/1632)
**Files:** 3 | **Changes:** +36/-2

**PURPOSE:** Bug fix; New feature

**WHAT CHANGED:** in Helm Charts

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Kubernetes Deployment | Focused change

**Files modified:**
- `helm/polaris/DISCLAIMER`
- `helm/polaris/LICENSE`
- `helm/polaris/NOTICE`

---

### 441. `d05674d` - fix(metrics): Do not emit metrics for failed realm resolutions (#1642)

**Date:** 2025-05-21 | **Author:** Alexandre Dutra | **PR:** [#1642](https://github.com/apache/polaris/pull/1642)
**Files:** 1 | **Changes:** +1/-10

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `quarkus/service/src/main/java/org/apache/polaris/service/quarkus/metrics/RealmIdTagContributor.java`

---
