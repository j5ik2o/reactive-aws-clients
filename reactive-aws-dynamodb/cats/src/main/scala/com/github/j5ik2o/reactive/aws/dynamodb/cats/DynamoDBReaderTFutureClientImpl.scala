package com.github.j5ik2o.reactive.aws.dynamodb.cats

import com.github.j5ik2o.reactive.aws.dynamodb.DynamoDBAsyncClient

private[dynamodb] class DynamoDBReaderTFutureClientImpl(override val underlying: DynamoDBAsyncClient)
    extends DynamoDBReaderTFutureClient
