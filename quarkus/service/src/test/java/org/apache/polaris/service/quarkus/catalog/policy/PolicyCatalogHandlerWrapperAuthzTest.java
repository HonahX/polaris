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
package org.apache.polaris.service.quarkus.catalog.policy;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.TestProfile;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.apache.iceberg.catalog.TableIdentifier;
import org.apache.iceberg.rest.requests.CreateTableRequest;
import org.apache.polaris.core.auth.AuthenticatedPolarisPrincipal;
import org.apache.polaris.core.entity.PolarisPrivilege;
import org.apache.polaris.core.policy.PredefinedPolicyTypes;
import org.apache.polaris.service.catalog.PolarisCatalogHandlerWrapper;
import org.apache.polaris.service.catalog.policy.PolicyCatalogHandlerWrapper;
import org.apache.polaris.service.context.CallContextCatalogFactory;
import org.apache.polaris.service.quarkus.admin.PolarisAuthzTestBase;
import org.apache.polaris.service.types.AttachPolicyRequest;
import org.apache.polaris.service.types.CreatePolicyRequest;
import org.apache.polaris.service.types.DetachPolicyRequest;
import org.apache.polaris.service.types.GetApplicablePoliciesResponse;
import org.apache.polaris.service.types.ListPoliciesResponse;
import org.apache.polaris.service.types.LoadPolicyResponse;
import org.apache.polaris.service.types.PolicyAttachmentTarget;
import org.apache.polaris.service.types.PolicyIdentifier;
import org.apache.polaris.service.types.UpdatePolicyRequest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

@QuarkusTest
@TestProfile(PolicyCatalogHandlerWrapperAuthzTest.Profile.class)
public class PolicyCatalogHandlerWrapperAuthzTest extends PolarisAuthzTestBase {

  private PolicyCatalogHandlerWrapper newPolicyWrapper(Set<String> activatedPrincipalRoles) {
    return newPolicyWrapper(activatedPrincipalRoles, CATALOG_NAME);
  }

  private PolicyCatalogHandlerWrapper newPolicyWrapper(
      Set<String> activatedPrincipalRoles, String catalogName) {
    final AuthenticatedPolarisPrincipal authenticatedPrincipal =
        new AuthenticatedPolarisPrincipal(principalEntity, activatedPrincipalRoles);
    return new PolicyCatalogHandlerWrapper(
        callContext,
        entityManager,
        metaStoreManager,
        securityContext(authenticatedPrincipal, activatedPrincipalRoles),
        catalogName,
        polarisAuthorizer);
  }

  private PolarisCatalogHandlerWrapper newWrapper() {
    return newWrapper(Set.of());
  }

  private PolarisCatalogHandlerWrapper newWrapper(Set<String> activatedPrincipalRoles) {
    return newWrapper(activatedPrincipalRoles, CATALOG_NAME, callContextCatalogFactory);
  }

  private PolarisCatalogHandlerWrapper newWrapper(
      Set<String> activatedPrincipalRoles, String catalogName, CallContextCatalogFactory factory) {
    final AuthenticatedPolarisPrincipal authenticatedPrincipal =
        new AuthenticatedPolarisPrincipal(principalEntity, activatedPrincipalRoles);
    return new PolarisCatalogHandlerWrapper(
        callContext,
        entityManager,
        metaStoreManager,
        securityContext(authenticatedPrincipal, activatedPrincipalRoles),
        factory,
        catalogName,
        polarisAuthorizer);
  }

  @Test
  public void testCreatePolicyAllSufficientPrivileges() {
    Assertions.assertThat(
            adminService.grantPrivilegeOnCatalogToRole(
                CATALOG_NAME, CATALOG_ROLE2, PolarisPrivilege.POLICY_DROP))
        .isTrue();

    // Use PRINCIPAL_ROLE1 for privilege-testing, PRINCIPAL_ROLE2 for cleanup.
    doTestSufficientPrivileges(
        List.of(PolarisPrivilege.POLICY_CREATE),
        () -> {
          CreatePolicyRequest createPolicyRequest =
              CreatePolicyRequest.builder()
                  .setName("policy_test")
                  .setType(PredefinedPolicyTypes.DATA_COMPACTION.getName())
                  .setContent("{\"enable\": False}")
                  .setDescription("description_test")
                  .build();
          LoadPolicyResponse result =
              newPolicyWrapper(Set.of(PRINCIPAL_ROLE1)).createPolicy(NS2, createPolicyRequest);
        },
        () -> {
          newPolicyWrapper(Set.of(PRINCIPAL_ROLE2)).deletePolicy(NS2, "policy_test");
        });
  }

