package com.github.j5ik2o.reactive.aws.dynamodb.model.v1
import com.amazonaws.services.dynamodbv2.model.{ BatchWriteItemResult => JavaBatchWriteItemResponse }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BatchWriteItemResponse => ScalaBatchWriteItemResponse }

import scala.collection.JavaConverters._

object BatchWriteItemResponseOps {
  import ConsumedCapacityOps._
  import ItemCollectionMetricsOps._
  import WriteRequestOps._

  implicit class JavaBatchWriteItemResponseOps(val self: JavaBatchWriteItemResponse) extends AnyVal {

    def toScala: ScalaBatchWriteItemResponse = {
      ScalaBatchWriteItemResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withUnprocessedItems(Option(self.getUnprocessedItems).map(_.asScala.toMap.mapValues(_.asScala.map(_.toScala))))
        .withItemCollectionMetrics(
          Option(self.getItemCollectionMetrics).map(_.asScala.toMap.mapValues(_.asScala.map(_.toScala)))
        )
        .withConsumedCapacity(Option(self.getConsumedCapacity).map(_.asScala.map(_.toScala)))
    }

  }
}
