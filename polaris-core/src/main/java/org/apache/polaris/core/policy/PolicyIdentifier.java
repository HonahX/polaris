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

import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import org.apache.iceberg.catalog.Namespace;

// This is a rename of Iceberg's TableIdentifier
public class PolicyIdentifier {
  private static final Splitter DOT = Splitter.on('.');
  private final Namespace namespace;
  private final String name;

  PolicyIdentifier(Namespace namespace, String name) {
    Preconditions.checkArgument(
        name != null && !name.isEmpty(), "Invalid policy name: null or empty");
    Preconditions.checkArgument(namespace != null, "Invalid Namespace: null");
    this.namespace = namespace;
    this.name = name;
  }

  public static PolicyIdentifier of(String... names) {
    Preconditions.checkArgument(names != null, "Cannot create policy identifier from null array");
    Preconditions.checkArgument(
        names.length > 0, "Cannot create policy identifier without a policy name");
    return new PolicyIdentifier(
        Namespace.of(Arrays.copyOf(names, names.length - 1)), names[names.length - 1]);
  }

  public static PolicyIdentifier of(Namespace namespace, String name) {
    return new PolicyIdentifier(namespace, name);
  }

  public static PolicyIdentifier parse(String identifier) {
    Preconditions.checkArgument(identifier != null, "Cannot parse policy identifier: null");
    Iterable<String> parts = DOT.split(identifier);
    return of(Iterables.toArray(parts, String.class));
  }

  public boolean hasNamespace() {
    return !this.namespace.isEmpty();
  }

  public Namespace namespace() {
    return this.namespace;
  }

  public String name() {
    return this.name;
  }

  public PolicyIdentifier toLowerCase() {
    String[] newLevels =
        Arrays.stream(this.namespace().levels()).map(String::toLowerCase).toArray(String[]::new);
    String newName = this.name().toLowerCase(Locale.ROOT);
    return of(Namespace.of(newLevels), newName);
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) {
      return true;
    } else if (other != null && this.getClass() == other.getClass()) {
      PolicyIdentifier that = (PolicyIdentifier) other;
      return this.namespace.equals(that.namespace) && this.name.equals(that.name);
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.namespace, this.name);
  }

  @Override
  public String toString() {
    if (this.hasNamespace()) {
      String var10000 = this.namespace.toString();
      return var10000 + "." + this.name;
    } else {
      return this.name;
    }
  }
}
