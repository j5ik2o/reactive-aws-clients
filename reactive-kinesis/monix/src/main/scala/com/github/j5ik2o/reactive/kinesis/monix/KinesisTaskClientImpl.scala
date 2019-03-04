package com.github.j5ik2o.reactive.kinesis.monix
import com.github.j5ik2o.reactive.kinesis.KinesisClient

import scala.concurrent.Future

private[kinesis] class KinesisTaskClientImpl(override val underlying: KinesisClient[Future]) extends KinesisTaskClient
