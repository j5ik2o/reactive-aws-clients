package com.github.j5ik2o.reactive.aws.dynamodb.monix

import com.github.j5ik2o.reactive.aws.dynamodb.DynamoDBClient

import scala.concurrent.Future

private[dynamodb] class DynamoDBTaskClientImpl(override val underlying: DynamoDBClient[Future])
    extends DynamoDBTaskClient
