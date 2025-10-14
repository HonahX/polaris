# Comprehensive Commit Table
**Analysis Period:** From commit `94c94f197f1375ac5b7f949f611a4ac03579d9f0` to current `main`
**Total Commits:** 795
---

## Summary Statistics
- **Total files changed:** 5431
- **Total additions:** 110,071
- **Total deletions:** 131,867
- **Commits with PR reference:** 790 (99%)

### Top Contributors
- Mend Renovate: 257 commits
- Christopher Lambert: 71 commits
- Robert Stupp: 69 commits
- Alexandre Dutra: 49 commits
- Yong Zheng: 46 commits
- Dmitri Bourlatchkov: 46 commits
- Yufei Gu: 35 commits
- JB Onofré: 31 commits
- Eric Maynard: 24 commits
- Honah (Jonas) J.: 23 commits

---

## Complete Commit List

| Date | Hash | PR | Title | Description | Files | +/- |
|------|------|-------|-------|-------------|-------|-----|
| 2025-10-13 | `dbc21a3` | [#2804](https://github.com/apache/polaris/pull/2804) | Update dependency io.opentelemetry:opentelemetry-bom to v1.55.0 (#2804) | - | 1 | +1/-1 |
| 2025-10-13 | `cc7bb95` | [#2801](https://github.com/apache/polaris/pull/2801) | Correct invalid example in management service OpenAPI spec (#2801) | This was causing a `NullPointerException` in OpenAPI Generator v7.13.0+ due to a change in how examples are processed. The generator now expects all `examples` to be valid and non-empty, and a misp... | 1 | +6/-6 |
| 2025-10-13 | `ed029d1` | [#2791](https://github.com/apache/polaris/pull/2791) | [Catalog Federation] Block credential vending for remote tables outside allowed location list (#2791) | - | 4 | +164/-45 |
| 2025-10-12 | `491a9e3` | [#2793](https://github.com/apache/polaris/pull/2793) | FIX REG tests with cloud providers (#2793) | - | 2 | +3/-1 |
| 2025-10-13 | `e1fc1fc` | [#2799](https://github.com/apache/polaris/pull/2799) | Update dependency software.amazon.awssdk:bom to v2.35.5 (#2799) | - | 1 | +1/-1 |
| 2025-10-12 | `636405a` | [#2795](https://github.com/apache/polaris/pull/2795) | Python client: remove Python 3.9 support (#2795) | - | 5 | +8/-4 |
| 2025-10-12 | `d396ffd` | [#2796](https://github.com/apache/polaris/pull/2796) | Python client: update CHANGELOG.MD for recent changes (#2796) | - | 1 | +2/-0 |
| 2025-10-10 | `a496a6f` | [#2761](https://github.com/apache/polaris/pull/2761) | Site: Add docs for catalog federation (#2761) | - | 3 | +222/-0 |
| 2025-10-10 | `04a9950` | [#2784](https://github.com/apache/polaris/pull/2784) | [Catalog Federation] Enable Credential Vending for Passthrough Facade Catalog (#2784) | When creating a passthrough-facade catalog, the configuration currently requires two components: StorageConfig – specifies the storage info for the remote catalog. ConnectionInfo – defines connecti... | 6 | +178/-50 |
| 2025-10-10 | `622031a` | [#2783](https://github.com/apache/polaris/pull/2783) | Freeze 1.2 change log (#2783) | - | 1 | +32/-15 |
| 2025-10-09 | `07a099c` | [#2788](https://github.com/apache/polaris/pull/2788) | Update Pull Request Template (#2788) | - | 1 | +41/-0 |
| 2025-10-09 | `50d45bc` | [#2789](https://github.com/apache/polaris/pull/2789) | Spark: Remove unnecessary dependency (#2789) | - | 1 | +0/-1 |
| 2025-10-09 | `150d835` | [#2787](https://github.com/apache/polaris/pull/2787) | Enhance Release docs (#2787) | - | 1 | +3/-0 |
| 2025-10-09 | `d449f59` | [#2780](https://github.com/apache/polaris/pull/2780) | Update immutables to v2.11.6 (#2780) | - | 1 | +1/-1 |
| 2025-10-08 | `9957e24` | [#2736](https://github.com/apache/polaris/pull/2736) | Extract IcebergCatalog.getAccessConfig to a separate class AccessConfigProvider (#2736) | The old SupportsCredentialVending is removed in this PR upon discussion | 16 | +204/-124 |
| 2025-10-08 | `519e127` | [#2759](https://github.com/apache/polaris/pull/2759) | SigV4 Auth Support for Catalog Federation - Part 4: Connection Credential Manager (#2759) | The core of this PR is the new ConnectionCredentialVendor interface, which: Generates connection credentials by combining service identity with user auth parameters Supports different authenticatio... | 41 | +1234/-30 |
| 2025-10-08 | `031a551` | [#2779](https://github.com/apache/polaris/pull/2779) | Update the LICENSE and NOTICE files in the runtime (#2779) | - | 6 | +874/-831 |
| 2025-10-08 | `73e382a` | [#2777](https://github.com/apache/polaris/pull/2777) | Update dependency org.jboss.weld:weld-junit5 to v5.0.3.Final (#2777) | - | 1 | +1/-1 |
| 2025-10-08 | `b4e5e28` | [#2764](https://github.com/apache/polaris/pull/2764) | Update dependency com.google.cloud:google-cloud-storage-bom to v2.58.1 (#2764) | - | 1 | +1/-1 |
| 2025-10-07 | `69c546a` | [#2701](https://github.com/apache/polaris/pull/2701) | Client: add support for policy management (#2701) | Here are the subcommands to API mapping: attach  - PUT /polaris/v1/{prefix}/namespaces/{namespace}/policies/{policy-name}/mappings create  - POST /polaris/v1/{prefix}/namespaces/{namespace}/policie... | 10 | +853/-21 |
| 2025-10-08 | `7f971cb` | [#2776](https://github.com/apache/polaris/pull/2776) | Update immutables to v2.11.5 (#2776) | - | 1 | +1/-1 |
| 2025-10-07 | `980e206` | [#2765](https://github.com/apache/polaris/pull/2765) | Add Arguments to Various Event Records (#2765) | - | 2 | +39/-11 |
| 2025-10-07 | `1387ed9` | [#2775](https://github.com/apache/polaris/pull/2775) | Update Changelog with finer grained authz (#2775) | - | 1 | +2/-0 |
| 2025-10-07 | `ff0b754` | [#2753](https://github.com/apache/polaris/pull/2753) | Site: Add puppygraph integration (#2753) | - | 11 | +384/-0 |
| 2025-10-07 | `413e293` | [#2762](https://github.com/apache/polaris/pull/2762) | JDBC: Fix Bootstrap with schema options (#2762) | - | 12 | +364/-77 |
| 2025-10-07 | `e973100` | [#2768](https://github.com/apache/polaris/pull/2768) | Delete ServiceSecretReference (#2768) | - | 1 | +0/-53 |
| 2025-10-07 | `fcf3f5f` | [#2770](https://github.com/apache/polaris/pull/2770) | [Python CLI][CI Failure] Pin pydantic version to < 2.12.0 to fix CI failure (#2770) | - | 1 | +1/-1 |
| 2025-10-07 | `4117551` | [#2697](https://github.com/apache/polaris/pull/2697) | Implement Finer Grained Operations and Privileges For Update Table (#2697) | The idea is that all the existing privileges and operations will work and continue to work even after this change. (i.e. TABLE_WRITE_PROPERTIES will still ensure update table is authorized even aft... | 13 | +1683/-46 |
| 2025-10-07 | `62a1e70` | [#2748](https://github.com/apache/polaris/pull/2748) | Refactor resolutionManifest handling in PolarisAdminService (#2748) | "authorize" methods return their `PolarisResolutionManifest` - replace "find" helpers with "get" helpers that have built-in error   handling | 1 | +259/-268 |
| 2025-10-06 | `5730b8f` | [#2763](https://github.com/apache/polaris/pull/2763) | Update eric-maynard Team entry (#2763) | - | 1 | +1/-1 |
| 2025-10-06 | `dc3f44c` | [#2727](https://github.com/apache/polaris/pull/2727) | Update apache/spark Docker tag to v3.5.7 (#2727) | - | 2 | +2/-2 |
| 2025-10-06 | `d27cff8` | [#2760](https://github.com/apache/polaris/pull/2760) | Update dependency software.amazon.awssdk:bom to v2.35.0 (#2760) | - | 1 | +1/-1 |
| 2025-10-04 | `10f4bc5` | [#2747](https://github.com/apache/polaris/pull/2747) | Service: RealmContextFilter test refactor (#2747) | - | 3 | +118/-123 |
| 2025-10-04 | `7b45d82` | [#2758](https://github.com/apache/polaris/pull/2758) | Update actions/stale digest to 5f858e3 (#2758) | - | 1 | +1/-1 |
| 2025-10-03 | `793a118` | [#2523](https://github.com/apache/polaris/pull/2523) | SigV4 Auth Support for Catalog Federation - Part 3: Service Identity Info Injection (#2523) | * Service Identity Injection * Return injected service identity info in response * Use AwsCredentialsProvider to retrieve the credentials * Move some logic to ServiceIdentityConfiguration * Rename ... | 34 | +1663/-73 |
| 2025-10-03 | `3e80675` | [#2690](https://github.com/apache/polaris/pull/2690) | [Catalog Federation] Ignore JIT entities when deleting federated catalogs, add integration test for namespace/table-level RBAC (#2690) | This will be the first step towards JIT entity clean-up: 1. Ignore JIT entities when dropping federated catalog (orphan entities) 2. Register tasks/in-place cleanup JIT entities during catalog drop... | 6 | +244/-71 |
| 2025-10-03 | `927bb5e` | [#2711](https://github.com/apache/polaris/pull/2711) | Enforce that S3 credentials are vended when requested (#2711) | * Add property to `AccessConfig` to indicate whether the backing storage integration can produce credentials. * Add a check to `IcebergCatalogHandler` (leading to 400) that storage credentials are ... | 5 | +88/-9 |
| 2025-10-03 | `b190b77` | [#2750](https://github.com/apache/polaris/pull/2750) | Add PolarisResolutionManifestCatalogView.getResolvedCatalogEntity helper (#2750) | - | 9 | +31/-45 |
| 2025-10-03 | `94b4961` | [#2749](https://github.com/apache/polaris/pull/2749) | Deprecate legacy management endpoints for removal (#2749) | - | 2 | +6/-2 |
| 2025-10-03 | `b1142b5` | [#2714](https://github.com/apache/polaris/pull/2714) | JDBC: Handle schema evolution (#2714) | - | 15 | +396/-54 |
| 2025-10-03 | `d2a607a` | [#2720](https://github.com/apache/polaris/pull/2720) | Extract interface for RequestIdGenerator (#2720) | 1. Extracted an interface from `RequestIdGenerator`. 2. The `generateRequestId` method now returns a `Uni<String>` in case custom implementations need to perform I/O or other blocking calls during ... | 9 | +321/-229 |
| 2025-10-03 | `343e43a` | [#2755](https://github.com/apache/polaris/pull/2755) | fix(deps): update dependency io.smallrye.config:smallrye-config-core to v3.14.1 (#2755) | - | 1 | +1/-1 |
| 2025-10-03 | `058f63a` | [#2643](https://github.com/apache/polaris/pull/2643) | fix(enhancement): squash commits (#2643) | - | 7 | +254/-146 |
| 2025-10-03 | `c3fe141` | [#2752](https://github.com/apache/polaris/pull/2752) | Fix javadocs of `PolarisPrincipal.getPrincipalRoles()` (#2752) | - | 1 | +1/-7 |
| 2025-10-03 | `a4e62bd` | [#2718](https://github.com/apache/polaris/pull/2718) | fix(enhancement): add .idea, .vscode, .venv to top level .gitignore (#2718) | - | 1 | +7/-1 |
| 2025-10-02 | `8f05d1b` | [#2712](https://github.com/apache/polaris/pull/2712) | Service: Add events for APIs awaiting API changes (#2712) | - | 2 | +71/-12 |
| 2025-10-02 | `6a82260` | [#2706](https://github.com/apache/polaris/pull/2706) | Updating metastore documentation with Aurora postgres example (#2706) | - | 1 | +31/-0 |
| 2025-10-02 | `8ed89cc` | [#2751](https://github.com/apache/polaris/pull/2751) | Update docker.io/jaegertracing/all-in-one Docker tag to v1.74.0 (#2751) | - | 1 | +1/-1 |
| 2025-10-02 | `baacb47` | [#2667](https://github.com/apache/polaris/pull/2667) | Build: remove code to post-process generated Quarkus jars (#2667) | Since Quarkus 3.28, the generated jars use a fixed timestamp for all ZIP entries, so the custom code is no longer necessary. This PR depends on Quarkus 3.28. | 2 | +0/-61 |
| 2025-10-02 | `359388e` | [#2540](https://github.com/apache/polaris/pull/2540) | Make ResolverFactory + ResolutionManifestFactory request-scoped (#2540) | note that ideally the `SecurityContext` would also be injected from the request however our tests around `PolarisAuthzTestBase` are written in a way that does not easily support this currently. | 19 | +103/-147 |
| 2025-10-02 | `770a9d7` | [#2648](https://github.com/apache/polaris/pull/2648) | fix(deps): update quarkus platform and group to v3.28.2 (#2648) | - | 1 | +1/-1 |
| 2025-10-02 | `c18c38d` | [#2726](https://github.com/apache/polaris/pull/2726) | Testing: add test-parallelism-constraint and unify testing constaints (#2726) | * "num-available-processory / 4" for `Test` tasks except `test`, optionally configurable via the system property `polaris.intTestParallelism` * "num-available-processory / 2" for `Test` tasks named... | 6 | +57/-25 |
| 2025-10-02 | `f8aa0fa` | [#2742](https://github.com/apache/polaris/pull/2742) | Fix: Build task syncNoticeAndLicense fails on Windows (#2742) | * Fix: Build task syncNoticeAndLicense fails on Windows | 1 | +3/-1 |
| 2025-10-02 | `65c5d11` | [#2744](https://github.com/apache/polaris/pull/2744) | fix(deps): update dependency com.github.dasniko:testcontainers-keycloak to v3.9.0 (#2744) | - | 1 | +1/-1 |
| 2025-10-02 | `5f73f92` | [#2746](https://github.com/apache/polaris/pull/2746) | 2678 (#2746) | - | 1 | +1/-1 |
| 2025-10-02 | `97c62cb` | [#2740](https://github.com/apache/polaris/pull/2740) | NoSQL: minor change to polaris-core for paging (#2740) | - | 1 | +5/-1 |
| 2025-10-01 | `395f7bd` | [#2739](https://github.com/apache/polaris/pull/2739) | Build/nit: remove unnecessary apt dependency (#2739) | - | 1 | +0/-2 |
| 2025-10-01 | `aaa81b8` | [#2662](https://github.com/apache/polaris/pull/2662) | Remove unused EntityCacheMode (#2662) | - | 2 | +0/-53 |
| 2025-10-01 | `6815de9` | [#2741](https://github.com/apache/polaris/pull/2741) | chore(deps): update gradle/actions action to v5 (#2741) | - | 1 | +1/-1 |
| 2025-10-01 | `f7b5646` | [#2731](https://github.com/apache/polaris/pull/2731) | IRC SPEC v3 support: Change the IRC spec to use 1.10 yaml (#2731) | - | 2 | +116/-27 |
| 2025-10-01 | `c07b1b7` | [#2738](https://github.com/apache/polaris/pull/2738) | fix(deps): update dependency org.keycloak:keycloak-admin-client to v26.0.7 (#2738) | - | 1 | +1/-1 |
| 2025-10-01 | `abf1e35` | [#2737](https://github.com/apache/polaris/pull/2737) | CI: Split-jobs - fix store-cache dependencies (#2737) | - | 1 | +2/-0 |
| 2025-10-01 | `8906672` | [#2725](https://github.com/apache/polaris/pull/2725) | CI: GHCR docker.io mirror - testcontainers (#2725) | * Disable testcontainers startup checks, saving a few seconds, see https://www.testcontainers.org/features/configuration/#disabling-the-startup-checks * Use GitHub's docker.io mirror for containers... | 3 | +68/-0 |
| 2025-10-01 | `6a6dc38` | [#2734](https://github.com/apache/polaris/pull/2734) | Build: make jcstress task cacheable (#2734) | - | 1 | +19/-0 |
| 2025-10-01 | `12f3ad2` | [#2733](https://github.com/apache/polaris/pull/2733) | Split CI jobs, improve overall CI duration (#2733) | * `Quarkus Admin Tests` removes 6 minutes from `Quarkus Tests` (leaving 20 minutes total test task runtime) Intentionally not changing the name of `Quarkus Tests` as it's a required check, changing... | 2 | +89/-8 |
| 2025-09-30 | `ea50fe3` | [#2724](https://github.com/apache/polaris/pull/2724) | TestEventsListener - reduce memory pressure (#2724) | Also uses a thread-safe collection now. | 3 | +170/-158 |
| 2025-09-30 | `80f0456` | [#2518](https://github.com/apache/polaris/pull/2518) | Use PrincipalEntity in PolarisMetaStoreManager.createPrincipal (#2518) | if we pass and return a more specific `PrincipalEntity` we can simplify the surrounding code and implementation | 11 | +77/-163 |
| 2025-09-30 | `7bfe2f6` | [#2732](https://github.com/apache/polaris/pull/2732) | fix(deps): update dependency ch.qos.logback:logback-classic to v1.5.19 (#2732) | - | 1 | +1/-1 |
| 2025-09-30 | `5811b12` | [#2730](https://github.com/apache/polaris/pull/2730) | Build: remove unnecessary explicit vertx-core dependency (#2730) | - | 2 | +5/-3 |
| 2025-09-30 | `4024557` | [#2719](https://github.com/apache/polaris/pull/2719) | chore(deps): update quay.io/keycloak/keycloak docker tag to v26.4.0 (#2719) | - | 1 | +1/-1 |
| 2025-09-30 | `df81b6d` | [#2721](https://github.com/apache/polaris/pull/2721) | fix(deps): update dependency org.jboss.weld:weld-junit5 to v5.0.2.final (#2721) | - | 1 | +1/-1 |
| 2025-09-30 | `31d0a03` | [#2722](https://github.com/apache/polaris/pull/2722) | fix(deps): update dependency io.smallrye:jandex to v3.5.0 (#2722) | - | 1 | +1/-1 |
| 2025-09-30 | `6844069` | [#2723](https://github.com/apache/polaris/pull/2723) | Fix RDS devservices config + adopt for `:polaris-admin:test` (#2723) | * Disables devservices for `:polaris-admin` tests as well, which is necessary to _not_ spin up test containers. * Use the explicit devservices-config as everywhere else. The first bullet point can ... | 2 | +5/-5 |
| 2025-09-30 | `dedda29` | [#2527](https://github.com/apache/polaris/pull/2527) | NoSQL persistence: add Java/Vert.X executor abstraction layer (#2527) | - | 29 | +1941/-0 |
| 2025-09-30 | `b8f956a` | [#2715](https://github.com/apache/polaris/pull/2715) | fix(deps): update dependency org.junit:junit-bom to v5.14.0 (#2715) | - | 1 | +1/-1 |
| 2025-09-30 | `2f0c7a4` | [#2602](https://github.com/apache/polaris/pull/2602) | Generate Request IDs (if not specified); Return Request ID as a Header (#2602) | - | 9 | +402/-10 |
| 2025-09-29 | `3b4b995` | [#2713](https://github.com/apache/polaris/pull/2713) | Fix `delegationModes` parameter propagation in `createTableStaged()` (#2713) | The bugfix part #2711 is extracted here since #2711 proved to be non-trivial and may require extra time. * Use the `delegationModes` method parameter as intended (as opposed   to a local constant). | 1 | +1/-1 |
| 2025-09-29 | `aeae51f` | [#2696](https://github.com/apache/polaris/pull/2696) | [Catalog Federation] Add feature flag to disallow setting sub-RBAC for federated catalog at catalog level (#2696) | This PR add a feature flag, ALLOW_SETTING_SUB_CATALOG_RBAC_FOR_FEDERATED_CATALOGS to allow owner to disable catalog level setting polaris.config.enable-sub-catalog-rbac-for-federated-catalogs | 4 | +172/-2 |
| 2025-09-29 | `5ea215a` | [#2653](https://github.com/apache/polaris/pull/2653) | Add fallback in case the VERSION table is not present (#2653) | * wire up * pastefix * change to postgres specific code | 5 | +30/-2 |
| 2025-09-29 | `d8d0f81` | [#2700](https://github.com/apache/polaris/pull/2700) | Client: fix integration testing (#2700) | - | 3 | +2/-10 |
| 2025-09-29 | `bd94b25` | [#2708](https://github.com/apache/polaris/pull/2708) | chore(deps): update gradle/actions digest to 748248d (#2708) | - | 1 | +1/-1 |
| 2025-09-29 | `2cfa41b` | [#2695](https://github.com/apache/polaris/pull/2695) | Docs/improve idp documentation (#2695) | * Separate IDP docs for usage and development * - Add telemetry config example - Fix link to getting started from landing page - Fix mentioning role-arn as required * Fix some relative links (local... | 12 | +231/-123 |
| 2025-09-29 | `f97c5eb` | [#2672](https://github.com/apache/polaris/pull/2672) | Support S3 storage that does not have STS (#2672) | This change is backward compatible with old catalogs that have storage configuration for S3 systems with STS. * Add new property to S3 storage config: `stsUnavailable` (defaults to "available"). * ... | 9 | +118/-53 |
| 2025-09-29 | `8099476` | [#2661](https://github.com/apache/polaris/pull/2661) | fix(deps): update dependency com.gradleup.shadow:shadow-gradle-plugin to v9.2.2 (#2661) | - | 1 | +1/-1 |
| 2025-09-29 | `3937738` | [#2702](https://github.com/apache/polaris/pull/2702) | fix(deps): update dependency software.amazon.awssdk:bom to v2.34.5 (#2702) | - | 1 | +1/-1 |
| 2025-09-28 | `0764745` | [#2698](https://github.com/apache/polaris/pull/2698) | Client: add credential reset option (#2698) | * Client: add credential reset option * Client: add credential reset option * Add integration testing * Fix lint | 9 | +197/-2 |
| 2025-09-26 | `f2e3848` | [#2693](https://github.com/apache/polaris/pull/2693) | Fix a race condition in sendNotification where concurrent parent-namespace creation causes failures (#2693) | The semantics of the createNonExistingNamespaces method used during sendNotification were supposed to be "create if needed". However, the behavior ended up surfacing an AlreadyExistsException if mu... | 2 | +101/-11 |
| 2025-09-26 | `c4fee3d` | [#2691](https://github.com/apache/polaris/pull/2691) | Remove unused `name` arg from findCatalogByName in PolarisAdminService (#2691) | * Rename for better readability | 1 | +19/-22 |
| 2025-09-26 | `965bd53` | [#2650](https://github.com/apache/polaris/pull/2650) | Enhancement : adding support for Aurora postgres AWS IAM authentication (#2650) | - | 5 | +13/-1 |
| 2025-09-26 | `149aaa6` | [#2634](https://github.com/apache/polaris/pull/2634) | Auth: reorganize internal authentication components (#2634) | Summary of changes: - Moved all internal authentication components to the `org.apache.polaris.service.auth.internal` package and subpackages - Reduced visibility of utility classes - Renamed `Token... | 33 | +298/-436 |
| 2025-09-26 | `7110592` | [#2694](https://github.com/apache/polaris/pull/2694) | fix(deps): update dependency org.kordamp.gradle:jandex-gradle-plugin to v2.3.0 (#2694) | - | 1 | +1/-1 |
| 2025-09-26 | `19742cc` | [#2629](https://github.com/apache/polaris/pull/2629) | Fix & enhancements to the Events API hierarchy (#2629) | - Turned `PolarisEventListener` into an interface to facilitate implementation / mocking - Added missing `implements PolarisEvent` to many event records - Removed unused method overrides - Added mi... | 12 | +1247/-457 |
| 2025-09-26 | `0492496` | [#2596](https://github.com/apache/polaris/pull/2596) | Publish Develocity builds scans for PRs and local use (#2596) | CI build scans in the `apache/polaris` repo against branches and tags and having access to the ASF's Develocity secret continue to publish to the ASF's Develocity instance (no behavioral change). A... | 8 | +101/-16 |
| 2025-09-26 | `7b444eb` | [#2663](https://github.com/apache/polaris/pull/2663) | chore(deps): update dependency io.quarkus to v3.27.0 (#2663) | - | 1 | +1/-1 |
| 2025-09-26 | `3f758bf` | [#2410](https://github.com/apache/polaris/pull/2410) | chore(deps): update dependency openapi-generator-cli to v7.15.0 (#2410) | - | 1 | +1/-1 |
| 2025-09-26 | `95653eb` | [#2646](https://github.com/apache/polaris/pull/2646) | fix(deps): update dependency org.apache.logging.log4j:log4j-core to v2.25.2 (#2646) | - | 1 | +1/-1 |
| 2025-09-26 | `0e7d5da` | [#2682](https://github.com/apache/polaris/pull/2682) | fix(deps): update dependency org.eclipse.persistence:eclipselink to v4.0.8 (#2682) | - | 1 | +1/-1 |
| 2025-09-26 | `1e4e1be` | [#2692](https://github.com/apache/polaris/pull/2692) | chore(deps): update postgres docker tag to v18 (#2692) | - | 2 | +2/-2 |
| 2025-09-25 | `41968a7` | [#2688](https://github.com/apache/polaris/pull/2688) | Make ENABLE_SUB_CATALOG_RBAC_FOR_FEDERATED_CATALOGS configurable per catalog (#2688) | - | 4 | +24/-4 |
| 2025-09-25 | `7f5c2a8` | [#2676](https://github.com/apache/polaris/pull/2676) | Docs: Add analytics for polaris.apache.org (#2676) | - | 1 | +21/-0 |
| 2025-09-25 | `925c00b` | [#2683](https://github.com/apache/polaris/pull/2683) | Site: The link https://iceberg.apache.org/concepts/catalog/ doesn't exist anymore. (#2683) | - | 1 | +1/-1 |
| 2025-09-25 | `8ea68e1` | [#2674](https://github.com/apache/polaris/pull/2674) | Docs: Add more details about v1 schema user to upgrade from 1.0 to 1.1 (#2674) | - | 2 | +6/-0 |
| 2025-09-25 | `f1d71a9` | [#2673](https://github.com/apache/polaris/pull/2673) | (Based on PR#2223)Support Namespace/Table level RBAC for external passthrough catalogs (#2673) | Based on Option 1 discussed in the RBAC section of catalog federation design doc. In the future, we could remove calls to PolarisEntity.Builder() and replace them with entities fetched from the rem... | 5 | +775/-34 |
| 2025-09-25 | `0f75c2e` | [#2681](https://github.com/apache/polaris/pull/2681) | chore(deps): update quay.io/keycloak/keycloak docker tag to v26.3.5 (#2681) | - | 1 | +1/-1 |
| 2025-09-25 | `2c0bf58` | [#2669](https://github.com/apache/polaris/pull/2669) | fix(deps): update dependency com.diffplug.spotless:spotless-plugin-gradle to v8 (#2669) | - | 1 | +1/-1 |
| 2025-09-25 | `a756b57` | [#2679](https://github.com/apache/polaris/pull/2679) | fix(deps): update immutables to v2.11.4 (#2679) | - | 1 | +1/-1 |
| 2025-09-24 | `53aa531` | [#2670](https://github.com/apache/polaris/pull/2670) | fix(auth): let ServiceFailureException bubble up for proper HTTP status mapping during auth (#2670) | - | 2 | +26/-0 |
| 2025-09-25 | `717b726` | [#2668](https://github.com/apache/polaris/pull/2668) | fix(deps): update dependency com.h2database:h2 to v2.4.240 (#2668) | - | 1 | +1/-1 |
| 2025-09-24 | `7409939` | [#2654](https://github.com/apache/polaris/pull/2654) | Doc: Add breaking changes section for 1.1 release (#2654) | - | 2 | +29/-0 |
| 2025-09-24 | `091fe6f` | [#2665](https://github.com/apache/polaris/pull/2665) | fix(deps): update dependency org.apache.commons:commons-lang3 to v3.19.0 (#2665) | - | 1 | +1/-1 |
| 2025-09-24 | `2e4afa8` | [#2664](https://github.com/apache/polaris/pull/2664) | Minio testcontainer: allow setting a specific region (#2664) | - | 4 | +22/-11 |
| 2025-09-24 | `fcb6b33` | [#2656](https://github.com/apache/polaris/pull/2656) | Fix Issue 2024 for Rendering Blockquotes (#2656) | * Small fix for URLs * Update license | 10 | +158/-118 |
| 2025-09-24 | `a762589` | [#2658](https://github.com/apache/polaris/pull/2658) | fix(deps): update dependency org.apache.spark:spark-sql_2.12 to v3.5.7 (#2658) | - | 1 | +1/-1 |
| 2025-09-24 | `0928797` | [#2659](https://github.com/apache/polaris/pull/2659) | fix(deps): update dependency org.apache.spark:spark-sql_2.12 to v3.5.7 (#2659) | - | 1 | +1/-1 |
| 2025-09-24 | `b00dca6` | [#2660](https://github.com/apache/polaris/pull/2660) | fix(deps): update dependency com.google.cloud:google-cloud-storage-bom to v2.58.0 (#2660) | - | 1 | +1/-1 |
| 2025-09-23 | `06d5231` | [#2652](https://github.com/apache/polaris/pull/2652) | docs: Update S3 getting started guides (#2652) | - | 7 | +60/-116 |
| 2025-09-23 | `44568da` | [#2647](https://github.com/apache/polaris/pull/2647) | Release artifacts should use dlcdn.apache.org (signature and checksum must refer downloads.apache.org) (#2647) | - | 1 | +10/-10 |
| 2025-09-23 | `b1eb9bd` | [#2655](https://github.com/apache/polaris/pull/2655) | fix: fix broken markdown-link-check CI job after #2611 got merged (#2655) | - | 2 | +2/-2 |
| 2025-09-23 | `d631bde` | [#2651](https://github.com/apache/polaris/pull/2651) | fix(deps): update dependency org.assertj:assertj-core to v3.27.6 (#2651) | - | 1 | +1/-1 |
| 2025-09-22 | `eb7618b` | [#2611](https://github.com/apache/polaris/pull/2611) | chore(docs): reorganize getting-started section (#2611) | - | 18 | +564/-34 |
| 2025-09-22 | `3e08c90` | [#2603](https://github.com/apache/polaris/pull/2603) | [OpenAPI Modification] Return created objects (#2603) | - | 4 | +19/-5 |
| 2025-09-22 | `5ca3fdc` | [#2615](https://github.com/apache/polaris/pull/2615) | Always propagate non-credential properties from AccessConfig to clients (#2615) | This change builds on top of #2589 and further prepares Polaris code to support non-STS S3 implementations for #2589. For S3 implementations that do have STS, this change enables clients to run wit... | 3 | +96/-34 |
| 2025-09-22 | `e6796f7` | [#2649](https://github.com/apache/polaris/pull/2649) | Update jandex dependency to 3.5.0 (#2649) | - | 1 | +1/-1 |
| 2025-09-22 | `da8c9af` | [#2595](https://github.com/apache/polaris/pull/2595) | fix(deps): update quarkus platform and group (#2595) | - | 1 | +1/-1 |
| 2025-09-22 | `e53a352` | [#2628](https://github.com/apache/polaris/pull/2628) | chore(events): unify in-memory buffer listeners implementations (#2628) | - | 7 | +14/-541 |
| 2025-09-22 | `4db5213` | [#2644](https://github.com/apache/polaris/pull/2644) | chore(deps): update docker.io/prom/prometheus docker tag to v3.6.0 (#2644) | - | 1 | +1/-1 |
| 2025-09-22 | `b26e97c` | [#2641](https://github.com/apache/polaris/pull/2641) | fix(deps): update mockito monorepo to v5.20.0 (#2641) | - | 1 | +2/-2 |
| 2025-09-22 | `2d8cef2` | [#2645](https://github.com/apache/polaris/pull/2645) | fix(deps): update dependency software.amazon.awssdk:bom to v2.34.0 (#2645) | - | 1 | +1/-1 |
| 2025-09-20 | `9cb70ab` | [#2642](https://github.com/apache/polaris/pull/2642) | Fix client license check (#2642) | - | 1 | +2/-27 |
| 2025-09-20 | `adea7a6` | [#2637](https://github.com/apache/polaris/pull/2637) | fix(deps): update dependency io.smallrye.config:smallrye-config-core to v3.14.0 (#2637) | - | 1 | +1/-1 |
| 2025-09-20 | `e114df9` | [#2636](https://github.com/apache/polaris/pull/2636) | fix(deps): update dependency com.google.errorprone:error_prone_core to v2.42.0 (#2636) | - | 1 | +1/-1 |
| 2025-09-19 | `e079dbc` | [#2639](https://github.com/apache/polaris/pull/2639) | Remove unused LOG in SparkCatalog (#2639) | - | 1 | +0/-3 |
| 2025-09-19 | `7f5fb06` | [#2633](https://github.com/apache/polaris/pull/2633) | Azure: Fix azure expires at prefix for the credentials refresh (#2633) | - | 4 | +24/-6 |
| 2025-09-19 | `01f4baa` | [#2638](https://github.com/apache/polaris/pull/2638) | Re-add CHANGELOG.md entry for #2197 (#2638) | - | 1 | +2/-0 |
| 2025-09-19 | `a3a87e7` | [#2635](https://github.com/apache/polaris/pull/2635) | CHANGELOG: Freeze change log for 1.1 and clear out unreleased version (#2635) | - | 1 | +45/-59 |
| 2025-09-19 | `553cb06` | [#2482](https://github.com/apache/polaris/pull/2482) | Service: Add Events for PolarisServiceImpl APIs (#2482) | - | 11 | +801/-66 |
| 2025-09-19 | `72e02c9` | [#2631](https://github.com/apache/polaris/pull/2631) | Suppress deprecation warnings in `PolarisSparkCatalog.createTable()` (#2631) | Since we have to override the deprecated `createTable` method, we suppress deprecation warnings produced by `javac`. Suppressing `RedundantSuppression` is needed for IntelliJ, which appears to cons... | 1 | +1/-0 |
| 2025-09-19 | `d1d359a` | [#2390](https://github.com/apache/polaris/pull/2390) | Remove ActiveRolesProvider (#2390) | - As proposed on the ML, `ActiveRolesProvider` is removed, and `DefaultActiveRolesProvider` is merged into `DefaultAuthenticator`. `ActiveRolesAugmentor` is also merged into `AuthenticatingAugmento... | 18 | +456/-559 |
| 2025-09-19 | `984cb0f` | [#2623](https://github.com/apache/polaris/pull/2623) | virtualenv: wider version range (#2623) | - | 1 | +2/-1 |
| 2025-09-19 | `ae9f1a2` | [#2624](https://github.com/apache/polaris/pull/2624) | main: bump to 1.2.0-incubating-SNAPSHOT (#2624) | - | 7 | +10/-10 |
| 2025-09-19 | `d91dbd0` | [#2389](https://github.com/apache/polaris/pull/2389) | Include principal name in Polaris tokens (#2389) | Summary of changes: - Instead of including the principal id twice in the token, the principal name is now used as the subject claim. While the default authenticator doesn't need the principal name ... | 8 | +105/-95 |
| 2025-09-19 | `f334d1a` | [#2388](https://github.com/apache/polaris/pull/2388) | Remove numeric identifier from PolarisPrincipal (#2388) | - In the `Resolver`. Instead, the `Resolver` now performs a lookup by principal name. - In  `PolarisAdminService`. Instead, the code now compares the principal name against the entity name. Note: t... | 5 | +34/-37 |
| 2025-09-19 | `ce015b6` | [#2589](https://github.com/apache/polaris/pull/2589) | Unify create/loadTable call paths (#2589) | to REST Catalog clients for #2207 this PR unifies calls paths for create/load table operations. This change does not have any differences in authorization. This change is not expecte to have any ma... | 2 | +119/-93 |
| 2025-09-19 | `ce4fad1` | [#2626](https://github.com/apache/polaris/pull/2626) | fix(deps): update dependency com.adobe.testing:s3mock-testcontainers to v4.9.1 (#2626) | - | 1 | +1/-1 |
| 2025-09-19 | `2c77fbf` | [#2600](https://github.com/apache/polaris/pull/2600) | chore(errorprone): Enabling EqualsGetClass, PatternMatchingInstanceof, and UnusedMethod in ErrorProne (#2600) | - | 22 | +47/-237 |
| 2025-09-19 | `4e6f202` | [#2625](https://github.com/apache/polaris/pull/2625) | Add 1.1.0-incubating release content (#2625) | - | 2 | +14/-2 |
| 2025-09-19 | `b75e301` | [#2621](https://github.com/apache/polaris/pull/2621) | Add 1.1.0-incubating release on the website (#2621) | - | 3 | +77/-6 |
| 2025-09-19 | `0c1b201` | [#2622](https://github.com/apache/polaris/pull/2622) | Add Community Meeting 20250918 (#2622) | - | 1 | +8/-4 |
| 2025-09-19 | `fab7c71` | [#2614](https://github.com/apache/polaris/pull/2614) | chore(deps): update dependency virtualenv to >=20.34.0,<20.35.0 (#2614) | - | 1 | +1/-1 |
| 2025-09-19 | `5d3040a` | [#2618](https://github.com/apache/polaris/pull/2618) | fix(deps): update dependency org.assertj:assertj-core to v3.27.5 (#2618) | - | 1 | +1/-1 |
| 2025-09-19 | `4e2facb` | [#2574](https://github.com/apache/polaris/pull/2574) | Introduce alternate in-memory buffering event listener (#2574) | - | 7 | +425/-12 |
| 2025-09-19 | `57b3351` | [#2612](https://github.com/apache/polaris/pull/2612) | Update registry.access.redhat.com/ubi9/openjdk-21-runtime Docker tag to v1.23-6.1758133907 (#2612) | - | 2 | +2/-2 |
| 2025-09-19 | `39d0777` | [#2617](https://github.com/apache/polaris/pull/2617) | chore(deps): update dependency mypy to >=1.18, <=1.18.2 (#2617) | - | 1 | +1/-1 |
| 2025-09-19 | `4618513` | [#2619](https://github.com/apache/polaris/pull/2619) | fix(deps): update dependency org.postgresql:postgresql to v42.7.8 (#2619) | - | 1 | +1/-1 |
| 2025-09-19 | `cd1971a` | [#2537](https://github.com/apache/polaris/pull/2537) | Add Code of Conduct entry to the ASF menu (#2537) | * Update site/hugo.yaml Co-authored-by: Robert Stupp <snazy@snazy.de> --------- Co-authored-by: Robert Stupp <snazy@snazy.de> | 5 | +19/-130 |
| 2025-09-18 | `28273a0` | [#2613](https://github.com/apache/polaris/pull/2613) | fix(deps): update dependency io.opentelemetry:opentelemetry-bom to v1.54.1 (#2613) | - | 1 | +1/-1 |
| 2025-09-18 | `7af79e5` | [#2599](https://github.com/apache/polaris/pull/2599) | docs(README): Updating the READMEs to Reflect the Project Structure (#2599) | - | 4 | +56/-17 |
| 2025-09-18 | `9057fc3` | [#2598](https://github.com/apache/polaris/pull/2598) | chore(docs): add polaris-api-specs section (#2598) | - | 4 | +34/-6 |
| 2025-09-18 | `ab91f27` | [#2605](https://github.com/apache/polaris/pull/2605) | Add doc notes about EclipseLink removal (#2605) | - | 3 | +8/-2 |
| 2025-09-18 | `333eb3b` | [#2609](https://github.com/apache/polaris/pull/2609) | Avoid calling deprecated `TableMetadataParser.read(FileIO, InputFile)` method. (#2609) | - | 1 | +1/-1 |
| 2025-09-18 | `d8602f6` | [#2604](https://github.com/apache/polaris/pull/2604) | CI/Caching: Fix Gradle cache retention (#2604) | Nowadays, that action triggers a "noop build" to explicitly trigger stale cache entry cleanup, but uses somewhat different defaults than [described here](https://docs.gradle.org/current/userguide/d... | 3 | +25/-8 |
| 2025-09-18 | `f9a2165` | [#2536](https://github.com/apache/polaris/pull/2536) | Add content to contributing guidelines. (#2536) | - | 3 | +56/-4 |
| 2025-09-17 | `149c19e` | [#2590](https://github.com/apache/polaris/pull/2590) | Add client build to Gradle (#2590) | * Add overwrite option for python build * Match client build behavior | 2 | +23/-2 |
| 2025-09-17 | `8f1614c` | [#2588](https://github.com/apache/polaris/pull/2588) | Bump: Iceberg client in tests and documentation to 1.10 (#2588) | - | 10 | +14/-14 |
| 2025-09-18 | `b1fc3d2` | [#2601](https://github.com/apache/polaris/pull/2601) | Update dependency com.google.guava:guava to v33.5.0-jre (#2601) | - | 1 | +1/-1 |
| 2025-09-17 | `d03c717` | [#2480](https://github.com/apache/polaris/pull/2480) | Add Events for Iceberg REST APIs (#2480) | - | 30 | +861/-549 |
| 2025-09-17 | `9648582` | [#2585](https://github.com/apache/polaris/pull/2585) | docs(README): Create Polaris-Core README (#2585) | - | 2 | +56/-3 |
| 2025-09-17 | `f3d53f0` | [#2593](https://github.com/apache/polaris/pull/2593) | CI: Fix Gradle cache usages (#2593) | "Which cache" is then restored, is rather non-deterministic, but almost always at least "partial" leading to unnecessary (re)builds. | 4 | +3/-30 |
| 2025-09-17 | `5b3374a` | [#2538](https://github.com/apache/polaris/pull/2538) | Add security report page on the website (#2538) | - | 2 | +47/-0 |
| 2025-09-17 | `f237d94` | [#2583](https://github.com/apache/polaris/pull/2583) | Revert "Update plugin com.gradle.develocity to v4.2 (#2583)" (#2594) | - | 1 | +1/-1 |
| 2025-09-17 | `ca0cd9a` | [#2587](https://github.com/apache/polaris/pull/2587) | docs(changelog): Update the Changelog with 1.0.1, 1.0.0, & 0.9.0 Releases (#2587) | - | 1 | +40/-4 |
| 2025-09-17 | `633f775` | [#2592](https://github.com/apache/polaris/pull/2592) | Build: remove unnecessary openapigenerator plugin usages (#2592) | - | 2 | +0/-2 |
| 2025-09-17 | `8cc0fad` | [#2583](https://github.com/apache/polaris/pull/2583) | Update plugin com.gradle.develocity to v4.2 (#2583) | - | 1 | +1/-1 |
| 2025-09-17 | `d165f51` | [#2582](https://github.com/apache/polaris/pull/2582) | Update plugin com.gradle.common-custom-user-data-gradle-plugin to v2.4.0 (#2582) | - | 1 | +1/-1 |
| 2025-09-17 | `0172efc` | [#2591](https://github.com/apache/polaris/pull/2591) | Fix license check for cryptography (#2591) | - | 1 | +1/-0 |
| 2025-09-16 | `6549551` | [#2580](https://github.com/apache/polaris/pull/2580) | Python client: add license check (#2580) | * Python client: add license check * Python client: add license check * test * Enable license check | 3 | +39/-0 |
| 2025-09-16 | `eb28eda` | [#2586](https://github.com/apache/polaris/pull/2586) | Bump: iceberg 1.10 (#2586) | - | 5 | +8/-4 |
| 2025-09-16 | `97c191a` | [#2571](https://github.com/apache/polaris/pull/2571) | Site: add a blog for apache doris and polaris integration (#2571) | - | 1 | +427/-0 |
| 2025-09-16 | `27ec215` | [#2559](https://github.com/apache/polaris/pull/2559) | Publish build scans to develocity.apache.org for build insights (#2559) | - | 8 | +49/-1 |
| 2025-09-16 | `4885d77` | [#2578](https://github.com/apache/polaris/pull/2578) | Avoid exceptions on ETag matches (#2578) | - | 1 | +10/-11 |
| 2025-09-16 | `6c4e1b8` | [#2577](https://github.com/apache/polaris/pull/2577) | Update registry.access.redhat.com/ubi9/openjdk-21-runtime Docker tag to v1.23-6.1757607786 (#2577) | - | 2 | +2/-2 |
| 2025-09-15 | `e5e518c` | [#2579](https://github.com/apache/polaris/pull/2579) | Site: Remove the dummy post (#2579) | - | 1 | +0/-24 |
| 2025-09-15 | `4cda818` | [#2572](https://github.com/apache/polaris/pull/2572) | Revert "fix password in README.md for ``./gradlew run` (#2572)" (#2576) | - | 1 | +1/-1 |
| 2025-09-15 | `db3277a` | [#2575](https://github.com/apache/polaris/pull/2575) | Site: Add the blog link in the website (#2575) | - | 1 | +5/-1 |
| 2025-09-15 | `08086b3` | [#2572](https://github.com/apache/polaris/pull/2572) | fix password in README.md for ``./gradlew run` (#2572) | - | 1 | +1/-1 |
| 2025-09-15 | `112d80b` | [#2543](https://github.com/apache/polaris/pull/2543) | Avoid using jackson method for parsing YAML from any URL in RootCredentialsSet (#2543) | As discussed https://github.com/FasterXML/jackson-core/issues/803 this method can lead to hidden issues and got deprecated. Instead, we manage URL steams locally in RootCredentialsSet and permit on... | 4 | +40/-17 |
| 2025-09-15 | `e02bb71` | [#2565](https://github.com/apache/polaris/pull/2565) | Remove DROP statements from SQL init scripts (#2565) | It is therefore not possible to put any DROP statements in the scripts. | 2 | +0/-5 |
| 2025-09-15 | `23e5130` | [#2566](https://github.com/apache/polaris/pull/2566) | Make column events.request_id nullable (#2566) | This PR also annotates the `ModelEvent.principalName` and `PolarisEvent.principalName` fields as nullable in code (the corresponding column was already nullable in the database schema). | 6 | +26/-16 |
| 2025-09-15 | `20af2cd` | [#2569](https://github.com/apache/polaris/pull/2569) | Pin virtualenv version to fix python client installation issue (#2569) | Package operations: 1 install, 1 update, 0 removals   - Updating virtualenv (20.32.0 -> 20.34.0)   - Installing pyiceberg (0.10.0): Failed   AttributeError   'PythonInfo' object has no attribute 't... | 2 | +5/-2 |
| 2025-09-15 | `a650937` | [#2564](https://github.com/apache/polaris/pull/2564) | Fix H2 JDBC schema init script (#2564) | - | 1 | +1/-1 |
| 2025-09-15 | `da05019` | [#2567](https://github.com/apache/polaris/pull/2567) | Update dependency io.smallrye.common:smallrye-common-annotation to v2.13.9 (#2567) | - | 1 | +1/-1 |
| 2025-09-15 | `3b303f4` | [#2562](https://github.com/apache/polaris/pull/2562) | Python client: remove tox (#2562) | - | 1 | +0/-1 |
| 2025-09-15 | `97b6fe8` | [#2557](https://github.com/apache/polaris/pull/2557) | Support sdist client distribution (#2557) | . The goal is to include only the files required for an end-user to build the client locally (the repository already supports wheel distribution). For the sdist build, this PR takes a slightly diff... | 18 | +53/-13 |
| 2025-09-15 | `a2f29cb` | [#2561](https://github.com/apache/polaris/pull/2561) | Update dependency software.amazon.awssdk:bom to v2.33.9 (#2561) | - | 1 | +1/-1 |
| 2025-09-15 | `d556ffc` | [#2553](https://github.com/apache/polaris/pull/2553) | Update quay.io/keycloak/keycloak Docker tag to v26.3.4 (#2553) | - | 1 | +1/-1 |
| 2025-09-15 | `4034b28` | [#2545](https://github.com/apache/polaris/pull/2545) | Testing: Let runtime-service tests use Quarkus via `enforcedPlatform()` (#2545) | - | 1 | +1/-1 |
| 2025-09-13 | `b3366e5` | [#2558](https://github.com/apache/polaris/pull/2558) | Minor fix for README.md (#2558) | - | 1 | +1/-1 |
| 2025-09-13 | `de94c57` | [#2549](https://github.com/apache/polaris/pull/2549) | Update dependency pyiceberg to v0.10.0 (#2549) | - | 1 | +1/-1 |
| 2025-09-13 | `9832549` | [#2547](https://github.com/apache/polaris/pull/2547) | Update dependency mypy to >=1.18, <=1.18.1 (#2547) | - | 1 | +1/-1 |
| 2025-09-13 | `d69d7ef` | [#2532](https://github.com/apache/polaris/pull/2532) | Reduce getOrCreateMetaStoreManager callers (#2532) | beans or build it only once in tests that operate in a single realm. | 8 | +20/-42 |
| 2025-09-12 | `be4175c` | [#2533](https://github.com/apache/polaris/pull/2533) | Inject PolarisAdminService into PolarisServiceImpl (#2533) | if we apply the same to `PolarisAdminService` we can simply inject it into `PolarisServiceImpl`. | 5 | +53/-118 |
| 2025-09-11 | `8ad8f74` | [#2492](https://github.com/apache/polaris/pull/2492) | Add subtype-check to PolarisEntity subclass ctors (#2492) | - | 15 | +84/-23 |
| 2025-09-11 | `adaae48` | [#2544](https://github.com/apache/polaris/pull/2544) | Fix deprecation warnings in GcpCredentialsStorageIntegrationTest (#2544) | Refactor the code to use an explicit InputStream Cf. https://github.com/FasterXML/jackson-core/issues/803 | 1 | +11/-15 |
| 2025-09-11 | `81035e0` | [#2461](https://github.com/apache/polaris/pull/2461) | Update Quarkus Platform and Group to v3.26.3 (#2461) | - | 1 | +1/-1 |
| 2025-09-11 | `c2e932b` | [#2531](https://github.com/apache/polaris/pull/2531) | Fix arg-matching in ExceptionMapperTest.testFullExceptionIsLogged() (#2531) | But eventually the test failure's caused by using `getLogger()` for all logging, which may provide the _wrong_ log record and cause the test to fail. This change renames the `getLogger()` functions... | 3 | +76/-29 |
| 2025-09-10 | `9b3d7d2` | [#2534](https://github.com/apache/polaris/pull/2534) | Use same content on website home page and README.md (#2534) | - | 1 | +1/-1 |
| 2025-09-10 | `cef59e6` | [#2542](https://github.com/apache/polaris/pull/2542) | fix deprecated ObjectMapper calls (#2542) | as suggested by javadoc. | 2 | +2/-2 |
| 2025-09-10 | `d2bc708` | [#2529](https://github.com/apache/polaris/pull/2529) | Update dependency com.google.cloud:google-cloud-storage-bom to v2.57.0 (#2529) | - | 1 | +1/-1 |
| 2025-09-09 | `026fabe` | [#2528](https://github.com/apache/polaris/pull/2528) | NoSQL: Move varint implementation into the "right" directory (#2528) | - | 5 | +3/-2 |
| 2025-09-09 | `5cc1ecc` | [#2526](https://github.com/apache/polaris/pull/2526) | Update dependency io.projectreactor.netty:reactor-netty-http to v1.2.10 (#2526) | - | 1 | +1/-1 |
| 2025-09-09 | `1d15128` | [#2421](https://github.com/apache/polaris/pull/2421) | Build: Make META-INF/MANIFEST.MF content reproducible (#2421) | This change changes the jar manifest attributes: * `Apache-Polaris-Is-Release` is now also set to `true`, if `-PjarWithGitInfo` is specified * `Apache-Polaris-Build-Git-Describe` is now also genera... | 5 | +35/-76 |
| 2025-09-09 | `3fa1df3` | [#2466](https://github.com/apache/polaris/pull/2466) | Update hadoop to v3.4.2 (#2466) | - | 1 | +1/-1 |
| 2025-09-09 | `ce90968` | [#2470](https://github.com/apache/polaris/pull/2470) | Update dependency com.fasterxml.jackson:jackson-bom to v2.20.0 (#2470) | - | 1 | +1/-1 |
| 2025-09-09 | `87490a5` | [#2524](https://github.com/apache/polaris/pull/2524) | Update gradle/actions digest to ed40850 (#2524) | - | 5 | +8/-8 |
| 2025-09-08 | `a1d1176` | [#2509](https://github.com/apache/polaris/pull/2509) | Core: Clarify the purpose of REPLACE_NEW_LOCATION_PREFIX_WITH_CATALOG_DEFAULT_KEY (#2509) | - | 1 | +12/-5 |
| 2025-09-08 | `d1a329f` | [#2425](https://github.com/apache/polaris/pull/2425) | Add support for poetry build with wheel (#2425) | - | 3 | +9/-5 |
| 2025-09-08 | `c149316` | [#2507](https://github.com/apache/polaris/pull/2507) | Fix deprecation warnings around RandomStringUtils (#2507) | https://github.com/apache/commons-lang/commit/69cb996265ba603e0be5b1c98097775f2467a6c2 | 1 | +14/-10 |
| 2025-09-08 | `ee7f370` | [#2510](https://github.com/apache/polaris/pull/2510) | Allow `PolarisServerManager` implementations to define custom client headers (#2510) | to define runtime env. for tests under `integration-tests`. This change allows more flexibility for test runtime environments by allowing injecting extra headers into test clients. | 8 | +40/-30 |
| 2025-09-08 | `d11b9e4` | [#2516](https://github.com/apache/polaris/pull/2516) | Allow overriding createCatalog calls in integrations tests (#2516) | - | 3 | +18/-2 |
| 2025-09-08 | `5f17ff7` | [#2497](https://github.com/apache/polaris/pull/2497) | Update dependency org.testcontainers:localstack to v1.21.3 (#2497) | - | 1 | +1/-1 |
| 2025-09-08 | `8ad0d15` | [#2520](https://github.com/apache/polaris/pull/2520) | Update dependency io.netty:netty-codec-http2 to v4.2.6.Final (#2520) | - | 1 | +1/-1 |
| 2025-09-08 | `c6176dc` | [#2519](https://github.com/apache/polaris/pull/2519) | Update dependency io.micrometer:micrometer-bom to v1.15.4 (#2519) | - | 1 | +1/-1 |
| 2025-09-08 | `15d5c7c` | [#2515](https://github.com/apache/polaris/pull/2515) | Update dependency io.opentelemetry:opentelemetry-bom to v1.54.0 (#2515) | - | 1 | +1/-1 |
| 2025-09-08 | `7a2be2f` | [#2514](https://github.com/apache/polaris/pull/2514) | Update dependency com.nimbusds:nimbus-jose-jwt to v10.5 (#2514) | - | 1 | +1/-1 |
| 2025-09-08 | `090f088` | [#2517](https://github.com/apache/polaris/pull/2517) | Update dependency software.amazon.awssdk:bom to v2.33.4 (#2517) | - | 1 | +1/-1 |
| 2025-09-06 | `37a9221` | [#2513](https://github.com/apache/polaris/pull/2513) | Remove PolarisTestMetaStoreManager.jsonNode helper (#2513) | - | 1 | +8/-23 |
| 2025-09-05 | `b8d210a` | [#2479](https://github.com/apache/polaris/pull/2479) | Add Events for Policy Service APIs (#2479) | - | 3 | +255/-22 |
| 2025-09-05 | `b174b9d` | [#2512](https://github.com/apache/polaris/pull/2512) | Remove unused config from SparkSessionBuilder (#2512) | - | 1 | +3/-7 |
| 2025-09-04 | `1361bd4` | [#2511](https://github.com/apache/polaris/pull/2511) | fix for IcebergAllowedLocationTest (#2511) | - | 2 | +3/-1 |
| 2025-09-04 | `453e9fb` | [#2422](https://github.com/apache/polaris/pull/2422) | Disable custom namespace locations (#2422) | Fixes: #2417 | 14 | +216/-17 |
| 2025-09-04 | `d7ec8f2` | [#2481](https://github.com/apache/polaris/pull/2481) | Add Events for Generic Table APIs (#2481) | - | 3 | +126/-8 |
| 2025-09-04 | `923a2e1` | [#2506](https://github.com/apache/polaris/pull/2506) | Remove readInternalProperties helpers (#2506) | - | 2 | +1/-15 |
| 2025-09-04 | `90c981a` | [#2448](https://github.com/apache/polaris/pull/2448) | CLI: Remove SCRIPT_DIR and default config location to user home (#2448) | - | 5 | +4/-8 |
| 2025-09-04 | `cbdc12b` | [#2474](https://github.com/apache/polaris/pull/2474) | Remove commons-codec dependency (#2474) | we can simply use guava instead and eliminate the extra dependency | 6 | +35/-5 |
| 2025-09-04 | `a8431dc` | [#2504](https://github.com/apache/polaris/pull/2504) | Update registry.access.redhat.com/ubi9/openjdk-21-runtime Docker tag to v1.23-6.1756793420 (#2504) | - | 2 | +2/-2 |
| 2025-09-04 | `b53bc98` | [#2503](https://github.com/apache/polaris/pull/2503) | Update dependency com.azure:azure-sdk-bom to v1.2.38 (#2503) | - | 1 | +1/-1 |
| 2025-09-04 | `d11a805` | [#2179](https://github.com/apache/polaris/pull/2179) | Update the Release Guide about the Helm Chart package (#2179) | * Update release-guide.md Co-authored-by: Pierre Laporte <pierre@pingtimeout.fr> * Add missing commit message * Whitespace * Use Helm GPG plugin to sign the Helm chart * Fix directories during Helm... | 1 | +70/-15 |
| 2025-09-04 | `d9ea304` | [#2502](https://github.com/apache/polaris/pull/2502) | Update actions/setup-python action to v6 (#2502) | - | 1 | +1/-1 |
| 2025-09-04 | `82086d9` | [#2495](https://github.com/apache/polaris/pull/2495) | Update dependency io.netty:netty-codec-http2 to v4.2.5.Final (#2495) | - | 1 | +1/-1 |
| 2025-09-04 | `ace32af` | [#2500](https://github.com/apache/polaris/pull/2500) | Update docker.io/jaegertracing/all-in-one Docker tag to v1.73.0 (#2500) | - | 1 | +1/-1 |
| 2025-09-03 | `40283b2` | [#2496](https://github.com/apache/polaris/pull/2496) | Service: Add location tests for views (#2496) | - | 1 | +171/-0 |
| 2025-09-03 | `32b2c27` | [#2486](https://github.com/apache/polaris/pull/2486) | Core: Prevent AIOOBE for negative policy codes in PredefinedPolicyType (#2486) | - | 2 | +14/-1 |
| 2025-09-03 | `84c9473` | [#2499](https://github.com/apache/polaris/pull/2499) | Update actions/stale digest to 3a9db7e (#2499) | - | 1 | +1/-1 |
| 2025-09-03 | `62ca26c` | [#2498](https://github.com/apache/polaris/pull/2498) | Fix failing CI (#2498) | - | 2 | +4/-3 |
| 2025-09-03 | `20753ed` | [#1965](https://github.com/apache/polaris/pull/1965) | AWS CloudWatch Event Sink Implementation (#1965) | - | 9 | +781/-40 |
| 2025-09-03 | `c3f5001` | [#1844](https://github.com/apache/polaris/pull/1844) | Add Polaris Events to Persistence (#1844) | - | 59 | +2000/-83 |
| 2025-09-03 | `f6bcbd2` | [#2465](https://github.com/apache/polaris/pull/2465) | perf(refactor): optimizing JdbcBasePersistenceImpl.listEntities (#2465) | - Eliminated Object Creation Overhead: Direct conversion to EntityNameLookupRecord without intermediate PolarisBaseEntity | 7 | +151/-42 |
| 2025-09-03 | `c783de9` | [#2131](https://github.com/apache/polaris/pull/2131) | feat(idgen): Start Implementation of NoSQL with the ID Generation Framework (#2131) | Related to #650 & #844 Co-authored-by: Robert Stupp <snazy@snazy.de> Co-authored-by: Dmitri Bourlatchkov <dmitri.bourlatchkov@gmail.com> | 27 | +3165/-0 |
| 2025-09-02 | `6137e42` | [#2490](https://github.com/apache/polaris/pull/2490) | Core: Prevent AIOOBE for negative codes in PolarisEntityType, PolarisPrivilege, ReturnStatus (#2490) | - | 6 | +237/-3 |
| 2025-09-02 | `f41d5bf` | [#2489](https://github.com/apache/polaris/pull/2489) | Fix CI (#2489) | * Use local diagnostics in TransactionWorkspaceMetaStoreManager * Add resetCredentials to PolarisPrincipalsEventServiceDelegator | 2 | +12/-3 |
| 2025-09-02 | `ac31963` | [#2302](https://github.com/apache/polaris/pull/2302) | Add type-check to PolarisEntity subclass ctors (#2302) | specific type via their constructors. this can lead to subtle bugs like we fixed in a29f8006fe9d259df755d02ec6386c2bd6932610 by adding type checks we discover a few more places where we need to be ... | 13 | +57/-20 |
| 2025-09-02 | `327697c` | [#2197](https://github.com/apache/polaris/pull/2197) | Feature: Expose resetCredentials via a new reset api to allow root user to reset credentials for an existing principal with custom values  (#2197) | - | 17 | +479/-5 |
| 2025-09-02 | `6b4f8e1` | [#2415](https://github.com/apache/polaris/pull/2415) | Remove PolarisCallContext.getDiagServices (#2415) | * Remove diagnostics from PolarisCallContext | 55 | +279/-217 |
| 2025-09-01 | `d841431` | [#2483](https://github.com/apache/polaris/pull/2483) | Update dependency software.amazon.awssdk:bom to v2.33.0 (#2483) | - | 1 | +1/-1 |
| 2025-08-31 | `9ca8f92` | [#2477](https://github.com/apache/polaris/pull/2477) | Add Community Sync Meeting 20250828 (#2477) | - | 1 | +4/-3 |
| 2025-08-30 | `4ed1d41` | [#2473](https://github.com/apache/polaris/pull/2473) | Service: Always validate allowed locations from Storage Config (#2473) | - | 9 | +367/-197 |
| 2025-08-30 | `17a359b` | [#2462](https://github.com/apache/polaris/pull/2462) | Service: Remove hadoop-common from polaris-runtime-service (#2462) | - | 4 | +9/-24 |
| 2025-08-29 | `14d4496` | [#2476](https://github.com/apache/polaris/pull/2476) | fix(deps): update dependency com.gradleup.shadow:shadow-gradle-plugin to v9.1.0 (#2476) | - | 1 | +1/-1 |
| 2025-08-29 | `b1b5591` | [#2475](https://github.com/apache/polaris/pull/2475) | fix(deps): update dependency com.adobe.testing:s3mock-testcontainers to v4.8.0 (#2475) | - | 1 | +1/-1 |
| 2025-08-29 | `680f974` | [#2468](https://github.com/apache/polaris/pull/2468) | Update versions in runtime LICENSE and NOTICE (#2468) | - | 2 | +271/-312 |
| 2025-08-28 | `3bc92b4` | [#2469](https://github.com/apache/polaris/pull/2469) | Service: Move tests to the right package (#2469) | - | 14 | +23/-23 |
| 2025-08-28 | `f8ad77a` | [#2463](https://github.com/apache/polaris/pull/2463) | Prefer java.util.Base64 over commons-codec (#2463) | in a few other spots. in a follow-up we might be able to get rid of our `commons-codec` dependency completely. | 6 | +52/-57 |
| 2025-08-28 | `b33c321` | [#2434](https://github.com/apache/polaris/pull/2434) | Add Delegator to all API Implementations (#2434) | - | 7 | +961/-0 |
| 2025-08-28 | `de79f18` | [#2458](https://github.com/apache/polaris/pull/2458) | fix(deps): update dependency io.opentelemetry.semconv:opentelemetry-semconv to v1.37.0 (#2458) | - | 1 | +1/-1 |
| 2025-08-28 | `9e6d929` | [#2341](https://github.com/apache/polaris/pull/2341) | add refresh credentials property to loadTableResult (#2341) | * IcebergCatalogAdapterTest: Added test to ensure refresh credentials endpoint is included * delegate refresh credential endpoint configuration to storage integration * GCP: Add refresh credential ... | 29 | +341/-93 |
| 2025-08-28 | `95ebdd3` | [#2456](https://github.com/apache/polaris/pull/2456) | Remove commons-lang3 dependency (#2456) | also stop using `org.assertj.core.util` as its a non-public api. | 14 | +24/-29 |
| 2025-08-27 | `00ca832` | [#2432](https://github.com/apache/polaris/pull/2432) | Built: improve reproducible archive files (#2432) | Some Gradle projects produce archive files, but don't get the necessary Gradle archive-tasks settings applied: one not-published project but also the tarball&zip of the distribution. This change mo... | 5 | +87/-5 |
| 2025-08-27 | `b6e247d` | [#2431](https://github.com/apache/polaris/pull/2431) | Build: Make jandex dependency used for index generation managed (#2431) | This is a preparation step contributing to #2204, once a jandex fix for reproducible builds is available. Co-authored-by: Alexandre Dutra <adutra@apache.org> | 25 | +41/-30 |
| 2025-08-27 | `e3dc36a` | [#2428](https://github.com/apache/polaris/pull/2428) | fix(deps): update dependency gradle.plugin.org.jetbrains.gradle.plugin.idea-ext:gradle-idea-ext to v1.3 (#2428) | - | 1 | +1/-1 |
| 2025-08-27 | `e25c5b1` | [#2447](https://github.com/apache/polaris/pull/2447) | fix(deps): update dependency com.google.cloud:google-cloud-storage-bom to v2.56.0 (#2447) | - | 1 | +1/-1 |
| 2025-08-27 | `6631c51` | [#2454](https://github.com/apache/polaris/pull/2454) | fix(deps): update dependency io.opentelemetry.semconv:opentelemetry-semconv to v1.36.0 (#2454) | - | 1 | +1/-1 |
| 2025-08-27 | `3f1dfb3` | [#2445](https://github.com/apache/polaris/pull/2445) | Add user principal tag in metrics (#2445) | * Added test * Added production readiness check | 8 | +145/-2 |
| 2025-08-26 | `f0ee460` | [#2439](https://github.com/apache/polaris/pull/2439) | Client: fix openapi verbose output, remove doc generate, and skip test generations (#2439) | * Use logger instead of print * Add back exclude on __pycache__ as CI is not via Makefile * Add back exclude on __pycache__ as CI is not via Makefile | 4 | +53/-22 |
| 2025-08-26 | `76a5073` | [#2404](https://github.com/apache/polaris/pull/2404) | Deprecate ActiveRolesProvider for removal (#2404) | - | 7 | +8/-3 |
| 2025-08-26 | `92ead05` | [#2442](https://github.com/apache/polaris/pull/2442) | Add feature flag to disallow custom S3 endpoints (#2442) | * Enforce in `PolarisServiceImpl.validateStorageConfig()` Fixes #2436 | 4 | +87/-0 |
| 2025-08-26 | `ad450d4` | [#2381](https://github.com/apache/polaris/pull/2381) | Add PolarisDiagnostics field to BaseMetaStoreManager (#2381) | the ultimate goal is removing the `PolarisCallContext` parameter from every `PolarisMetaStoreManager` interface method, so we make steps towards reducing its usage first. | 8 | +203/-201 |
| 2025-08-26 | `eceaadd` | [#2370](https://github.com/apache/polaris/pull/2370) | Optimize PolicyCatalog.listPolicies (#2370) | the optimization is to use `listEntities` instead of `loadEntities` when there is `policyType` filter to apply | 3 | +35/-11 |
| 2025-08-25 | `d326962` | [#2443](https://github.com/apache/polaris/pull/2443) | fix(deps): update dependency software.amazon.awssdk:bom to v2.32.29 (#2443) | - | 1 | +1/-1 |
| 2025-08-24 | `fb61a11` | [#2424](https://github.com/apache/polaris/pull/2424) | Doc fix: Access control page update (#2424) | * 2418 | 1 | +14/-16 |
| 2025-08-23 | `05db610` | [#2435](https://github.com/apache/polaris/pull/2435) | Fix NPE in CreateCatalog (#2435) | - | 3 | +51/-1 |
| 2025-08-22 | `a29f800` | [#2304](https://github.com/apache/polaris/pull/2304) | Fix TableIdentifier in TaskFileIOSupplier (#2304) | `getTableIdentifier()` method will not return a correct value by using the name of the task and its parent namespace (which is empty?). task handlers instead need to pass in the `TableIdentifier` t... | 6 | +22/-21 |
| 2025-08-22 | `4b18a8d` | [#2427](https://github.com/apache/polaris/pull/2427) | 2334 (#2427) | - | 1 | +2/-2 |
| 2025-08-22 | `bc5d0c4` | [#2416](https://github.com/apache/polaris/pull/2416) | chore(deps): update registry.access.redhat.com/ubi9/openjdk-21-runtime docker tag to v1.23-6.1755674729 (#2416) | - | 2 | +2/-2 |
| 2025-08-21 | `f7487f6` | [#2420](https://github.com/apache/polaris/pull/2420) | Fix merge conflict in CatalogFederationIntegrationTest (#2420) | - | 1 | +3/-3 |
| 2025-08-21 | `c2209cf` | [#2344](https://github.com/apache/polaris/pull/2344) | Integration tests for Catalog Federation (#2344) | - | 2 | +279/-0 |
| 2025-08-21 | `82cd416` | [#2279](https://github.com/apache/polaris/pull/2279) | fix(deps): update quarkus platform and group to v3.25.4 (#2279) | - | 1 | +1/-1 |
| 2025-08-21 | `2047dc2` | [#2406](https://github.com/apache/polaris/pull/2406) | Update changelog prior to 1.1.0 release (#2406) | - | 1 | +28/-2 |
| 2025-08-21 | `7b68202` | [#2413](https://github.com/apache/polaris/pull/2413) | chore(test): Restore PolarisAccessManager (#2413) | of `IcebergTokenAccessManager`) which was added as an extension point for running Polaris tests in downstream build environments under #789, but was mistakenly removed in #2343 | 4 | +76/-2 |
| 2025-08-21 | `d30232e` | [#2414](https://github.com/apache/polaris/pull/2414) | chore(deps): update actions/setup-java action to v5 (#2414) | - | 6 | +9/-9 |
| 2025-08-21 | `a8161a7` | [#2395](https://github.com/apache/polaris/pull/2395) | This change fixes: (#2395) | * publish Docker images only when the vote passed (we are not suppose to publish any public artifacts before the vote is completed) * update the vote email accordingly * remove blog post link in th... | 1 | +20/-16 |
| 2025-08-21 | `7a5c6d8` | [#2403](https://github.com/apache/polaris/pull/2403) | Add 1.0.1-incubating release blog post (#2403) | - | 1 | +41/-0 |
| 2025-08-20 | `d417fda` | [#2412](https://github.com/apache/polaris/pull/2412) | chore: fix Page javadoc (#2412) | - | 1 | +3/-2 |
| 2025-08-20 | `b49cbc5` | [#2290](https://github.com/apache/polaris/pull/2290) | Add PolarisMetaStoreManager.loadEntities (#2290) | currently `PolarisMetaStoreManager.listEntities` only exposes a limited subset of the underlying `BasePersistence.listEntities` functionality. most of the callers have to post-process the `EntityNa... | 16 | +223/-167 |
| 2025-08-20 | `a0a2b87` | [#2401](https://github.com/apache/polaris/pull/2401) | feat: enforce LIST_PAGINATION_ENABLED (#2401) | The enforcement of the LIST_PAGINATION_ENABLED flag was missed in #1938. This change make the flag effective as discussed in #2296. Note: this causes a change in the default Polaris behaviour (no p... | 8 | +97/-17 |
| 2025-08-20 | `c97b150` | [#2369](https://github.com/apache/polaris/pull/2369) | Add feature config to allow dropping views without purging (#2369) | With tables, the client can decide whether to purge the table on drop or not. However, Polaris Servers used to unconditionally perform the purge on dropping a view. After #1619 that behaviour effec... | 4 | +44/-1 |
| 2025-08-20 | `a75229c` | [#2411](https://github.com/apache/polaris/pull/2411) | Add missing region to MinIO getting-started example (#2411) | ``` spark-sql ()> create table ns.t1 as select 'abc'; 25/08/20 16:25:06 ERROR Executor: Exception in task 0.0 in stage 0.0 (TID 0) software.amazon.awssdk.core.exception.SdkClientException: Unable t... | 1 | +5/-1 |
| 2025-08-20 | `9c455ed` | [#2192](https://github.com/apache/polaris/pull/2192) | Python client auto generate (#2192) | * Python client auto generate * Python client auto generate * Python client auto generate * Python client auto generate * Python client auto generate * Remove auto generated doc * undo * Fix doc * ... | 14 | +289/-253 |
| 2025-08-20 | `c937a30` | [#2394](https://github.com/apache/polaris/pull/2394) | chore: Suppress javac deprecation warnings in SparkCatalog (#2394) | methods from Spark's TableCatalog. This PR adds suppression annotations to allow for clean compilation given that the deprecated method calls and overrides are clearly expected in this case. | 1 | +2/-0 |
| 2025-08-20 | `c3aa720` | [#2408](https://github.com/apache/polaris/pull/2408) | Mention Helm chart support for PodDisruptionBudget in CHANGELOG.md (#2408) | - | 1 | +3/-0 |
| 2025-08-20 | `b7fc318` | [#2407](https://github.com/apache/polaris/pull/2407) | chore(deps): update quay.io/keycloak/keycloak docker tag to v26.3.3 (#2407) | - | 1 | +1/-1 |
| 2025-08-20 | `c5fd368` | [#2380](https://github.com/apache/polaris/pull/2380) | feat: Add Pod Disruption Budget support to Helm chart (#2380) | - | 4 | +275/-0 |
| 2025-08-20 | `fcd4777` | [#2372](https://github.com/apache/polaris/pull/2372) | Add PolarisDiagnostics field to AbstractTransactionalPersistence (#2372) | - | 11 | +61/-48 |
| 2025-08-20 | `a0f454e` | [#2400](https://github.com/apache/polaris/pull/2400) | Add 1.0.1 release to the website (#2400) | - | 2 | +20/-2 |
| 2025-08-20 | `4ae3959` | [#2402](https://github.com/apache/polaris/pull/2402) | chore(deps): update azure/setup-helm action to v4.3.1 (#2402) | - | 1 | +1/-1 |
| 2025-08-19 | `8d4cacb` | [#2397](https://github.com/apache/polaris/pull/2397) | fix: minor corrections of documentation (#2397) | - removed single quotes from credential parameter in the cmdline example for connecting a local spark-sql: env variables need to be resolved in cmdline, they will not be resolved by spark-sql itself. | 2 | +2/-2 |
| 2025-08-19 | `a07ea01` | [#2374](https://github.com/apache/polaris/pull/2374) | Remove BaseMetaStoreManager.serializeProperties (#2374) | the existing helper methods on the entity instead | 3 | +10/-77 |
| 2025-08-19 | `12ab618` | [#2384](https://github.com/apache/polaris/pull/2384) | Minor refactor of integration test classes (#2384) | This change is a preparatory work for #2280 (S3 remote signing). | 7 | +265/-141 |
| 2025-08-19 | `1fe6205` | [#2386](https://github.com/apache/polaris/pull/2386) | Nit: add methods isExternal and isStaticFacade to CatalogEntity (#2386) | - | 2 | +20/-18 |
| 2025-08-19 | `42245cb` | [#2385](https://github.com/apache/polaris/pull/2385) | Nit: remove transitive dependencies from runtime/server/build.gradle.kts (#2385) | - | 1 | +0/-3 |
| 2025-08-19 | `76c5d54` | [#2387](https://github.com/apache/polaris/pull/2387) | Nit: extract getResolvedCatalogEntity method in IcebergCatalogHandler (#2387) | - | 1 | +22/-83 |
| 2025-08-19 | `850792c` | [#2375](https://github.com/apache/polaris/pull/2375) | chore(deps): bump s3mock from 3.11.0 to 4.7.0 (#2375) | Changes     Upgraded S3Mock testcontainer to 4.7.0     Created S3Mock wrapper class for consistent configuration     Consolidated S3 config properties generation     Updated integration tests to us... | 6 | +91/-72 |
| 2025-08-19 | `42225b3` | [#2377](https://github.com/apache/polaris/pull/2377) | fix(deps): update dependency io.prometheus:prometheus-metrics-exporter-servlet-jakarta to v1.4.1 (#2377) | - | 1 | +1/-1 |
| 2025-08-19 | `358c790` | [#2339](https://github.com/apache/polaris/pull/2339) | Python client: make S3 role-ARN optional and add missing endpoint-internal property (#2339) | - | 4 | +17/-12 |
| 2025-08-19 | `e1b9833` | [#2337](https://github.com/apache/polaris/pull/2337) | Reduce getRealmConfig calls (#2337) | The idea is that long term we would want to stop relying on the `CallContext` itself but instead inject its individual items. Thus we also add `RealmConfig` to `TestServices`. | 14 | +78/-104 |
| 2025-08-19 | `a186141` | [#2382](https://github.com/apache/polaris/pull/2382) | Update community meeting dates (#2382) | - | 1 | +1/-4 |
| 2025-08-18 | `83d09cc` | [#2379](https://github.com/apache/polaris/pull/2379) | Modularize generic table federation (#2379) | - | 16 | +187/-30 |
| 2025-08-18 | `f647034` | [#2376](https://github.com/apache/polaris/pull/2376) | Rat-ignore user-settings for hugo-run-in-docker (#2376) | - | 1 | +1/-0 |
| 2025-08-18 | `dc23a1c` | [#2359](https://github.com/apache/polaris/pull/2359) | Add PolarisDiagnostics field to TransactionWorkspaceMetaStoreManager (#2359) | `PolarisMetaStoreManager` interface method, so we make steps towards reducing its usage first. | 3 | +45/-85 |
| 2025-08-18 | `7f50667` | [#2355](https://github.com/apache/polaris/pull/2355) | Support HMS Federation (#2355) | All hive dependencies are added in an independent module, i.e., `polaris-extensions-federation-hive` and can be removed/converted to a compile time flag if necessary.  Similar to HadoopCatalog, HMS... | 10 | +301/-0 |
| 2025-08-18 | `22e0c1c` | [#2361](https://github.com/apache/polaris/pull/2361) | Add PolarisDiagnostics field to TransactionalMetaStoreManagerImpl (#2361) | PolarisMetaStoreManager interface method, so we make steps towards reducing its usage first. | 6 | +114/-159 |
| 2025-08-18 | `96f1459` | [#2307](https://github.com/apache/polaris/pull/2307) | Refactor Authenticator and PolarisPrincipal (#2307) | - `AuthenticatedPolarisPrincipal` becomes an interface `PolarisPrincipal`, as the original class leaks implementation details (references to `PrincipalEntity` and thus to the storage layer). The ne... | 62 | +460/-426 |
| 2025-08-18 | `5a7686b` | [#2363](https://github.com/apache/polaris/pull/2363) | Rat-check: exclude venv, cleanup excludes, include .svg (#2363) | * Re-grouped the exclusion rat patterns * Added exclude for `.venv` * Added exclude for `.ruff_cache` | 9 | +187/-36 |
| 2025-08-18 | `73a06f5` | [#2371](https://github.com/apache/polaris/pull/2371) | fix(deps): update dependency software.amazon.awssdk:bom to v2.32.24 (#2371) | - | 1 | +1/-1 |
| 2025-08-15 | `e45be14` | [#2190](https://github.com/apache/polaris/pull/2190) | SigV4 Auth Support for Catalog Federation - Part 2: Connection Config Persistence (#2190) | * Rename UserSecretReference to SecretReference and fix some small issues | 20 | +649/-77 |
| 2025-08-15 | `7af85be` | [#2347](https://github.com/apache/polaris/pull/2347) | Use asMap property helpers (#2347) | getting used consistently | 7 | +35/-91 |
| 2025-08-15 | `f7745c2` | [#2366](https://github.com/apache/polaris/pull/2366) | IntelliJ: fix project icon in IJ project list (#2366) | - | 1 | +1/-1 |
| 2025-08-15 | `596239c` | [#2227](https://github.com/apache/polaris/pull/2227) | feat(docs): Add Getting Stated guide for MinIO (#2227) | A simple page of step-by-step instructions for setting up a local environment with Polaris, MinIO and Spark. Closes #1530 | 5 | +367/-18 |
| 2025-08-15 | `260438f` | [#2364](https://github.com/apache/polaris/pull/2364) | Fix soft-merge conflict on `main` (#2364) | - | 1 | +1/-1 |
| 2025-08-15 | `c9efc6c` | [#2360](https://github.com/apache/polaris/pull/2360) | fix(deps): update mockito monorepo to v5.19.0 (#2360) | - | 1 | +2/-2 |
| 2025-08-15 | `88f58fc` | [#2340](https://github.com/apache/polaris/pull/2340) | Make PolarisAuthorizer RequestScoped (#2340) | parameter. in its only implementation only `CallContext.getRealmConfig` is getting used. so since `PolarisAuthorizer` cant be used outside a request, we can simply make it request-scoped and inject... | 12 | +21/-45 |
| 2025-08-15 | `6e036e0` | [#2291](https://github.com/apache/polaris/pull/2291) | Fix REST responses for failed Admin operations (#2291) | the `boolean` return values of many methods in `PolarisAdminService` were often simply not getting used at all, thus the REST api returned success in those cases even though the `PrivilegeResult` w... | 9 | +479/-523 |
| 2025-08-15 | `c4fc848` | [#2343](https://github.com/apache/polaris/pull/2343) | Add integration tests with Keycloak (#2343) | - | 31 | +743/-200 |
| 2025-08-15 | `e041a01` | [#2354](https://github.com/apache/polaris/pull/2354) | chore(deps): update postgres docker tag to v17.6 (#2354) | - | 2 | +2/-2 |
| 2025-08-15 | `3963fd8` | [#2358](https://github.com/apache/polaris/pull/2358) | fix(deps): update dependency com.gradleup.shadow:shadow-gradle-plugin to v9.0.2 (#2358) | - | 1 | +1/-1 |
| 2025-08-15 | `61fb1fe` | [#2353](https://github.com/apache/polaris/pull/2353) | chore(deps): update registry.access.redhat.com/ubi9/openjdk-21-runtime docker tag to v1.23-6 (#2353) | - | 2 | +2/-2 |
| 2025-08-15 | `c165249` | [#2336](https://github.com/apache/polaris/pull/2336) | Replace CallContext with RealmConfig in CatalogEntity (#2336) | - | 11 | +61/-68 |
| 2025-08-15 | `fac650a` | [#2348](https://github.com/apache/polaris/pull/2348) | Replace CallContext with RealmConfig in enforceFeatureEnabledOrThrow (#2348) | - | 5 | +6/-7 |
| 2025-08-14 | `b2b1453` | [#2332](https://github.com/apache/polaris/pull/2332) | Modularize federation (Option 2) (#2332) | * Move polaris-extensions-federation-hadoop dependency * Change identifier to lowerCase * Change identifiers to constants | 11 | +303/-52 |
| 2025-08-14 | `22e4c68` | [#2286](https://github.com/apache/polaris/pull/2286) | Add a regression test for Catalog Federation (#2286) | * Install jq dependency * Fix token issues * Update regtests/README.md Co-authored-by: Eric Maynard <emaynard@apache.org> * Update README.md --------- Co-authored-by: Eric Maynard <emaynard@apache.... | 5 | +269/-2 |
| 2025-08-14 | `efc68e8` | [#2346](https://github.com/apache/polaris/pull/2346) | Use PolarisTaskConstants (#2346) | - | 3 | +7/-4 |
| 2025-08-14 | `a8ca16b` | [#2350](https://github.com/apache/polaris/pull/2350) | fix(deps): update dependency com.nimbusds:nimbus-jose-jwt to v10.4.2 (#2350) | - | 1 | +1/-1 |
| 2025-08-14 | `b1f7eed` | [#2349](https://github.com/apache/polaris/pull/2349) | Fix Keycloak getting-started example (#2349) | - | 1 | +10/-7 |
| 2025-08-14 | `4c23eb7` | [#2342](https://github.com/apache/polaris/pull/2342) | fix(deps): update dependency io.netty:netty-codec-http2 to v4.2.4.final (#2342) | - | 1 | +1/-1 |
| 2025-08-14 | `74d1b4e` | [#2316](https://github.com/apache/polaris/pull/2316) | fix(docs): fix entity doc API links. (#2316) | - | 1 | +8/-12 |
| 2025-08-14 | `78d5723` | [#2335](https://github.com/apache/polaris/pull/2335) | fix(docs): fix some broken url. (#2335) | - | 1 | +2/-2 |
| 2025-08-13 | `ad959fb` | [#2315](https://github.com/apache/polaris/pull/2315) | Add PyIceberg example (#2315) | This PR clears that up by providing an example in the getting-started section of the documentation. | 1 | +45/-0 |
| 2025-08-13 | `ee04df4` | [#2317](https://github.com/apache/polaris/pull/2317) | Add entitySubType param to BasePersistence.listEntities (#2317) | ``` Page<EntityNameLookupRecord> listEntities(..., PageToken); Page<EntityNameLookupRecord> listEntities(..., Predicate<PolarisBaseEntity>, PageToken) <T> Page<T> listEntities(..., Predicate<Polari... | 9 | +73/-167 |
| 2025-08-13 | `cdb58e5` | [#2338](https://github.com/apache/polaris/pull/2338) | Remove CallContext from IcebergPropertiesValidation (#2338) | same applies to helpers in `PolarisEndpoints`. | 4 | +21/-21 |
| 2025-08-13 | `027d80b` | [#2149](https://github.com/apache/polaris/pull/2149) | Remove redundant locations when constructing access policies (#2149) | 1. The table's base location 2. The table's `write.data.path`, if set 3. The table's `write.metadata.path`, if set This was intended to capture scenarios where e.g. (2) is not a child path of (1), ... | 5 | +117/-83 |
| 2025-08-13 | `1277eff` | [#2320](https://github.com/apache/polaris/pull/2320) | Remove spotbugs-annotations (#2320) | on the annotations is not necessary. also fix name of common-codec lib. | 4 | +3/-8 |
| 2025-08-13 | `d7d8990` | [#2329](https://github.com/apache/polaris/pull/2329) | Make S3 `roleARN` optional (#2329) | - | 15 | +122/-140 |
| 2025-08-13 | `cc03796` | [#2327](https://github.com/apache/polaris/pull/2327) | Let CI archive html test reports (#2327) | able to download the html report compared to the XML reports (as the latter requires to you find the right file/failure manually). | 1 | +3/-0 |
| 2025-08-13 | `a0f3f0d` | [#2330](https://github.com/apache/polaris/pull/2330) | JWTBroker: move error message (#2330) | On the token generation path, this should be a no-op; however, on the authentication path, this log message was excessive, especially when using mixed authentication since a failure to decode a tok... | 1 | +3/-2 |
| 2025-08-13 | `6647374` | [#2333](https://github.com/apache/polaris/pull/2333) | fix(deps): update immutables to v2.11.3 (#2333) | - | 1 | +1/-1 |
| 2025-08-13 | `6ed5e9d` | [#2331](https://github.com/apache/polaris/pull/2331) | chore(deps): update quay.io/keycloak/keycloak docker tag to v26.3.2 (#2331) | - | 1 | +1/-1 |
| 2025-08-12 | `8996132` | [#2244](https://github.com/apache/polaris/pull/2244) | Add getting-started example with external authentication (#2244) | - | 7 | +2286/-9 |
| 2025-08-12 | `d7f15a2` | [#2326](https://github.com/apache/polaris/pull/2326) | fix(deps): update dependency io.projectreactor.netty:reactor-netty-http to v1.2.9 (#2326) | - | 1 | +1/-1 |
| 2025-08-12 | `45e8e02` | [#2321](https://github.com/apache/polaris/pull/2321) | fix(deps): update dependency io.micrometer:micrometer-bom to v1.15.3 (#2321) | - | 1 | +1/-1 |
| 2025-08-11 | `067bb9d` | [#2188](https://github.com/apache/polaris/pull/2188) | client/python: loosen boto3 dep (#2188) | - | 1 | +1/-1 |
| 2025-08-11 | `2f985ab` | [#2292](https://github.com/apache/polaris/pull/2292) | CatalogEntity: internal endpoint not considered (#2292) | - | 2 | +10/-0 |
| 2025-08-11 | `ad33b48` | [#2319](https://github.com/apache/polaris/pull/2319) | chore(deps): update actions/checkout action to v5 (#2319) | - | 7 | +11/-11 |
| 2025-08-11 | `8a5b80a` | [#2283](https://github.com/apache/polaris/pull/2283) | Separate Cloud Integration Tests (#2283) | but require cloud credentials to execute properly. This creates unnecessary overhead for developers who just want to run local builds or for CI jobs that don't have cloud access configured. | 16 | +116/-112 |
| 2025-08-11 | `cdfc2d1` | [#2310](https://github.com/apache/polaris/pull/2310) | fix(deps): update dependency com.gradleup.shadow:shadow-gradle-plugin to v9.0.1 (#2310) | - | 1 | +1/-1 |
| 2025-08-11 | `24aa8b3` | [#2314](https://github.com/apache/polaris/pull/2314) | fix(deps): update dependency software.amazon.awssdk:bom to v2.32.19 (#2314) | - | 1 | +1/-1 |
| 2025-08-11 | `eb27309` | [#2311](https://github.com/apache/polaris/pull/2311) | chore(deps): update dependency pre-commit to v4.3.0 (#2311) | - | 1 | +1/-1 |
| 2025-08-11 | `01c6471` | [#2312](https://github.com/apache/polaris/pull/2312) | fix(deps): update dependency com.github.spotbugs:spotbugs-annotations to v4.9.4 (#2312) | - | 1 | +1/-1 |
| 2025-08-09 | `f6a2abb` | [#2313](https://github.com/apache/polaris/pull/2313) | Perform force repair when polaris not found (#2313) | - | 1 | +7/-0 |
| 2025-08-08 | `360d292` | [#2309](https://github.com/apache/polaris/pull/2309) | fix(deps): update dependency io.opentelemetry:opentelemetry-bom to v1.53.0 (#2309) | - | 1 | +1/-1 |
| 2025-08-08 | `96d2b30` | [#2308](https://github.com/apache/polaris/pull/2308) | fix(deps): update dependency boto3 to v1.40.6 (#2308) | - | 1 | +1/-1 |
| 2025-08-08 | `1b93169` | [#2282](https://github.com/apache/polaris/pull/2282) | Fix Hadoop federation to initialize the configuration prior to catalog initialization (#2282) | The iceberg library expects the hadoop configuration to be initialized before creating a HadoopCatalog object. This change ensures that Polaris is compatible with the underlying iceberg library. Ad... | 1 | +18/-2 |
| 2025-08-08 | `cfff798` | [#2303](https://github.com/apache/polaris/pull/2303) | fix(docs): update BasePolarisAuthenticator to DefaultAuthenticator (#2303) | - | 1 | +1/-1 |
| 2025-08-08 | `d124612` | [#2305](https://github.com/apache/polaris/pull/2305) | Fix python CI client-integration-test (#2305) | 6764a886857da464e3de11013165cd82aa5fedcb but then eda70740a4e327889f1ac38295d23c8947d87703 added more `CONTAINER_TOOL` usage | 1 | +4/-4 |
| 2025-08-08 | `83be3b1` | [#2298](https://github.com/apache/polaris/pull/2298) | fix(deps): update dependency org.assertj:assertj-core to v3.27.4 (#2298) | - | 1 | +1/-1 |
| 2025-08-08 | `5abd342` | [#2300](https://github.com/apache/polaris/pull/2300) | fix(deps): update dependency boto3 to v1.40.5 (#2300) | - | 1 | +1/-1 |
| 2025-08-07 | `eda7074` | [#2140](https://github.com/apache/polaris/pull/2140) | Move python client Makefile into the root level one (#2140) | * Update workflow * add client-lint to pre-commit * Update README.md to include client | 5 | +91/-121 |
| 2025-08-07 | `5983c81` | [#2297](https://github.com/apache/polaris/pull/2297) | Helm Chart: remove duplicate line in authenticationOptions template (#2297) | - | 1 | +0/-1 |
| 2025-08-07 | `d753e3d` | [#2288](https://github.com/apache/polaris/pull/2288) | fix: typo in server template files. (#2288) | - | 2 | +2/-2 |
| 2025-08-07 | `d3d822c` | [#2281](https://github.com/apache/polaris/pull/2281) | fix(deps): update dependency com.google.cloud:google-cloud-storage-bom to v2.55.0 (#2281) | - | 1 | +1/-1 |
| 2025-08-07 | `c2b5de1` | [#2261](https://github.com/apache/polaris/pull/2261) | Add PolarisAdminService.loadEntities helper (#2261) | sub-optimal `PolarisMetaStoreManager` APIs. This results in multiple fixes like #1949 and #2258 While eventually the underlying APIs should be improved, for now we can make a single central workaro... | 3 | +71/-98 |
| 2025-08-07 | `ef177b5` | [#2250](https://github.com/apache/polaris/pull/2250) | Remove PolarisCallContext.getClock (#2250) | realm or call specific context class. | 31 | +129/-165 |
| 2025-08-07 | `9d16b01` | [#2284](https://github.com/apache/polaris/pull/2284) | fix(deps): update dependency boto3 to v1.40.4 (#2284) | - | 1 | +1/-1 |
| 2025-08-07 | `d6611de` | [#2285](https://github.com/apache/polaris/pull/2285) | chore(deps): update docker.io/jaegertracing/all-in-one docker tag to v1.72.0 (#2285) | - | 1 | +1/-1 |
| 2025-08-07 | `16adb51` | [#2289](https://github.com/apache/polaris/pull/2289) | fix(deps): update dependency com.gradleup.shadow:shadow-gradle-plugin to v9 (#2289) | - | 1 | +1/-1 |
| 2025-08-07 | `23736a6` | [#2259](https://github.com/apache/polaris/pull/2259) | chore(deps): update dependency poetry to v2.1.4 (#2259) | * fix pyproject --------- Co-authored-by: Robert Stupp <snazy@snazy.de> | 2 | +2/-2 |
| 2025-08-06 | `35b31ca` | [#2287](https://github.com/apache/polaris/pull/2287) | Clean exit when running repair mode for client (#2287) | * Clean exit when running repair mode for client | 1 | +7/-2 |
| 2025-08-06 | `04e65af` | [#2251](https://github.com/apache/polaris/pull/2251) | Use injected PolarisDiagnostics in MetaStoreManagerFactory impls (#2251) | - | 7 | +23/-23 |
| 2025-08-06 | `7fbd3ab` | [#2275](https://github.com/apache/polaris/pull/2275) | Use Mockito Java agent for mock instrumentation (#2275) | Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's d... | 1 | +10/-2 |
| 2025-08-06 | `0c790e0` | [#2268](https://github.com/apache/polaris/pull/2268) | Standardize logging libraries in tests (#2268) | - Non-Quarkus modules use Logback Classic, configured via logback-test.xml - Quarkus modules use JBoss Logging Manager, configured in Quarkus configuration files. This change also introduces a work... | 19 | +277/-96 |
| 2025-08-06 | `974098d` | [#2274](https://github.com/apache/polaris/pull/2274) | Minor fixes and enhancements to External IDP documentation (#2274) | - | 1 | +65/-46 |
| 2025-08-06 | `565a3ee` | [#2273](https://github.com/apache/polaris/pull/2273) | Nit: simplify runtime-service dependencies (#2273) | - | 1 | +3/-6 |
| 2025-08-06 | `f34adca` | [#2249](https://github.com/apache/polaris/pull/2249) | Add TestServices.newCallContext (#2249) | - | 6 | +33/-61 |
| 2025-08-06 | `4e82cd1` | [#2248](https://github.com/apache/polaris/pull/2248) | Stop mocking PolarisDiagnostics (#2248) | - | 2 | +3/-1 |
| 2025-08-06 | `3858a16` | [#2247](https://github.com/apache/polaris/pull/2247) | Prefer diagnostics field in Resolver (#2247) | - | 1 | +3/-3 |
| 2025-08-06 | `bae5444` | [#2269](https://github.com/apache/polaris/pull/2269) | fix(deps): update dependency boto3 to v1.40.3 (#2269) | - | 1 | +1/-1 |
| 2025-08-06 | `7095fd6` | [#2271](https://github.com/apache/polaris/pull/2271) | chore(deps): update actions/download-artifact action to v5 (#2271) | - | 1 | +1/-1 |
| 2025-08-06 | `9b2fbae` | [#2270](https://github.com/apache/polaris/pull/2270) | fix(deps): update dependency com.nimbusds:nimbus-jose-jwt to v10.4.1 (#2270) | - | 1 | +1/-1 |
| 2025-08-05 | `af69d9f` | [#2217](https://github.com/apache/polaris/pull/2217) | JdbcMetaStoreManagerFactory determines schemaVersion once per realm (#2217) | running the query. | 3 | +14/-8 |
| 2025-08-05 | `20febda` | [#2233](https://github.com/apache/polaris/pull/2233) | Merge polaris-service-common into polaris-runtime-service (#2233) | - | 290 | +779/-1150 |
| 2025-08-05 | `b476779` | [#2219](https://github.com/apache/polaris/pull/2219) | JDBC: SERIALIZABLE/EntityNotFoundException (#2219) | - | 1 | +10/-4 |
| 2025-08-05 | `355adae` | [#2236](https://github.com/apache/polaris/pull/2236) | Make `*StorageConfigurationInfo` types immutable (#2236) | - | 13 | +395/-382 |
| 2025-08-05 | `5fb38c5` | [#2266](https://github.com/apache/polaris/pull/2266) | chore(deps): update registry.access.redhat.com/ubi9/openjdk-21-runtime docker tag to v1.22-1.1753981256 (#2266) | - | 2 | +2/-2 |
| 2025-08-05 | `532ee51` | [#2235](https://github.com/apache/polaris/pull/2235) | Remove config parameter from `PolarisStorageIntegration#getSubscopedCreds` (#2235) | This change removes the config parameter, as it's already known when `PolarisStorageIntegration` instances are created. | 16 | +104/-136 |
| 2025-08-05 | `64d815a` | [#2265](https://github.com/apache/polaris/pull/2265) | chore(deps): update gradle/actions digest to 017a9ef (#2265) | - | 5 | +8/-8 |
| 2025-08-05 | `ff9fdcd` | [#2264](https://github.com/apache/polaris/pull/2264) | chore(deps): update plugin jetbrains-changelog to v2.4.0 (#2264) | - | 1 | +1/-1 |
| 2025-08-05 | `bbb7b43` | [#2241](https://github.com/apache/polaris/pull/2241) | Use application-scope clock when generating GCP credentials (#2241) | - | 3 | +15/-10 |
| 2025-08-05 | `f2a54cb` | [#2255](https://github.com/apache/polaris/pull/2255) | QuarkusProducers: remove unneeded `BasePersistence` producer (#2255) | - | 1 | +8/-15 |
| 2025-08-05 | `7774613` | [#2234](https://github.com/apache/polaris/pull/2234) | Only pass `RealmConfig` to `PolarisStorageIntegration` (#2234) | - | 12 | +32/-40 |
| 2025-08-05 | `2f7e8a6` | [#2257](https://github.com/apache/polaris/pull/2257) | fix(deps): update immutables to v2.11.2 (#2257) | - | 1 | +1/-1 |
| 2025-08-05 | `e1e9c48` | [#2260](https://github.com/apache/polaris/pull/2260) | fix(deps): update dependency com.gradleup.shadow:shadow-gradle-plugin to v8.3.9 (#2260) | - | 1 | +1/-1 |
| 2025-08-05 | `d6ae2c8` | [#2256](https://github.com/apache/polaris/pull/2256) | fix(deps): update dependency boto3 to v1.40.2 (#2256) | - | 1 | +1/-1 |
| 2025-08-04 | `a660903` | [#2252](https://github.com/apache/polaris/pull/2252) | Remove obsolete information from README-quarkus.md (#2252) | - | 2 | +43/-121 |
| 2025-08-04 | `97bbc39` | [#2230](https://github.com/apache/polaris/pull/2230) | Replace TestPolarisMetaStoreManager with Mockito.spy (#2230) | - | 1 | +16/-33 |
| 2025-08-04 | `a3849fe` | [#2246](https://github.com/apache/polaris/pull/2246) | fix(deps): update dependency software.amazon.awssdk:bom to v2.32.14 (#2246) | - | 1 | +1/-1 |
| 2025-08-04 | `14c9394` | [#2237](https://github.com/apache/polaris/pull/2237) | Prepare upgrade to Gradle 9 (#2237) | * `api/...` build scripts - changes due to nullable type handling (`Property<String>` vs `Property<String?>` - latter is ... weird) | 5 | +21/-24 |
| 2025-08-04 | `253321c` | [#2210](https://github.com/apache/polaris/pull/2210) | Add ResolutionManifestFactory (#2210) | was left in `PolarisEntityManager`. by splitting out the more dedicated `ResolutionManifestFactory` we can remove `PolarisEntityManager` and `RealmEntityManagerFactory` completely it seems. | 30 | +229/-329 |
| 2025-08-04 | `7fa497c` | [#2221](https://github.com/apache/polaris/pull/2221) | JDBC: Log SQL statements at debug level (#2221) | - | 1 | +17/-0 |
| 2025-08-03 | `aa24027` | [#2242](https://github.com/apache/polaris/pull/2242) | fix(deps): update dependency com.azure:azure-sdk-bom to v1.2.37 (#2242) | - | 1 | +1/-1 |
| 2025-08-02 | `3f1774a` | [#2240](https://github.com/apache/polaris/pull/2240) | fix(deps): update dependency boto3 to v1.40.1 (#2240) | - | 1 | +1/-1 |
| 2025-08-01 | `7b7a424` | [#2218](https://github.com/apache/polaris/pull/2218) | chore(deps): update dependency mypy to >=1.17, <=1.17.1 (#2218) | - | 1 | +1/-1 |
| 2025-08-01 | `d3dbe0c` | [#2216](https://github.com/apache/polaris/pull/2216) | Fix deprecated Quarkus log properties (#2216) | CI Quarkus tests were logging this repeatedly: ``` The "quarkus.log.file.json" config property is deprecated and should not be used anymore. The "quarkus.log.console.json" config property is deprec... | 4 | +7/-7 |
| 2025-08-01 | `e439ff5` | [#2213](https://github.com/apache/polaris/pull/2213) | feat: Add `endpointInternal` to `AwsStorageConfigInfo` (#2213) | This API change is backward compatible with older clients and server using old storage configuration. * The `endpointInternal` allows Polaris Servers to use a different   host name (or IP address) ... | 6 | +134/-33 |
| 2025-08-01 | `0449d9b` | [#2203](https://github.com/apache/polaris/pull/2203) | Remove CallContext.CURRENT_CONTEXT (#2203) | removed in the following commits: - 756e535fabe150eefdfe16f3c61c1207217d2e2f - e7eb59f6d89a5891381c805c9ed4244601d5b430 - 4d94745db36c5d4907cf34d749a3a2690f8e4fff thus we can now remove the `CURREN... | 6 | +7/-38 |
| 2025-08-01 | `0b3a129` | [#2231](https://github.com/apache/polaris/pull/2231) | Fix compilation warnings in AzureCredentialStorageIntegrationTest (#2231) | - | 1 | +6/-4 |
| 2025-08-01 | `482dbba` | [#2232](https://github.com/apache/polaris/pull/2232) | Fix Awaitility build configuration (#2232) | - | 1 | +1/-1 |
| 2025-08-01 | `f6097d9` | [#2224](https://github.com/apache/polaris/pull/2224) | chore(deps): update actions/stale digest to 8f717f0 (#2224) | - | 1 | +1/-1 |
| 2025-07-31 | `2890c69` | [#2225](https://github.com/apache/polaris/pull/2225) | fix(deps): update dependency boto3 to v1.40.0 (#2225) | - | 1 | +1/-1 |
| 2025-07-31 | `8f488d5` | [#2220](https://github.com/apache/polaris/pull/2220) | JDBC: Include error code + SQL state in exception messages (#2220) | - | 2 | +8/-4 |
| 2025-07-31 | `5e43a07` | [#2198](https://github.com/apache/polaris/pull/2198) | Replace CommitFailedException with CommitConflictException (#2198) | In some cases, we were using CommitFailedException to represent commit conflicts, which returns the correct 409 response but is tied to Iceberg. However, some of these conflicts originate from Pola... | 4 | +13/-12 |
| 2025-07-31 | `a6656c3` | [#2215](https://github.com/apache/polaris/pull/2215) | Remove CallContextResolver (#2215) | - | 2 | +0/-100 |
| 2025-07-31 | `c49755b` | [#2222](https://github.com/apache/polaris/pull/2222) | fix(deps): update dependency io.smallrye.common:smallrye-common-annotation to v2.13.8 (#2222) | - | 1 | +1/-1 |
| 2025-07-31 | `eefe572` | [#2045](https://github.com/apache/polaris/pull/2045) | Remove postgres_latest as image tag (#2045) | * Change image tag to latest for getting started examples * Change image tag to latest from helm | 13 | +7/-13 |
| 2025-07-30 | `0531b21` | [#2154](https://github.com/apache/polaris/pull/2154) | Enable python client debug flag (#2154) | * Move debug msg to stderr and move debug enable after option parsing | 3 | +34/-7 |
| 2025-07-31 | `dc8b117` | [#2212](https://github.com/apache/polaris/pull/2212) | fix(deps): update dependency org.apache.commons:commons-compress to v1.28.0 (#2212) | - | 1 | +1/-1 |
| 2025-07-31 | `5c9b36e` | [#2211](https://github.com/apache/polaris/pull/2211) | fix(deps): update dependency boto3 to v1.39.17 (#2211) | - | 1 | +1/-1 |
| 2025-07-30 | `4d94745` | [#2202](https://github.com/apache/polaris/pull/2202) | Remove getCurrentContext from JWTBroker (#2202) | - | 4 | +10/-52 |
| 2025-07-30 | `e7eb59f` | [#2201](https://github.com/apache/polaris/pull/2201) | Remove getCurrentContext from InMemoryStorageIntegration (#2201) | - | 5 | +51/-33 |
| 2025-07-30 | `3d354f8` | [#2195](https://github.com/apache/polaris/pull/2195) | Remove PolarisCallContext from TreeMapMetaStore (#2195) | * reset diagnosticServices in TreeMapMetaStore * simplify ensure methods | 2 | +28/-41 |
| 2025-07-30 | `2332f63` | [#2194](https://github.com/apache/polaris/pull/2194) | Simplify BaseMetaStoreManager.extractStorageConfiguration (#2194) | the full `PolarisCallContext` if not necessary. | 6 | +15/-14 |
| 2025-07-30 | `914be46` | [#2167](https://github.com/apache/polaris/pull/2167) | fix(deps): update quarkus platform and group to v3.25.0 (#2167) | - | 1 | +1/-1 |
| 2025-07-30 | `1b51590` | [#2208](https://github.com/apache/polaris/pull/2208) | chore(deps): update actions/stale digest to a92fd57 (#2208) | - | 1 | +1/-1 |
| 2025-07-30 | `df87252` | [#2209](https://github.com/apache/polaris/pull/2209) | fix(deps): update dependency boto3 to v1.39.16 (#2209) | - | 1 | +1/-1 |
| 2025-07-29 | `433cfee` | [#2200](https://github.com/apache/polaris/pull/2200) | fix(deps): update dependency com.google.cloud:google-cloud-storage-bom to v2.54.0 (#2200) | - | 1 | +1/-1 |
| 2025-07-29 | `f6ae689` | [#2199](https://github.com/apache/polaris/pull/2199) | fix(deps): update dependency boto3 to v1.39.15 (#2199) | - | 1 | +1/-1 |
| 2025-07-28 | `364b53c` | [#2170](https://github.com/apache/polaris/pull/2170) | Fix Namespace resolution on grant/revoke privilege operations (#2170) | * Move isFullyResolvedNamespace to PolarisResolvedPathWrapper | 4 | +476/-2 |
| 2025-07-28 | `756e535` | [#2176](https://github.com/apache/polaris/pull/2176) | Remove PolarisDiagnostics from json utils (#2176) | - | 24 | +81/-229 |
| 2025-07-28 | `e46f8c6` | [#2174](https://github.com/apache/polaris/pull/2174) | Add Principal lookup helpers to PolarisMetaStoreManager (#2174) | - add `PolarisMetaStoreManager.findRootPrincipal` - add `PolarisMetaStoreManager.findPrincipalByName` - add `PolarisMetaStoreManager.findPrincipalRoleByName` also we now prefer `PolarisEntityConsta... | 15 | +115/-210 |
| 2025-07-28 | `c3ad994` | [#2191](https://github.com/apache/polaris/pull/2191) | fix(deps): update dependency software.amazon.awssdk:bom to v2.32.9 (#2191) | - | 1 | +1/-1 |
| 2025-07-27 | `181fda6` | [#2187](https://github.com/apache/polaris/pull/2187) | chore(deps): update plugin jetbrains-changelog to v2.3.0 (#2187) | - | 1 | +1/-1 |
| 2025-07-25 | `e59281a` | [#2186](https://github.com/apache/polaris/pull/2186) | fix(deps): update dependency boto3 to v1.39.14 (#2186) | - | 1 | +1/-1 |
| 2025-07-26 | `8b811ed` | [#2009](https://github.com/apache/polaris/pull/2009) | Fix doc to remove privileges may take up to one hour to take effect and add Policy to securable object (#2009) | - | 1 | +1/-5 |
| 2025-07-25 | `7b04abe` | [#2171](https://github.com/apache/polaris/pull/2171) | Push AccessConfig creation to PolarisStorageIntegration (#2171) | * Move storage-specific access properties processing logic from   core code to storage integration implementations. * Add `isExpirationTimestamp` flag to `StorageAccessProperty` to   allow them to ... | 21 | +413/-361 |
| 2025-07-25 | `a39bce4` | [#2185](https://github.com/apache/polaris/pull/2185) | fix(deps): update dependency com.adobe.testing:s3mock-testcontainers to v4.7.0 (#2185) | - | 1 | +1/-1 |
| 2025-07-25 | `dd4a8cc` | [#2184](https://github.com/apache/polaris/pull/2184) | Add Polaris Community Meeting 2025-07-24 (#2184) | - | 1 | +16/-6 |
| 2025-07-24 | `6764a88` | [#2143](https://github.com/apache/polaris/pull/2143) | Add podman support (#2143) | - | 2 | +17/-15 |
| 2025-07-24 | `085eefa` | [#2182](https://github.com/apache/polaris/pull/2182) | fix(deps): update dependency boto3 to v1.39.13 (#2182) | - | 1 | +1/-1 |
| 2025-07-24 | `2256df0` | [#2172](https://github.com/apache/polaris/pull/2172) | Simplify bootstrapServiceAndCreatePolarisPrincipalForRealm (#2172) | because the same pattern existed for this method. note that we do some minor additional "formatting" changes to minimize the diff between the two files (as they were originally copy pasted). this c... | 2 | +23/-32 |
| 2025-07-24 | `45a7e3e` | [#2181](https://github.com/apache/polaris/pull/2181) | fix(deps): update dependency com.google.errorprone:error_prone_core to v2.41.0 (#2181) | - | 1 | +1/-1 |
| 2025-07-24 | `e9267b6` | [#1989](https://github.com/apache/polaris/pull/1989) | Respond with 409 in case of concurrent Namespace update failures instead of 500 (#1989) | - | 4 | +65/-19 |
| 2025-07-24 | `ca85339` | [#2161](https://github.com/apache/polaris/pull/2161) | Rework getOrCreateSessionSupplier (#2161) | it seems like the `Supplier` was an leaking implementation detail of the `MetaStoreManagerFactor` implementations. | 20 | +32/-43 |
| 2025-07-24 | `d44bf1a` | [#2178](https://github.com/apache/polaris/pull/2178) | fix(deps): update dependency org.apache.commons:commons-text to v1.14.0 (#2178) | - | 1 | +1/-1 |
| 2025-07-24 | `68d0e26` | [#2039](https://github.com/apache/polaris/pull/2039) | Add muti-platform Docker images staging in the release guide (#2039) | - | 1 | +13/-2 |
| 2025-07-24 | `218ce64` | [#2175](https://github.com/apache/polaris/pull/2175) | chore(deps): update plugin jandex to v2.2.0 (#2175) | - | 1 | +1/-1 |
| 2025-07-24 | `d898764` | [#2163](https://github.com/apache/polaris/pull/2163) | Improve Realm ID resolution for Quarkus 3.24+ (#2163) | It is also now possible to return null from ValueExpressionResolver. This is not a big deal, but still better than returning "". | 2 | +5/-29 |
| 2025-07-24 | `b501bfc` | [#2169](https://github.com/apache/polaris/pull/2169) | fix(deps): update dependency boto3 to v1.39.12 (#2169) | - | 1 | +1/-1 |
| 2025-07-23 | `5faa371` | [#2162](https://github.com/apache/polaris/pull/2162) | Simplify checkPolarisServiceBootstrappedForRealm (#2162) | - | 2 | +10/-18 |
| 2025-07-23 | `98d4220` | [#2165](https://github.com/apache/polaris/pull/2165) | fix(deps): update dependency io.smallrye.config:smallrye-config-core to v3.13.4 (#2165) | - | 1 | +1/-1 |
| 2025-07-23 | `91fee87` | [#2166](https://github.com/apache/polaris/pull/2166) | fix(deps): update quarkus platform and group (#2166) | - | 1 | +1/-1 |
| 2025-07-23 | `07ee3fd` | [#2158](https://github.com/apache/polaris/pull/2158) | Run standard (sharable) REST Catalog integrations tests with MinIO (#2158) | Keep special edge case tests (path style, STS endpoint and client-side FileIO) in `QuarkusRestCatalogMinIoSpecialIT`. | 3 | +125/-9 |
| 2025-07-23 | `95358a9` | [#2148](https://github.com/apache/polaris/pull/2148) | Extract ResolverFactory from PolarisEntityManager (#2148) | Note that the little left-over functionality of `PolarisEntityManager` can be split out to more dedicated interfaces in a follow-up most likely. | 16 | +148/-80 |
| 2025-07-23 | `395459f` | [#2159](https://github.com/apache/polaris/pull/2159) | fix(deps): update dependency boto3 to v1.39.11 (#2159) | - | 1 | +1/-1 |
| 2025-07-23 | `134a53d` | [#2160](https://github.com/apache/polaris/pull/2160) | fix(deps): update dependency commons-codec:commons-codec to v1.19.0 (#2160) | - | 1 | +1/-1 |
| 2025-07-22 | `c84a634` | [#2157](https://github.com/apache/polaris/pull/2157) | chore: fix class reference in the javadoc of TableLikeEntity (#2157) | - | 1 | +1/-0 |
| 2025-07-22 | `62ed33f` | [#2151](https://github.com/apache/polaris/pull/2151) | fix(deps): update dependency boto3 to v1.39.10 (#2151) | - | 1 | +1/-1 |
| 2025-07-22 | `35e835c` | [#2152](https://github.com/apache/polaris/pull/2152) | fix(deps): update dependency com.diffplug.spotless:spotless-plugin-gradle to v7.2.1 (#2152) | - | 1 | +1/-1 |
| 2025-07-22 | `89deb5f` | [#2150](https://github.com/apache/polaris/pull/2150) | chore(deps): update registry.access.redhat.com/ubi9/openjdk-21-runtime docker tag to v1.22-1.1752676419 (#2150) | - | 2 | +2/-2 |
| 2025-07-22 | `886d111` | [#2133](https://github.com/apache/polaris/pull/2133) | Remove PolarisEntityManager.getCredentialCache (#2133) | the only caller of `getCredentialCache` is `FileIOUtil.refreshAccessConfig`, which in in turn is only called by `DefaultFileIOFactory` and `IcebergCatalog`. note that in a follow-up we will likely ... | 18 | +98/-129 |
| 2025-07-21 | `3316f4e` | [#2127](https://github.com/apache/polaris/pull/2127) | Python client: add support for endpoint, sts-endpoint, path-style-access (#2127) | Amends #1913 and #2012 | 4 | +21/-1 |
| 2025-07-21 | `8a3ebce` | [#2136](https://github.com/apache/polaris/pull/2136) | fix(deps): update dependency com.fasterxml.jackson:jackson-bom to v2.19.2 (#2136) | - | 1 | +1/-1 |
| 2025-07-21 | `008cedf` | [#2137](https://github.com/apache/polaris/pull/2137) | fix(deps): update dependency boto3 to v1.39.9 (#2137) | - | 1 | +1/-1 |
| 2025-07-21 | `dde6e95` | [#2147](https://github.com/apache/polaris/pull/2147) | fix(deps): update dependency org.junit:junit-bom to v5.13.4 (#2147) | - | 1 | +1/-1 |
| 2025-07-21 | `1a0fb02` | [#2138](https://github.com/apache/polaris/pull/2138) | fix(deps): update dependency org.xerial.snappy:snappy-java to v1.1.10.8 (#2138) | - | 1 | +1/-1 |
| 2025-07-21 | `6e1bce6` | [#2146](https://github.com/apache/polaris/pull/2146) | fix(deps): update dependency software.amazon.awssdk:bom to v2.32.4 (#2146) | - | 1 | +1/-1 |
| 2025-07-21 | `7dc50dc` | [#2142](https://github.com/apache/polaris/pull/2142) | fix(deps): update dependency com.diffplug.spotless:spotless-plugin-gradle to v7.2.0 (#2142) | - | 1 | +1/-1 |
| 2025-07-21 | `d67a35d` | [#2139](https://github.com/apache/polaris/pull/2139) | fix(deps): update dependency com.nimbusds:nimbus-jose-jwt to v10.4 (#2139) | - | 1 | +1/-1 |
| 2025-07-21 | `81ad206` | [#2132](https://github.com/apache/polaris/pull/2132) | CI: Address failure from accessing GH API (#2132) | ``` * What went wrong: Execution failed for task ':generatePomFileForMavenPublication'. > Unable to process url: https://api.github.com/repos/apache/polaris/contributors?per_page=1000 ``` The somet... | 4 | +28/-2 |
| 2025-07-20 | `3650c68` | [#2049](https://github.com/apache/polaris/pull/2049) | Package polaris client as python package (#2049) | * Package polaris client as python package * Change owner to spark when copying files from local into Dockerfile | 4 | +31/-12 |
| 2025-07-19 | `bc111fc` | [#2027](https://github.com/apache/polaris/pull/2027) | Use Makefile to simplify setup and commands (#2027) | * Add targets for minikube state management * Add podman support and spark plugin build * Add version target * Update README.md for Makefile usage and relation to the project * Fix nit | 2 | +280/-0 |
| 2025-07-18 | `b48cfb6` | [#2122](https://github.com/apache/polaris/pull/2122) | Add server and client support for the new generic table `baseLocation` field (#2122) | - | 16 | +128/-40 |
| 2025-07-18 | `633cedf` | [#2134](https://github.com/apache/polaris/pull/2134) | Add newIcebergCatalog helper (#2134) | mostly use the same parameters most of the time. also remove an unused field in 2 other tests. | 3 | +34/-113 |
| 2025-07-18 | `8c0d967` | [#2130](https://github.com/apache/polaris/pull/2130) | fix(deps): update dependency io.smallrye.config:smallrye-config-core to v3.13.3 (#2130) | - | 1 | +1/-1 |
| 2025-07-18 | `351ffb3` | [#2129](https://github.com/apache/polaris/pull/2129) | fix(deps): update dependency boto3 to v1.39.8 (#2129) | - | 1 | +1/-1 |
| 2025-07-18 | `79b9ce8` | [#2128](https://github.com/apache/polaris/pull/2128) | fix(deps): update quarkus platform and group to v3.24.4 (#2128) | - | 1 | +1/-1 |
| 2025-07-18 | `2021e4f` | [#2126](https://github.com/apache/polaris/pull/2126) | fix(deps): update dependency org.apache.iceberg:iceberg-bom to v1.9.2 (#2126) | - | 1 | +1/-1 |
| 2025-07-17 | `46a2a03` | [#2104](https://github.com/apache/polaris/pull/2104) | feat(helm): Add support for external authentication (#2104) | - | 12 | +527/-67 |
| 2025-07-17 | `6e416a9` | [#2121](https://github.com/apache/polaris/pull/2121) | Add IMPLICIT authentication support to the CLI (#2121) | Since Hadoop federated catalogs rely purely on IMPLICIT authentication, the CLI parsing test has been updated to reflect the same. | 3 | +33/-20 |
| 2025-07-17 | `82ae2cf` | [#2106](https://github.com/apache/polaris/pull/2106) | Abstract polaris-runtime-service tests for all persistence implementations (#2106) | This change moves the actual tests to `Abstract*` classes and refactors the existing tests to extend those. The NoSQL persistence work extends the same `Abstract*` classes but runs with different Q... | 11 | +182/-121 |
| 2025-07-17 | `79ebe84` | [#2124](https://github.com/apache/polaris/pull/2124) | fix(deps): update dependency boto3 to v1.39.7 (#2124) | - | 1 | +1/-1 |
| 2025-07-17 | `c906cfa` | [#2125](https://github.com/apache/polaris/pull/2125) | fix(deps): update dependency gradle.plugin.org.jetbrains.gradle.plugin.idea-ext:gradle-idea-ext to v1.2 (#2125) | - | 1 | +1/-1 |
| 2025-07-16 | `7ca4970` | [#2105](https://github.com/apache/polaris/pull/2105) | Add TestFileIOFactory helper (#2105) | - | 4 | +60/-72 |
| 2025-07-16 | `987c554` | [#2012](https://github.com/apache/polaris/pull/2012) | Add `pathStyleAccess` to AwsStorageConfigInfo (#2012) | This change allows configuring the "path-style" access mode in S3 clients (both in Polaris Servers and Iceberg REST Catalog API clients). This change is applicable both to AWS storage and to non-AW... | 11 | +173/-21 |
| 2025-07-16 | `d035344` | [#1960](https://github.com/apache/polaris/pull/1960) | Spark 3.5.6 and Iceberg 1.9.1 (#1960) | * Cleanup | 21 | +55/-55 |
| 2025-07-16 | `05975a3` | [#2114](https://github.com/apache/polaris/pull/2114) | chore(deps): update dependency mypy to >=1.17, <=1.17.0 (#2114) | - | 1 | +1/-1 |
| 2025-07-16 | `d2667e5` | [#2051](https://github.com/apache/polaris/pull/2051) | Site/dev: allow overriding the podman/docker binaries detection (#2051) | ```bash DOCKER=docker COMPOSE=docker-compose ``` | 3 | +21/-2 |
| 2025-07-16 | `fb418a2` | [#1938](https://github.com/apache/polaris/pull/1938) | Extensible pagination token implementation (#1938) | * Allows multiple implementations of `Token` referencing the "next page", encapsulated in `PageToken`. No changes to `polaris-core` needed to add custom `Token` implementations. * Extensible to (la... | 32 | +1329/-506 |
| 2025-07-16 | `d6d26bc` | [#2120](https://github.com/apache/polaris/pull/2120) | fix(deps): update dependency boto3 to v1.39.6 (#2120) | - | 1 | +1/-1 |
| 2025-07-15 | `1cb85e0` | [#2119](https://github.com/apache/polaris/pull/2119) | chore: Avoid deprecated `DefaultCredentialsProvider.create()` (#2119) | - | 1 | +1/-1 |
| 2025-07-15 | `77666ab` | [#2116](https://github.com/apache/polaris/pull/2116) | fix(deps): update dependency boto3 to v1.39.4 (#2116) | - | 1 | +1/-1 |
| 2025-07-15 | `39a10d3` | [#2113](https://github.com/apache/polaris/pull/2113) | fix(deps): update immutables to v2.11.1 (#2113) | - | 1 | +1/-1 |
| 2025-07-15 | `1b966b1` | [#2031](https://github.com/apache/polaris/pull/2031) | Site: Remove non-OSS query engines from front page (#2031) | * Add Dremio OSS | 1 | +1/-1 |
| 2025-07-15 | `bd164f5` | [#2085](https://github.com/apache/polaris/pull/2085) | Disable renovatebot on release branches (#2085) | - | 1 | +0/-8 |
| 2025-07-15 | `9ecf29b` | [#2029](https://github.com/apache/polaris/pull/2029) | Use PolarisImmutable for StorageCredentialCacheKey (#2029) | * convert StorageCredentialCacheKey to immutables | 3 | +30/-97 |
| 2025-07-15 | `38d7dbf` | [#2050](https://github.com/apache/polaris/pull/2050) | Simplify RealmEntityManagerFactory usage in tests (#2050) | can do the same for `RealmEntityManagerFactory` `PolarisAuthzTestBase.entityManager` is already getting derived from `realmEntityManagerFactory`: https://github.com/apache/polaris/blob/2c2052c28f89... | 3 | +10/-27 |
| 2025-07-15 | `c72986f` | [#2060](https://github.com/apache/polaris/pull/2060) | Renovate PRs, branch name + PR subject (#2060) | I also noticed that the branch name is repeated in the PR subject, which started to be that way some longer ago. This change removes both duplications. | 1 | +0/-2 |
| 2025-07-15 | `8a059aa` | [#2087](https://github.com/apache/polaris/pull/2087) | Revert PR 2033 (#2087) | There are concerns that the PR #2033 will interfere with the whole effort to automate releases. Since there was no change to review and raise the concerns, I'd like to revert it to not cause any fr... | 31 | +229/-169 |
| 2025-07-15 | `b74679d` | [#2083](https://github.com/apache/polaris/pull/2083) | main: Update dependency io.smallrye.common:smallrye-common-annotation to v2.13.7 (#2083) | - | 1 | +1/-1 |
| 2025-07-15 | `e374684` | [#2081](https://github.com/apache/polaris/pull/2081) | main: Update dependency com.adobe.testing:s3mock-testcontainers to v4.6.0 (#2081) | - | 1 | +1/-1 |
| 2025-07-15 | `fd52737` | [#2080](https://github.com/apache/polaris/pull/2080) | main: Update dependency software.amazon.awssdk:bom to v2.31.78 (#2080) | - | 1 | +1/-1 |
| 2025-07-15 | `753a3cf` | [#2082](https://github.com/apache/polaris/pull/2082) | main: Update dependency io.opentelemetry:opentelemetry-bom to v1.52.0 (#2082) | - | 1 | +1/-1 |
| 2025-07-15 | `45040bd` | [#2013](https://github.com/apache/polaris/pull/2013) | Add External Identity Providers page to unreleased documentation  (#2013) | Co-authored-by: Alexandre Dutra <adutra@apache.org> Co-authored-by: Eric Maynard <emaynard@apache.org> | 1 | +341/-0 |
| 2025-07-15 | `82a5e68` | [#2078](https://github.com/apache/polaris/pull/2078) | main: Update dependency org.eclipse.persistence:eclipselink to v4.0.7 (#2078) | - | 1 | +1/-1 |
| 2025-07-15 | `9897a40` | [#2061](https://github.com/apache/polaris/pull/2061) | main: Update dependency com.gradleup.shadow:shadow-gradle-plugin to v8.3.8 (#2061) | - | 1 | +1/-1 |
| 2025-07-15 | `23d8d01` | [#2075](https://github.com/apache/polaris/pull/2075) | main: Update dependency io.projectreactor.netty:reactor-netty-http to v1.2.8 (#2075) | - | 1 | +1/-1 |
| 2025-07-15 | `5402a1e` | [#2079](https://github.com/apache/polaris/pull/2079) | main: Update dependency net.ltgt.gradle:gradle-errorprone-plugin to v4.3.0 (#2079) | - | 1 | +1/-1 |
| 2025-07-15 | `ccb6a29` | [#2076](https://github.com/apache/polaris/pull/2076) | main: Update dependency io.prometheus:prometheus-metrics-exporter-servlet-jakarta to v1.3.10 (#2076) | - | 1 | +1/-1 |
| 2025-07-15 | `bbbef73` | [#2074](https://github.com/apache/polaris/pull/2074) | main: Update dependency io.netty:netty-codec-http2 to v4.2.3.Final (#2074) | - | 1 | +1/-1 |
| 2025-07-15 | `dea4f2f` | [#2068](https://github.com/apache/polaris/pull/2068) | main: Update dependency com.google.errorprone:error_prone_core to v2.40.0 (#2068) | - | 1 | +1/-1 |
| 2025-07-15 | `f9e9316` | [#2065](https://github.com/apache/polaris/pull/2065) | main: Update dependency org.testcontainers:testcontainers-bom to v1.21.3 (#2065) | - | 1 | +1/-1 |
| 2025-07-15 | `813ed39` | [#2072](https://github.com/apache/polaris/pull/2072) | main: Update immutables to v2.11.0 (#2072) | - | 1 | +1/-1 |
| 2025-07-15 | `0e1fee5` | [#2073](https://github.com/apache/polaris/pull/2073) | main: Update log4j2 monorepo to v2.25.1 (#2073) | - | 1 | +2/-2 |
| 2025-07-15 | `bfc854f` | [#2069](https://github.com/apache/polaris/pull/2069) | main: Update dependency org.apache.commons:commons-lang3 to v3.18.0 (#2069) | - | 1 | +1/-1 |
| 2025-07-15 | `b29bcd8` | [#2066](https://github.com/apache/polaris/pull/2066) | main: Update medyagh/setup-minikube action to v0.0.20 (#2066) | - | 1 | +1/-1 |
| 2025-07-15 | `6dc8309` | [#2070](https://github.com/apache/polaris/pull/2070) | main: Update docker.io/jaegertracing/all-in-one Docker tag to v1.71.0 (#2070) | - | 1 | +1/-1 |
| 2025-07-15 | `a6b8ae4` | [#2064](https://github.com/apache/polaris/pull/2064) | main: Update dependency org.junit:junit-bom to v5.13.3 (#2064) | - | 1 | +1/-1 |
| 2025-07-15 | `9787264` | [#2071](https://github.com/apache/polaris/pull/2071) | main: Update docker.io/prom/prometheus Docker tag to v3.5.0 (#2071) | - | 1 | +1/-1 |
| 2025-07-15 | `1e4528a` | [#2062](https://github.com/apache/polaris/pull/2062) | main: Update dependency com.nimbusds:nimbus-jose-jwt to v10.3.1 (#2062) | - | 1 | +1/-1 |
| 2025-07-15 | `f4256f9` | [#2067](https://github.com/apache/polaris/pull/2067) | main: Update dependency com.diffplug.spotless:spotless-plugin-gradle to v7.1.0 (#2067) | - | 1 | +1/-1 |
| 2025-07-15 | `d8807c9` | [#2063](https://github.com/apache/polaris/pull/2063) | main: Update dependency io.micrometer:micrometer-bom to v1.15.2 (#2063) | - | 1 | +1/-1 |
| 2025-07-15 | `87d16d8` | [#2058](https://github.com/apache/polaris/pull/2058) | main: Update dependency gradle to v8.14.3 (main) (#2058) | * Adjust Gradle update --------- Co-authored-by: Robert Stupp <snazy@snazy.de> | 1 | +2/-2 |
| 2025-07-15 | `d08634a` | [#2056](https://github.com/apache/polaris/pull/2056) | main: Update dependency com.github.ben-manes.caffeine:caffeine to v3.2.2 (#2056) | - | 1 | +1/-1 |
| 2025-07-15 | `213d459` | [#2059](https://github.com/apache/polaris/pull/2059) | main: Update registry.access.redhat.com/ubi9/openjdk-21-runtime Docker tag to v1.22-1.1752066187 (#2059) | - | 2 | +2/-2 |
| 2025-07-15 | `ea19162` | [#2057](https://github.com/apache/polaris/pull/2057) | main: Update dependency com.google.cloud:google-cloud-storage-bom to v2.53.3 (#2057) | - | 1 | +1/-1 |
| 2025-07-15 | `69761a2` | [#2055](https://github.com/apache/polaris/pull/2055) | main: Update dependency com.fasterxml.jackson:jackson-bom to v2.19.1 (#2055) | - | 1 | +1/-1 |
| 2025-07-15 | `eb134d7` | [#2054](https://github.com/apache/polaris/pull/2054) | main: Update dependency com.azure:azure-sdk-bom to v1.2.36 (#2054) | - | 1 | +1/-1 |
| 2025-07-15 | `42303bb` | [#2053](https://github.com/apache/polaris/pull/2053) | main: Update actions/stale digest to 128b2c8 (#2053) | - | 1 | +1/-1 |
| 2025-07-15 | `3b629dd` | [#2052](https://github.com/apache/polaris/pull/2052) | Attempt to make Renovate work again (#2052) | The plan here is to: 1. remove the regex from our `baseBranches` option - if that doesn't work then 2. just use the default branch | 1 | +2/-1 |
| 2025-07-15 | `2c2052c` | [#2022](https://github.com/apache/polaris/pull/2022) | Use application-scoped StorageCredentialCache (#2022) | - | 15 | +118/-57 |
| 2025-07-14 | `1b073bc` | [#1958](https://github.com/apache/polaris/pull/1958) | Bump Quarkus version to unblock IntelliJ build (#1958) | - | 1 | +1/-1 |
| 2025-07-14 | `c43c546` | [#2044](https://github.com/apache/polaris/pull/2044) | Fix CI (no 2) (#2044) | - | 1 | +8/-0 |
| 2025-07-14 | `e77a3a7` | [#2043](https://github.com/apache/polaris/pull/2043) | Fix CI (#2043) | - | 1 | +1/-0 |
| 2025-07-14 | `de351de` | [#2015](https://github.com/apache/polaris/pull/2015) | Introduce RealmConfig (#2015) | ``` ctx.getPolarisCallContext()    .getConfigurationStore()    .getConfiguration(ctx.getRealmContext(), "ALLOW_WILDCARD_LOCATION", false)) ``` since a `PolarisConfigurationStore` cant be used witho... | 51 | +365/-429 |
| 2025-07-14 | `ad77bd9` | [#1928](https://github.com/apache/polaris/pull/1928) | feat(ci): Improve Gradle cache in CI (#1928) | - | 6 | +219/-1 |
| 2025-07-13 | `6ddd148` | [#2021](https://github.com/apache/polaris/pull/2021) | Make StorageCredentialCache safe for mutli-realm usage (#2021) | Similarly `StorageCredentialCacheKey` having a `@Nullable callContext` makes it more difficult to reason about. Instead we can determine all realm-specific values at the time of insertion (from the... | 11 | +83/-87 |
| 2025-07-12 | `493bc8e` | [#2041](https://github.com/apache/polaris/pull/2041) | Fix invalid redirect from public page (#2041) | - | 1 | +1/-1 |
| 2025-07-12 | `bb93edd` | [#1939](https://github.com/apache/polaris/pull/1939) | Fix the LICENSE and NOTICE with the latest dependency updates (#1939) | - | 6 | +477/-396 |
| 2025-07-11 | `4f57506` | [#2038](https://github.com/apache/polaris/pull/2038) | Using the closer.lua download script (#2038) | - | 4 | +6/-6 |
| 2025-07-11 | `7c2909c` | [#2036](https://github.com/apache/polaris/pull/2036) | Fix gralde command for helm image and remove simple-values.yaml (#2036) | - | 4 | +0/-33 |
| 2025-07-11 | `afc1201` | [#2037](https://github.com/apache/polaris/pull/2037) | [Site] Update release-guide.md for release dir name (#2037) | - | 1 | +7/-7 |
| 2025-07-11 | `2db2f10` | [#2033](https://github.com/apache/polaris/pull/2033) | [Site] Simplify the doc directory structure (#2033) | - | 30 | +168/-228 |
| 2025-07-11 | `c8b5036` | [#2035](https://github.com/apache/polaris/pull/2035) | Update release-guide.md for publishing docs (#2035) | - | 1 | +7/-7 |
| 2025-07-11 | `6f51d81` | [#2034](https://github.com/apache/polaris/pull/2034) | Sync helm doc (#2034) | - | 1 | +12/-6 |
| 2025-07-11 | `d5f661e` | [#2028](https://github.com/apache/polaris/pull/2028) | Remove kind (#2028) | * Remove k8 dir from check-md-link.yml | 7 | +2/-232 |
| 2025-07-11 | `3019a5c` | [#2002](https://github.com/apache/polaris/pull/2002) | Helm key grouping and test cases (#2002) | * Update README.md * Added backwards compatible * Fix conflict * Use coalesce instead of if else | 4 | +169/-14 |
| 2025-07-11 | `bed1ac5` | [#2026](https://github.com/apache/polaris/pull/2026) | Use the 0.9.0 doc from the versioned-docs branch (#2026) | - | 11 | +7/-2260 |
| 2025-07-11 | `15f23ca` | [#2007](https://github.com/apache/polaris/pull/2007) | Make PolarisConfiguration member variables private (#2007) | * Make methods final | 10 | +57/-45 |
| 2025-07-10 | `ccc97bf` | [#2014](https://github.com/apache/polaris/pull/2014) | Publish helm doc (#2014) | - | 3 | +424/-40 |
| 2025-07-10 | `f3996fe` | [#2025](https://github.com/apache/polaris/pull/2025) | Add Helm Chart repo to the downloads page (#2025) | - | 1 | +3/-1 |
| 2025-07-10 | `3b06a80` | [#1995](https://github.com/apache/polaris/pull/1995) | Update Makefile for python client with auto setup (#1995) | - | 7 | +212/-124 |
| 2025-07-10 | `19f44d8` | [#2023](https://github.com/apache/polaris/pull/2023) | Remove duplicate MetaStoreManagerFactory mocks (#2023) | - | 4 | +29/-151 |
| 2025-07-09 | `33d9940` | [#1991](https://github.com/apache/polaris/pull/1991) | Improve the bundle jar license and notice remove using exclude (#1991) | - | 5 | +65/-115 |
| 2025-07-09 | `fae17a0` | [#2020](https://github.com/apache/polaris/pull/2020) | Add 1.0.0 docs to the huge menu (#2020) | - | 4 | +6/-3 |
| 2025-07-09 | `1b5549d` | [#2018](https://github.com/apache/polaris/pull/2018) | Add 1.0.0-incubating release to the downloads page (#2018) | - | 3 | +47/-37 |
| 2025-07-09 | `c103ab5` | [#2011](https://github.com/apache/polaris/pull/2011) | Restructure the download page (#2011) | - | 4 | +67/-37 |
| 2025-07-09 | `a0e31b0` | [#2005](https://github.com/apache/polaris/pull/2005) | Fix bunch of OpenAPI generation issues (#2005) | * Changes to any of the source spec files requires a Gradle `clean`, otherwise old generated Java source will remain - i.e. "no longer" existing sources are not removed. This is addressed by adding... | 5 | +97/-41 |
| 2025-07-09 | `f80b4f3` | [#2008](https://github.com/apache/polaris/pull/2008) | Cleanup collaborators in `.asf.yaml` (#2008) | - | 1 | +2/-4 |
| 2025-07-08 | `bd83252` | [#1966](https://github.com/apache/polaris/pull/1966) | Introduce an option to add object storage prefix to table locations (#1966) | Currently, Polaris enforces that the physical layout of entities maps to the logical layout: ``` catalog └── ns1     ├── ns2     │   └── table_b     └── table_a ``` In the above example, the base l... | 12 | +589/-62 |
| 2025-07-08 | `b96461a` | [#2000](https://github.com/apache/polaris/pull/2000) | feat(auth): Ability to override active roles provider per realm (#2000) | * deprecate old property * add tests | 6 | +141/-3 |
| 2025-07-08 | `145ad3e` | [#2001](https://github.com/apache/polaris/pull/2001) | Fix helm doc (#2001) | * Remove persistent ref * Remove persistent ref * Fixes based on feedback * Fixes based on feedback * Fixes based on feedback * Fixes based on feedback | 8 | +213/-372 |
| 2025-07-07 | `daf4476` | [#1925](https://github.com/apache/polaris/pull/1925) | Support IMPLICIT authentication type for federated catalogs (#1925) | The `IMPLICIT` option is guarded by the `SUPPORTED_EXTERNAL_CATALOG_AUTHENTICATION_TYPES`. Hence users may create federated catalogs with `IMPLICIT` authentication only when the administrator expli... | 7 | +165/-28 |
| 2025-07-07 | `d962c64` | [#1998](https://github.com/apache/polaris/pull/1998) | Update CatalogEntity::Builder to set default CatalogType as INTERNAL (#1998) | Testing: Updated CatalogEntityTest to ensure that the default is set to `INTERNAL`. | 2 | +74/-6 |
| 2025-07-07 | `1ce77e9` | [#2004](https://github.com/apache/polaris/pull/2004) | OpenAPI-generate: Omit generation timestamp (#2004) | - | 4 | +4/-0 |
| 2025-07-04 | `f099d60` | [#1999](https://github.com/apache/polaris/pull/1999) | Ignore regenerate.sh on README.md (#1999) | - | 1 | +4/-4 |
| 2025-07-04 | `95d1eac` | [#1913](https://github.com/apache/polaris/pull/1913) | feat: Support customizing S3 endpoints (#1913) | Introduce a dedicated interface for `StsClient` suppliers and implement it using a pool of cached clients. All client are "thin" and share the same `SdkHttpClient`. The latter is closed when the se... | 25 | +1261/-22 |
| 2025-07-03 | `8fa6bf2` | [#1988](https://github.com/apache/polaris/pull/1988) | Materialize Realm ID for Session Supplier in JDBC (#1988) | As a result, if any work is being done outside the scope of the request, such as during a Task, any calls to getOrCreateSessionSupplier for creating a BasePersistence implementation will fail as th... | 1 | +9/-7 |
| 2025-07-03 | `7f3b781` | [#1982](https://github.com/apache/polaris/pull/1982) | Remove unnecessary `InputStream.close` call (#1982) | - | 1 | +8/-15 |
| 2025-07-03 | `c5907e6` | [#1997](https://github.com/apache/polaris/pull/1997) | Add regression test coverage for Spark Client with package conf (#1997) | - | 5 | +81/-38 |
| 2025-07-04 | `9cb71f8` | [#1996](https://github.com/apache/polaris/pull/1996) | Refactor relationalJdbc in helm (#1996) | - | 5 | +177/-168 |
| 2025-07-02 | `1120b79` | [#1993](https://github.com/apache/polaris/pull/1993) | Add doc for repair option (#1993) | - | 1 | +6/-0 |
| 2025-07-02 | `b0c85e3` | [#1992](https://github.com/apache/polaris/pull/1992) | Improve createPrincipal example in API docs (#1992) | . . . This PR attempts to fix this by adding an explicit example to the spec. | 1 | +6/-0 |
| 2025-07-02 | `5edb7cb` | [#1994](https://github.com/apache/polaris/pull/1994) | Fix doc for CLI update (#1994) | - | 1 | +10/-5 |
| 2025-07-02 | `2a1070f` | [#1985](https://github.com/apache/polaris/pull/1985) | Add a Spark session builder for the tests (#1985) | - | 4 | +236/-91 |
| 2025-07-03 | `bdcc26f` | [#1987](https://github.com/apache/polaris/pull/1987) | fix: Remove db-kind in helm chart (#1987) | - | 4 | +1/-9 |
| 2025-07-01 | `eb6b6ad` | [#1912](https://github.com/apache/polaris/pull/1912) | Add support for catalog federation in the CLI (#1912) | - | 17 | +570/-649 |
| 2025-07-02 | `108989d` | [#1983](https://github.com/apache/polaris/pull/1983) | Fix doc to remove outdated note about fine-grained access controls support (#1983) | 1. Remove the misleading section on privileges can only be granted at catalog level. I've tested the fine-grained access controls and confirmed that privileges can be applied to an individual table... | 1 | +0/-4 |
| 2025-06-30 | `35cc9b6` | [#1926](https://github.com/apache/polaris/pull/1926) | Fix the sign failure (#1926) | - | 1 | +3/-0 |
| 2025-06-30 | `a385268` | [#1932](https://github.com/apache/polaris/pull/1932) | Added support for `s3a` scheme (#1932) | - | 11 | +537/-49 |
| 2025-06-30 | `44d52d4` | [#1942](https://github.com/apache/polaris/pull/1942) | Add options to the bootstrap command to specify a schema file (#1942) | - | 9 | +237/-58 |
| 2025-06-30 | `9c0d209` | [#1972](https://github.com/apache/polaris/pull/1972) | Add additional unit and integration tests for etag functionality (#1972) | * Added a few corner case IT tests for testing etags with schema changes. * Added IT tests to test changes after DDL and DML | 2 | +631/-0 |
| 2025-06-30 | `41558ae` | [#1979](https://github.com/apache/polaris/pull/1979) | Add OpenHFT in Spark plugin LICENSE (#1979) | - | 1 | +8/-0 |
| 2025-06-30 | `595e689` | [#1955](https://github.com/apache/polaris/pull/1955) | Do not serialize null properties in the management model (#1955) | * This may have an impact on existing client, but it is not   likely to be substantial because normally absent properties   should be treated the same as having `null` values. * This change enables... | 2 | +4/-6 |
| 2025-06-30 | `e920a1d` | [#1975](https://github.com/apache/polaris/pull/1975) | Correct javadoc text in generateOverlapQuery() (#1975) | * Correct javadoc text in generateOverlapQuery() | 1 | +4/-4 |
| 2025-06-30 | `39226aa` | [#1978](https://github.com/apache/polaris/pull/1978) | Share Polaris Community Meeting for 2025-06-26 (#1978) | - | 1 | +7/-3 |
| 2025-06-30 | `ed008e4` | [#1952](https://github.com/apache/polaris/pull/1952) | Add CHANGELOG (#1952) | * Add the Jetbrains Changelog Gradle plugin to help managing CHANGELOG.md | 4 | +94/-0 |
| 2025-06-30 | `d410e9c` | [#1937](https://github.com/apache/polaris/pull/1937) | Add relational-jdbc to helm (#1937) | Polaris needs to support relational-jdbc as the default persistence type for simpler database configuration and better cloud-native deployment experience. Description of the Status Quo (Current Beh... | 7 | +68/-36 |
| 2025-06-28 | `f6ae855` | [#1927](https://github.com/apache/polaris/pull/1927) | Update release-guide.md (#1927) | - | 1 | +16/-10 |
| 2025-06-28 | `eda1a32` | [#1977](https://github.com/apache/polaris/pull/1977) | Fix admin tool doc (#1977) | * Fix admin tool doc | 1 | +6/-7 |
| 2025-06-27 | `438d06c` | [#1934](https://github.com/apache/polaris/pull/1934) | test(integration): refactor PolarisRestCatalogIntegrationTest to run against any cloud provider (#1934) | - | 17 | +348/-203 |
| 2025-06-27 | `8784135` | [#1954](https://github.com/apache/polaris/pull/1954) | Python code format (#1954) | - | 12 | +1212/-575 |
| 2025-06-27 | `c5a4f73` | [#1969](https://github.com/apache/polaris/pull/1969) | fix: Typo in Spark Client Build File (#1969) | - | 1 | +1/-1 |
| 2025-06-27 | `863817c` | [#1968](https://github.com/apache/polaris/pull/1968) | Adds missing Google Flatbuffers license information (#1968) | - | 1 | +8/-0 |
| 2025-06-27 | `7c40e9d` | [#1956](https://github.com/apache/polaris/pull/1956) | Add Sushant as a collaborator (#1956) | - | 1 | +1/-0 |
| 2025-06-27 | `c004728` | [#1950](https://github.com/apache/polaris/pull/1950) | fix: Only include project LICENSE and NOTICE in Spark Client Jar (#1950) | - | 1 | +89/-8 |
| 2025-06-27 | `9ff2ca1` | [#1596](https://github.com/apache/polaris/pull/1596) | Mutable objects used for immutable values (#1596) | - | 20 | +648/-504 |
| 2025-06-27 | `a4992ca` | [#1953](https://github.com/apache/polaris/pull/1953) | Fix lint rules (#1953) | - | 6 | +8/-10 |
| 2025-06-27 | `30acee6` | [#1967](https://github.com/apache/polaris/pull/1967) | Fix hugo blockquote (#1967) | * Add license header | 20 | +142/-88 |
| 2025-06-27 | `7d03992` | [#1964](https://github.com/apache/polaris/pull/1964) | Fix invalid sample script in CLI doc (#1964) | - | 1 | +2/-5 |
| 2025-06-26 | `303bc92` | [#1961](https://github.com/apache/polaris/pull/1961) | Use multi-lines instead of single line (#1961) | - | 1 | +5/-3 |
| 2025-06-26 | `90153aa` | [#1962](https://github.com/apache/polaris/pull/1962) | Remove the maintainer list in Helm Chart README (#1962) | - | 2 | +1/-9 |
| 2025-06-26 | `fa36aa3` | [#1957](https://github.com/apache/polaris/pull/1957) | Update Helm chart version (#1957) | - | 3 | +5/-3 |
| 2025-06-26 | `96b8be3` | [#1931](https://github.com/apache/polaris/pull/1931) | Add SUPPORTED_EXTERNAL_CATALOG_AUTHENTICATION_TYPES feature configuration (#1931) | * Add unit tests | 4 | +295/-18 |
| 2025-06-26 | `1e69373` | [#1686](https://github.com/apache/polaris/pull/1686) | Optimize the location overlap check with an index (#1686) | <hr> ### Current Behavior The current logic is that when we create a table, we list all sibling tables and check each and every one to ensure there is no location overlap. This results in O(N^2) ch... | 30 | +863/-95 |
| 2025-06-26 | `c667b3a` | [#1951](https://github.com/apache/polaris/pull/1951) | Fix doc for sample log and default password (#1951) | 1. update sample output to reflect with the latest code 2. update default password to the right value 3. remove trailing space | 1 | +8/-8 |
| 2025-06-26 | `3fea897` | [#1949](https://github.com/apache/polaris/pull/1949) | Fix NPE in listCatalogs (#1949) | I don't think it's ever useful for listCatalogsUnsafe to return null since the caller isn't expecting a certain length of elements, so I just filtered it there. | 2 | +83/-5 |
| 2025-06-26 | `e7a009f` | [#1894](https://github.com/apache/polaris/pull/1894) | fix(build): Fix deprecation warnings in FeatureConfiguration (#1894) | - | 1 | +8/-0 |
| 2025-06-25 | `d51beed` | [#1945](https://github.com/apache/polaris/pull/1945) | Fix admin tool for quick start (#1945) | This issue occurs because `quarkus.datasource.db-kind`is a build-time property in Quarkus. Its value must be defined during the application's build process to enable the datasource extension and ge... | 5 | +1/-5 |
| 2025-06-25 | `9a32d25` | [#1941](https://github.com/apache/polaris/pull/1941) | Simplify install dependency doc (#1941) | * Simply install dependecy doc * Minor words change | 1 | +5/-3 |
| 2025-06-25 | `1dc990c` | [#1946](https://github.com/apache/polaris/pull/1946) | Update doc to fix docker build inconsistency issue (#1946) | - | 1 | +3/-2 |
| 2025-06-25 | `22eaff4` | [#1849](https://github.com/apache/polaris/pull/1849) | Fix Pagination for Catalog Federation (#1849) | - | 5 | +272/-20 |
| 2025-06-25 | `031419f` | [#1935](https://github.com/apache/polaris/pull/1935) | enable ETag integration tests (#1935) | - | 1 | +0/-10 |
| 2025-06-24 | `7a086fc` | [#1933](https://github.com/apache/polaris/pull/1933) | Exclude unused dependency for polaris spark client dependency (#1933) | - | 1 | +1/-11 |
| 2025-06-24 | `9b5325b` | [#1918](https://github.com/apache/polaris/pull/1918) | Testing: admin-tool testing workaround (#1918) | - | 12 | +109/-15 |
| 2025-06-23 | `93938fd` | [#1908](https://github.com/apache/polaris/pull/1908) | Update spark client to use the shaded iceberg-core in iceberg-spark-runtime to avoid spark compatibilities issue (#1908) | * add comment * update change * add comment * add change * add tests * add comment * clean up style check * update build * Revert "Reuse shadowJar for spark client bundle jar maven publish (#1857)"... | 21 | +961/-81 |
| 2025-06-23 | `fe81542` | [#1922](https://github.com/apache/polaris/pull/1922) | fix(build): Gradle caching effectively not working (#1922) | We also already have a errorprone rule, so we can get rid entirely of the spotless step. | 1 | +0/-16 |
| 2025-06-22 | `f5871c5` | [#1857](https://github.com/apache/polaris/pull/1857) | Revert "Reuse shadowJar for spark client bundle jar maven publish (#1857)" (#1921) | This reverts commit 1f7f127536a088911bf940addd1d05c07ff99a68. The shadowJar plugin actually stops publish the original jar, which is not what spark client intend to publish for the --package usage.... | 4 | +12/-26 |
| 2025-06-20 | `5745ae1` | [#1919](https://github.com/apache/polaris/pull/1919) | Add doc for rollback config (#1919) | - | 1 | +39/-38 |
| 2025-06-21 | `cd59302` | [#1905](https://github.com/apache/polaris/pull/1905) | fix: unify bootstrap credentials and standardize POLARIS setup (#1905) | - reverted secret to s3cr3t - updated docker-compose, README, conftest.py use POLARIS for consistency across docker, gradle and others. | 13 | +20/-20 |
| 2025-06-20 | `793cf08` | [#1285](https://github.com/apache/polaris/pull/1285) | Feature: Rollback compaction on conflict (#1285) | Presently the rest catalog client creates the snapshot and asks the Rest Server to apply the snapshot and gives this in a combination of requirement and update. Polaris could apply some basic infer... | 3 | +636/-23 |
| 2025-06-20 | `7bb0f93` | [#1797](https://github.com/apache/polaris/pull/1797) | main: Update Quarkus Platform and Group to v3.23.3 (#1797) | * Adopt polaris-admin test invocation --------- Co-authored-by: Robert Stupp <snazy@snazy.de> | 2 | +4/-1 |
| 2025-06-19 | `9fd13c4` | [#1911](https://github.com/apache/polaris/pull/1911) | fix(ci): Remove dummy "build" job from Gradle CI (#1911) | - | 1 | +0/-10 |
| 2025-06-18 | `1f7f127` | [#1857](https://github.com/apache/polaris/pull/1857) | Reuse shadowJar for spark client bundle jar maven publish (#1857) | * fix test failure and address feedback * fix error * update regression test * update classifier name * address comment * add change * update doc * update build and readme * add back jr * udpate de... | 4 | +26/-12 |
| 2025-06-18 | `45df8ac` | [#1840](https://github.com/apache/polaris/pull/1840) | Improve the parsing and validation of UserSecretReferenceUrns (#1840) | Main changes: - Create a helper to parse, validate and build the URN strings.  - Use Regex instead of `String.split()`. - Add Precondition checks to ensure that the URN is valid and the UserSecretM... | 4 | +213/-16 |
| 2025-06-18 | `48e7e88` | [#1889](https://github.com/apache/polaris/pull/1889) | Add webpage for Generic Table support (#1889) | * add comment * address feedback * update limitations * update docs * update doc * address feedback | 1 | +169/-0 |
| 2025-06-18 | `5441bb6` | [#1897](https://github.com/apache/polaris/pull/1897) | feat(ci): Split Java Gradle CI in many jobs to reduce execution time (#1897) | - | 2 | +65/-29 |
| 2025-06-18 | `0e8367b` | [#1890](https://github.com/apache/polaris/pull/1890) | docs: Add `Polaris Evolution` page (#1890) | Co-authored-by: Eric Maynard <emaynard@apache.org> | 2 | +120/-0 |
| 2025-06-17 | `fccc51a` | [#1906](https://github.com/apache/polaris/pull/1906) | Rename runtime/test-commons to runtime/test-common (for consistency with module name) (#1906) | - | 4 | +1/-1 |
| 2025-06-17 | `ab228af` | [#1695](https://github.com/apache/polaris/pull/1695) | Rename quarkus as runtime (#1695) | - | 212 | +137/-137 |
| 2025-06-17 | `c15e62b` | [#1902](https://github.com/apache/polaris/pull/1902) | Remove `.github/CODEOWNERS` (#1902) | - | 1 | +0/-20 |
| 2025-06-16 | `5a188b2` | [#1903](https://github.com/apache/polaris/pull/1903) | Python CI: pin mypy version to avoid CI failure due to new release (#1903) | ```  \| Unable to find installation candidates for mypy (1.16.1)     \|      \| This is likely not a Poetry issue.     \|      \|   - 14 candidate(s) were identified for the package     \|   - 14 w... | 1 | +1/-1 |
| 2025-06-16 | `f38ac8a` | [#1880](https://github.com/apache/polaris/pull/1880) | feat(build): Add Checkstyle plugin and an IllegalImport rule (#1880) | - | 6 | +73/-46 |
| 2025-06-14 | `2d3d0d0` | - | Do not use relative path inside CLI script | Fixes #1868 | 1 | +2/-2 |
| 2025-06-14 | `751f8a7` | [#1892](https://github.com/apache/polaris/pull/1892) | Add Polaris community meeting record for 2025-06-12 (#1892) | - | 1 | +8/-4 |
| 2025-06-13 | `5aefa18` | [#1891](https://github.com/apache/polaris/pull/1891) | Enable patch version updates for maintained Polaris version (#1891) | Therefore, this change enables patch-version updates for Polaris 1.* | 1 | +4/-1 |
| 2025-06-13 | `a683de3` | [#1895](https://github.com/apache/polaris/pull/1895) | fix(build): Fix deprecation warnings in PolarisIntegrationTestExtension (#1895) | - | 1 | +2/-3 |
| 2025-06-13 | `eb38bf4` | [#1886](https://github.com/apache/polaris/pull/1886) | main: Update dependency boto3 to v1.38.36 (#1886) | - | 1 | +1/-1 |
| 2025-06-13 | `8fc81f3` | [#1887](https://github.com/apache/polaris/pull/1887) | main: Update registry.access.redhat.com/ubi9/openjdk-21-runtime Docker tag to v1.22-1.1749462970 (#1887) | - | 2 | +2/-2 |
| 2025-06-13 | `36005ab` | [#1888](https://github.com/apache/polaris/pull/1888) | main: Update dependency io.smallrye.config:smallrye-config-core to v3.13.2 (#1888) | - | 1 | +1/-1 |
| 2025-06-12 | `01b7322` | [#1876](https://github.com/apache/polaris/pull/1876) | Avoid using org.testcontainers.shaded.** (#1876) | - | 8 | +9/-6 |
| 2025-06-12 | `ea47367` | [#1879](https://github.com/apache/polaris/pull/1879) | Fix two wrong links in README.md (#1879) | - | 1 | +4/-4 |
| 2025-06-12 | `2a2bcde` | [#1843](https://github.com/apache/polaris/pull/1843) | JDBC: Refactor DatabaseOps (#1843) | * wraps the bootstrap in a transaction ! * refactor Production Readiness checks for Postgres | 5 | +71/-64 |
| 2025-06-12 | `7899d93` | - | Bump version in version.txt | - | 1 | +1/-1 |
| 2025-06-12 | `a8a78c4` | [#1878](https://github.com/apache/polaris/pull/1878) | Cleanup unnecessary files in client/python (#1878) | - | 429 | +45/-39207 |
| 2025-06-12 | `0faf948` | [#1831](https://github.com/apache/polaris/pull/1831) | Removing star import and adding errorprone rule (#1831) | - | 13 | +47/-12 |
| 2025-06-12 | `9463a61` | [#1874](https://github.com/apache/polaris/pull/1874) | main: Update dependency boto3 to v1.38.35 (#1874) | - | 1 | +1/-1 |
| 2025-06-12 | `a12bf26` | [#1877](https://github.com/apache/polaris/pull/1877) | main: Update gradle/actions digest to ac638b0 (#1877) | - | 2 | +2/-2 |
| 2025-06-11 | `2dfdac3` | [#1873](https://github.com/apache/polaris/pull/1873) | Fix telemetry quickstart example for 1.0 release (#1873) | - | 2 | +15/-6 |
| 2025-06-11 | `3958ded` | [#1810](https://github.com/apache/polaris/pull/1810) | Remove generated Python client from git tracking (#1810) | - | 233 | +14/-58614 |
| 2025-06-11 | `5ea964b` | [#1870](https://github.com/apache/polaris/pull/1870) | Enhance EclipseLink quickstart (#1870) | 2. Update the name of `eclipselink-trino-1` to `polaris-trino-1` 3. make the polaris server url consistent with using `localhost` to avoid failures | 2 | +10/-11 |
| 2025-06-11 | `8942f68` | [#1858](https://github.com/apache/polaris/pull/1858) | Remove PolarisConfiguration.loadConfig (v2) (#1858) | - | 35 | +221/-135 |
| 2025-06-11 | `6db498a` | [#1872](https://github.com/apache/polaris/pull/1872) | Update JDBC Getting-started example's README.md to use localhost for curl commands (#1872) | - | 1 | +3/-4 |
| 2025-06-11 | `6b57d12` | [#1856](https://github.com/apache/polaris/pull/1856) | Add integration tests to Python Client (#1856) | - | 10 | +791/-4 |
| 2025-06-11 | `97c9440` | [#1855](https://github.com/apache/polaris/pull/1855) | Update LICENSE for binary distributions (#1855) | - | 6 | +214/-214 |
| 2025-06-11 | `6cd6558` | [#1543](https://github.com/apache/polaris/pull/1543) | [SPEC] Add base-location keyword for GenericTable API (#1543) | - | 5 | +42/-15 |
| 2025-06-11 | `66b6d9e` | [#1859](https://github.com/apache/polaris/pull/1859) | main: Update dependency org.postgresql:postgresql to v42.7.7 (#1859) | - | 1 | +1/-1 |
| 2025-06-11 | `3e4954c` | [#1852](https://github.com/apache/polaris/pull/1852) | main: Update dependency boto3 to v1.38.34 (#1852) | - | 1 | +1/-1 |
| 2025-06-11 | `3d1d149` | [#1850](https://github.com/apache/polaris/pull/1850) | main: Update dependency io.opentelemetry.semconv:opentelemetry-semconv to v1.34.0 (#1850) | - | 1 | +1/-1 |
| 2025-06-11 | `edcf9aa` | [#1853](https://github.com/apache/polaris/pull/1853) | main: Update docker.io/jaegertracing/all-in-one Docker tag to v1.70.0 (#1853) | - | 1 | +1/-1 |
| 2025-06-10 | `e2ab322` | - | Add Yun Zou as the new committer | - | 2 | +1/-2 |
| 2025-06-10 | `21bd498` | [#1851](https://github.com/apache/polaris/pull/1851) | Update LICENCE (#1851) | - | 1 | +0/-2 |
| 2025-06-10 | `af1643c` | [#1839](https://github.com/apache/polaris/pull/1839) | Update spark client license (#1839) | - | 1 | +0/-2 |
| 2025-06-10 | `9470d0d` | [#1846](https://github.com/apache/polaris/pull/1846) | docs: fix broken 'Polaris Overview' link in README.md (#1846) | Co-authored-by: Joy Haldar <Joy.Haldar@target.com> | 1 | +1/-1 |
| 2025-06-10 | `0f800ee` | [#1845](https://github.com/apache/polaris/pull/1845) | main: Update dependency io.projectreactor.netty:reactor-netty-http to v1.2.7 (#1845) | - | 1 | +1/-1 |
| 2025-06-10 | `9934fc4` | [#1841](https://github.com/apache/polaris/pull/1841) | main: Update dependency boto3 to v1.38.33 (#1841) | - | 1 | +1/-1 |
| 2025-06-10 | `2f1d6bb` | [#1842](https://github.com/apache/polaris/pull/1842) | main: Update dependency io.micrometer:micrometer-bom to v1.15.1 (#1842) | - | 1 | +1/-1 |
| 2025-06-09 | `5c8c429` | [#1834](https://github.com/apache/polaris/pull/1834) | Fix LICENSE and NOTICE in Spark plugin (#1834) | - | 5 | +862/-149 |
| 2025-06-09 | `dcd68db` | [#1837](https://github.com/apache/polaris/pull/1837) | Fix the issue where the Polaris Server exposes backend metadata in the error response body when the database is not bootstrapped. (#1837) | - | 2 | +3/-2 |
| 2025-06-09 | `dccf676` | [#1835](https://github.com/apache/polaris/pull/1835) | main: Update dependency software.amazon.awssdk:bom to v2.31.59 (#1835) | - | 1 | +1/-1 |
| 2025-06-09 | `86c6fac` | [#1836](https://github.com/apache/polaris/pull/1836) | main: Update dependency com.github.ben-manes.caffeine:caffeine to v3.2.1 (#1836) | - | 1 | +1/-1 |
| 2025-06-08 | `a9ad720` | [#1827](https://github.com/apache/polaris/pull/1827) | Core: Fix  maxCode generation for ConnectionTypeEnum (#1827) | - | 1 | +1/-4 |
| 2025-06-08 | `9fbcf8d` | [#1833](https://github.com/apache/polaris/pull/1833) | Update versions in LICENSE and NOTICE (#1833) | - | 6 | +240/-240 |
| 2025-06-07 | `be3fee8` | [#1830](https://github.com/apache/polaris/pull/1830) | Spark: Add license and notice to spark client jar and push jar to maven (#1830) | - | 8 | +360/-11 |
| 2025-06-07 | `c10b9be` | [#1829](https://github.com/apache/polaris/pull/1829) | main: Update dependency io.opentelemetry:opentelemetry-bom to v1.51.0 (#1829) | - | 1 | +1/-1 |
| 2025-06-07 | `71f9bb4` | [#1828](https://github.com/apache/polaris/pull/1828) | main: Update dependency boto3 to v1.38.32 (#1828) | - | 1 | +1/-1 |
| 2025-06-07 | `27c4037` | [#1832](https://github.com/apache/polaris/pull/1832) | main: Update dependency org.junit:junit-bom to v5.13.1 (#1832) | - | 1 | +1/-1 |
| 2025-06-07 | `b3a4299` | [#1678](https://github.com/apache/polaris/pull/1678) | Remove "unused" files in client/python (#1678) | - | 5 | +0/-146 |
| 2025-06-06 | `f393a1d` | [#1802](https://github.com/apache/polaris/pull/1802) | JDBC: Use PreparedStatement (#1802) | - | 13 | +620/-374 |
| 2025-06-06 | `1655dae` | [#1826](https://github.com/apache/polaris/pull/1826) | main: Update dependency io.smallrye.config:smallrye-config-core to v3.13.1 (#1826) | - | 1 | +1/-1 |
| 2025-06-06 | `e91d2c3` | [#1823](https://github.com/apache/polaris/pull/1823) | Downgrade open api generator to 7.11 (#1823) | - | 16 | +99/-290 |
| 2025-06-06 | `5509353` | [#1803](https://github.com/apache/polaris/pull/1803) | main: Update dependency boto3 to v1.38.31 (#1803) | - | 1 | +1/-1 |
| 2025-06-06 | `8945291` | [#1809](https://github.com/apache/polaris/pull/1809) | main: Pin actions/setup-java action to c5195ef (#1809) | - | 1 | +1/-1 |
| 2025-06-06 | `b573735` | [#1811](https://github.com/apache/polaris/pull/1811) | main: Update dependency com.google.cloud:google-cloud-storage-bom to v2.53.0 (#1811) | - | 1 | +1/-1 |
| 2025-06-06 | `9d201b4` | [#1819](https://github.com/apache/polaris/pull/1819) | main: Update dependency io.netty:netty-codec-http2 to v4.2.2.Final (#1819) | - | 1 | +1/-1 |
| 2025-06-06 | `553b644` | [#1820](https://github.com/apache/polaris/pull/1820) | main: Update dependency gradle to v8.14.2 (#1820) | * adjust to Polaris build --------- Co-authored-by: Dmitri Bourlatchkov <dmitri.bourlatchkov@dremio.com> | 1 | +2/-2 |
| 2025-06-05 | `3185adf` | [#1783](https://github.com/apache/polaris/pull/1783) | Refactor getConfiguration to use RealmContext (Part 2) (#1783) | - | 7 | +24/-110 |
| 2025-06-05 | `187d700` | [#1816](https://github.com/apache/polaris/pull/1816) | Turn CallContext.copyOf into an interface instead of static function (#1816) | - | 5 | +27/-60 |
| 2025-06-04 | `a59942a` | [#1815](https://github.com/apache/polaris/pull/1815) | Remove CallContext.getDiagnostics (#1815) | - | 1 | +0/-5 |
| 2025-06-04 | `511df8c` | [#1812](https://github.com/apache/polaris/pull/1812) | Remove CallContext.of (#1812) | - | 15 | +71/-110 |
| 2025-06-04 | `5132312` | [#1813](https://github.com/apache/polaris/pull/1813) | Remove deprecated constructor for PolarisCallContext (#1813) | This PR removes the usage of the old constructors. | 28 | +55/-36 |
| 2025-06-04 | `3b18e0d` | [#1675](https://github.com/apache/polaris/pull/1675) | Automate regeneration of Python client (#1675) | As part of this change, I've also updated the generator to 7.12 to match what's in the `libs.version.toml` and regenerated the code managed in github. Once the automatic generation works as part of... | 93 | +1446/-685 |
| 2025-06-04 | `0a8d8b8` | [#1806](https://github.com/apache/polaris/pull/1806) | Core: Consolidate CallContext with PolarisCallContext part 1(#1806) | - | 6 | +74/-30 |
| 2025-06-03 | `da0ceff` | [#1804](https://github.com/apache/polaris/pull/1804) | Don't rotate root's credentials on startup in JdbcMetaStoreManagerFactory (#1804) | - | 1 | +7/-18 |
| 2025-06-03 | `65cb39e` | [#1654](https://github.com/apache/polaris/pull/1654) | Update ascii banner (#1654) | - | 1 | +21/-20 |
| 2025-06-03 | `d9397a5` | [#1800](https://github.com/apache/polaris/pull/1800) | Test: silence CDS warning from admin tool tests (#1800) | - | 1 | +6/-0 |
| 2025-06-03 | `2a71098` | [#1784](https://github.com/apache/polaris/pull/1784) | Remove the unused field in CallContextCatalogFactory (#1784) | - | 2 | +10/-9 |
| 2025-06-03 | `0a9a5d9` | [#1776](https://github.com/apache/polaris/pull/1776) | feat(cdi): Remove CallContext.close() (#1776) | This simplification will hopefully pave the way to a more robust handling of request-scoped beans in task executor threads. | 12 | +470/-607 |
| 2025-06-03 | `90c2580` | [#1791](https://github.com/apache/polaris/pull/1791) | main: Update apache/spark Docker tag to v3.5.6 (#1791) | - | 2 | +2/-2 |
| 2025-06-03 | `0379ecf` | [#1794](https://github.com/apache/polaris/pull/1794) | main: Update dependency org.apache.spark:spark-sql_2.12 to v3.5.6 (#1794) | - | 1 | +1/-1 |
| 2025-06-03 | `535d69e` | [#1795](https://github.com/apache/polaris/pull/1795) | main: Update docker.io/apache/spark Docker tag to v3.5.6 (#1795) | - | 2 | +2/-2 |
| 2025-06-03 | `a1b2ae7` | [#1752](https://github.com/apache/polaris/pull/1752) | main: Update dependency org.apache.spark:spark-sql_2.12 to v3.5.6 (#1752) | - | 1 | +1/-1 |
| 2025-06-03 | `79a182c` | [#1769](https://github.com/apache/polaris/pull/1769) | main: Update dependency software.amazon.awssdk:bom to v2.31.54 (#1769) | - | 1 | +1/-1 |
| 2025-06-03 | `a827d26` | [#1786](https://github.com/apache/polaris/pull/1786) | Run renovatebot only on the main branch (#1786) | - | 1 | +1/-1 |
| 2025-06-03 | `d9edb23` | [#1777](https://github.com/apache/polaris/pull/1777) | main: Update dependency boto3 to v1.38.28 (#1777) | - | 1 | +1/-1 |
| 2025-06-03 | `5c2dcca` | [#1710](https://github.com/apache/polaris/pull/1710) | main: Update dependency pytest to v8 (#1710) | - | 1 | +1/-1 |
| 2025-06-03 | `980011e` | [#1701](https://github.com/apache/polaris/pull/1701) | main: Pin dependencies (#1701) | - | 8 | +19/-19 |
| 2025-06-02 | `4528db1` | [#1781](https://github.com/apache/polaris/pull/1781) | JDBC: Fix getting started config (#1781) | - | 1 | +1/-1 |
| 2025-06-02 | `5fe9fd9` | [#1780](https://github.com/apache/polaris/pull/1780) | Replace getConfiguration usage with PolarisCallContext to use RealmContext (PART 1) (#1780) | - | 18 | +88/-79 |
| 2025-06-02 | `8f906a6` | [#1778](https://github.com/apache/polaris/pull/1778) | Re-add missing parameters to create_table python API (#1778) | ``` redocly bundle spec/polaris-catalog-service.yaml -o spec/generated/bundled-polaris-catalog-service.yaml ./gradlew regeneratePythonClient ``` Then, some manual reverts: ``` alias gitrevert='git ... | 4 | +40/-2 |
| 2025-06-02 | `dd987b6` | [#1724](https://github.com/apache/polaris/pull/1724) | Restructure the directory and package name for persistence modules (#1724) | - | 41 | +38/-38 |
| 2025-06-02 | `dd2fdf9` | [#1758](https://github.com/apache/polaris/pull/1758) | Handle RequestScoped instance injection gracefully for DefaultConfigurationStore (#1758) | This actually fails the TaskExecutor because it runs in a separate thread. In order to fix the problem, we introduces a new getConfiguration function to handle the background tasks, and also use is... | 5 | +99/-23 |
| 2025-06-02 | `9c09e03` | [#1774](https://github.com/apache/polaris/pull/1774) | Add unit test for legacy config lookup (#1774) | - | 1 | +38/-0 |
| 2025-06-02 | `23f6480` | [#1773](https://github.com/apache/polaris/pull/1773) | Testing: silence a bunch of harmless test warnings (#1773) | * Hibernate Validator cannot instrument static methods (`Hibernate Validator does not support constraints on static methods yet. ...`) * ForkJoinPool test lifecycle warning * Couple of split-packag... | 3 | +21/-0 |
| 2025-06-02 | `4a7fbaa` | [#1767](https://github.com/apache/polaris/pull/1767) | main: Update docker.io/prom/prometheus Docker tag to v3.4.1 (#1767) | - | 1 | +1/-1 |
| 2025-06-02 | `f158f2e` | [#1320](https://github.com/apache/polaris/pull/1320) | Unblock test `createViewWithCustomMetadataLocation` (#1320) | * Add missing properties during table/view creation | 2 | +84/-8 |
| 2025-06-02 | `7f97a95` | [#1766](https://github.com/apache/polaris/pull/1766) | Use canonical catalog property names in tests (#1766) | * In `PolarisRestCatalogIntegrationTest` Following up to #1557 | 2 | +8/-8 |
| 2025-06-02 | `370b74c` | [#1768](https://github.com/apache/polaris/pull/1768) | Fix regression test docker setup for purge (#1768) | - | 2 | +6/-4 |
| 2025-06-02 | `b7aac72` | [#1714](https://github.com/apache/polaris/pull/1714) | main: Update dependency boto3 to v1.38.27 (#1714) | - | 1 | +1/-1 |
| 2025-05-30 | `7b985e2` | [#1751](https://github.com/apache/polaris/pull/1751) | Regenerate bundled spec & Regenerate Python client (#1751) | ``` redocly bundle spec/polaris-catalog-service.yaml -o spec/generated/bundled-polaris-catalog-service.yaml ./gradlew regeneratePythonClient ``` I didn't realize before that some Python types are g... | 44 | +1743/-170 |
| 2025-05-30 | `f1a521e` | [#1759](https://github.com/apache/polaris/pull/1759) | Fix test_spark_credentials_s3_exception_on_metadata_file_deletion (#1759) | - | 1 | +8/-5 |
| 2025-05-30 | `0bb062e` | [#1763](https://github.com/apache/polaris/pull/1763) | fix: Improve reliability of metrics tests (#1763) | in the reported metrics. This looks like a race between the Quarkus metrics producer and the tests asking for these metrics. This change adds a time-limited retry loop until the expected metrics ar... | 1 | +20/-4 |
| 2025-05-30 | `39189cd` | [#1748](https://github.com/apache/polaris/pull/1748) | main: Update dependency org.testcontainers:testcontainers-bom to v1.21.1 (#1748) | - | 1 | +1/-1 |
| 2025-05-30 | `bc2c0eb` | [#1760](https://github.com/apache/polaris/pull/1760) | main: Update dependency org.junit:junit-bom to v5.13.0 (#1760) | - | 1 | +1/-1 |
| 2025-05-29 | `59ab382` | - | Fixes for direct usage of client_secret #1756 | - | 3 | +12/-12 |
| 2025-05-29 | `81798f1` | [#1707](https://github.com/apache/polaris/pull/1707) | Production readiness for Persistence (#1707) | - | 4 | +70/-8 |
| 2025-05-29 | `721614a` | [#1749](https://github.com/apache/polaris/pull/1749) | Remove unused adminDocs artifact (#1749) | - | 2 | +0/-20 |
| 2025-05-29 | `046fa70` | [#1693](https://github.com/apache/polaris/pull/1693) | Fix a failing task with the release profile (#1693) | - | 1 | +15/-7 |
| 2025-05-29 | `56d1609` | [#1694](https://github.com/apache/polaris/pull/1694) | Create LICENSE and NOTICE for "single" distribution (#1694) | - | 7 | +3107/-177 |
| 2025-05-28 | `ce3efe6` | [#1718](https://github.com/apache/polaris/pull/1718) | Merge JPA module with EclipseLink Module (#1718) | - | 21 | +64/-100 |
| 2025-05-28 | `a0436f0` | [#1661](https://github.com/apache/polaris/pull/1661) | Keep generated RSA-key-pair for JWT token broker on heap (#1661) | However, if only `polaris.authentication.token-broker.type=rsa-key-pair` but not the `public/private-key-pair` options are configured, Polaris generates those and stores them in `/tmp` using random... | 7 | +151/-62 |
| 2025-05-28 | `f7d7f58` | [#1702](https://github.com/apache/polaris/pull/1702) | main: Update dependency boto3 to v1.38.24 (#1702) | - | 1 | +1/-1 |
| 2025-05-28 | `f7f4c80` | [#1705](https://github.com/apache/polaris/pull/1705) | main: Update dependency com.adobe.testing:s3mock-testcontainers to v4.4.0 (#1705) | - | 1 | +1/-1 |
| 2025-05-28 | `8aab26d` | [#1703](https://github.com/apache/polaris/pull/1703) | main: Update dependency com.azure:azure-sdk-bom to v1.2.35 (#1703) | - | 1 | +1/-1 |
| 2025-05-28 | `f16f50b` | [#1625](https://github.com/apache/polaris/pull/1625) | Site/contributing: add recommendations for working with PRs (#1625) | Also adopt `gradlew test` to `gradlew check` in README, following the intent (all tests, incl ITs) | 2 | +52/-24 |
| 2025-05-28 | `97d16d3` | [#1662](https://github.com/apache/polaris/pull/1662) | feat(metrics): Mitigate potential performance issues with realm_id tag (#1662) | They are both disabled by default. There is also a new safeguard: if the cardinality of realm IDs in HTTP metrics goes above a configurable threshold (100 by default), a warning is printed and no m... | 10 | +296/-89 |
| 2025-05-28 | `f93e347` | [#1698](https://github.com/apache/polaris/pull/1698) | main: Update medyagh/setup-minikube action to v0.0.19 (#1698) | - | 1 | +1/-1 |
| 2025-05-28 | `258f088` | [#1696](https://github.com/apache/polaris/pull/1696) | main: Update gradle/actions digest to 8379f6a (#1696) | - | 1 | +1/-1 |
| 2025-05-28 | `5518a0f` | [#1700](https://github.com/apache/polaris/pull/1700) | main: Update helm/chart-testing-action action to v2.7.0 (#1700) | - | 1 | +1/-1 |
| 2025-05-28 | `9b8c647` | [#1697](https://github.com/apache/polaris/pull/1697) | main: Update dependency org.postgresql:postgresql to v42.7.6 (#1697) | - | 1 | +1/-1 |
| 2025-05-28 | `493de03` | [#1690](https://github.com/apache/polaris/pull/1690) | main: Update dependency com.diffplug.spotless:spotless-plugin-gradle to v7.0.4 (#1690) | - | 1 | +1/-1 |
| 2025-05-28 | `3b9d2b0` | [#1682](https://github.com/apache/polaris/pull/1682) | Fix credentials printing twice (#1682) | - | 3 | +6/-34 |
| 2025-05-27 | `7961fdd` | [#1688](https://github.com/apache/polaris/pull/1688) | Fix the manual test broken by PR #1532 (#1688) | - | 1 | +7/-1 |
| 2025-05-27 | `408389f` | [#1687](https://github.com/apache/polaris/pull/1687) | Fix getting-started docker start by PR #1532 (#1687) | - | 3 | +7/-1 |
| 2025-05-27 | `d8c8920` | [#1665](https://github.com/apache/polaris/pull/1665) | Improve test coverage for invalid inputs in Policy APIs (#1665) | - | 1 | +254/-0 |
| 2025-05-27 | `ef7cefe` | [#1604](https://github.com/apache/polaris/pull/1604) | Remove Java URI validations for Blob Storage providers (#1604) | Java URI does not actually apply any normalization to URIs if we do not call URI.normalize() (which we currently do not). Additionally, blob storage providers like S3 and GCS can provide ".." and "... | 2 | +50/-5 |
| 2025-05-27 | `5750f4e` | [#1673](https://github.com/apache/polaris/pull/1673) | fix(quickstart): Correct Quickstart Instructions (#1673) | - | 8 | +31/-31 |
| 2025-05-27 | `9001785` | [#1589](https://github.com/apache/polaris/pull/1589) | Create a single binary distribution bundle (#1589) | - | 11 | +274/-308 |
| 2025-05-27 | `e5bc87e` | [#1672](https://github.com/apache/polaris/pull/1672) | fix: Remove info log about deprecated internal method from PolarisConfiguration (#1672) | Phasing out old property names requires coordination with users (e.g. release notes), so it is not a matter of merely avoiding calls to that method in Polaris code. Fixes #1666 | 1 | +2/-1 |
| 2025-05-27 | `c11c1b1` | - | Fix SparkClient listGenericTable to use ListGenericTablesRESTResponse | - | 1 | +5/-5 |
| 2025-05-27 | `0a484bb` | [#1681](https://github.com/apache/polaris/pull/1681) | fix: Remove duplicated code in IcebergCatalog (#1681) | - | 1 | +0/-8 |
| 2025-05-26 | `6ef8b3e` | [#1679](https://github.com/apache/polaris/pull/1679) | main: Update dependency io.prometheus:prometheus-metrics-exporter-servlet-jakarta to v1.3.8 (#1679) | - | 1 | +1/-1 |
| 2025-05-26 | `acd2ad3` | [#1664](https://github.com/apache/polaris/pull/1664) | feat(build): make archive builds reproducible (#1664) | - | 1 | +7/-0 |
| 2025-05-26 | `b77244f` | [#1667](https://github.com/apache/polaris/pull/1667) | main: Update dependency boto3 to v1.38.23 (#1667) | - | 1 | +1/-1 |
| 2025-05-26 | `3e1021d` | [#1677](https://github.com/apache/polaris/pull/1677) | main: Update dependency software.amazon.awssdk:bom to v2.31.50 (#1677) | - | 1 | +1/-1 |
| 2025-05-25 | `4ec850e` | [#1668](https://github.com/apache/polaris/pull/1668) | main: Update dependency pytest to ~=7.4.4 (#1668) | - | 1 | +1/-1 |
| 2025-05-25 | `a2bc9d3` | [#1669](https://github.com/apache/polaris/pull/1669) | main: Update python Docker tag to v3.13 (#1669) | - | 1 | +5/-5 |
| 2025-05-25 | `c770ed5` | [#1670](https://github.com/apache/polaris/pull/1670) | main: Update actions/checkout action to v4 (#1670) | - | 1 | +1/-1 |
| 2025-05-25 | `b2a2cd4` | [#1671](https://github.com/apache/polaris/pull/1671) | main: Update actions/setup-python action to v5 (#1671) | - | 1 | +1/-1 |
| 2025-05-23 | `1631da0` | [#1639](https://github.com/apache/polaris/pull/1639) | [Python Client] CI for Python client (Continue PR#1096) (#1639) | - | 1 | +70/-0 |
| 2025-05-23 | `af26732` | [#1347](https://github.com/apache/polaris/pull/1347) | Create a wrapper script to generate python client; regenerate the python client (#1347) | I've also run the script, which necessitated several things to get tests passing: 1. There were small nonfunctional spec changes needed in order to keep the Python client working 2. The CLI and its... | 638 | +32824/-2386 |
| 2025-05-23 | `6e6da48` | [#1663](https://github.com/apache/polaris/pull/1663) | fix and enforce more errorprone checks (#1663) | https://errorprone.info/bugpattern/ObjectsHashCodePrimitive https://errorprone.info/bugpattern/OptionalMapToOptional https://errorprone.info/bugpattern/StringCharset https://errorprone.info/bugpatt... | 5 | +20/-19 |
| 2025-05-23 | `0bdc3f4` | [#1629](https://github.com/apache/polaris/pull/1629) | Refactor: Use per-request STS credentials (#1629) | No functional changes. This is mostly to allow more storage integration flexibility in downstream build. This might also be useful for non-AWS storage. | 6 | +73/-27 |
| 2025-05-23 | `463682f` | [#1659](https://github.com/apache/polaris/pull/1659) | Refactor IcebergCatalog to isolate internal state (#1659) | * Restore `private` scope on internal fields in `IcebergCatalog` * Use a test-only setter instead of sub-classing to manage injecting   test FileIO implementations | 2 | +19/-82 |
| 2025-05-23 | `c969812` | [#1657](https://github.com/apache/polaris/pull/1657) | main: Update dependency boto3 to v1.38.22 (#1657) | - | 1 | +1/-1 |
| 2025-05-23 | `0eafcaa` | [#1610](https://github.com/apache/polaris/pull/1610) | Fix quickstart doc with docker compose (#1610) | - | 11 | +55/-36 |
| 2025-05-22 | `5e4a6f0` | [#1643](https://github.com/apache/polaris/pull/1643) | Add CATALOG_MANAGE_METADATA to super privilege set of policy attachment privileges (#1643) | - | 2 | +22/-8 |
| 2025-05-23 | `a106f4e` | [#1641](https://github.com/apache/polaris/pull/1641) | fix(testing): Do not let PolarisOverlappingTableTest spam `/tmp` (#1641) | - | 1 | +9/-2 |
| 2025-05-23 | `c9e0202` | [#1651](https://github.com/apache/polaris/pull/1651) | fix(test): Do not let some more tests spam `/tmp` (#1651) | * `PolarisRestCatalogViewFileIntegrationTest` * `FileIOExceptionsTest` * `PolarisRestCatalogViewFileIntegrationTest` Changes the tests to leverage JUnit's `@TempDir`. Simplifies `PolarisEclipseLink... | 7 | +36/-34 |
| 2025-05-22 | `a534193` | [#1628](https://github.com/apache/polaris/pull/1628) | [Policy Store] Add policyTypeCode to Slice/Index for Future Filtering Support and Update Policy Persistence Method (#1628) | It also updates the loadAllTargetsOnPolicy method to accept policyTypeCode, enabling it to use the new index for better performance. | 13 | +131/-60 |
| 2025-05-22 | `01836d2` | [#1652](https://github.com/apache/polaris/pull/1652) | main: Update dependency gradle to v8.14.1 (#1652) | * Re-adopt PR to the project's needs --------- Co-authored-by: Robert Stupp <snazy@snazy.de> | 1 | +2/-2 |
| 2025-05-22 | `d619bf3` | [#1646](https://github.com/apache/polaris/pull/1646) | [HOTFIX] QUICKSTART (#1646) | [1] ENV variables required by common assets after #1522  [2] New configs required to enable FILE based sources #1649 Co-authored-by: singhpk234 <singhpk234@users.noreply.github.com> Co-authored-by:... | 3 | +26/-12 |
| 2025-05-22 | `b72214a` | [#1648](https://github.com/apache/polaris/pull/1648) | Use echo to print script errors (#1648) | - | 1 | +2/-2 |
| 2025-05-22 | `13e3fa3` | [#1637](https://github.com/apache/polaris/pull/1637) | main: Update dependency io.smallrye.config:smallrye-config-core to v3.13.0 (#1637) | - | 1 | +1/-1 |
| 2025-05-22 | `d8b862b` | [#1635](https://github.com/apache/polaris/pull/1635) | fix(nightly-CI): Do not publish snapshots from forks (#1635) | - | 1 | +1/-0 |
| 2025-05-22 | `b3bbede` | [#1636](https://github.com/apache/polaris/pull/1636) | fix(CI): Resolve ambiguous `regtests` GH WF job name (#1636) | - | 2 | +2/-1 |
| 2025-05-22 | `b54d95d` | [#1644](https://github.com/apache/polaris/pull/1644) | main: Update dependency boto3 to v1.38.21 (#1644) | - | 1 | +1/-1 |
| 2025-05-22 | `d8d3daa` | [#1645](https://github.com/apache/polaris/pull/1645) | main: Update dependency org.mockito:mockito-junit-jupiter to v5.18.0 (#1645) | - | 1 | +1/-1 |
| 2025-05-22 | `ae7afcf` | [#1632](https://github.com/apache/polaris/pull/1632) | Add DISCLAIMER in Helm chart, fix LICENSE and NOTICE regarding code coming from Project Nessie in Helm chart (#1632) | - | 3 | +36/-2 |
| 2025-05-21 | `d05674d` | [#1642](https://github.com/apache/polaris/pull/1642) | fix(metrics): Do not emit metrics for failed realm resolutions (#1642) | - | 1 | +1/-10 |
