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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.iceberg.catalog.Namespace;
import org.apache.iceberg.catalog.TableIdentifier;
import org.apache.iceberg.exceptions.AlreadyExistsException;
import org.apache.iceberg.exceptions.BadRequestException;
import org.apache.iceberg.exceptions.NoSuchNamespaceException;
import org.apache.iceberg.exceptions.NoSuchTableException;
import org.apache.iceberg.exceptions.NoSuchViewException;
import org.apache.iceberg.exceptions.NotFoundException;
import org.apache.polaris.core.PolarisCallContext;
import org.apache.polaris.core.auth.AuthenticatedPolarisPrincipal;
import org.apache.polaris.core.auth.PolarisAuthorizableOperation;
import org.apache.polaris.core.auth.PolarisAuthorizer;
import org.apache.polaris.core.catalog.PolarisCatalogHelpers;
import org.apache.polaris.core.context.CallContext;
import org.apache.polaris.core.entity.CatalogEntity;
import org.apache.polaris.core.entity.PolarisEntity;
import org.apache.polaris.core.entity.PolarisEntitySubType;
import org.apache.polaris.core.entity.PolarisEntityType;
import org.apache.polaris.core.entity.PolicyEntity;
import org.apache.polaris.core.persistence.BaseResult;
import org.apache.polaris.core.persistence.PolarisEntityManager;
import org.apache.polaris.core.persistence.PolarisMetaStoreManager;
import org.apache.polaris.core.persistence.PolarisResolvedPathWrapper;
import org.apache.polaris.core.persistence.resolver.PolarisResolutionManifest;
import org.apache.polaris.core.persistence.resolver.ResolverPath;
import org.apache.polaris.core.persistence.resolver.ResolverStatus;
import org.apache.polaris.core.policy.PolicyIdentifier;
import org.apache.polaris.core.policy.PolicyType;
import org.apache.polaris.core.policy.PolicyValidator;
import org.apache.polaris.core.policy.PolicyValidatorFactory;
import org.apache.polaris.service.types.CatalogIdentifier;
import org.apache.polaris.service.types.CreatePolicyRequest;
import org.apache.polaris.service.types.GetApplicablePoliciesResponse;
import org.apache.polaris.service.types.LoadPolicyResult;
import org.apache.polaris.service.types.NamespaceIdentifier;
import org.apache.polaris.service.types.Policy;
import org.apache.polaris.service.types.SetPolicyRequest;
import org.apache.polaris.service.types.TableLikeIdentifier;
import org.apache.polaris.service.types.UpdatePolicyRequest;
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

  public LoadPolicyResult createPolicy(Namespace namespace, CreatePolicyRequest request) {
    PolarisAuthorizableOperation op = PolarisAuthorizableOperation.CREATE_POLICY;
    PolicyIdentifier identifier = PolicyIdentifier.of(namespace, request.getName());

    authorizeCreatePolicyUnderNamespaceOperationOrThrow(op, identifier);

    PolarisResolvedPathWrapper resolvedPolicyEntities =
        resolutionManifest.getPassthroughResolvedPath(identifier);
    CatalogEntity catalogEntity =
        CatalogEntity.of(resolutionManifest.getResolvedReferenceCatalogEntity().getRawLeafEntity());

    PolicyEntity entity =
        PolicyEntity.of(
            resolvedPolicyEntities == null ? null : resolvedPolicyEntities.getRawLeafEntity());

    if (entity == null) {
      PolicyType policyType = PolicyType.fromName(request.getType());
      if (policyType == null) {
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
      throw new AlreadyExistsException("Policy already exists %s", identifier);
    }

    PolicyEntity policyEntity = PolicyEntity.of(createPolicy(identifier, entity));

    return constructPolicyResult(policyEntity);
  }

  public LoadPolicyResult getPolicy(Namespace namespace, String policyName) {
    PolarisAuthorizableOperation op = PolarisAuthorizableOperation.GET_POLICY;
    PolicyIdentifier identifier = PolicyIdentifier.of(namespace, policyName);

    authorizeBasicPolicyOperationOrThrow(op, identifier);
    PolarisResolvedPathWrapper resolvedEntities =
        resolutionManifest.getPassthroughResolvedPath(identifier);

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
    PolicyIdentifier identifier = PolicyIdentifier.of(namespace, policyName);

    authorizeBasicPolicyOperationOrThrow(op, identifier);

    PolarisResolvedPathWrapper resolvedEntities =
        resolutionManifest.getPassthroughResolvedPath(identifier);
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
    PolicyIdentifier identifier = PolicyIdentifier.of(namespace, policyName);

    authorizeBasicPolicyOperationOrThrow(op, identifier);

    PolarisMetaStoreManager.DropEntityResult dropEntityResult = dropPolicy(identifier);
    if (!dropEntityResult.isSuccess()) {
      // TODO: a better error message for policy
      throw new NoSuchTableException("Policy does not exist: %s", policyName);
    }
  }

  public void setPolicy(Namespace namespace, String policyName, SetPolicyRequest request) {
    switch (request.getEntity()) {
      case CatalogIdentifier catalogIdentifier:
        {
          // TODO: implement
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

  public GetApplicablePoliciesResponse getApplicablePolicies(TableIdentifier tableIdentifier) {
    PolarisAuthorizableOperation op = PolarisAuthorizableOperation.LOAD_TABLE;
    authorizeBasicTableLikeOperationOrThrow(op, PolarisEntitySubType.TABLE, tableIdentifier);

    PolarisResolvedPathWrapper resolvedEntities =
        resolutionManifest.getPassthroughResolvedPath(tableIdentifier, PolarisEntitySubType.TABLE);
    if (resolvedEntities == null) {
      throw new NotFoundException("Table not found: %s", tableIdentifier);
    }

    PolarisEntity tableEntity = resolvedEntities.getRawLeafEntity();
    List<PolarisEntity> catalogPath = resolvedEntities.getRawParentPath();

    List<PolicyEntity> applicablePolicyEntities =
        getApplicablePoliciesOnEntity(catalogPath, tableEntity);

    return GetApplicablePoliciesResponse.builder()
        .setPolicies(
            applicablePolicyEntities.stream()
                .map(PolicyCatalogHandlerWrapper::constructPolicy)
                .collect(Collectors.toSet()))
        .build();
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
      PolarisAuthorizableOperation op, PolicyIdentifier identifier) {
    resolutionManifest =
        entityManager.prepareResolutionManifest(callContext, securityContext, catalogName);
    resolutionManifest.addPath(
        new ResolverPath(
            Arrays.asList(identifier.namespace().levels()), PolarisEntityType.NAMESPACE),
        identifier.namespace());

    resolutionManifest.addPassthroughPath(
        new ResolverPath(
            PolarisCatalogHelpers.policyIdentifierToList(identifier),
            PolarisEntityType.POLICY,
            true /* optional */),
        identifier);
    resolutionManifest.resolveAll();
    PolarisResolvedPathWrapper target =
        resolutionManifest.getResolvedPath(identifier.namespace(), true);
    if (target == null) {
      throw new NoSuchNamespaceException("Namespace does not exist: %s", identifier.namespace());
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
      PolarisAuthorizableOperation op, PolicyIdentifier identifier) {
    resolutionManifest =
        entityManager.prepareResolutionManifest(callContext, securityContext, catalogName);
    resolutionManifest.addPassthroughPath(
        new ResolverPath(
            PolarisCatalogHelpers.policyIdentifierToList(identifier),
            PolarisEntityType.POLICY,
            true /* optional */),
        identifier);
    resolutionManifest.resolveAll();
    PolarisResolvedPathWrapper target = resolutionManifest.getResolvedPath(identifier, true);
    if (target == null) {
      // TODO: change to NoSuchPolicyException
      throw new NoSuchTableException("Policy does not exist: %s", identifier);
    }

    authorizer.authorizeOrThrow(
        authenticatedPrincipal,
        resolutionManifest.getAllActivatedCatalogRoleAndPrincipalRoles(),
        op,
        target,
        null);
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

  private PolarisEntity createPolicy(PolicyIdentifier identifier, PolarisEntity entity) {
    PolarisResolvedPathWrapper resolvedParent =
        resolutionManifest.getResolvedPath(identifier.namespace());
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

  private List<PolicyEntity> getApplicablePoliciesOnEntity(
      List<PolarisEntity> catalogPath, PolarisEntity entity) {
    Set<Integer> existingInheritablePolicyTypes = new HashSet<>();
    List<PolicyEntity> finalResults = new ArrayList<>();
    PolarisMetaStoreManager.LoadPolicyMappingsResult directMappingResult =
        getMetaStoreManager().loadPoliciesOnEntity(getCurrentPolarisContext(), entity);

    if (directMappingResult.isSuccess()) {
      finalResults.addAll(directMappingResult.getPolicyEntities());
      directMappingResult
          .getPolicyMappingRecords()
          .forEach(
              policyMappingRecord -> {
                PolicyType policyType =
                    PolicyType.fromCode(policyMappingRecord.getPolicyTypeCode());
                if (policyType.isInheritable()) {
                  existingInheritablePolicyTypes.add(policyMappingRecord.getPolicyTypeCode());
                }
              });
    }

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
                      && existingInheritablePolicyTypes.add(policyType.getCode())) {
                    finalResults.add(
                        parentMappingResult
                            .getPolicyEntitiesAsMap()
                            .get(policyMappingRecord.getPolicyId()));
                  }
                });
      }
    }

    return finalResults;
  }

  private PolarisCallContext getCurrentPolarisContext() {
    return callContext.getPolarisCallContext();
  }
}
