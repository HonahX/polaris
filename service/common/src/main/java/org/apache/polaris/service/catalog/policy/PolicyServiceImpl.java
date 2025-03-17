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
package org.apache.polaris.service.catalog.policy;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.SecurityContext;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.function.Function;
import org.apache.iceberg.catalog.Namespace;
import org.apache.iceberg.catalog.TableIdentifier;
import org.apache.iceberg.exceptions.NotAuthorizedException;
import org.apache.iceberg.rest.RESTUtil;
import org.apache.polaris.core.PolarisDiagnostics;
import org.apache.polaris.core.auth.AuthenticatedPolarisPrincipal;
import org.apache.polaris.core.auth.PolarisAuthorizer;
import org.apache.polaris.core.config.PolarisConfigurationStore;
import org.apache.polaris.core.context.CallContext;
import org.apache.polaris.core.context.RealmContext;
import org.apache.polaris.core.persistence.PolarisEntityManager;
import org.apache.polaris.core.persistence.PolarisMetaStoreManager;
import org.apache.polaris.core.persistence.transactional.TransactionalPersistence;
import org.apache.polaris.core.policy.PolicyType;
import org.apache.polaris.service.catalog.IcebergCatalogPrefixParser;
import org.apache.polaris.service.catalog.api.PolarisCatalogPolicyApiService;
import org.apache.polaris.service.types.AttachPolicyRequest;
import org.apache.polaris.service.types.CreatePolicyRequest;
import org.apache.polaris.service.types.DetachPolicyRequest;
import org.apache.polaris.service.types.PolicyIdentifier;
import org.apache.polaris.service.types.UpdatePolicyRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RequestScoped
public class PolicyServiceImpl implements PolarisCatalogPolicyApiService {
  private final RealmContext realmContext;
  private final CallContext callContext;
  private final PolarisEntityManager entityManager;
  private final PolarisMetaStoreManager metaStoreManager;
  private final TransactionalPersistence session;
  private final PolarisConfigurationStore configurationStore;
  private final PolarisDiagnostics diagnostics;
  private final PolarisAuthorizer polarisAuthorizer;
  private final IcebergCatalogPrefixParser prefixParser;

  private static final Logger LOGGER = LoggerFactory.getLogger(PolicyServiceImpl.class);

  @Inject
  public PolicyServiceImpl(
      RealmContext realmContext,
      CallContext callContext,
      PolarisEntityManager entityManager,
      PolarisMetaStoreManager metaStoreManager,
      TransactionalPersistence session,
      PolarisConfigurationStore configurationStore,
      PolarisDiagnostics diagnostics,
      PolarisAuthorizer polarisAuthorizer,
      IcebergCatalogPrefixParser prefixParser) {
    this.realmContext = realmContext;
    this.callContext = callContext;
    this.entityManager = entityManager;
    this.metaStoreManager = metaStoreManager;
    this.session = session;
    this.configurationStore = configurationStore;
    this.diagnostics = diagnostics;
    this.polarisAuthorizer = polarisAuthorizer;
    this.prefixParser = prefixParser;

    // FIXME: This is a hack to set the current context for downstream calls.
    CallContext.setCurrentContext(callContext);
  }

  private Response withPolicyHandler(
      SecurityContext securityContext,
      String prefix,
      Function<PolicyCatalogHandlerWrapper, Response> action) {
    String catalogName = prefixParser.prefixToCatalogName(realmContext, prefix);
    try (PolicyCatalogHandlerWrapper wrapper =
        newPolicyHandlerWrapper(securityContext, catalogName)) {
      return action.apply(wrapper);
    } catch (RuntimeException e) {
      LOGGER.debug("RuntimeException while operating on catalog. Propagating to caller.", e);
      throw e;
    } catch (Exception e) {
      LOGGER.error("Error while operating on catalog", e);
      throw new RuntimeException(e);
    }
  }

  private PolicyCatalogHandlerWrapper newPolicyHandlerWrapper(
      SecurityContext securityContext, String catalogName) {
    AuthenticatedPolarisPrincipal authenticatedPrincipal =
        (AuthenticatedPolarisPrincipal) securityContext.getUserPrincipal();
    if (authenticatedPrincipal == null) {
      throw new NotAuthorizedException("Failed to find authenticatedPrincipal in SecurityContext");
    }

    return new PolicyCatalogHandlerWrapper(
        callContext,
        entityManager,
        metaStoreManager,
        securityContext,
        catalogName,
        polarisAuthorizer);
  }

