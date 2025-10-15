# Polaris Case-Insensitive Catalog Proposal

## Overview
Open table formats such as Apache Iceberg expose catalogs that hold a variety of named
entities (namespaces, tables, views, policies, etc.). Each query engine that consumes an
Iceberg catalog applies its own normalization rules when persisting or resolving these
identifiers. ANSI SQL offers guidance, but the practical differences between engines remain
significant, forcing end users to understand and account for every engine-specific casing rule
before they can reliably share Iceberg data across platforms.

The Polaris REST catalog currently preserves the casing that clients send for every identifier.
As a result, identifiers that differ only by case are treated as distinct (for example,
`NS1.employee` and `NS1.EMPLOYEE` are considered different tables). This behavior mirrors what
Spark sends today, but it conflicts with engines like Trino and Flink that normalize casing
before they talk to a catalog. Because Apache Iceberg's REST specification is silent on the
subject, each catalog implementation must choose its own approach and the portability burden
falls on end users.

## Current Polaris Behavior
* Polaris stores identifiers exactly as they are provided by the client.
* All Iceberg entities that Polaris manages (namespaces, tables, views, generic tables, and
  policies) follow this convention.
* Column names are not touched by the catalog: they are stored inside Iceberg table metadata
  files that Polaris treats as opaque payloads.

## Problem Statement
Different engines normalize identifiers differently before they issue REST catalog calls:

| Engine | ANSI compliant? | Identifier persistence behavior | Column identifier behavior |
| --- | --- | --- | --- |
| Flink (Calcite) | Yes | Persists upper-case identifiers into Iceberg metadata unless delimited | Delimited identifiers remain significant |
| Trino | Mostly (does not upper-case) | Lower-cases all identifiers before catalog calls | No support for delimited identifiers (proposal in flight) |
| Spark | No | Persists exactly what the user provides | Case-insensitive resolution for columns, case-sensitive for tables |
| Hive | No | Lower-cases unquoted identifiers and lacks quoted identifier support | Same as table behavior |
| PostgreSQL | No | Case-sensitive identifiers by default | Same as table behavior |
| AWS Glue REST catalog | No | Normalizes database and table identifiers to lower-case | Column names are also normalized to lower-case when tables are managed through the REST facade |

A few concrete examples highlight the inconsistency:

* Spark creates `CREATE TABLE NS1.Employee (...) USING ICEBERG`. Spark sends
  `NS1.Employee` to Polaris. Because Polaris preserves casing, the catalog stores
  `NS1.Employee`. When Trino later issues `SELECT * FROM NS1.Employee`, Trino
  lower-cases the identifier before invoking `loadTable`, so Polaris receives
  `ns1.employee` and returns `NotFoundException`. Trino therefore cannot read tables
  whose names contain upper-case characters from Polaris.
* Flink creates `CREATE TABLE NS1.Employee (...) USING ICEBERG` (without quoting).
  Flink normalizes the identifier to `NS1.EMPLOYEE` in the Iceberg metadata, so Polaris stores
  the upper-case variant. Spark users must then reference `NS1.EMPLOYEE` exactly when querying
  the table, which breaks expectations around Spark's default case sensitivity mode.

As more engines interact with a shared Polaris-backed catalog, the burden on end users grows.
They must remember how each engine normalizes identifiers and, worse, avoid creating tables that
only differ by case even if the catalog allows it. The ecosystem would work better if every
engine exposed a mode switch that aligned casing semantics, but that is not the situation today.

## Goals
* Provide a catalog-level configuration that removes casing friction for all identifiers that
  Polaris manages.
* Prevent future identifier collisions that differ only by case when the catalog operates in a
  case-insensitive mode.
* Preserve backwards compatibility by making the new behavior opt-in for existing catalogs.

## Non-Goals
* Changing Iceberg's REST specification.
* Automatically rewriting existing table metadata or Iceberg manifests.
* Enforcing column-level case-insensitive semantics (see "Column Handling" below).
* Adjusting catalog role identifiers (catalog roles remain case-sensitive).

## Proposed Catalog Behavior
Introduce an immutable catalog creation property:

| Property | Default | Description | Notes |
| --- | --- | --- | --- |
| `allow_case_sensitive_identifier` | `true` | When `false`, Polaris automatically normalizes all catalog-scoped identifiers to lower-case before persistence and lookups. | Immutable; applies to all internal catalogs. |

