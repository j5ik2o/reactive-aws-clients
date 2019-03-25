package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TimeToLiveSpecification => ScalaTimeToLiveSpecification, _ }
import software.amazon.awssdk.services.dynamodb.model.{ TimeToLiveSpecification => JavaTimeToLiveSpecification }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object TimeToLiveSpecificationOps {

  implicit class ScalaTimeToLiveSpecificationOps(val self: ScalaTimeToLiveSpecification) extends AnyVal {

    def toJava: JavaTimeToLiveSpecification = {
      val result = JavaTimeToLiveSpecification.builder()
      self.enabled.map(_.booleanValue).foreach(v => result.enabled(v))            // Boolean
      self.attributeName.filter(_.nonEmpty).foreach(v => result.attributeName(v)) // String

      result.build()
    }

  }

  implicit class JavaTimeToLiveSpecificationOps(val self: JavaTimeToLiveSpecification) extends AnyVal {

    def toScala: ScalaTimeToLiveSpecification = {
      ScalaTimeToLiveSpecification()
        .withEnabled(Option(self.enabled).map(_.booleanValue)) // Boolean
        .withAttributeName(Option(self.attributeName)) // String
    }

  }

}
