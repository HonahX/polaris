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
package org.apache.polaris.service.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * Polaris-specific extension of Iceberg's {@link org.apache.iceberg.rest.requests.RegisterTableRequest}
 * that surfaces the {@code overwrite} option introduced in the REST specification.
 */
public class RegisterTableRequest implements org.apache.iceberg.rest.requests.RegisterTableRequest {

  private String name;
  private String metadataLocation;
  private boolean overwrite;

  @Override
  @JsonProperty("name")
  @ApiModelProperty(required = true, value = "")
  public String name() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  @Override
  @JsonProperty("metadata-location")
  @ApiModelProperty(required = true, value = "")
  public String metadataLocation() {
    return metadataLocation;
  }

  @JsonProperty("metadata-location")
  public void setMetadataLocation(String metadataLocation) {
    this.metadataLocation = metadataLocation;
  }

  @JsonProperty("overwrite")
  @ApiModelProperty(value = "")
  public boolean overwrite() {
    return overwrite;
  }

  @JsonProperty("overwrite")
  public void setOverwrite(boolean overwrite) {
    this.overwrite = overwrite;
  }

  @Override
  public void validate() {
    // Defer to the default validation behaviour of the Iceberg REST model
    org.apache.iceberg.rest.requests.RegisterTableRequest.super.validate();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof RegisterTableRequest)) {
      return false;
    }
    RegisterTableRequest that = (RegisterTableRequest) o;
    return overwrite == that.overwrite
        && Objects.equals(name, that.name)
        && Objects.equals(metadataLocation, that.metadataLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, metadataLocation, overwrite);
  }

  @Override
  public String toString() {
    return "RegisterTableRequest{"
        + "name='"
        + name
        + '\''
        + ", metadataLocation='"
        + metadataLocation
        + '\''
        + ", overwrite="
        + overwrite
        + '}';
  }
}
