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

package com.google.cloud.datalineage.producerclient.v1;

import com.google.api.core.ApiClock;
import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.core.ExecutorProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.HeaderProvider;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.WatchdogProvider;
import com.google.cloud.datacatalog.lineage.v1.stub.LineageStubSettings;
import com.google.cloud.datalineage.producerclient.ApiEnablementCacheSettings;
import java.io.IOException;
import javax.annotation.Nullable;
import org.threeten.bp.Duration;

/**
 * Provides an immutable object for storing sync lineage settings. Settings object can be created
 * via Builder.
 */
public final class SyncLineageProducerClientSettings extends LineageBaseSettings {

  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  public static SyncLineageProducerClientSettings defaultInstance() throws IOException {
    return newBuilder().build();
  }

  private SyncLineageProducerClientSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /**
   * * Builder for SyncLineageProducerClientSettings.
   *
   * <p>Lets setting all properties of SyncLineageProducerClientSettings. Can be created by
   * SyncLineageProducerClientSettings.newBuilder method. To create settings object, use build
   * method.
   */
  public static final class Builder extends LineageBaseSettings.Builder {

    private static Builder createDefault() {
      return new Builder(LineageStubSettings.newBuilder());
    }

    Builder(ClientContext clientContext) {
      super(clientContext);
    }

    Builder(SyncLineageProducerClientSettings settings) {
      super(settings);
    }

    Builder(LineageStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    @Override
    public SyncLineageProducerClientSettings build() throws IOException {
      return new SyncLineageProducerClientSettings(this);
    }

    @Override
    public Builder setConnectionCacheSettings(ApiEnablementCacheSettings settings) {
      return (Builder) super.setConnectionCacheSettings(settings);
    }

    @Override
    public Builder setEndpoint(String endpoint) {
      return (Builder) super.setEndpoint(endpoint);
    }

    @Override
    public Builder setClock(ApiClock clock) {
      return (Builder) super.setClock(clock);
    }

    @Override
    public Builder setBackgroundExecutorProvider(ExecutorProvider executorProvider) {
      return (Builder) super.setBackgroundExecutorProvider(executorProvider);
    }

    @Override
    public Builder setCredentialsProvider(CredentialsProvider credentialsProvider) {
      return (Builder) super.setCredentialsProvider(credentialsProvider);
    }

    @Override
    public Builder setHeaderProvider(HeaderProvider headerProvider) {
      return (Builder) super.setHeaderProvider(headerProvider);
    }

    @Override
    public Builder setQuotaProjectId(String quotaProjectId) {
      return (Builder) super.setQuotaProjectId(quotaProjectId);
    }

    @Override
    public Builder setTransportChannelProvider(TransportChannelProvider transportChannelProvider) {
      return (Builder) super.setTransportChannelProvider(transportChannelProvider);
    }

    @Override
    public Builder setWatchdogProvider(@Nullable WatchdogProvider watchdogProvider) {
      return (Builder) super.setWatchdogProvider(watchdogProvider);
    }

    @Override
    public Builder setWatchdogCheckInterval(@Nullable Duration checkInterval) {
      return (Builder) super.setWatchdogCheckInterval(checkInterval);
    }

    @Override
    @Deprecated
    public Builder setExecutorProvider(ExecutorProvider executorProvider) {
      return (Builder) super.setExecutorProvider(executorProvider);
    }
  }
}
