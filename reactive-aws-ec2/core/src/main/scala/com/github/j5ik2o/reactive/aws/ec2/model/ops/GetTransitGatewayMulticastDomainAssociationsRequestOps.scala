// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetTransitGatewayMulticastDomainAssociationsRequestBuilderOps(val self: GetTransitGatewayMulticastDomainAssociationsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayMulticastDomainIdAsScala(value: Option[String]): GetTransitGatewayMulticastDomainAssociationsRequest.Builder = {
            value.fold(self){ v => self.transitGatewayMulticastDomainId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def filtersAsScala(value: Option[Seq[Filter]]): GetTransitGatewayMulticastDomainAssociationsRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala(value: Option[Int]): GetTransitGatewayMulticastDomainAssociationsRequest.Builder = {
            value.fold(self){ v => self.maxResults(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): GetTransitGatewayMulticastDomainAssociationsRequest.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class GetTransitGatewayMulticastDomainAssociationsRequestOps(val self: GetTransitGatewayMulticastDomainAssociationsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayMulticastDomainIdAsScala: Option[String] = Option(self.transitGatewayMulticastDomainId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala: Option[Int] = Option(self.maxResults) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetTransitGatewayMulticastDomainAssociationsRequestOps {

implicit def toGetTransitGatewayMulticastDomainAssociationsRequestBuilderOps(v: GetTransitGatewayMulticastDomainAssociationsRequest.Builder): GetTransitGatewayMulticastDomainAssociationsRequestBuilderOps = new GetTransitGatewayMulticastDomainAssociationsRequestBuilderOps(v)

implicit def toGetTransitGatewayMulticastDomainAssociationsRequestOps(v: GetTransitGatewayMulticastDomainAssociationsRequest): GetTransitGatewayMulticastDomainAssociationsRequestOps = new GetTransitGatewayMulticastDomainAssociationsRequestOps(v)

}

