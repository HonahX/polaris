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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PolarisPolicyMappingRecord {
  // to serialize/deserialize properties
  public static final String EMPTY_MAP_STRING = "{}";
  private static final ObjectMapper MAPPER = new ObjectMapper();
  private long targetId;
  private long policyId;
  private String policyType;
  private String parameters;

  public PolarisPolicyMappingRecord() {}

  public long getTargetId() {
    return targetId;
  }

  public void setTargetId(long targetId) {
    this.targetId = targetId;
  }

  public long getPolicyId() {
    return policyId;
  }

  public void setPolicyId(long policyId) {
    this.policyId = policyId;
  }

  public String getPolicyType() {
    return policyType;
  }

  public void setPolicyType(String policyType) {
    this.policyType = policyType;
  }

  public String getParameters() {
    return parameters;
  }

  public void setParameters(String parameters) {
    this.parameters = parameters;
  }

  public Map<String, String> getParametersAsMap() {
    if (parameters == null) {
      return new HashMap<>();
    }
    try {
      return MAPPER.readValue(parameters, new TypeReference<>() {});
    } catch (JsonProcessingException ex) {
      throw new IllegalStateException(
          String.format("Failed to deserialize json. parameters %s", parameters), ex);
    }
  }

  public void setParametersAsMap(Map<String, String> parameters) {
    try {
      this.parameters = parameters == null ? null : MAPPER.writeValueAsString(parameters);
    } catch (JsonProcessingException ex) {
      throw new IllegalStateException(
          String.format("Failed to serialize json. properties %s", parameters), ex);
    }
  }

  @JsonCreator
  public PolarisPolicyMappingRecord(
      @JsonProperty("targetId") long targetId,
      @JsonProperty("policyId") long policyId,
      @JsonProperty("policyType") String policyType,
      @JsonProperty("parameters") String parameters) {
    this.targetId = targetId;
    this.policyId = policyId;
    this.policyType = policyType;
    this.parameters = parameters;
  }

  public PolarisPolicyMappingRecord(
      long targetId, long policyId, String policyType, Map<String, String> parameters) {
    this.targetId = targetId;
    this.policyId = policyId;
    this.policyType = policyType;
    this.setParametersAsMap(parameters);
  }

  @Override
  public String toString() {
    return "PolarisPolicyMappingRec{"
        + "targetId="
        + targetId
        + ", policyId="
        + policyId
        + ", policyType='"
        + policyType
        + ", parameters='"
        + parameters
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PolarisPolicyMappingRecord that = (PolarisPolicyMappingRecord) o;
    return targetId == that.targetId
        && policyId == that.policyId
        && Objects.equals(policyType, that.policyType)
        && Objects.equals(parameters, that.parameters);
  }
}