  private static Namespace decodeNamespace(String namespace) {
    return RESTUtil.decodeNamespace(URLEncoder.encode(namespace, Charset.defaultCharset()));
  }

  @Override
  public Response createPolicy(
      String prefix,
      String namespace,
      CreatePolicyRequest createPolicyRequest,
      RealmContext realmContext,
      SecurityContext securityContext) {
    Namespace ns = decodeNamespace(namespace);
    return withPolicyHandler(
        securityContext,
        prefix,
        catalog -> Response.ok(catalog.createPolicy(ns, createPolicyRequest)).build());
  }

  @Override
  public Response loadPolicy(
      String prefix,
      String namespace,
      String policyName,
      RealmContext realmContext,
      SecurityContext securityContext) {
    Namespace ns = decodeNamespace(namespace);
    // TODO: decode policyName
    return withPolicyHandler(
        securityContext, prefix, catalog -> Response.ok(catalog.getPolicy(ns, policyName)).build());
  }

  @Override
  public Response updatePolicy(
      String prefix,
      String namespace,
      String policyName,
      UpdatePolicyRequest updatePolicyRequest,
      RealmContext realmContext,
      SecurityContext securityContext) {
    Namespace ns = decodeNamespace(namespace);
    return withPolicyHandler(
        securityContext,
        prefix,
        catalog -> Response.ok(catalog.updatePolicy(ns, policyName, updatePolicyRequest)).build());
  }

  @Override
  public Response dropPolicy(
      String prefix,
      String namespace,
      String policyName,
      Boolean detachAll,
      RealmContext realmContext,
      SecurityContext securityContext) {
    Namespace ns = decodeNamespace(namespace);
    return withPolicyHandler(
        securityContext,
        prefix,
        catalog -> {
          catalog.deletePolicy(ns, policyName);
          return Response.status(Response.Status.NO_CONTENT).build();
        });
  }

  @Override
  public Response listPolicies(
      String prefix,
      String namespace,
      String pageToken,
      Integer pageSize,
      String policyType,
      RealmContext realmContext,
      SecurityContext securityContext) {
    Namespace ns = decodeNamespace(namespace);
    PolicyType type = PolicyType.fromName(RESTUtil.decodeString(policyType));
    return withPolicyHandler(
        securityContext, prefix, catalog -> Response.ok(catalog.listPolicies(ns, type)).build());
  }

  @Override
  public Response attachPolicy(
      String prefix,
      String namespace,
      String policyName,
      AttachPolicyRequest attachPolicyRequest,
      RealmContext realmContext,
      SecurityContext securityContext) {
    Namespace ns = decodeNamespace(namespace);
    return withPolicyHandler(
        securityContext,
        prefix,
        catalog -> {
          catalog.attachPolicy(ns, policyName, attachPolicyRequest);
          return Response.status(Response.Status.NO_CONTENT).build();
        });
  }

  @Override
  public Response detachPolicy(
      String prefix,
      String namespace,
      String policyName,
      DetachPolicyRequest detachPolicyRequest,
      RealmContext realmContext,
      SecurityContext securityContext) {
    Namespace ns = decodeNamespace(namespace);
    PolicyIdentifier policyIdentifier = PolicyIdentifier.of(ns, RESTUtil.decodeString(policyName));
    return withPolicyHandler(
        securityContext,
        prefix,
        catalog -> {
          catalog.detachPolicy(policyIdentifier, detachPolicyRequest);
          return Response.status(Response.Status.NO_CONTENT).build();
        });
  }

  @Override
  public Response getApplicablePolicies(
      String prefix,
      String pageToken,
      Integer pageSize,
      String namespace,
      String targetName,
      String policyType,
      RealmContext realmContext,
      SecurityContext securityContext) {
    PolicyType type = PolicyType.fromName(RESTUtil.decodeString(policyType));
    if (namespace == null && targetName == null) {
      // TODO: implement for current catalog
    } else if (namespace != null && targetName == null) {
      Namespace ns = decodeNamespace(namespace);
      return withPolicyHandler(
          securityContext,
          prefix,
          catalog -> Response.ok(catalog.getApplicablePoliciesOnNamespace(ns, type)).build());
    } else if (namespace != null && targetName != null) {
      Namespace ns = decodeNamespace(namespace);
      TableIdentifier tableIdentifier = TableIdentifier.of(ns, RESTUtil.decodeString(targetName));
      return withPolicyHandler(
          securityContext,
          prefix,
          catalog ->
              Response.ok(catalog.getApplicablePoliciesOnTableLike(tableIdentifier, type)).build());
    }

    return Response.status(501).build(); // not implemented
  }
}
