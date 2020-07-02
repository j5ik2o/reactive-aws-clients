// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateLocalGatewayRouteRequestBuilderOps(val self: CreateLocalGatewayRouteRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationCidrBlockAsScala(value: Option[String]): CreateLocalGatewayRouteRequest.Builder = {
    value.fold(self) { v => self.destinationCidrBlock(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayRouteTableIdAsScala(value: Option[String]): CreateLocalGatewayRouteRequest.Builder = {
    value.fold(self) { v => self.localGatewayRouteTableId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayVirtualInterfaceGroupIdAsScala(
      value: Option[String]
  ): CreateLocalGatewayRouteRequest.Builder = {
    value.fold(self) { v => self.localGatewayVirtualInterfaceGroupId(v) }
  }

}

final class CreateLocalGatewayRouteRequestOps(val self: CreateLocalGatewayRouteRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationCidrBlockAsScala: Option[String] = Option(self.destinationCidrBlock)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayRouteTableIdAsScala: Option[String] = Option(self.localGatewayRouteTableId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayVirtualInterfaceGroupIdAsScala: Option[String] =
    Option(self.localGatewayVirtualInterfaceGroupId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateLocalGatewayRouteRequestOps {

  implicit def toCreateLocalGatewayRouteRequestBuilderOps(
      v: CreateLocalGatewayRouteRequest.Builder
  ): CreateLocalGatewayRouteRequestBuilderOps = new CreateLocalGatewayRouteRequestBuilderOps(v)

  implicit def toCreateLocalGatewayRouteRequestOps(
      v: CreateLocalGatewayRouteRequest
  ): CreateLocalGatewayRouteRequestOps = new CreateLocalGatewayRouteRequestOps(v)

}
