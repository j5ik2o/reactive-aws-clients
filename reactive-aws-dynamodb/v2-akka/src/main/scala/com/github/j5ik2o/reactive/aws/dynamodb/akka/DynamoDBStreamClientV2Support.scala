package com.github.j5ik2o.reactive.aws.dynamodb.akka

import akka.NotUsed
import akka.stream.scaladsl.Source
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListTablesRequest, ListTablesResponse }

trait DynamoDBStreamClientV2Support { this: DynamoDBStreamClientV2 =>

  def listTablesSource: Source[ListTablesResponse, NotUsed] = Source.single(ListTablesRequest()).via(listTablesFlow)

}
