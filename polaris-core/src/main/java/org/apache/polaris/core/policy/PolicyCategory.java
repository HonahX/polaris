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
package org.apache.polaris.core.policy;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.google.common.collect.ImmutableMap;
import jakarta.annotation.Nullable;
import org.apache.polaris.core.entity.PolarisEntitySubType;

public enum PolicyCategory {
  // TODO: think twice about whether to add PolicyCategory
  BACKGROUND(null);

  private final PolarisEntitySubType policyCategorySubType;

  private static final ImmutableMap<PolarisEntitySubType, PolicyCategory> REVERSE_NAME_MAPPING_ARRAY;

  static {
    ImmutableMap.Builder<PolarisEntitySubType, PolicyCategory> builder = ImmutableMap.builder();
    // populate mapping array
    for (PolicyCategory category : PolicyCategory.values()) {
    builder.put(category.policyCategorySubType, category);
    }
    REVERSE_NAME_MAPPING_ARRAY = builder.build();
  }

  PolicyCategory(PolarisEntitySubType policyCategorySubType) {
    this.policyCategorySubType = policyCategorySubType;
  }

  @JsonValue
  public int getCode() {
    return policyCategorySubType.getCode();
  }

  public PolarisEntitySubType getPolicyCategorySubType() {
    return policyCategorySubType;
  }

  public static @Nullable PolicyCategory fromPolarisEntitySubType(PolarisEntitySubType polarisEntitySubType) {
    return REVERSE_NAME_MAPPING_ARRAY.get(polarisEntitySubType);
  }

  @JsonCreator
  public static @Nullable PolicyCategory fromCode(int entityTypeCode) {
    PolarisEntitySubType polarisSubType = PolarisEntitySubType.fromCode(entityTypeCode);
    if (polarisSubType == null) {
      return null;
    }

    return REVERSE_NAME_MAPPING_ARRAY.get(polarisSubType);
  }
}
