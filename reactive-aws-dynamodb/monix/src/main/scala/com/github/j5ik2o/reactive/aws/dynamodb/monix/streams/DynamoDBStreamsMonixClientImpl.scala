package com.github.j5ik2o.reactive.aws.dynamodb.monix.streams

import com.github.j5ik2o.reactive.aws.dynamodb.streams.DynamoDBStreamsAsyncClient

private[dynamodb] class DynamoDBStreamsMonixClientImpl(override val underlying: DynamoDBStreamsAsyncClient)
    extends DynamoDBStreamsMonixClient
