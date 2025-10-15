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

import java.util.ArrayList;
import java.util.List;
import org.apache.polaris.core.PolarisCallContext;
import org.apache.polaris.core.context.CallContext;
import org.apache.polaris.core.context.RealmContext;
import org.apache.polaris.core.entity.AsyncTaskType;
import org.apache.polaris.core.entity.PolarisBaseEntity;
import org.apache.polaris.core.entity.PolarisEntityCore;
import org.apache.polaris.core.entity.PolarisEntitySubType;
import org.apache.polaris.core.entity.PolarisEntityType;
import org.apache.polaris.core.entity.TaskEntity;
import org.apache.polaris.core.persistence.MetaStoreManagerFactory;
import org.apache.polaris.core.persistence.PolarisMetaStoreManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Handler for cleaning up orphan entities after catalog deletion.
 *
 * <p>When a passthrough-facade catalog is deleted, it may leave behind synthetic JIT entities
 * (created for sub-catalog RBAC) that are now orphans - their parent catalog no longer exists.
 * This handler finds and removes all entities that belonged to the deleted catalog.
 *
 * <p>This task runs AFTER the catalog has been deleted, so the catalog entity itself won't exist.
 * We find orphans by looking for entities with catalogId matching the deleted catalog, then
 * construct synthetic catalog paths to allow proper deletion through dropEntityIfExists.
 */
public class OrphanEntityCleanupTaskHandler implements TaskHandler {
  private static final Logger LOGGER =
      LoggerFactory.getLogger(OrphanEntityCleanupTaskHandler.class);

  private final MetaStoreManagerFactory metaStoreManagerFactory;

  public OrphanEntityCleanupTaskHandler(MetaStoreManagerFactory metaStoreManagerFactory) {
    this.metaStoreManagerFactory = metaStoreManagerFactory;
  }

  @Override
  public boolean canHandleTask(TaskEntity task) {
    return task.getTaskType() == AsyncTaskType.ORPHAN_ENTITY_CLEANUP;
  }

  @Override
  public boolean handleTask(TaskEntity task, CallContext callContext) {
    long catalogId = task.readData(Long.class);
    RealmContext realmContext = callContext.getRealmContext();
    PolarisMetaStoreManager metaStoreManager =
        metaStoreManagerFactory.getOrCreateMetaStoreManager(realmContext);
    PolarisCallContext polarisCallContext = callContext.getPolarisCallContext();

    LOGGER
        .atInfo()
        .addKeyValue("taskId", task.getId())
        .addKeyValue("catalogId", catalogId)
        .log("Starting orphan entity cleanup for deleted catalog");

    // The catalog has been deleted. We need to find all orphan entities (those with this catalogId)
    // and delete them. The challenge is that dropEntityIfExists requires a catalogPath.
    
    // Since the catalog is already deleted, we need to create a synthetic catalog entity
    // to use in the catalog path for resolution
    var catalogResult =
        metaStoreManager.loadEntity(polarisCallContext, 0L, catalogId, PolarisEntityType.CATALOG);
    
    PolarisEntityCore syntheticCatalog;
    if (!catalogResult.isSuccess() || catalogResult.getEntity() == null) {
      // Catalog is already fully purged - create a minimal synthetic one
      LOGGER
          .atInfo()
          .addKeyValue("catalogId", catalogId)
          .log("Catalog already purged, creating synthetic catalog for path resolution");
      
      syntheticCatalog =
          new PolarisEntityCore.Builder<>()
              .id(catalogId)
              .catalogId(0L)
              .parentId(0L)
              .name("__deleted_catalog_" + catalogId + "__")
              .typeCode(PolarisEntityType.CATALOG.getCode())
              .build();
    } else {
      // Catalog still exists (marked as dropped but not yet purged)
      syntheticCatalog = new PolarisEntityCore.Builder<>(catalogResult.getEntity()).build();
    }

    int totalOrphansRemoved = 0;

    // Find all entities with this catalogId - they are all orphans now
    // Process in order: FILE → TABLE_LIKE → POLICY → NAMESPACE (leaf to root)
    PolarisEntityType[] entityTypes = {
      PolarisEntityType.FILE,
      PolarisEntityType.TABLE_LIKE,
      PolarisEntityType.POLICY,
      PolarisEntityType.NAMESPACE
    };

    for (PolarisEntityType entityType : entityTypes) {
      int removed =
          cleanupOrphanEntitiesOfType(
              polarisCallContext, metaStoreManager, syntheticCatalog, entityType);
      totalOrphansRemoved += removed;

      LOGGER
          .atInfo()
          .addKeyValue("catalogId", catalogId)
          .addKeyValue("entityType", entityType)
          .addKeyValue("removedCount", removed)
          .log("Cleaned up orphan entities of type");
    }

    LOGGER
        .atInfo()
        .addKeyValue("catalogId", catalogId)
        .addKeyValue("totalOrphansRemoved", totalOrphansRemoved)
        .log("Orphan entity cleanup completed");

    return true;
  }

