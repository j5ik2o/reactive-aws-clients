package com.github.j5ik2o.reactive.aws.dynamodb.akka

import akka.NotUsed
import akka.stream.scaladsl.Source
import software.amazon.awssdk.services.dynamodb.model.{ ListTablesRequest, ListTablesResponse }

trait DynamoDBStreamClientSupport { this: DynamoDBStreamClient =>

  def listTablesSource: Source[ListTablesResponse, NotUsed] =
    Source.single(ListTablesRequest.builder().build()).via(listTablesFlow)

}
