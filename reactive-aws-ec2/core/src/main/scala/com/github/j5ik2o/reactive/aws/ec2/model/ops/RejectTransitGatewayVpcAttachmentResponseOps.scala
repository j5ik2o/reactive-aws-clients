// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RejectTransitGatewayVpcAttachmentResponseBuilderOps(val self: RejectTransitGatewayVpcAttachmentResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayVpcAttachmentAsScala(value: Option[TransitGatewayVpcAttachment]): RejectTransitGatewayVpcAttachmentResponse.Builder = {
            value.fold(self){ v => self.transitGatewayVpcAttachment(v) }
            } 


}

final class RejectTransitGatewayVpcAttachmentResponseOps(val self: RejectTransitGatewayVpcAttachmentResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayVpcAttachmentAsScala: Option[TransitGatewayVpcAttachment] = Option(self.transitGatewayVpcAttachment) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRejectTransitGatewayVpcAttachmentResponseOps {

implicit def toRejectTransitGatewayVpcAttachmentResponseBuilderOps(v: RejectTransitGatewayVpcAttachmentResponse.Builder): RejectTransitGatewayVpcAttachmentResponseBuilderOps = new RejectTransitGatewayVpcAttachmentResponseBuilderOps(v)

implicit def toRejectTransitGatewayVpcAttachmentResponseOps(v: RejectTransitGatewayVpcAttachmentResponse): RejectTransitGatewayVpcAttachmentResponseOps = new RejectTransitGatewayVpcAttachmentResponseOps(v)

}

