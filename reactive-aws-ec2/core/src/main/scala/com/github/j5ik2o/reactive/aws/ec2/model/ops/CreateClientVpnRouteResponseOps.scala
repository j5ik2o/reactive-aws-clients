// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateClientVpnRouteResponseBuilderOps(val self: CreateClientVpnRouteResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[ClientVpnRouteStatus]): CreateClientVpnRouteResponse.Builder = {
    value.fold(self) { v => self.status(v) }
  }

}

final class CreateClientVpnRouteResponseOps(val self: CreateClientVpnRouteResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[ClientVpnRouteStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateClientVpnRouteResponseOps {

  implicit def toCreateClientVpnRouteResponseBuilderOps(
      v: CreateClientVpnRouteResponse.Builder
  ): CreateClientVpnRouteResponseBuilderOps = new CreateClientVpnRouteResponseBuilderOps(v)

  implicit def toCreateClientVpnRouteResponseOps(v: CreateClientVpnRouteResponse): CreateClientVpnRouteResponseOps =
    new CreateClientVpnRouteResponseOps(v)

}
