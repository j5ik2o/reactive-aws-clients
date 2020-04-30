// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateTransitGatewayRouteRequestBuilderOps(val self: CreateTransitGatewayRouteRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def destinationCidrBlockAsScala(value: Option[String]): CreateTransitGatewayRouteRequest.Builder = {
            value.fold(self){ v => self.destinationCidrBlock(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayRouteTableIdAsScala(value: Option[String]): CreateTransitGatewayRouteRequest.Builder = {
            value.fold(self){ v => self.transitGatewayRouteTableId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayAttachmentIdAsScala(value: Option[String]): CreateTransitGatewayRouteRequest.Builder = {
            value.fold(self){ v => self.transitGatewayAttachmentId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def blackholeAsScala(value: Option[Boolean]): CreateTransitGatewayRouteRequest.Builder = {
            value.fold(self){ v => self.blackhole(v) }
            } 


}

final class CreateTransitGatewayRouteRequestOps(val self: CreateTransitGatewayRouteRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def destinationCidrBlockAsScala: Option[String] = Option(self.destinationCidrBlock) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayRouteTableIdAsScala: Option[String] = Option(self.transitGatewayRouteTableId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def blackholeAsScala: Option[Boolean] = Option(self.blackhole) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateTransitGatewayRouteRequestOps {

implicit def toCreateTransitGatewayRouteRequestBuilderOps(v: CreateTransitGatewayRouteRequest.Builder): CreateTransitGatewayRouteRequestBuilderOps = new CreateTransitGatewayRouteRequestBuilderOps(v)

implicit def toCreateTransitGatewayRouteRequestOps(v: CreateTransitGatewayRouteRequest): CreateTransitGatewayRouteRequestOps = new CreateTransitGatewayRouteRequestOps(v)

}

