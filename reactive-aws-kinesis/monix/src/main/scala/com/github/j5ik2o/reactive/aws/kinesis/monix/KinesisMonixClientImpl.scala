package com.github.j5ik2o.reactive.aws.kinesis.monix
import com.github.j5ik2o.reactive.aws.kinesis.KinesisClient

import scala.concurrent.Future

private[kinesis] class KinesisMonixClientImpl(override val underlying: KinesisClient[Future]) extends KinesisMonixClient
