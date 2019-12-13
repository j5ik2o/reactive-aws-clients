// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RejectTransitGatewayPeeringAttachmentResponseBuilderOps(
    val self: RejectTransitGatewayPeeringAttachmentResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayPeeringAttachmentAsScala(
      value: Option[TransitGatewayPeeringAttachment]
  ): RejectTransitGatewayPeeringAttachmentResponse.Builder = {
    value.fold(self) { v =>
      self.transitGatewayPeeringAttachment(v)
    }
  }

}

final class RejectTransitGatewayPeeringAttachmentResponseOps(val self: RejectTransitGatewayPeeringAttachmentResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayPeeringAttachmentAsScala: Option[TransitGatewayPeeringAttachment] =
    Option(self.transitGatewayPeeringAttachment)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRejectTransitGatewayPeeringAttachmentResponseOps {

  implicit def toRejectTransitGatewayPeeringAttachmentResponseBuilderOps(
      v: RejectTransitGatewayPeeringAttachmentResponse.Builder
  ): RejectTransitGatewayPeeringAttachmentResponseBuilderOps =
    new RejectTransitGatewayPeeringAttachmentResponseBuilderOps(v)

  implicit def toRejectTransitGatewayPeeringAttachmentResponseOps(
      v: RejectTransitGatewayPeeringAttachmentResponse
  ): RejectTransitGatewayPeeringAttachmentResponseOps = new RejectTransitGatewayPeeringAttachmentResponseOps(v)

}
