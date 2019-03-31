// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DeleteItemResponse => ScalaDeleteItemResponse, _ }
import software.amazon.awssdk.services.dynamodb.model.{ DeleteItemResponse => JavaDeleteItemResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteItemResponseOps {

  implicit class JavaDeleteItemResponseOps(val self: JavaDeleteItemResponse) extends AnyVal {

    def toScala: ScalaDeleteItemResponse = {
      ScalaDeleteItemResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withAttributes(Option(self.attributes).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
        .withConsumedCapacity(Option(self.consumedCapacity).map { v =>
          import ConsumedCapacityOps._; v.toScala
        }) // ConsumedCapacity
        .withItemCollectionMetrics(Option(self.itemCollectionMetrics).map { v =>
          import ItemCollectionMetricsOps._; v.toScala
        }) // ItemCollectionMetrics
    }

  }

}
