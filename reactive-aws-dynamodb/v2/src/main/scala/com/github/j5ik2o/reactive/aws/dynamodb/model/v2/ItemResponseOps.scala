package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ItemResponse => ScalaItemResponse, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ItemResponse => JavaItemResponse }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ItemResponseOps {

  implicit class ScalaItemResponseOps(val self: ScalaItemResponse) extends AnyVal {

    def toJava: JavaItemResponse = {
      val result = JavaItemResponse.builder()
                                          self.item.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._, AttributeValueOps._; result.item(v.mapValues(_.toJava).asJava) } // Map[String, AttributeValue], case Map[_], UserDefined

      result.build()
    }

  }

  implicit class JavaItemResponseOps(val self: JavaItemResponse) extends AnyVal {

     def toScala: ScalaItemResponse = {
       ScalaItemResponse()
                    .withItem(Option(self.item).map{ v => import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala) }) // Map[String, AttributeValue], Map-8
     }

   }

}