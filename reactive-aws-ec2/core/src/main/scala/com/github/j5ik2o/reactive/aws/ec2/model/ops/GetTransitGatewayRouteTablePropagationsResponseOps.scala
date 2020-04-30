// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetTransitGatewayRouteTablePropagationsResponseBuilderOps(val self: GetTransitGatewayRouteTablePropagationsResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayRouteTablePropagationsAsScala(value: Option[Seq[TransitGatewayRouteTablePropagation]]): GetTransitGatewayRouteTablePropagationsResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.transitGatewayRouteTablePropagations(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): GetTransitGatewayRouteTablePropagationsResponse.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class GetTransitGatewayRouteTablePropagationsResponseOps(val self: GetTransitGatewayRouteTablePropagationsResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def transitGatewayRouteTablePropagationsAsScala: Option[Seq[TransitGatewayRouteTablePropagation]] = Option(self.transitGatewayRouteTablePropagations).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetTransitGatewayRouteTablePropagationsResponseOps {

implicit def toGetTransitGatewayRouteTablePropagationsResponseBuilderOps(v: GetTransitGatewayRouteTablePropagationsResponse.Builder): GetTransitGatewayRouteTablePropagationsResponseBuilderOps = new GetTransitGatewayRouteTablePropagationsResponseBuilderOps(v)

implicit def toGetTransitGatewayRouteTablePropagationsResponseOps(v: GetTransitGatewayRouteTablePropagationsResponse): GetTransitGatewayRouteTablePropagationsResponseOps = new GetTransitGatewayRouteTablePropagationsResponseOps(v)

}

