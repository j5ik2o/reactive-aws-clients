package com.github.j5ik2o.reactive.aws.dynamodb.v2.cats

import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient

private[cats] class DynamoDBAsyncClientImpl(override val underlying: DynamoDbAsyncClient) extends DynamoDBAsyncClient
