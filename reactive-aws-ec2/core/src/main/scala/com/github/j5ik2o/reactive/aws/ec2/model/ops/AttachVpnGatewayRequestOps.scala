// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AttachVpnGatewayRequestBuilderOps(val self: AttachVpnGatewayRequest.Builder) extends AnyVal {

  final def vpcIdAsScala(value: Option[String]): AttachVpnGatewayRequest.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

  final def vpnGatewayIdAsScala(value: Option[String]): AttachVpnGatewayRequest.Builder = {
    value.fold(self) { v =>
      self.vpnGatewayId(v)
    }
  }

}

final class AttachVpnGatewayRequestOps(val self: AttachVpnGatewayRequest) extends AnyVal {

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  final def vpnGatewayIdAsScala: Option[String] = Option(self.vpnGatewayId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAttachVpnGatewayRequestOps {

  implicit def toAttachVpnGatewayRequestBuilderOps(
      v: AttachVpnGatewayRequest.Builder
  ): AttachVpnGatewayRequestBuilderOps = new AttachVpnGatewayRequestBuilderOps(v)

  implicit def toAttachVpnGatewayRequestOps(v: AttachVpnGatewayRequest): AttachVpnGatewayRequestOps =
    new AttachVpnGatewayRequestOps(v)

}
