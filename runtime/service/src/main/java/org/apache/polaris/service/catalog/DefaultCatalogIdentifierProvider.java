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

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import org.apache.iceberg.catalog.Namespace;
import org.apache.iceberg.catalog.TableIdentifier;
import org.apache.polaris.core.config.RealmConfig;
import org.apache.polaris.service.types.PolicyIdentifier;

@RequestScoped
public class DefaultCatalogIdentifierProvider implements CatalogIdentifierProvider{

    private final RealmConfig realmConfig;
    private final CatalogIdentifierNormalizer catalogIdentifierNormalizer;

    @Inject
    public DefaultCatalogIdentifierProvider(
            RealmConfig realmConfig,
            CatalogIdentifierNormalizer catalogIdentifierNormalizer
    ) {
        this.realmConfig = realmConfig;
        this.catalogIdentifierNormalizer = catalogIdentifierNormalizer;
    }

    @Override
    public Namespace namespace(String namespace) {
        return null;
    }

    @Override
    public Namespace namespace(Namespace namespace) {
        return null;
    }

    @Override
    public TableIdentifier tableIdentifier(String namespace, String name) {
        return null;
    }

    @Override
    public TableIdentifier tableIdentifier(Namespace namespace, String name) {
        return null;
    }

    @Override
    public PolicyIdentifier policyIdentifier(String namespace, String name) {
        return null;
    }

    @Override
    public PolicyIdentifier policyIdentifier(Namespace namespace, String name) {
        return null;
    }
}
