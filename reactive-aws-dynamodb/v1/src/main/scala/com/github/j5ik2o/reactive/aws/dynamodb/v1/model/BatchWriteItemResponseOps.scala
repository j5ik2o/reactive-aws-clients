// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BatchWriteItemResponse => ScalaBatchWriteItemResponse, _ }
import com.amazonaws.services.dynamodbv2.model.{ BatchWriteItemResult => JavaBatchWriteItemResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object BatchWriteItemResponseOps {

  implicit class JavaBatchWriteItemResponseOps(val self: JavaBatchWriteItemResponse) extends AnyVal {

    def toScala: ScalaBatchWriteItemResponse = {
      ScalaBatchWriteItemResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withUnprocessedItems(Option(self.getUnprocessedItems).map { v =>
          import scala.collection.JavaConverters._, WriteRequestOps._;
          v.asScala.toMap.mapValues(_.asScala.map(_.toScala))
        }) // Map[String, Seq[WriteRequest]]
        .withItemCollectionMetrics(Option(self.getItemCollectionMetrics).map { v =>
          import scala.collection.JavaConverters._, ItemCollectionMetricsOps._;
          v.asScala.toMap.mapValues(_.asScala.map(_.toScala))
        }) // Map[String, Seq[ItemCollectionMetrics]]
        .withConsumedCapacity(Option(self.getConsumedCapacity).map { v =>
          import scala.collection.JavaConverters._, ConsumedCapacityOps._; v.asScala.map(_.toScala)
        }) // Seq[ConsumedCapacity]
    }

  }

}
