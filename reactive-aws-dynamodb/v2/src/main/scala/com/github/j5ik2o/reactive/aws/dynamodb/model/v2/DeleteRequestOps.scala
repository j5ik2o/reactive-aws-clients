package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DeleteRequest => ScalaDeleteRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ DeleteRequest => JavaDeleteRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteRequestOps {

  implicit class ScalaDeleteRequestOps(val self: ScalaDeleteRequest) extends AnyVal {

    def toJava: JavaDeleteRequest = {
      val result = JavaDeleteRequest.builder()
                                          self.key.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._, AttributeValueOps._; result.key(v.mapValues(_.toJava).asJava) } // Map[String, AttributeValue], case Map[_], UserDefined

      result.build()
    }

  }

  implicit class JavaDeleteRequestOps(val self: JavaDeleteRequest) extends AnyVal {

     def toScala: ScalaDeleteRequest = {
       ScalaDeleteRequest()
                    .withKey(Option(self.key).map{ v => import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala) }) // Map[String, AttributeValue], Map-8
     }

   }

}