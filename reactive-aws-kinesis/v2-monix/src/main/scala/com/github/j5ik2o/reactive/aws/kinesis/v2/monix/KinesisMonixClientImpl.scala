package com.github.j5ik2o.reactive.aws.kinesis.v2.monix

import com.github.j5ik2o.reactive.aws.kinesis.v2.KinesisAsyncClient

private[kinesis] class KinesisMonixClientImpl(override val underlying: KinesisAsyncClient) extends KinesisMonixClient
