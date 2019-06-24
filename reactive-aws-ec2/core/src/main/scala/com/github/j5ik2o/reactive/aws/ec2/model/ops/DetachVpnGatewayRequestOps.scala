// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DetachVpnGatewayRequestBuilderOps(val self: DetachVpnGatewayRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): DetachVpnGatewayRequest.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnGatewayIdAsScala(value: Option[String]): DetachVpnGatewayRequest.Builder = {
    value.fold(self) { v =>
      self.vpnGatewayId(v)
    }
  }

}

final class DetachVpnGatewayRequestOps(val self: DetachVpnGatewayRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnGatewayIdAsScala: Option[String] = Option(self.vpnGatewayId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDetachVpnGatewayRequestOps {

  implicit def toDetachVpnGatewayRequestBuilderOps(
      v: DetachVpnGatewayRequest.Builder
  ): DetachVpnGatewayRequestBuilderOps = new DetachVpnGatewayRequestBuilderOps(v)

  implicit def toDetachVpnGatewayRequestOps(v: DetachVpnGatewayRequest): DetachVpnGatewayRequestOps =
    new DetachVpnGatewayRequestOps(v)

}
