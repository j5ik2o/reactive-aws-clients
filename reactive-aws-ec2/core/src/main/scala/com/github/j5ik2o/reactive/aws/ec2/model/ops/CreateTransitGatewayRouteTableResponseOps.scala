// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateTransitGatewayRouteTableResponseBuilderOps(val self: CreateTransitGatewayRouteTableResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayRouteTableAsScala(
      value: Option[TransitGatewayRouteTable]
  ): CreateTransitGatewayRouteTableResponse.Builder = {
    value.fold(self) { v => self.transitGatewayRouteTable(v) }
  }

}

final class CreateTransitGatewayRouteTableResponseOps(val self: CreateTransitGatewayRouteTableResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayRouteTableAsScala: Option[TransitGatewayRouteTable] = Option(self.transitGatewayRouteTable)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateTransitGatewayRouteTableResponseOps {

  implicit def toCreateTransitGatewayRouteTableResponseBuilderOps(
      v: CreateTransitGatewayRouteTableResponse.Builder
  ): CreateTransitGatewayRouteTableResponseBuilderOps = new CreateTransitGatewayRouteTableResponseBuilderOps(v)

  implicit def toCreateTransitGatewayRouteTableResponseOps(
      v: CreateTransitGatewayRouteTableResponse
  ): CreateTransitGatewayRouteTableResponseOps = new CreateTransitGatewayRouteTableResponseOps(v)

}