  @Test
  public void testGetPolicyAllSufficientPrivileges() {
    Assertions.assertThat(
            adminService.grantPrivilegeOnCatalogToRole(
                CATALOG_NAME, CATALOG_ROLE2, PolarisPrivilege.POLICY_CREATE))
        .isTrue();
    Assertions.assertThat(
            adminService.grantPrivilegeOnCatalogToRole(
                CATALOG_NAME, CATALOG_ROLE2, PolarisPrivilege.POLICY_DROP))
        .isTrue();

    final CreatePolicyRequest createPolicyRequest =
        CreatePolicyRequest.builder()
            .setName("policy_test")
            .setType(PredefinedPolicyTypes.DATA_COMPACTION.getName())
            .setContent("{\"enable\": False}")
            .setDescription("description_test")
            .build();
    newPolicyWrapper(Set.of(PRINCIPAL_ROLE2)).createPolicy(NS2, createPolicyRequest);

    doTestSufficientPrivileges(
        List.of(PolarisPrivilege.POLICY_READ),
        () -> {
          newPolicyWrapper(Set.of(PRINCIPAL_ROLE1)).getPolicy(NS2, "policy_test");
        },
        () -> {
          // test
        });

    newPolicyWrapper(Set.of(PRINCIPAL_ROLE2)).deletePolicy(NS2, "policy_test");
  }

  @Test
  public void testCreatePolicyAllSufficientPrivileges2() {
    Assertions.assertThat(
            adminService.grantPrivilegeOnCatalogToRole(
                CATALOG_NAME, CATALOG_ROLE2, PolarisPrivilege.TABLE_DROP))
        .isTrue();
    Assertions.assertThat(
            adminService.grantPrivilegeOnCatalogToRole(
                CATALOG_NAME, CATALOG_ROLE2, PolarisPrivilege.TABLE_WRITE_DATA))
        .isTrue();
    Assertions.assertThat(
            adminService.grantPrivilegeOnCatalogToRole(
                CATALOG_NAME, CATALOG_ROLE2, PolarisPrivilege.POLICY_CREATE))
        .isTrue();

    final TableIdentifier newtable = TableIdentifier.of(NS2, "newtable");
    final CreateTableRequest createRequest =
        CreateTableRequest.builder().withName("newtable").withSchema(SCHEMA).build();
    String testPolicyType = PredefinedPolicyTypes.DATA_COMPACTION.getName();
    String exampleContent = "{\"enable\": False}";
    // Use PRINCIPAL_ROLE1 for privilege-testing, PRINCIPAL_ROLE2 for cleanup.
    doTestSufficientPrivileges(
        List.of(PolarisPrivilege.POLICY_CREATE),
        () -> {
          CreatePolicyRequest createPolicyRequest =
              CreatePolicyRequest.builder()
                  .setName("policy_test")
                  .setType(testPolicyType)
                  .setContent(exampleContent)
                  .setDescription("description_test")
                  .build();
          LoadPolicyResponse result =
              newPolicyWrapper(Set.of(PRINCIPAL_ROLE1)).createPolicy(NS2, createPolicyRequest);
          Assertions.assertThat(result.getPolicy().getName()).isEqualTo("policy_test");
          Assertions.assertThat(result.getPolicy().getPolicyType())
              .isEqualTo(PredefinedPolicyTypes.DATA_COMPACTION.getName());
          Assertions.assertThat(result.getPolicy().getContent()).isEqualTo(exampleContent);
          Assertions.assertThat(result.getPolicy().getDescription()).isEqualTo("description_test");
        },
        () -> {
          //              newWrapper(Set.of(PRINCIPAL_ROLE2)).dropTableWithPurge(newtable);
        });

    doTestSufficientPrivileges(
        List.of(PolarisPrivilege.POLICY_READ),
        () -> {
          LoadPolicyResponse result =
              newPolicyWrapper(Set.of(PRINCIPAL_ROLE1)).getPolicy(NS2, "policy_test");
          Assertions.assertThat(result.getPolicy().getName()).isEqualTo("policy_test");
          Assertions.assertThat(result.getPolicy().getPolicyType())
              .isEqualTo(PredefinedPolicyTypes.DATA_COMPACTION.getName());
          Assertions.assertThat(result.getPolicy().getContent()).isEqualTo(exampleContent);
          Assertions.assertThat(result.getPolicy().getDescription()).isEqualTo("description_test");
        },
        () -> {
          // test
        });
    String updatedContent = "{\"enable\": True}";
    doTestSufficientPrivileges(
        List.of(PolarisPrivilege.POLICY_WRITE),
        () -> {
          UpdatePolicyRequest updatePolicyRequest =
              UpdatePolicyRequest.builder()
                  .setContent(updatedContent)
                  .setDescription("updated_description")
                  .build();
          LoadPolicyResponse result =
              newPolicyWrapper(Set.of(PRINCIPAL_ROLE1))
                  .updatePolicy(NS2, "policy_test", updatePolicyRequest);
          Assertions.assertThat(result.getPolicy().getName()).isEqualTo("policy_test");
          Assertions.assertThat(result.getPolicy().getPolicyType())
              .isEqualTo(PredefinedPolicyTypes.DATA_COMPACTION.getName());
          Assertions.assertThat(result.getPolicy().getContent()).isEqualTo(updatedContent);
          Assertions.assertThat(result.getPolicy().getDescription())
              .isEqualTo("updated_description");
        },
        () -> {});

    doTestSufficientPrivileges(
        List.of(PolarisPrivilege.POLICY_READ),
        () -> {
          LoadPolicyResponse result =
              newPolicyWrapper(Set.of(PRINCIPAL_ROLE1)).getPolicy(NS2, "policy_test");
          Assertions.assertThat(result.getPolicy().getName()).isEqualTo("policy_test");
          Assertions.assertThat(result.getPolicy().getPolicyType())
              .isEqualTo(PredefinedPolicyTypes.DATA_COMPACTION.getName());
          Assertions.assertThat(result.getPolicy().getContent()).isEqualTo(updatedContent);
          Assertions.assertThat(result.getPolicy().getDescription())
              .isEqualTo("updated_description");
        },
        () -> {
          // test
        });

    doTestSufficientPrivileges(
        List.of(PolarisPrivilege.POLICY_DROP),
        () -> {
          newPolicyWrapper(Set.of(PRINCIPAL_ROLE1)).deletePolicy(NS2, "policy_test");
        },
        () -> {
          CreatePolicyRequest createPolicyRequest =
              CreatePolicyRequest.builder()
                  .setName("policy_test")
                  .setType(PredefinedPolicyTypes.DATA_COMPACTION.getName())
                  .setContent(exampleContent)
                  .setDescription("description_test")
                  .build();
          newPolicyWrapper(Set.of(PRINCIPAL_ROLE2)).createPolicy(NS2, createPolicyRequest);
        });
  }

