package com.github.j5ik2o.reactive.aws.dynamodb.streams

import software.amazon.awssdk.services.dynamodb.streams.{ DynamoDbStreamsClient => JavaDynamoDbStreamsClient }

private[dynamodb] class DynamoDbStreamsSyncClientImpl(override val underlying: JavaDynamoDbStreamsClient)
    extends DynamoDbStreamsSyncClient
