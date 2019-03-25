package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Endpoint => ScalaEndpoint, _ }
import software.amazon.awssdk.services.dynamodb.model.{ Endpoint => JavaEndpoint }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object EndpointOps {

  implicit class ScalaEndpointOps(val self: ScalaEndpoint) extends AnyVal {

    def toJava: JavaEndpoint = {
      val result = JavaEndpoint.builder()
      self.address.filter(_.nonEmpty).foreach(v => result.address(v))                         // String, case String
      self.cachePeriodInMinutes.map(_.longValue).foreach(v => result.cachePeriodInMinutes(v)) // Long, case Long

      result.build()
    }

  }

  implicit class JavaEndpointOps(val self: JavaEndpoint) extends AnyVal {

    def toScala: ScalaEndpoint = {
      ScalaEndpoint()
        .withAddress(Option(self.address)) // String
        .withCachePeriodInMinutes(Option(self.cachePeriodInMinutes).map(_.longValue)) // Long
    }

  }

}
