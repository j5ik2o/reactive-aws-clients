package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ TransactWriteItemsResult => JavaTransactWriteItemsResponse }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TransactWriteItemsResponse => ScalaTransactWriteItemsResponse }

import scala.collection.JavaConverters._

object TransactWriteItemsResponseOps {

  import ConsumedCapacityOps._
  import ItemCollectionMetricsOps._

  implicit class JavaTransactWriteItemsResponseOps(val self: JavaTransactWriteItemsResponse) extends AnyVal {

    def toScala: ScalaTransactWriteItemsResponse = {
      ScalaTransactWriteItemsResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withConsumedCapacity(Option(self.getConsumedCapacity).map(_.asScala.map(_.toScala)))
        .withItemCollectionMetrics(
          Option(self.getItemCollectionMetrics).map(_.asScala.toMap.mapValues(_.asScala.map(_.toScala)))
        )
    }

  }

}
