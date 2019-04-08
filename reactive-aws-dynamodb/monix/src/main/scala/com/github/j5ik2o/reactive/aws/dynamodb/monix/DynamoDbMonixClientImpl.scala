package com.github.j5ik2o.reactive.aws.dynamodb.monix

import com.github.j5ik2o.reactive.aws.dynamodb.DynamoDbAsyncClient

private[dynamodb] class DynamoDbMonixClientImpl(override val underlying: DynamoDbAsyncClient)
    extends DynamoDbMonixClient
