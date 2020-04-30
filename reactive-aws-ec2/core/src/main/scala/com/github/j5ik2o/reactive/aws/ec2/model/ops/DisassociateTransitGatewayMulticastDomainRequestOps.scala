// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DisassociateTransitGatewayMulticastDomainRequestBuilderOps(val self: DisassociateTransitGatewayMulticastDomainRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayMulticastDomainIdAsScala(value: Option[String]): DisassociateTransitGatewayMulticastDomainRequest.Builder = {
            value.fold(self){ v => self.transitGatewayMulticastDomainId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayAttachmentIdAsScala(value: Option[String]): DisassociateTransitGatewayMulticastDomainRequest.Builder = {
            value.fold(self){ v => self.transitGatewayAttachmentId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def subnetIdsAsScala(value: Option[Seq[String]]): DisassociateTransitGatewayMulticastDomainRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.subnetIds(v.asJava) } 
            }


}

final class DisassociateTransitGatewayMulticastDomainRequestOps(val self: DisassociateTransitGatewayMulticastDomainRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayMulticastDomainIdAsScala: Option[String] = Option(self.transitGatewayMulticastDomainId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def subnetIdsAsScala: Option[Seq[String]] = Option(self.subnetIds).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisassociateTransitGatewayMulticastDomainRequestOps {

implicit def toDisassociateTransitGatewayMulticastDomainRequestBuilderOps(v: DisassociateTransitGatewayMulticastDomainRequest.Builder): DisassociateTransitGatewayMulticastDomainRequestBuilderOps = new DisassociateTransitGatewayMulticastDomainRequestBuilderOps(v)

implicit def toDisassociateTransitGatewayMulticastDomainRequestOps(v: DisassociateTransitGatewayMulticastDomainRequest): DisassociateTransitGatewayMulticastDomainRequestOps = new DisassociateTransitGatewayMulticastDomainRequestOps(v)

}

