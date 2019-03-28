// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Endpoint => ScalaEndpoint, _ }
import com.amazonaws.services.dynamodbv2.model.{ Endpoint => JavaEndpoint }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object EndpointOps {

  implicit class ScalaEndpointOps(val self: ScalaEndpoint) extends AnyVal {

    def toJava: JavaEndpoint = {
      val result = new JavaEndpoint()
      self.address.filter(_.nonEmpty).foreach(v => result.withAddress(v))                         // String
      self.cachePeriodInMinutes.map(_.longValue).foreach(v => result.withCachePeriodInMinutes(v)) // Long

      result
    }

  }

  implicit class JavaEndpointOps(val self: JavaEndpoint) extends AnyVal {

    def toScala: ScalaEndpoint = {
      ScalaEndpoint()
        .withAddress(Option(self.getAddress)) // String
        .withCachePeriodInMinutes(Option(self.getCachePeriodInMinutes).map(_.longValue)) // Long
    }

  }

}
