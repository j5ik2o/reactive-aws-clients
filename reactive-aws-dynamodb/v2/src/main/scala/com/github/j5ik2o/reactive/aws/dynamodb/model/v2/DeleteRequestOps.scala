package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DeleteRequest => ScalaDeleteRequest }
import software.amazon.awssdk.services.dynamodb.model.{ DeleteRequest => JavaDeleteRequest }

import scala.collection.JavaConverters._

object DeleteRequestOps {

  import AttributeValueOps._

  implicit class ScalaDeleteRequestOps(val self: ScalaDeleteRequest) extends AnyVal {

    def toJava: JavaDeleteRequest = {
      val result = JavaDeleteRequest.builder()
      self.key.foreach(v => result.key(v.mapValues(_.toJava).asJava))
      result.build()
    }

  }

  implicit class JavaDeleteRequestOps(val self: JavaDeleteRequest) extends AnyVal {

    def toScala: ScalaDeleteRequest = {
      ScalaDeleteRequest().withKey(Option(self.key().asScala.toMap.mapValues(_.toScala)))
    }

  }

}
