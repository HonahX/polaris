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

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PolicyValidatorTest {

  @Test
  public void testDataCompactionValidContent() {
    PolicyValidator dataCompactionValidator =
        PolicyValidatorFactory.loadValidator(PredefinedPolicyType.DATA_COMPACTION);
    String validJson = "{\"enable\": False}";
    Assertions.assertTrue(dataCompactionValidator.validate(validJson));

    validJson =
        "{\n"
            + "      \"version\": \"2025-02-03\",\n"
            + "      \"enable\": true,\n"
            + "      \"config\": {\n"
            + "        \"target_file_size_bytes\": 134217728,\n"
            + "        \"compaction_strategy\": \"bin-pack\",\n"
            + "        \"max-concurrent-file-group-rewrites\": 5,\n"
            + "        \"my-key\": \"my-value\"\n"
            + "      }\n"
            + "    }";
    Assertions.assertTrue(dataCompactionValidator.validate(validJson));
  }

  @Test
  public void testDataCompactionInvalidContent() {
    PolicyValidator dataCompactionValidator =
        PolicyValidatorFactory.loadValidator(PredefinedPolicyType.DATA_COMPACTION);
    String inValidJson = "{}";
    Assertions.assertFalse(dataCompactionValidator.validate(inValidJson));

    inValidJson = "{\"enable\": true, \"invalid_key\": 12342}";
    Assertions.assertFalse(dataCompactionValidator.validate(inValidJson));
  }
}