  /**
   * Clean up all orphan entities of a specific type that belonged to the deleted catalog.
   *
   * @param callCtx Polaris call context
   * @param metaStoreManager MetaStore manager
   * @param syntheticCatalog Synthetic catalog entity for path resolution
   * @param entityType Type of entities to clean up
   * @return Number of entities removed
   */
  private int cleanupOrphanEntitiesOfType(
      PolarisCallContext callCtx,
      PolarisMetaStoreManager metaStoreManager,
      PolarisEntityCore syntheticCatalog,
      PolarisEntityType entityType) {

    int removedCount = 0;
    long catalogId = syntheticCatalog.getId();

    try {
      // Load all entities of this type at catalog level (parentId = catalogId)
      // For orphan entities, we can't traverse the full hierarchy since parents might not exist
      // So we load entities directly by catalogId
      List<PolarisBaseEntity> catalogLevelEntities =
          metaStoreManager.loadEntitiesAll(
              callCtx,
              List.of(syntheticCatalog), // Catalog path for resolution
              entityType,
              PolarisEntitySubType.ANY_SUBTYPE);

      if (catalogLevelEntities == null || catalogLevelEntities.isEmpty()) {
        return 0;
      }

      LOGGER
          .atDebug()
          .addKeyValue("catalogId", catalogId)
          .addKeyValue("entityType", entityType)
          .addKeyValue("entityCount", catalogLevelEntities.size())
          .log("Found entities at catalog level");

      // Delete each orphan entity
      for (PolarisBaseEntity orphan : catalogLevelEntities) {
        if (tryDeleteOrphanEntity(callCtx, metaStoreManager, syntheticCatalog, orphan)) {
          removedCount++;
        }
      }

    } catch (Exception e) {
      LOGGER
          .atError()
          .addKeyValue("catalogId", catalogId)
          .addKeyValue("entityType", entityType)
          .log("Error cleaning up orphan entities", e);
    }

    return removedCount;
  }

