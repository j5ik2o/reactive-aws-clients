package com.github.j5ik2o.reactive.aws.kinesis.cats

import com.github.j5ik2o.reactive.aws.kinesis.KinesisClient

import scala.concurrent.Future

private[kinesis] class KinesisReaderTFutureClientImpl(override val underlying: KinesisClient[Future])
    extends KinesisReaderTFutureClient
