package com.github.j5ik2o.reactive.kinesis.cats

import cats.data.ReaderT
import com.github.j5ik2o.reactive.kinesis.KinesisClient

import scala.concurrent.{ ExecutionContext, Future }

trait KinesisAsyncClient extends KinesisClient[ReaderT[Future, ExecutionContext, ?]] {}
