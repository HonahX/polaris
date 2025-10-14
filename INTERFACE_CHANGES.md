# Polaris-Core Interface Changes Report
**Analysis Period:** From commit `94c94f197f1375ac5b7f949f611a4ac03579d9f0` to current `main`
---

## Overview

This report tracks all changes to interface files in the `polaris-core` module. Interface changes are particularly important as they often indicate API changes, breaking changes, or significant architectural modifications.

### Summary
- **Total interface files in polaris-core:** 52
- **Commits modifying interfaces:** 48
- **Percentage of total commits:** 6%

### Interface Files by Category
- **auth**: 4 interface(s)
- **catalog**: 2 interface(s)
- **config**: 3 interface(s)
- **connection**: 3 interface(s)
- **context**: 2 interface(s)
- **credentials**: 1 interface(s)
- **entity**: 3 interface(s)
- **other**: 2 interface(s)
- **persistence**: 18 interface(s)
- **policy**: 6 interface(s)
- **secrets**: 2 interface(s)
- **storage**: 6 interface(s)

---

## Table of Contents
1. [Interface Files by Category](#interface-files-by-category-detailed)
2. [Commits Modifying Interfaces](#commits-modifying-interfaces)
3. [High-Impact Changes](#high-impact-changes)
4. [Interface-by-Interface Change History](#interface-by-interface-change-history)

---

## Interface Files by Category (Detailed)

### Auth Interfaces (4)
- `PolarisAuthorizer` - `polaris-core/src/main/java/org/apache/polaris/core/auth/PolarisAuthorizer.java`
- `PolarisGrantManager` - `polaris-core/src/main/java/org/apache/polaris/core/auth/PolarisGrantManager.java`
- `PolarisPrincipal` - `polaris-core/src/main/java/org/apache/polaris/core/auth/PolarisPrincipal.java`
- `PolarisSecretsManager` - `polaris-core/src/main/java/org/apache/polaris/core/auth/PolarisSecretsManager.java`

### Catalog Interfaces (2)
- `ExternalCatalogFactory` - `polaris-core/src/main/java/org/apache/polaris/core/catalog/ExternalCatalogFactory.java`
- `GenericTableCatalog` - `polaris-core/src/main/java/org/apache/polaris/core/catalog/GenericTableCatalog.java`

### Config Interfaces (3)
- `PolarisConfigurationStore` - `polaris-core/src/main/java/org/apache/polaris/core/config/PolarisConfigurationStore.java`
- `ProductionReadinessCheck` - `polaris-core/src/main/java/org/apache/polaris/core/config/ProductionReadinessCheck.java`
- `RealmConfig` - `polaris-core/src/main/java/org/apache/polaris/core/config/RealmConfig.java`

### Connection Interfaces (3)
- `IcebergCatalogPropertiesProvider` - `polaris-core/src/main/java/org/apache/polaris/core/connection/iceberg/IcebergCatalogPropertiesProvider.java`
- `ConnectionCredentialVendor` - `polaris-core/src/main/java/org/apache/polaris/core/credentials/connection/ConnectionCredentialVendor.java`
- `ConnectionCredentials` - `polaris-core/src/main/java/org/apache/polaris/core/credentials/connection/ConnectionCredentials.java`

### Context Interfaces (2)
- `CallContext` - `polaris-core/src/main/java/org/apache/polaris/core/context/CallContext.java`
- `RealmContext` - `polaris-core/src/main/java/org/apache/polaris/core/context/RealmContext.java`

### Credentials Interfaces (1)
- `PolarisCredentialManager` - `polaris-core/src/main/java/org/apache/polaris/core/credentials/PolarisCredentialManager.java`

### Entity Interfaces (3)
- `Identifiable` - `polaris-core/src/main/java/org/apache/polaris/core/entity/Identifiable.java`
- `LocationBasedEntity` - `polaris-core/src/main/java/org/apache/polaris/core/entity/LocationBasedEntity.java`
- `PolarisEventManager` - `polaris-core/src/main/java/org/apache/polaris/core/entity/PolarisEventManager.java`

### Other Interfaces (2)
- `PolarisDiagnostics` - `polaris-core/src/main/java/org/apache/polaris/core/PolarisDiagnostics.java`
- `ServiceIdentityProvider` - `polaris-core/src/main/java/org/apache/polaris/core/identity/provider/ServiceIdentityProvider.java`

### Persistence Interfaces (18)
- `BasePersistence` - `polaris-core/src/main/java/org/apache/polaris/core/persistence/BasePersistence.java`
- `IntegrationPersistence` - `polaris-core/src/main/java/org/apache/polaris/core/persistence/IntegrationPersistence.java`
- `MetaStoreManagerFactory` - `polaris-core/src/main/java/org/apache/polaris/core/persistence/MetaStoreManagerFactory.java`
- `PolarisMetaStoreManager` - `polaris-core/src/main/java/org/apache/polaris/core/persistence/PolarisMetaStoreManager.java`
- `PrincipalSecretsGenerator` - `polaris-core/src/main/java/org/apache/polaris/core/persistence/PrincipalSecretsGenerator.java`
- `BootstrapOptions` - `polaris-core/src/main/java/org/apache/polaris/core/persistence/bootstrap/BootstrapOptions.java`
- `RootCredentials` - `polaris-core/src/main/java/org/apache/polaris/core/persistence/bootstrap/RootCredentials.java`
- `RootCredentialsSet` - `polaris-core/src/main/java/org/apache/polaris/core/persistence/bootstrap/RootCredentialsSet.java`
- `SchemaOptions` - `polaris-core/src/main/java/org/apache/polaris/core/persistence/bootstrap/SchemaOptions.java`
- `EntityCache` - `polaris-core/src/main/java/org/apache/polaris/core/persistence/cache/EntityCache.java`
- `EntityIdToken` - `polaris-core/src/main/java/org/apache/polaris/core/persistence/pagination/EntityIdToken.java`
- `PageToken` - `polaris-core/src/main/java/org/apache/polaris/core/persistence/pagination/PageToken.java`
- `Token` - `polaris-core/src/main/java/org/apache/polaris/core/persistence/pagination/Token.java`
- `PolarisResolutionManifestCatalogView` - `polaris-core/src/main/java/org/apache/polaris/core/persistence/resolver/PolarisResolutionManifestCatalogView.java`
- `ResolutionManifestFactory` - `polaris-core/src/main/java/org/apache/polaris/core/persistence/resolver/ResolutionManifestFactory.java`
- `ResolverFactory` - `polaris-core/src/main/java/org/apache/polaris/core/persistence/resolver/ResolverFactory.java`
- `TransactionalPersistence` - `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalPersistence.java`
- `DummyTestToken` - `polaris-core/src/test/java/org/apache/polaris/core/persistence/pagination/DummyTestToken.java`

### Policy Interfaces (6)
- `PolarisPolicyMappingManager` - `polaris-core/src/main/java/org/apache/polaris/core/policy/PolarisPolicyMappingManager.java`
- `PolicyMappingPersistence` - `polaris-core/src/main/java/org/apache/polaris/core/policy/PolicyMappingPersistence.java`
- `PolicyType` - `polaris-core/src/main/java/org/apache/polaris/core/policy/PolicyType.java`
- `TransactionalPolicyMappingPersistence` - `polaris-core/src/main/java/org/apache/polaris/core/policy/TransactionalPolicyMappingPersistence.java`
- `PolicyContent` - `polaris-core/src/main/java/org/apache/polaris/core/policy/content/PolicyContent.java`
- `PolicyValidator` - `polaris-core/src/main/java/org/apache/polaris/core/policy/validator/PolicyValidator.java`

### Secrets Interfaces (2)
- `UserSecretsManager` - `polaris-core/src/main/java/org/apache/polaris/core/secrets/UserSecretsManager.java`
- `UserSecretsManagerFactory` - `polaris-core/src/main/java/org/apache/polaris/core/secrets/UserSecretsManagerFactory.java`

### Storage Interfaces (6)
- `AccessConfig` - `polaris-core/src/main/java/org/apache/polaris/core/storage/AccessConfig.java`
- `PolarisCredentialVendor` - `polaris-core/src/main/java/org/apache/polaris/core/storage/PolarisCredentialVendor.java`
- `PolarisStorageIntegrationProvider` - `polaris-core/src/main/java/org/apache/polaris/core/storage/PolarisStorageIntegrationProvider.java`
- `StsClientProvider` - `polaris-core/src/main/java/org/apache/polaris/core/storage/aws/StsClientProvider.java`
- `StorageCredentialCacheConfig` - `polaris-core/src/main/java/org/apache/polaris/core/storage/cache/StorageCredentialCacheConfig.java`
- `StorageCredentialCacheKey` - `polaris-core/src/main/java/org/apache/polaris/core/storage/cache/StorageCredentialCacheKey.java`

---

## Commits Modifying Interfaces

**Total:** 48 commits

### Chronological List

| Date | Hash | PR | Title | Interfaces | Files | +/- |
|------|------|-----|-------|-----------|-------|-----|
| 2025-10-08 | `519e127` | [#2759](https://github.com/apache/polaris/pull/2759) | SigV4 Auth Support for Catalog Federation - Part 4: Connection Credential Man... | 5 | 41 | +1234/-30 |
| 2025-10-07 | `413e293` | [#2762](https://github.com/apache/polaris/pull/2762) | JDBC: Fix Bootstrap with schema options (#2762) | 1 | 12 | +364/-77 |
| 2025-10-03 | `793a118` | [#2523](https://github.com/apache/polaris/pull/2523) | SigV4 Auth Support for Catalog Federation - Part 3: Service Identity Info Inj... | 1 | 34 | +1663/-73 |
| 2025-10-03 | `927bb5e` | [#2711](https://github.com/apache/polaris/pull/2711) | Enforce that S3 credentials are vended when requested (#2711) | 1 | 5 | +88/-9 |
| 2025-10-03 | `b190b77` | [#2750](https://github.com/apache/polaris/pull/2750) | Add PolarisResolutionManifestCatalogView.getResolvedCatalogEntity helper (#2750) | 1 | 9 | +31/-45 |
| 2025-10-02 | `359388e` | [#2540](https://github.com/apache/polaris/pull/2540) | Make ResolverFactory + ResolutionManifestFactory request-scoped (#2540) | 2 | 19 | +103/-147 |
| 2025-09-30 | `80f0456` | [#2518](https://github.com/apache/polaris/pull/2518) | Use PrincipalEntity in PolarisMetaStoreManager.createPrincipal (#2518) | 1 | 11 | +77/-163 |
| 2025-09-19 | `f334d1a` | [#2388](https://github.com/apache/polaris/pull/2388) | Remove numeric identifier from PolarisPrincipal (#2388) | 1 | 5 | +34/-37 |
| 2025-09-15 | `112d80b` | [#2543](https://github.com/apache/polaris/pull/2543) | Avoid using jackson method for parsing YAML from any URL in RootCredentialsSe... | 1 | 4 | +40/-17 |
| 2025-09-12 | `be4175c` | [#2533](https://github.com/apache/polaris/pull/2533) | Inject PolarisAdminService into PolarisServiceImpl (#2533) | 1 | 5 | +53/-118 |
| 2025-09-03 | `c3f5001` | [#1844](https://github.com/apache/polaris/pull/1844) | Add Polaris Events to Persistence (#1844) | 3 | 59 | +2000/-83 |
| 2025-09-03 | `f6bcbd2` | [#2465](https://github.com/apache/polaris/pull/2465) | perf(refactor): optimizing JdbcBasePersistenceImpl.listEntities (#2465) | 2 | 7 | +151/-42 |
| 2025-09-02 | `327697c` | [#2197](https://github.com/apache/polaris/pull/2197) | Feature: Expose resetCredentials via a new reset api to allow root user to re... | 2 | 17 | +479/-5 |
| 2025-08-28 | `9e6d929` | [#2341](https://github.com/apache/polaris/pull/2341) | add refresh credentials property to loadTableResult (#2341) | 2 | 29 | +341/-93 |
| 2025-08-20 | `b49cbc5` | [#2290](https://github.com/apache/polaris/pull/2290) | Add PolarisMetaStoreManager.loadEntities (#2290) | 3 | 16 | +223/-167 |
| 2025-08-20 | `a0a2b87` | [#2401](https://github.com/apache/polaris/pull/2401) | feat: enforce LIST_PAGINATION_ENABLED (#2401) | 1 | 8 | +97/-17 |
| 2025-08-18 | `83d09cc` | [#2379](https://github.com/apache/polaris/pull/2379) | Modularize generic table federation (#2379) | 1 | 16 | +187/-30 |
| 2025-08-18 | `96f1459` | [#2307](https://github.com/apache/polaris/pull/2307) | Refactor Authenticator and PolarisPrincipal (#2307) | 2 | 62 | +460/-426 |
| 2025-08-15 | `e45be14` | [#2190](https://github.com/apache/polaris/pull/2190) | SigV4 Auth Support for Catalog Federation - Part 2: Connection Config Persist... | 1 | 20 | +649/-77 |
| 2025-08-15 | `88f58fc` | [#2340](https://github.com/apache/polaris/pull/2340) | Make PolarisAuthorizer RequestScoped (#2340) | 1 | 12 | +21/-45 |
| 2025-08-14 | `b2b1453` | [#2332](https://github.com/apache/polaris/pull/2332) | Modularize federation (Option 2) (#2332) | 1 | 11 | +303/-52 |
| 2025-08-13 | `ee04df4` | [#2317](https://github.com/apache/polaris/pull/2317) | Add entitySubType param to BasePersistence.listEntities (#2317) | 2 | 9 | +73/-167 |
| 2025-08-05 | `532ee51` | [#2235](https://github.com/apache/polaris/pull/2235) | Remove config parameter from `PolarisStorageIntegration#getSubscopedCreds` (#... | 1 | 16 | +104/-136 |
| 2025-08-04 | `253321c` | [#2210](https://github.com/apache/polaris/pull/2210) | Add ResolutionManifestFactory (#2210) | 1 | 30 | +229/-329 |
| 2025-08-01 | `0449d9b` | [#2203](https://github.com/apache/polaris/pull/2203) | Remove CallContext.CURRENT_CONTEXT (#2203) | 1 | 6 | +7/-38 |
| 2025-07-28 | `e46f8c6` | [#2174](https://github.com/apache/polaris/pull/2174) | Add Principal lookup helpers to PolarisMetaStoreManager (#2174) | 1 | 15 | +115/-210 |
| 2025-07-25 | `7b04abe` | [#2171](https://github.com/apache/polaris/pull/2171) | Push AccessConfig creation to PolarisStorageIntegration (#2171) | 1 | 21 | +413/-361 |
| 2025-07-24 | `ca85339` | [#2161](https://github.com/apache/polaris/pull/2161) | Rework getOrCreateSessionSupplier (#2161) | 1 | 20 | +32/-43 |
| 2025-07-23 | `95358a9` | [#2148](https://github.com/apache/polaris/pull/2148) | Extract ResolverFactory from PolarisEntityManager (#2148) | 1 | 16 | +148/-80 |
| 2025-07-16 | `fb418a2` | [#1938](https://github.com/apache/polaris/pull/1938) | Extensible pagination token implementation (#1938) | 3 | 32 | +1329/-506 |
| 2025-07-15 | `9ecf29b` | [#2029](https://github.com/apache/polaris/pull/2029) | Use PolarisImmutable for StorageCredentialCacheKey (#2029) | 1 | 3 | +30/-97 |
| 2025-07-15 | `2c2052c` | [#2022](https://github.com/apache/polaris/pull/2022) | Use application-scoped StorageCredentialCache (#2022) | 2 | 15 | +118/-57 |
| 2025-07-14 | `de351de` | [#2015](https://github.com/apache/polaris/pull/2015) | Introduce RealmConfig (#2015) | 3 | 51 | +365/-429 |
| 2025-07-13 | `6ddd148` | [#2021](https://github.com/apache/polaris/pull/2021) | Make StorageCredentialCache safe for mutli-realm usage (#2021) | 1 | 11 | +83/-87 |
| 2025-07-11 | `15f23ca` | [#2007](https://github.com/apache/polaris/pull/2007) | Make PolarisConfiguration member variables private (#2007) | 1 | 10 | +57/-45 |
| 2025-07-04 | `95d1eac` | [#1913](https://github.com/apache/polaris/pull/1913) | feat: Support customizing S3 endpoints (#1913) | 1 | 25 | +1261/-22 |
| 2025-06-30 | `44d52d4` | [#1942](https://github.com/apache/polaris/pull/1942) | Add options to the bootstrap command to specify a schema file (#1942) | 3 | 9 | +237/-58 |
| 2025-06-26 | `1e69373` | [#1686](https://github.com/apache/polaris/pull/1686) | Optimize the location overlap check with an index (#1686) | 3 | 30 | +863/-95 |
| 2025-06-18 | `45df8ac` | [#1840](https://github.com/apache/polaris/pull/1840) | Improve the parsing and validation of UserSecretReferenceUrns (#1840) | 1 | 4 | +213/-16 |
| 2025-06-05 | `3185adf` | [#1783](https://github.com/apache/polaris/pull/1783) | Refactor getConfiguration to use RealmContext (Part 2) (#1783) | 1 | 7 | +24/-110 |
| 2025-06-05 | `187d700` | [#1816](https://github.com/apache/polaris/pull/1816) | Turn CallContext.copyOf into an interface instead of static function (#1816) | 1 | 5 | +27/-60 |
| 2025-06-04 | `a59942a` | [#1815](https://github.com/apache/polaris/pull/1815) | Remove CallContext.getDiagnostics (#1815) | 1 | 1 | +0/-5 |
| 2025-06-04 | `511df8c` | [#1812](https://github.com/apache/polaris/pull/1812) | Remove CallContext.of (#1812) | 1 | 15 | +71/-110 |
| 2025-06-04 | `0a8d8b8` | [#1806](https://github.com/apache/polaris/pull/1806) | Core: Consolidate CallContext with PolarisCallContext part 1(#1806) | 1 | 6 | +74/-30 |
| 2025-06-03 | `0a9a5d9` | [#1776](https://github.com/apache/polaris/pull/1776) | feat(cdi): Remove CallContext.close() (#1776) | 1 | 12 | +470/-607 |
| 2025-06-02 | `5fe9fd9` | [#1780](https://github.com/apache/polaris/pull/1780) | Replace getConfiguration usage with PolarisCallContext to use RealmContext (P... | 1 | 18 | +88/-79 |
| 2025-06-02 | `dd2fdf9` | [#1758](https://github.com/apache/polaris/pull/1758) | Handle RequestScoped instance injection gracefully for DefaultConfigurationSt... | 1 | 5 | +99/-23 |
| 2025-05-22 | `a534193` | [#1628](https://github.com/apache/polaris/pull/1628) | [Policy Store] Add policyTypeCode to Slice/Index for Future Filtering Support... | 2 | 13 | +131/-60 |

---

## High-Impact Changes

Commits that modified multiple interfaces or made significant changes:

**Total high-impact commits:** 31

### 1. `519e127` - SigV4 Auth Support for Catalog Federation - Part 4: Connection Credential Manager (#2759)

**Date:** 2025-10-08
**PR:** [#2759](https://github.com/apache/polaris/pull/2759)
**Total files changed:** 41
**Interfaces modified:** 5
**Stats:** +1234 / -30

**Modified interfaces:**
- `ExternalCatalogFactory` (`polaris-core/src/main/java/org/apache/polaris/core/catalog/ExternalCatalogFactory.java`)
- `IcebergCatalogPropertiesProvider` (`polaris-core/src/main/java/org/apache/polaris/core/connection/iceberg/IcebergCatalogPropertiesProvider.java`)
- `PolarisCredentialManager` (`polaris-core/src/main/java/org/apache/polaris/core/credentials/PolarisCredentialManager.java`)
- `ConnectionCredentialVendor` (`polaris-core/src/main/java/org/apache/polaris/core/credentials/connection/ConnectionCredentialVendor.java`)
- `ConnectionCredentials` (`polaris-core/src/main/java/org/apache/polaris/core/credentials/connection/ConnectionCredentials.java`)

**Description:**
```
The core of this PR is the new ConnectionCredentialVendor interface, which:
Generates connection credentials by combining service identity with user auth parameters
Supports different authentication types (AWS SIGV4, AZURE Entra, GCP IAM) through CDI, currently only supports SigV4.
Provides on-demand credential generation
Enables easy extension for new authentication types
In the long term, we ...
```

---

### 2. `413e293` - JDBC: Fix Bootstrap with schema options (#2762)

**Date:** 2025-10-07
**PR:** [#2762](https://github.com/apache/polaris/pull/2762)
**Total files changed:** 12
**Interfaces modified:** 1
**Stats:** +364 / -77

**Modified interfaces:**
- `SchemaOptions` (`polaris-core/src/main/java/org/apache/polaris/core/persistence/bootstrap/SchemaOptions.java`)

---

### 3. `793a118` - SigV4 Auth Support for Catalog Federation - Part 3: Service Identity Info Injection (#2523)

**Date:** 2025-10-03
**PR:** [#2523](https://github.com/apache/polaris/pull/2523)
**Total files changed:** 34
**Interfaces modified:** 1
**Stats:** +1663 / -73

**Modified interfaces:**
- `ServiceIdentityProvider` (`polaris-core/src/main/java/org/apache/polaris/core/identity/provider/ServiceIdentityProvider.java`)

**Description:**
```
* Service Identity Injection
* Return injected service identity info in response
* Use AwsCredentialsProvider to retrieve the credentials
* Move some logic to ServiceIdentityConfiguration
* Rename ServiceIdentityRegistry to ServiceIdentityProvider
* Rename ResolvedServiceIdentity to ServiceIdentityCredential
* Simplify the logic and add more tests
* Use SecretReference and fix some small issues...
```

---

### 4. `359388e` - Make ResolverFactory + ResolutionManifestFactory request-scoped (#2540)

**Date:** 2025-10-02
**PR:** [#2540](https://github.com/apache/polaris/pull/2540)
**Total files changed:** 19
**Interfaces modified:** 2
**Stats:** +103 / -147

**Modified interfaces:**
- `ResolutionManifestFactory` (`polaris-core/src/main/java/org/apache/polaris/core/persistence/resolver/ResolutionManifestFactory.java`)
- `ResolverFactory` (`polaris-core/src/main/java/org/apache/polaris/core/persistence/resolver/ResolverFactory.java`)

**Description:**
```
note that ideally the `SecurityContext` would also be injected from
the request however our tests around `PolarisAuthzTestBase` are
written in a way that does not easily support this currently.
```

---

### 5. `80f0456` - Use PrincipalEntity in PolarisMetaStoreManager.createPrincipal (#2518)

**Date:** 2025-09-30
**PR:** [#2518](https://github.com/apache/polaris/pull/2518)
**Total files changed:** 11
**Interfaces modified:** 1
**Stats:** +77 / -163

**Modified interfaces:**
- `PolarisMetaStoreManager` (`polaris-core/src/main/java/org/apache/polaris/core/persistence/PolarisMetaStoreManager.java`)

**Description:**
```
if we pass and return a more specific `PrincipalEntity` we can simplify
the surrounding code and implementation
```

---

### 6. `c3f5001` - Add Polaris Events to Persistence (#1844)

**Date:** 2025-09-03
**PR:** [#1844](https://github.com/apache/polaris/pull/1844)
**Total files changed:** 59
**Interfaces modified:** 3
**Stats:** +2000 / -83

**Modified interfaces:**
- `PolarisEventManager` (`polaris-core/src/main/java/org/apache/polaris/core/entity/PolarisEventManager.java`)
- `BasePersistence` (`polaris-core/src/main/java/org/apache/polaris/core/persistence/BasePersistence.java`)
- `PolarisMetaStoreManager` (`polaris-core/src/main/java/org/apache/polaris/core/persistence/PolarisMetaStoreManager.java`)

---

### 7. `327697c` - Feature: Expose resetCredentials via a new reset api to allow root user to reset credentials for an existing principal with custom values  (#2197)

**Date:** 2025-09-02
**PR:** [#2197](https://github.com/apache/polaris/pull/2197)
**Total files changed:** 17
**Interfaces modified:** 2
**Stats:** +479 / -5

**Modified interfaces:**
- `PolarisSecretsManager` (`polaris-core/src/main/java/org/apache/polaris/core/auth/PolarisSecretsManager.java`)
- `IntegrationPersistence` (`polaris-core/src/main/java/org/apache/polaris/core/persistence/IntegrationPersistence.java`)

---

### 8. `9e6d929` - add refresh credentials property to loadTableResult (#2341)

**Date:** 2025-08-28
**PR:** [#2341](https://github.com/apache/polaris/pull/2341)
**Total files changed:** 29
**Interfaces modified:** 2
**Stats:** +341 / -93

**Modified interfaces:**
- `PolarisCredentialVendor` (`polaris-core/src/main/java/org/apache/polaris/core/storage/PolarisCredentialVendor.java`)
- `StorageCredentialCacheKey` (`polaris-core/src/main/java/org/apache/polaris/core/storage/cache/StorageCredentialCacheKey.java`)

**Description:**
```
* IcebergCatalogAdapterTest: Added test to ensure refresh credentials endpoint is included
* delegate refresh credential endpoint configuration to storage integration
* GCP: Add refresh credential properties
```

---

### 9. `b49cbc5` - Add PolarisMetaStoreManager.loadEntities (#2290)

**Date:** 2025-08-20
**PR:** [#2290](https://github.com/apache/polaris/pull/2290)
**Total files changed:** 16
**Interfaces modified:** 3
**Stats:** +223 / -167

**Modified interfaces:**
- `BasePersistence` (`polaris-core/src/main/java/org/apache/polaris/core/persistence/BasePersistence.java`)
- `PolarisMetaStoreManager` (`polaris-core/src/main/java/org/apache/polaris/core/persistence/PolarisMetaStoreManager.java`)
- `TransactionalPersistence` (`polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalPersistence.java`)

**Description:**
```
currently `PolarisMetaStoreManager.listEntities` only exposes a limited
subset of the underlying `BasePersistence.listEntities` functionality.
most of the callers have to post-process the `EntityNameLookupRecord` of
`ListEntitiesResult` and call `PolarisMetaStoreManager.loadEntity`
on the individual items sequentually to transform and filter them.
this is bad for the following reasons:
- subopt...
```

---

### 10. `83d09cc` - Modularize generic table federation (#2379)

**Date:** 2025-08-18
**PR:** [#2379](https://github.com/apache/polaris/pull/2379)
**Total files changed:** 16
**Interfaces modified:** 1
**Stats:** +187 / -30

**Modified interfaces:**
- `ExternalCatalogFactory` (`polaris-core/src/main/java/org/apache/polaris/core/catalog/ExternalCatalogFactory.java`)

---

### 11. `96f1459` - Refactor Authenticator and PolarisPrincipal (#2307)

**Date:** 2025-08-18
**PR:** [#2307](https://github.com/apache/polaris/pull/2307)
**Total files changed:** 62
**Interfaces modified:** 2
**Stats:** +460 / -426

**Modified interfaces:**
- `PolarisAuthorizer` (`polaris-core/src/main/java/org/apache/polaris/core/auth/PolarisAuthorizer.java`)
- `PolarisPrincipal` (`polaris-core/src/main/java/org/apache/polaris/core/auth/PolarisPrincipal.java`)

**Description:**
```
- `AuthenticatedPolarisPrincipal` becomes an interface `PolarisPrincipal`, as the original class leaks implementation details (references to `PrincipalEntity` and thus to the storage layer). The new interface does not reference the storage layer. This is one step further towards easy pluggability of authentication in Polaris.
- The `Authenticator.authenticate()` method does not return an `Optio...
```

---

### 12. `e45be14` - SigV4 Auth Support for Catalog Federation - Part 2: Connection Config Persistence (#2190)

**Date:** 2025-08-15
**PR:** [#2190](https://github.com/apache/polaris/pull/2190)
**Total files changed:** 20
**Interfaces modified:** 1
**Stats:** +649 / -77

**Modified interfaces:**
- `UserSecretsManager` (`polaris-core/src/main/java/org/apache/polaris/core/secrets/UserSecretsManager.java`)

**Description:**
```
* Rename UserSecretReference to SecretReference and fix some small issues
```

---

### 13. `88f58fc` - Make PolarisAuthorizer RequestScoped (#2340)

**Date:** 2025-08-15
**PR:** [#2340](https://github.com/apache/polaris/pull/2340)
**Total files changed:** 12
**Interfaces modified:** 1
**Stats:** +21 / -45

**Modified interfaces:**
- `PolarisAuthorizer` (`polaris-core/src/main/java/org/apache/polaris/core/auth/PolarisAuthorizer.java`)

**Description:**
```
parameter.
in its only implementation only `CallContext.getRealmConfig` is getting
used.
so since `PolarisAuthorizer` cant be used outside a request, we can
simply make it request-scoped and inject the request-scoped `RealmConfig`
directly.
```

---

### 14. `b2b1453` - Modularize federation (Option 2) (#2332)

**Date:** 2025-08-14
**PR:** [#2332](https://github.com/apache/polaris/pull/2332)
**Total files changed:** 11
**Interfaces modified:** 1
**Stats:** +303 / -52

**Modified interfaces:**
- `ExternalCatalogFactory` (`polaris-core/src/main/java/org/apache/polaris/core/catalog/ExternalCatalogFactory.java`)

**Description:**
```
* Move polaris-extensions-federation-hadoop dependency
* Change identifier to lowerCase
* Change identifiers to constants
```

---

### 15. `532ee51` - Remove config parameter from `PolarisStorageIntegration#getSubscopedCreds` (#2235)

**Date:** 2025-08-05
**PR:** [#2235](https://github.com/apache/polaris/pull/2235)
**Total files changed:** 16
**Interfaces modified:** 1
**Stats:** +104 / -136

**Modified interfaces:**
- `PolarisStorageIntegrationProvider` (`polaris-core/src/main/java/org/apache/polaris/core/storage/PolarisStorageIntegrationProvider.java`)

**Description:**
```
This change removes the config parameter, as it's already known when `PolarisStorageIntegration` instances are created.
```

---

### 16. `253321c` - Add ResolutionManifestFactory (#2210)

**Date:** 2025-08-04
**PR:** [#2210](https://github.com/apache/polaris/pull/2210)
**Total files changed:** 30
**Interfaces modified:** 1
**Stats:** +229 / -329

**Modified interfaces:**
- `ResolutionManifestFactory` (`polaris-core/src/main/java/org/apache/polaris/core/persistence/resolver/ResolutionManifestFactory.java`)

**Description:**
```
was left in `PolarisEntityManager`.
by splitting out the more dedicated `ResolutionManifestFactory` we can remove
`PolarisEntityManager` and `RealmEntityManagerFactory` completely it seems.
```

---

### 17. `e46f8c6` - Add Principal lookup helpers to PolarisMetaStoreManager (#2174)

**Date:** 2025-07-28
**PR:** [#2174](https://github.com/apache/polaris/pull/2174)
**Total files changed:** 15
**Interfaces modified:** 1
**Stats:** +115 / -210

**Modified interfaces:**
- `PolarisMetaStoreManager` (`polaris-core/src/main/java/org/apache/polaris/core/persistence/PolarisMetaStoreManager.java`)

**Description:**
```
- add `PolarisMetaStoreManager.findRootPrincipal`
- add `PolarisMetaStoreManager.findPrincipalByName`
- add `PolarisMetaStoreManager.findPrincipalRoleByName`
also we now prefer `PolarisEntityConstants` where applicable
```

---

### 18. `7b04abe` - Push AccessConfig creation to PolarisStorageIntegration (#2171)

**Date:** 2025-07-25
**PR:** [#2171](https://github.com/apache/polaris/pull/2171)
**Total files changed:** 21
**Interfaces modified:** 1
**Stats:** +413 / -361

**Modified interfaces:**
- `AccessConfig` (`polaris-core/src/main/java/org/apache/polaris/core/storage/AccessConfig.java`)

**Description:**
```
* Move storage-specific access properties processing logic from
  core code to storage integration implementations.
* Add `isExpirationTimestamp` flag to `StorageAccessProperty` to
  allow them to be processed uniformly.
* Prepare for supporting access config properties that may have
  different values in Polaris Servers and Clients. This enables
  future enhancements to support different S3 en...
```

---

### 19. `ca85339` - Rework getOrCreateSessionSupplier (#2161)

**Date:** 2025-07-24
**PR:** [#2161](https://github.com/apache/polaris/pull/2161)
**Total files changed:** 20
**Interfaces modified:** 1
**Stats:** +32 / -43

**Modified interfaces:**
- `MetaStoreManagerFactory` (`polaris-core/src/main/java/org/apache/polaris/core/persistence/MetaStoreManagerFactory.java`)

**Description:**
```
it seems like the `Supplier` was an leaking implementation detail of the
`MetaStoreManagerFactor` implementations.
```

---

### 20. `95358a9` - Extract ResolverFactory from PolarisEntityManager (#2148)

**Date:** 2025-07-23
**PR:** [#2148](https://github.com/apache/polaris/pull/2148)
**Total files changed:** 16
**Interfaces modified:** 1
**Stats:** +148 / -80

**Modified interfaces:**
- `ResolverFactory` (`polaris-core/src/main/java/org/apache/polaris/core/persistence/resolver/ResolverFactory.java`)

**Description:**
```
Note that the little left-over functionality of `PolarisEntityManager` can
be split out to more dedicated interfaces in a follow-up most likely.
```

---

### 21. `fb418a2` - Extensible pagination token implementation (#1938)

**Date:** 2025-07-16
**PR:** [#1938](https://github.com/apache/polaris/pull/1938)
**Total files changed:** 32
**Interfaces modified:** 3
**Stats:** +1329 / -506

**Modified interfaces:**
- `EntityIdToken` (`polaris-core/src/main/java/org/apache/polaris/core/persistence/pagination/EntityIdToken.java`)
- `PageToken` (`polaris-core/src/main/java/org/apache/polaris/core/persistence/pagination/PageToken.java`)
- `Token` (`polaris-core/src/main/java/org/apache/polaris/core/persistence/pagination/Token.java`)

**Description:**
```
* Allows multiple implementations of `Token` referencing the "next page", encapsulated in `PageToken`. No changes to `polaris-core` needed to add custom `Token` implementations.
* Extensible to (later) support (cryptographic) signatures to prevent tampered page-token
* Refactor pagination code to delineate API-level page tokens and internal "pointers to data"
* Requests deal with the "previous"...
```

---

### 22. `2c2052c` - Use application-scoped StorageCredentialCache (#2022)

**Date:** 2025-07-15
**PR:** [#2022](https://github.com/apache/polaris/pull/2022)
**Total files changed:** 15
**Interfaces modified:** 2
**Stats:** +118 / -57

**Modified interfaces:**
- `MetaStoreManagerFactory` (`polaris-core/src/main/java/org/apache/polaris/core/persistence/MetaStoreManagerFactory.java`)
- `StorageCredentialCacheConfig` (`polaris-core/src/main/java/org/apache/polaris/core/storage/cache/StorageCredentialCacheConfig.java`)

---

### 23. `de351de` - Introduce RealmConfig (#2015)

**Date:** 2025-07-14
**PR:** [#2015](https://github.com/apache/polaris/pull/2015)
**Total files changed:** 51
**Interfaces modified:** 3
**Stats:** +365 / -429

**Modified interfaces:**
- `RealmConfig` (`polaris-core/src/main/java/org/apache/polaris/core/config/RealmConfig.java`)
- `CallContext` (`polaris-core/src/main/java/org/apache/polaris/core/context/CallContext.java`)
- `MetaStoreManagerFactory` (`polaris-core/src/main/java/org/apache/polaris/core/persistence/MetaStoreManagerFactory.java`)

**Description:**
```
```
ctx.getPolarisCallContext()
   .getConfigurationStore()
   .getConfiguration(ctx.getRealmContext(), "ALLOW_WILDCARD_LOCATION", false))
```
since a `PolarisConfigurationStore` cant be used without a `RealmContext` it makes sense to add a dedicated interface. this allows removal of verbose code and also moves towards injecting that interface via CDI at a request/realm scope in the future.
```

---

### 24. `6ddd148` - Make StorageCredentialCache safe for mutli-realm usage (#2021)

**Date:** 2025-07-13
**PR:** [#2021](https://github.com/apache/polaris/pull/2021)
**Total files changed:** 11
**Interfaces modified:** 1
**Stats:** +83 / -87

**Modified interfaces:**
- `StorageCredentialCacheKey` (`polaris-core/src/main/java/org/apache/polaris/core/storage/cache/StorageCredentialCacheKey.java`)

**Description:**
```
Similarly `StorageCredentialCacheKey` having a `@Nullable callContext` makes it more difficult to reason about.
Instead we can determine all realm-specific values at the time of insertion (from the `PolarisCallContext` param of `getOrGenerateSubScopeCreds`).
```

---

### 25. `95d1eac` - feat: Support customizing S3 endpoints (#1913)

**Date:** 2025-07-04
**PR:** [#1913](https://github.com/apache/polaris/pull/1913)
**Total files changed:** 25
**Interfaces modified:** 1
**Stats:** +1261 / -22

**Modified interfaces:**
- `StsClientProvider` (`polaris-core/src/main/java/org/apache/polaris/core/storage/aws/StsClientProvider.java`)

**Description:**
```
Introduce a dedicated interface for `StsClient` suppliers and implement it using a pool of cached clients.
All client are "thin" and share the same `SdkHttpClient`. The latter is closed when the server shuts down.
This is a step towards supporting non-AWS S3 storage (#1530).
For this reason the STS endpoint is present in new interfaces, but is not used yet.
```

---

### 26. `44d52d4` - Add options to the bootstrap command to specify a schema file (#1942)

**Date:** 2025-06-30
**PR:** [#1942](https://github.com/apache/polaris/pull/1942)
**Total files changed:** 9
**Interfaces modified:** 3
**Stats:** +237 / -58

**Modified interfaces:**
- `MetaStoreManagerFactory` (`polaris-core/src/main/java/org/apache/polaris/core/persistence/MetaStoreManagerFactory.java`)
- `BootstrapOptions` (`polaris-core/src/main/java/org/apache/polaris/core/persistence/bootstrap/BootstrapOptions.java`)
- `SchemaOptions` (`polaris-core/src/main/java/org/apache/polaris/core/persistence/bootstrap/SchemaOptions.java`)

---

### 27. `1e69373` - Optimize the location overlap check with an index (#1686)

**Date:** 2025-06-26
**PR:** [#1686](https://github.com/apache/polaris/pull/1686)
**Total files changed:** 30
**Interfaces modified:** 3
**Stats:** +863 / -95

**Modified interfaces:**
- `LocationBasedEntity` (`polaris-core/src/main/java/org/apache/polaris/core/entity/LocationBasedEntity.java`)
- `BasePersistence` (`polaris-core/src/main/java/org/apache/polaris/core/persistence/BasePersistence.java`)
- `PolarisMetaStoreManager` (`polaris-core/src/main/java/org/apache/polaris/core/persistence/PolarisMetaStoreManager.java`)

**Description:**
```
<hr>
### Current Behavior
The current logic is that when we create a table, we list all sibling tables and check each and every one to ensure there is no location overlap. This results in O(N^2) checks when adding N tables to a namespace, quickly becoming untenable.
With the `CreateTreeDataset` [benchmark](https://github.com/eric-maynard/polaris-tools/blob/main/benchmarks/src/gatling/scala/org/...
```

---

### 28. `511df8c` - Remove CallContext.of (#1812)

**Date:** 2025-06-04
**PR:** [#1812](https://github.com/apache/polaris/pull/1812)
**Total files changed:** 15
**Interfaces modified:** 1
**Stats:** +71 / -110

**Modified interfaces:**
- `CallContext` (`polaris-core/src/main/java/org/apache/polaris/core/context/CallContext.java`)

---

### 29. `0a9a5d9` - feat(cdi): Remove CallContext.close() (#1776)

**Date:** 2025-06-03
**PR:** [#1776](https://github.com/apache/polaris/pull/1776)
**Total files changed:** 12
**Interfaces modified:** 1
**Stats:** +470 / -607

**Modified interfaces:**
- `CallContext` (`polaris-core/src/main/java/org/apache/polaris/core/context/CallContext.java`)

**Description:**
```
This simplification will hopefully pave the way to a more robust handling of request-scoped beans in task executor threads.
```

---

### 30. `5fe9fd9` - Replace getConfiguration usage with PolarisCallContext to use RealmContext (PART 1) (#1780)

**Date:** 2025-06-02
**PR:** [#1780](https://github.com/apache/polaris/pull/1780)
**Total files changed:** 18
**Interfaces modified:** 1
**Stats:** +88 / -79

**Modified interfaces:**
- `PolarisConfigurationStore` (`polaris-core/src/main/java/org/apache/polaris/core/config/PolarisConfigurationStore.java`)

---

### 31. `a534193` - [Policy Store] Add policyTypeCode to Slice/Index for Future Filtering Support and Update Policy Persistence Method (#1628)

**Date:** 2025-05-22
**PR:** [#1628](https://github.com/apache/polaris/pull/1628)
**Total files changed:** 13
**Interfaces modified:** 2
**Stats:** +131 / -60

**Modified interfaces:**
- `PolicyMappingPersistence` (`polaris-core/src/main/java/org/apache/polaris/core/policy/PolicyMappingPersistence.java`)
- `TransactionalPolicyMappingPersistence` (`polaris-core/src/main/java/org/apache/polaris/core/policy/TransactionalPolicyMappingPersistence.java`)

**Description:**
```
It also updates the loadAllTargetsOnPolicy method to accept policyTypeCode, enabling it to use the new index for better performance.
```

---

## Interface-by-Interface Change History

**Total interfaces modified:** 38

### `CallContext`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/context/CallContext.java`
**Number of commits:** 7
**Category:** context

**Commits:**
- `0449d9b` - 2025-08-01 - Remove CallContext.CURRENT_CONTEXT (#2203) ([#2203](https://github.com/apache/polaris/pull/2203))
- `de351de` - 2025-07-14 - Introduce RealmConfig (#2015) ([#2015](https://github.com/apache/polaris/pull/2015))
- `187d700` - 2025-06-05 - Turn CallContext.copyOf into an interface instead of static function (#1816) ([#1816](https://github.com/apache/polaris/pull/1816))
- `a59942a` - 2025-06-04 - Remove CallContext.getDiagnostics (#1815) ([#1815](https://github.com/apache/polaris/pull/1815))
- `511df8c` - 2025-06-04 - Remove CallContext.of (#1812) ([#1812](https://github.com/apache/polaris/pull/1812))
- `0a8d8b8` - 2025-06-04 - Core: Consolidate CallContext with PolarisCallContext part 1(#1806) ([#1806](https://github.com/apache/polaris/pull/1806))
- `0a9a5d9` - 2025-06-03 - feat(cdi): Remove CallContext.close() (#1776) ([#1776](https://github.com/apache/polaris/pull/1776))


### `PolarisMetaStoreManager`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/persistence/PolarisMetaStoreManager.java`
**Number of commits:** 5
**Category:** persistence

**Commits:**
- `80f0456` - 2025-09-30 - Use PrincipalEntity in PolarisMetaStoreManager.createPrincipal (#2518) ([#2518](https://github.com/apache/polaris/pull/2518))
- `c3f5001` - 2025-09-03 - Add Polaris Events to Persistence (#1844) ([#1844](https://github.com/apache/polaris/pull/1844))
- `b49cbc5` - 2025-08-20 - Add PolarisMetaStoreManager.loadEntities (#2290) ([#2290](https://github.com/apache/polaris/pull/2290))
- `e46f8c6` - 2025-07-28 - Add Principal lookup helpers to PolarisMetaStoreManager (#2174) ([#2174](https://github.com/apache/polaris/pull/2174))
- `1e69373` - 2025-06-26 - Optimize the location overlap check with an index (#1686) ([#1686](https://github.com/apache/polaris/pull/1686))


### `BasePersistence`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/persistence/BasePersistence.java`
**Number of commits:** 4
**Category:** persistence

**Commits:**
- `c3f5001` - 2025-09-03 - Add Polaris Events to Persistence (#1844) ([#1844](https://github.com/apache/polaris/pull/1844))
- `b49cbc5` - 2025-08-20 - Add PolarisMetaStoreManager.loadEntities (#2290) ([#2290](https://github.com/apache/polaris/pull/2290))
- `ee04df4` - 2025-08-13 - Add entitySubType param to BasePersistence.listEntities (#2317) ([#2317](https://github.com/apache/polaris/pull/2317))
- `1e69373` - 2025-06-26 - Optimize the location overlap check with an index (#1686) ([#1686](https://github.com/apache/polaris/pull/1686))


### `MetaStoreManagerFactory`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/persistence/MetaStoreManagerFactory.java`
**Number of commits:** 4
**Category:** persistence

**Commits:**
- `ca85339` - 2025-07-24 - Rework getOrCreateSessionSupplier (#2161) ([#2161](https://github.com/apache/polaris/pull/2161))
- `2c2052c` - 2025-07-15 - Use application-scoped StorageCredentialCache (#2022) ([#2022](https://github.com/apache/polaris/pull/2022))
- `de351de` - 2025-07-14 - Introduce RealmConfig (#2015) ([#2015](https://github.com/apache/polaris/pull/2015))
- `44d52d4` - 2025-06-30 - Add options to the bootstrap command to specify a schema file (#1942) ([#1942](https://github.com/apache/polaris/pull/1942))


### `PolarisConfigurationStore`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/config/PolarisConfigurationStore.java`
**Number of commits:** 4
**Category:** config

**Commits:**
- `15f23ca` - 2025-07-11 - Make PolarisConfiguration member variables private (#2007) ([#2007](https://github.com/apache/polaris/pull/2007))
- `3185adf` - 2025-06-05 - Refactor getConfiguration to use RealmContext (Part 2) (#1783) ([#1783](https://github.com/apache/polaris/pull/1783))
- `5fe9fd9` - 2025-06-02 - Replace getConfiguration usage with PolarisCallContext to use RealmContext (PART 1) (#1780) ([#1780](https://github.com/apache/polaris/pull/1780))
- `dd2fdf9` - 2025-06-02 - Handle RequestScoped instance injection gracefully for DefaultConfigurationStore (#1758) ([#1758](https://github.com/apache/polaris/pull/1758))


### `ExternalCatalogFactory`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/catalog/ExternalCatalogFactory.java`
**Number of commits:** 3
**Category:** catalog

**Commits:**
- `519e127` - 2025-10-08 - SigV4 Auth Support for Catalog Federation - Part 4: Connection Credential Manager (#2759) ([#2759](https://github.com/apache/polaris/pull/2759))
- `83d09cc` - 2025-08-18 - Modularize generic table federation (#2379) ([#2379](https://github.com/apache/polaris/pull/2379))
- `b2b1453` - 2025-08-14 - Modularize federation (Option 2) (#2332) ([#2332](https://github.com/apache/polaris/pull/2332))


### `StorageCredentialCacheKey`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/storage/cache/StorageCredentialCacheKey.java`
**Number of commits:** 3
**Category:** storage

**Commits:**
- `9e6d929` - 2025-08-28 - add refresh credentials property to loadTableResult (#2341) ([#2341](https://github.com/apache/polaris/pull/2341))
- `9ecf29b` - 2025-07-15 - Use PolarisImmutable for StorageCredentialCacheKey (#2029) ([#2029](https://github.com/apache/polaris/pull/2029))
- `6ddd148` - 2025-07-13 - Make StorageCredentialCache safe for mutli-realm usage (#2021) ([#2021](https://github.com/apache/polaris/pull/2021))


### `SchemaOptions`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/persistence/bootstrap/SchemaOptions.java`
**Number of commits:** 2
**Category:** persistence

**Commits:**
- `413e293` - 2025-10-07 - JDBC: Fix Bootstrap with schema options (#2762) ([#2762](https://github.com/apache/polaris/pull/2762))
- `44d52d4` - 2025-06-30 - Add options to the bootstrap command to specify a schema file (#1942) ([#1942](https://github.com/apache/polaris/pull/1942))


### `AccessConfig`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/storage/AccessConfig.java`
**Number of commits:** 2
**Category:** storage

**Commits:**
- `927bb5e` - 2025-10-03 - Enforce that S3 credentials are vended when requested (#2711) ([#2711](https://github.com/apache/polaris/pull/2711))
- `7b04abe` - 2025-07-25 - Push AccessConfig creation to PolarisStorageIntegration (#2171) ([#2171](https://github.com/apache/polaris/pull/2171))


### `ResolutionManifestFactory`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/persistence/resolver/ResolutionManifestFactory.java`
**Number of commits:** 2
**Category:** persistence

**Commits:**
- `359388e` - 2025-10-02 - Make ResolverFactory + ResolutionManifestFactory request-scoped (#2540) ([#2540](https://github.com/apache/polaris/pull/2540))
- `253321c` - 2025-08-04 - Add ResolutionManifestFactory (#2210) ([#2210](https://github.com/apache/polaris/pull/2210))


### `ResolverFactory`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/persistence/resolver/ResolverFactory.java`
**Number of commits:** 2
**Category:** persistence

**Commits:**
- `359388e` - 2025-10-02 - Make ResolverFactory + ResolutionManifestFactory request-scoped (#2540) ([#2540](https://github.com/apache/polaris/pull/2540))
- `95358a9` - 2025-07-23 - Extract ResolverFactory from PolarisEntityManager (#2148) ([#2148](https://github.com/apache/polaris/pull/2148))


### `PolarisPrincipal`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/auth/PolarisPrincipal.java`
**Number of commits:** 2
**Category:** auth

**Commits:**
- `f334d1a` - 2025-09-19 - Remove numeric identifier from PolarisPrincipal (#2388) ([#2388](https://github.com/apache/polaris/pull/2388))
- `96f1459` - 2025-08-18 - Refactor Authenticator and PolarisPrincipal (#2307) ([#2307](https://github.com/apache/polaris/pull/2307))


### `PolarisSecretsManager`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/auth/PolarisSecretsManager.java`
**Number of commits:** 2
**Category:** auth

**Commits:**
- `be4175c` - 2025-09-12 - Inject PolarisAdminService into PolarisServiceImpl (#2533) ([#2533](https://github.com/apache/polaris/pull/2533))
- `327697c` - 2025-09-02 - Feature: Expose resetCredentials via a new reset api to allow root user to reset credentials for an existing principal with custom values  (#2197) ([#2197](https://github.com/apache/polaris/pull/2197))


### `EntityIdToken`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/persistence/pagination/EntityIdToken.java`
**Number of commits:** 2
**Category:** persistence

**Commits:**
- `f6bcbd2` - 2025-09-03 - perf(refactor): optimizing JdbcBasePersistenceImpl.listEntities (#2465) ([#2465](https://github.com/apache/polaris/pull/2465))
- `fb418a2` - 2025-07-16 - Extensible pagination token implementation (#1938) ([#1938](https://github.com/apache/polaris/pull/1938))


### `TransactionalPersistence`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/persistence/transactional/TransactionalPersistence.java`
**Number of commits:** 2
**Category:** persistence

**Commits:**
- `b49cbc5` - 2025-08-20 - Add PolarisMetaStoreManager.loadEntities (#2290) ([#2290](https://github.com/apache/polaris/pull/2290))
- `ee04df4` - 2025-08-13 - Add entitySubType param to BasePersistence.listEntities (#2317) ([#2317](https://github.com/apache/polaris/pull/2317))


### `PageToken`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/persistence/pagination/PageToken.java`
**Number of commits:** 2
**Category:** persistence

**Commits:**
- `a0a2b87` - 2025-08-20 - feat: enforce LIST_PAGINATION_ENABLED (#2401) ([#2401](https://github.com/apache/polaris/pull/2401))
- `fb418a2` - 2025-07-16 - Extensible pagination token implementation (#1938) ([#1938](https://github.com/apache/polaris/pull/1938))


### `PolarisAuthorizer`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/auth/PolarisAuthorizer.java`
**Number of commits:** 2
**Category:** auth

**Commits:**
- `96f1459` - 2025-08-18 - Refactor Authenticator and PolarisPrincipal (#2307) ([#2307](https://github.com/apache/polaris/pull/2307))
- `88f58fc` - 2025-08-15 - Make PolarisAuthorizer RequestScoped (#2340) ([#2340](https://github.com/apache/polaris/pull/2340))


### `UserSecretsManager`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/secrets/UserSecretsManager.java`
**Number of commits:** 2
**Category:** secrets

**Commits:**
- `e45be14` - 2025-08-15 - SigV4 Auth Support for Catalog Federation - Part 2: Connection Config Persistence (#2190) ([#2190](https://github.com/apache/polaris/pull/2190))
- `45df8ac` - 2025-06-18 - Improve the parsing and validation of UserSecretReferenceUrns (#1840) ([#1840](https://github.com/apache/polaris/pull/1840))


### `IcebergCatalogPropertiesProvider`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/connection/iceberg/IcebergCatalogPropertiesProvider.java`
**Number of commits:** 1
**Category:** connection

**Commits:**
- `519e127` - 2025-10-08 - SigV4 Auth Support for Catalog Federation - Part 4: Connection Credential Manager (#2759) ([#2759](https://github.com/apache/polaris/pull/2759))


### `PolarisCredentialManager`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/credentials/PolarisCredentialManager.java`
**Number of commits:** 1
**Category:** credentials

**Commits:**
- `519e127` - 2025-10-08 - SigV4 Auth Support for Catalog Federation - Part 4: Connection Credential Manager (#2759) ([#2759](https://github.com/apache/polaris/pull/2759))


### `ConnectionCredentialVendor`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/credentials/connection/ConnectionCredentialVendor.java`
**Number of commits:** 1
**Category:** connection

**Commits:**
- `519e127` - 2025-10-08 - SigV4 Auth Support for Catalog Federation - Part 4: Connection Credential Manager (#2759) ([#2759](https://github.com/apache/polaris/pull/2759))


### `ConnectionCredentials`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/credentials/connection/ConnectionCredentials.java`
**Number of commits:** 1
**Category:** connection

**Commits:**
- `519e127` - 2025-10-08 - SigV4 Auth Support for Catalog Federation - Part 4: Connection Credential Manager (#2759) ([#2759](https://github.com/apache/polaris/pull/2759))


### `ServiceIdentityProvider`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/identity/provider/ServiceIdentityProvider.java`
**Number of commits:** 1
**Category:** other

**Commits:**
- `793a118` - 2025-10-03 - SigV4 Auth Support for Catalog Federation - Part 3: Service Identity Info Injection (#2523) ([#2523](https://github.com/apache/polaris/pull/2523))


### `PolarisResolutionManifestCatalogView`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/persistence/resolver/PolarisResolutionManifestCatalogView.java`
**Number of commits:** 1
**Category:** persistence

**Commits:**
- `b190b77` - 2025-10-03 - Add PolarisResolutionManifestCatalogView.getResolvedCatalogEntity helper (#2750) ([#2750](https://github.com/apache/polaris/pull/2750))


### `RootCredentialsSet`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/persistence/bootstrap/RootCredentialsSet.java`
**Number of commits:** 1
**Category:** persistence

**Commits:**
- `112d80b` - 2025-09-15 - Avoid using jackson method for parsing YAML from any URL in RootCredentialsSet (#2543) ([#2543](https://github.com/apache/polaris/pull/2543))


### `PolarisEventManager`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/entity/PolarisEventManager.java`
**Number of commits:** 1
**Category:** entity

**Commits:**
- `c3f5001` - 2025-09-03 - Add Polaris Events to Persistence (#1844) ([#1844](https://github.com/apache/polaris/pull/1844))


### `Identifiable`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/entity/Identifiable.java`
**Number of commits:** 1
**Category:** entity

**Commits:**
- `f6bcbd2` - 2025-09-03 - perf(refactor): optimizing JdbcBasePersistenceImpl.listEntities (#2465) ([#2465](https://github.com/apache/polaris/pull/2465))


### `IntegrationPersistence`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/persistence/IntegrationPersistence.java`
**Number of commits:** 1
**Category:** persistence

**Commits:**
- `327697c` - 2025-09-02 - Feature: Expose resetCredentials via a new reset api to allow root user to reset credentials for an existing principal with custom values  (#2197) ([#2197](https://github.com/apache/polaris/pull/2197))


### `PolarisCredentialVendor`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/storage/PolarisCredentialVendor.java`
**Number of commits:** 1
**Category:** storage

**Commits:**
- `9e6d929` - 2025-08-28 - add refresh credentials property to loadTableResult (#2341) ([#2341](https://github.com/apache/polaris/pull/2341))


### `PolarisStorageIntegrationProvider`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/storage/PolarisStorageIntegrationProvider.java`
**Number of commits:** 1
**Category:** storage

**Commits:**
- `532ee51` - 2025-08-05 - Remove config parameter from `PolarisStorageIntegration#getSubscopedCreds` (#2235) ([#2235](https://github.com/apache/polaris/pull/2235))


### `Token`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/persistence/pagination/Token.java`
**Number of commits:** 1
**Category:** persistence

**Commits:**
- `fb418a2` - 2025-07-16 - Extensible pagination token implementation (#1938) ([#1938](https://github.com/apache/polaris/pull/1938))


### `StorageCredentialCacheConfig`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/storage/cache/StorageCredentialCacheConfig.java`
**Number of commits:** 1
**Category:** storage

**Commits:**
- `2c2052c` - 2025-07-15 - Use application-scoped StorageCredentialCache (#2022) ([#2022](https://github.com/apache/polaris/pull/2022))


### `RealmConfig`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/config/RealmConfig.java`
**Number of commits:** 1
**Category:** config

**Commits:**
- `de351de` - 2025-07-14 - Introduce RealmConfig (#2015) ([#2015](https://github.com/apache/polaris/pull/2015))


### `StsClientProvider`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/storage/aws/StsClientProvider.java`
**Number of commits:** 1
**Category:** storage

**Commits:**
- `95d1eac` - 2025-07-04 - feat: Support customizing S3 endpoints (#1913) ([#1913](https://github.com/apache/polaris/pull/1913))


### `BootstrapOptions`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/persistence/bootstrap/BootstrapOptions.java`
**Number of commits:** 1
**Category:** persistence

**Commits:**
- `44d52d4` - 2025-06-30 - Add options to the bootstrap command to specify a schema file (#1942) ([#1942](https://github.com/apache/polaris/pull/1942))


### `LocationBasedEntity`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/entity/LocationBasedEntity.java`
**Number of commits:** 1
**Category:** entity

**Commits:**
- `1e69373` - 2025-06-26 - Optimize the location overlap check with an index (#1686) ([#1686](https://github.com/apache/polaris/pull/1686))


### `PolicyMappingPersistence`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/policy/PolicyMappingPersistence.java`
**Number of commits:** 1
**Category:** policy

**Commits:**
- `a534193` - 2025-05-22 - [Policy Store] Add policyTypeCode to Slice/Index for Future Filtering Support and Update Policy Persistence Method (#1628) ([#1628](https://github.com/apache/polaris/pull/1628))


### `TransactionalPolicyMappingPersistence`

**Full path:** `polaris-core/src/main/java/org/apache/polaris/core/policy/TransactionalPolicyMappingPersistence.java`
**Number of commits:** 1
**Category:** policy

**Commits:**
- `a534193` - 2025-05-22 - [Policy Store] Add policyTypeCode to Slice/Index for Future Filtering Support and Update Policy Persistence Method (#1628) ([#1628](https://github.com/apache/polaris/pull/1628))

