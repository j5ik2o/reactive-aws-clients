// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetTransitGatewayRouteTableAssociationsRequestBuilderOps(val self: GetTransitGatewayRouteTableAssociationsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayRouteTableIdAsScala(value: Option[String]): GetTransitGatewayRouteTableAssociationsRequest.Builder = {
            value.fold(self){ v => self.transitGatewayRouteTableId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def filtersAsScala(value: Option[Seq[Filter]]): GetTransitGatewayRouteTableAssociationsRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala(value: Option[Int]): GetTransitGatewayRouteTableAssociationsRequest.Builder = {
            value.fold(self){ v => self.maxResults(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): GetTransitGatewayRouteTableAssociationsRequest.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class GetTransitGatewayRouteTableAssociationsRequestOps(val self: GetTransitGatewayRouteTableAssociationsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayRouteTableIdAsScala: Option[String] = Option(self.transitGatewayRouteTableId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala: Option[Int] = Option(self.maxResults) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetTransitGatewayRouteTableAssociationsRequestOps {

implicit def toGetTransitGatewayRouteTableAssociationsRequestBuilderOps(v: GetTransitGatewayRouteTableAssociationsRequest.Builder): GetTransitGatewayRouteTableAssociationsRequestBuilderOps = new GetTransitGatewayRouteTableAssociationsRequestBuilderOps(v)

implicit def toGetTransitGatewayRouteTableAssociationsRequestOps(v: GetTransitGatewayRouteTableAssociationsRequest): GetTransitGatewayRouteTableAssociationsRequestOps = new GetTransitGatewayRouteTableAssociationsRequestOps(v)

}

