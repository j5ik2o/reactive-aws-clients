// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteTransitGatewayVpcAttachmentResponseBuilderOps(val self: DeleteTransitGatewayVpcAttachmentResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayVpcAttachmentAsScala(value: Option[TransitGatewayVpcAttachment]): DeleteTransitGatewayVpcAttachmentResponse.Builder = {
            value.fold(self){ v => self.transitGatewayVpcAttachment(v) }
            } 


}

final class DeleteTransitGatewayVpcAttachmentResponseOps(val self: DeleteTransitGatewayVpcAttachmentResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayVpcAttachmentAsScala: Option[TransitGatewayVpcAttachment] = Option(self.transitGatewayVpcAttachment) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteTransitGatewayVpcAttachmentResponseOps {

implicit def toDeleteTransitGatewayVpcAttachmentResponseBuilderOps(v: DeleteTransitGatewayVpcAttachmentResponse.Builder): DeleteTransitGatewayVpcAttachmentResponseBuilderOps = new DeleteTransitGatewayVpcAttachmentResponseBuilderOps(v)

implicit def toDeleteTransitGatewayVpcAttachmentResponseOps(v: DeleteTransitGatewayVpcAttachmentResponse): DeleteTransitGatewayVpcAttachmentResponseOps = new DeleteTransitGatewayVpcAttachmentResponseOps(v)

}

