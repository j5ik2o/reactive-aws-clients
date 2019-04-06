package com.github.j5ik2o.reactive.aws.appsync.akka

import com.github.j5ik2o.reactive.aws.appsync.AppSyncAsyncClient

private[appsync] class AppSyncAkkaClientImpl(override val underlying: AppSyncAsyncClient) extends AppSyncAkkaClient