  /**
   * Attempt to delete an orphan entity by constructing a synthetic catalog path.
   *
   * <p>For orphan entities, we need to construct the full path from catalog down to the entity. 
   * Since the catalog is deleted, we use a synthetic catalog. For nested entities (like tables in
   * namespaces), we need to reconstruct the namespace path as well.
   *
   * @param callCtx Polaris call context
   * @param metaStoreManager MetaStore manager
   * @param syntheticCatalog Synthetic catalog for path resolution
   * @param entity The orphan entity to delete
   * @return true if deletion succeeded
   */
  private boolean tryDeleteOrphanEntity(
      PolarisCallContext callCtx,
      PolarisMetaStoreManager metaStoreManager,
      PolarisEntityCore syntheticCatalog,
      PolarisBaseEntity entity) {

    try {
      // Build catalog path for this entity
      // The path must include all ancestors: catalog -> namespaces -> entity
      List<PolarisEntityCore> catalogPath = buildCatalogPath(callCtx, metaStoreManager, syntheticCatalog, entity);
      
      LOGGER
          .atDebug()
          .addKeyValue("entityType", entity.getType())
          .addKeyValue("entityId", entity.getId())
          .addKeyValue("entityName", entity.getName())
          .addKeyValue("catalogId", entity.getCatalogId())
          .addKeyValue("parentId", entity.getParentId())
          .addKeyValue("pathLength", catalogPath.size())
          .log("Attempting to delete orphan entity");

      // Attempt to drop the entity
      var dropResult = metaStoreManager.dropEntityIfExists(callCtx, catalogPath, entity, null, false);

      if (dropResult != null && dropResult.isSuccess()) {
        LOGGER
            .atInfo()
            .addKeyValue("entityType", entity.getType())
            .addKeyValue("entityId", entity.getId())
            .addKeyValue("entityName", entity.getName())
            .addKeyValue("catalogId", entity.getCatalogId())
            .log("Successfully deleted orphan entity");
        return true;
      } else {
        LOGGER
            .atWarn()
            .addKeyValue("entityType", entity.getType())
            .addKeyValue("entityId", entity.getId())
            .addKeyValue("entityName", entity.getName())
            .addKeyValue("catalogId", entity.getCatalogId())
            .addKeyValue("returnStatus", dropResult != null ? dropResult.getReturnStatus() : "null")
            .log("Failed to delete orphan entity");
        return false;
      }
    } catch (Exception e) {
      LOGGER
          .atError()
          .addKeyValue("entityType", entity.getType())
          .addKeyValue("entityId", entity.getId())
          .addKeyValue("entityName", entity.getName())
          .addKeyValue("catalogId", entity.getCatalogId())
          .log("Exception while deleting orphan entity", e);
      return false;
    }
  }

  /**
   * Build a synthetic catalog path for an orphan entity.
   *
   * <p>This walks up the parent chain from the entity to the catalog, loading each ancestor
   * and constructing the path. If any parent is missing (entity is truly orphaned), we create
   * a synthetic placeholder.
   *
   * @param callCtx Polaris call context
   * @param metaStoreManager MetaStore manager
   * @param syntheticCatalog The catalog entity (synthetic or real)
   * @param entity The entity to build path for
   * @return List of entities from catalog down to (but not including) the target entity
   */
  private List<PolarisEntityCore> buildCatalogPath(
      PolarisCallContext callCtx,
      PolarisMetaStoreManager metaStoreManager,
      PolarisEntityCore syntheticCatalog,
      PolarisBaseEntity entity) {

    List<PolarisEntityCore> path = new ArrayList<>();
    path.add(syntheticCatalog);

    // If entity's parent is the catalog itself, we're done
    if (entity.getParentId() == syntheticCatalog.getId()) {
      return path;
    }

    // Walk up the parent chain to build the full path
    long currentParentId = entity.getParentId();
    List<PolarisEntityCore> ancestors = new ArrayList<>();

    while (currentParentId != syntheticCatalog.getId() && currentParentId != 0) {
      // Try to load the parent entity
      var parentResult =
          metaStoreManager.loadEntity(callCtx, entity.getCatalogId(), currentParentId, PolarisEntityType.NAMESPACE);

      if (!parentResult.isSuccess() || parentResult.getEntity() == null) {
        // Parent doesn't exist - create a synthetic one
        LOGGER
            .atWarn()
            .addKeyValue("entityId", entity.getId())
            .addKeyValue("missingParentId", currentParentId)
            .log("Parent entity not found, creating synthetic parent");

        PolarisEntityCore syntheticParent =
            new PolarisEntityCore.Builder<>()
                .id(currentParentId)
                .catalogId(entity.getCatalogId())
                .parentId(syntheticCatalog.getId()) // Assume direct child of catalog
                .name("__deleted_namespace_" + currentParentId + "__")
                .typeCode(PolarisEntityType.NAMESPACE.getCode())
                .build();
        ancestors.add(0, syntheticParent);
        break; // Stop here since we don't know the real hierarchy
      } else {
        PolarisEntityCore parent = new PolarisEntityCore.Builder<>(parentResult.getEntity()).build();
        ancestors.add(0, parent);
        currentParentId = parent.getParentId();
      }
    }

    // Add all ancestors to the path
    path.addAll(ancestors);
    return path;
  }
}
