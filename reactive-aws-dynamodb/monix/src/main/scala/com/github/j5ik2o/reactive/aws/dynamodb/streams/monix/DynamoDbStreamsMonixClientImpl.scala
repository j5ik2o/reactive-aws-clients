package com.github.j5ik2o.reactive.aws.dynamodb.streams.monix

import com.github.j5ik2o.reactive.aws.dynamodb.streams.DynamoDbStreamsAsyncClient

private[dynamodb] class DynamoDbStreamsMonixClientImpl(override val underlying: DynamoDbStreamsAsyncClient)
    extends DynamoDbStreamsMonixClient
