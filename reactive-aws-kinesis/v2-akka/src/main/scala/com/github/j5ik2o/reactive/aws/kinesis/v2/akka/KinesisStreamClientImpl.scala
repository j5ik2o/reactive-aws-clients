package com.github.j5ik2o.reactive.aws.kinesis.v2.akka

import com.github.j5ik2o.reactive.aws.kinesis.v2.KinesisAsyncClient

private[kinesis] class KinesisStreamClientImpl(override val underlying: KinesisAsyncClient) extends KinesisStreamClient
