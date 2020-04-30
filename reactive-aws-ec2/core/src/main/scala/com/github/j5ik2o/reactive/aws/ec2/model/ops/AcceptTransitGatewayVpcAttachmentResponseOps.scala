// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AcceptTransitGatewayVpcAttachmentResponseBuilderOps(val self: AcceptTransitGatewayVpcAttachmentResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayVpcAttachmentAsScala(value: Option[TransitGatewayVpcAttachment]): AcceptTransitGatewayVpcAttachmentResponse.Builder = {
            value.fold(self){ v => self.transitGatewayVpcAttachment(v) }
            } 


}

final class AcceptTransitGatewayVpcAttachmentResponseOps(val self: AcceptTransitGatewayVpcAttachmentResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayVpcAttachmentAsScala: Option[TransitGatewayVpcAttachment] = Option(self.transitGatewayVpcAttachment) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAcceptTransitGatewayVpcAttachmentResponseOps {

implicit def toAcceptTransitGatewayVpcAttachmentResponseBuilderOps(v: AcceptTransitGatewayVpcAttachmentResponse.Builder): AcceptTransitGatewayVpcAttachmentResponseBuilderOps = new AcceptTransitGatewayVpcAttachmentResponseBuilderOps(v)

implicit def toAcceptTransitGatewayVpcAttachmentResponseOps(v: AcceptTransitGatewayVpcAttachmentResponse): AcceptTransitGatewayVpcAttachmentResponseOps = new AcceptTransitGatewayVpcAttachmentResponseOps(v)

}

