/*
 * Copyright (c) 2010 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.api.client.googleapis;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.util.Key;

/**
 * Generic Google URL providing for some common query parameters used in Google
 * API's such as the {@link #alt} and {@link #fields} parameters.
 * 
 * @since 1.0
 * @author Yaniv Inbar
 */
public class GoogleUrl extends GenericUrl {

  /** Whether to pretty print the output. */
  @Key
  public Boolean prettyprint;

  /** Alternate wire format. */
  @Key
  public String alt;

  /** Partial fields mask. */
  @Key
  public String fields;

  public GoogleUrl() {
  }

  /**
   * @param encodedUrl encoded URL, including any existing query parameters that
   *        should be parsed
   */
  public GoogleUrl(String encodedUrl) {
    super(encodedUrl);
  }
}