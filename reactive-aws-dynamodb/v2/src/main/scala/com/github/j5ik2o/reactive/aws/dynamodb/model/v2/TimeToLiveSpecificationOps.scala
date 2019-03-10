package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TimeToLiveSpecification => ScalaTimeToLiveSpecification }
import software.amazon.awssdk.services.dynamodb.model.{ TimeToLiveSpecification => JavaTimeToLiveSpecification }

object TimeToLiveSpecificationOps {

  implicit class ScalaTimeToLiveSpecificationOps(val self: ScalaTimeToLiveSpecification) extends AnyVal {

    def toJava: JavaTimeToLiveSpecification = {
      val result = JavaTimeToLiveSpecification.builder()
      self.attributeName.foreach(result.attributeName)
      self.enabled.foreach(v => result.enabled(v))
      result.build()
    }

  }

  implicit class JavaTimeToLiveSpecificationOps(val self: JavaTimeToLiveSpecification) extends AnyVal {

    def toScala: ScalaTimeToLiveSpecification = {
      ScalaTimeToLiveSpecification()
        .withAttributeName(Option(self.attributeName))
        .withEnabled(Option(self.enabled).map(_.booleanValue()))
    }

  }

}
