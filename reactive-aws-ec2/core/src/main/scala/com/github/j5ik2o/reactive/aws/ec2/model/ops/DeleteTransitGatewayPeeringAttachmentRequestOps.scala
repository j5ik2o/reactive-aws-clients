// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteTransitGatewayPeeringAttachmentRequestBuilderOps(val self: DeleteTransitGatewayPeeringAttachmentRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayAttachmentIdAsScala(value: Option[String]): DeleteTransitGatewayPeeringAttachmentRequest.Builder = {
            value.fold(self){ v => self.transitGatewayAttachmentId(v) }
            } 


}

final class DeleteTransitGatewayPeeringAttachmentRequestOps(val self: DeleteTransitGatewayPeeringAttachmentRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteTransitGatewayPeeringAttachmentRequestOps {

implicit def toDeleteTransitGatewayPeeringAttachmentRequestBuilderOps(v: DeleteTransitGatewayPeeringAttachmentRequest.Builder): DeleteTransitGatewayPeeringAttachmentRequestBuilderOps = new DeleteTransitGatewayPeeringAttachmentRequestBuilderOps(v)

implicit def toDeleteTransitGatewayPeeringAttachmentRequestOps(v: DeleteTransitGatewayPeeringAttachmentRequest): DeleteTransitGatewayPeeringAttachmentRequestOps = new DeleteTransitGatewayPeeringAttachmentRequestOps(v)

}

