package com.github.j5ik2o.reactive.aws.appsync.cats

import com.github.j5ik2o.reactive.aws.appsync.AppSyncAsyncClient

private[appsync] class AppSyncCatsIOClientImpl(override val underlying: AppSyncAsyncClient) extends AppSyncCatsIOClient
