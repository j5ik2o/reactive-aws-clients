// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AcceptTransitGatewayPeeringAttachmentResponseBuilderOps(
    val self: AcceptTransitGatewayPeeringAttachmentResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayPeeringAttachmentAsScala(
      value: Option[TransitGatewayPeeringAttachment]
  ): AcceptTransitGatewayPeeringAttachmentResponse.Builder = {
    value.fold(self) { v =>
      self.transitGatewayPeeringAttachment(v)
    }
  }

}

final class AcceptTransitGatewayPeeringAttachmentResponseOps(val self: AcceptTransitGatewayPeeringAttachmentResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayPeeringAttachmentAsScala: Option[TransitGatewayPeeringAttachment] =
    Option(self.transitGatewayPeeringAttachment)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAcceptTransitGatewayPeeringAttachmentResponseOps {

  implicit def toAcceptTransitGatewayPeeringAttachmentResponseBuilderOps(
      v: AcceptTransitGatewayPeeringAttachmentResponse.Builder
  ): AcceptTransitGatewayPeeringAttachmentResponseBuilderOps =
    new AcceptTransitGatewayPeeringAttachmentResponseBuilderOps(v)

  implicit def toAcceptTransitGatewayPeeringAttachmentResponseOps(
      v: AcceptTransitGatewayPeeringAttachmentResponse
  ): AcceptTransitGatewayPeeringAttachmentResponseOps = new AcceptTransitGatewayPeeringAttachmentResponseOps(v)

}
