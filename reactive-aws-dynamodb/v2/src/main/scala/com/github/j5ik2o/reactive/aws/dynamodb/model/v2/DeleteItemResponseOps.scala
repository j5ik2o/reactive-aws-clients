package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DeleteItemResponse => ScalaDeleteItemResponse }
import software.amazon.awssdk.services.dynamodb.model.{ DeleteItemResponse => JavaDeleteItemResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object DeleteItemResponseOps {

  import AttributeValueOps._
  import ConsumedCapacityOps._
  import ItemCollectionMetricsOps._

  implicit class JavaDeleteItemResponseOps(val self: JavaDeleteItemResponse) extends AnyVal {

    def toScala: ScalaDeleteItemResponse = {
      ScalaDeleteItemResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withAttributes(Option(self.attributes).map(_.asScala.toMap.mapValues(_.toScala)))
        .withConsumedCapacity(Option(self.consumedCapacity).map(_.toScala))
        .withItemCollectionMetrics(Option(self.itemCollectionMetrics).map(_.toScala))
    }

  }

}
