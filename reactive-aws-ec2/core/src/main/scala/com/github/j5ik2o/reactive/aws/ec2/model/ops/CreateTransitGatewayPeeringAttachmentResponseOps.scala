// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateTransitGatewayPeeringAttachmentResponseBuilderOps(
    val self: CreateTransitGatewayPeeringAttachmentResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayPeeringAttachmentAsScala(
      value: Option[TransitGatewayPeeringAttachment]
  ): CreateTransitGatewayPeeringAttachmentResponse.Builder = {
    value.fold(self) { v => self.transitGatewayPeeringAttachment(v) }
  }

}

final class CreateTransitGatewayPeeringAttachmentResponseOps(val self: CreateTransitGatewayPeeringAttachmentResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayPeeringAttachmentAsScala: Option[TransitGatewayPeeringAttachment] =
    Option(self.transitGatewayPeeringAttachment)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateTransitGatewayPeeringAttachmentResponseOps {

  implicit def toCreateTransitGatewayPeeringAttachmentResponseBuilderOps(
      v: CreateTransitGatewayPeeringAttachmentResponse.Builder
  ): CreateTransitGatewayPeeringAttachmentResponseBuilderOps =
    new CreateTransitGatewayPeeringAttachmentResponseBuilderOps(v)

  implicit def toCreateTransitGatewayPeeringAttachmentResponseOps(
      v: CreateTransitGatewayPeeringAttachmentResponse
  ): CreateTransitGatewayPeeringAttachmentResponseOps = new CreateTransitGatewayPeeringAttachmentResponseOps(v)

}
