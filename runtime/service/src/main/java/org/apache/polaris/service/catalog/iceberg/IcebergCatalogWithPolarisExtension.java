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

package org.apache.polaris.service.catalog.iceberg;

import java.io.Closeable;
import java.io.IOException;
import org.apache.iceberg.catalog.Catalog;
import org.apache.iceberg.catalog.SupportsNamespaces;
import org.apache.iceberg.catalog.ViewCatalog;
import org.apache.polaris.service.catalog.credentials.SupportsCredentialDelegation;

public class IcebergCatalogWithPolarisExtension implements Closeable {
  private final Catalog baseCatalog;
  private final SupportsCredentialDelegation credentialVendor;

  private IcebergCatalogWithPolarisExtension(
      Catalog baseCatalog, SupportsCredentialDelegation credentialVendor) {
    this.baseCatalog = baseCatalog;
    this.credentialVendor = credentialVendor;
  }

  public Catalog baseCatalog() {
    return baseCatalog;
  }

  public SupportsNamespaces namespaceCatalog() {
    return (baseCatalog instanceof SupportsNamespaces supportsNamespaces)
        ? supportsNamespaces
        : null;
  }

  public ViewCatalog viewCatalog() {
    return (baseCatalog instanceof ViewCatalog viewCatalog) ? viewCatalog : null;
  }

  public SupportsCredentialDelegation credentialVendor() {
    return credentialVendor;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public void close() throws IOException {
    if (baseCatalog instanceof Closeable closeable) {
      closeable.close();
    }
  }

  // Builder class for IcebergCatalogWithPolarisExtension
  public static class Builder {
    private Catalog baseCatalog;
    private SupportsCredentialDelegation credentialVendor;

    public Builder withBaseCatalog(Catalog baseCatalog) {
      this.baseCatalog = baseCatalog;
      return this;
    }

    public Builder withCredentialVendor(SupportsCredentialDelegation credentialVendor) {
      this.credentialVendor = credentialVendor;
      return this;
    }

    public IcebergCatalogWithPolarisExtension build() {
      if (baseCatalog == null) {
        throw new IllegalStateException("Base catalog must be provided");
      }
      if (credentialVendor == null) {
        throw new IllegalStateException("Credential vendor must be provided");
      }
      return new IcebergCatalogWithPolarisExtension(baseCatalog, credentialVendor);
    }
  }
}
