package com.github.j5ik2o.reactive.aws.dynamodb

import software.amazon.awssdk.services.dynamodb.{ DynamoDbClient => JavaDynamoDbClient }

private[dynamodb] class DynamoDbSyncClientImpl(override val underlying: JavaDynamoDbClient) extends DynamoDbSyncClient
