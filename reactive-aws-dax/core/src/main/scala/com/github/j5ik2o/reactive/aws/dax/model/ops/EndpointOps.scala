// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class EndpointBuilderOps(val self: Endpoint.Builder) extends AnyVal {

  final def withAddressAsScala(value: Option[String]): Endpoint.Builder = {
    value.fold(self) { v =>
      self.address(v)
    }
  } // String

  final def withPortAsScala(value: Option[Int]): Endpoint.Builder = {
    value.fold(self) { v =>
      self.port(v)
    }
  } // Int

}

final class EndpointOps(val self: Endpoint) extends AnyVal {

  final def addressAsScala: Option[String] = Option(self.address) // String

  final def portAsScala: Option[Int] = Option(self.port) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEndpointOps {

  implicit def toEndpointBuilderOps(v: Endpoint.Builder): EndpointBuilderOps = new EndpointBuilderOps(v)

  implicit def toEndpointOps(v: Endpoint): EndpointOps = new EndpointOps(v)

}
