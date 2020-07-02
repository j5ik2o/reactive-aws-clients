// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AcceptTransitGatewayVpcAttachmentRequestBuilderOps(
    val self: AcceptTransitGatewayVpcAttachmentRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayAttachmentIdAsScala(
      value: Option[String]
  ): AcceptTransitGatewayVpcAttachmentRequest.Builder = {
    value.fold(self) { v => self.transitGatewayAttachmentId(v) }
  }

}

final class AcceptTransitGatewayVpcAttachmentRequestOps(val self: AcceptTransitGatewayVpcAttachmentRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAcceptTransitGatewayVpcAttachmentRequestOps {

  implicit def toAcceptTransitGatewayVpcAttachmentRequestBuilderOps(
      v: AcceptTransitGatewayVpcAttachmentRequest.Builder
  ): AcceptTransitGatewayVpcAttachmentRequestBuilderOps = new AcceptTransitGatewayVpcAttachmentRequestBuilderOps(v)

  implicit def toAcceptTransitGatewayVpcAttachmentRequestOps(
      v: AcceptTransitGatewayVpcAttachmentRequest
  ): AcceptTransitGatewayVpcAttachmentRequestOps = new AcceptTransitGatewayVpcAttachmentRequestOps(v)

}
