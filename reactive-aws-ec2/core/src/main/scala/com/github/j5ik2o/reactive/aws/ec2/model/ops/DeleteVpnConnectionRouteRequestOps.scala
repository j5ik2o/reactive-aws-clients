// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteVpnConnectionRouteRequestBuilderOps(val self: DeleteVpnConnectionRouteRequest.Builder)
    extends AnyVal {

  final def destinationCidrBlockAsScala(value: Option[String]): DeleteVpnConnectionRouteRequest.Builder = {
    value.fold(self) { v =>
      self.destinationCidrBlock(v)
    }
  }

  final def vpnConnectionIdAsScala(value: Option[String]): DeleteVpnConnectionRouteRequest.Builder = {
    value.fold(self) { v =>
      self.vpnConnectionId(v)
    }
  }

}

final class DeleteVpnConnectionRouteRequestOps(val self: DeleteVpnConnectionRouteRequest) extends AnyVal {

  final def destinationCidrBlockAsScala: Option[String] = Option(self.destinationCidrBlock)

  final def vpnConnectionIdAsScala: Option[String] = Option(self.vpnConnectionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteVpnConnectionRouteRequestOps {

  implicit def toDeleteVpnConnectionRouteRequestBuilderOps(
      v: DeleteVpnConnectionRouteRequest.Builder
  ): DeleteVpnConnectionRouteRequestBuilderOps = new DeleteVpnConnectionRouteRequestBuilderOps(v)

  implicit def toDeleteVpnConnectionRouteRequestOps(
      v: DeleteVpnConnectionRouteRequest
  ): DeleteVpnConnectionRouteRequestOps = new DeleteVpnConnectionRouteRequestOps(v)

}
