// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class EndpointBuilderOps(val self: Endpoint.Builder) extends AnyVal {

  final def addressAsScala(value: Option[String]): Endpoint.Builder = {
    value.fold(self) { v =>
      self.address(v)
    }
  } // String

  final def cachePeriodInMinutesAsScala(value: Option[Long]): Endpoint.Builder = {
    value.fold(self) { v =>
      self.cachePeriodInMinutes(v)
    }
  } // Long

}

final class EndpointOps(val self: Endpoint) extends AnyVal {

  final def addressAsScala: Option[String] = Option(self.address) // String

  final def cachePeriodInMinutesAsScala: Option[Long] = Option(self.cachePeriodInMinutes) // Long

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEndpointOps {

  implicit def toEndpointBuilderOps(v: Endpoint.Builder): EndpointBuilderOps = new EndpointBuilderOps(v)

  implicit def toEndpointOps(v: Endpoint): EndpointOps = new EndpointOps(v)

}
