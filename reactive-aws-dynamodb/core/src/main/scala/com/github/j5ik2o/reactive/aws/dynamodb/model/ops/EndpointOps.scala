// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class EndpointBuilderOps(val self: Endpoint.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def addressAsScala(value: Option[String]): Endpoint.Builder = {
    value.fold(self) { v => self.address(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cachePeriodInMinutesAsScala(value: Option[Long]): Endpoint.Builder = {
    value.fold(self) { v => self.cachePeriodInMinutes(v) }
  }

}

final class EndpointOps(val self: Endpoint) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def addressAsScala: Option[String] = Option(self.address)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cachePeriodInMinutesAsScala: Option[Long] = Option(self.cachePeriodInMinutes)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEndpointOps {

  implicit def toEndpointBuilderOps(v: Endpoint.Builder): EndpointBuilderOps = new EndpointBuilderOps(v)

  implicit def toEndpointOps(v: Endpoint): EndpointOps = new EndpointOps(v)

}
