package com.github.j5ik2o.reactive.aws.dynamodb.akka

import com.github.j5ik2o.reactive.aws.dynamodb.DynamoDBAsyncClient

private[dynamodb] class DynamoDBStreamClientImpl(override val underlying: DynamoDBAsyncClient)
    extends DynamoDBStreamClient
