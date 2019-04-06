package com.github.j5ik2o.reactive.aws.appsync

import software.amazon.awssdk.services.appsync.{ AppSyncClient => JavaAppSyncClient }

private[appsync] class AppSyncSyncClientImpl(override val underlying: JavaAppSyncClient) extends AppSyncSyncClient
