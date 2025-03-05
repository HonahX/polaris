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
package org.apache.polaris.service.policy;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import org.apache.polaris.core.PolarisConfigurationStore;
import org.apache.polaris.core.PolarisDiagnostics;
import org.apache.polaris.core.auth.PolarisAuthorizer;
import org.apache.polaris.core.context.CallContext;
import org.apache.polaris.core.context.RealmContext;
import org.apache.polaris.core.persistence.PolarisEntityManager;
import org.apache.polaris.core.persistence.PolarisMetaStoreManager;
import org.apache.polaris.core.persistence.transactional.TransactionalPersistence;
import org.apache.polaris.service.catalog.IcebergCatalogPrefixParser;
import org.apache.polaris.service.catalog.api.PolarisRestPolicyApiService;

@RequestScoped
public class PolicyServiceImpl implements PolarisRestPolicyApiService {
  private final RealmContext realmContext;
  private final CallContext callContext;
  private final PolarisEntityManager entityManager;
  private final PolarisMetaStoreManager metaStoreManager;
  private final TransactionalPersistence session;
  private final PolarisConfigurationStore configurationStore;
  private final PolarisDiagnostics diagnostics;
  private final PolarisAuthorizer polarisAuthorizer;
  private final IcebergCatalogPrefixParser prefixParser;

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
}