When `allow_case_sensitive_identifier=false` the catalog enforces the following:

* Every identifier received through REST (namespace, table, view, generic table, policy, and
  future catalog-owned entities such as volumes) is normalized to lower-case before lookups or
  persistence.
* Case-insensitive uniqueness is enforced during creation and rename operations.
* Namespace hierarchies, access control resolution, and notification dispatch continue to work
  by delegating to the normalized representation.
* Case-sensitive catalogs continue to function exactly as they do today when the property is
  left at its default value.

### Catalog Types
* **Internal catalogs**: The property is honored directly by the Polaris service and affects the
  canonical copy of identifiers in the metastore.
* **External catalogs (static facade)**: Polaris normalizes identifiers before translating them to
  the underlying external catalog. The facade must reject collisions that only differ by case
  because the normalized identifiers would overlap. Notifications target this catalog type because
  Polaris maintains the shadow copy of metadata locally.
* **External catalogs (passthrough facade)**: Polaris normalizes identifiers only for catalog-scoped
  actions that it mediates (e.g., access checks, metadata caching). Actual reads and writes are
  delegated to the external catalog, so callers must ensure the external catalog behaves
  consistently with the configured case-sensitivity mode. Federated catalogs fall into this bucket;
  they inherit identifier rules from the remote catalog and ignore Polaris notifications.

## Column Handling
The catalog property governs only identifiers that Polaris owns. Column names are persisted inside
Iceberg metadata files and do not flow through the catalog for generic tables. We considered four
options:

1. **Enforce no casing conflicts but preserve user-provided casing**: Reject schemas that contain
   conflicting columns such as `col1` and `COL1`, without modifying the payload. This requires
   additional validation in schema ingestion paths (create, commit, register, notifications).
2. **Lower-case all column names**: Normalize column names across the board. This simplifies
   downstream consumption but is incompatible with registering existing tables or accepting
   metadata via notifications.
3. **Do nothing**: Document that case-insensitive catalog behavior does not extend to column names.
4. **Hybrid**: Normalize column names only when Polaris generates metadata (create/update) and
   validate for conflicts when ingesting existing metadata (register/notification).

Each option introduces trade-offs (validation complexity, compatibility with existing metadata,
loss of user-specified casing). For the initial version of the proposal we recommend Option 3 and
focus on catalog-scoped identifiers. Column-level case-insensitivity can be revisited separately
when we have agreement on the contract between Polaris and Iceberg metadata authors. AWS Glue's
REST catalog already normalizes both table and column names to lower-case, so Polaris users who
federate Glue catalogs into a case-insensitive Polaris catalog should not expect mixed-case column
identifiers to survive round-trips regardless of the option chosen above.

## Views and Derived Metadata
Iceberg views store their definition as SQL text in view metadata files rather than in Polaris'
metastore. Polaris can safely normalize view identifiers (catalog, namespace, and view name)
according to the catalog-level policy and leave the SQL definition untouched. Because Iceberg view
DDL already runs through the creating engine, we will document that view authors are responsible
for emitting SQL that is compatible with a case-insensitive catalog. When Polaris materializes or
returns view metadata it should normalize only the identifier wrapper and avoid rewriting the SQL
payload. This mirrors the current behavior of `IcebergCatalog#renameView` and the metadata contract
described in the upstream Iceberg view specification.

## Implementation Details
Two strategies are under consideration:

1. **Endpoint-level normalization (preferred)**
   * **Description**: Apply lower-casing in the REST handlers (`IcebergCatalogHandler`,
     `IcebergCatalogAdapter`, etc.) before resolving entities or delegating to the
     `PolarisMetaStoreManager`.
   * **Pros**:
     * Localized change in the request path; no schema change in the metastore layer.
     * Leverages existing entity resolution logic in `PolarisMetaStoreManager` without introducing
       alias metadata or migrations.
     * Keeps caching, authorization, and event listeners aligned because they already receive the
       canonical identifier from the handler.
   * **Cons**:
     * Requires a thorough audit of every entry point (e.g., load, create, rename, list) to ensure
       normalization occurs consistently.
     * Some lower-level utilities (e.g., `IcebergCatalog` inside the runtime service) may still need
       defensive checks to avoid double-normalization when invoked from other contexts.

