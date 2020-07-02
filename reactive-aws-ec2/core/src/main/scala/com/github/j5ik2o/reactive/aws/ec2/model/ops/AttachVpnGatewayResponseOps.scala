// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AttachVpnGatewayResponseBuilderOps(val self: AttachVpnGatewayResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcAttachmentAsScala(value: Option[VpcAttachment]): AttachVpnGatewayResponse.Builder = {
    value.fold(self) { v => self.vpcAttachment(v) }
  }

}

final class AttachVpnGatewayResponseOps(val self: AttachVpnGatewayResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcAttachmentAsScala: Option[VpcAttachment] = Option(self.vpcAttachment)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAttachVpnGatewayResponseOps {

  implicit def toAttachVpnGatewayResponseBuilderOps(
      v: AttachVpnGatewayResponse.Builder
  ): AttachVpnGatewayResponseBuilderOps = new AttachVpnGatewayResponseBuilderOps(v)

  implicit def toAttachVpnGatewayResponseOps(v: AttachVpnGatewayResponse): AttachVpnGatewayResponseOps =
    new AttachVpnGatewayResponseOps(v)

}
