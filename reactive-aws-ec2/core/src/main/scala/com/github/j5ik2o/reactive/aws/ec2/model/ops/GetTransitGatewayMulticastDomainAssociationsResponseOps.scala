// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetTransitGatewayMulticastDomainAssociationsResponseBuilderOps(val self: GetTransitGatewayMulticastDomainAssociationsResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def multicastDomainAssociationsAsScala(value: Option[Seq[TransitGatewayMulticastDomainAssociation]]): GetTransitGatewayMulticastDomainAssociationsResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.multicastDomainAssociations(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): GetTransitGatewayMulticastDomainAssociationsResponse.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class GetTransitGatewayMulticastDomainAssociationsResponseOps(val self: GetTransitGatewayMulticastDomainAssociationsResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def multicastDomainAssociationsAsScala: Option[Seq[TransitGatewayMulticastDomainAssociation]] = Option(self.multicastDomainAssociations).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetTransitGatewayMulticastDomainAssociationsResponseOps {

implicit def toGetTransitGatewayMulticastDomainAssociationsResponseBuilderOps(v: GetTransitGatewayMulticastDomainAssociationsResponse.Builder): GetTransitGatewayMulticastDomainAssociationsResponseBuilderOps = new GetTransitGatewayMulticastDomainAssociationsResponseBuilderOps(v)

implicit def toGetTransitGatewayMulticastDomainAssociationsResponseOps(v: GetTransitGatewayMulticastDomainAssociationsResponse): GetTransitGatewayMulticastDomainAssociationsResponseOps = new GetTransitGatewayMulticastDomainAssociationsResponseOps(v)

}

