package com.github.j5ik2o.reactive.aws.dynamodb.streams

import software.amazon.awssdk.services.dynamodb.streams.DynamoDbStreamsAsyncClient

private[dynamodb] class DynamoDBStreamsAsyncClientImpl(val underlying: DynamoDbStreamsAsyncClient)
    extends DynamoDBStreamsAsyncClient
