package com.github.j5ik2o.reactive.aws.dynamodb.v2.monix

import com.github.j5ik2o.reactive.aws.dynamodb.v2.DynamoDBAsyncClient

private[dynamodb] class DynamoDBMonixClientImpl(override val underlying: DynamoDBAsyncClient)
    extends DynamoDBMonixClient
