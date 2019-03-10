package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ Endpoint => JavaEndpoint }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Endpoint => ScalaEndpoint }

object EndpointOps {

  implicit class ScalaEndpointOps(val self: ScalaEndpoint) extends AnyVal {

    def toJava: JavaEndpoint = {
      val result = new JavaEndpoint()
      self.address.foreach(result.setAddress)
      self.cachePeriodInMinutes.foreach(v => result.setCachePeriodInMinutes(v))
      result
    }

  }

  implicit class JavaEndpointOps(val self: JavaEndpoint) extends AnyVal {

    def toScala: ScalaEndpoint = {
      ScalaEndpoint()
        .withAddress(Option(self.getAddress))
        .withCachePeriodInMinutes(Option(self.getCachePeriodInMinutes).map(_.longValue()))
    }

  }

}
