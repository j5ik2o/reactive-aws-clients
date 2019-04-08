// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateTransitGatewayVpcAttachmentResponseBuilderOps(
    val self: CreateTransitGatewayVpcAttachmentResponse.Builder
) extends AnyVal {

  final def transitGatewayVpcAttachmentAsScala(
      value: Option[TransitGatewayVpcAttachment]
  ): CreateTransitGatewayVpcAttachmentResponse.Builder = {
    value.fold(self) { v =>
      self.transitGatewayVpcAttachment(v)
    }
  }

}

final class CreateTransitGatewayVpcAttachmentResponseOps(val self: CreateTransitGatewayVpcAttachmentResponse)
    extends AnyVal {

  final def transitGatewayVpcAttachmentAsScala: Option[TransitGatewayVpcAttachment] =
    Option(self.transitGatewayVpcAttachment)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateTransitGatewayVpcAttachmentResponseOps {

  implicit def toCreateTransitGatewayVpcAttachmentResponseBuilderOps(
      v: CreateTransitGatewayVpcAttachmentResponse.Builder
  ): CreateTransitGatewayVpcAttachmentResponseBuilderOps = new CreateTransitGatewayVpcAttachmentResponseBuilderOps(v)

  implicit def toCreateTransitGatewayVpcAttachmentResponseOps(
      v: CreateTransitGatewayVpcAttachmentResponse
  ): CreateTransitGatewayVpcAttachmentResponseOps = new CreateTransitGatewayVpcAttachmentResponseOps(v)

}