  @Test
  public void testPolicyMappingAllSufficientPrivileges() {
    Assertions.assertThat(
            adminService.grantPrivilegeOnCatalogToRole(
                CATALOG_NAME, CATALOG_ROLE2, PolarisPrivilege.TABLE_DROP))
        .isTrue();
    Assertions.assertThat(
            adminService.grantPrivilegeOnCatalogToRole(
                CATALOG_NAME, CATALOG_ROLE2, PolarisPrivilege.TABLE_WRITE_DATA))
        .isTrue();
    Assertions.assertThat(
            adminService.grantPrivilegeOnCatalogToRole(
                CATALOG_NAME, CATALOG_ROLE2, PolarisPrivilege.TABLE_CREATE))
        .isTrue();
    Assertions.assertThat(
            adminService.grantPrivilegeOnCatalogToRole(
                CATALOG_NAME, CATALOG_ROLE2, PolarisPrivilege.TABLE_READ_DATA))
        .isTrue();
    Assertions.assertThat(
            adminService.grantPrivilegeOnCatalogToRole(
                CATALOG_NAME, CATALOG_ROLE2, PolarisPrivilege.TABLE_READ_PROPERTIES))
        .isTrue();
    Assertions.assertThat(
            adminService.grantPrivilegeOnCatalogToRole(
                CATALOG_NAME, CATALOG_ROLE2, PolarisPrivilege.POLICY_CREATE))
        .isTrue();
    Assertions.assertThat(
            adminService.grantPrivilegeOnCatalogToRole(
                CATALOG_NAME, CATALOG_ROLE2, PolarisPrivilege.POLICY_READ))
        .isTrue();
    Assertions.assertThat(
            adminService.grantPrivilegeOnCatalogToRole(
                CATALOG_NAME, CATALOG_ROLE2, PolarisPrivilege.POLICY_ATTACH))
        .isTrue();
    Assertions.assertThat(
            adminService.grantPrivilegeOnCatalogToRole(
                CATALOG_NAME, CATALOG_ROLE2, PolarisPrivilege.TABLE_ATTACH_POLICY))
        .isTrue();
    Assertions.assertThat(
            adminService.grantPrivilegeOnCatalogToRole(
                CATALOG_NAME, CATALOG_ROLE2, PolarisPrivilege.NAMESPACE_ATTACH_POLICY))
        .isTrue();
    Assertions.assertThat(
            adminService.grantPrivilegeOnCatalogToRole(
                CATALOG_NAME, CATALOG_ROLE2, PolarisPrivilege.NAMESPACE_DETACH_POLICY))
        .isTrue();
    Assertions.assertThat(
            adminService.grantPrivilegeOnCatalogToRole(
                CATALOG_NAME, CATALOG_ROLE2, PolarisPrivilege.TABLE_DETACH_POLICY))
        .isTrue();
    Assertions.assertThat(
            adminService.grantPrivilegeOnCatalogToRole(
                CATALOG_NAME, CATALOG_ROLE2, PolarisPrivilege.POLICY_DETACH))
        .isTrue();
    Assertions.assertThat(
            adminService.grantPrivilegeOnCatalogToRole(
                CATALOG_NAME, CATALOG_ROLE2, PolarisPrivilege.POLICY_LIST))
        .isTrue();

    final TableIdentifier newtable = TableIdentifier.of(NS1, "newtable");
    final List<String> NS1_LIST = Arrays.asList(NS1.levels());
    final CreateTableRequest createRequest =
        CreateTableRequest.builder().withName("newtable").withSchema(SCHEMA).build();
    final String exampleContent = "{\"enable\": False}";
    final CreatePolicyRequest createPolicyRequest =
        CreatePolicyRequest.builder()
            .setName("policy_test")
            .setType(PredefinedPolicyTypes.DATA_COMPACTION.getName())
            .setContent(exampleContent)
            .setDescription("description_test")
            .build();
    newPolicyWrapper(Set.of(PRINCIPAL_ROLE2)).createPolicy(NS2, createPolicyRequest);
    newPolicyWrapper(Set.of(PRINCIPAL_ROLE2)).getPolicy(NS2, "policy_test");
    newWrapper(Set.of(PRINCIPAL_ROLE2)).createTableDirect(NS1, createRequest);
    newWrapper(Set.of(PRINCIPAL_ROLE2)).loadTable(newtable, "");

    PolicyAttachmentTarget tableTarget =
        PolicyAttachmentTarget.builder(PolicyAttachmentTarget.TypeEnum.TABLE_LIKE)
            .setPath(List.of("ns1", "newtable"))
            .build();

    final AttachPolicyRequest attachPolicyRequest =
        AttachPolicyRequest.builder().setTarget(tableTarget).build();

    PolicyAttachmentTarget namespaceTarget =
        PolicyAttachmentTarget.builder(PolicyAttachmentTarget.TypeEnum.NAMESPACE)
            .setPath(List.of("ns1"))
            .build();

    final AttachPolicyRequest attachPolicyToNamespaceRequest =
        AttachPolicyRequest.builder().setTarget(namespaceTarget).build();

    newPolicyWrapper(Set.of(PRINCIPAL_ROLE2))
        .attachPolicy(NS2, "policy_test", attachPolicyToNamespaceRequest);
    GetApplicablePoliciesResponse result =
        newPolicyWrapper(Set.of(PRINCIPAL_ROLE2)).getApplicablePoliciesOnTableLike(newtable, null);
    Assertions.assertThat(result.getPolicies()).hasSize(1);

    final DetachPolicyRequest detachPolicyFromNamespaceRequest =
        DetachPolicyRequest.builder().setTarget(namespaceTarget).build();

    newPolicyWrapper(Set.of(PRINCIPAL_ROLE2))
        .detachPolicy(PolicyIdentifier.of(NS2, "policy_test"), detachPolicyFromNamespaceRequest);
    GetApplicablePoliciesResponse emptyResult =
        newPolicyWrapper(Set.of(PRINCIPAL_ROLE2)).getApplicablePoliciesOnTableLike(newtable, null);
    Assertions.assertThat(emptyResult.getPolicies()).hasSize(0);

    ListPoliciesResponse response =
        newPolicyWrapper(Set.of(PRINCIPAL_ROLE2)).listPolicies(NS2, null);
    Assertions.assertThat(response.getIdentifiers()).hasSize(1);
  }
}
