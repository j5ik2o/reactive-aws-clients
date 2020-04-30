// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateTransitGatewayPeeringAttachmentRequestBuilderOps(val self: CreateTransitGatewayPeeringAttachmentRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayIdAsScala(value: Option[String]): CreateTransitGatewayPeeringAttachmentRequest.Builder = {
            value.fold(self){ v => self.transitGatewayId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def peerTransitGatewayIdAsScala(value: Option[String]): CreateTransitGatewayPeeringAttachmentRequest.Builder = {
            value.fold(self){ v => self.peerTransitGatewayId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def peerAccountIdAsScala(value: Option[String]): CreateTransitGatewayPeeringAttachmentRequest.Builder = {
            value.fold(self){ v => self.peerAccountId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def peerRegionAsScala(value: Option[String]): CreateTransitGatewayPeeringAttachmentRequest.Builder = {
            value.fold(self){ v => self.peerRegion(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): CreateTransitGatewayPeeringAttachmentRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSpecifications(v.asJava) } 
            }


}

final class CreateTransitGatewayPeeringAttachmentRequestOps(val self: CreateTransitGatewayPeeringAttachmentRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayIdAsScala: Option[String] = Option(self.transitGatewayId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def peerTransitGatewayIdAsScala: Option[String] = Option(self.peerTransitGatewayId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def peerAccountIdAsScala: Option[String] = Option(self.peerAccountId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def peerRegionAsScala: Option[String] = Option(self.peerRegion) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] = Option(self.tagSpecifications).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateTransitGatewayPeeringAttachmentRequestOps {

implicit def toCreateTransitGatewayPeeringAttachmentRequestBuilderOps(v: CreateTransitGatewayPeeringAttachmentRequest.Builder): CreateTransitGatewayPeeringAttachmentRequestBuilderOps = new CreateTransitGatewayPeeringAttachmentRequestBuilderOps(v)

implicit def toCreateTransitGatewayPeeringAttachmentRequestOps(v: CreateTransitGatewayPeeringAttachmentRequest): CreateTransitGatewayPeeringAttachmentRequestOps = new CreateTransitGatewayPeeringAttachmentRequestOps(v)

}

