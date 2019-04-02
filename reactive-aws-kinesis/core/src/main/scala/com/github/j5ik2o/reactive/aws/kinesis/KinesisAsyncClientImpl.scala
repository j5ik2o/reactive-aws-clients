package com.github.j5ik2o.reactive.aws.kinesis

import software.amazon.awssdk.services.kinesis.{ KinesisAsyncClient => JavaKinesisAsyncClient }

import scala.concurrent.{ ExecutionContext, Future }

private[kinesis] class KinesisAsyncClientImpl(override val underlying: JavaKinesisAsyncClient)(
    implicit val ec: ExecutionContext
) extends KinesisAsyncClient
