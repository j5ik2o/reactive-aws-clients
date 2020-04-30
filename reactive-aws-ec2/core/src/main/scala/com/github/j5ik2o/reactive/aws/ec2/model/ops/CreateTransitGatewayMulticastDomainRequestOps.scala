// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateTransitGatewayMulticastDomainRequestBuilderOps(val self: CreateTransitGatewayMulticastDomainRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayIdAsScala(value: Option[String]): CreateTransitGatewayMulticastDomainRequest.Builder = {
            value.fold(self){ v => self.transitGatewayId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): CreateTransitGatewayMulticastDomainRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSpecifications(v.asJava) } 
            }


}

final class CreateTransitGatewayMulticastDomainRequestOps(val self: CreateTransitGatewayMulticastDomainRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayIdAsScala: Option[String] = Option(self.transitGatewayId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] = Option(self.tagSpecifications).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateTransitGatewayMulticastDomainRequestOps {

implicit def toCreateTransitGatewayMulticastDomainRequestBuilderOps(v: CreateTransitGatewayMulticastDomainRequest.Builder): CreateTransitGatewayMulticastDomainRequestBuilderOps = new CreateTransitGatewayMulticastDomainRequestBuilderOps(v)

implicit def toCreateTransitGatewayMulticastDomainRequestOps(v: CreateTransitGatewayMulticastDomainRequest): CreateTransitGatewayMulticastDomainRequestOps = new CreateTransitGatewayMulticastDomainRequestOps(v)

}

