package com.github.j5ik2o.reactive.aws.dynamodb.streams

import software.amazon.awssdk.services.dynamodb.streams.DynamoDbStreamsClient

private[dynamodb] class DynamoDBStreamsSyncClientImpl(override val underlying: DynamoDbStreamsClient)
    extends DynamoDBStreamsSyncClient
