// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AssociateTransitGatewayMulticastDomainRequestBuilderOps(val self: AssociateTransitGatewayMulticastDomainRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayMulticastDomainIdAsScala(value: Option[String]): AssociateTransitGatewayMulticastDomainRequest.Builder = {
            value.fold(self){ v => self.transitGatewayMulticastDomainId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayAttachmentIdAsScala(value: Option[String]): AssociateTransitGatewayMulticastDomainRequest.Builder = {
            value.fold(self){ v => self.transitGatewayAttachmentId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def subnetIdsAsScala(value: Option[Seq[String]]): AssociateTransitGatewayMulticastDomainRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.subnetIds(v.asJava) } 
            }


}

final class AssociateTransitGatewayMulticastDomainRequestOps(val self: AssociateTransitGatewayMulticastDomainRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayMulticastDomainIdAsScala: Option[String] = Option(self.transitGatewayMulticastDomainId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def subnetIdsAsScala: Option[Seq[String]] = Option(self.subnetIds).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssociateTransitGatewayMulticastDomainRequestOps {

implicit def toAssociateTransitGatewayMulticastDomainRequestBuilderOps(v: AssociateTransitGatewayMulticastDomainRequest.Builder): AssociateTransitGatewayMulticastDomainRequestBuilderOps = new AssociateTransitGatewayMulticastDomainRequestBuilderOps(v)

implicit def toAssociateTransitGatewayMulticastDomainRequestOps(v: AssociateTransitGatewayMulticastDomainRequest): AssociateTransitGatewayMulticastDomainRequestOps = new AssociateTransitGatewayMulticastDomainRequestOps(v)

}

