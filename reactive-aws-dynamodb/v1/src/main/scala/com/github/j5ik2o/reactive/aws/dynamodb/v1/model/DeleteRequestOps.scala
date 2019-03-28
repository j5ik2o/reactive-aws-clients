// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DeleteRequest => ScalaDeleteRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ DeleteRequest => JavaDeleteRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteRequestOps {

  implicit class ScalaDeleteRequestOps(val self: ScalaDeleteRequest) extends AnyVal {

    def toJava: JavaDeleteRequest = {
      val result = new JavaDeleteRequest()
      self.key.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._; result.withKey(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]

      result
    }

  }

  implicit class JavaDeleteRequestOps(val self: JavaDeleteRequest) extends AnyVal {

    def toScala: ScalaDeleteRequest = {
      ScalaDeleteRequest()
        .withKey(Option(self.getKey).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
    }

  }

}
