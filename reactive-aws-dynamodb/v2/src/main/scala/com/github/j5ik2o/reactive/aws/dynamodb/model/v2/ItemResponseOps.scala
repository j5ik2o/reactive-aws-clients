package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ItemResponse => ScalaItemResponse }
import software.amazon.awssdk.services.dynamodb.model.{ ItemResponse => JavaItemResponse }

import scala.collection.JavaConverters._

object ItemResponseOps {

  import AttributeValueOps._

  implicit class ScalaItemResponseOps(val self: ScalaItemResponse) extends AnyVal {

    def toJava: JavaItemResponse = {
      val result = JavaItemResponse.builder()
      self.item.map(_.mapValues(_.toJava).asJava).foreach(result.item)
      result.build()
    }

  }

  implicit class JavaItemResponseOps(val self: JavaItemResponse) extends AnyVal {

    def toScala: ScalaItemResponse = {
      ScalaItemResponse()
        .withItem(Option(self.item).map(_.asScala.toMap.mapValues(_.toScala)))
    }

  }

}
