// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyVpnTunnelOptionsResponseBuilderOps(val self: ModifyVpnTunnelOptionsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnConnectionAsScala(value: Option[VpnConnection]): ModifyVpnTunnelOptionsResponse.Builder = {
    value.fold(self) { v => self.vpnConnection(v) }
  }

}

final class ModifyVpnTunnelOptionsResponseOps(val self: ModifyVpnTunnelOptionsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnConnectionAsScala: Option[VpnConnection] = Option(self.vpnConnection)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyVpnTunnelOptionsResponseOps {

  implicit def toModifyVpnTunnelOptionsResponseBuilderOps(
      v: ModifyVpnTunnelOptionsResponse.Builder
  ): ModifyVpnTunnelOptionsResponseBuilderOps = new ModifyVpnTunnelOptionsResponseBuilderOps(v)

  implicit def toModifyVpnTunnelOptionsResponseOps(
      v: ModifyVpnTunnelOptionsResponse
  ): ModifyVpnTunnelOptionsResponseOps = new ModifyVpnTunnelOptionsResponseOps(v)

}
