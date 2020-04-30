// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RejectTransitGatewayPeeringAttachmentRequestBuilderOps(val self: RejectTransitGatewayPeeringAttachmentRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayAttachmentIdAsScala(value: Option[String]): RejectTransitGatewayPeeringAttachmentRequest.Builder = {
            value.fold(self){ v => self.transitGatewayAttachmentId(v) }
            } 


}

final class RejectTransitGatewayPeeringAttachmentRequestOps(val self: RejectTransitGatewayPeeringAttachmentRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRejectTransitGatewayPeeringAttachmentRequestOps {

implicit def toRejectTransitGatewayPeeringAttachmentRequestBuilderOps(v: RejectTransitGatewayPeeringAttachmentRequest.Builder): RejectTransitGatewayPeeringAttachmentRequestBuilderOps = new RejectTransitGatewayPeeringAttachmentRequestBuilderOps(v)

implicit def toRejectTransitGatewayPeeringAttachmentRequestOps(v: RejectTransitGatewayPeeringAttachmentRequest): RejectTransitGatewayPeeringAttachmentRequestOps = new RejectTransitGatewayPeeringAttachmentRequestOps(v)

}

