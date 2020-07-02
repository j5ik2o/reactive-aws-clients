// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyVpnTunnelOptionsRequestBuilderOps(val self: ModifyVpnTunnelOptionsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnConnectionIdAsScala(value: Option[String]): ModifyVpnTunnelOptionsRequest.Builder = {
    value.fold(self) { v => self.vpnConnectionId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnTunnelOutsideIpAddressAsScala(value: Option[String]): ModifyVpnTunnelOptionsRequest.Builder = {
    value.fold(self) { v => self.vpnTunnelOutsideIpAddress(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tunnelOptionsAsScala(
      value: Option[ModifyVpnTunnelOptionsSpecification]
  ): ModifyVpnTunnelOptionsRequest.Builder = {
    value.fold(self) { v => self.tunnelOptions(v) }
  }

}

final class ModifyVpnTunnelOptionsRequestOps(val self: ModifyVpnTunnelOptionsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnConnectionIdAsScala: Option[String] = Option(self.vpnConnectionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnTunnelOutsideIpAddressAsScala: Option[String] = Option(self.vpnTunnelOutsideIpAddress)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tunnelOptionsAsScala: Option[ModifyVpnTunnelOptionsSpecification] = Option(self.tunnelOptions)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyVpnTunnelOptionsRequestOps {

  implicit def toModifyVpnTunnelOptionsRequestBuilderOps(
      v: ModifyVpnTunnelOptionsRequest.Builder
  ): ModifyVpnTunnelOptionsRequestBuilderOps = new ModifyVpnTunnelOptionsRequestBuilderOps(v)

  implicit def toModifyVpnTunnelOptionsRequestOps(v: ModifyVpnTunnelOptionsRequest): ModifyVpnTunnelOptionsRequestOps =
    new ModifyVpnTunnelOptionsRequestOps(v)

}
