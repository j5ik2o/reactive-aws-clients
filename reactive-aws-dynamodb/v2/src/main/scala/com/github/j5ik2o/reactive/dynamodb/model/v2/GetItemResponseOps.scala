package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ GetItemResponse => ScalaGetItemResponse }
import software.amazon.awssdk.services.dynamodb.model.{ GetItemResponse => JavaGetItemResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object GetItemResponseOps {

  import AttributeValueOps._
  import ConsumedCapacityOps._

  implicit class ScalaGetItemResponseOps(val self: ScalaGetItemResponse) extends AnyVal {

    def toJava: JavaGetItemResponse = {
      val result = JavaGetItemResponse.builder()
      self.item.map(_.mapValues(_.toJava).asJava).foreach(result.item)
      self.consumedCapacity.map(_.toJava).foreach(v => result.consumedCapacity(v))
      result.build()
    }

  }

  implicit class JavaGetItemResponseOps(val self: JavaGetItemResponse) extends AnyVal {

    def toScala: ScalaGetItemResponse = {
      ScalaGetItemResponse()
        .withStatusCode(Option(self.sdkHttpResponse()).map(_.statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse).map(_.headers()).map(_.asScala.toMap.mapValues(_.asScala)))
        .withItem(Option(self.item).map(_.asScala.toMap.mapValues(_.toScala)))
        .withConsumedCapacity(Option(self.consumedCapacity).map(_.toScala))
    }

  }

}