2. **Alias-based lookup in the metastore manager**
   * **Description**: Extend `PolarisMetaStoreManager` and its relational implementations to persist
     a normalized alias alongside every entity, then resolve lookups via `loadByAlias` in addition to
     the current name-based APIs.
   * **Pros**:
     * Centralizes case-insensitivity guarantees inside the persistence layer.
     * Enables future scenarios where both the original and normalized identifiers are required.
   * **Cons**:
     * Introduces additional columns or tables to persist aliases and maintain uniqueness
       constraints, which affects migrations and potentially existing deployments.
     * Requires updates across all entity types, including non-Iceberg objects, and complicates
       cache invalidation logic (e.g., `PolarisMetastoreManagers` factories and
       `IcebergCatalogAdapter`).
     * Higher implementation and testing cost with minimal functional benefit over option 1.

Given these trade-offs, endpoint-level normalization (Option 1) is preferred for the first
iteration of case-insensitive catalogs.

### Scan Planning Semantics
The Iceberg REST scan-planning API exposes a `case-sensitive` flag that controls how the engine
interprets field names in filter and projection pushdown requests. The upstream specification
defaults this flag to `true` (case-sensitive matching). Polaris must reconcile this behavior with a
case-insensitive catalog:

* When `allow_case_sensitive_identifier=false`, Polaris should reject scan-planning requests that
  explicitly set `case-sensitive=true` or downgrade them with a warning, because lower-cased
  identifiers would otherwise fail to match the client-provided casing.
* When the flag is missing or `false`, Polaris can safely proceed because the client is already
  asking for case-insensitive resolution.
* Catalog telemetry should capture these rejections/warnings so operators can identify misaligned
  clients quickly.

## Compatibility and Migration
* Existing catalogs remain case-sensitive by default.
* New catalogs can opt into case-insensitive behavior at creation time. Because the property is
  immutable, administrators are encouraged to create dedicated catalogs for case-insensitive
  workloads rather than switching existing ones.
* If administrators choose to migrate an existing catalog, they must ensure that no identifiers
  currently stored differ only by case; otherwise, migration will fail and require manual cleanup.

## Observability and Telemetry
* Expose the effective case-sensitivity mode via catalog introspection APIs.
* Emit audit logs when identifiers are normalized (helpful when diagnosing engine misconfigurations).
* Capture metrics for conflict rejections triggered by the new behavior.

## Open Questions
* Should Polaris surface catalog-level capabilities (e.g., via `GET /config`) so engines can adapt
  their client behavior dynamically?
* How should we handle case-insensitive comparisons for path-based storage locations, especially
  on case-sensitive file systems?
* Are additional guardrails required for integrations that bypass REST (e.g., internal jobs that
  call `IcebergCatalog` directly)?

## Additional Findings
* `sendNotification` requests are only supported for external catalogs. The handler rejects calls
  against internal catalogs before delegating to implementations of `SupportsNotifications` (see
  `IcebergCatalogHandler#sendNotification`).
* External catalogs fall into two buckets: static facades (Polaris stores a shadow copy of Iceberg
  metadata) and passthrough facades (Polaris proxies requests to a remote REST endpoint). Federated
  catalogs correspond to the passthrough model and therefore inherit identifier semantics from the
  remote catalog. Case-insensitive normalization must run before proxying requests so that
  lower-cased aliases stay aligned with remote entity names (see `CatalogEntity#isPassthroughFacade`
  and `CatalogEntity#isStaticFacade`).
* Iceberg clients control case-sensitivity at call sites through parameters such as the
  `case-sensitive` flag in scan-planning and the `caseSensitive` boolean passed to catalog-level
  resolution APIs. We will recommend that engines set these flags to `false` when interacting with a
  case-insensitive Polaris catalog and add server-side validation to catch mismatches early.

## References
* AWS Glue Data Catalog case-sensitivity guidance: https://repost.aws/knowledge-center/glue-case-sensitivity
* Iceberg REST scan planning schema: `components/schemas/PlanTableScanRequest` in `spec/iceberg-rest-catalog-open-api.yaml`
* Polaris handler restrictions for notifications: `IcebergCatalogHandler#sendNotification`
* Catalog entity facade types: `CatalogEntity#isPassthroughFacade` and `CatalogEntity#isStaticFacade`

