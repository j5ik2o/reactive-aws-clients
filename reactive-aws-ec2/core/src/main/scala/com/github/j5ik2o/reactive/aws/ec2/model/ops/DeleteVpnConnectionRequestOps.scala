// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteVpnConnectionRequestBuilderOps(val self: DeleteVpnConnectionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnConnectionIdAsScala(value: Option[String]): DeleteVpnConnectionRequest.Builder = {
    value.fold(self) { v => self.vpnConnectionId(v) }
  }

}

final class DeleteVpnConnectionRequestOps(val self: DeleteVpnConnectionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnConnectionIdAsScala: Option[String] = Option(self.vpnConnectionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteVpnConnectionRequestOps {

  implicit def toDeleteVpnConnectionRequestBuilderOps(
      v: DeleteVpnConnectionRequest.Builder
  ): DeleteVpnConnectionRequestBuilderOps = new DeleteVpnConnectionRequestBuilderOps(v)

  implicit def toDeleteVpnConnectionRequestOps(v: DeleteVpnConnectionRequest): DeleteVpnConnectionRequestOps =
    new DeleteVpnConnectionRequestOps(v)

}
