package com.github.j5ik2o.reactive.aws.dynamodb.monix

import com.github.j5ik2o.reactive.aws.dynamodb.DynamoDBAsyncClient

private[dynamodb] class DynamoDBMonixClientImpl(override val underlying: DynamoDBAsyncClient)
    extends DynamoDBMonixClient
