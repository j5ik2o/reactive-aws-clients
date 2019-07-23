// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteTransitGatewayVpcAttachmentRequestBuilderOps(
    val self: DeleteTransitGatewayVpcAttachmentRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayAttachmentIdAsScala(
      value: Option[String]
  ): DeleteTransitGatewayVpcAttachmentRequest.Builder = {
    value.fold(self) { v =>
      self.transitGatewayAttachmentId(v)
    }
  }

}

final class DeleteTransitGatewayVpcAttachmentRequestOps(val self: DeleteTransitGatewayVpcAttachmentRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteTransitGatewayVpcAttachmentRequestOps {

  implicit def toDeleteTransitGatewayVpcAttachmentRequestBuilderOps(
      v: DeleteTransitGatewayVpcAttachmentRequest.Builder
  ): DeleteTransitGatewayVpcAttachmentRequestBuilderOps = new DeleteTransitGatewayVpcAttachmentRequestBuilderOps(v)

  implicit def toDeleteTransitGatewayVpcAttachmentRequestOps(
      v: DeleteTransitGatewayVpcAttachmentRequest
  ): DeleteTransitGatewayVpcAttachmentRequestOps = new DeleteTransitGatewayVpcAttachmentRequestOps(v)

}
