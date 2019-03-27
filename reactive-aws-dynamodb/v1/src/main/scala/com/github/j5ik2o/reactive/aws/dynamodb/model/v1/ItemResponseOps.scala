// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ItemResponse => ScalaItemResponse, _ }
import com.amazonaws.services.dynamodbv2.model.{ ItemResponse => JavaItemResponse }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ItemResponseOps {

  implicit class ScalaItemResponseOps(val self: ScalaItemResponse) extends AnyVal {

    def toJava: JavaItemResponse = {
      val result = new JavaItemResponse()
      self.item.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._; result.withItem(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]

      result
    }

  }

  implicit class JavaItemResponseOps(val self: JavaItemResponse) extends AnyVal {

    def toScala: ScalaItemResponse = {
      ScalaItemResponse()
        .withItem(Option(self.getItem).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
    }

  }

}
