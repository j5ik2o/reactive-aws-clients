// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DeleteItemResponse => ScalaDeleteItemResponse, _ }
import com.amazonaws.services.dynamodbv2.model.{ DeleteItemResult => JavaDeleteItemResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteItemResponseOps {

  implicit class JavaDeleteItemResponseOps(val self: JavaDeleteItemResponse) extends AnyVal {

    def toScala: ScalaDeleteItemResponse = {
      ScalaDeleteItemResponse()
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
