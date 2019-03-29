package com.github.j5ik2o.reactive.aws.dynamodb.cats

import com.github.j5ik2o.reactive.aws.dynamodb.DynamoDBClient

import scala.concurrent.Future

private[dynamodb] class DynamoDBReaderTFutureClientImpl(override val underlying: DynamoDBClient[Future])
    extends DynamoDBReaderTFutureClient
