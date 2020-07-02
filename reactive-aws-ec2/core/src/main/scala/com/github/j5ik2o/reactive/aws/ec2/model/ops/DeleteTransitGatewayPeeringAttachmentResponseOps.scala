// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteTransitGatewayPeeringAttachmentResponseBuilderOps(
    val self: DeleteTransitGatewayPeeringAttachmentResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayPeeringAttachmentAsScala(
      value: Option[TransitGatewayPeeringAttachment]
  ): DeleteTransitGatewayPeeringAttachmentResponse.Builder = {
    value.fold(self) { v => self.transitGatewayPeeringAttachment(v) }
  }

}

final class DeleteTransitGatewayPeeringAttachmentResponseOps(val self: DeleteTransitGatewayPeeringAttachmentResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayPeeringAttachmentAsScala: Option[TransitGatewayPeeringAttachment] =
    Option(self.transitGatewayPeeringAttachment)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteTransitGatewayPeeringAttachmentResponseOps {

  implicit def toDeleteTransitGatewayPeeringAttachmentResponseBuilderOps(
      v: DeleteTransitGatewayPeeringAttachmentResponse.Builder
  ): DeleteTransitGatewayPeeringAttachmentResponseBuilderOps =
    new DeleteTransitGatewayPeeringAttachmentResponseBuilderOps(v)

  implicit def toDeleteTransitGatewayPeeringAttachmentResponseOps(
      v: DeleteTransitGatewayPeeringAttachmentResponse
  ): DeleteTransitGatewayPeeringAttachmentResponseOps = new DeleteTransitGatewayPeeringAttachmentResponseOps(v)

}
