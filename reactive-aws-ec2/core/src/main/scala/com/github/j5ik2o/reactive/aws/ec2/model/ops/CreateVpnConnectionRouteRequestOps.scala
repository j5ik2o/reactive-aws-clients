// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateVpnConnectionRouteRequestBuilderOps(val self: CreateVpnConnectionRouteRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationCidrBlockAsScala(value: Option[String]): CreateVpnConnectionRouteRequest.Builder = {
    value.fold(self) { v => self.destinationCidrBlock(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnConnectionIdAsScala(value: Option[String]): CreateVpnConnectionRouteRequest.Builder = {
    value.fold(self) { v => self.vpnConnectionId(v) }
  }

}

final class CreateVpnConnectionRouteRequestOps(val self: CreateVpnConnectionRouteRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationCidrBlockAsScala: Option[String] = Option(self.destinationCidrBlock)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnConnectionIdAsScala: Option[String] = Option(self.vpnConnectionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateVpnConnectionRouteRequestOps {

  implicit def toCreateVpnConnectionRouteRequestBuilderOps(
      v: CreateVpnConnectionRouteRequest.Builder
  ): CreateVpnConnectionRouteRequestBuilderOps = new CreateVpnConnectionRouteRequestBuilderOps(v)

  implicit def toCreateVpnConnectionRouteRequestOps(
      v: CreateVpnConnectionRouteRequest
  ): CreateVpnConnectionRouteRequestOps = new CreateVpnConnectionRouteRequestOps(v)

}
