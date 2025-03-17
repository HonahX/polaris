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
package org.apache.polaris.service.it.env;

import static jakarta.ws.rs.core.Response.Status.NO_CONTENT;
import static javax.ws.rs.core.Response.Status.OK;
import static org.assertj.core.api.Assertions.assertThat;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.Response;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.iceberg.catalog.Namespace;
import org.apache.iceberg.rest.RESTUtil;
import org.apache.polaris.core.policy.PolicyType;
import org.apache.polaris.service.types.CreatePolicyRequest;
import org.apache.polaris.service.types.ListPoliciesResponse;
import org.apache.polaris.service.types.LoadPolicyResponse;
import org.apache.polaris.service.types.Policy;
import org.apache.polaris.service.types.PolicyIdentifier;
import org.apache.polaris.service.types.UpdatePolicyRequest;

public class PolicyApi extends RestApi {

  PolicyApi(Client client, PolarisApiEndpoints endpoints, String authToken, URI uri) {
    super(client, endpoints, authToken, uri);
  }

  public Policy createPolicy(
      String catalogName,
      Namespace namespace,
      PolicyType policyType,
      String policyName,
      String policyContent,
      String description) {
    String ns = RESTUtil.encodeNamespace(namespace);
    try (Response response =
        request("v1/{cat}/namespaces/{ns}/policies", Map.of("cat", catalogName, "ns", ns))
            .post(
                Entity.json(
                    CreatePolicyRequest.builder()
                        .setType(policyType.getName())
                        .setName(policyName)
                        .setContent(policyContent)
                        .setDescription(description)
                        .build()))) {
      assertThat(response.getStatus()).isEqualTo(OK.getStatusCode());
      LoadPolicyResponse res = response.readEntity(LoadPolicyResponse.class);
      return res.getPolicy();
    }
  }

  public Policy loadPolicy(String catalogName, PolicyIdentifier policyIdentifier) {
    String ns = RESTUtil.encodeNamespace(policyIdentifier.namespace());
    try (Response response =
        request(
                "v1/{cat}/namespaces/{ns}/policies/{policy-name}",
                Map.of("cat", catalogName, "ns", ns, "policy-name", policyIdentifier.name()))
            .get()) {
      assertThat(response.getStatus()).isEqualTo(OK.getStatusCode());
      LoadPolicyResponse res = response.readEntity(LoadPolicyResponse.class);
      return res.getPolicy();
    }
  }

  public Policy updatePolicy(
      String catalogName,
      PolicyIdentifier policyIdentifier,
      String newPolicyContent,
      String newDescription) {
    String ns = RESTUtil.encodeNamespace(policyIdentifier.namespace());
    try (Response response =
        request(
                "v1/{cat}/namespaces/{ns}/policies/{policy-name}",
                Map.of("cat", catalogName, "ns", ns, "policy-name", policyIdentifier.name()))
            .put(
                Entity.json(
                    UpdatePolicyRequest.builder()
                        .setContent(newPolicyContent)
                        .setDescription(newDescription)
                        .build()))) {
      assertThat(response.getStatus()).isEqualTo(OK.getStatusCode());
      LoadPolicyResponse res = response.readEntity(LoadPolicyResponse.class);
      return res.getPolicy();
    }
  }

  public void dropPolicy(String catalogName, PolicyIdentifier policyIdentifier) {
    String ns = RESTUtil.encodeNamespace(policyIdentifier.namespace());
    try (Response response =
        request(
                "v1/{cat}/namespaces/{ns}/policies/{policy-name}",
                Map.of("cat", catalogName, "ns", ns, "policy-name", policyIdentifier.name()))
            .delete()) {
      assertThat(response.getStatus()).isEqualTo(NO_CONTENT.getStatusCode());
    }
  }

  public List<PolicyIdentifier> listPolicies(
      String catalogName, Namespace namespace, PolicyType policyType) {
    String ns = RESTUtil.encodeNamespace(namespace);
    try (Response response =
        request(
                "v1/{cat}/namespaces/{ns}/policies",
                Map.of("cat", catalogName, "ns", ns),
                policyType != null ? Map.of("policyType", policyType.getName()) : null)
            .get()) {
      assertThat(response.getStatus()).isEqualTo(OK.getStatusCode());
      ListPoliciesResponse res = response.readEntity(ListPoliciesResponse.class);
      return new ArrayList<>(res.getIdentifiers());
    }
  }

  public List<PolicyIdentifier> listPolicies(String catalogName, Namespace namespace) {
    return listPolicies(catalogName, namespace, null);
  }
}
