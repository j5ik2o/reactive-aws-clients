// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyTransitGatewayVpcAttachmentResponseBuilderOps(
    val self: ModifyTransitGatewayVpcAttachmentResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayVpcAttachmentAsScala(
      value: Option[TransitGatewayVpcAttachment]
  ): ModifyTransitGatewayVpcAttachmentResponse.Builder = {
    value.fold(self) { v => self.transitGatewayVpcAttachment(v) }
  }

}

final class ModifyTransitGatewayVpcAttachmentResponseOps(val self: ModifyTransitGatewayVpcAttachmentResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayVpcAttachmentAsScala: Option[TransitGatewayVpcAttachment] =
    Option(self.transitGatewayVpcAttachment)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyTransitGatewayVpcAttachmentResponseOps {

  implicit def toModifyTransitGatewayVpcAttachmentResponseBuilderOps(
      v: ModifyTransitGatewayVpcAttachmentResponse.Builder
  ): ModifyTransitGatewayVpcAttachmentResponseBuilderOps = new ModifyTransitGatewayVpcAttachmentResponseBuilderOps(v)

  implicit def toModifyTransitGatewayVpcAttachmentResponseOps(
      v: ModifyTransitGatewayVpcAttachmentResponse
  ): ModifyTransitGatewayVpcAttachmentResponseOps = new ModifyTransitGatewayVpcAttachmentResponseOps(v)

}
