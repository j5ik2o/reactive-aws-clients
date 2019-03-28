package com.github.j5ik2o.reactive.aws.dynamodb.v2.akka

import akka.NotUsed
import akka.stream.scaladsl.Source
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListTablesRequest, ListTablesResponse }

trait DynamoDBStreamClientSupport { this: DynamoDBStreamClient =>

  def listTablesSource: Source[ListTablesResponse, NotUsed] = Source.single(ListTablesRequest()).via(listTablesFlow)

}
