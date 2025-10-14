# Detailed Commit Analysis with Purpose, Changes, Why, and Impact
**Analysis Period:** From commit `94c94f197f1375ac5b7f949f611a4ac03579d9f0` to current `main`
**Total Commits:** 795
---

## How to Read This Document

Each commit includes:
- **PURPOSE**: Why was this commit made? (bug fix, feature, refactor, etc.)
- **WHAT CHANGED**: Which components and areas were modified
- **WHY NEEDED**: The rationale and business value
- **IMPACT**: What this affects and deployment considerations

---

## Summary Statistics
- **Total files changed:** 5,431
- **Total additions:** 110,071
- **Total deletions:** 131,867

---

## Detailed Commit Analysis

### 1. `dbc21a3` - Update dependency io.opentelemetry:opentelemetry-bom to v1.55.0 (#2804)

**Date:** 2025-10-13 | **Author:** Mend Renovate | **PR:** [#2804](https://github.com/apache/polaris/pull/2804)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 2. `cc7bb95` - Correct invalid example in management service OpenAPI spec (#2801)

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

### 3. `ed029d1` - [Catalog Federation] Block credential vending for remote tables outside allowed location list (#2791)

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

### 4. `491a9e3` - FIX REG tests with cloud providers (#2793)

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

### 5. `e1fc1fc` - Update dependency software.amazon.awssdk:bom to v2.35.5 (#2799)

**Date:** 2025-10-13 | **Author:** Mend Renovate | **PR:** [#2799](https://github.com/apache/polaris/pull/2799)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 6. `636405a` - Python client: remove Python 3.9 support (#2795)

**Date:** 2025-10-12 | **Author:** Yong Zheng | **PR:** [#2795](https://github.com/apache/polaris/pull/2795)
**Files:** 5 | **Changes:** +8/-4

**PURPOSE:** Code removal

**WHAT CHANGED:** Modified Client Library in CI/CD, Documentation, Python Client

**WHY NEEDED:** to improve client usability; to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation, Client API, User Documentation | Focused change | May affect API consumers

**Files modified:**
- `.github/workflows/python-client.yml`
- `CHANGELOG.md`
- `client/python/README.md`
- `client/python/generate_clients.py`
- `client/python/pyproject.toml`

---

### 7. `d396ffd` - Python client: update CHANGELOG.MD for recent changes (#2796)

**Date:** 2025-10-12 | **Author:** Yong Zheng | **PR:** [#2796](https://github.com/apache/polaris/pull/2796)
**Files:** 1 | **Changes:** +2/-0

**PURPOSE:** Code modification

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `CHANGELOG.md`

---

### 8. `a496a6f` - Site: Add docs for catalog federation (#2761)

**Date:** 2025-10-10 | **Author:** Yufei Gu | **PR:** [#2761](https://github.com/apache/polaris/pull/2761)
**Files:** 3 | **Changes:** +222/-0

**PURPOSE:** New feature; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to support catalog federation features

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/federation/_index.md`
- `site/content/in-dev/unreleased/federation/hive-metastore-federation.md`
- `site/content/in-dev/unreleased/federation/iceberg-rest-federation.md`

---

### 9. `04a9950` - [Catalog Federation] Enable Credential Vending for Passthrough Facade Catalog (#2784)

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

### 10. `622031a` - Freeze 1.2 change log (#2783)

**Date:** 2025-10-10 | **Author:** Prashant Singh | **PR:** [#2783](https://github.com/apache/polaris/pull/2783)
**Files:** 1 | **Changes:** +32/-15

**PURPOSE:** Code modification

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `CHANGELOG.md`

---

### 11. `07a099c` - Update Pull Request Template (#2788)

**Date:** 2025-10-09 | **Author:** Prashant Singh | **PR:** [#2788](https://github.com/apache/polaris/pull/2788)
**Files:** 1 | **Changes:** +41/-0

**PURPOSE:** Code modification

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `.github/pull_request_template.md`

---

### 12. `50d45bc` - Spark: Remove unnecessary dependency (#2789)

**Date:** 2025-10-09 | **Author:** Yufei Gu | **PR:** [#2789](https://github.com/apache/polaris/pull/2789)
**Files:** 1 | **Changes:** +0/-1

**PURPOSE:** Code removal

**WHAT CHANGED:** in Spark Plugin

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Spark Integration | Focused change

**Files modified:**
- `plugins/spark/v3.5/integration/build.gradle.kts`

---

### 13. `150d835` - Enhance Release docs (#2787)

**Date:** 2025-10-09 | **Author:** Prashant Singh | **PR:** [#2787](https://github.com/apache/polaris/pull/2787)
**Files:** 1 | **Changes:** +3/-0

**PURPOSE:** Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/release-guide.md`

---

### 14. `d449f59` - Update immutables to v2.11.6 (#2780)

**Date:** 2025-10-09 | **Author:** Mend Renovate | **PR:** [#2780](https://github.com/apache/polaris/pull/2780)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 15. `9957e24` - Extract IcebergCatalog.getAccessConfig to a separate class AccessConfigProvider (#2736)

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

### 16. `519e127` - SigV4 Auth Support for Catalog Federation - Part 4: Connection Credential Manager (#2759)

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

### 17. `031a551` - Update the LICENSE and NOTICE files in the runtime (#2779)

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

### 18. `73e382a` - Update dependency org.jboss.weld:weld-junit5 to v5.0.3.Final (#2777)

**Date:** 2025-10-08 | **Author:** Mend Renovate | **PR:** [#2777](https://github.com/apache/polaris/pull/2777)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 19. `b4e5e28` - Update dependency com.google.cloud:google-cloud-storage-bom to v2.58.1 (#2764)

**Date:** 2025-10-08 | **Author:** Mend Renovate | **PR:** [#2764](https://github.com/apache/polaris/pull/2764)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 20. `69c546a` - Client: add support for policy management (#2701)

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

### 21. `7f971cb` - Update immutables to v2.11.5 (#2776)

**Date:** 2025-10-08 | **Author:** Mend Renovate | **PR:** [#2776](https://github.com/apache/polaris/pull/2776)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 22. `980e206` - Add Arguments to Various Event Records (#2765)

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

### 23. `1387ed9` - Update Changelog with finer grained authz (#2775)

**Date:** 2025-10-07 | **Author:** Travis Bowen | **PR:** [#2775](https://github.com/apache/polaris/pull/2775)
**Files:** 1 | **Changes:** +2/-0

**PURPOSE:** Security enhancement

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `CHANGELOG.md`

---

### 24. `ff0b754` - Site: Add puppygraph integration (#2753)

**Date:** 2025-10-07 | **Author:** Jaz Ku | **PR:** [#2753](https://github.com/apache/polaris/pull/2753)
**Files:** 11 | **Changes:** +384/-0

**PURPOSE:** New feature

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Medium-scale change

**Files modified:**
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

### 25. `413e293` - JDBC: Fix Bootstrap with schema options (#2762)

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

### 26. `e973100` - Delete ServiceSecretReference (#2768)

**Date:** 2025-10-07 | **Author:** Rulin Xing | **PR:** [#2768](https://github.com/apache/polaris/pull/2768)
**Files:** 1 | **Changes:** +0/-53

**PURPOSE:** Code removal

**WHAT CHANGED:** Modified Secrets Management in Core

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Credentials | Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/secrets/ServiceSecretReference.java`

---

### 27. `fcf3f5f` - [Python CLI][CI Failure] Pin pydantic version to < 2.12.0 to fix CI failure (#2770)

**Date:** 2025-10-07 | **Author:** Honah (Jonas) J. | **PR:** [#2770](https://github.com/apache/polaris/pull/2770)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; CI/CD improvement

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 28. `4117551` - Implement Finer Grained Operations and Privileges For Update Table (#2697)

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

### 29. `62a1e70` - Refactor resolutionManifest handling in PolarisAdminService (#2748)

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

### 30. `5730b8f` - Update eric-maynard Team entry (#2763)

**Date:** 2025-10-06 | **Author:** Eric Maynard | **PR:** [#2763](https://github.com/apache/polaris/pull/2763)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/community/_index.adoc`

---

### 31. `dc3f44c` - Update apache/spark Docker tag to v3.5.7 (#2727)

**Date:** 2025-10-06 | **Author:** Mend Renovate | **PR:** [#2727](https://github.com/apache/polaris/pull/2727)
**Files:** 2 | **Changes:** +2/-2

**PURPOSE:** Documentation update

**WHAT CHANGED:** Modified 2 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `getting-started/eclipselink/docker-compose.yml`
- `getting-started/jdbc/docker-compose.yml`

---

### 32. `d27cff8` - Update dependency software.amazon.awssdk:bom to v2.35.0 (#2760)

**Date:** 2025-10-06 | **Author:** Mend Renovate | **PR:** [#2760](https://github.com/apache/polaris/pull/2760)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 33. `10f4bc5` - Service: RealmContextFilter test refactor (#2747)

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

### 34. `7b45d82` - Update actions/stale digest to 5f858e3 (#2758)

**Date:** 2025-10-04 | **Author:** Mend Renovate | **PR:** [#2758](https://github.com/apache/polaris/pull/2758)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/stale.yml`

---

### 35. `793a118` - SigV4 Auth Support for Catalog Federation - Part 3: Service Identity Info Injection (#2523)

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

### 36. `3e80675` - [Catalog Federation] Ignore JIT entities when deleting federated catalogs, add integration test for namespace/table-level RBAC (#2690)

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

### 37. `927bb5e` - Enforce that S3 credentials are vended when requested (#2711)

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

### 38. `b190b77` - Add PolarisResolutionManifestCatalogView.getResolvedCatalogEntity helper (#2750)

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

### 39. `94b4961` - Deprecate legacy management endpoints for removal (#2749)

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

### 40. `b1142b5` - JDBC: Handle schema evolution (#2714)

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

### 41. `d2a607a` - Extract interface for RequestIdGenerator (#2720)

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

### 42. `343e43a` - fix(deps): update dependency io.smallrye.config:smallrye-config-core to v3.14.1 (#2755)

**Date:** 2025-10-03 | **Author:** Mend Renovate | **PR:** [#2755](https://github.com/apache/polaris/pull/2755)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 43. `058f63a` - fix(enhancement): squash commits (#2643)

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

### 44. `c3fe141` - Fix javadocs of `PolarisPrincipal.getPrincipalRoles()` (#2752)

**Date:** 2025-10-03 | **Author:** Alexandre Dutra | **PR:** [#2752](https://github.com/apache/polaris/pull/2752)
**Files:** 1 | **Changes:** +1/-7

**PURPOSE:** Bug fix; Documentation update; CI/CD improvement

**WHAT CHANGED:** Modified Service Authentication in Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: API Security | Focused change | May affect API consumers

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/auth/PolarisCredential.java`

---

### 45. `a4e62bd` - fix(enhancement): add .idea, .vscode, .venv to top level .gitignore (#2718)

**Date:** 2025-10-03 | **Author:** Artur Rakhmatulin | **PR:** [#2718](https://github.com/apache/polaris/pull/2718)
**Files:** 1 | **Changes:** +7/-1

**PURPOSE:** Bug fix; New feature

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `.gitignore`

---

### 46. `8f05d1b` - Service: Add events for APIs awaiting API changes (#2712)

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

### 47. `6a82260` - Updating metastore documentation with Aurora postgres example (#2706)

**Date:** 2025-10-02 | **Author:** fabio-rizzo-01 | **PR:** [#2706](https://github.com/apache/polaris/pull/2706)
**Files:** 1 | **Changes:** +31/-0

**PURPOSE:** Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/metastores.md`

---

### 48. `8ed89cc` - Update docker.io/jaegertracing/all-in-one Docker tag to v1.74.0 (#2751)

**Date:** 2025-10-02 | **Author:** Mend Renovate | **PR:** [#2751](https://github.com/apache/polaris/pull/2751)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Documentation update; CI/CD improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `getting-started/telemetry/docker-compose.yml`

---

### 49. `baacb47` - Build: remove code to post-process generated Quarkus jars (#2667)

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

### 50. `359388e` - Make ResolverFactory + ResolutionManifestFactory request-scoped (#2540)

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

### 51. `770a9d7` - fix(deps): update quarkus platform and group to v3.28.2 (#2648)

**Date:** 2025-10-02 | **Author:** Mend Renovate | **PR:** [#2648](https://github.com/apache/polaris/pull/2648)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 52. `c18c38d` - Testing: add test-parallelism-constraint and unify testing constaints (#2726)

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

### 53. `f8aa0fa` - Fix: Build task syncNoticeAndLicense fails on Windows (#2742)

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

### 54. `65c5d11` - fix(deps): update dependency com.github.dasniko:testcontainers-keycloak to v3.9.0 (#2744)

**Date:** 2025-10-02 | **Author:** Mend Renovate | **PR:** [#2744](https://github.com/apache/polaris/pull/2744)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update; Test improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 55. `5f73f92` - 2678 (#2746)

**Date:** 2025-10-02 | **Author:** Yong Zheng | **PR:** [#2746](https://github.com/apache/polaris/pull/2746)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/configuration.md`

---

### 56. `97c62cb` - NoSQL: minor change to polaris-core for paging (#2740)

**Date:** 2025-10-02 | **Author:** Robert Stupp | **PR:** [#2740](https://github.com/apache/polaris/pull/2740)
**Files:** 1 | **Changes:** +5/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Persistence Layer in Core, Persistence

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage | Focused change | Requires careful deployment

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/pagination/Page.java`

---

### 57. `395f7bd` - Build/nit: remove unnecessary apt dependency (#2739)

**Date:** 2025-10-01 | **Author:** Robert Stupp | **PR:** [#2739](https://github.com/apache/polaris/pull/2739)
**Files:** 1 | **Changes:** +0/-2

**PURPOSE:** Code removal; CI/CD improvement

**WHAT CHANGED:** Modified NoSQL Persistence in Persistence

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: NoSQL Databases | Focused change

**Files modified:**
- `persistence/nosql/idgen/spi/build.gradle.kts`

---

### 58. `aaa81b8` - Remove unused EntityCacheMode (#2662)

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

### 59. `6815de9` - chore(deps): update gradle/actions action to v5 (#2741)

**Date:** 2025-10-01 | **Author:** Mend Renovate | **PR:** [#2741](https://github.com/apache/polaris/pull/2741)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `.github/actions/ci-incr-build-cache-prepare/action.yml`

---

### 60. `f7b5646` - IRC SPEC v3 support: Change the IRC spec to use 1.10 yaml (#2731)

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

### 61. `c07b1b7` - fix(deps): update dependency org.keycloak:keycloak-admin-client to v26.0.7 (#2738)

**Date:** 2025-10-01 | **Author:** Mend Renovate | **PR:** [#2738](https://github.com/apache/polaris/pull/2738)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 62. `abf1e35` - CI: Split-jobs - fix store-cache dependencies (#2737)

**Date:** 2025-10-01 | **Author:** Robert Stupp | **PR:** [#2737](https://github.com/apache/polaris/pull/2737)
**Files:** 1 | **Changes:** +2/-0

**PURPOSE:** Bug fix; CI/CD improvement

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/gradle.yml`

---

### 63. `8906672` - CI: GHCR docker.io mirror - testcontainers (#2725)

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

### 64. `6a6dc38` - Build: make jcstress task cacheable (#2734)

**Date:** 2025-10-01 | **Author:** Robert Stupp | **PR:** [#2734](https://github.com/apache/polaris/pull/2734)
**Files:** 1 | **Changes:** +19/-0

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** Modified NoSQL Persistence in Persistence

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: NoSQL Databases | Focused change

**Files modified:**
- `persistence/nosql/idgen/impl/build.gradle.kts`

---

### 65. `12f3ad2` - Split CI jobs, improve overall CI duration (#2733)

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

### 66. `ea50fe3` - TestEventsListener - reduce memory pressure (#2724)

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

### 67. `80f0456` - Use PrincipalEntity in PolarisMetaStoreManager.createPrincipal (#2518)

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

### 68. `7bfe2f6` - fix(deps): update dependency ch.qos.logback:logback-classic to v1.5.19 (#2732)

**Date:** 2025-09-30 | **Author:** Mend Renovate | **PR:** [#2732](https://github.com/apache/polaris/pull/2732)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 69. `5811b12` - Build: remove unnecessary explicit vertx-core dependency (#2730)

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

### 70. `4024557` - chore(deps): update quay.io/keycloak/keycloak docker tag to v26.4.0 (#2719)

**Date:** 2025-09-30 | **Author:** Mend Renovate | **PR:** [#2719](https://github.com/apache/polaris/pull/2719)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Documentation update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `getting-started/keycloak/docker-compose.yml`

---

### 71. `df81b6d` - fix(deps): update dependency org.jboss.weld:weld-junit5 to v5.0.2.final (#2721)

**Date:** 2025-09-30 | **Author:** Mend Renovate | **PR:** [#2721](https://github.com/apache/polaris/pull/2721)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 72. `31d0a03` - fix(deps): update dependency io.smallrye:jandex to v3.5.0 (#2722)

**Date:** 2025-09-30 | **Author:** Mend Renovate | **PR:** [#2722](https://github.com/apache/polaris/pull/2722)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 73. `6844069` - Fix RDS devservices config + adopt for `:polaris-admin:test` (#2723)

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

### 74. `dedda29` - NoSQL persistence: add Java/Vert.X executor abstraction layer (#2527)

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

### 75. `b8f956a` - fix(deps): update dependency org.junit:junit-bom to v5.14.0 (#2715)

**Date:** 2025-09-30 | **Author:** Mend Renovate | **PR:** [#2715](https://github.com/apache/polaris/pull/2715)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 76. `2f0c7a4` - Generate Request IDs (if not specified); Return Request ID as a Header (#2602)

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

### 77. `3b4b995` - Fix `delegationModes` parameter propagation in `createTableStaged()` (#2713)

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

### 78. `aeae51f` - [Catalog Federation] Add feature flag to disallow setting sub-RBAC for federated catalog at catalog level (#2696)

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

### 79. `5ea215a` - Add fallback in case the VERSION table is not present (#2653)

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

### 80. `d8d0f81` - Client: fix integration testing (#2700)

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

### 81. `bd94b25` - chore(deps): update gradle/actions digest to 748248d (#2708)

**Date:** 2025-09-29 | **Author:** Mend Renovate | **PR:** [#2708](https://github.com/apache/polaris/pull/2708)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `.github/actions/ci-incr-build-cache-prepare/action.yml`

---

### 82. `2cfa41b` - Docs/improve idp documentation (#2695)

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

### 83. `f97c5eb` - Support S3 storage that does not have STS (#2672)

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

### 84. `8099476` - fix(deps): update dependency com.gradleup.shadow:shadow-gradle-plugin to v9.2.2 (#2661)

**Date:** 2025-09-29 | **Author:** Mend Renovate | **PR:** [#2661](https://github.com/apache/polaris/pull/2661)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/baselibs.versions.toml`

---

### 85. `3937738` - fix(deps): update dependency software.amazon.awssdk:bom to v2.34.5 (#2702)

**Date:** 2025-09-29 | **Author:** Mend Renovate | **PR:** [#2702](https://github.com/apache/polaris/pull/2702)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 86. `0764745` - Client: add credential reset option (#2698)

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

### 87. `f2e3848` - Fix a race condition in sendNotification where concurrent parent-namespace creation causes failures (#2693)

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

### 88. `c4fee3d` - Remove unused `name` arg from findCatalogByName in PolarisAdminService (#2691)

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

### 89. `965bd53` - Enhancement : adding support for Aurora postgres AWS IAM authentication (#2650)

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

### 90. `149aaa6` - Auth: reorganize internal authentication components (#2634)

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

### 91. `7110592` - fix(deps): update dependency org.kordamp.gradle:jandex-gradle-plugin to v2.3.0 (#2694)

**Date:** 2025-09-26 | **Author:** Mend Renovate | **PR:** [#2694](https://github.com/apache/polaris/pull/2694)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/baselibs.versions.toml`

---

### 92. `19742cc` - Fix & enhancements to the Events API hierarchy (#2629)

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

### 93. `0492496` - Publish Develocity builds scans for PRs and local use (#2596)

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

### 94. `7b444eb` - chore(deps): update dependency io.quarkus to v3.27.0 (#2663)

**Date:** 2025-09-26 | **Author:** Robert Stupp | **PR:** [#2663](https://github.com/apache/polaris/pull/2663)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 95. `3f758bf` - chore(deps): update dependency openapi-generator-cli to v7.15.0 (#2410)

**Date:** 2025-09-26 | **Author:** Mend Renovate | **PR:** [#2410](https://github.com/apache/polaris/pull/2410)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 96. `95653eb` - fix(deps): update dependency org.apache.logging.log4j:log4j-core to v2.25.2 (#2646)

**Date:** 2025-09-26 | **Author:** Mend Renovate | **PR:** [#2646](https://github.com/apache/polaris/pull/2646)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** in Spark Plugin

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Spark Integration | Focused change

**Files modified:**
- `plugins/spark/v3.5/integration/build.gradle.kts`

---

### 97. `0e7d5da` - fix(deps): update dependency org.eclipse.persistence:eclipselink to v4.0.8 (#2682)

**Date:** 2025-09-26 | **Author:** Mend Renovate | **PR:** [#2682](https://github.com/apache/polaris/pull/2682)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 98. `1e4e1be` - chore(deps): update postgres docker tag to v18 (#2692)

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

### 99. `41968a7` - Make ENABLE_SUB_CATALOG_RBAC_FOR_FEDERATED_CATALOGS configurable per catalog (#2688)

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

### 100. `7f5c2a8` - Docs: Add analytics for polaris.apache.org (#2676)

**Date:** 2025-09-25 | **Author:** Prashant Singh | **PR:** [#2676](https://github.com/apache/polaris/pull/2676)
**Files:** 1 | **Changes:** +21/-0

**PURPOSE:** New feature; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/layouts/partials/head.html`

---

### 101. `925c00b` - Site: The link https://iceberg.apache.org/concepts/catalog/ doesn't exist anymore. (#2683)

**Date:** 2025-09-25 | **Author:** JB Onofré | **PR:** [#2683](https://github.com/apache/polaris/pull/2683)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/_index.md`

---

### 102. `8ea68e1` - Docs: Add more details about v1 schema user to upgrade from 1.0 to 1.1 (#2674)

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

### 103. `f1d71a9` - (Based on PR#2223)Support Namespace/Table level RBAC for external passthrough catalogs (#2673)

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

### 104. `0f75c2e` - chore(deps): update quay.io/keycloak/keycloak docker tag to v26.3.5 (#2681)

**Date:** 2025-09-25 | **Author:** Mend Renovate | **PR:** [#2681](https://github.com/apache/polaris/pull/2681)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Documentation update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `getting-started/keycloak/docker-compose.yml`

---

### 105. `2c0bf58` - fix(deps): update dependency com.diffplug.spotless:spotless-plugin-gradle to v8 (#2669)

**Date:** 2025-09-25 | **Author:** Mend Renovate | **PR:** [#2669](https://github.com/apache/polaris/pull/2669)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/baselibs.versions.toml`

---

### 106. `a756b57` - fix(deps): update immutables to v2.11.4 (#2679)

**Date:** 2025-09-25 | **Author:** Mend Renovate | **PR:** [#2679](https://github.com/apache/polaris/pull/2679)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 107. `53aa531` - fix(auth): let ServiceFailureException bubble up for proper HTTP status mapping during auth (#2670)

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

### 108. `717b726` - fix(deps): update dependency com.h2database:h2 to v2.4.240 (#2668)

**Date:** 2025-09-25 | **Author:** Mend Renovate | **PR:** [#2668](https://github.com/apache/polaris/pull/2668)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 109. `7409939` - Doc: Add breaking changes section for 1.1 release (#2654)

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

### 110. `091fe6f` - fix(deps): update dependency org.apache.commons:commons-lang3 to v3.19.0 (#2665)

**Date:** 2025-09-24 | **Author:** Mend Renovate | **PR:** [#2665](https://github.com/apache/polaris/pull/2665)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 111. `2e4afa8` - Minio testcontainer: allow setting a specific region (#2664)

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

### 112. `fcb6b33` - Fix Issue 2024 for Rendering Blockquotes (#2656)

**Date:** 2025-09-24 | **Author:** Adam Christian | **PR:** [#2656](https://github.com/apache/polaris/pull/2656)
**Files:** 10 | **Changes:** +158/-118

**PURPOSE:** Bug fix

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/_index.md`
- `site/content/in-dev/unreleased/admin-tool.md`
- `site/content/in-dev/unreleased/configuration.md`
- `site/content/in-dev/unreleased/configuring-polaris-for-production.md`
- `site/content/in-dev/unreleased/helm.md`
- `site/content/in-dev/unreleased/managing-security/external-idp/_index.md`
- `site/content/in-dev/unreleased/metastores.md`
- `site/content/in-dev/unreleased/policy.md`
- `site/layouts/_markup/render-blockquote.html`
- `site/layouts/shortcodes/alert.html`

**Additional details from commit message:**
```
* Small fix for URLs
* Update license
```

---

### 113. `a762589` - fix(deps): update dependency org.apache.spark:spark-sql_2.12 to v3.5.7 (#2658)

**Date:** 2025-09-24 | **Author:** Mend Renovate | **PR:** [#2658](https://github.com/apache/polaris/pull/2658)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 114. `0928797` - fix(deps): update dependency org.apache.spark:spark-sql_2.12 to v3.5.7 (#2659)

**Date:** 2025-09-24 | **Author:** Mend Renovate | **PR:** [#2659](https://github.com/apache/polaris/pull/2659)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `integration-tests/build.gradle.kts`

---

### 115. `b00dca6` - fix(deps): update dependency com.google.cloud:google-cloud-storage-bom to v2.58.0 (#2660)

**Date:** 2025-09-24 | **Author:** Mend Renovate | **PR:** [#2660](https://github.com/apache/polaris/pull/2660)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 116. `06d5231` - docs: Update S3 getting started guides (#2652)

**Date:** 2025-09-23 | **Author:** Dmitri Bourlatchkov | **PR:** [#2652](https://github.com/apache/polaris/pull/2652)
**Files:** 7 | **Changes:** +60/-116

**PURPOSE:** Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/getting-started/creating-a-catalog/s3/catalog-aws.md`
- `site/content/in-dev/unreleased/getting-started/creating-a-catalog/s3/catalog-minio.md`
- `site/content/in-dev/unreleased/getting-started/deploying-polaris/cloud-deploy/deploy-aws.md`
- `site/content/in-dev/unreleased/getting-started/deploying-polaris/cloud-deploy/deploy-azure.md`
- `site/content/in-dev/unreleased/getting-started/deploying-polaris/cloud-deploy/deploy-gcp.md`
- `site/content/in-dev/unreleased/getting-started/deploying-polaris/local-deploy.md`
- `site/content/in-dev/unreleased/getting-started/using-polaris.md`

---

### 117. `44568da` - Release artifacts should use dlcdn.apache.org (signature and checksum must refer downloads.apache.org) (#2647)

**Date:** 2025-09-23 | **Author:** JB Onofré | **PR:** [#2647](https://github.com/apache/polaris/pull/2647)
**Files:** 1 | **Changes:** +10/-10

**PURPOSE:** Code modification

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/downloads/_index.md`

---

### 118. `b1eb9bd` - fix: fix broken markdown-link-check CI job after #2611 got merged (#2655)

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

### 119. `d631bde` - fix(deps): update dependency org.assertj:assertj-core to v3.27.6 (#2651)

**Date:** 2025-09-23 | **Author:** Mend Renovate | **PR:** [#2651](https://github.com/apache/polaris/pull/2651)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 120. `eb7618b` - chore(docs): reorganize getting-started section (#2611)

**Date:** 2025-09-22 | **Author:** Artur Rakhmatulin | **PR:** [#2611](https://github.com/apache/polaris/pull/2611)
**Files:** 18 | **Changes:** +564/-34

**PURPOSE:** Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Medium-scale change

**Sample files (showing 15 of 18):**
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

---

### 121. `3e08c90` - [OpenAPI Modification] Return created objects (#2603)

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

### 122. `5ca3fdc` - Always propagate non-credential properties from AccessConfig to clients (#2615)

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

### 123. `e6796f7` - Update jandex dependency to 3.5.0 (#2649)

**Date:** 2025-09-22 | **Author:** Robert Stupp | **PR:** [#2649](https://github.com/apache/polaris/pull/2649)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 124. `da8c9af` - fix(deps): update quarkus platform and group (#2595)

**Date:** 2025-09-22 | **Author:** Mend Renovate | **PR:** [#2595](https://github.com/apache/polaris/pull/2595)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 125. `e53a352` - chore(events): unify in-memory buffer listeners implementations (#2628)

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

### 126. `4db5213` - chore(deps): update docker.io/prom/prometheus docker tag to v3.6.0 (#2644)

**Date:** 2025-09-22 | **Author:** Mend Renovate | **PR:** [#2644](https://github.com/apache/polaris/pull/2644)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Documentation update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `getting-started/telemetry/docker-compose.yml`

---

### 127. `b26e97c` - fix(deps): update mockito monorepo to v5.20.0 (#2641)

**Date:** 2025-09-22 | **Author:** Mend Renovate | **PR:** [#2641](https://github.com/apache/polaris/pull/2641)
**Files:** 1 | **Changes:** +2/-2

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 128. `2d8cef2` - fix(deps): update dependency software.amazon.awssdk:bom to v2.34.0 (#2645)

**Date:** 2025-09-22 | **Author:** Mend Renovate | **PR:** [#2645](https://github.com/apache/polaris/pull/2645)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 129. `9cb70ab` - Fix client license check (#2642)

**Date:** 2025-09-20 | **Author:** Yong Zheng | **PR:** [#2642](https://github.com/apache/polaris/pull/2642)
**Files:** 1 | **Changes:** +2/-27

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 130. `adea7a6` - fix(deps): update dependency io.smallrye.config:smallrye-config-core to v3.14.0 (#2637)

**Date:** 2025-09-20 | **Author:** Mend Renovate | **PR:** [#2637](https://github.com/apache/polaris/pull/2637)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 131. `e114df9` - fix(deps): update dependency com.google.errorprone:error_prone_core to v2.42.0 (#2636)

**Date:** 2025-09-20 | **Author:** Mend Renovate | **PR:** [#2636](https://github.com/apache/polaris/pull/2636)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 132. `e079dbc` - Remove unused LOG in SparkCatalog (#2639)

**Date:** 2025-09-19 | **Author:** Dmitri Bourlatchkov | **PR:** [#2639](https://github.com/apache/polaris/pull/2639)
**Files:** 1 | **Changes:** +0/-3

**PURPOSE:** Code removal

**WHAT CHANGED:** in Spark Plugin

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Spark Integration | Focused change

**Files modified:**
- `plugins/spark/v3.5/spark/src/main/java/org/apache/polaris/spark/SparkCatalog.java`

---

### 133. `7f5fb06` - Azure: Fix azure expires at prefix for the credentials refresh (#2633)

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

### 134. `01f4baa` - Re-add CHANGELOG.md entry for #2197 (#2638)

**Date:** 2025-09-19 | **Author:** Dmitri Bourlatchkov | **PR:** [#2638](https://github.com/apache/polaris/pull/2638)
**Files:** 1 | **Changes:** +2/-0

**PURPOSE:** New feature

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `CHANGELOG.md`

---

### 135. `a3a87e7` - CHANGELOG: Freeze change log for 1.1 and clear out unreleased version (#2635)

**Date:** 2025-09-19 | **Author:** Prashant Singh | **PR:** [#2635](https://github.com/apache/polaris/pull/2635)
**Files:** 1 | **Changes:** +45/-59

**PURPOSE:** Code modification

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `CHANGELOG.md`

---

### 136. `553cb06` - Service: Add Events for PolarisServiceImpl APIs (#2482)

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

### 137. `72e02c9` - Suppress deprecation warnings in `PolarisSparkCatalog.createTable()` (#2631)

**Date:** 2025-09-19 | **Author:** Dmitri Bourlatchkov | **PR:** [#2631](https://github.com/apache/polaris/pull/2631)
**Files:** 1 | **Changes:** +1/-0

**PURPOSE:** Deprecation

**WHAT CHANGED:** in Spark Plugin

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Spark Integration | Focused change

**Files modified:**
- `plugins/spark/v3.5/spark/src/main/java/org/apache/polaris/spark/PolarisSparkCatalog.java`

**Additional details from commit message:**
```
Since we have to override the deprecated `createTable` method, we
suppress deprecation warnings produced by `javac`.
Suppressing `RedundantSuppression` is needed for IntelliJ, which
appears to consider this a normal situation and does not issue a
deprecation warning.
```

---

### 138. `d1d359a` - Remove ActiveRolesProvider (#2390)

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

### 139. `984cb0f` - virtualenv: wider version range (#2623)

**Date:** 2025-09-19 | **Author:** Robert Stupp | **PR:** [#2623](https://github.com/apache/polaris/pull/2623)
**Files:** 1 | **Changes:** +2/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 140. `ae9f1a2` - main: bump to 1.2.0-incubating-SNAPSHOT (#2624)

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

### 141. `d91dbd0` - Include principal name in Polaris tokens (#2389)

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

### 142. `f334d1a` - Remove numeric identifier from PolarisPrincipal (#2388)

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

### 143. `ce015b6` - Unify create/loadTable call paths (#2589)

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

### 144. `ce4fad1` - fix(deps): update dependency com.adobe.testing:s3mock-testcontainers to v4.9.1 (#2626)

**Date:** 2025-09-19 | **Author:** Mend Renovate | **PR:** [#2626](https://github.com/apache/polaris/pull/2626)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update; Test improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 145. `2c77fbf` - chore(errorprone): Enabling EqualsGetClass, PatternMatchingInstanceof, and UnusedMethod in ErrorProne (#2600)

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

### 146. `4e6f202` - Add 1.1.0-incubating release content (#2625)

**Date:** 2025-09-19 | **Author:** JB Onofré | **PR:** [#2625](https://github.com/apache/polaris/pull/2625)
**Files:** 2 | **Changes:** +14/-2

**PURPOSE:** New feature

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/blog/2025/09/19/apache-polaris-1.1.0-incubating.md`
- `site/content/downloads/_index.md`

---

### 147. `b75e301` - Add 1.1.0-incubating release on the website (#2621)

**Date:** 2025-09-19 | **Author:** JB Onofré | **PR:** [#2621](https://github.com/apache/polaris/pull/2621)
**Files:** 3 | **Changes:** +77/-6

**PURPOSE:** New feature

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/blog/2025/09/19/apache-polaris-1.1.0-incubating.md`
- `site/content/downloads/_index.md`
- `site/hugo.yaml`

---

### 148. `0c1b201` - Add Community Meeting 20250918 (#2622)

**Date:** 2025-09-19 | **Author:** JB Onofré | **PR:** [#2622](https://github.com/apache/polaris/pull/2622)
**Files:** 1 | **Changes:** +8/-4

**PURPOSE:** New feature

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/community/meetings/_index.adoc`

---

### 149. `fab7c71` - chore(deps): update dependency virtualenv to >=20.34.0,<20.35.0 (#2614)

**Date:** 2025-09-19 | **Author:** Mend Renovate | **PR:** [#2614](https://github.com/apache/polaris/pull/2614)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 150. `5d3040a` - fix(deps): update dependency org.assertj:assertj-core to v3.27.5 (#2618)

**Date:** 2025-09-19 | **Author:** Mend Renovate | **PR:** [#2618](https://github.com/apache/polaris/pull/2618)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 151. `4e2facb` - Introduce alternate in-memory buffering event listener (#2574)

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

### 152. `57b3351` - Update registry.access.redhat.com/ubi9/openjdk-21-runtime Docker tag to v1.23-6.1758133907 (#2612)

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

### 153. `39d0777` - chore(deps): update dependency mypy to >=1.18, <=1.18.2 (#2617)

**Date:** 2025-09-19 | **Author:** Mend Renovate | **PR:** [#2617](https://github.com/apache/polaris/pull/2617)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 154. `4618513` - fix(deps): update dependency org.postgresql:postgresql to v42.7.8 (#2619)

**Date:** 2025-09-19 | **Author:** Mend Renovate | **PR:** [#2619](https://github.com/apache/polaris/pull/2619)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 155. `cd1971a` - Add Code of Conduct entry to the ASF menu (#2537)

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

### 156. `28273a0` - fix(deps): update dependency io.opentelemetry:opentelemetry-bom to v1.54.1 (#2613)

**Date:** 2025-09-18 | **Author:** Mend Renovate | **PR:** [#2613](https://github.com/apache/polaris/pull/2613)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 157. `7af79e5` - docs(README): Updating the READMEs to Reflect the Project Structure (#2599)

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

### 158. `9057fc3` - chore(docs): add polaris-api-specs section (#2598)

**Date:** 2025-09-18 | **Author:** Artur Rakhmatulin | **PR:** [#2598](https://github.com/apache/polaris/pull/2598)
**Files:** 4 | **Changes:** +34/-6

**PURPOSE:** New feature; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/polaris-api-specs/_index.md`
- `site/content/in-dev/unreleased/{polaris-catalog-service.md => polaris-api-specs/polaris-catalog-api.md}`
- `site/content/in-dev/unreleased/{polaris-management-service.md => polaris-api-specs/polaris-management-api.md}`
- `site/content/in-dev/unreleased/polaris-spark-client.md`

---

### 159. `ab91f27` - Add doc notes about EclipseLink removal (#2605)

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

### 160. `333eb3b` - Avoid calling deprecated `TableMetadataParser.read(FileIO, InputFile)` method. (#2609)

**Date:** 2025-09-18 | **Author:** Dmitri Bourlatchkov | **PR:** [#2609](https://github.com/apache/polaris/pull/2609)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Deprecation

**WHAT CHANGED:** in Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`

---

### 161. `d8602f6` - CI/Caching: Fix Gradle cache retention (#2604)

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

### 162. `f9a2165` - Add content to contributing guidelines. (#2536)

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

### 163. `149c19e` - Add client build to Gradle (#2590)

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

### 164. `8f1614c` - Bump: Iceberg client in tests and documentation to 1.10 (#2588)

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

### 165. `b1fc3d2` - Update dependency com.google.guava:guava to v33.5.0-jre (#2601)

**Date:** 2025-09-18 | **Author:** Mend Renovate | **PR:** [#2601](https://github.com/apache/polaris/pull/2601)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 166. `d03c717` - Add Events for Iceberg REST APIs (#2480)

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

### 167. `9648582` - docs(README): Create Polaris-Core README (#2585)

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

### 168. `f3d53f0` - CI: Fix Gradle cache usages (#2593)

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

### 169. `5b3374a` - Add security report page on the website (#2538)

**Date:** 2025-09-17 | **Author:** JB Onofré | **PR:** [#2538](https://github.com/apache/polaris/pull/2538)
**Files:** 2 | **Changes:** +47/-0

**PURPOSE:** New feature; Security enhancement

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/community/security-report.md`
- `site/hugo.yaml`

---

### 170. `f237d94` - Revert "Update plugin com.gradle.develocity to v4.2 (#2583)" (#2594)

**Date:** 2025-09-17 | **Author:** Robert Stupp | **PR:** [#2583](https://github.com/apache/polaris/pull/2583)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `settings.gradle.kts`

---

### 171. `ca0cd9a` - docs(changelog): Update the Changelog with 1.0.1, 1.0.0, & 0.9.0 Releases (#2587)

**Date:** 2025-09-17 | **Author:** Adam Christian | **PR:** [#2587](https://github.com/apache/polaris/pull/2587)
**Files:** 1 | **Changes:** +40/-4

**PURPOSE:** Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `CHANGELOG.md`

---

### 172. `633f775` - Build: remove unnecessary openapigenerator plugin usages (#2592)

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

### 173. `8cc0fad` - Update plugin com.gradle.develocity to v4.2 (#2583)

**Date:** 2025-09-17 | **Author:** Mend Renovate | **PR:** [#2583](https://github.com/apache/polaris/pull/2583)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `settings.gradle.kts`

---

### 174. `d165f51` - Update plugin com.gradle.common-custom-user-data-gradle-plugin to v2.4.0 (#2582)

**Date:** 2025-09-17 | **Author:** Mend Renovate | **PR:** [#2582](https://github.com/apache/polaris/pull/2582)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `settings.gradle.kts`

---

### 175. `0172efc` - Fix license check for cryptography (#2591)

**Date:** 2025-09-17 | **Author:** Yong Zheng | **PR:** [#2591](https://github.com/apache/polaris/pull/2591)
**Files:** 1 | **Changes:** +1/-0

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 176. `6549551` - Python client: add license check (#2580)

**Date:** 2025-09-16 | **Author:** Yong Zheng | **PR:** [#2580](https://github.com/apache/polaris/pull/2580)
**Files:** 3 | **Changes:** +39/-0

**PURPOSE:** New feature

**WHAT CHANGED:** Modified Client Library in CI/CD, Python Client

**WHY NEEDED:** to improve client usability; to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation, Client API | Focused change | May affect API consumers

**Files modified:**
- `.github/workflows/python-client.yml`
- `Makefile`
- `client/python/pyproject.toml`

**Additional details from commit message:**
```
* Python client: add license check
* Python client: add license check
* test
* Enable license check
```

---

### 177. `eb28eda` - Bump: iceberg 1.10 (#2586)

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

### 178. `97c191a` - Site: add a blog for apache doris and polaris integration (#2571)

**Date:** 2025-09-16 | **Author:** Mingyu Chen (Rayner) | **PR:** [#2571](https://github.com/apache/polaris/pull/2571)
**Files:** 1 | **Changes:** +427/-0

**PURPOSE:** New feature

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/blog/2025/09/15/doris-polaris-integration.md`

---

### 179. `27ec215` - Publish build scans to develocity.apache.org for build insights (#2559)

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

### 180. `4885d77` - Avoid exceptions on ETag matches (#2578)

**Date:** 2025-09-16 | **Author:** Dmitri Bourlatchkov | **PR:** [#2578](https://github.com/apache/polaris/pull/2578)
**Files:** 1 | **Changes:** +10/-11

**PURPOSE:** Code modification

**WHAT CHANGED:** in Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogAdapter.java`

---

### 181. `6c4e1b8` - Update registry.access.redhat.com/ubi9/openjdk-21-runtime Docker tag to v1.23-6.1757607786 (#2577)

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

### 182. `e5e518c` - Site: Remove the dummy post (#2579)

**Date:** 2025-09-15 | **Author:** Yufei Gu | **PR:** [#2579](https://github.com/apache/polaris/pull/2579)
**Files:** 1 | **Changes:** +0/-24

**PURPOSE:** Code removal

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/blog/2024/10/01/dummy-post.md`

---

### 183. `4cda818` - Revert "fix password in README.md for ``./gradlew run` (#2572)" (#2576)

**Date:** 2025-09-15 | **Author:** Dmitri Bourlatchkov | **PR:** [#2572](https://github.com/apache/polaris/pull/2572)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `README.md`

---

### 184. `db3277a` - Site: Add the blog link in the website (#2575)

**Date:** 2025-09-15 | **Author:** Yufei Gu | **PR:** [#2575](https://github.com/apache/polaris/pull/2575)
**Files:** 1 | **Changes:** +5/-1

**PURPOSE:** New feature

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/hugo.yaml`

---

### 185. `08086b3` - fix password in README.md for ``./gradlew run` (#2572)

**Date:** 2025-09-15 | **Author:** Dmitri Bourlatchkov | **PR:** [#2572](https://github.com/apache/polaris/pull/2572)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `README.md`

---

### 186. `112d80b` - Avoid using jackson method for parsing YAML from any URL in RootCredentialsSet (#2543)

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

### 187. `e02bb71` - Remove DROP statements from SQL init scripts (#2565)

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

### 188. `23e5130` - Make column events.request_id nullable (#2566)

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

### 189. `20af2cd` - Pin virtualenv version to fix python client installation issue (#2569)

**Date:** 2025-09-15 | **Author:** Honah (Jonas) J. | **PR:** [#2569](https://github.com/apache/polaris/pull/2569)
**Files:** 2 | **Changes:** +5/-2

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified Client Library in CI/CD, Python Client

**WHY NEEDED:** to improve client usability; to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation, Client API | Focused change | May affect API consumers

**Files modified:**
- `.github/workflows/python-client.yml`
- `client/python/pyproject.toml`

**Additional details from commit message:**
```
Package operations: 1 install, 1 update, 0 removals
  - Updating virtualenv (20.32.0 -> 20.34.0)
  - Installing pyiceberg (0.10.0): Failed
  AttributeError
  'PythonInfo' object has no attribute 'tcl_lib'
  at ~/tmp/3/polaris/polaris-venv/lib/python3.13/site-packages/virtualenv/activation/via_template.py:50 in replacements
       46│             "__VIRTUAL_ENV__": str(creator.dest),
       47│             "__VIRTUAL_NAME__": creator.env_name,
       48│             "__BIN_NAME__": str(creator...
```

---

### 190. `a650937` - Fix H2 JDBC schema init script (#2564)

**Date:** 2025-09-15 | **Author:** Alexandre Dutra | **PR:** [#2564](https://github.com/apache/polaris/pull/2564)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified JDBC Persistence in Persistence with database schema changes

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Relational Databases | Focused change

**Files modified:**
- `persistence/relational-jdbc/src/main/resources/h2/schema-v3.sql`

---

### 191. `da05019` - Update dependency io.smallrye.common:smallrye-common-annotation to v2.13.9 (#2567)

**Date:** 2025-09-15 | **Author:** Mend Renovate | **PR:** [#2567](https://github.com/apache/polaris/pull/2567)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 192. `3b303f4` - Python client: remove tox (#2562)

**Date:** 2025-09-15 | **Author:** Yong Zheng | **PR:** [#2562](https://github.com/apache/polaris/pull/2562)
**Files:** 1 | **Changes:** +0/-1

**PURPOSE:** Code removal

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 193. `97b6fe8` - Support sdist client distribution (#2557)

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

### 194. `a2f29cb` - Update dependency software.amazon.awssdk:bom to v2.33.9 (#2561)

**Date:** 2025-09-15 | **Author:** Mend Renovate | **PR:** [#2561](https://github.com/apache/polaris/pull/2561)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 195. `d556ffc` - Update quay.io/keycloak/keycloak Docker tag to v26.3.4 (#2553)

**Date:** 2025-09-15 | **Author:** Mend Renovate | **PR:** [#2553](https://github.com/apache/polaris/pull/2553)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Documentation update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `getting-started/keycloak/docker-compose.yml`

---

### 196. `4034b28` - Testing: Let runtime-service tests use Quarkus via `enforcedPlatform()` (#2545)

**Date:** 2025-09-15 | **Author:** Robert Stupp | **PR:** [#2545](https://github.com/apache/polaris/pull/2545)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Test improvement

**WHAT CHANGED:** in Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/build.gradle.kts`

---

### 197. `b3366e5` - Minor fix for README.md (#2558)

**Date:** 2025-09-13 | **Author:** Yong Zheng | **PR:** [#2558](https://github.com/apache/polaris/pull/2558)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `README.md`

---

### 198. `de94c57` - Update dependency pyiceberg to v0.10.0 (#2549)

**Date:** 2025-09-13 | **Author:** Mend Renovate | **PR:** [#2549](https://github.com/apache/polaris/pull/2549)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 199. `9832549` - Update dependency mypy to >=1.18, <=1.18.1 (#2547)

**Date:** 2025-09-13 | **Author:** Mend Renovate | **PR:** [#2547](https://github.com/apache/polaris/pull/2547)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 200. `d69d7ef` - Reduce getOrCreateMetaStoreManager callers (#2532)

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

### 201. `be4175c` - Inject PolarisAdminService into PolarisServiceImpl (#2533)

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

### 202. `8ad8f74` - Add subtype-check to PolarisEntity subclass ctors (#2492)

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

### 203. `adaae48` - Fix deprecation warnings in GcpCredentialsStorageIntegrationTest (#2544)

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

### 204. `81035e0` - Update Quarkus Platform and Group to v3.26.3 (#2461)

**Date:** 2025-09-11 | **Author:** Mend Renovate | **PR:** [#2461](https://github.com/apache/polaris/pull/2461)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 205. `c2e932b` - Fix arg-matching in ExceptionMapperTest.testFullExceptionIsLogged() (#2531)

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

### 206. `9b3d7d2` - Use same content on website home page and README.md (#2534)

**Date:** 2025-09-10 | **Author:** JB Onofré | **PR:** [#2534](https://github.com/apache/polaris/pull/2534)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `README.md`

---

### 207. `cef59e6` - fix deprecated ObjectMapper calls (#2542)

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

### 208. `d2bc708` - Update dependency com.google.cloud:google-cloud-storage-bom to v2.57.0 (#2529)

**Date:** 2025-09-10 | **Author:** Mend Renovate | **PR:** [#2529](https://github.com/apache/polaris/pull/2529)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 209. `026fabe` - NoSQL: Move varint implementation into the "right" directory (#2528)

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

### 210. `5cc1ecc` - Update dependency io.projectreactor.netty:reactor-netty-http to v1.2.10 (#2526)

**Date:** 2025-09-09 | **Author:** Mend Renovate | **PR:** [#2526](https://github.com/apache/polaris/pull/2526)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/build.gradle.kts`

---

### 211. `1d15128` - Build: Make META-INF/MANIFEST.MF content reproducible (#2421)

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

### 212. `3fa1df3` - Update hadoop to v3.4.2 (#2466)

**Date:** 2025-09-09 | **Author:** Mend Renovate | **PR:** [#2466](https://github.com/apache/polaris/pull/2466)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 213. `ce90968` - Update dependency com.fasterxml.jackson:jackson-bom to v2.20.0 (#2470)

**Date:** 2025-09-09 | **Author:** Mend Renovate | **PR:** [#2470](https://github.com/apache/polaris/pull/2470)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 214. `87490a5` - Update gradle/actions digest to ed40850 (#2524)

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

### 215. `a1d1176` - Core: Clarify the purpose of REPLACE_NEW_LOCATION_PREFIX_WITH_CATALOG_DEFAULT_KEY (#2509)

**Date:** 2025-09-08 | **Author:** Yufei Gu | **PR:** [#2509](https://github.com/apache/polaris/pull/2509)
**Files:** 1 | **Changes:** +12/-5

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified Entity Management in Core

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Data Model | Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/entity/CatalogEntity.java`

---

### 216. `d1a329f` - Add support for poetry build with wheel (#2425)

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

### 217. `c149316` - Fix deprecation warnings around RandomStringUtils (#2507)

**Date:** 2025-09-08 | **Author:** Christopher Lambert | **PR:** [#2507](https://github.com/apache/polaris/pull/2507)
**Files:** 1 | **Changes:** +14/-10

**PURPOSE:** Bug fix; Deprecation

**WHAT CHANGED:** including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisManagementServiceIntegrationTest.java`

**Additional details from commit message:**
```
https://github.com/apache/commons-lang/commit/69cb996265ba603e0be5b1c98097775f2467a6c2
```

---

### 218. `ee7f370` - Allow `PolarisServerManager` implementations to define custom client headers (#2510)

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

### 219. `d11b9e4` - Allow overriding createCatalog calls in integrations tests (#2516)

**Date:** 2025-09-08 | **Author:** Dmitri Bourlatchkov | **PR:** [#2516](https://github.com/apache/polaris/pull/2516)
**Files:** 3 | **Changes:** +18/-2

**PURPOSE:** Test improvement

**WHAT CHANGED:** including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/ManagementApi.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisRestCatalogIntegrationBase.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisRestCatalogViewIntegrationBase.java`

---

### 220. `5f17ff7` - Update dependency org.testcontainers:localstack to v1.21.3 (#2497)

**Date:** 2025-09-08 | **Author:** Mend Renovate | **PR:** [#2497](https://github.com/apache/polaris/pull/2497)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update; Test improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 221. `8ad0d15` - Update dependency io.netty:netty-codec-http2 to v4.2.6.Final (#2520)

**Date:** 2025-09-08 | **Author:** Mend Renovate | **PR:** [#2520](https://github.com/apache/polaris/pull/2520)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/build.gradle.kts`

---

### 222. `c6176dc` - Update dependency io.micrometer:micrometer-bom to v1.15.4 (#2519)

**Date:** 2025-09-08 | **Author:** Mend Renovate | **PR:** [#2519](https://github.com/apache/polaris/pull/2519)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 223. `15d5c7c` - Update dependency io.opentelemetry:opentelemetry-bom to v1.54.0 (#2515)

**Date:** 2025-09-08 | **Author:** Mend Renovate | **PR:** [#2515](https://github.com/apache/polaris/pull/2515)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 224. `7a2be2f` - Update dependency com.nimbusds:nimbus-jose-jwt to v10.5 (#2514)

**Date:** 2025-09-08 | **Author:** Mend Renovate | **PR:** [#2514](https://github.com/apache/polaris/pull/2514)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/build.gradle.kts`

---

### 225. `090f088` - Update dependency software.amazon.awssdk:bom to v2.33.4 (#2517)

**Date:** 2025-09-08 | **Author:** Mend Renovate | **PR:** [#2517](https://github.com/apache/polaris/pull/2517)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 226. `37a9221` - Remove PolarisTestMetaStoreManager.jsonNode helper (#2513)

**Date:** 2025-09-06 | **Author:** Christopher Lambert | **PR:** [#2513](https://github.com/apache/polaris/pull/2513)
**Files:** 1 | **Changes:** +8/-23

**PURPOSE:** Code removal; Test improvement

**WHAT CHANGED:** in Persistence including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/src/testFixtures/java/org/apache/polaris/core/persistence/PolarisTestMetaStoreManager.java`

---

### 227. `b8d210a` - Add Events for Policy Service APIs (#2479)

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

### 228. `b174b9d` - Remove unused config from SparkSessionBuilder (#2512)

**Date:** 2025-09-05 | **Author:** Dmitri Bourlatchkov | **PR:** [#2512](https://github.com/apache/polaris/pull/2512)
**Files:** 1 | **Changes:** +3/-7

**PURPOSE:** Code removal; CI/CD improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `integration-tests/src/main/java/org/apache/polaris/service/it/ext/SparkSessionBuilder.java`

---

### 229. `1361bd4` - fix for IcebergAllowedLocationTest (#2511)

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

### 230. `453e9fb` - Disable custom namespace locations (#2422)

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

### 231. `d7ec8f2` - Add Events for Generic Table APIs (#2481)

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

### 232. `923a2e1` - Remove readInternalProperties helpers (#2506)

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

### 233. `90c981a` - CLI: Remove SCRIPT_DIR and default config location to user home (#2448)

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

### 234. `cbdc12b` - Remove commons-codec dependency (#2474)

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

### 235. `a8431dc` - Update registry.access.redhat.com/ubi9/openjdk-21-runtime Docker tag to v1.23-6.1756793420 (#2504)

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

### 236. `b53bc98` - Update dependency com.azure:azure-sdk-bom to v1.2.38 (#2503)

**Date:** 2025-09-04 | **Author:** Mend Renovate | **PR:** [#2503](https://github.com/apache/polaris/pull/2503)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 237. `d11a805` - Update the Release Guide about the Helm Chart package (#2179)

**Date:** 2025-09-04 | **Author:** JB Onofré | **PR:** [#2179](https://github.com/apache/polaris/pull/2179)
**Files:** 1 | **Changes:** +70/-15

**PURPOSE:** Bug fix

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/release-guide.md`

**Additional details from commit message:**
```
* Update release-guide.md
Co-authored-by: Pierre Laporte <pierre@pingtimeout.fr>
* Add missing commit message
* Whitespace
* Use Helm GPG plugin to sign the Helm chart
* Fix directories during Helm chart copy to SVN
* Add Helm index to SVN
* Use long name for svn checkout
* Ensure the Helm index is updated after the chart is moved to SVN dist release
* Do not publish any Docker image before the vote succeeds
* Typos
* Revert "Do not publish any Docker image before the vote succeeds"
This reve...
```

---

### 238. `d9ea304` - Update actions/setup-python action to v6 (#2502)

**Date:** 2025-09-04 | **Author:** Mend Renovate | **PR:** [#2502](https://github.com/apache/polaris/pull/2502)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/python-client.yml`

---

### 239. `82086d9` - Update dependency io.netty:netty-codec-http2 to v4.2.5.Final (#2495)

**Date:** 2025-09-04 | **Author:** Mend Renovate | **PR:** [#2495](https://github.com/apache/polaris/pull/2495)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/build.gradle.kts`

---

### 240. `ace32af` - Update docker.io/jaegertracing/all-in-one Docker tag to v1.73.0 (#2500)

**Date:** 2025-09-04 | **Author:** Mend Renovate | **PR:** [#2500](https://github.com/apache/polaris/pull/2500)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Documentation update; CI/CD improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `getting-started/telemetry/docker-compose.yml`

---

### 241. `40283b2` - Service: Add location tests for views (#2496)

**Date:** 2025-09-03 | **Author:** Yufei Gu | **PR:** [#2496](https://github.com/apache/polaris/pull/2496)
**Files:** 1 | **Changes:** +171/-0

**PURPOSE:** New feature; Test improvement

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/iceberg/IcebergAllowedLocationTest.java`

---

### 242. `32b2c27` - Core: Prevent AIOOBE for negative policy codes in PredefinedPolicyType (#2486)

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

### 243. `84c9473` - Update actions/stale digest to 3a9db7e (#2499)

**Date:** 2025-09-03 | **Author:** Mend Renovate | **PR:** [#2499](https://github.com/apache/polaris/pull/2499)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/stale.yml`

---

### 244. `62ca26c` - Fix failing CI (#2498)

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

### 245. `20753ed` - AWS CloudWatch Event Sink Implementation (#1965)

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

### 246. `c3f5001` - Add Polaris Events to Persistence (#1844)

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

### 247. `f6bcbd2` - perf(refactor): optimizing JdbcBasePersistenceImpl.listEntities (#2465)

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

### 248. `c783de9` - feat(idgen): Start Implementation of NoSQL with the ID Generation Framework (#2131)

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

### 249. `6137e42` - Core: Prevent AIOOBE for negative codes in PolarisEntityType, PolarisPrivilege, ReturnStatus (#2490)

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

### 250. `f41d5bf` - Fix CI (#2489)

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

### 251. `ac31963` - Add type-check to PolarisEntity subclass ctors (#2302)

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

### 252. `327697c` - Feature: Expose resetCredentials via a new reset api to allow root user to reset credentials for an existing principal with custom values  (#2197)

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

### 253. `6b4f8e1` - Remove PolarisCallContext.getDiagServices (#2415)

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

### 254. `d841431` - Update dependency software.amazon.awssdk:bom to v2.33.0 (#2483)

**Date:** 2025-09-01 | **Author:** Mend Renovate | **PR:** [#2483](https://github.com/apache/polaris/pull/2483)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 255. `9ca8f92` - Add Community Sync Meeting 20250828 (#2477)

**Date:** 2025-08-31 | **Author:** JB Onofré | **PR:** [#2477](https://github.com/apache/polaris/pull/2477)
**Files:** 1 | **Changes:** +4/-3

**PURPOSE:** New feature

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/community/meetings/_index.adoc`

---

### 256. `4ed1d41` - Service: Always validate allowed locations from Storage Config (#2473)

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

### 257. `17a359b` - Service: Remove hadoop-common from polaris-runtime-service (#2462)

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

### 258. `14d4496` - fix(deps): update dependency com.gradleup.shadow:shadow-gradle-plugin to v9.1.0 (#2476)

**Date:** 2025-08-29 | **Author:** Mend Renovate | **PR:** [#2476](https://github.com/apache/polaris/pull/2476)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/baselibs.versions.toml`

---

### 259. `b1b5591` - fix(deps): update dependency com.adobe.testing:s3mock-testcontainers to v4.8.0 (#2475)

**Date:** 2025-08-29 | **Author:** Mend Renovate | **PR:** [#2475](https://github.com/apache/polaris/pull/2475)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update; Test improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 260. `680f974` - Update versions in runtime LICENSE and NOTICE (#2468)

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

### 261. `3bc92b4` - Service: Move tests to the right package (#2469)

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

### 262. `f8ad77a` - Prefer java.util.Base64 over commons-codec (#2463)

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

### 263. `b33c321` - Add Delegator to all API Implementations (#2434)

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

### 264. `de79f18` - fix(deps): update dependency io.opentelemetry.semconv:opentelemetry-semconv to v1.37.0 (#2458)

**Date:** 2025-08-28 | **Author:** Mend Renovate | **PR:** [#2458](https://github.com/apache/polaris/pull/2458)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 265. `9e6d929` - add refresh credentials property to loadTableResult (#2341)

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

### 266. `95ebdd3` - Remove commons-lang3 dependency (#2456)

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

### 267. `00ca832` - Built: improve reproducible archive files (#2432)

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

### 268. `b6e247d` - Build: Make jandex dependency used for index generation managed (#2431)

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

### 269. `e3dc36a` - fix(deps): update dependency gradle.plugin.org.jetbrains.gradle.plugin.idea-ext:gradle-idea-ext to v1.3 (#2428)

**Date:** 2025-08-27 | **Author:** Mend Renovate | **PR:** [#2428](https://github.com/apache/polaris/pull/2428)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/baselibs.versions.toml`

---

### 270. `e25c5b1` - fix(deps): update dependency com.google.cloud:google-cloud-storage-bom to v2.56.0 (#2447)

**Date:** 2025-08-27 | **Author:** Mend Renovate | **PR:** [#2447](https://github.com/apache/polaris/pull/2447)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 271. `6631c51` - fix(deps): update dependency io.opentelemetry.semconv:opentelemetry-semconv to v1.36.0 (#2454)

**Date:** 2025-08-27 | **Author:** Mend Renovate | **PR:** [#2454](https://github.com/apache/polaris/pull/2454)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 272. `3f1dfb3` - Add user principal tag in metrics (#2445)

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

### 273. `f0ee460` - Client: fix openapi verbose output, remove doc generate, and skip test generations (#2439)

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

### 274. `76a5073` - Deprecate ActiveRolesProvider for removal (#2404)

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

### 275. `92ead05` - Add feature flag to disallow custom S3 endpoints (#2442)

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

### 276. `ad450d4` - Add PolarisDiagnostics field to BaseMetaStoreManager (#2381)

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

### 277. `eceaadd` - Optimize PolicyCatalog.listPolicies (#2370)

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

### 278. `d326962` - fix(deps): update dependency software.amazon.awssdk:bom to v2.32.29 (#2443)

**Date:** 2025-08-25 | **Author:** Mend Renovate | **PR:** [#2443](https://github.com/apache/polaris/pull/2443)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 279. `fb61a11` - Doc fix: Access control page update (#2424)

**Date:** 2025-08-24 | **Author:** Yong Zheng | **PR:** [#2424](https://github.com/apache/polaris/pull/2424)
**Files:** 1 | **Changes:** +14/-16

**PURPOSE:** Bug fix; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/access-control.md`

---

### 280. `05db610` - Fix NPE in CreateCatalog (#2435)

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

### 281. `a29f800` - Fix TableIdentifier in TaskFileIOSupplier (#2304)

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

### 282. `4b18a8d` - 2334 (#2427)

**Date:** 2025-08-22 | **Author:** Yong Zheng | **PR:** [#2427](https://github.com/apache/polaris/pull/2427)
**Files:** 1 | **Changes:** +2/-2

**PURPOSE:** Code modification

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/configuring-polaris-for-production.md`

---

### 283. `bc5d0c4` - chore(deps): update registry.access.redhat.com/ubi9/openjdk-21-runtime docker tag to v1.23-6.1755674729 (#2416)

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

### 284. `f7487f6` - Fix merge conflict in CatalogFederationIntegrationTest (#2420)

**Date:** 2025-08-21 | **Author:** Eric Maynard | **PR:** [#2420](https://github.com/apache/polaris/pull/2420)
**Files:** 1 | **Changes:** +3/-3

**PURPOSE:** Bug fix; Test improvement

**WHAT CHANGED:** including test updates

**WHY NEEDED:** to support catalog federation features

**IMPACT:** Focused change

**Files modified:**
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/CatalogFederationIntegrationTest.java`

---

### 285. `c2209cf` - Integration tests for Catalog Federation (#2344)

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

### 286. `82cd416` - fix(deps): update quarkus platform and group to v3.25.4 (#2279)

**Date:** 2025-08-21 | **Author:** Mend Renovate | **PR:** [#2279](https://github.com/apache/polaris/pull/2279)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 287. `2047dc2` - Update changelog prior to 1.1.0 release (#2406)

**Date:** 2025-08-21 | **Author:** Pierre Laporte | **PR:** [#2406](https://github.com/apache/polaris/pull/2406)
**Files:** 1 | **Changes:** +28/-2

**PURPOSE:** Code modification

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `CHANGELOG.md`

---

### 288. `7b68202` - chore(test): Restore PolarisAccessManager (#2413)

**Date:** 2025-08-21 | **Author:** Dmitri Bourlatchkov | **PR:** [#2413](https://github.com/apache/polaris/pull/2413)
**Files:** 4 | **Changes:** +76/-2

**PURPOSE:** Test improvement

**WHAT CHANGED:** Modified 4 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/IcebergTokenAccessManager.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/env/PolarisClient.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/ext/PolarisAccessManager.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/ext/PolarisServerManager.java`

**Additional details from commit message:**
```
of `IcebergTokenAccessManager`) which was added as an extension
point for running Polaris tests in downstream build environments
under #789, but was mistakenly removed in #2343
```

---

### 289. `d30232e` - chore(deps): update actions/setup-java action to v5 (#2414)

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

### 290. `a8161a7` - This change fixes: (#2395)

**Date:** 2025-08-21 | **Author:** JB Onofré | **PR:** [#2395](https://github.com/apache/polaris/pull/2395)
**Files:** 1 | **Changes:** +20/-16

**PURPOSE:** Bug fix

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/release-guide.md`

**Additional details from commit message:**
```
* publish Docker images only when the vote passed (we are not suppose to publish any public artifacts before the vote is completed)
* update the vote email accordingly
* remove blog post link in the release announcement email to let this to the discretion of the release manager
```

---

### 291. `7a5c6d8` - Add 1.0.1-incubating release blog post (#2403)

**Date:** 2025-08-21 | **Author:** JB Onofré | **PR:** [#2403](https://github.com/apache/polaris/pull/2403)
**Files:** 1 | **Changes:** +41/-0

**PURPOSE:** New feature

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/blog/2025/08/20/apache-polaris-1.0.1-incubating.md`

---

### 292. `d417fda` - chore: fix Page javadoc (#2412)

**Date:** 2025-08-20 | **Author:** Dmitri Bourlatchkov | **PR:** [#2412](https://github.com/apache/polaris/pull/2412)
**Files:** 1 | **Changes:** +3/-2

**PURPOSE:** Bug fix; Documentation update

**WHAT CHANGED:** Modified Persistence Layer in Core, Persistence

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage | Focused change | Requires careful deployment

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/pagination/Page.java`

---

### 293. `b49cbc5` - Add PolarisMetaStoreManager.loadEntities (#2290)

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

### 294. `a0a2b87` - feat: enforce LIST_PAGINATION_ENABLED (#2401)

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

### 295. `c97b150` - Add feature config to allow dropping views without purging (#2369)

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

### 296. `a75229c` - Add missing region to MinIO getting-started example (#2411)

**Date:** 2025-08-20 | **Author:** Alexandre Dutra | **PR:** [#2411](https://github.com/apache/polaris/pull/2411)
**Files:** 1 | **Changes:** +5/-1

**PURPOSE:** New feature; CI/CD improvement

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `getting-started/minio/README.md`

**Additional details from commit message:**
```
```
spark-sql ()> create table ns.t1 as select 'abc';
25/08/20 16:25:06 ERROR Executor: Exception in task 0.0 in stage 0.0 (TID 0)
software.amazon.awssdk.core.exception.SdkClientException: Unable to load region from any of the providers in the chain software.amazon.awssdk.regions.providers.DefaultAwsRegionProviderChain@47578c86: [software.amazon.awssdk.regions.providers.SystemSettingsRegionProvider@1656f847: Unable to load region from system settings. Region must be specified either via envir...
```

---

### 297. `9c455ed` - Python client auto generate (#2192)

**Date:** 2025-08-20 | **Author:** Yong Zheng | **PR:** [#2192](https://github.com/apache/polaris/pull/2192)
**Files:** 14 | **Changes:** +289/-253

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified Client Library in CI/CD, Documentation, OpenAPI Specs, Python Client

**WHY NEEDED:** to improve client usability; to improve build and deployment processes

**IMPACT:** Affects: API Contracts, Build/Test Automation, Client API, User Documentation | Medium-scale change | May affect API consumers

**Files modified:**
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

**Additional details from commit message:**
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

---

### 298. `c937a30` - chore: Suppress javac deprecation warnings in SparkCatalog (#2394)

**Date:** 2025-08-20 | **Author:** Dmitri Bourlatchkov | **PR:** [#2394](https://github.com/apache/polaris/pull/2394)
**Files:** 1 | **Changes:** +2/-0

**PURPOSE:** Deprecation

**WHAT CHANGED:** in Spark Plugin

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Spark Integration | Focused change

**Files modified:**
- `plugins/spark/v3.5/spark/src/main/java/org/apache/polaris/spark/SparkCatalog.java`

**Additional details from commit message:**
```
methods from Spark's TableCatalog.
This PR adds suppression annotations to allow for clean
compilation given that the deprecated method calls and
overrides are clearly expected in this case.
```

---

### 299. `c3aa720` - Mention Helm chart support for PodDisruptionBudget in CHANGELOG.md (#2408)

**Date:** 2025-08-20 | **Author:** Alexandre Dutra | **PR:** [#2408](https://github.com/apache/polaris/pull/2408)
**Files:** 1 | **Changes:** +3/-0

**PURPOSE:** Code modification

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `CHANGELOG.md`

---

### 300. `b7fc318` - chore(deps): update quay.io/keycloak/keycloak docker tag to v26.3.3 (#2407)

**Date:** 2025-08-20 | **Author:** Mend Renovate | **PR:** [#2407](https://github.com/apache/polaris/pull/2407)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Documentation update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `getting-started/keycloak/docker-compose.yml`

---

### 301. `c5fd368` - feat: Add Pod Disruption Budget support to Helm chart (#2380)

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

### 302. `fcd4777` - Add PolarisDiagnostics field to AbstractTransactionalPersistence (#2372)

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

### 303. `a0f454e` - Add 1.0.1 release to the website (#2400)

**Date:** 2025-08-20 | **Author:** JB Onofré | **PR:** [#2400](https://github.com/apache/polaris/pull/2400)
**Files:** 2 | **Changes:** +20/-2

**PURPOSE:** New feature

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/downloads/_index.md`
- `site/hugo.yaml`

---

### 304. `4ae3959` - chore(deps): update azure/setup-helm action to v4.3.1 (#2402)

**Date:** 2025-08-20 | **Author:** Mend Renovate | **PR:** [#2402](https://github.com/apache/polaris/pull/2402)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/helm.yml`

---

### 305. `8d4cacb` - fix: minor corrections of documentation (#2397)

**Date:** 2025-08-19 | **Author:** olsoloviov | **PR:** [#2397](https://github.com/apache/polaris/pull/2397)
**Files:** 2 | **Changes:** +2/-2

**PURPOSE:** Bug fix; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/entities.md`
- `site/content/in-dev/unreleased/getting-started/using-polaris.md`

**Additional details from commit message:**
```
- removed single quotes from credential parameter in the cmdline example for connecting a local spark-sql: env variables need to be resolved in cmdline, they will not be resolved by spark-sql itself.
```

---

### 306. `a07ea01` - Remove BaseMetaStoreManager.serializeProperties (#2374)

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

### 307. `12ab618` - Minor refactor of integration test classes (#2384)

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

### 308. `1fe6205` - Nit: add methods isExternal and isStaticFacade to CatalogEntity (#2386)

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

### 309. `42245cb` - Nit: remove transitive dependencies from runtime/server/build.gradle.kts (#2385)

**Date:** 2025-08-19 | **Author:** Alexandre Dutra | **PR:** [#2385](https://github.com/apache/polaris/pull/2385)
**Files:** 1 | **Changes:** +0/-3

**PURPOSE:** Code removal; CI/CD improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/server/build.gradle.kts`

---

### 310. `76c5d54` - Nit: extract getResolvedCatalogEntity method in IcebergCatalogHandler (#2387)

**Date:** 2025-08-19 | **Author:** Alexandre Dutra | **PR:** [#2387](https://github.com/apache/polaris/pull/2387)
**Files:** 1 | **Changes:** +22/-83

**PURPOSE:** Code modification

**WHAT CHANGED:** in Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalogHandler.java`

---

### 311. `850792c` - chore(deps): bump s3mock from 3.11.0 to 4.7.0 (#2375)

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

### 312. `42225b3` - fix(deps): update dependency io.prometheus:prometheus-metrics-exporter-servlet-jakarta to v1.4.1 (#2377)

**Date:** 2025-08-19 | **Author:** Mend Renovate | **PR:** [#2377](https://github.com/apache/polaris/pull/2377)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 313. `358c790` - Python client: make S3 role-ARN optional and add missing endpoint-internal property (#2339)

**Date:** 2025-08-19 | **Author:** Robert Stupp | **PR:** [#2339](https://github.com/apache/polaris/pull/2339)
**Files:** 4 | **Changes:** +17/-12

**PURPOSE:** New feature

**WHAT CHANGED:** Modified CLI in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Command Line Tools | Focused change

**Files modified:**
- `client/python/cli/command/__init__.py`
- `client/python/cli/command/catalogs.py`
- `client/python/cli/constants.py`
- `client/python/cli/options/option_tree.py`

---

### 314. `e1b9833` - Reduce getRealmConfig calls (#2337)

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

### 315. `a186141` - Update community meeting dates (#2382)

**Date:** 2025-08-19 | **Author:** JB Onofré | **PR:** [#2382](https://github.com/apache/polaris/pull/2382)
**Files:** 1 | **Changes:** +1/-4

**PURPOSE:** Code modification

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/community/meetings/_index.adoc`

---

### 316. `83d09cc` - Modularize generic table federation (#2379)

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

### 317. `f647034` - Rat-ignore user-settings for hugo-run-in-docker (#2376)

**Date:** 2025-08-18 | **Author:** Robert Stupp | **PR:** [#2376](https://github.com/apache/polaris/pull/2376)
**Files:** 1 | **Changes:** +1/-0

**PURPOSE:** Documentation update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `build.gradle.kts`

---

### 318. `dc23a1c` - Add PolarisDiagnostics field to TransactionWorkspaceMetaStoreManager (#2359)

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

### 319. `7f50667` - Support HMS Federation (#2355)

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

### 320. `22e0c1c` - Add PolarisDiagnostics field to TransactionalMetaStoreManagerImpl (#2361)

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

### 321. `96f1459` - Refactor Authenticator and PolarisPrincipal (#2307)

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

### 322. `5a7686b` - Rat-check: exclude venv, cleanup excludes, include .svg (#2363)

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

### 323. `73a06f5` - fix(deps): update dependency software.amazon.awssdk:bom to v2.32.24 (#2371)

**Date:** 2025-08-18 | **Author:** Mend Renovate | **PR:** [#2371](https://github.com/apache/polaris/pull/2371)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 324. `e45be14` - SigV4 Auth Support for Catalog Federation - Part 2: Connection Config Persistence (#2190)

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

### 325. `7af85be` - Use asMap property helpers (#2347)

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

### 326. `f7745c2` - IntelliJ: fix project icon in IJ project list (#2366)

**Date:** 2025-08-15 | **Author:** Robert Stupp | **PR:** [#2366](https://github.com/apache/polaris/pull/2366)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `build.gradle.kts`

---

### 327. `596239c` - feat(docs): Add Getting Stated guide for MinIO (#2227)

**Date:** 2025-08-15 | **Author:** Dmitri Bourlatchkov | **PR:** [#2227](https://github.com/apache/polaris/pull/2227)
**Files:** 5 | **Changes:** +367/-18

**PURPOSE:** New feature; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `getting-started/assets/polaris/create-catalog.sh`
- `getting-started/assets/polaris/obtain-token.sh`
- `getting-started/minio/README.md`
- `getting-started/minio/docker-compose.yml`
- `site/content/in-dev/unreleased/getting-started/minio.md`

**Additional details from commit message:**
```
A simple page of step-by-step instructions for setting
up a local environment with Polaris, MinIO and Spark.
Closes #1530
```

---

### 328. `260438f` - Fix soft-merge conflict on `main` (#2364)

**Date:** 2025-08-15 | **Author:** Robert Stupp | **PR:** [#2364](https://github.com/apache/polaris/pull/2364)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix

**WHAT CHANGED:** in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/test/java/org/apache/polaris/service/catalog/AbstractPolicyCatalogTest.java`

---

### 329. `c9efc6c` - fix(deps): update mockito monorepo to v5.19.0 (#2360)

**Date:** 2025-08-15 | **Author:** Mend Renovate | **PR:** [#2360](https://github.com/apache/polaris/pull/2360)
**Files:** 1 | **Changes:** +2/-2

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 330. `88f58fc` - Make PolarisAuthorizer RequestScoped (#2340)

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

### 331. `6e036e0` - Fix REST responses for failed Admin operations (#2291)

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

### 332. `c4fc848` - Add integration tests with Keycloak (#2343)

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

### 333. `e041a01` - chore(deps): update postgres docker tag to v17.6 (#2354)

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

### 334. `3963fd8` - fix(deps): update dependency com.gradleup.shadow:shadow-gradle-plugin to v9.0.2 (#2358)

**Date:** 2025-08-15 | **Author:** Mend Renovate | **PR:** [#2358](https://github.com/apache/polaris/pull/2358)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/baselibs.versions.toml`

---

### 335. `61fb1fe` - chore(deps): update registry.access.redhat.com/ubi9/openjdk-21-runtime docker tag to v1.23-6 (#2353)

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

### 336. `c165249` - Replace CallContext with RealmConfig in CatalogEntity (#2336)

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

### 337. `fac650a` - Replace CallContext with RealmConfig in enforceFeatureEnabledOrThrow (#2348)

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

### 338. `b2b1453` - Modularize federation (Option 2) (#2332)

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

### 339. `22e4c68` - Add a regression test for Catalog Federation (#2286)

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

### 340. `efc68e8` - Use PolarisTaskConstants (#2346)

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

### 341. `a8ca16b` - fix(deps): update dependency com.nimbusds:nimbus-jose-jwt to v10.4.2 (#2350)

**Date:** 2025-08-14 | **Author:** Mend Renovate | **PR:** [#2350](https://github.com/apache/polaris/pull/2350)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/build.gradle.kts`

---

### 342. `b1f7eed` - Fix Keycloak getting-started example (#2349)

**Date:** 2025-08-14 | **Author:** Alexandre Dutra | **PR:** [#2349](https://github.com/apache/polaris/pull/2349)
**Files:** 1 | **Changes:** +10/-7

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `getting-started/keycloak/docker-compose.yml`

---

### 343. `4c23eb7` - fix(deps): update dependency io.netty:netty-codec-http2 to v4.2.4.final (#2342)

**Date:** 2025-08-14 | **Author:** Mend Renovate | **PR:** [#2342](https://github.com/apache/polaris/pull/2342)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/build.gradle.kts`

---

### 344. `74d1b4e` - fix(docs): fix entity doc API links. (#2316)

**Date:** 2025-08-14 | **Author:** Yujiang Zhong | **PR:** [#2316](https://github.com/apache/polaris/pull/2316)
**Files:** 1 | **Changes:** +8/-12

**PURPOSE:** Bug fix; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/entities.md`

---

### 345. `78d5723` - fix(docs): fix some broken url. (#2335)

**Date:** 2025-08-14 | **Author:** Yujiang Zhong | **PR:** [#2335](https://github.com/apache/polaris/pull/2335)
**Files:** 1 | **Changes:** +2/-2

**PURPOSE:** Bug fix; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/metastores.md`

---

### 346. `ad959fb` - Add PyIceberg example (#2315)

**Date:** 2025-08-13 | **Author:** Frederic Khayat | **PR:** [#2315](https://github.com/apache/polaris/pull/2315)
**Files:** 1 | **Changes:** +45/-0

**PURPOSE:** New feature

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/getting-started/using-polaris.md`

**Additional details from commit message:**
```
This PR clears that up by providing an example in the getting-started section of the documentation.
```

---

### 347. `ee04df4` - Add entitySubType param to BasePersistence.listEntities (#2317)

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

### 348. `cdb58e5` - Remove CallContext from IcebergPropertiesValidation (#2338)

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

### 349. `027d80b` - Remove redundant locations when constructing access policies (#2149)

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

### 350. `1277eff` - Remove spotbugs-annotations (#2320)

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

### 351. `d7d8990` - Make S3 `roleARN` optional (#2329)

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

### 352. `cc03796` - Let CI archive html test reports (#2327)

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

### 353. `a0f3f0d` - JWTBroker: move error message (#2330)

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

### 354. `6647374` - fix(deps): update immutables to v2.11.3 (#2333)

**Date:** 2025-08-13 | **Author:** Mend Renovate | **PR:** [#2333](https://github.com/apache/polaris/pull/2333)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 355. `6ed5e9d` - chore(deps): update quay.io/keycloak/keycloak docker tag to v26.3.2 (#2331)

**Date:** 2025-08-13 | **Author:** Mend Renovate | **PR:** [#2331](https://github.com/apache/polaris/pull/2331)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Documentation update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `getting-started/keycloak/docker-compose.yml`

---

### 356. `8996132` - Add getting-started example with external authentication (#2244)

**Date:** 2025-08-12 | **Author:** Alexandre Dutra | **PR:** [#2244](https://github.com/apache/polaris/pull/2244)
**Files:** 7 | **Changes:** +2286/-9

**PURPOSE:** New feature; Security enhancement

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `LICENSE`
- `getting-started/README.md`
- `getting-started/assets/keycloak/iceberg-realm.json`
- `getting-started/assets/polaris/create-catalog.sh`
- `getting-started/keycloak/README.md`
- `getting-started/keycloak/docker-compose.yml`
- `getting-started/telemetry/README.md`

---

### 357. `d7f15a2` - fix(deps): update dependency io.projectreactor.netty:reactor-netty-http to v1.2.9 (#2326)

**Date:** 2025-08-12 | **Author:** Mend Renovate | **PR:** [#2326](https://github.com/apache/polaris/pull/2326)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/build.gradle.kts`

---

### 358. `45e8e02` - fix(deps): update dependency io.micrometer:micrometer-bom to v1.15.3 (#2321)

**Date:** 2025-08-12 | **Author:** Mend Renovate | **PR:** [#2321](https://github.com/apache/polaris/pull/2321)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 359. `067bb9d` - client/python: loosen boto3 dep (#2188)

**Date:** 2025-08-11 | **Author:** Tyler Rockwood | **PR:** [#2188](https://github.com/apache/polaris/pull/2188)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 360. `2f985ab` - CatalogEntity: internal endpoint not considered (#2292)

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

### 361. `ad33b48` - chore(deps): update actions/checkout action to v5 (#2319)

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

### 362. `8a5b80a` - Separate Cloud Integration Tests (#2283)

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

### 363. `cdfc2d1` - fix(deps): update dependency com.gradleup.shadow:shadow-gradle-plugin to v9.0.1 (#2310)

**Date:** 2025-08-11 | **Author:** Mend Renovate | **PR:** [#2310](https://github.com/apache/polaris/pull/2310)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/baselibs.versions.toml`

---

### 364. `24aa8b3` - fix(deps): update dependency software.amazon.awssdk:bom to v2.32.19 (#2314)

**Date:** 2025-08-11 | **Author:** Mend Renovate | **PR:** [#2314](https://github.com/apache/polaris/pull/2314)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 365. `eb27309` - chore(deps): update dependency pre-commit to v4.3.0 (#2311)

**Date:** 2025-08-11 | **Author:** Mend Renovate | **PR:** [#2311](https://github.com/apache/polaris/pull/2311)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 366. `01c6471` - fix(deps): update dependency com.github.spotbugs:spotbugs-annotations to v4.9.4 (#2312)

**Date:** 2025-08-11 | **Author:** Mend Renovate | **PR:** [#2312](https://github.com/apache/polaris/pull/2312)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 367. `f6a2abb` - Perform force repair when polaris not found (#2313)

**Date:** 2025-08-09 | **Author:** Yong Zheng | **PR:** [#2313](https://github.com/apache/polaris/pull/2313)
**Files:** 1 | **Changes:** +7/-0

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris`

---

### 368. `360d292` - fix(deps): update dependency io.opentelemetry:opentelemetry-bom to v1.53.0 (#2309)

**Date:** 2025-08-08 | **Author:** Mend Renovate | **PR:** [#2309](https://github.com/apache/polaris/pull/2309)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 369. `96d2b30` - fix(deps): update dependency boto3 to v1.40.6 (#2308)

**Date:** 2025-08-08 | **Author:** Mend Renovate | **PR:** [#2308](https://github.com/apache/polaris/pull/2308)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 370. `1b93169` - Fix Hadoop federation to initialize the configuration prior to catalog initialization (#2282)

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

### 371. `cfff798` - fix(docs): update BasePolarisAuthenticator to DefaultAuthenticator (#2303)

**Date:** 2025-08-08 | **Author:** Yujiang Zhong | **PR:** [#2303](https://github.com/apache/polaris/pull/2303)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Security enhancement; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/realm.md`

---

### 372. `d124612` - Fix python CI client-integration-test (#2305)

**Date:** 2025-08-08 | **Author:** Christopher Lambert | **PR:** [#2305](https://github.com/apache/polaris/pull/2305)
**Files:** 1 | **Changes:** +4/-4

**PURPOSE:** Bug fix; Test improvement; CI/CD improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `Makefile`

**Additional details from commit message:**
```
6764a886857da464e3de11013165cd82aa5fedcb
but then
eda70740a4e327889f1ac38295d23c8947d87703
added more `CONTAINER_TOOL` usage
```

---

### 373. `83be3b1` - fix(deps): update dependency org.assertj:assertj-core to v3.27.4 (#2298)

**Date:** 2025-08-08 | **Author:** Mend Renovate | **PR:** [#2298](https://github.com/apache/polaris/pull/2298)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 374. `5abd342` - fix(deps): update dependency boto3 to v1.40.5 (#2300)

**Date:** 2025-08-08 | **Author:** Mend Renovate | **PR:** [#2300](https://github.com/apache/polaris/pull/2300)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 375. `eda7074` - Move python client Makefile into the root level one (#2140)

**Date:** 2025-08-07 | **Author:** Yong Zheng | **PR:** [#2140](https://github.com/apache/polaris/pull/2140)
**Files:** 5 | **Changes:** +91/-121

**PURPOSE:** Documentation update

**WHAT CHANGED:** Modified Client Library in CI/CD, Documentation, Python Client

**WHY NEEDED:** to improve client usability; to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation, Client API, User Documentation | Focused change | May affect API consumers

**Files modified:**
- `.github/workflows/python-client.yml`
- `Makefile`
- `README.md`
- `client/python/Makefile`
- `client/python/README.md`

**Additional details from commit message:**
```
* Update workflow
* add client-lint to pre-commit
* Update README.md to include client
```

---

### 376. `5983c81` - Helm Chart: remove duplicate line in authenticationOptions template (#2297)

**Date:** 2025-08-07 | **Author:** Alexandre Dutra | **PR:** [#2297](https://github.com/apache/polaris/pull/2297)
**Files:** 1 | **Changes:** +0/-1

**PURPOSE:** Code removal; Security enhancement

**WHAT CHANGED:** in Helm Charts

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Kubernetes Deployment | Focused change

**Files modified:**
- `helm/polaris/templates/_helpers.tpl`

---

### 377. `d753e3d` - fix: typo in server template files. (#2288)

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

### 378. `d3d822c` - fix(deps): update dependency com.google.cloud:google-cloud-storage-bom to v2.55.0 (#2281)

**Date:** 2025-08-07 | **Author:** Mend Renovate | **PR:** [#2281](https://github.com/apache/polaris/pull/2281)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 379. `c2b5de1` - Add PolarisAdminService.loadEntities helper (#2261)

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

### 380. `ef177b5` - Remove PolarisCallContext.getClock (#2250)

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

### 381. `9d16b01` - fix(deps): update dependency boto3 to v1.40.4 (#2284)

**Date:** 2025-08-07 | **Author:** Mend Renovate | **PR:** [#2284](https://github.com/apache/polaris/pull/2284)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 382. `d6611de` - chore(deps): update docker.io/jaegertracing/all-in-one docker tag to v1.72.0 (#2285)

**Date:** 2025-08-07 | **Author:** Mend Renovate | **PR:** [#2285](https://github.com/apache/polaris/pull/2285)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Documentation update; CI/CD improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `getting-started/telemetry/docker-compose.yml`

---

### 383. `16adb51` - fix(deps): update dependency com.gradleup.shadow:shadow-gradle-plugin to v9 (#2289)

**Date:** 2025-08-07 | **Author:** Mend Renovate | **PR:** [#2289](https://github.com/apache/polaris/pull/2289)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/baselibs.versions.toml`

---

### 384. `23736a6` - chore(deps): update dependency poetry to v2.1.4 (#2259)

**Date:** 2025-08-07 | **Author:** Mend Renovate | **PR:** [#2259](https://github.com/apache/polaris/pull/2259)
**Files:** 2 | **Changes:** +2/-2

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`
- `regtests/requirements.txt`

**Additional details from commit message:**
```
* fix pyproject
---------
Co-authored-by: Robert Stupp <snazy@snazy.de>
```

---

### 385. `35b31ca` - Clean exit when running repair mode for client (#2287)

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

### 386. `04e65af` - Use injected PolarisDiagnostics in MetaStoreManagerFactory impls (#2251)

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

### 387. `7fbd3ab` - Use Mockito Java agent for mock instrumentation (#2275)

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

### 388. `0c790e0` - Standardize logging libraries in tests (#2268)

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

### 389. `974098d` - Minor fixes and enhancements to External IDP documentation (#2274)

**Date:** 2025-08-06 | **Author:** Alexandre Dutra | **PR:** [#2274](https://github.com/apache/polaris/pull/2274)
**Files:** 1 | **Changes:** +65/-46

**PURPOSE:** Bug fix; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/external-idp.md`

---

### 390. `565a3ee` - Nit: simplify runtime-service dependencies (#2273)

**Date:** 2025-08-06 | **Author:** Alexandre Dutra | **PR:** [#2273](https://github.com/apache/polaris/pull/2273)
**Files:** 1 | **Changes:** +3/-6

**PURPOSE:** Code refactoring; CI/CD improvement

**WHAT CHANGED:** in Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/build.gradle.kts`

---

### 391. `f34adca` - Add TestServices.newCallContext (#2249)

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

### 392. `4e82cd1` - Stop mocking PolarisDiagnostics (#2248)

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

### 393. `3858a16` - Prefer diagnostics field in Resolver (#2247)

**Date:** 2025-08-06 | **Author:** Christopher Lambert | **PR:** [#2247](https://github.com/apache/polaris/pull/2247)
**Files:** 1 | **Changes:** +3/-3

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Persistence Layer in Core, Persistence

**WHY NEEDED:** to enhance data storage reliability

**IMPACT:** Affects: Database/Storage | Focused change | Requires careful deployment

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/persistence/resolver/Resolver.java`

---

### 394. `bae5444` - fix(deps): update dependency boto3 to v1.40.3 (#2269)

**Date:** 2025-08-06 | **Author:** Mend Renovate | **PR:** [#2269](https://github.com/apache/polaris/pull/2269)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 395. `7095fd6` - chore(deps): update actions/download-artifact action to v5 (#2271)

**Date:** 2025-08-06 | **Author:** Mend Renovate | **PR:** [#2271](https://github.com/apache/polaris/pull/2271)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `.github/actions/ci-incr-build-cache-prepare/action.yml`

---

### 396. `9b2fbae` - fix(deps): update dependency com.nimbusds:nimbus-jose-jwt to v10.4.1 (#2270)

**Date:** 2025-08-06 | **Author:** Mend Renovate | **PR:** [#2270](https://github.com/apache/polaris/pull/2270)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/build.gradle.kts`

---

### 397. `af69d9f` - JdbcMetaStoreManagerFactory determines schemaVersion once per realm (#2217)

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

### 398. `20febda` - Merge polaris-service-common into polaris-runtime-service (#2233)

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

### 399. `b476779` - JDBC: SERIALIZABLE/EntityNotFoundException (#2219)

**Date:** 2025-08-05 | **Author:** Robert Stupp | **PR:** [#2219](https://github.com/apache/polaris/pull/2219)
**Files:** 1 | **Changes:** +10/-4

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified JDBC Persistence in Persistence

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Relational Databases | Focused change

**Files modified:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcBasePersistenceImpl.java`

---

### 400. `355adae` - Make `*StorageConfigurationInfo` types immutable (#2236)

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

### 401. `5fb38c5` - chore(deps): update registry.access.redhat.com/ubi9/openjdk-21-runtime docker tag to v1.22-1.1753981256 (#2266)

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

### 402. `532ee51` - Remove config parameter from `PolarisStorageIntegration#getSubscopedCreds` (#2235)

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

### 403. `64d815a` - chore(deps): update gradle/actions digest to 017a9ef (#2265)

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

### 404. `ff9fdcd` - chore(deps): update plugin jetbrains-changelog to v2.4.0 (#2264)

**Date:** 2025-08-05 | **Author:** Mend Renovate | **PR:** [#2264](https://github.com/apache/polaris/pull/2264)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 405. `bbb7b43` - Use application-scope clock when generating GCP credentials (#2241)

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

### 406. `f2a54cb` - QuarkusProducers: remove unneeded `BasePersistence` producer (#2255)

**Date:** 2025-08-05 | **Author:** Robert Stupp | **PR:** [#2255](https://github.com/apache/polaris/pull/2255)
**Files:** 1 | **Changes:** +8/-15

**PURPOSE:** Code removal

**WHAT CHANGED:** in Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/src/main/java/org/apache/polaris/service/quarkus/config/QuarkusProducers.java`

---

### 407. `7774613` - Only pass `RealmConfig` to `PolarisStorageIntegration` (#2234)

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

### 408. `2f7e8a6` - fix(deps): update immutables to v2.11.2 (#2257)

**Date:** 2025-08-05 | **Author:** Mend Renovate | **PR:** [#2257](https://github.com/apache/polaris/pull/2257)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 409. `e1e9c48` - fix(deps): update dependency com.gradleup.shadow:shadow-gradle-plugin to v8.3.9 (#2260)

**Date:** 2025-08-05 | **Author:** Mend Renovate | **PR:** [#2260](https://github.com/apache/polaris/pull/2260)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/baselibs.versions.toml`

---

### 410. `d6ae2c8` - fix(deps): update dependency boto3 to v1.40.2 (#2256)

**Date:** 2025-08-05 | **Author:** Mend Renovate | **PR:** [#2256](https://github.com/apache/polaris/pull/2256)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 411. `a660903` - Remove obsolete information from README-quarkus.md (#2252)

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

### 412. `97bbc39` - Replace TestPolarisMetaStoreManager with Mockito.spy (#2230)

**Date:** 2025-08-04 | **Author:** Christopher Lambert | **PR:** [#2230](https://github.com/apache/polaris/pull/2230)
**Files:** 1 | **Changes:** +16/-33

**PURPOSE:** Test improvement

**WHAT CHANGED:** Modified Admin Service in Runtime Service including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Management Operations | Focused change

**Files modified:**
- `runtime/service/src/test/java/org/apache/polaris/service/quarkus/admin/ManagementServiceTest.java`

---

### 413. `a3849fe` - fix(deps): update dependency software.amazon.awssdk:bom to v2.32.14 (#2246)

**Date:** 2025-08-04 | **Author:** Mend Renovate | **PR:** [#2246](https://github.com/apache/polaris/pull/2246)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 414. `14c9394` - Prepare upgrade to Gradle 9 (#2237)

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

### 415. `253321c` - Add ResolutionManifestFactory (#2210)

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

### 416. `7fa497c` - JDBC: Log SQL statements at debug level (#2221)

**Date:** 2025-08-04 | **Author:** Robert Stupp | **PR:** [#2221](https://github.com/apache/polaris/pull/2221)
**Files:** 1 | **Changes:** +17/-0

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified JDBC Persistence in Persistence

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Relational Databases | Focused change

**Files modified:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/DatasourceOperations.java`

---

### 417. `aa24027` - fix(deps): update dependency com.azure:azure-sdk-bom to v1.2.37 (#2242)

**Date:** 2025-08-03 | **Author:** Mend Renovate | **PR:** [#2242](https://github.com/apache/polaris/pull/2242)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 418. `3f1774a` - fix(deps): update dependency boto3 to v1.40.1 (#2240)

**Date:** 2025-08-02 | **Author:** Mend Renovate | **PR:** [#2240](https://github.com/apache/polaris/pull/2240)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 419. `7b7a424` - chore(deps): update dependency mypy to >=1.17, <=1.17.1 (#2218)

**Date:** 2025-08-01 | **Author:** Mend Renovate | **PR:** [#2218](https://github.com/apache/polaris/pull/2218)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 420. `d3dbe0c` - Fix deprecated Quarkus log properties (#2216)

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

### 421. `e439ff5` - feat: Add `endpointInternal` to `AwsStorageConfigInfo` (#2213)

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

### 422. `0449d9b` - Remove CallContext.CURRENT_CONTEXT (#2203)

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

### 423. `0b3a129` - Fix compilation warnings in AzureCredentialStorageIntegrationTest (#2231)

**Date:** 2025-08-01 | **Author:** Alexandre Dutra | **PR:** [#2231](https://github.com/apache/polaris/pull/2231)
**Files:** 1 | **Changes:** +6/-4

**PURPOSE:** Bug fix; Test improvement

**WHAT CHANGED:** including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/src/test/java/org/apache/polaris/service/storage/azure/AzureCredentialStorageIntegrationTest.java`

---

### 424. `482dbba` - Fix Awaitility build configuration (#2232)

**Date:** 2025-08-01 | **Author:** Alexandre Dutra | **PR:** [#2232](https://github.com/apache/polaris/pull/2232)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; CI/CD improvement

**WHAT CHANGED:** in Runtime Service

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/service/build.gradle.kts`

---

### 425. `f6097d9` - chore(deps): update actions/stale digest to 8f717f0 (#2224)

**Date:** 2025-08-01 | **Author:** Mend Renovate | **PR:** [#2224](https://github.com/apache/polaris/pull/2224)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/stale.yml`

---

### 426. `2890c69` - fix(deps): update dependency boto3 to v1.40.0 (#2225)

**Date:** 2025-07-31 | **Author:** Mend Renovate | **PR:** [#2225](https://github.com/apache/polaris/pull/2225)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 427. `8f488d5` - JDBC: Include error code + SQL state in exception messages (#2220)

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

### 428. `5e43a07` - Replace CommitFailedException with CommitConflictException (#2198)

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

### 429. `a6656c3` - Remove CallContextResolver (#2215)

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

### 430. `c49755b` - fix(deps): update dependency io.smallrye.common:smallrye-common-annotation to v2.13.8 (#2222)

**Date:** 2025-07-31 | **Author:** Mend Renovate | **PR:** [#2222](https://github.com/apache/polaris/pull/2222)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 431. `eefe572` - Remove postgres_latest as image tag (#2045)

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

### 432. `0531b21` - Enable python client debug flag (#2154)

**Date:** 2025-07-30 | **Author:** Yong Zheng | **PR:** [#2154](https://github.com/apache/polaris/pull/2154)
**Files:** 3 | **Changes:** +34/-7

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified CLI in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Command Line Tools | Focused change

**Files modified:**
- `client/python/cli/constants.py`
- `client/python/cli/options/parser.py`
- `client/python/cli/polaris_cli.py`

**Additional details from commit message:**
```
* Move debug msg to stderr and move debug enable after option parsing
```

---

### 433. `dc8b117` - fix(deps): update dependency org.apache.commons:commons-compress to v1.28.0 (#2212)

**Date:** 2025-07-31 | **Author:** Mend Renovate | **PR:** [#2212](https://github.com/apache/polaris/pull/2212)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/build.gradle.kts`

---

### 434. `5c9b36e` - fix(deps): update dependency boto3 to v1.39.17 (#2211)

**Date:** 2025-07-31 | **Author:** Mend Renovate | **PR:** [#2211](https://github.com/apache/polaris/pull/2211)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 435. `4d94745` - Remove getCurrentContext from JWTBroker (#2202)

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

### 436. `e7eb59f` - Remove getCurrentContext from InMemoryStorageIntegration (#2201)

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

### 437. `3d354f8` - Remove PolarisCallContext from TreeMapMetaStore (#2195)

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

### 438. `2332f63` - Simplify BaseMetaStoreManager.extractStorageConfiguration (#2194)

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

### 439. `914be46` - fix(deps): update quarkus platform and group to v3.25.0 (#2167)

**Date:** 2025-07-30 | **Author:** Mend Renovate | **PR:** [#2167](https://github.com/apache/polaris/pull/2167)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 440. `1b51590` - chore(deps): update actions/stale digest to a92fd57 (#2208)

**Date:** 2025-07-30 | **Author:** Mend Renovate | **PR:** [#2208](https://github.com/apache/polaris/pull/2208)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/stale.yml`

---

### 441. `df87252` - fix(deps): update dependency boto3 to v1.39.16 (#2209)

**Date:** 2025-07-30 | **Author:** Mend Renovate | **PR:** [#2209](https://github.com/apache/polaris/pull/2209)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 442. `433cfee` - fix(deps): update dependency com.google.cloud:google-cloud-storage-bom to v2.54.0 (#2200)

**Date:** 2025-07-29 | **Author:** Mend Renovate | **PR:** [#2200](https://github.com/apache/polaris/pull/2200)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 443. `f6ae689` - fix(deps): update dependency boto3 to v1.39.15 (#2199)

**Date:** 2025-07-29 | **Author:** Mend Renovate | **PR:** [#2199](https://github.com/apache/polaris/pull/2199)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 444. `364b53c` - Fix Namespace resolution on grant/revoke privilege operations (#2170)

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

### 445. `756e535` - Remove PolarisDiagnostics from json utils (#2176)

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

### 446. `e46f8c6` - Add Principal lookup helpers to PolarisMetaStoreManager (#2174)

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

### 447. `c3ad994` - fix(deps): update dependency software.amazon.awssdk:bom to v2.32.9 (#2191)

**Date:** 2025-07-28 | **Author:** Mend Renovate | **PR:** [#2191](https://github.com/apache/polaris/pull/2191)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 448. `181fda6` - chore(deps): update plugin jetbrains-changelog to v2.3.0 (#2187)

**Date:** 2025-07-27 | **Author:** Mend Renovate | **PR:** [#2187](https://github.com/apache/polaris/pull/2187)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 449. `e59281a` - fix(deps): update dependency boto3 to v1.39.14 (#2186)

**Date:** 2025-07-25 | **Author:** Mend Renovate | **PR:** [#2186](https://github.com/apache/polaris/pull/2186)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 450. `8b811ed` - Fix doc to remove privileges may take up to one hour to take effect and add Policy to securable object (#2009)

**Date:** 2025-07-26 | **Author:** CG | **PR:** [#2009](https://github.com/apache/polaris/pull/2009)
**Files:** 1 | **Changes:** +1/-5

**PURPOSE:** Bug fix; New feature; Code removal; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/access-control.md`

---

### 451. `7b04abe` - Push AccessConfig creation to PolarisStorageIntegration (#2171)

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

### 452. `a39bce4` - fix(deps): update dependency com.adobe.testing:s3mock-testcontainers to v4.7.0 (#2185)

**Date:** 2025-07-25 | **Author:** Mend Renovate | **PR:** [#2185](https://github.com/apache/polaris/pull/2185)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update; Test improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 453. `dd4a8cc` - Add Polaris Community Meeting 2025-07-24 (#2184)

**Date:** 2025-07-25 | **Author:** JB Onofré | **PR:** [#2184](https://github.com/apache/polaris/pull/2184)
**Files:** 1 | **Changes:** +16/-6

**PURPOSE:** New feature

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/community/meetings/_index.adoc`

---

### 454. `6764a88` - Add podman support (#2143)

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

### 455. `085eefa` - fix(deps): update dependency boto3 to v1.39.13 (#2182)

**Date:** 2025-07-24 | **Author:** Mend Renovate | **PR:** [#2182](https://github.com/apache/polaris/pull/2182)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 456. `2256df0` - Simplify bootstrapServiceAndCreatePolarisPrincipalForRealm (#2172)

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

### 457. `45a7e3e` - fix(deps): update dependency com.google.errorprone:error_prone_core to v2.41.0 (#2181)

**Date:** 2025-07-24 | **Author:** Mend Renovate | **PR:** [#2181](https://github.com/apache/polaris/pull/2181)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 458. `e9267b6` - Respond with 409 in case of concurrent Namespace update failures instead of 500 (#1989)

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

### 459. `ca85339` - Rework getOrCreateSessionSupplier (#2161)

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

### 460. `d44bf1a` - fix(deps): update dependency org.apache.commons:commons-text to v1.14.0 (#2178)

**Date:** 2025-07-24 | **Author:** Mend Renovate | **PR:** [#2178](https://github.com/apache/polaris/pull/2178)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 461. `68d0e26` - Add muti-platform Docker images staging in the release guide (#2039)

**Date:** 2025-07-24 | **Author:** JB Onofré | **PR:** [#2039](https://github.com/apache/polaris/pull/2039)
**Files:** 1 | **Changes:** +13/-2

**PURPOSE:** New feature; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/release-guide.md`

---

### 462. `218ce64` - chore(deps): update plugin jandex to v2.2.0 (#2175)

**Date:** 2025-07-24 | **Author:** Mend Renovate | **PR:** [#2175](https://github.com/apache/polaris/pull/2175)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 463. `d898764` - Improve Realm ID resolution for Quarkus 3.24+ (#2163)

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

### 464. `b501bfc` - fix(deps): update dependency boto3 to v1.39.12 (#2169)

**Date:** 2025-07-24 | **Author:** Mend Renovate | **PR:** [#2169](https://github.com/apache/polaris/pull/2169)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 465. `5faa371` - Simplify checkPolarisServiceBootstrappedForRealm (#2162)

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

### 466. `98d4220` - fix(deps): update dependency io.smallrye.config:smallrye-config-core to v3.13.4 (#2165)

**Date:** 2025-07-23 | **Author:** Mend Renovate | **PR:** [#2165](https://github.com/apache/polaris/pull/2165)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 467. `91fee87` - fix(deps): update quarkus platform and group (#2166)

**Date:** 2025-07-23 | **Author:** Mend Renovate | **PR:** [#2166](https://github.com/apache/polaris/pull/2166)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 468. `07ee3fd` - Run standard (sharable) REST Catalog integrations tests with MinIO (#2158)

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

### 469. `95358a9` - Extract ResolverFactory from PolarisEntityManager (#2148)

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

### 470. `395459f` - fix(deps): update dependency boto3 to v1.39.11 (#2159)

**Date:** 2025-07-23 | **Author:** Mend Renovate | **PR:** [#2159](https://github.com/apache/polaris/pull/2159)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 471. `134a53d` - fix(deps): update dependency commons-codec:commons-codec to v1.19.0 (#2160)

**Date:** 2025-07-23 | **Author:** Mend Renovate | **PR:** [#2160](https://github.com/apache/polaris/pull/2160)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 472. `c84a634` - chore: fix class reference in the javadoc of TableLikeEntity (#2157)

**Date:** 2025-07-22 | **Author:** Dmitri Bourlatchkov | **PR:** [#2157](https://github.com/apache/polaris/pull/2157)
**Files:** 1 | **Changes:** +1/-0

**PURPOSE:** Bug fix; Documentation update

**WHAT CHANGED:** Modified Entity Management in Core

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Data Model | Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/entity/table/TableLikeEntity.java`

---

### 473. `62ed33f` - fix(deps): update dependency boto3 to v1.39.10 (#2151)

**Date:** 2025-07-22 | **Author:** Mend Renovate | **PR:** [#2151](https://github.com/apache/polaris/pull/2151)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 474. `35e835c` - fix(deps): update dependency com.diffplug.spotless:spotless-plugin-gradle to v7.2.1 (#2152)

**Date:** 2025-07-22 | **Author:** Mend Renovate | **PR:** [#2152](https://github.com/apache/polaris/pull/2152)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/baselibs.versions.toml`

---

### 475. `89deb5f` - chore(deps): update registry.access.redhat.com/ubi9/openjdk-21-runtime docker tag to v1.22-1.1752676419 (#2150)

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

### 476. `886d111` - Remove PolarisEntityManager.getCredentialCache (#2133)

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

### 477. `3316f4e` - Python client: add support for endpoint, sts-endpoint, path-style-access (#2127)

**Date:** 2025-07-21 | **Author:** Robert Stupp | **PR:** [#2127](https://github.com/apache/polaris/pull/2127)
**Files:** 4 | **Changes:** +21/-1

**PURPOSE:** New feature

**WHAT CHANGED:** Modified CLI in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Command Line Tools | Focused change

**Files modified:**
- `client/python/cli/command/__init__.py`
- `client/python/cli/command/catalogs.py`
- `client/python/cli/constants.py`
- `client/python/cli/options/option_tree.py`

**Additional details from commit message:**
```
Amends #1913 and #2012
```

---

### 478. `8a3ebce` - fix(deps): update dependency com.fasterxml.jackson:jackson-bom to v2.19.2 (#2136)

**Date:** 2025-07-21 | **Author:** Mend Renovate | **PR:** [#2136](https://github.com/apache/polaris/pull/2136)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 479. `008cedf` - fix(deps): update dependency boto3 to v1.39.9 (#2137)

**Date:** 2025-07-21 | **Author:** Mend Renovate | **PR:** [#2137](https://github.com/apache/polaris/pull/2137)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 480. `dde6e95` - fix(deps): update dependency org.junit:junit-bom to v5.13.4 (#2147)

**Date:** 2025-07-21 | **Author:** Mend Renovate | **PR:** [#2147](https://github.com/apache/polaris/pull/2147)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 481. `1a0fb02` - fix(deps): update dependency org.xerial.snappy:snappy-java to v1.1.10.8 (#2138)

**Date:** 2025-07-21 | **Author:** Mend Renovate | **PR:** [#2138](https://github.com/apache/polaris/pull/2138)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/build.gradle.kts`

---

### 482. `6e1bce6` - fix(deps): update dependency software.amazon.awssdk:bom to v2.32.4 (#2146)

**Date:** 2025-07-21 | **Author:** Mend Renovate | **PR:** [#2146](https://github.com/apache/polaris/pull/2146)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 483. `7dc50dc` - fix(deps): update dependency com.diffplug.spotless:spotless-plugin-gradle to v7.2.0 (#2142)

**Date:** 2025-07-21 | **Author:** Mend Renovate | **PR:** [#2142](https://github.com/apache/polaris/pull/2142)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/baselibs.versions.toml`

---

### 484. `d67a35d` - fix(deps): update dependency com.nimbusds:nimbus-jose-jwt to v10.4 (#2139)

**Date:** 2025-07-21 | **Author:** Mend Renovate | **PR:** [#2139](https://github.com/apache/polaris/pull/2139)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/build.gradle.kts`

---

### 485. `81ad206` - CI: Address failure from accessing GH API (#2132)

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

### 486. `3650c68` - Package polaris client as python package (#2049)

**Date:** 2025-07-20 | **Author:** Yong Zheng | **PR:** [#2049](https://github.com/apache/polaris/pull/2049)
**Files:** 4 | **Changes:** +31/-12

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified CLI, Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API, Command Line Tools | Focused change | May affect API consumers

**Files modified:**
- `client/python/cli/polaris_cli.py`
- `client/python/pyproject.toml`
- `polaris`
- `regtests/Dockerfile`

**Additional details from commit message:**
```
* Package polaris client as python package
* Change owner to spark when copying files from local into Dockerfile
```

---

### 487. `bc111fc` - Use Makefile to simplify setup and commands (#2027)

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

### 488. `b48cfb6` - Add server and client support for the new generic table `baseLocation` field (#2122)

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

### 489. `633cedf` - Add newIcebergCatalog helper (#2134)

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

### 490. `8c0d967` - fix(deps): update dependency io.smallrye.config:smallrye-config-core to v3.13.3 (#2130)

**Date:** 2025-07-18 | **Author:** Mend Renovate | **PR:** [#2130](https://github.com/apache/polaris/pull/2130)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 491. `351ffb3` - fix(deps): update dependency boto3 to v1.39.8 (#2129)

**Date:** 2025-07-18 | **Author:** Mend Renovate | **PR:** [#2129](https://github.com/apache/polaris/pull/2129)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 492. `79b9ce8` - fix(deps): update quarkus platform and group to v3.24.4 (#2128)

**Date:** 2025-07-18 | **Author:** Mend Renovate | **PR:** [#2128](https://github.com/apache/polaris/pull/2128)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 493. `2021e4f` - fix(deps): update dependency org.apache.iceberg:iceberg-bom to v1.9.2 (#2126)

**Date:** 2025-07-18 | **Author:** Mend Renovate | **PR:** [#2126](https://github.com/apache/polaris/pull/2126)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 494. `46a2a03` - feat(helm): Add support for external authentication (#2104)

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

### 495. `6e416a9` - Add IMPLICIT authentication support to the CLI (#2121)

**Date:** 2025-07-17 | **Author:** Pooja Nilangekar | **PR:** [#2121](https://github.com/apache/polaris/pull/2121)
**Files:** 3 | **Changes:** +33/-20

**PURPOSE:** New feature; Security enhancement; CI/CD improvement

**WHAT CHANGED:** Modified CLI, Client Library in Python Client including test updates

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API, Command Line Tools | Focused change | May affect API consumers

**Files modified:**
- `client/python/cli/command/catalogs.py`
- `client/python/cli/constants.py`
- `client/python/test/test_cli_parsing.py`

**Additional details from commit message:**
```
Since Hadoop federated catalogs rely purely on IMPLICIT authentication, the CLI parsing test has been updated to reflect the same.
```

---

### 496. `82ae2cf` - Abstract polaris-runtime-service tests for all persistence implementations (#2106)

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

### 497. `79ebe84` - fix(deps): update dependency boto3 to v1.39.7 (#2124)

**Date:** 2025-07-17 | **Author:** Mend Renovate | **PR:** [#2124](https://github.com/apache/polaris/pull/2124)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 498. `c906cfa` - fix(deps): update dependency gradle.plugin.org.jetbrains.gradle.plugin.idea-ext:gradle-idea-ext to v1.2 (#2125)

**Date:** 2025-07-17 | **Author:** Mend Renovate | **PR:** [#2125](https://github.com/apache/polaris/pull/2125)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/baselibs.versions.toml`

---

### 499. `7ca4970` - Add TestFileIOFactory helper (#2105)

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

### 500. `987c554` - Add `pathStyleAccess` to AwsStorageConfigInfo (#2012)

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

### 501. `d035344` - Spark 3.5.6 and Iceberg 1.9.1 (#1960)

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

### 502. `05975a3` - chore(deps): update dependency mypy to >=1.17, <=1.17.0 (#2114)

**Date:** 2025-07-16 | **Author:** Mend Renovate | **PR:** [#2114](https://github.com/apache/polaris/pull/2114)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 503. `d2667e5` - Site/dev: allow overriding the podman/docker binaries detection (#2051)

**Date:** 2025-07-16 | **Author:** Robert Stupp | **PR:** [#2051](https://github.com/apache/polaris/pull/2051)
**Files:** 3 | **Changes:** +21/-2

**PURPOSE:** Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/.gitignore`
- `site/README.md`
- `site/bin/_hugo-docker-include.sh`

**Additional details from commit message:**
```
```bash
DOCKER=docker
COMPOSE=docker-compose
```
```

---

### 504. `fb418a2` - Extensible pagination token implementation (#1938)

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

### 505. `d6d26bc` - fix(deps): update dependency boto3 to v1.39.6 (#2120)

**Date:** 2025-07-16 | **Author:** Mend Renovate | **PR:** [#2120](https://github.com/apache/polaris/pull/2120)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 506. `1cb85e0` - chore: Avoid deprecated `DefaultCredentialsProvider.create()` (#2119)

**Date:** 2025-07-15 | **Author:** Dmitri Bourlatchkov | **PR:** [#2119](https://github.com/apache/polaris/pull/2119)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Deprecation

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `service/common/src/main/java/org/apache/polaris/service/storage/StorageConfiguration.java`

---

### 507. `77666ab` - fix(deps): update dependency boto3 to v1.39.4 (#2116)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2116](https://github.com/apache/polaris/pull/2116)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 508. `39a10d3` - fix(deps): update immutables to v2.11.1 (#2113)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2113](https://github.com/apache/polaris/pull/2113)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 509. `1b966b1` - Site: Remove non-OSS query engines from front page (#2031)

**Date:** 2025-07-15 | **Author:** Danica Fine | **PR:** [#2031](https://github.com/apache/polaris/pull/2031)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code removal

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/_index.adoc`

---

### 510. `bd164f5` - Disable renovatebot on release branches (#2085)

**Date:** 2025-07-15 | **Author:** Eric Maynard | **PR:** [#2085](https://github.com/apache/polaris/pull/2085)
**Files:** 1 | **Changes:** +0/-8

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `.github/renovate.json5`

---

### 511. `9ecf29b` - Use PolarisImmutable for StorageCredentialCacheKey (#2029)

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

### 512. `38d7dbf` - Simplify RealmEntityManagerFactory usage in tests (#2050)

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

### 513. `c72986f` - Renovate PRs, branch name + PR subject (#2060)

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

### 514. `8a059aa` - Revert PR 2033 (#2087)

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

### 515. `b74679d` - main: Update dependency io.smallrye.common:smallrye-common-annotation to v2.13.7 (#2083)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2083](https://github.com/apache/polaris/pull/2083)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 516. `e374684` - main: Update dependency com.adobe.testing:s3mock-testcontainers to v4.6.0 (#2081)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2081](https://github.com/apache/polaris/pull/2081)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update; Test improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 517. `fd52737` - main: Update dependency software.amazon.awssdk:bom to v2.31.78 (#2080)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2080](https://github.com/apache/polaris/pull/2080)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 518. `753a3cf` - main: Update dependency io.opentelemetry:opentelemetry-bom to v1.52.0 (#2082)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2082](https://github.com/apache/polaris/pull/2082)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 519. `45040bd` - Add External Identity Providers page to unreleased documentation  (#2013)

**Date:** 2025-07-15 | **Author:** Mark Hoerth | **PR:** [#2013](https://github.com/apache/polaris/pull/2013)
**Files:** 1 | **Changes:** +341/-0

**PURPOSE:** New feature; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/external-idp.md`

**Additional details from commit message:**
```
Co-authored-by: Alexandre Dutra <adutra@apache.org>
Co-authored-by: Eric Maynard <emaynard@apache.org>
```

---

### 520. `82a5e68` - main: Update dependency org.eclipse.persistence:eclipselink to v4.0.7 (#2078)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2078](https://github.com/apache/polaris/pull/2078)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 521. `9897a40` - main: Update dependency com.gradleup.shadow:shadow-gradle-plugin to v8.3.8 (#2061)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2061](https://github.com/apache/polaris/pull/2061)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/baselibs.versions.toml`

---

### 522. `23d8d01` - main: Update dependency io.projectreactor.netty:reactor-netty-http to v1.2.8 (#2075)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2075](https://github.com/apache/polaris/pull/2075)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/build.gradle.kts`

---

### 523. `5402a1e` - main: Update dependency net.ltgt.gradle:gradle-errorprone-plugin to v4.3.0 (#2079)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2079](https://github.com/apache/polaris/pull/2079)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/baselibs.versions.toml`

---

### 524. `ccb6a29` - main: Update dependency io.prometheus:prometheus-metrics-exporter-servlet-jakarta to v1.3.10 (#2076)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2076](https://github.com/apache/polaris/pull/2076)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 525. `bbbef73` - main: Update dependency io.netty:netty-codec-http2 to v4.2.3.Final (#2074)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2074](https://github.com/apache/polaris/pull/2074)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/build.gradle.kts`

---

### 526. `dea4f2f` - main: Update dependency com.google.errorprone:error_prone_core to v2.40.0 (#2068)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2068](https://github.com/apache/polaris/pull/2068)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 527. `f9e9316` - main: Update dependency org.testcontainers:testcontainers-bom to v1.21.3 (#2065)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2065](https://github.com/apache/polaris/pull/2065)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update; Test improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 528. `813ed39` - main: Update immutables to v2.11.0 (#2072)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2072](https://github.com/apache/polaris/pull/2072)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 529. `0e1fee5` - main: Update log4j2 monorepo to v2.25.1 (#2073)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2073](https://github.com/apache/polaris/pull/2073)
**Files:** 1 | **Changes:** +2/-2

**PURPOSE:** Code modification

**WHAT CHANGED:** in Spark Plugin

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Spark Integration | Focused change

**Files modified:**
- `plugins/spark/v3.5/integration/build.gradle.kts`

---

### 530. `bfc854f` - main: Update dependency org.apache.commons:commons-lang3 to v3.18.0 (#2069)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2069](https://github.com/apache/polaris/pull/2069)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 531. `b29bcd8` - main: Update medyagh/setup-minikube action to v0.0.20 (#2066)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2066](https://github.com/apache/polaris/pull/2066)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/helm.yml`

---

### 532. `6dc8309` - main: Update docker.io/jaegertracing/all-in-one Docker tag to v1.71.0 (#2070)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2070](https://github.com/apache/polaris/pull/2070)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Documentation update; CI/CD improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `getting-started/telemetry/docker-compose.yml`

---

### 533. `a6b8ae4` - main: Update dependency org.junit:junit-bom to v5.13.3 (#2064)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2064](https://github.com/apache/polaris/pull/2064)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 534. `9787264` - main: Update docker.io/prom/prometheus Docker tag to v3.5.0 (#2071)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2071](https://github.com/apache/polaris/pull/2071)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Documentation update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `getting-started/telemetry/docker-compose.yml`

---

### 535. `1e4528a` - main: Update dependency com.nimbusds:nimbus-jose-jwt to v10.3.1 (#2062)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2062](https://github.com/apache/polaris/pull/2062)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/build.gradle.kts`

---

### 536. `f4256f9` - main: Update dependency com.diffplug.spotless:spotless-plugin-gradle to v7.1.0 (#2067)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2067](https://github.com/apache/polaris/pull/2067)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/baselibs.versions.toml`

---

### 537. `d8807c9` - main: Update dependency io.micrometer:micrometer-bom to v1.15.2 (#2063)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2063](https://github.com/apache/polaris/pull/2063)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 538. `87d16d8` - main: Update dependency gradle to v8.14.3 (main) (#2058)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2058](https://github.com/apache/polaris/pull/2058)
**Files:** 1 | **Changes:** +2/-2

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/wrapper/gradle-wrapper.properties`

**Additional details from commit message:**
```
* Adjust Gradle update
---------
Co-authored-by: Robert Stupp <snazy@snazy.de>
```

---

### 539. `d08634a` - main: Update dependency com.github.ben-manes.caffeine:caffeine to v3.2.2 (#2056)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2056](https://github.com/apache/polaris/pull/2056)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 540. `213d459` - main: Update registry.access.redhat.com/ubi9/openjdk-21-runtime Docker tag to v1.22-1.1752066187 (#2059)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2059](https://github.com/apache/polaris/pull/2059)
**Files:** 2 | **Changes:** +2/-2

**PURPOSE:** Documentation update

**WHAT CHANGED:** Modified 2 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/admin/src/main/docker/Dockerfile.jvm`
- `runtime/server/src/main/docker/Dockerfile.jvm`

---

### 541. `ea19162` - main: Update dependency com.google.cloud:google-cloud-storage-bom to v2.53.3 (#2057)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2057](https://github.com/apache/polaris/pull/2057)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 542. `69761a2` - main: Update dependency com.fasterxml.jackson:jackson-bom to v2.19.1 (#2055)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2055](https://github.com/apache/polaris/pull/2055)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 543. `eb134d7` - main: Update dependency com.azure:azure-sdk-bom to v1.2.36 (#2054)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2054](https://github.com/apache/polaris/pull/2054)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 544. `42303bb` - main: Update actions/stale digest to 128b2c8 (#2053)

**Date:** 2025-07-15 | **Author:** Mend Renovate | **PR:** [#2053](https://github.com/apache/polaris/pull/2053)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/stale.yml`

---

### 545. `3b629dd` - Attempt to make Renovate work again (#2052)

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

### 546. `2c2052c` - Use application-scoped StorageCredentialCache (#2022)

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

### 547. `1b073bc` - Bump Quarkus version to unblock IntelliJ build (#1958)

**Date:** 2025-07-14 | **Author:** Adnan Hemani | **PR:** [#1958](https://github.com/apache/polaris/pull/1958)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 548. `c43c546` - Fix CI (no 2) (#2044)

**Date:** 2025-07-14 | **Author:** Robert Stupp | **PR:** [#2044](https://github.com/apache/polaris/pull/2044)
**Files:** 1 | **Changes:** +8/-0

**PURPOSE:** Bug fix; CI/CD improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `build.gradle.kts`

---

### 549. `e77a3a7` - Fix CI (#2043)

**Date:** 2025-07-14 | **Author:** Robert Stupp | **PR:** [#2043](https://github.com/apache/polaris/pull/2043)
**Files:** 1 | **Changes:** +1/-0

**PURPOSE:** Bug fix; CI/CD improvement

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/gradle.yml`

---

### 550. `de351de` - Introduce RealmConfig (#2015)

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

### 551. `ad77bd9` - feat(ci): Improve Gradle cache in CI (#1928)

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

### 552. `6ddd148` - Make StorageCredentialCache safe for mutli-realm usage (#2021)

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

### 553. `493bc8e` - Fix invalid redirect from public page (#2041)

**Date:** 2025-07-12 | **Author:** Yong Zheng | **PR:** [#2041](https://github.com/apache/polaris/pull/2041)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/_index.adoc`

---

### 554. `bb93edd` - Fix the LICENSE and NOTICE with the latest dependency updates (#1939)

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

### 555. `4f57506` - Using the closer.lua download script (#2038)

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

### 556. `7c2909c` - Fix gralde command for helm image and remove simple-values.yaml (#2036)

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

### 557. `afc1201` - [Site] Update release-guide.md for release dir name (#2037)

**Date:** 2025-07-11 | **Author:** Yufei Gu | **PR:** [#2037](https://github.com/apache/polaris/pull/2037)
**Files:** 1 | **Changes:** +7/-7

**PURPOSE:** Code modification

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/release-guide.md`

---

### 558. `2db2f10` - [Site] Simplify the doc directory structure (#2033)

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

### 559. `c8b5036` - Update release-guide.md for publishing docs (#2035)

**Date:** 2025-07-11 | **Author:** Yufei Gu | **PR:** [#2035](https://github.com/apache/polaris/pull/2035)
**Files:** 1 | **Changes:** +7/-7

**PURPOSE:** Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/release-guide.md`

---

### 560. `6f51d81` - Sync helm doc (#2034)

**Date:** 2025-07-11 | **Author:** Yong Zheng | **PR:** [#2034](https://github.com/apache/polaris/pull/2034)
**Files:** 1 | **Changes:** +12/-6

**PURPOSE:** Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/helm.md`

---

### 561. `d5f661e` - Remove kind (#2028)

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

### 562. `3019a5c` - Helm key grouping and test cases (#2002)

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

### 563. `bed1ac5` - Use the 0.9.0 doc from the versioned-docs branch (#2026)

**Date:** 2025-07-11 | **Author:** Yufei Gu | **PR:** [#2026](https://github.com/apache/polaris/pull/2026)
**Files:** 11 | **Changes:** +7/-2260

**PURPOSE:** Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Medium-scale change

**Files modified:**
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

### 564. `15f23ca` - Make PolarisConfiguration member variables private (#2007)

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

### 565. `ccc97bf` - Publish helm doc (#2014)

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

### 566. `f3996fe` - Add Helm Chart repo to the downloads page (#2025)

**Date:** 2025-07-10 | **Author:** Yufei Gu | **PR:** [#2025](https://github.com/apache/polaris/pull/2025)
**Files:** 1 | **Changes:** +3/-1

**PURPOSE:** New feature

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/downloads/_index.md`

---

### 567. `3b06a80` - Update Makefile for python client with auto setup (#1995)

**Date:** 2025-07-10 | **Author:** Yong Zheng | **PR:** [#1995](https://github.com/apache/polaris/pull/1995)
**Files:** 7 | **Changes:** +212/-124

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified CLI, Client Library in CI/CD, Documentation, Python Client

**WHY NEEDED:** to improve client usability; to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation, Client API, Command Line Tools, User Documentation | Focused change | May affect API consumers

**Files modified:**
- `.github/workflows/python-client.yml`
- `client/python/.pre-commit-config.yaml`
- `client/python/Makefile`
- `client/python/README.md`
- `client/python/cli/constants.py`
- `client/python/cli/polaris_cli.py`
- `client/python/pyproject.toml`

---

### 568. `19f44d8` - Remove duplicate MetaStoreManagerFactory mocks (#2023)

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

### 569. `33d9940` - Improve the bundle jar license and notice remove using exclude (#1991)

**Date:** 2025-07-09 | **Author:** Yun Zou | **PR:** [#1991](https://github.com/apache/polaris/pull/1991)
**Files:** 5 | **Changes:** +65/-115

**PURPOSE:** Code removal

**WHAT CHANGED:** in Documentation, Spark Plugin

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Spark Integration, User Documentation | Focused change

**Files modified:**
- `plugins/spark/README.md`
- `plugins/spark/v3.5/getting-started/notebooks/SparkPolaris.ipynb`
- `plugins/spark/v3.5/spark/{LICENSE => BUNDLE-LICENSE}`
- `plugins/spark/v3.5/spark/{NOTICE => BUNDLE-NOTICE}`
- `plugins/spark/v3.5/spark/build.gradle.kts`

---

### 570. `fae17a0` - Add 1.0.0 docs to the huge menu (#2020)

**Date:** 2025-07-09 | **Author:** Yufei Gu | **PR:** [#2020](https://github.com/apache/polaris/pull/2020)
**Files:** 4 | **Changes:** +6/-3

**PURPOSE:** New feature; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/getting-started/deploying-polaris/quickstart-deploy-aws.md`
- `site/content/in-dev/unreleased/getting-started/deploying-polaris/quickstart-deploy-azure.md`
- `site/content/in-dev/unreleased/getting-started/deploying-polaris/quickstart-deploy-gcp.md`
- `site/hugo.yaml`

---

### 571. `1b5549d` - Add 1.0.0-incubating release to the downloads page (#2018)

**Date:** 2025-07-09 | **Author:** Yufei Gu | **PR:** [#2018](https://github.com/apache/polaris/pull/2018)
**Files:** 3 | **Changes:** +47/-37

**PURPOSE:** New feature

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/downloads/_index.md`
- `site/content/downloads/releases.md`
- `site/hugo.yaml`

---

### 572. `c103ab5` - Restructure the download page (#2011)

**Date:** 2025-07-09 | **Author:** Yufei Gu | **PR:** [#2011](https://github.com/apache/polaris/pull/2011)
**Files:** 4 | **Changes:** +67/-37

**PURPOSE:** Code modification

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/downloads.md`
- `site/content/downloads/_index.md`
- `site/content/downloads/releases.md`
- `site/hugo.yaml`

---

### 573. `a0e31b0` - Fix bunch of OpenAPI generation issues (#2005)

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

### 574. `f80b4f3` - Cleanup collaborators in `.asf.yaml` (#2008)

**Date:** 2025-07-09 | **Author:** Robert Stupp | **PR:** [#2008](https://github.com/apache/polaris/pull/2008)
**Files:** 1 | **Changes:** +2/-4

**PURPOSE:** Code refactoring

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `.asf.yaml`

---

### 575. `bd83252` - Introduce an option to add object storage prefix to table locations (#1966)

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

### 576. `b96461a` - feat(auth): Ability to override active roles provider per realm (#2000)

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

### 577. `145ad3e` - Fix helm doc (#2001)

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

### 578. `daf4476` - Support IMPLICIT authentication type for federated catalogs (#1925)

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

### 579. `d962c64` - Update CatalogEntity::Builder to set default CatalogType as INTERNAL (#1998)

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

### 580. `1ce77e9` - OpenAPI-generate: Omit generation timestamp (#2004)

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

### 581. `f099d60` - Ignore regenerate.sh on README.md (#1999)

**Date:** 2025-07-04 | **Author:** Yong Zheng | **PR:** [#1999](https://github.com/apache/polaris/pull/1999)
**Files:** 1 | **Changes:** +4/-4

**PURPOSE:** Documentation update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `client/templates/regenerate.sh`

---

### 582. `95d1eac` - feat: Support customizing S3 endpoints (#1913)

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

### 583. `8fa6bf2` - Materialize Realm ID for Session Supplier in JDBC (#1988)

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

### 584. `7f3b781` - Remove unnecessary `InputStream.close` call (#1982)

**Date:** 2025-07-03 | **Author:** Eric Maynard | **PR:** [#1982](https://github.com/apache/polaris/pull/1982)
**Files:** 1 | **Changes:** +8/-15

**PURPOSE:** Code removal

**WHAT CHANGED:** Modified JDBC Persistence in Persistence

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Relational Databases | Focused change

**Files modified:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/DatasourceOperations.java`

---

### 585. `c5907e6` - Add regression test coverage for Spark Client with package conf (#1997)

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

### 586. `9cb71f8` - Refactor relationalJdbc in helm (#1996)

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

### 587. `1120b79` - Add doc for repair option (#1993)

**Date:** 2025-07-02 | **Author:** Yong Zheng | **PR:** [#1993](https://github.com/apache/polaris/pull/1993)
**Files:** 1 | **Changes:** +6/-0

**PURPOSE:** New feature; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/command-line-interface.md`

---

### 588. `b0c85e3` - Improve createPrincipal example in API docs (#1992)

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

### 589. `5edb7cb` - Fix doc for CLI update (#1994)

**Date:** 2025-07-02 | **Author:** Yong Zheng | **PR:** [#1994](https://github.com/apache/polaris/pull/1994)
**Files:** 1 | **Changes:** +10/-5

**PURPOSE:** Bug fix; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/command-line-interface.md`

---

### 590. `2a1070f` - Add a Spark session builder for the tests (#1985)

**Date:** 2025-07-02 | **Author:** Yufei Gu | **PR:** [#1985](https://github.com/apache/polaris/pull/1985)
**Files:** 4 | **Changes:** +236/-91

**PURPOSE:** New feature; Test improvement; CI/CD improvement

**WHAT CHANGED:** in Spark Plugin including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Spark Integration | Focused change

**Files modified:**
- `integration-tests/src/main/java/org/apache/polaris/service/it/ext/PolarisSparkIntegrationTestBase.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/ext/SparkSessionBuilder.java`
- `plugins/spark/v3.5/integration/src/intTest/java/org/apache/polaris/spark/quarkus/it/SparkCatalogIcebergIT.java`
- `plugins/spark/v3.5/integration/src/intTest/java/org/apache/polaris/spark/quarkus/it/SparkIntegrationBase.java`

---

### 591. `bdcc26f` - fix: Remove db-kind in helm chart (#1987)

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

### 592. `eb6b6ad` - Add support for catalog federation in the CLI (#1912)

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

### 593. `108989d` - Fix doc to remove outdated note about fine-grained access controls support (#1983)

**Date:** 2025-07-02 | **Author:** CG | **PR:** [#1983](https://github.com/apache/polaris/pull/1983)
**Files:** 1 | **Changes:** +0/-4

**PURPOSE:** Bug fix; Code removal; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/access-control.md`

**Additional details from commit message:**
```
1. Remove the misleading section on privileges can only be granted at catalog level. I've tested the fine-grained access controls and confirmed that privileges can be applied to an individual table in the catalog.
```

---

### 594. `35cc9b6` - Fix the sign failure (#1926)

**Date:** 2025-06-30 | **Author:** Yufei Gu | **PR:** [#1926](https://github.com/apache/polaris/pull/1926)
**Files:** 1 | **Changes:** +3/-0

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `runtime/distribution/build.gradle.kts`

---

### 595. `a385268` - Added support for `s3a` scheme (#1932)

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

### 596. `44d52d4` - Add options to the bootstrap command to specify a schema file (#1942)

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

### 597. `9c0d209` - Add additional unit and integration tests for etag functionality (#1972)

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

### 598. `41558ae` - Add OpenHFT in Spark plugin LICENSE (#1979)

**Date:** 2025-06-30 | **Author:** JB Onofré | **PR:** [#1979](https://github.com/apache/polaris/pull/1979)
**Files:** 1 | **Changes:** +8/-0

**PURPOSE:** New feature

**WHAT CHANGED:** in Spark Plugin

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Spark Integration | Focused change

**Files modified:**
- `plugins/spark/v3.5/spark/LICENSE`

---

### 599. `595e689` - Do not serialize null properties in the management model (#1955)

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

### 600. `e920a1d` - Correct javadoc text in generateOverlapQuery() (#1975)

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

### 601. `39226aa` - Share Polaris Community Meeting for 2025-06-26 (#1978)

**Date:** 2025-06-30 | **Author:** JB Onofré | **PR:** [#1978](https://github.com/apache/polaris/pull/1978)
**Files:** 1 | **Changes:** +7/-3

**PURPOSE:** Code modification

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/community/meetings/_index.adoc`

---

### 602. `ed008e4` - Add CHANGELOG (#1952)

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

### 603. `d410e9c` - Add relational-jdbc to helm (#1937)

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

### 604. `f6ae855` - Update release-guide.md (#1927)

**Date:** 2025-06-28 | **Author:** Yufei Gu | **PR:** [#1927](https://github.com/apache/polaris/pull/1927)
**Files:** 1 | **Changes:** +16/-10

**PURPOSE:** Code modification

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/release-guide.md`

---

### 605. `eda1a32` - Fix admin tool doc (#1977)

**Date:** 2025-06-28 | **Author:** Yong Zheng | **PR:** [#1977](https://github.com/apache/polaris/pull/1977)
**Files:** 1 | **Changes:** +6/-7

**PURPOSE:** Bug fix; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/admin-tool.md`

---

### 606. `438d06c` - test(integration): refactor PolarisRestCatalogIntegrationTest to run against any cloud provider (#1934)

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

### 607. `8784135` - Python code format (#1954)

**Date:** 2025-06-27 | **Author:** Yong Zheng | **PR:** [#1954](https://github.com/apache/polaris/pull/1954)
**Files:** 12 | **Changes:** +1212/-575

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified CLI in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Command Line Tools | Medium-scale change

**Files modified:**
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

### 608. `c5a4f73` - fix: Typo in Spark Client Build File (#1969)

**Date:** 2025-06-27 | **Author:** Russell Spitzer | **PR:** [#1969](https://github.com/apache/polaris/pull/1969)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix; CI/CD improvement

**WHAT CHANGED:** in Spark Plugin

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Spark Integration | Focused change

**Files modified:**
- `plugins/spark/v3.5/spark/build.gradle.kts`

---

### 609. `863817c` - Adds missing Google Flatbuffers license information (#1968)

**Date:** 2025-06-27 | **Author:** Russell Spitzer | **PR:** [#1968](https://github.com/apache/polaris/pull/1968)
**Files:** 1 | **Changes:** +8/-0

**PURPOSE:** New feature

**WHAT CHANGED:** in Spark Plugin

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Spark Integration | Focused change

**Files modified:**
- `plugins/spark/v3.5/spark/LICENSE`

---

### 610. `7c40e9d` - Add Sushant as a collaborator (#1956)

**Date:** 2025-06-27 | **Author:** Yufei Gu | **PR:** [#1956](https://github.com/apache/polaris/pull/1956)
**Files:** 1 | **Changes:** +1/-0

**PURPOSE:** New feature

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `.asf.yaml`

---

### 611. `c004728` - fix: Only include project LICENSE and NOTICE in Spark Client Jar (#1950)

**Date:** 2025-06-27 | **Author:** Russell Spitzer | **PR:** [#1950](https://github.com/apache/polaris/pull/1950)
**Files:** 1 | **Changes:** +89/-8

**PURPOSE:** Bug fix

**WHAT CHANGED:** in Spark Plugin

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Spark Integration | Focused change

**Files modified:**
- `plugins/spark/v3.5/spark/build.gradle.kts`

---

### 612. `9ff2ca1` - Mutable objects used for immutable values (#1596)

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

### 613. `a4992ca` - Fix lint rules (#1953)

**Date:** 2025-06-27 | **Author:** Yong Zheng | **PR:** [#1953](https://github.com/apache/polaris/pull/1953)
**Files:** 6 | **Changes:** +8/-10

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified CLI in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Command Line Tools | Focused change

**Files modified:**
- `client/python/cli/command/catalogs.py`
- `client/python/cli/command/namespaces.py`
- `client/python/cli/command/principal_roles.py`
- `client/python/cli/command/profiles.py`
- `client/python/cli/options/parser.py`
- `client/python/cli/polaris_cli.py`

---

### 614. `30acee6` - Fix hugo blockquote (#1967)

**Date:** 2025-06-27 | **Author:** Yong Zheng | **PR:** [#1967](https://github.com/apache/polaris/pull/1967)
**Files:** 20 | **Changes:** +142/-88

**PURPOSE:** Bug fix

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Medium-scale change

**Sample files (showing 15 of 20):**
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

---

### 615. `7d03992` - Fix invalid sample script in CLI doc (#1964)

**Date:** 2025-06-27 | **Author:** Yong Zheng | **PR:** [#1964](https://github.com/apache/polaris/pull/1964)
**Files:** 1 | **Changes:** +2/-5

**PURPOSE:** Bug fix; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/command-line-interface.md`

---

### 616. `303bc92` - Use multi-lines instead of single line (#1961)

**Date:** 2025-06-26 | **Author:** Yong Zheng | **PR:** [#1961](https://github.com/apache/polaris/pull/1961)
**Files:** 1 | **Changes:** +5/-3

**PURPOSE:** Code modification

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/getting-started/using-polaris.md`

---

### 617. `90153aa` - Remove the maintainer list in Helm Chart README (#1962)

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

### 618. `fa36aa3` - Update Helm chart version (#1957)

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

### 619. `96b8be3` - Add SUPPORTED_EXTERNAL_CATALOG_AUTHENTICATION_TYPES feature configuration (#1931)

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

### 620. `1e69373` - Optimize the location overlap check with an index (#1686)

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

### 621. `c667b3a` - Fix doc for sample log and default password (#1951)

**Date:** 2025-06-26 | **Author:** MonkeyCanCode | **PR:** [#1951](https://github.com/apache/polaris/pull/1951)
**Files:** 1 | **Changes:** +8/-8

**PURPOSE:** Bug fix; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/getting-started/quickstart.md`

**Additional details from commit message:**
```
1. update sample output to reflect with the latest code
2. update default password to the right value
3. remove trailing space
```

---

### 622. `3fea897` - Fix NPE in listCatalogs (#1949)

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

### 623. `e7a009f` - fix(build): Fix deprecation warnings in FeatureConfiguration (#1894)

**Date:** 2025-06-26 | **Author:** Alexandre Dutra | **PR:** [#1894](https://github.com/apache/polaris/pull/1894)
**Files:** 1 | **Changes:** +8/-0

**PURPOSE:** Bug fix; New feature; Deprecation; CI/CD improvement

**WHAT CHANGED:** in Core

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/config/FeatureConfiguration.java`

---

### 624. `d51beed` - Fix admin tool for quick start (#1945)

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

### 625. `9a32d25` - Simplify install dependency doc (#1941)

**Date:** 2025-06-25 | **Author:** MonkeyCanCode | **PR:** [#1941](https://github.com/apache/polaris/pull/1941)
**Files:** 1 | **Changes:** +5/-3

**PURPOSE:** Code refactoring; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/getting-started/install-dependencies.md`

**Additional details from commit message:**
```
* Simply install dependecy doc
* Minor words change
```

---

### 626. `1dc990c` - Update doc to fix docker build inconsistency issue (#1946)

**Date:** 2025-06-25 | **Author:** MonkeyCanCode | **PR:** [#1946](https://github.com/apache/polaris/pull/1946)
**Files:** 1 | **Changes:** +3/-2

**PURPOSE:** Bug fix; Documentation update; CI/CD improvement

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/getting-started/quickstart.md`

---

### 627. `22eaff4` - Fix Pagination for Catalog Federation (#1849)

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

### 628. `031419f` - enable ETag integration tests (#1935)

**Date:** 2025-06-25 | **Author:** Christopher Lambert | **PR:** [#1935](https://github.com/apache/polaris/pull/1935)
**Files:** 1 | **Changes:** +0/-10

**PURPOSE:** Test improvement

**WHAT CHANGED:** including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisRestCatalogIntegrationTest.java`

---

### 629. `7a086fc` - Exclude unused dependency for polaris spark client dependency (#1933)

**Date:** 2025-06-24 | **Author:** Yun Zou | **PR:** [#1933](https://github.com/apache/polaris/pull/1933)
**Files:** 1 | **Changes:** +1/-11

**PURPOSE:** Code modification

**WHAT CHANGED:** in Spark Plugin

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Spark Integration | Focused change

**Files modified:**
- `plugins/spark/v3.5/spark/build.gradle.kts`

---

### 630. `9b5325b` - Testing: admin-tool testing workaround (#1918)

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

### 631. `93938fd` - Update spark client to use the shaded iceberg-core in iceberg-spark-runtime to avoid spark compatibilities issue (#1908)

**Date:** 2025-06-23 | **Author:** Yun Zou | **PR:** [#1908](https://github.com/apache/polaris/pull/1908)
**Files:** 21 | **Changes:** +961/-81

**PURPOSE:** Bug fix; Dependency update; Documentation update

**WHAT CHANGED:** in Spark Plugin including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Spark Integration | Large-scale change affecting multiple modules

**Sample files (showing 15 of 21):**
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

**Additional details from commit message:**
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

---

### 632. `fe81542` - fix(build): Gradle caching effectively not working (#1922)

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

### 633. `f5871c5` - Revert "Reuse shadowJar for spark client bundle jar maven publish (#1857)" (#1921)

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

### 634. `5745ae1` - Add doc for rollback config (#1919)

**Date:** 2025-06-20 | **Author:** Prashant Singh | **PR:** [#1919](https://github.com/apache/polaris/pull/1919)
**Files:** 1 | **Changes:** +39/-38

**PURPOSE:** New feature; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/configuration.md`

---

### 635. `cd59302` - fix: unify bootstrap credentials and standardize POLARIS setup (#1905)

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

### 636. `793cf08` - Feature: Rollback compaction on conflict (#1285)

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

### 637. `7bb0f93` - main: Update Quarkus Platform and Group to v3.23.3 (#1797)

**Date:** 2025-06-20 | **Author:** Mend Renovate | **PR:** [#1797](https://github.com/apache/polaris/pull/1797)
**Files:** 2 | **Changes:** +4/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 2 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`
- `runtime/admin/build.gradle.kts`

**Additional details from commit message:**
```
* Adopt polaris-admin test invocation
---------
Co-authored-by: Robert Stupp <snazy@snazy.de>
```

---

### 638. `9fd13c4` - fix(ci): Remove dummy "build" job from Gradle CI (#1911)

**Date:** 2025-06-19 | **Author:** Alexandre Dutra | **PR:** [#1911](https://github.com/apache/polaris/pull/1911)
**Files:** 1 | **Changes:** +0/-10

**PURPOSE:** Bug fix; Code removal; CI/CD improvement

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/gradle.yml`

---

### 639. `1f7f127` - Reuse shadowJar for spark client bundle jar maven publish (#1857)

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

### 640. `45df8ac` - Improve the parsing and validation of UserSecretReferenceUrns (#1840)

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

### 641. `48e7e88` - Add webpage for Generic Table support (#1889)

**Date:** 2025-06-18 | **Author:** Yun Zou | **PR:** [#1889](https://github.com/apache/polaris/pull/1889)
**Files:** 1 | **Changes:** +169/-0

**PURPOSE:** New feature

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/generic-table.md`

**Additional details from commit message:**
```
* add comment
* address feedback
* update limitations
* update docs
* update doc
* address feedback
```

---

### 642. `5441bb6` - feat(ci): Split Java Gradle CI in many jobs to reduce execution time (#1897)

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

### 643. `0e8367b` - docs: Add `Polaris Evolution` page (#1890)

**Date:** 2025-06-18 | **Author:** Dmitri Bourlatchkov | **PR:** [#1890](https://github.com/apache/polaris/pull/1890)
**Files:** 2 | **Changes:** +120/-0

**PURPOSE:** New feature; Security enhancement; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/in-dev/unreleased/configuring-polaris-for-production.md`
- `site/content/in-dev/unreleased/evolution.md`

**Additional details from commit message:**
```
Co-authored-by: Eric Maynard <emaynard@apache.org>
```

---

### 644. `fccc51a` - Rename runtime/test-commons to runtime/test-common (for consistency with module name) (#1906)

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

### 645. `ab228af` - Rename quarkus as runtime (#1695)

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

### 646. `c15e62b` - Remove `.github/CODEOWNERS` (#1902)

**Date:** 2025-06-17 | **Author:** Robert Stupp | **PR:** [#1902](https://github.com/apache/polaris/pull/1902)
**Files:** 1 | **Changes:** +0/-20

**PURPOSE:** Code removal

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `.github/CODEOWNERS`

---

### 647. `5a188b2` - Python CI: pin mypy version to avoid CI failure due to new release (#1903)

**Date:** 2025-06-16 | **Author:** Honah (Jonas) J. | **PR:** [#1903](https://github.com/apache/polaris/pull/1903)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

**Additional details from commit message:**
```
```
 | Unable to find installation candidates for mypy (1.16.1)
    | 
    | This is likely not a Poetry issue.
    | 
    |   - 14 candidate(s) were identified for the package
    |   - 14 wheel(s) were skipped as your project's environment does not support the identified abi tags
    | 
    | Solutions:
    | Make sure the lockfile is up-to-date. You can try one of the following;
    | 
    |     1. Regenerate lockfile: poetry lock --no-cache --regenerate
    |     2. Update package     : p...
```

---

### 648. `f38ac8a` - feat(build): Add Checkstyle plugin and an IllegalImport rule (#1880)

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

### 649. `2d3d0d0` - Do not use relative path inside CLI script

**Date:** 2025-06-14 | **Author:** Eric Maynard | **PR:** N/A
**Files:** 1 | **Changes:** +2/-2

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris`

---

### 650. `751f8a7` - Add Polaris community meeting record for 2025-06-12 (#1892)

**Date:** 2025-06-14 | **Author:** JB Onofré | **PR:** [#1892](https://github.com/apache/polaris/pull/1892)
**Files:** 1 | **Changes:** +8/-4

**PURPOSE:** New feature

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `site/content/community/meetings/_index.adoc`

---

### 651. `5aefa18` - Enable patch version updates for maintained Polaris version (#1891)

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

### 652. `a683de3` - fix(build): Fix deprecation warnings in PolarisIntegrationTestExtension (#1895)

**Date:** 2025-06-13 | **Author:** Alexandre Dutra | **PR:** [#1895](https://github.com/apache/polaris/pull/1895)
**Files:** 1 | **Changes:** +2/-3

**PURPOSE:** Bug fix; Deprecation; Test improvement; CI/CD improvement

**WHAT CHANGED:** including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `integration-tests/src/main/java/org/apache/polaris/service/it/ext/PolarisIntegrationTestExtension.java`

---

### 653. `eb38bf4` - main: Update dependency boto3 to v1.38.36 (#1886)

**Date:** 2025-06-13 | **Author:** Mend Renovate | **PR:** [#1886](https://github.com/apache/polaris/pull/1886)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 654. `8fc81f3` - main: Update registry.access.redhat.com/ubi9/openjdk-21-runtime Docker tag to v1.22-1.1749462970 (#1887)

**Date:** 2025-06-13 | **Author:** Mend Renovate | **PR:** [#1887](https://github.com/apache/polaris/pull/1887)
**Files:** 2 | **Changes:** +2/-2

**PURPOSE:** Documentation update

**WHAT CHANGED:** Modified 2 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `quarkus/admin/src/main/docker/Dockerfile.jvm`
- `quarkus/server/src/main/docker/Dockerfile.jvm`

---

### 655. `36005ab` - main: Update dependency io.smallrye.config:smallrye-config-core to v3.13.2 (#1888)

**Date:** 2025-06-13 | **Author:** Mend Renovate | **PR:** [#1888](https://github.com/apache/polaris/pull/1888)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 656. `01b7322` - Avoid using org.testcontainers.shaded.** (#1876)

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

### 657. `ea47367` - Fix two wrong links in README.md (#1879)

**Date:** 2025-06-12 | **Author:** Yufei Gu | **PR:** [#1879](https://github.com/apache/polaris/pull/1879)
**Files:** 1 | **Changes:** +4/-4

**PURPOSE:** Bug fix; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `README.md`

---

### 658. `2a2bcde` - JDBC: Refactor DatabaseOps (#1843)

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

### 659. `7899d93` - Bump version in version.txt

**Date:** 2025-06-12 | **Author:** Eric Maynard | **PR:** N/A
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `version.txt`

---

### 660. `a8a78c4` - Cleanup unnecessary files in client/python (#1878)

**Date:** 2025-06-12 | **Author:** Honah (Jonas) J. | **PR:** [#1878](https://github.com/apache/polaris/pull/1878)
**Files:** 429 | **Changes:** +45/-39207

**PURPOSE:** Code refactoring

**WHAT CHANGED:** Modified Client Library in Documentation, Python Client including test updates

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API, User Documentation | Large-scale change affecting multiple modules | May affect API consumers

**Sample files (showing 15 of 429):**
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

---

### 661. `0faf948` - Removing star import and adding errorprone rule (#1831)

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

### 662. `9463a61` - main: Update dependency boto3 to v1.38.35 (#1874)

**Date:** 2025-06-12 | **Author:** Mend Renovate | **PR:** [#1874](https://github.com/apache/polaris/pull/1874)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 663. `a12bf26` - main: Update gradle/actions digest to ac638b0 (#1877)

**Date:** 2025-06-12 | **Author:** Mend Renovate | **PR:** [#1877](https://github.com/apache/polaris/pull/1877)
**Files:** 2 | **Changes:** +2/-2

**PURPOSE:** Code modification

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/gradle.yml`
- `.github/workflows/nightly.yml`

---

### 664. `2dfdac3` - Fix telemetry quickstart example for 1.0 release (#1873)

**Date:** 2025-06-11 | **Author:** William Hyun | **PR:** [#1873](https://github.com/apache/polaris/pull/1873)
**Files:** 2 | **Changes:** +15/-6

**PURPOSE:** Bug fix

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `getting-started/telemetry/README.md`
- `getting-started/telemetry/docker-compose.yml`

---

### 665. `3958ded` - Remove generated Python client from git tracking (#1810)

**Date:** 2025-06-11 | **Author:** Eric Maynard | **PR:** [#1810](https://github.com/apache/polaris/pull/1810)
**Files:** 233 | **Changes:** +14/-58614

**PURPOSE:** Code removal

**WHAT CHANGED:** Modified Client Library in Documentation, Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API, User Documentation | Large-scale change affecting multiple modules | May affect API consumers

**Sample files (showing 15 of 233):**
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

---

### 666. `5ea964b` - Enhance EclipseLink quickstart (#1870)

**Date:** 2025-06-11 | **Author:** Honah (Jonas) J. | **PR:** [#1870](https://github.com/apache/polaris/pull/1870)
**Files:** 2 | **Changes:** +10/-11

**PURPOSE:** Code modification

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `getting-started/eclipselink/README.md`
- `getting-started/eclipselink/docker-compose.yml`

**Additional details from commit message:**
```
2. Update the name of `eclipselink-trino-1` to `polaris-trino-1`
3. make the polaris server url consistent with using `localhost` to avoid failures
```

---

### 667. `8942f68` - Remove PolarisConfiguration.loadConfig (v2) (#1858)

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

### 668. `6db498a` - Update JDBC Getting-started example's README.md to use localhost for curl commands (#1872)

**Date:** 2025-06-11 | **Author:** Honah (Jonas) J. | **PR:** [#1872](https://github.com/apache/polaris/pull/1872)
**Files:** 1 | **Changes:** +3/-4

**PURPOSE:** Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `getting-started/jdbc/README.md`

---

### 669. `6b57d12` - Add integration tests to Python Client (#1856)

**Date:** 2025-06-11 | **Author:** Honah (Jonas) J. | **PR:** [#1856](https://github.com/apache/polaris/pull/1856)
**Files:** 10 | **Changes:** +791/-4

**PURPOSE:** New feature

**WHAT CHANGED:** Modified Client Library in CI/CD, Python Client

**WHY NEEDED:** to improve client usability; to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation, Client API | Focused change | May affect API consumers

**Files modified:**
- `.github/workflows/python-client.yml`
- `client/python/.openapi-generator-ignore`
- `client/python/.pre-commit-config.yaml`
- `client/python/Makefile`
- `client/python/docker-compose.yml`
- `client/python/integration_tests/conftest.py`
- `client/python/integration_tests/test_catalog_apis.py`
- `client/python/integration_tests/test_management_apis.py`
- `client/python/pyproject.toml`
- `client/templates/regenerate.sh`

---

### 670. `97c9440` - Update LICENSE for binary distributions (#1855)

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

### 671. `6cd6558` - [SPEC] Add base-location keyword for GenericTable API (#1543)

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

### 672. `66b6d9e` - main: Update dependency org.postgresql:postgresql to v42.7.7 (#1859)

**Date:** 2025-06-11 | **Author:** Mend Renovate | **PR:** [#1859](https://github.com/apache/polaris/pull/1859)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 673. `3e4954c` - main: Update dependency boto3 to v1.38.34 (#1852)

**Date:** 2025-06-11 | **Author:** Mend Renovate | **PR:** [#1852](https://github.com/apache/polaris/pull/1852)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 674. `3d1d149` - main: Update dependency io.opentelemetry.semconv:opentelemetry-semconv to v1.34.0 (#1850)

**Date:** 2025-06-11 | **Author:** Mend Renovate | **PR:** [#1850](https://github.com/apache/polaris/pull/1850)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 675. `edcf9aa` - main: Update docker.io/jaegertracing/all-in-one Docker tag to v1.70.0 (#1853)

**Date:** 2025-06-11 | **Author:** Mend Renovate | **PR:** [#1853](https://github.com/apache/polaris/pull/1853)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Documentation update; CI/CD improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `getting-started/telemetry/docker-compose.yml`

---

### 676. `e2ab322` - Add Yun Zou as the new committer

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

### 677. `21bd498` - Update LICENCE (#1851)

**Date:** 2025-06-10 | **Author:** Yufei Gu | **PR:** [#1851](https://github.com/apache/polaris/pull/1851)
**Files:** 1 | **Changes:** +0/-2

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `LICENSE`

---

### 678. `af1643c` - Update spark client license (#1839)

**Date:** 2025-06-10 | **Author:** gh-yzou | **PR:** [#1839](https://github.com/apache/polaris/pull/1839)
**Files:** 1 | **Changes:** +0/-2

**PURPOSE:** Code modification

**WHAT CHANGED:** in Spark Plugin

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Spark Integration | Focused change

**Files modified:**
- `plugins/spark/v3.5/spark/LICENSE`

---

### 679. `9470d0d` - docs: fix broken 'Polaris Overview' link in README.md (#1846)

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

### 680. `0f800ee` - main: Update dependency io.projectreactor.netty:reactor-netty-http to v1.2.7 (#1845)

**Date:** 2025-06-10 | **Author:** Mend Renovate | **PR:** [#1845](https://github.com/apache/polaris/pull/1845)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/build.gradle.kts`

---

### 681. `9934fc4` - main: Update dependency boto3 to v1.38.33 (#1841)

**Date:** 2025-06-10 | **Author:** Mend Renovate | **PR:** [#1841](https://github.com/apache/polaris/pull/1841)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 682. `2f1d6bb` - main: Update dependency io.micrometer:micrometer-bom to v1.15.1 (#1842)

**Date:** 2025-06-10 | **Author:** Mend Renovate | **PR:** [#1842](https://github.com/apache/polaris/pull/1842)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 683. `5c8c429` - Fix LICENSE and NOTICE in Spark plugin (#1834)

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

### 684. `dcd68db` - Fix the issue where the Polaris Server exposes backend metadata in the error response body when the database is not bootstrapped. (#1837)

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

### 685. `dccf676` - main: Update dependency software.amazon.awssdk:bom to v2.31.59 (#1835)

**Date:** 2025-06-09 | **Author:** Mend Renovate | **PR:** [#1835](https://github.com/apache/polaris/pull/1835)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 686. `86c6fac` - main: Update dependency com.github.ben-manes.caffeine:caffeine to v3.2.1 (#1836)

**Date:** 2025-06-09 | **Author:** Mend Renovate | **PR:** [#1836](https://github.com/apache/polaris/pull/1836)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 687. `a9ad720` - Core: Fix  maxCode generation for ConnectionTypeEnum (#1827)

**Date:** 2025-06-08 | **Author:** Pooja Nilangekar | **PR:** [#1827](https://github.com/apache/polaris/pull/1827)
**Files:** 1 | **Changes:** +1/-4

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified Connection Management in Core

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: External Integrations | Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/connection/ConnectionType.java`

---

### 688. `9fbcf8d` - Update versions in LICENSE and NOTICE (#1833)

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

### 689. `be3fee8` - Spark: Add license and notice to spark client jar and push jar to maven (#1830)

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

### 690. `c10b9be` - main: Update dependency io.opentelemetry:opentelemetry-bom to v1.51.0 (#1829)

**Date:** 2025-06-07 | **Author:** Mend Renovate | **PR:** [#1829](https://github.com/apache/polaris/pull/1829)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 691. `71f9bb4` - main: Update dependency boto3 to v1.38.32 (#1828)

**Date:** 2025-06-07 | **Author:** Mend Renovate | **PR:** [#1828](https://github.com/apache/polaris/pull/1828)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 692. `27c4037` - main: Update dependency org.junit:junit-bom to v5.13.1 (#1832)

**Date:** 2025-06-07 | **Author:** Mend Renovate | **PR:** [#1832](https://github.com/apache/polaris/pull/1832)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 693. `b3a4299` - Remove "unused" files in client/python (#1678)

**Date:** 2025-06-07 | **Author:** JB Onofré | **PR:** [#1678](https://github.com/apache/polaris/pull/1678)
**Files:** 5 | **Changes:** +0/-146

**PURPOSE:** Code removal

**WHAT CHANGED:** Modified Client Library in CI/CD, Python Client

**WHY NEEDED:** to improve client usability; to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation, Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/.github/workflows/python.yml`
- `client/python/.gitlab-ci.yml`
- `client/python/.openapi-generator-ignore`
- `client/python/.openapi-generator/FILES`
- `client/python/.travis.yml`

---

### 694. `f393a1d` - JDBC: Use PreparedStatement (#1802)

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

### 695. `1655dae` - main: Update dependency io.smallrye.config:smallrye-config-core to v3.13.1 (#1826)

**Date:** 2025-06-06 | **Author:** Mend Renovate | **PR:** [#1826](https://github.com/apache/polaris/pull/1826)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 696. `e91d2c3` - Downgrade open api generator to 7.11 (#1823)

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

### 697. `5509353` - main: Update dependency boto3 to v1.38.31 (#1803)

**Date:** 2025-06-06 | **Author:** Mend Renovate | **PR:** [#1803](https://github.com/apache/polaris/pull/1803)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 698. `8945291` - main: Pin actions/setup-java action to c5195ef (#1809)

**Date:** 2025-06-06 | **Author:** Mend Renovate | **PR:** [#1809](https://github.com/apache/polaris/pull/1809)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/python-client.yml`

---

### 699. `b573735` - main: Update dependency com.google.cloud:google-cloud-storage-bom to v2.53.0 (#1811)

**Date:** 2025-06-06 | **Author:** Mend Renovate | **PR:** [#1811](https://github.com/apache/polaris/pull/1811)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 700. `9d201b4` - main: Update dependency io.netty:netty-codec-http2 to v4.2.2.Final (#1819)

**Date:** 2025-06-06 | **Author:** Mend Renovate | **PR:** [#1819](https://github.com/apache/polaris/pull/1819)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/build.gradle.kts`

---

### 701. `553b644` - main: Update dependency gradle to v8.14.2 (#1820)

**Date:** 2025-06-06 | **Author:** Mend Renovate | **PR:** [#1820](https://github.com/apache/polaris/pull/1820)
**Files:** 1 | **Changes:** +2/-2

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/wrapper/gradle-wrapper.properties`

**Additional details from commit message:**
```
* adjust to Polaris build
---------
Co-authored-by: Dmitri Bourlatchkov <dmitri.bourlatchkov@dremio.com>
```

---

### 702. `3185adf` - Refactor getConfiguration to use RealmContext (Part 2) (#1783)

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

### 703. `187d700` - Turn CallContext.copyOf into an interface instead of static function (#1816)

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

### 704. `a59942a` - Remove CallContext.getDiagnostics (#1815)

**Date:** 2025-06-04 | **Author:** Honah (Jonas) J. | **PR:** [#1815](https://github.com/apache/polaris/pull/1815)
**Files:** 1 | **Changes:** +0/-5

**PURPOSE:** Code removal

**WHAT CHANGED:** Modified Context Management in Core

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Request Handling | Focused change

**Files modified:**
- `polaris-core/src/main/java/org/apache/polaris/core/context/CallContext.java`

---

### 705. `511df8c` - Remove CallContext.of (#1812)

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

### 706. `5132312` - Remove deprecated constructor for PolarisCallContext (#1813)

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

### 707. `3b18e0d` - Automate regeneration of Python client (#1675)

**Date:** 2025-06-04 | **Author:** Eric Maynard | **PR:** [#1675](https://github.com/apache/polaris/pull/1675)
**Files:** 93 | **Changes:** +1446/-685

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** Modified Client Library in CI/CD, Documentation, Python Client including test updates

**WHY NEEDED:** to improve client usability; to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation, Client API, User Documentation | Large-scale change affecting multiple modules | May affect API consumers

**Sample files (showing 15 of 93):**
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

**Additional details from commit message:**
```
As part of this change, I've also updated the generator to 7.12 to match what's in the `libs.version.toml` and regenerated the code managed in github.
Once the automatic generation works as part of CI, we can remove the generated code from the repo altogether. In the future, it can be added to .gitignore.
```

---

### 708. `0a8d8b8` - Core: Consolidate CallContext with PolarisCallContext part 1(#1806)

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

### 709. `da0ceff` - Don't rotate root's credentials on startup in JdbcMetaStoreManagerFactory (#1804)

**Date:** 2025-06-03 | **Author:** Eric Maynard | **PR:** [#1804](https://github.com/apache/polaris/pull/1804)
**Files:** 1 | **Changes:** +7/-18

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified JDBC Persistence in Persistence

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Relational Databases | Focused change

**Files modified:**
- `persistence/relational-jdbc/src/main/java/org/apache/polaris/persistence/relational/jdbc/JdbcMetaStoreManagerFactory.java`

---

### 710. `65cb39e` - Update ascii banner (#1654)

**Date:** 2025-06-03 | **Author:** Scott Teal | **PR:** [#1654](https://github.com/apache/polaris/pull/1654)
**Files:** 1 | **Changes:** +21/-20

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `service/common/src/main/resources/org/apache/polaris/service/banner.txt`

---

### 711. `d9397a5` - Test: silence CDS warning from admin tool tests (#1800)

**Date:** 2025-06-03 | **Author:** Robert Stupp | **PR:** [#1800](https://github.com/apache/polaris/pull/1800)
**Files:** 1 | **Changes:** +6/-0

**PURPOSE:** Test improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `quarkus/admin/build.gradle.kts`

---

### 712. `2a71098` - Remove the unused field in CallContextCatalogFactory (#1784)

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

### 713. `0a9a5d9` - feat(cdi): Remove CallContext.close() (#1776)

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

### 714. `90c2580` - main: Update apache/spark Docker tag to v3.5.6 (#1791)

**Date:** 2025-06-03 | **Author:** Mend Renovate | **PR:** [#1791](https://github.com/apache/polaris/pull/1791)
**Files:** 2 | **Changes:** +2/-2

**PURPOSE:** Documentation update

**WHAT CHANGED:** Modified 2 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `getting-started/eclipselink/docker-compose.yml`
- `getting-started/jdbc/docker-compose.yml`

---

### 715. `0379ecf` - main: Update dependency org.apache.spark:spark-sql_2.12 to v3.5.6 (#1794)

**Date:** 2025-06-03 | **Author:** Mend Renovate | **PR:** [#1794](https://github.com/apache/polaris/pull/1794)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `integration-tests/build.gradle.kts`

---

### 716. `535d69e` - main: Update docker.io/apache/spark Docker tag to v3.5.6 (#1795)

**Date:** 2025-06-03 | **Author:** Mend Renovate | **PR:** [#1795](https://github.com/apache/polaris/pull/1795)
**Files:** 2 | **Changes:** +2/-2

**PURPOSE:** Documentation update

**WHAT CHANGED:** in Spark Plugin

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Spark Integration | Focused change

**Files modified:**
- `plugins/spark/v3.5/regtests/Dockerfile`
- `regtests/Dockerfile`

---

### 717. `a1b2ae7` - main: Update dependency org.apache.spark:spark-sql_2.12 to v3.5.6 (#1752)

**Date:** 2025-06-03 | **Author:** Mend Renovate | **PR:** [#1752](https://github.com/apache/polaris/pull/1752)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 718. `79a182c` - main: Update dependency software.amazon.awssdk:bom to v2.31.54 (#1769)

**Date:** 2025-06-03 | **Author:** Mend Renovate | **PR:** [#1769](https://github.com/apache/polaris/pull/1769)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 719. `a827d26` - Run renovatebot only on the main branch (#1786)

**Date:** 2025-06-03 | **Author:** JB Onofré | **PR:** [#1786](https://github.com/apache/polaris/pull/1786)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `.github/renovate.json5`

---

### 720. `d9edb23` - main: Update dependency boto3 to v1.38.28 (#1777)

**Date:** 2025-06-03 | **Author:** Mend Renovate | **PR:** [#1777](https://github.com/apache/polaris/pull/1777)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 721. `5c2dcca` - main: Update dependency pytest to v8 (#1710)

**Date:** 2025-06-03 | **Author:** Mend Renovate | **PR:** [#1710](https://github.com/apache/polaris/pull/1710)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update; Test improvement

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/test-requirements.txt`

---

### 722. `980011e` - main: Pin dependencies (#1701)

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

### 723. `4528db1` - JDBC: Fix getting started config (#1781)

**Date:** 2025-06-02 | **Author:** Prashant Singh | **PR:** [#1781](https://github.com/apache/polaris/pull/1781)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `getting-started/jdbc/docker-compose.yml`

---

### 724. `5fe9fd9` - Replace getConfiguration usage with PolarisCallContext to use RealmContext (PART 1) (#1780)

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

### 725. `8f906a6` - Re-add missing parameters to create_table python API (#1778)

**Date:** 2025-06-02 | **Author:** Eric Maynard | **PR:** [#1778](https://github.com/apache/polaris/pull/1778)
**Files:** 4 | **Changes:** +40/-2

**PURPOSE:** New feature; CI/CD improvement

**WHAT CHANGED:** Modified Client Library in Documentation, OpenAPI Specs, Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: API Contracts, Client API, User Documentation | Focused change | May affect API consumers

**Files modified:**
- `client/python/docs/IcebergCatalogAPI.md`
- `client/python/polaris/catalog/api/iceberg_catalog_api.py`
- `spec/generated/bundled-polaris-catalog-service.yaml`
- `spec/iceberg-rest-catalog-open-api.yaml`

**Additional details from commit message:**
```
```
redocly bundle spec/polaris-catalog-service.yaml -o spec/generated/bundled-polaris-catalog-service.yaml
./gradlew regeneratePythonClient
```
Then, some manual reverts:
```
alias gitrevert='git checkout upstream/main --'
gitrevert client/python/.github/workflows/python.yml
gitrevert client/python/.gitlab-ci.yml
gitrevert client/python/pyproject.toml
```
I still hope to automate this process as part of CI soon; see #1675
```

---

### 726. `dd987b6` - Restructure the directory and package name for persistence modules (#1724)

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

### 727. `dd2fdf9` - Handle RequestScoped instance injection gracefully for DefaultConfigurationStore (#1758)

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

### 728. `9c09e03` - Add unit test for legacy config lookup (#1774)

**Date:** 2025-06-02 | **Author:** Dmitri Bourlatchkov | **PR:** [#1774](https://github.com/apache/polaris/pull/1774)
**Files:** 1 | **Changes:** +38/-0

**PURPOSE:** New feature; Test improvement

**WHAT CHANGED:** including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `polaris-core/src/test/java/org/apache/polaris/service/storage/PolarisConfigurationStoreTest.java`

---

### 729. `23f6480` - Testing: silence a bunch of harmless test warnings (#1773)

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

### 730. `4a7fbaa` - main: Update docker.io/prom/prometheus Docker tag to v3.4.1 (#1767)

**Date:** 2025-06-02 | **Author:** Mend Renovate | **PR:** [#1767](https://github.com/apache/polaris/pull/1767)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Documentation update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `getting-started/telemetry/docker-compose.yml`

---

### 731. `f158f2e` - Unblock test `createViewWithCustomMetadataLocation` (#1320)

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

### 732. `7f97a95` - Use canonical catalog property names in tests (#1766)

**Date:** 2025-06-02 | **Author:** Dmitri Bourlatchkov | **PR:** [#1766](https://github.com/apache/polaris/pull/1766)
**Files:** 2 | **Changes:** +8/-8

**PURPOSE:** Test improvement

**WHAT CHANGED:** including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisPolicyServiceIntegrationTest.java`
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisRestCatalogIntegrationTest.java`

**Additional details from commit message:**
```
* In `PolarisRestCatalogIntegrationTest`
Following up to #1557
```

---

### 733. `370b74c` - Fix regression test docker setup for purge (#1768)

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

### 734. `b7aac72` - main: Update dependency boto3 to v1.38.27 (#1714)

**Date:** 2025-06-02 | **Author:** Mend Renovate | **PR:** [#1714](https://github.com/apache/polaris/pull/1714)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 735. `7b985e2` - Regenerate bundled spec & Regenerate Python client (#1751)

**Date:** 2025-05-30 | **Author:** Eric Maynard | **PR:** [#1751](https://github.com/apache/polaris/pull/1751)
**Files:** 44 | **Changes:** +1743/-170

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified Client Library in Documentation, OpenAPI Specs, Python Client including test updates

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: API Contracts, Client API, User Documentation | Large-scale change affecting multiple modules | May affect API consumers

**Sample files (showing 15 of 44):**
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

**Additional details from commit message:**
```
```
redocly bundle spec/polaris-catalog-service.yaml -o spec/generated/bundled-polaris-catalog-service.yaml
./gradlew regeneratePythonClient
```
I didn't realize before that some Python types are generated form the bundled spec, so some of the fixes from #1347 didn't get properly applied before.
```

---

### 736. `f1a521e` - Fix test_spark_credentials_s3_exception_on_metadata_file_deletion (#1759)

**Date:** 2025-05-30 | **Author:** gh-yzou | **PR:** [#1759](https://github.com/apache/polaris/pull/1759)
**Files:** 1 | **Changes:** +8/-5

**PURPOSE:** Bug fix; Test improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `regtests/t_pyspark/src/test_spark_sql_s3_with_privileges.py`

---

### 737. `0bb062e` - fix: Improve reliability of metrics tests (#1763)

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

### 738. `39189cd` - main: Update dependency org.testcontainers:testcontainers-bom to v1.21.1 (#1748)

**Date:** 2025-05-30 | **Author:** Mend Renovate | **PR:** [#1748](https://github.com/apache/polaris/pull/1748)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update; Test improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 739. `bc2c0eb` - main: Update dependency org.junit:junit-bom to v5.13.0 (#1760)

**Date:** 2025-05-30 | **Author:** Mend Renovate | **PR:** [#1760](https://github.com/apache/polaris/pull/1760)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 740. `59ab382` - Fixes for direct usage of client_secret #1756

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

### 741. `81798f1` - Production readiness for Persistence (#1707)

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

### 742. `721614a` - Remove unused adminDocs artifact (#1749)

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

### 743. `046fa70` - Fix a failing task with the release profile (#1693)

**Date:** 2025-05-29 | **Author:** Yufei Gu | **PR:** [#1693](https://github.com/apache/polaris/pull/1693)
**Files:** 1 | **Changes:** +15/-7

**PURPOSE:** Bug fix

**WHAT CHANGED:** including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `tools/version/src/jarTest/java/org/apache/polaris/version/TestPolarisVersion.java`

---

### 744. `56d1609` - Create LICENSE and NOTICE for "single" distribution (#1694)

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

### 745. `ce3efe6` - Merge JPA module with EclipseLink Module (#1718)

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

### 746. `a0436f0` - Keep generated RSA-key-pair for JWT token broker on heap (#1661)

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

### 747. `f7d7f58` - main: Update dependency boto3 to v1.38.24 (#1702)

**Date:** 2025-05-28 | **Author:** Mend Renovate | **PR:** [#1702](https://github.com/apache/polaris/pull/1702)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 748. `f7f4c80` - main: Update dependency com.adobe.testing:s3mock-testcontainers to v4.4.0 (#1705)

**Date:** 2025-05-28 | **Author:** Mend Renovate | **PR:** [#1705](https://github.com/apache/polaris/pull/1705)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update; Test improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 749. `8aab26d` - main: Update dependency com.azure:azure-sdk-bom to v1.2.35 (#1703)

**Date:** 2025-05-28 | **Author:** Mend Renovate | **PR:** [#1703](https://github.com/apache/polaris/pull/1703)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 750. `f16f50b` - Site/contributing: add recommendations for working with PRs (#1625)

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

### 751. `97d16d3` - feat(metrics): Mitigate potential performance issues with realm_id tag (#1662)

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

### 752. `f93e347` - main: Update medyagh/setup-minikube action to v0.0.19 (#1698)

**Date:** 2025-05-28 | **Author:** Mend Renovate | **PR:** [#1698](https://github.com/apache/polaris/pull/1698)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/helm.yml`

---

### 753. `258f088` - main: Update gradle/actions digest to 8379f6a (#1696)

**Date:** 2025-05-28 | **Author:** Mend Renovate | **PR:** [#1696](https://github.com/apache/polaris/pull/1696)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/gradle.yml`

---

### 754. `5518a0f` - main: Update helm/chart-testing-action action to v2.7.0 (#1700)

**Date:** 2025-05-28 | **Author:** Mend Renovate | **PR:** [#1700](https://github.com/apache/polaris/pull/1700)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Test improvement

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/helm.yml`

---

### 755. `9b8c647` - main: Update dependency org.postgresql:postgresql to v42.7.6 (#1697)

**Date:** 2025-05-28 | **Author:** Mend Renovate | **PR:** [#1697](https://github.com/apache/polaris/pull/1697)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 756. `493de03` - main: Update dependency com.diffplug.spotless:spotless-plugin-gradle to v7.0.4 (#1690)

**Date:** 2025-05-28 | **Author:** Mend Renovate | **PR:** [#1690](https://github.com/apache/polaris/pull/1690)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/baselibs.versions.toml`

---

### 757. `3b9d2b0` - Fix credentials printing twice (#1682)

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

### 758. `7961fdd` - Fix the manual test broken by PR #1532 (#1688)

**Date:** 2025-05-27 | **Author:** Yufei Gu | **PR:** [#1688](https://github.com/apache/polaris/pull/1688)
**Files:** 1 | **Changes:** +7/-1

**PURPOSE:** Bug fix; Test improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `quarkus/server/build.gradle.kts`

---

### 759. `408389f` - Fix getting-started docker start by PR #1532 (#1687)

**Date:** 2025-05-27 | **Author:** gh-yzou | **PR:** [#1687](https://github.com/apache/polaris/pull/1687)
**Files:** 3 | **Changes:** +7/-1

**PURPOSE:** Bug fix; Documentation update

**WHAT CHANGED:** in Spark Plugin

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Spark Integration | Focused change

**Files modified:**
- `getting-started/spark/docker-compose.yml`
- `getting-started/spark/notebooks/Dockerfile`
- `plugins/spark/v3.5/getting-started/docker-compose.yml`

---

### 760. `d8c8920` - Improve test coverage for invalid inputs in Policy APIs (#1665)

**Date:** 2025-05-27 | **Author:** William Hyun | **PR:** [#1665](https://github.com/apache/polaris/pull/1665)
**Files:** 1 | **Changes:** +254/-0

**PURPOSE:** Test improvement

**WHAT CHANGED:** including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `integration-tests/src/main/java/org/apache/polaris/service/it/test/PolarisPolicyServiceIntegrationTest.java`

---

### 761. `ef7cefe` - Remove Java URI validations for Blob Storage providers (#1604)

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

### 762. `5750f4e` - fix(quickstart): Correct Quickstart Instructions (#1673)

**Date:** 2025-05-27 | **Author:** Adnan Hemani | **PR:** [#1673](https://github.com/apache/polaris/pull/1673)
**Files:** 8 | **Changes:** +31/-31

**PURPOSE:** Bug fix

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `getting-started/assets/cloud_providers/deploy-aws.sh`
- `getting-started/assets/cloud_providers/deploy-azure.sh`
- `getting-started/assets/cloud_providers/deploy-gcp.sh`
- `site/content/in-dev/unreleased/getting-started/deploying-polaris/quickstart-deploy-aws.md`
- `site/content/in-dev/unreleased/getting-started/deploying-polaris/quickstart-deploy-azure.md`
- `site/content/in-dev/unreleased/getting-started/deploying-polaris/quickstart-deploy-gcp.md`
- `site/content/in-dev/unreleased/getting-started/quickstart.md`
- `site/content/in-dev/unreleased/getting-started/using-polaris.md`

---

### 763. `9001785` - Create a single binary distribution bundle (#1589)

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

### 764. `e5bc87e` - fix: Remove info log about deprecated internal method from PolarisConfiguration (#1672)

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

### 765. `c11c1b1` - Fix SparkClient listGenericTable to use ListGenericTablesRESTResponse

**Date:** 2025-05-27 | **Author:** gh-yzou | **PR:** N/A
**Files:** 1 | **Changes:** +5/-5

**PURPOSE:** Bug fix

**WHAT CHANGED:** in Spark Plugin

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: Spark Integration | Focused change

**Files modified:**
- `plugins/spark/v3.5/spark/src/main/java/org/apache/polaris/spark/PolarisRESTCatalog.java`

---

### 766. `0a484bb` - fix: Remove duplicated code in IcebergCatalog (#1681)

**Date:** 2025-05-27 | **Author:** Alexandre Dutra | **PR:** [#1681](https://github.com/apache/polaris/pull/1681)
**Files:** 1 | **Changes:** +0/-8

**PURPOSE:** Bug fix; Code removal

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `service/common/src/main/java/org/apache/polaris/service/catalog/iceberg/IcebergCatalog.java`

---

### 767. `6ef8b3e` - main: Update dependency io.prometheus:prometheus-metrics-exporter-servlet-jakarta to v1.3.8 (#1679)

**Date:** 2025-05-26 | **Author:** Mend Renovate | **PR:** [#1679](https://github.com/apache/polaris/pull/1679)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 768. `acd2ad3` - feat(build): make archive builds reproducible (#1664)

**Date:** 2025-05-26 | **Author:** Robert Stupp | **PR:** [#1664](https://github.com/apache/polaris/pull/1664)
**Files:** 1 | **Changes:** +7/-0

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `build-logic/src/main/kotlin/polaris-java.gradle.kts`

---

### 769. `b77244f` - main: Update dependency boto3 to v1.38.23 (#1667)

**Date:** 2025-05-26 | **Author:** Mend Renovate | **PR:** [#1667](https://github.com/apache/polaris/pull/1667)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 770. `3e1021d` - main: Update dependency software.amazon.awssdk:bom to v2.31.50 (#1677)

**Date:** 2025-05-26 | **Author:** Mend Renovate | **PR:** [#1677](https://github.com/apache/polaris/pull/1677)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 771. `4ec850e` - main: Update dependency pytest to ~=7.4.4 (#1668)

**Date:** 2025-05-25 | **Author:** Mend Renovate | **PR:** [#1668](https://github.com/apache/polaris/pull/1668)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update; Test improvement

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/test-requirements.txt`

---

### 772. `a2bc9d3` - main: Update python Docker tag to v3.13 (#1669)

**Date:** 2025-05-25 | **Author:** Mend Renovate | **PR:** [#1669](https://github.com/apache/polaris/pull/1669)
**Files:** 1 | **Changes:** +5/-5

**PURPOSE:** Documentation update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/.gitlab-ci.yml`

---

### 773. `c770ed5` - main: Update actions/checkout action to v4 (#1670)

**Date:** 2025-05-25 | **Author:** Mend Renovate | **PR:** [#1670](https://github.com/apache/polaris/pull/1670)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Client Library in CI/CD, Python Client

**WHY NEEDED:** to improve client usability; to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation, Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/.github/workflows/python.yml`

---

### 774. `b2a2cd4` - main: Update actions/setup-python action to v5 (#1671)

**Date:** 2025-05-25 | **Author:** Mend Renovate | **PR:** [#1671](https://github.com/apache/polaris/pull/1671)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified Client Library in CI/CD, Python Client

**WHY NEEDED:** to improve client usability; to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation, Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/.github/workflows/python.yml`

---

### 775. `1631da0` - [Python Client] CI for Python client (Continue PR#1096) (#1639)

**Date:** 2025-05-23 | **Author:** Honah (Jonas) J. | **PR:** [#1639](https://github.com/apache/polaris/pull/1639)
**Files:** 1 | **Changes:** +70/-0

**PURPOSE:** CI/CD improvement

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/python-client.yml`

---

### 776. `af26732` - Create a wrapper script to generate python client; regenerate the python client (#1347)

**Date:** 2025-05-23 | **Author:** Eric Maynard | **PR:** [#1347](https://github.com/apache/polaris/pull/1347)
**Files:** 638 | **Changes:** +32824/-2386

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified CLI, Client Library in CI/CD, Documentation, OpenAPI Specs, Python Client including test updates

**WHY NEEDED:** to improve client usability; to improve build and deployment processes

**IMPACT:** Affects: API Contracts, Build/Test Automation, Client API, Command Line Tools, User Documentation | Large-scale change affecting multiple modules | May affect API consumers

**Sample files (showing 15 of 638):**
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

**Additional details from commit message:**
```
I've also run the script, which necessitated several things to get tests passing:
1. There were small nonfunctional spec changes needed in order to keep the Python client working
2. The CLI and its tests required a few fixes to work with the updated Python client
3. Many of the regtests required fixes to work with the updated Python client
```

---

### 777. `6e6da48` - fix and enforce more errorprone checks (#1663)

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

### 778. `0bdc3f4` - Refactor: Use per-request STS credentials (#1629)

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

### 779. `463682f` - Refactor IcebergCatalog to isolate internal state (#1659)

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

### 780. `c969812` - main: Update dependency boto3 to v1.38.22 (#1657)

**Date:** 2025-05-23 | **Author:** Mend Renovate | **PR:** [#1657](https://github.com/apache/polaris/pull/1657)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 781. `0eafcaa` - Fix quickstart doc with docker compose (#1610)

**Date:** 2025-05-23 | **Author:** MonkeyCanCode | **PR:** [#1610](https://github.com/apache/polaris/pull/1610)
**Files:** 11 | **Changes:** +55/-36

**PURPOSE:** Bug fix; Documentation update

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Medium-scale change

**Files modified:**
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

### 782. `5e4a6f0` - Add CATALOG_MANAGE_METADATA to super privilege set of policy attachment privileges (#1643)

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

### 783. `a106f4e` - fix(testing): Do not let PolarisOverlappingTableTest spam `/tmp` (#1641)

**Date:** 2025-05-23 | **Author:** Robert Stupp | **PR:** [#1641](https://github.com/apache/polaris/pull/1641)
**Files:** 1 | **Changes:** +9/-2

**PURPOSE:** Bug fix; Test improvement

**WHAT CHANGED:** including test updates

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `quarkus/service/src/test/java/org/apache/polaris/service/quarkus/admin/PolarisOverlappingTableTest.java`

---

### 784. `c9e0202` - fix(test): Do not let some more tests spam `/tmp` (#1651)

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

### 785. `a534193` - [Policy Store] Add policyTypeCode to Slice/Index for Future Filtering Support and Update Policy Persistence Method (#1628)

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

### 786. `01836d2` - main: Update dependency gradle to v8.14.1 (#1652)

**Date:** 2025-05-22 | **Author:** Mend Renovate | **PR:** [#1652](https://github.com/apache/polaris/pull/1652)
**Files:** 1 | **Changes:** +2/-2

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/wrapper/gradle-wrapper.properties`

**Additional details from commit message:**
```
* Re-adopt PR to the project's needs
---------
Co-authored-by: Robert Stupp <snazy@snazy.de>
```

---

### 787. `d619bf3` - [HOTFIX] QUICKSTART (#1646)

**Date:** 2025-05-22 | **Author:** Prashant Singh | **PR:** [#1646](https://github.com/apache/polaris/pull/1646)
**Files:** 3 | **Changes:** +26/-12

**PURPOSE:** Bug fix

**WHAT CHANGED:** in Documentation

**WHY NEEDED:** to improve system functionality

**IMPACT:** Affects: User Documentation | Focused change

**Files modified:**
- `getting-started/eclipselink/docker-compose.yml`
- `getting-started/jdbc/README.md`
- `getting-started/jdbc/docker-compose.yml`

**Additional details from commit message:**
```
[1] ENV variables required by common assets after #1522 
[2] New configs required to enable FILE based sources #1649
Co-authored-by: singhpk234 <singhpk234@users.noreply.github.com>
Co-authored-by: pjanuario <pjanuario@users.noreply.github.com>
```

---

### 788. `b72214a` - Use echo to print script errors (#1648)

**Date:** 2025-05-22 | **Author:** ModEtchFill | **PR:** [#1648](https://github.com/apache/polaris/pull/1648)
**Files:** 1 | **Changes:** +2/-2

**PURPOSE:** Code modification

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `regtests/run_spark_sql.sh`

---

### 789. `13e3fa3` - main: Update dependency io.smallrye.config:smallrye-config-core to v3.13.0 (#1637)

**Date:** 2025-05-22 | **Author:** Mend Renovate | **PR:** [#1637](https://github.com/apache/polaris/pull/1637)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 790. `d8b862b` - fix(nightly-CI): Do not publish snapshots from forks (#1635)

**Date:** 2025-05-22 | **Author:** Robert Stupp | **PR:** [#1635](https://github.com/apache/polaris/pull/1635)
**Files:** 1 | **Changes:** +1/-0

**PURPOSE:** Bug fix; CI/CD improvement

**WHAT CHANGED:** in CI/CD

**WHY NEEDED:** to improve build and deployment processes

**IMPACT:** Affects: Build/Test Automation | Focused change

**Files modified:**
- `.github/workflows/nightly.yml`

---

### 791. `b3bbede` - fix(CI): Resolve ambiguous `regtests` GH WF job name (#1636)

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

### 792. `b54d95d` - main: Update dependency boto3 to v1.38.21 (#1644)

**Date:** 2025-05-22 | **Author:** Mend Renovate | **PR:** [#1644](https://github.com/apache/polaris/pull/1644)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified Client Library in Python Client

**WHY NEEDED:** to improve client usability

**IMPACT:** Affects: Client API | Focused change | May affect API consumers

**Files modified:**
- `client/python/pyproject.toml`

---

### 793. `d8d3daa` - main: Update dependency org.mockito:mockito-junit-jupiter to v5.18.0 (#1645)

**Date:** 2025-05-22 | **Author:** Mend Renovate | **PR:** [#1645](https://github.com/apache/polaris/pull/1645)
**Files:** 1 | **Changes:** +1/-1

**PURPOSE:** Dependency update

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `gradle/libs.versions.toml`

---

### 794. `ae7afcf` - Add DISCLAIMER in Helm chart, fix LICENSE and NOTICE regarding code coming from Project Nessie in Helm chart (#1632)

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

### 795. `d05674d` - fix(metrics): Do not emit metrics for failed realm resolutions (#1642)

**Date:** 2025-05-21 | **Author:** Alexandre Dutra | **PR:** [#1642](https://github.com/apache/polaris/pull/1642)
**Files:** 1 | **Changes:** +1/-10

**PURPOSE:** Bug fix

**WHAT CHANGED:** Modified 1 file(s)

**WHY NEEDED:** to improve system functionality

**IMPACT:** Focused change

**Files modified:**
- `quarkus/service/src/main/java/org/apache/polaris/service/quarkus/metrics/RealmIdTagContributor.java`

---
