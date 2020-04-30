// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayRouteAttachmentBuilderOps(val self: TransitGatewayRouteAttachment.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def resourceIdAsScala(value: Option[String]): TransitGatewayRouteAttachment.Builder = {
            value.fold(self){ v => self.resourceId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayAttachmentIdAsScala(value: Option[String]): TransitGatewayRouteAttachment.Builder = {
            value.fold(self){ v => self.transitGatewayAttachmentId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def resourceTypeAsScala(value: Option[TransitGatewayAttachmentResourceType]): TransitGatewayRouteAttachment.Builder = {
            value.fold(self){ v => self.resourceType(v) }
            } 


}

final class TransitGatewayRouteAttachmentOps(val self: TransitGatewayRouteAttachment) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def resourceIdAsScala: Option[String] = Option(self.resourceId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def resourceTypeAsScala: Option[TransitGatewayAttachmentResourceType] = Option(self.resourceType) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitGatewayRouteAttachmentOps {

implicit def toTransitGatewayRouteAttachmentBuilderOps(v: TransitGatewayRouteAttachment.Builder): TransitGatewayRouteAttachmentBuilderOps = new TransitGatewayRouteAttachmentBuilderOps(v)

implicit def toTransitGatewayRouteAttachmentOps(v: TransitGatewayRouteAttachment): TransitGatewayRouteAttachmentOps = new TransitGatewayRouteAttachmentOps(v)

}

