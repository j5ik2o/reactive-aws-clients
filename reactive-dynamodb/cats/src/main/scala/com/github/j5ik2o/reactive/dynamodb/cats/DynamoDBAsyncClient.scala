package com.github.j5ik2o.reactive.dynamodb.cats

import _root_.cats.data.ReaderT
import com.github.j5ik2o.reactive.dynamodb.DynamoDBClient

import scala.concurrent.{ ExecutionContext, Future }

trait DynamoDBAsyncClient extends DynamoDBClient[ReaderT[Future, ExecutionContext, ?]]
