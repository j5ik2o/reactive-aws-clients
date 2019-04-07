package com.github.j5ik2o.reactive.aws.dynamodb.streams.akka

import com.github.j5ik2o.reactive.aws.dynamodb.streams.DynamoDbStreamsAsyncClient

private[dynamodb] class DynamoDbStreamsAkkaClientImpl(override val underlying: DynamoDbStreamsAsyncClient)
    extends DynamoDbStreamsAkkaClient
