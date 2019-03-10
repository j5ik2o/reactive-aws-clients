package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Endpoint => ScalaEndpoint }
import software.amazon.awssdk.services.dynamodb.model.{ Endpoint => JavaEndpoint }

object EndpointOps {

  implicit class ScalaEndpointOps(val self: ScalaEndpoint) extends AnyVal {

    def toJava: JavaEndpoint = {
      val result = JavaEndpoint.builder()
      self.address.foreach(result.address)
      self.cachePeriodInMinutes.foreach(v => result.cachePeriodInMinutes(v))
      result.build()
    }

  }

  implicit class JavaEndpointOps(val self: JavaEndpoint) extends AnyVal {

    def toScala: ScalaEndpoint = {
      ScalaEndpoint()
        .withAddress(Option(self.address))
        .withCachePeriodInMinutes(Option(self.cachePeriodInMinutes).map(_.longValue()))
    }

  }

}
