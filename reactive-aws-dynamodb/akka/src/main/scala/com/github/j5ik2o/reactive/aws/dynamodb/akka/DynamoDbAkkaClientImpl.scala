package com.github.j5ik2o.reactive.aws.dynamodb.akka

import com.github.j5ik2o.reactive.aws.dynamodb.DynamoDbAsyncClient

private[dynamodb] class DynamoDbAkkaClientImpl(override val underlying: DynamoDbAsyncClient) extends DynamoDbAkkaClient
