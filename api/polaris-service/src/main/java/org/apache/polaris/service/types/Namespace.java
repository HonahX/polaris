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

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class Namespace {
  private static final Namespace EMPTY_NAMESPACE = new Namespace(new String[0]);
  private static final Joiner DOT = Joiner.on('.');
  private static final Predicate<String> CONTAINS_NULL_CHARACTER =
      Pattern.compile("\u0000", 256).asPredicate();
  private final String[] levels;

  public static Namespace empty() {
    return EMPTY_NAMESPACE;
  }

  public static Namespace of(String... levels) {
    Preconditions.checkArgument(null != levels, "Cannot create Namespace from null array");
    if (levels.length == 0) {
      return empty();
    } else {
      for (String level : levels) {
        Preconditions.checkNotNull(level, "Cannot create a namespace with a null level");
        Preconditions.checkArgument(
            !CONTAINS_NULL_CHARACTER.test(level),
            "Cannot create a namespace with the null-byte character");
      }

      return new Namespace(levels);
    }
  }

  private Namespace(String[] levels) {
    this.levels = levels;
  }

  public String[] levels() {
    return this.levels;
  }

  public String level(int pos) {
    return this.levels[pos];
  }

  public boolean isEmpty() {
    return this.levels.length == 0;
  }

  public int length() {
    return this.levels.length;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) {
      return true;
    } else if (other != null && this.getClass() == other.getClass()) {
      Namespace namespace = (Namespace) other;
      return Arrays.equals(this.levels, namespace.levels);
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(this.levels);
  }

  @Override
  public String toString() {
    return DOT.join(this.levels);
  }
}
