// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AcceptTransitGatewayPeeringAttachmentRequestBuilderOps(
    val self: AcceptTransitGatewayPeeringAttachmentRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayAttachmentIdAsScala(
      value: Option[String]
  ): AcceptTransitGatewayPeeringAttachmentRequest.Builder = {
    value.fold(self) { v =>
      self.transitGatewayAttachmentId(v)
    }
  }

}

final class AcceptTransitGatewayPeeringAttachmentRequestOps(val self: AcceptTransitGatewayPeeringAttachmentRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAcceptTransitGatewayPeeringAttachmentRequestOps {

  implicit def toAcceptTransitGatewayPeeringAttachmentRequestBuilderOps(
      v: AcceptTransitGatewayPeeringAttachmentRequest.Builder
  ): AcceptTransitGatewayPeeringAttachmentRequestBuilderOps =
    new AcceptTransitGatewayPeeringAttachmentRequestBuilderOps(v)

  implicit def toAcceptTransitGatewayPeeringAttachmentRequestOps(
      v: AcceptTransitGatewayPeeringAttachmentRequest
  ): AcceptTransitGatewayPeeringAttachmentRequestOps = new AcceptTransitGatewayPeeringAttachmentRequestOps(v)

}
