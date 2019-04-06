package com.github.j5ik2o.reactive.aws.dynamodb.cats

import com.github.j5ik2o.reactive.aws.dynamodb.DynamoDbAsyncClient

private[dynamodb] class DynamoDbCatsIOClientImpl(override val underlying: DynamoDbAsyncClient)
    extends DynamoDbCatsIOClient
