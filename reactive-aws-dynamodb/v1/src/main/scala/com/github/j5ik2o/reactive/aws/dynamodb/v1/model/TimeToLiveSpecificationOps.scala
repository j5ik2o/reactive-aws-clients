// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TimeToLiveSpecification => ScalaTimeToLiveSpecification, _ }
import com.amazonaws.services.dynamodbv2.model.{ TimeToLiveSpecification => JavaTimeToLiveSpecification }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object TimeToLiveSpecificationOps {

  implicit class ScalaTimeToLiveSpecificationOps(val self: ScalaTimeToLiveSpecification) extends AnyVal {

    def toJava: JavaTimeToLiveSpecification = {
      val result = new JavaTimeToLiveSpecification()
      self.enabled.map(_.booleanValue).foreach(v => result.withEnabled(v))            // Boolean
      self.attributeName.filter(_.nonEmpty).foreach(v => result.withAttributeName(v)) // String

      result
    }

  }

  implicit class JavaTimeToLiveSpecificationOps(val self: JavaTimeToLiveSpecification) extends AnyVal {

    def toScala: ScalaTimeToLiveSpecification = {
      ScalaTimeToLiveSpecification()
        .withEnabled(Option(self.getEnabled).map(_.booleanValue)) // Boolean
        .withAttributeName(Option(self.getAttributeName)) // String
    }

  }

}
