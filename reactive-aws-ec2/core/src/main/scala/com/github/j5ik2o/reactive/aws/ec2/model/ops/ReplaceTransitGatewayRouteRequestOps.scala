// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReplaceTransitGatewayRouteRequestBuilderOps(val self: ReplaceTransitGatewayRouteRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationCidrBlockAsScala(value: Option[String]): ReplaceTransitGatewayRouteRequest.Builder = {
    value.fold(self) { v => self.destinationCidrBlock(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayRouteTableIdAsScala(value: Option[String]): ReplaceTransitGatewayRouteRequest.Builder = {
    value.fold(self) { v => self.transitGatewayRouteTableId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayAttachmentIdAsScala(value: Option[String]): ReplaceTransitGatewayRouteRequest.Builder = {
    value.fold(self) { v => self.transitGatewayAttachmentId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def blackholeAsScala(value: Option[Boolean]): ReplaceTransitGatewayRouteRequest.Builder = {
    value.fold(self) { v => self.blackhole(v) }
  }

}

final class ReplaceTransitGatewayRouteRequestOps(val self: ReplaceTransitGatewayRouteRequest) extends AnyVal {

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
trait ToReplaceTransitGatewayRouteRequestOps {

  implicit def toReplaceTransitGatewayRouteRequestBuilderOps(
      v: ReplaceTransitGatewayRouteRequest.Builder
  ): ReplaceTransitGatewayRouteRequestBuilderOps = new ReplaceTransitGatewayRouteRequestBuilderOps(v)

  implicit def toReplaceTransitGatewayRouteRequestOps(
      v: ReplaceTransitGatewayRouteRequest
  ): ReplaceTransitGatewayRouteRequestOps = new ReplaceTransitGatewayRouteRequestOps(v)

}
