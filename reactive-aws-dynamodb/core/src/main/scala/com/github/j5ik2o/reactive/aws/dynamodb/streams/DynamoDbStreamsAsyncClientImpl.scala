package com.github.j5ik2o.reactive.aws.dynamodb.streams

import software.amazon.awssdk.services.dynamodb.streams.{ DynamoDbStreamsAsyncClient => JavaDynamoDbStreamsAsyncClient }

private[dynamodb] class DynamoDbStreamsAsyncClientImpl(val underlying: JavaDynamoDbStreamsAsyncClient)
    extends DynamoDbStreamsAsyncClient
