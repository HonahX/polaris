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

package org.apache.polaris.service.catalog.iceberg;

import io.smallrye.common.annotation.Identifier;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Any;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.SecurityContext;
import org.apache.iceberg.catalog.Catalog;
import org.apache.polaris.core.PolarisDiagnostics;
import org.apache.polaris.core.auth.PolarisPrincipal;
import org.apache.polaris.core.catalog.ExternalCatalogFactory;
import org.apache.polaris.core.config.FeatureConfiguration;
import org.apache.polaris.core.connection.ConnectionConfigInfoDpo;
import org.apache.polaris.core.connection.ConnectionType;
import org.apache.polaris.core.context.CallContext;
import org.apache.polaris.core.entity.CatalogEntity;
import org.apache.polaris.core.persistence.PolarisMetaStoreManager;
import org.apache.polaris.core.persistence.PolarisResolvedPathWrapper;
import org.apache.polaris.core.persistence.resolver.PolarisResolutionManifest;
import org.apache.polaris.core.persistence.resolver.PolarisResolutionManifestCatalogView;
import org.apache.polaris.core.secrets.UserSecretsManager;
import org.apache.polaris.service.catalog.credentials.CredentialVendorFactory;
import org.apache.polaris.service.context.catalog.CallContextCatalogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class IcebergCatalogWithPolarisExtensionFactory {
  private static final Logger LOGGER =
      LoggerFactory.getLogger(IcebergCatalogWithPolarisExtensionFactory.class);
  private final PolarisMetaStoreManager polarisMetaStoreManager;
  private final CallContextCatalogFactory callContextCatalogFactory;
  private final CredentialVendorFactory credentialVendorFactory;
  private final Instance<ExternalCatalogFactory> externalCatalogFactories;
  private final PolarisDiagnostics diagnostics;
  private final UserSecretsManager userSecretsManager;

  @Inject
  public IcebergCatalogWithPolarisExtensionFactory(
      PolarisMetaStoreManager metaStoreManager,
      CallContextCatalogFactory catalogFactory,
      CredentialVendorFactory credentialVendorFactory,
      @Any Instance<ExternalCatalogFactory> externalCatalogFactories,
      UserSecretsManager userSecretsManage,
      PolarisDiagnostics diagnostics) {
    this.polarisMetaStoreManager = metaStoreManager;
    this.callContextCatalogFactory = catalogFactory;
    this.credentialVendorFactory = credentialVendorFactory;
    this.externalCatalogFactories = externalCatalogFactories;
    this.diagnostics = diagnostics;
    this.userSecretsManager = userSecretsManage;
  }

  public IcebergCatalogWithPolarisExtension createCatalogWithPolarisExtension(
      CallContext callContext,
      PolarisPrincipal polarisPrincipal,
      SecurityContext securityContext,
      PolarisResolutionManifest resolvedManifestCatalogView) {
    IcebergCatalogWithPolarisExtension.Builder builder =
        new IcebergCatalogWithPolarisExtension.Builder();
    CatalogEntity resolvedCatalogEntity = getResolvedCatalogEntity(resolvedManifestCatalogView);
    ConnectionConfigInfoDpo connectionConfigInfoDpo =
        resolvedCatalogEntity.getConnectionConfigInfoDpo();
    if (connectionConfigInfoDpo != null) {
      LOGGER
          .atInfo()
          .addKeyValue("remoteUrl", connectionConfigInfoDpo.getUri())
          .log("Initializing federated catalog");
      FeatureConfiguration.enforceFeatureEnabledOrThrow(
          callContext.getRealmConfig(), FeatureConfiguration.ENABLE_CATALOG_FEDERATION);

      Catalog federatedCatalog;
      ConnectionType connectionType =
          ConnectionType.fromCode(connectionConfigInfoDpo.getConnectionTypeCode());

      // Use the unified factory pattern for all external catalog types
      Instance<ExternalCatalogFactory> externalCatalogFactory =
          externalCatalogFactories.select(
              Identifier.Literal.of(connectionType.getFactoryIdentifier()));
      if (externalCatalogFactory.isResolvable()) {
        federatedCatalog =
            externalCatalogFactory.get().createCatalog(connectionConfigInfoDpo, userSecretsManager);
      } else {
        throw new UnsupportedOperationException(
            "External catalog factory for type '" + connectionType + "' is unavailable.");
      }
      builder.withBaseCatalog(federatedCatalog);
    } else {
      LOGGER.atInfo().log("Initializing non-federated catalog");
      // TODO: createCallContextCatalog should use interface instead of implementation
      builder.withBaseCatalog(
          callContextCatalogFactory.createCallContextCatalog(
              callContext, polarisPrincipal, securityContext, resolvedManifestCatalogView));
      builder.withCredentialVendor(
          credentialVendorFactory.createCredentialVendor(callContext, resolvedManifestCatalogView));
    }
    return builder.build();
  }

  // TODO: refactor to utils
  private CatalogEntity getResolvedCatalogEntity(
      PolarisResolutionManifestCatalogView resolvedManifestCatalogView) {
    PolarisResolvedPathWrapper catalogPath =
        resolvedManifestCatalogView.getResolvedReferenceCatalogEntity();
    diagnostics.checkNotNull(catalogPath, "No catalog available");
    return CatalogEntity.of(catalogPath.getRawLeafEntity());
  }
}
