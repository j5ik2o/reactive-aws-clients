package com.github.j5ik2o.reactive.aws.appsync

import software.amazon.awssdk.services.appsync.{ AppSyncAsyncClient => JavaAppSyncAsyncClient }

private[appsync] class AppSyncAsyncClientImpl(override val underlying: JavaAppSyncAsyncClient)
    extends AppSyncAsyncClient
