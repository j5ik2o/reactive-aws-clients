// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RejectTransitGatewayVpcAttachmentRequestBuilderOps(
    val self: RejectTransitGatewayVpcAttachmentRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayAttachmentIdAsScala(
      value: Option[String]
  ): RejectTransitGatewayVpcAttachmentRequest.Builder = {
    value.fold(self) { v =>
      self.transitGatewayAttachmentId(v)
    }
  }

}

final class RejectTransitGatewayVpcAttachmentRequestOps(val self: RejectTransitGatewayVpcAttachmentRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRejectTransitGatewayVpcAttachmentRequestOps {

  implicit def toRejectTransitGatewayVpcAttachmentRequestBuilderOps(
      v: RejectTransitGatewayVpcAttachmentRequest.Builder
  ): RejectTransitGatewayVpcAttachmentRequestBuilderOps = new RejectTransitGatewayVpcAttachmentRequestBuilderOps(v)

  implicit def toRejectTransitGatewayVpcAttachmentRequestOps(
      v: RejectTransitGatewayVpcAttachmentRequest
  ): RejectTransitGatewayVpcAttachmentRequestOps = new RejectTransitGatewayVpcAttachmentRequestOps(v)

}
