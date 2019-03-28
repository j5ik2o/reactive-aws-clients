// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  TransactWriteItemsResponse => ScalaTransactWriteItemsResponse,
  _
}
import com.amazonaws.services.dynamodbv2.model.{ TransactWriteItemsResult => JavaTransactWriteItemsResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object TransactWriteItemsResponseOps {

  implicit class JavaTransactWriteItemsResponseOps(val self: JavaTransactWriteItemsResponse) extends AnyVal {

    def toScala: ScalaTransactWriteItemsResponse = {
      ScalaTransactWriteItemsResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withConsumedCapacity(Option(self.getConsumedCapacity).map { v =>
          import scala.collection.JavaConverters._, ConsumedCapacityOps._; v.asScala.map(_.toScala)
        }) // Seq[ConsumedCapacity]
        .withItemCollectionMetrics(Option(self.getItemCollectionMetrics).map { v =>
          import scala.collection.JavaConverters._, ItemCollectionMetricsOps._;
          v.asScala.toMap.mapValues(_.asScala.map(_.toScala))
        }) // Map[String, Seq[ItemCollectionMetrics]]
    }

  }

}
