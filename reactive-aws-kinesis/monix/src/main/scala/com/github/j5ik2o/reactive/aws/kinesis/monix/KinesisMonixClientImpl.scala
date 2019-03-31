package com.github.j5ik2o.reactive.aws.kinesis.monix

import com.github.j5ik2o.reactive.aws.kinesis.KinesisAsyncClient

private[kinesis] class KinesisMonixClientImpl(override val underlying: KinesisAsyncClient) extends KinesisMonixClient
