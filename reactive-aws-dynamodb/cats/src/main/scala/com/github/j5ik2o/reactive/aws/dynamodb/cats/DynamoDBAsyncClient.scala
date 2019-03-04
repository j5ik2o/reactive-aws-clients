package com.github.j5ik2o.reactive.aws.dynamodb.cats

import cats.data.ReaderT
import com.github.j5ik2o.reactive.aws.dynamodb.DynamoDBClient

import scala.concurrent.{ ExecutionContext, Future }

trait DynamoDBAsyncClient extends DynamoDBClient[ReaderT[Future, ExecutionContext, ?]]
