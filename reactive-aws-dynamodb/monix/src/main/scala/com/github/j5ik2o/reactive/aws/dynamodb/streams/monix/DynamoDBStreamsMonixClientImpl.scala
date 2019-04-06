package com.github.j5ik2o.reactive.aws.dynamodb.streams.monix

import com.github.j5ik2o.reactive.aws.dynamodb.streams.DynamoDBStreamsAsyncClient

private[dynamodb] class DynamoDBStreamsMonixClientImpl(override val underlying: DynamoDBStreamsAsyncClient)
    extends DynamoDBStreamsMonixClient
