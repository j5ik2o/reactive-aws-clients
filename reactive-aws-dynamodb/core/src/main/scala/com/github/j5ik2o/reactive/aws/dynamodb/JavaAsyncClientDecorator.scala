package com.github.j5ik2o.reactive.aws.dynamodb

import com.github.j5ik2o.reactive.aws.dynamodb.metrics.DynamoDbAsyncClientMetricsDecorator
import com.github.j5ik2o.reactive.aws.metrics.MetricsReporter
import software.amazon.awssdk.services.dynamodb.{DynamoDbAsyncClient => JavaDynamoDbAsyncClient}

object JavaAsyncClientDecorator {

  def ofMetricsCollector(underlying: JavaDynamoDbAsyncClient, reporter: MetricsReporter): JavaDynamoDbAsyncClient =
    new DynamoDbAsyncClientMetricsDecorator(underlying, reporter)

}

