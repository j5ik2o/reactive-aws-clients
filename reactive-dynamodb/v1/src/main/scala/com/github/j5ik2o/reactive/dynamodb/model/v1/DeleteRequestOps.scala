package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ DeleteRequest => JavaDeleteRequest }
import com.github.j5ik2o.reactive.dynamodb.model.{ DeleteRequest => ScalaDeleteRequest }

import scala.collection.JavaConverters._

object DeleteRequestOps {

  import AttributeValueOps._

  implicit class ScalaDeleteRequestOps(val self: ScalaDeleteRequest) extends AnyVal {

    def toJava: JavaDeleteRequest = {
      val result = new JavaDeleteRequest()
      self.key.foreach(v => result.setKey(v.mapValues(_.toJava).asJava))
      result
    }

  }

  implicit class JavaDeleteRequestOps(val self: JavaDeleteRequest) extends AnyVal {

    def toScala: ScalaDeleteRequest = {
      ScalaDeleteRequest().withKey(Option(self.getKey).map(_.asScala.toMap.mapValues(_.toScala)))
    }

  }

}
