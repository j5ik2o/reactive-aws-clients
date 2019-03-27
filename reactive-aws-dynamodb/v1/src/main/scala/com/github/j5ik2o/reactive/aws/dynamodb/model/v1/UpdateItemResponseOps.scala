// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ UpdateItemResponse => ScalaUpdateItemResponse, _ }
import com.amazonaws.services.dynamodbv2.model.{ UpdateItemResult => JavaUpdateItemResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateItemResponseOps {

  implicit class JavaUpdateItemResponseOps(val self: JavaUpdateItemResponse) extends AnyVal {

    def toScala: ScalaUpdateItemResponse = {
      ScalaUpdateItemResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withAttributes(Option(self.getAttributes).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
        .withConsumedCapacity(Option(self.getConsumedCapacity).map { v =>
          import ConsumedCapacityOps._; v.toScala
        }) // ConsumedCapacity
        .withItemCollectionMetrics(Option(self.getItemCollectionMetrics).map { v =>
          import ItemCollectionMetricsOps._; v.toScala
        }) // ItemCollectionMetrics
    }

  }

}
