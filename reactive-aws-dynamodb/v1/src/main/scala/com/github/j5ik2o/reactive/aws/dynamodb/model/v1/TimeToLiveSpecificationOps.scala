package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ TimeToLiveSpecification => JavaTimeToLiveSpecification }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TimeToLiveSpecification => ScalaTimeToLiveSpecification }

object TimeToLiveSpecificationOps {

  implicit class ScalaTimeToLiveSpecificationOps(val self: ScalaTimeToLiveSpecification) extends AnyVal {

    def toJava: JavaTimeToLiveSpecification = {
      val result = new JavaTimeToLiveSpecification()
      self.attributeName.foreach(result.setAttributeName)
      self.enabled.foreach(v => result.setEnabled(v))
      result
    }

  }

  implicit class JavaTimeToLiveSpecificationOps(val self: JavaTimeToLiveSpecification) extends AnyVal {

    def toScala: ScalaTimeToLiveSpecification = {
      ScalaTimeToLiveSpecification()
        .withAttributeName(Option(self.getAttributeName)).withEnabled(Option(self.getEnabled).map(_.booleanValue()))
    }

  }

}
