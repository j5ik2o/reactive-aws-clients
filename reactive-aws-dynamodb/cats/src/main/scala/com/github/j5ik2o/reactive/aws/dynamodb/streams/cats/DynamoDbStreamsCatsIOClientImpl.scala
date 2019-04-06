package com.github.j5ik2o.reactive.aws.dynamodb.streams.cats

import com.github.j5ik2o.reactive.aws.dynamodb.streams.DynamoDbStreamsAsyncClient

class DynamoDbStreamsCatsIOClientImpl(override val underlying: DynamoDbStreamsAsyncClient)
    extends DynamoDbStreamsCatsIOClient
