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

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.polaris.core.persistence.PolarisObjectMapperUtil;
import org.junit.jupiter.api.Test;

class PolarisEntityCoreTest {

  @Test
  void jsonRoundTripPreservesCoreFields() {
    PolarisEntityCore core =
        new PolarisEntityCore.Builder<>()
            .catalogId(10L)
            .id(20L)
            .parentId(2L)
            .typeCode(PolarisEntityType.NAMESPACE.getCode())
            .name("namespace_name")
            .entityVersion(3)
            .build();

    String serialized = PolarisObjectMapperUtil.serialize(core);
    PolarisEntityCore deserialized =
        PolarisObjectMapperUtil.deserialize(serialized, PolarisEntityCore.class);

    assertThat(deserialized).isEqualTo(core);
  }
}
