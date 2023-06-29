/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.pekko.http.cors.javadsl.model;

import org.apache.pekko.http.impl.util.Util;
import org.apache.pekko.http.javadsl.model.headers.HttpOrigin;
import org.apache.pekko.http.cors.scaladsl.model.HttpOriginMatcher$;

public abstract class HttpOriginMatcher {

  public abstract boolean matches(HttpOrigin origin);

  public static HttpOriginMatcher ALL =
      org.apache.pekko.http.cors.scaladsl.model.HttpOriginMatcher.$times$.MODULE$;

  public static HttpOriginMatcher create(HttpOrigin... origins) {
    return HttpOriginMatcher$.MODULE$.apply(
        Util.<HttpOrigin, org.apache.pekko.http.scaladsl.model.headers.HttpOrigin>convertArray(
            origins));
  }

  public static HttpOriginMatcher strict(HttpOrigin... origins) {
    return HttpOriginMatcher$.MODULE$.strict(
        Util.<HttpOrigin, org.apache.pekko.http.scaladsl.model.headers.HttpOrigin>convertArray(
            origins));
  }
}
