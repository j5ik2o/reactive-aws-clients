package com.github.j5ik2o.reactive.aws.dynamodb

import com.github.j5ik2o.reactive.aws.dynamodb.metrics.DynamoDbSyncClientMetricsDecorator
import com.github.j5ik2o.reactive.aws.metrics.MetricsReporter
import software.amazon.awssdk.services.dynamodb.{ DynamoDbClient => JavaDynamoDbClient }

object JavaSyncClientDecorator {

  def ofMetricsCollector(underlying: JavaDynamoDbClient, reporter: MetricsReporter): JavaDynamoDbClient =
    new DynamoDbSyncClientMetricsDecorator(underlying, reporter)

}
