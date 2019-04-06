package com.github.j5ik2o.reactive.aws.appsync.monix

import com.github.j5ik2o.reactive.aws.appsync.AppSyncAsyncClient

private[appsync] class AppSyncMonixClientImpl(override val underlying: AppSyncAsyncClient) extends AppSyncMonixClient
