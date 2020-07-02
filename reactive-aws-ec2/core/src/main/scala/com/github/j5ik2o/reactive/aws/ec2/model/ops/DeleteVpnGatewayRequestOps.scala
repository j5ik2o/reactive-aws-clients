// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteVpnGatewayRequestBuilderOps(val self: DeleteVpnGatewayRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnGatewayIdAsScala(value: Option[String]): DeleteVpnGatewayRequest.Builder = {
    value.fold(self) { v => self.vpnGatewayId(v) }
  }

}

final class DeleteVpnGatewayRequestOps(val self: DeleteVpnGatewayRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnGatewayIdAsScala: Option[String] = Option(self.vpnGatewayId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteVpnGatewayRequestOps {

  implicit def toDeleteVpnGatewayRequestBuilderOps(
      v: DeleteVpnGatewayRequest.Builder
  ): DeleteVpnGatewayRequestBuilderOps = new DeleteVpnGatewayRequestBuilderOps(v)

  implicit def toDeleteVpnGatewayRequestOps(v: DeleteVpnGatewayRequest): DeleteVpnGatewayRequestOps =
    new DeleteVpnGatewayRequestOps(v)

}
