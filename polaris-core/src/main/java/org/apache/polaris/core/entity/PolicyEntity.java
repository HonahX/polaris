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

package org.apache.polaris.core.entity;

import org.apache.iceberg.catalog.Namespace;
import org.apache.iceberg.rest.RESTUtil;

public class PolicyEntity extends PolarisEntity{

    public static final String POLICY_TYPE_KEY = "policy-type";
    public static final String POLICY_DESCRIPTION_KEY = "policy-description";
    public static final String POLICY_VERSION_KEY = "policy-version";
    public static final String POLICY_CONTENT_KEY = "policy-content";

    public PolicyEntity(PolarisBaseEntity sourceEntity) {
        super(sourceEntity);
    }

    public static PolicyEntity of(PolarisBaseEntity sourceEntity) {
        if (sourceEntity != null) {
            return new PolicyEntity(sourceEntity);
        }

        return null;
    }

    public String getPolicyType() {
        return getPropertiesAsMap().get(POLICY_TYPE_KEY);
    }

    public String getDescription() {
        return getPropertiesAsMap().get(POLICY_DESCRIPTION_KEY);
    }

    public String getContent() {
        return getPropertiesAsMap().get(POLICY_CONTENT_KEY);
    }

    public String getPolicyVersion() {
        return getPropertiesAsMap().get(POLICY_VERSION_KEY);
    }

    public static class Builder extends PolarisEntity.BaseBuilder<PolicyEntity, Builder> {
        public Builder(Namespace namespace, String policyName, String policyType) {
            super();
            setType(PolarisEntityType.POLICY);
            setParentNamespace(namespace);
            setName(policyName);
            setPolicyType(policyType);
            // TODO: check whether version starts from 0
            setVersion(0);
        }

        public Builder(PolicyEntity original) {super(original);}

        @Override
        public PolicyEntity build() {return new PolicyEntity(buildBase());}

        public Builder setParentNamespace(Namespace namespace) {
            if (namespace != null && !namespace.isEmpty()) {
                internalProperties.put(
                        NamespaceEntity.PARENT_NAMESPACE_KEY, RESTUtil.encodeNamespace(namespace));
            }
            return this;
        }

        public Builder setPolicyType(String policyType) {
            // TODO: Do we need to validate the type here?
            properties.put(POLICY_TYPE_KEY, policyType);
            return this;
        }

        public Builder setDescription(String description) {
            properties.put(POLICY_DESCRIPTION_KEY, description);
            return this;
        }

        public Builder setVersion(long version) {
            properties.put(POLICY_VERSION_KEY, Long.toString(version));
            return this;
        }

        public Builder setContent(String content) {
            // TODO: validate, but not here
            properties.put(POLICY_CONTENT_KEY, content);
            return this;
        }
    }
}
