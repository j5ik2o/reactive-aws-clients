package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ UpdateItemResponse => ScalaUpdateItemResponse }
import software.amazon.awssdk.services.dynamodb.model.{ UpdateItemResponse => JavaUpdateItemResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object UpdateItemResponseOps {

  import AttributeValueOps._
  import ConsumedCapacityOps._
  import ItemCollectionMetricsOps._

  implicit class JavaUpdateItemResponseOps(val self: JavaUpdateItemResponse) extends AnyVal {

    def toScala: ScalaUpdateItemResponse = {
      ScalaUpdateItemResponse()
        .withStatusCode(Option(self.sdkHttpResponse()).map(_.statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse).map(_.headers()).map(_.asScala.toMap.mapValues(_.asScala)))
        .withAttributes(Option(self.attributes).map(_.asScala.toMap.mapValues(_.toScala)))
        .withConsumedCapacity(Option(self.consumedCapacity).map(_.toScala))
        .withItemCollectionMetrics(Option(self.itemCollectionMetrics).map(_.toScala))
    }

  }

}
