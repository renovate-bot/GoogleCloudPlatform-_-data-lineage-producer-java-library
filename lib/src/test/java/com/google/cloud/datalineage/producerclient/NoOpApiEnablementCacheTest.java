// Copyright 2024 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.cloud.datalineage.producerclient;

import static org.junit.Assert.assertFalse;

import java.time.Duration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/** * Test suite for NoOpApiEnablementCache */
@RunWith(JUnit4.class)
public class NoOpApiEnablementCacheTest {
  @Test
  public void testMarkServiceAsDisabled() {
    NoOpApiEnablementCache cache = new NoOpApiEnablementCache();
    cache.markServiceAsDisabled("testProject");
    assertFalse(cache.isServiceMarkedAsDisabled("testProject"));
  }

  @Test
  public void testMarkServiceAsDisabledWithOffset() {
    NoOpApiEnablementCache cache = new NoOpApiEnablementCache();
    cache.markServiceAsDisabled("testProject", Duration.ofMinutes(5));
    assertFalse(cache.isServiceMarkedAsDisabled("testProject"));
  }

  @Test
  public void testIsServiceMarkedAsDisabled() {
    NoOpApiEnablementCache cache = new NoOpApiEnablementCache();
    assertFalse(cache.isServiceMarkedAsDisabled("testProject"));
  }
}
