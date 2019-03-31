package com.github.j5ik2o.reactive.aws.kinesis.akka

import com.github.j5ik2o.reactive.aws.kinesis.KinesisAsyncClient

private[kinesis] class KinesisStreamClientImpl(override val underlying: KinesisAsyncClient) extends KinesisStreamClient
