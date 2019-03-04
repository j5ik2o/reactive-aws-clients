package com.github.j5ik2o.reactive.aws.kinesis.akka

import com.github.j5ik2o.reactive.aws.kinesis.KinesisClient

import scala.concurrent.Future

private[kinesis] class KinesisStreamClientImpl(override val underlying: KinesisClient[Future])
    extends KinesisStreamClient
