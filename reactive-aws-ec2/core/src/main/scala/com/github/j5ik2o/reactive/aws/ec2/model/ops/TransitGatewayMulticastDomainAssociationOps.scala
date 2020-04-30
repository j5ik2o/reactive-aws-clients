// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayMulticastDomainAssociationBuilderOps(val self: TransitGatewayMulticastDomainAssociation.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayAttachmentIdAsScala(value: Option[String]): TransitGatewayMulticastDomainAssociation.Builder = {
            value.fold(self){ v => self.transitGatewayAttachmentId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def resourceIdAsScala(value: Option[String]): TransitGatewayMulticastDomainAssociation.Builder = {
            value.fold(self){ v => self.resourceId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def resourceTypeAsScala(value: Option[TransitGatewayAttachmentResourceType]): TransitGatewayMulticastDomainAssociation.Builder = {
            value.fold(self){ v => self.resourceType(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def subnetAsScala(value: Option[SubnetAssociation]): TransitGatewayMulticastDomainAssociation.Builder = {
            value.fold(self){ v => self.subnet(v) }
            } 


}

final class TransitGatewayMulticastDomainAssociationOps(val self: TransitGatewayMulticastDomainAssociation) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def resourceIdAsScala: Option[String] = Option(self.resourceId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def resourceTypeAsScala: Option[TransitGatewayAttachmentResourceType] = Option(self.resourceType) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def subnetAsScala: Option[SubnetAssociation] = Option(self.subnet) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitGatewayMulticastDomainAssociationOps {

implicit def toTransitGatewayMulticastDomainAssociationBuilderOps(v: TransitGatewayMulticastDomainAssociation.Builder): TransitGatewayMulticastDomainAssociationBuilderOps = new TransitGatewayMulticastDomainAssociationBuilderOps(v)

implicit def toTransitGatewayMulticastDomainAssociationOps(v: TransitGatewayMulticastDomainAssociation): TransitGatewayMulticastDomainAssociationOps = new TransitGatewayMulticastDomainAssociationOps(v)

}

