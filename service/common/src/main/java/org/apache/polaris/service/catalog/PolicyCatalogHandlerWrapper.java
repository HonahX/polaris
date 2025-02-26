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
package org.apache.polaris.service.catalog;

import jakarta.annotation.Nonnull;
import jakarta.ws.rs.core.SecurityContext;
import java.util.*;
import java.util.stream.Collectors;
import org.apache.iceberg.catalog.Namespace;
import org.apache.iceberg.catalog.TableIdentifier;
import org.apache.iceberg.exceptions.*;
import org.apache.polaris.core.PolarisCallContext;
import org.apache.polaris.core.auth.AuthenticatedPolarisPrincipal;
import org.apache.polaris.core.auth.PolarisAuthorizableOperation;
import org.apache.polaris.core.auth.PolarisAuthorizer;
import org.apache.polaris.core.catalog.PolarisCatalogHelpers;
import org.apache.polaris.core.context.CallContext;
import org.apache.polaris.core.entity.*;
import org.apache.polaris.core.persistence.*;
import org.apache.polaris.core.persistence.resolver.PolarisResolutionManifest;
import org.apache.polaris.core.persistence.resolver.ResolverPath;
import org.apache.polaris.core.persistence.resolver.ResolverStatus;
import org.apache.polaris.core.policy.PolicyIdentifier;
import org.apache.polaris.core.policy.PolicyType;
import org.apache.polaris.core.policy.PolicyValidator;
import org.apache.polaris.core.policy.PolicyValidatorFactory;
import org.apache.polaris.service.types.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PolicyCatalogHandlerWrapper implements AutoCloseable {
  private static final Logger LOGGER = LoggerFactory.getLogger(PolicyCatalogHandlerWrapper.class);

  private final CallContext callContext;
  private final PolarisEntityManager entityManager;
  private final PolarisMetaStoreManager metaStoreManager;
  private final String catalogName;
  private final AuthenticatedPolarisPrincipal authenticatedPrincipal;
  private final SecurityContext securityContext;
  private final PolarisAuthorizer authorizer;

  // Initialized in the authorize methods.
  private PolarisResolutionManifest resolutionManifest = null;

  public PolicyCatalogHandlerWrapper(
      CallContext callContext,
      PolarisEntityManager entityManager,
      PolarisMetaStoreManager metaStoreManager,
      SecurityContext securityContext,
      String catalogName,
      PolarisAuthorizer authorizer) {
    this.callContext = callContext;
    this.entityManager = entityManager;
    this.metaStoreManager = metaStoreManager;
    this.catalogName = catalogName;
    this.securityContext = securityContext;
    this.authenticatedPrincipal =
        (AuthenticatedPolarisPrincipal) securityContext.getUserPrincipal();
    this.authorizer = authorizer;
  }

  @Override
  public void close() throws Exception {
    // TODO: nothing to close right now
  }

  // TODO: need to handle already exist case
  public LoadPolicyResult createPolicy(Namespace namespace, CreatePolicyRequest request) {
    // PolarisAuthorizableOperation op = PolarisAuthorizableOperation.
    PolarisAuthorizableOperation op = PolarisAuthorizableOperation.CREATE_POLICY;
    authorizeCreatePolicyUnderNamespaceOperationOrThrow(op, namespace, request.getName());

    // TODO: replace it with PolicyIdentifier
    PolicyIdentifier identifier = PolicyIdentifier.of(namespace, request.getName());

    PolarisResolvedPathWrapper resolvedPolicyEntities =
        resolutionManifest.getPassthroughResolvedPath(identifier);
    if (resolvedPolicyEntities != null
        && resolvedPolicyEntities.getRawLeafEntity().getType() != PolarisEntityType.POLICY) {
      // TODO: formalize this into getPassthroughResolvedPath
      throw new UnsupportedOperationException();
    }

    CatalogEntity catalogEntity =
        CatalogEntity.of(resolutionManifest.getResolvedReferenceCatalogEntity().getRawLeafEntity());

    // TODO: seems no need
    List<PolarisEntity> resolvedNamespace =
        resolvedPolicyEntities == null
            ? resolutionManifest.getResolvedPath(identifier.namespace()).getRawFullPath()
            : resolvedPolicyEntities.getRawParentPath();

    PolicyEntity entity =
        PolicyEntity.of(
            resolvedPolicyEntities == null ? null : resolvedPolicyEntities.getRawLeafEntity());

    if (null == entity) {
      // TODO: validate content
      PolicyType policyType = PolicyType.fromName(request.getType());
      if (policyType == null) {
        // TODO: custom policy type not yet suported
        throw new BadRequestException("Unknown policy type: %s", request.getType());
      }

      PolicyValidator policyValidator = PolicyValidatorFactory.loadValidator(policyType);
      if (policyValidator == null || !policyValidator.validate(request.getContent())) {
        throw new BadRequestException("Invalid policy content: %s", request.getContent());
      }
      entity =
          new PolicyEntity.Builder(namespace, request.getName())
              .setCatalogId(catalogEntity.getId())
              .setDescription(request.getDescription())
              .setPolicyType(policyType)
              .setContent(request.getContent())
              .setId(getMetaStoreManager().generateNewEntityId(getCurrentPolarisContext()).getId())
              .build();
    } else {
      // TODO this should be the track to throw AlreadyExist
      throw new AlreadyExistsException("Policy already exists %s", identifier);
    }

    PolicyEntity policyEntity = PolicyEntity.of(createPolicy(namespace, request.getName(), entity));

    return constructPolicyResult(policyEntity);
  }

  public LoadPolicyResult getPolicy(Namespace namespace, String policyName) {
    PolarisAuthorizableOperation op = PolarisAuthorizableOperation.GET_POLICY;
    authorizeBasicPolicyOperationOrThrow(op, namespace, policyName);
    // TODO: add a passthrough method to verify the type of the entity
    PolarisResolvedPathWrapper resolvedEntities =
        resolutionManifest.getPassthroughResolvedPath(PolicyIdentifier.of(namespace, policyName));
    PolicyEntity policy = null;

    if (resolvedEntities != null) {
      if (resolvedEntities.getRawLeafEntity().getType() == PolarisEntityType.POLICY) {
        policy = PolicyEntity.of(resolvedEntities.getRawLeafEntity());
      }
    }

    if (policy == null) {
      // TODO: change to NoSuchPolicyException
      throw new NoSuchTableException("Policy does not exist: %s", policyName);
    }
    return constructPolicyResult(policy);
  }

  public LoadPolicyResult updatePolicy(
      Namespace namespace, String policyName, UpdatePolicyRequest request) {
    PolarisAuthorizableOperation op = PolarisAuthorizableOperation.UPDATE_POLICY;
    authorizeBasicPolicyOperationOrThrow(op, namespace, policyName);

    PolarisResolvedPathWrapper resolvedEntities =
        resolutionManifest.getPassthroughResolvedPath(PolicyIdentifier.of(namespace, policyName));
    PolicyEntity policy = null;

    if (resolvedEntities != null) {
      if (resolvedEntities.getRawLeafEntity().getType() == PolarisEntityType.POLICY) {
        policy = PolicyEntity.of(resolvedEntities.getRawLeafEntity());
      }
    }

    if (policy == null) {
      // TODO: change to NoSuchPolicyException
      throw new NoSuchTableException("Policy does not exist: %s", policyName);
    }

    PolicyEntity.Builder newPolicyBuilder = new PolicyEntity.Builder(policy);

    if (request.getContent() != null) {
      PolicyType policyType = policy.getPolicyType();
      PolicyValidator policyValidator = PolicyValidatorFactory.loadValidator(policyType);
      if (policyValidator == null || !policyValidator.validate(request.getContent())) {
        throw new BadRequestException("Invalid policy content: %s", request.getContent());
      }
      newPolicyBuilder.setContent(request.getContent());
    }

    if (request.getDescription() != null) {
      newPolicyBuilder.setDescription(request.getDescription());
    }

    PolicyEntity newPolicyEntity = newPolicyBuilder.build();
    newPolicyEntity = PolicyEntity.of(updatePolicy(namespace, policyName, newPolicyEntity));

    return constructPolicyResult(newPolicyEntity);
  }

  public void deletePolicy(Namespace namespace, String policyName) {
    PolarisAuthorizableOperation op = PolarisAuthorizableOperation.DROP_POLICY;
    authorizeBasicPolicyOperationOrThrow(op, namespace, policyName);

    PolarisMetaStoreManager.DropEntityResult dropEntityResult =
        dropPolicy(PolicyIdentifier.of(namespace, policyName));
    if (!dropEntityResult.isSuccess()) {
      // TODO: a better error message for policy
      throw new NoSuchTableException("Policy does not exist: %s", policyName);
    }
  }

  public GetApplicablePoliciesResponse getApplicablePolicies(TableIdentifier tableIdentifier) {
    PolarisAuthorizableOperation op = PolarisAuthorizableOperation.LOAD_TABLE;
    authorizeBasicTableLikeOperationOrThrow(op, PolarisEntitySubType.TABLE, tableIdentifier);

    PolarisResolvedPathWrapper resolvedEntities =
        resolutionManifest.getPassthroughResolvedPath(tableIdentifier, PolarisEntitySubType.TABLE);
    if (resolvedEntities == null) {
      throw new NotFoundException("Table not found: %s", tableIdentifier);
    }

    Set<Integer> existingInheritablePolicyTypes = new HashSet<>();
    List<PolicyEntity> finalResults = new ArrayList<>();

    PolarisEntity tableEntity = resolvedEntities.getRawLeafEntity();
    PolarisMetaStoreManager.LoadPolicyMappingsResult directMappingResult =
        getMetaStoreManager().loadPoliciesOnEntity(getCurrentPolarisContext(), tableEntity);
    if (directMappingResult.isSuccess()) {
      finalResults.addAll(directMappingResult.getPolicyEntities());
      directMappingResult
          .getPolicyMappingRecords()
          .forEach(
              policyMappingRecord -> {
                if (PolicyType.fromCode(policyMappingRecord.getPolicyTypeCode()).isInheritable()) {
                  existingInheritablePolicyTypes.add(policyMappingRecord.getPolicyTypeCode());
                }
              });

      List<PolarisEntity> catalogPath = resolvedEntities.getRawParentPath();
      for (int i = catalogPath.size() - 1; i >= 0; i--) {
        PolarisEntity parent = catalogPath.get(i);
        PolarisMetaStoreManager.LoadPolicyMappingsResult parentMappingResult =
            getMetaStoreManager().loadPoliciesOnEntity(getCurrentPolarisContext(), parent);
        if (parentMappingResult.isSuccess()) {
          parentMappingResult
              .getPolicyMappingRecords()
              .forEach(
                  policyMappingRecord -> {
                    PolicyType policyType =
                        PolicyType.fromCode(policyMappingRecord.getPolicyTypeCode());
                    if (policyType.isInheritable()
                        && !existingInheritablePolicyTypes.contains(policyType.getCode())) {
                      existingInheritablePolicyTypes.add(policyType.getCode());
                      finalResults.add(
                          parentMappingResult
                              .getPolicyEntitiesAsMap()
                              .get(policyMappingRecord.getPolicyId()));
                    }
                  });
        }
      }
    }

    return GetApplicablePoliciesResponse.builder()
        .setPolicies(
            finalResults.stream()
                .map(PolicyCatalogHandlerWrapper::constructPolicy)
                .collect(Collectors.toSet()))
        .build();
  }

  public void setPolicy(Namespace namespace, String policyName, SetPolicyRequest request) {
    switch (request.getEntity()) {
      case CatalogIdentifier catalogIdentifier:
        {
          break;
        }

      case NamespaceIdentifier namespaceIdentifier:
        {
          setPolicyOnNamespace(namespace, policyName, namespaceIdentifier, request.getParameters());
          break;
        }

      case TableLikeIdentifier tableLikeIdentifier:
        {
          setPolicyOnTableLike(namespace, policyName, tableLikeIdentifier, request.getParameters());
          break;
        }

      default:
        LOGGER.atWarn().log("Don't know how to set policy: {}", request.getEntity());
    }
  }

  private void setPolicyOnTableLike(
      Namespace namespace,
      String policyName,
      TableLikeIdentifier tableLikeIdentifier,
      Map<String, String> parameters) {
    PolarisAuthorizableOperation op = PolarisAuthorizableOperation.ATTACH_POLICY_TO_TABLE_LIKE;
    authorizeSetPolicyOnTableLikeOrThrow(op, namespace, policyName, tableLikeIdentifier);

    PolicyIdentifier policyIdentifier = PolicyIdentifier.of(namespace, policyName);

    List<String> rawNamespace = tableLikeIdentifier.getNamespace();
    TableIdentifier targetIdentifier =
        TableIdentifier.of(
            Namespace.of(rawNamespace.toArray(new String[0])), tableLikeIdentifier.getName());

    PolarisResolvedPathWrapper resolvedPolicyPathWrapper =
        resolutionManifest.getResolvedPath(policyIdentifier);
    if (resolvedPolicyPathWrapper == null) {
      throw new NotFoundException("Policy does not exist: %s", policyIdentifier);
    }

    PolarisResolvedPathWrapper resolvedTargetPathWrapper =
        resolutionManifest.getResolvedPath(targetIdentifier);
    if (resolvedTargetPathWrapper == null) {
      throw new NotFoundException("Target path does not exist: %s", targetIdentifier);
    }
    List<PolarisEntity> policyCatalogPath = resolvedPolicyPathWrapper.getRawParentPath();
    PolarisEntity policyEntity = resolvedPolicyPathWrapper.getRawLeafEntity();

    List<PolarisEntity> targetCatalogPath = resolvedTargetPathWrapper.getRawParentPath();
    PolarisEntity targetEntity = resolvedTargetPathWrapper.getRawLeafEntity();
    PolarisMetaStoreManager.AttachmentResult result =
        getMetaStoreManager()
            .attachPolicyToEntity(
                getCurrentPolarisContext(),
                targetEntity,
                PolarisEntity.toCoreList(targetCatalogPath),
                PolicyEntity.of(policyEntity),
                PolarisEntity.toCoreList(policyCatalogPath),
                parameters);

    if (!result.isSuccess()) {
      throw new IllegalStateException("Failed to attach policy to entity");
    }
  }

  private void setPolicyOnNamespace(
      Namespace namespace,
      String policyName,
      NamespaceIdentifier namespaceIdentifier,
      Map<String, String> parameters) {
    PolarisAuthorizableOperation op = PolarisAuthorizableOperation.ATTACH_POLICY_TO_NAMESPACE;
    authorizeSetPolicyOnNamespace(op, namespace, policyName, namespaceIdentifier);
    PolicyIdentifier policyIdentifier = PolicyIdentifier.of(namespace, policyName);

    Namespace targetNamespace =
        Namespace.of(namespaceIdentifier.getNamespace().toArray(new String[0]));

    PolarisResolvedPathWrapper resolvedPolicyPathWrapper =
        resolutionManifest.getResolvedPath(policyIdentifier);
    if (resolvedPolicyPathWrapper == null) {
      throw new NotFoundException("Policy does not exist: %s", policyIdentifier);
    }

    PolarisResolvedPathWrapper resolvedTargetPathWrapper =
        resolutionManifest.getResolvedPath(targetNamespace);
    if (resolvedTargetPathWrapper == null) {
      throw new NotFoundException("Target path does not exist: %s", targetNamespace);
    }

    List<PolarisEntity> policyCatalogPath = resolvedPolicyPathWrapper.getRawParentPath();
    PolarisEntity policyEntity = resolvedPolicyPathWrapper.getRawLeafEntity();

    List<PolarisEntity> targetCatalogPath = resolvedTargetPathWrapper.getRawParentPath();
    PolarisEntity targetEntity = resolvedTargetPathWrapper.getRawLeafEntity();
    PolarisMetaStoreManager.AttachmentResult result =
        getMetaStoreManager()
            .attachPolicyToEntity(
                getCurrentPolarisContext(),
                targetEntity,
                PolarisEntity.toCoreList(targetCatalogPath),
                PolicyEntity.of(policyEntity),
                PolarisEntity.toCoreList(policyCatalogPath),
                parameters);

    if (!result.isSuccess()) {
      throw new IllegalStateException("Failed to attach policy to entity");
    }
  }

  private void authorizeSetPolicyOnNamespace(
      PolarisAuthorizableOperation op,
      Namespace namespace,
      String policyName,
      NamespaceIdentifier namespaceIdentifier) {
    resolutionManifest =
        entityManager.prepareResolutionManifest(callContext, securityContext, catalogName);
    PolicyIdentifier policyIdentifier = PolicyIdentifier.of(namespace, policyName);
    resolutionManifest.addPath(
        new ResolverPath(
            PolarisCatalogHelpers.policyIdentifierToList(policyIdentifier),
            PolarisEntityType.POLICY),
        policyIdentifier);
    Namespace targetNamespace =
        Namespace.of(namespaceIdentifier.getNamespace().toArray(new String[0]));
    resolutionManifest.addPath(
        new ResolverPath(Arrays.asList(targetNamespace.levels()), PolarisEntityType.NAMESPACE),
        targetNamespace);
    ResolverStatus status = resolutionManifest.resolveAll();
    if (status.getStatus() == ResolverStatus.StatusEnum.ENTITY_COULD_NOT_BE_RESOLVED) {
      throw new NotFoundException("Catalog not found: %s", catalogName);
    } else if (status.getStatus() == ResolverStatus.StatusEnum.PATH_COULD_NOT_BE_FULLY_RESOLVED) {
      if (status.getFailedToResolvePath().getLastEntityType() == PolarisEntityType.TABLE_LIKE) {
        throw new NoSuchTableException("Table does not exist");
      } else {
        throw new NotFoundException("Policy not found: %s.%s", catalogName, policyName);
      }
    }
    PolarisResolvedPathWrapper policyWrapper =
        resolutionManifest.getResolvedPath(policyIdentifier, true);
    if (policyWrapper == null) {
      throw new NotFoundException("Policy does not exist: %s", policyName);
    }
    PolarisResolvedPathWrapper namespaceWrapper =
        resolutionManifest.getResolvedPath(targetNamespace, true);
    if (namespaceWrapper == null) {
      throw new NotFoundException("Target path does not exist: %s", targetNamespace);
    }

    authorizer.authorizeOrThrow(
        authenticatedPrincipal,
        resolutionManifest.getAllActivatedCatalogRoleAndPrincipalRoles(),
        op,
        policyWrapper,
        namespaceWrapper);
  }

  private void authorizeSetPolicyOnTableLikeOrThrow(
      PolarisAuthorizableOperation op,
      Namespace namespace,
      String policyName,
      TableLikeIdentifier tableLikeIdentifier) {
    // TODO: currently for only one catalog, but tableLike can exist in a different catalog
    resolutionManifest =
        entityManager.prepareResolutionManifest(callContext, securityContext, catalogName);
    PolicyIdentifier policyIdentifier = PolicyIdentifier.of(namespace, policyName);
    resolutionManifest.addPath(
        new ResolverPath(
            PolarisCatalogHelpers.policyIdentifierToList(policyIdentifier),
            PolarisEntityType.POLICY),
        policyIdentifier);
    List<String> rawNamespace = tableLikeIdentifier.getNamespace();
    TableIdentifier targetIdentifier =
        TableIdentifier.of(
            Namespace.of(rawNamespace.toArray(new String[0])), tableLikeIdentifier.getName());
    resolutionManifest.addPath(
        new ResolverPath(
            PolarisCatalogHelpers.tableIdentifierToList(targetIdentifier),
            PolarisEntityType.TABLE_LIKE),
        targetIdentifier);
    ResolverStatus status = resolutionManifest.resolveAll();
    if (status.getStatus() == ResolverStatus.StatusEnum.ENTITY_COULD_NOT_BE_RESOLVED) {
      throw new NotFoundException("Catalog not found: %s", catalogName);
    } else if (status.getStatus() == ResolverStatus.StatusEnum.PATH_COULD_NOT_BE_FULLY_RESOLVED) {
      if (status.getFailedToResolvePath().getLastEntityType() == PolarisEntityType.TABLE_LIKE) {
        throw new NoSuchTableException("Table does not exist");
      } else {
        throw new NotFoundException("Policy not found: %s.%s", catalogName, policyName);
      }
    }
    PolarisResolvedPathWrapper policyWrapper =
        resolutionManifest.getResolvedPath(policyIdentifier, true);
    if (policyWrapper == null) {
      throw new NotFoundException("Policy does not exist: %s", policyName);
    }
    PolarisResolvedPathWrapper tableLikeWrapper =
        resolutionManifest.getResolvedPath(targetIdentifier, true);
    if (tableLikeWrapper == null) {
      throw new NotFoundException("Target path does not exist: %s", targetIdentifier);
    }

    authorizer.authorizeOrThrow(
        authenticatedPrincipal,
        resolutionManifest.getAllActivatedCatalogRoleAndPrincipalRoles(),
        op,
        policyWrapper,
        tableLikeWrapper);
  }

  private void authorizeCreatePolicyUnderNamespaceOperationOrThrow(
      PolarisAuthorizableOperation op, Namespace namespace, String policyName) {
    resolutionManifest =
        entityManager.prepareResolutionManifest(callContext, securityContext, catalogName);
    resolutionManifest.addPath(
        new ResolverPath(Arrays.asList(namespace.levels()), PolarisEntityType.NAMESPACE),
        namespace);

    // TODO: need a policyIdentifier
    resolutionManifest.addPassthroughPath(
        new ResolverPath(
            PolarisCatalogHelpers.policyIdentifierToList(PolicyIdentifier.of(namespace, policyName)),
            PolarisEntityType.POLICY,
            true /* optional */),
            PolicyIdentifier.of(namespace, policyName));
    resolutionManifest.resolveAll();
    PolarisResolvedPathWrapper target = resolutionManifest.getResolvedPath(namespace, true);
    if (target == null) {
      throw new NoSuchNamespaceException("Namespace does not exist: %s", namespace);
    }

    // TODO: authorize
    authorizer.authorizeOrThrow(
        authenticatedPrincipal,
        resolutionManifest.getAllActivatedCatalogRoleAndPrincipalRoles(),
        op,
        target,
        null /* secondary */);
  }

  private void authorizeBasicPolicyOperationOrThrow(
      PolarisAuthorizableOperation op, Namespace namespace, String policyName) {
    resolutionManifest =
        entityManager.prepareResolutionManifest(callContext, securityContext, catalogName);
    PolicyIdentifier policyIdentifier = PolicyIdentifier.of(namespace, policyName);
    resolutionManifest.addPassthroughPath(
        new ResolverPath(
            PolarisCatalogHelpers.policyIdentifierToList(policyIdentifier),
            PolarisEntityType.POLICY,
            true /* optional */),
        policyIdentifier);
    resolutionManifest.resolveAll();
    PolarisResolvedPathWrapper target = resolutionManifest.getResolvedPath(policyIdentifier, true);
    if (target == null) {
      // TODO: change to NoSuchPolicyException
      throw new NoSuchTableException("Policy does not exist: %s", policyName);
    }

    authorizer.authorizeOrThrow(
        authenticatedPrincipal,
        resolutionManifest.getAllActivatedCatalogRoleAndPrincipalRoles(),
        op,
        target,
        null);
  }

  private PolarisEntity createPolicy(Namespace namespace, String policyName, PolarisEntity entity) {
    PolicyIdentifier identifier = PolicyIdentifier.of(namespace, policyName);
    PolarisResolvedPathWrapper resolvedParent = resolutionManifest.getResolvedPath(namespace);
    if (resolvedParent == null) {
      // Illegal state because the namespace should've already been in the static resolution set.
      throw new IllegalStateException(
          String.format("Failed to fetch resolved parent for Policy '%s'", identifier));
    }

    List<PolarisEntity> catalogPath = resolvedParent.getRawFullPath();
    if (entity.getParentId() <= 0) {
      // TODO: Validate catalogPath size is at least 1 for catalog entity?
      entity =
          new PolarisEntity.Builder(entity)
              .setParentId(resolvedParent.getRawLeafEntity().getId())
              .build();
    }

    entity =
        new PolarisEntity.Builder(entity).setCreateTimestamp(System.currentTimeMillis()).build();

    PolarisEntity returnedEntity =
        PolarisEntity.of(
            getMetaStoreManager()
                .createEntityIfNotExists(
                    getCurrentPolarisContext(), PolarisEntity.toCoreList(catalogPath), entity));

    LOGGER.debug("Created Policy entity {} with Identifier {}", entity, identifier);
    if (returnedEntity == null) {
      // TODO: Error or retry?
    }

    return returnedEntity;
  }

  private PolarisEntity updatePolicy(Namespace namespace, String policyName, PolarisEntity entity) {
    PolicyIdentifier identifier = PolicyIdentifier.of(namespace, policyName);
    PolarisResolvedPathWrapper resolvedEntities = resolutionManifest.getResolvedPath(identifier);
    if (resolvedEntities == null) {
      // TODO: change to Policy
      // Illegal state because the identifier should've already been in the static resolution set.
      throw new IllegalStateException(
          String.format("Failed to fetch resolved TableIdentifier '%s'", identifier));
    }

    List<PolarisEntity> catalogPath = resolvedEntities.getRawParentPath();
    PolarisEntity returnedEntity =
        Optional.ofNullable(
                getMetaStoreManager()
                    .updateEntityPropertiesIfNotChanged(
                        getCurrentPolarisContext(), PolarisEntity.toCoreList(catalogPath), entity)
                    .getEntity())
            .map(PolarisEntity::new)
            .orElse(null);
    if (returnedEntity == null) {
      // TODO: Error or retry?
      // TODO: remove
      throw new IllegalStateException("Failed to update Policy entity");
    }

    return returnedEntity;
  }

  private @Nonnull PolarisMetaStoreManager.DropEntityResult dropPolicy(
          PolicyIdentifier policyIdentifier) {
    PolarisResolvedPathWrapper resolvedEntities =
        resolutionManifest.getResolvedPath(policyIdentifier);
    if (resolvedEntities == null) {
      // TODO Error?
      return new PolarisMetaStoreManager.DropEntityResult(
          BaseResult.ReturnStatus.ENTITY_NOT_FOUND, null);
    }

    List<PolarisEntity> catalogPath = resolvedEntities.getRawParentPath();
    PolarisEntity leafEntity = resolvedEntities.getRawLeafEntity();

    // TODO: temporarily make cleanup set to false, need further thinking
    return getMetaStoreManager()
        .dropEntityIfExists(
            getCurrentPolarisContext(),
            PolarisEntity.toCoreList(catalogPath),
            leafEntity,
            Map.of(),
            false);
  }

  private PolarisMetaStoreManager getMetaStoreManager() {
    return metaStoreManager;
  }

  private static LoadPolicyResult constructPolicyResult(PolicyEntity policyEntity) {
    return LoadPolicyResult.builder().setPolicy(constructPolicy(policyEntity)).build();
  }

  private static Policy constructPolicy(PolicyEntity policyEntity) {
    return Policy.builder()
        .setPolicyType(policyEntity.getPolicyType().getName())
        .setName(policyEntity.getName())
        .setDescription(policyEntity.getDescription())
        .setContent(policyEntity.getContent())
        .setVersion(Integer.valueOf(policyEntity.getPolicyVersion()))
        .setCreatedAtMs(policyEntity.getCreateTimestamp())
        .setUpdatedAtMs(policyEntity.getLastUpdateTimestamp())
        .build();
  }

  private void authorizeBasicTableLikeOperationOrThrow(
      PolarisAuthorizableOperation op, PolarisEntitySubType subType, TableIdentifier identifier) {
    resolutionManifest =
        entityManager.prepareResolutionManifest(callContext, securityContext, catalogName);

    // The underlying Catalog is also allowed to fetch "fresh" versions of the target entity.
    resolutionManifest.addPassthroughPath(
        new ResolverPath(
            PolarisCatalogHelpers.tableIdentifierToList(identifier),
            PolarisEntityType.TABLE_LIKE,
            true /* optional */),
        identifier);
    resolutionManifest.resolveAll();
    PolarisResolvedPathWrapper target =
        resolutionManifest.getResolvedPath(identifier, subType, true);
    if (target == null) {
      if (subType == PolarisEntitySubType.TABLE) {
        throw new NoSuchTableException("Table does not exist: %s", identifier);
      } else {
        throw new NoSuchViewException("View does not exist: %s", identifier);
      }
    }
    authorizer.authorizeOrThrow(
        authenticatedPrincipal,
        resolutionManifest.getAllActivatedCatalogRoleAndPrincipalRoles(),
        op,
        target,
        null /* secondary */);
  }

  private PolarisCallContext getCurrentPolarisContext() {
    return callContext.getPolarisCallContext();
  }
}
