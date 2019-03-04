package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ ItemResponse => JavaItemResponse }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ItemResponse => ScalaItemResponse }

import scala.collection.JavaConverters._

object ItemResponseOps {

  import AttributeValueOps._

  implicit class ScalaItemResponseOps(val self: ScalaItemResponse) extends AnyVal {

    def toJava: JavaItemResponse = {
      val result = new JavaItemResponse()
      self.item.map(_.mapValues(_.toJava).asJava).foreach(result.setItem)
      result
    }

  }

  implicit class JavaItemResponseOps(val self: JavaItemResponse) extends AnyVal {

    def toScala: ScalaItemResponse = {
      ScalaItemResponse()
        .withItem(Option(self.getItem).map(_.asScala.toMap.mapValues(_.toScala)))
    }

  }

}
