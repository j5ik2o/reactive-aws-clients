// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateTransitGatewayRouteRequestBuilderOps(val self: CreateTransitGatewayRouteRequest.Builder)
    extends AnyVal {

  final def destinationCidrBlockAsScala(value: Option[String]): CreateTransitGatewayRouteRequest.Builder = {
    value.fold(self) { v =>
      self.destinationCidrBlock(v)
    }
  }

  final def transitGatewayRouteTableIdAsScala(value: Option[String]): CreateTransitGatewayRouteRequest.Builder = {
    value.fold(self) { v =>
      self.transitGatewayRouteTableId(v)
    }
  }

  final def transitGatewayAttachmentIdAsScala(value: Option[String]): CreateTransitGatewayRouteRequest.Builder = {
    value.fold(self) { v =>
      self.transitGatewayAttachmentId(v)
    }
  }

  final def blackholeAsScala(value: Option[Boolean]): CreateTransitGatewayRouteRequest.Builder = {
    value.fold(self) { v =>
      self.blackhole(v)
    }
  }

}

final class CreateTransitGatewayRouteRequestOps(val self: CreateTransitGatewayRouteRequest) extends AnyVal {

  final def destinationCidrBlockAsScala: Option[String] = Option(self.destinationCidrBlock)

  final def transitGatewayRouteTableIdAsScala: Option[String] = Option(self.transitGatewayRouteTableId)

  final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId)

  final def blackholeAsScala: Option[Boolean] = Option(self.blackhole)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateTransitGatewayRouteRequestOps {

  implicit def toCreateTransitGatewayRouteRequestBuilderOps(
      v: CreateTransitGatewayRouteRequest.Builder
  ): CreateTransitGatewayRouteRequestBuilderOps = new CreateTransitGatewayRouteRequestBuilderOps(v)

  implicit def toCreateTransitGatewayRouteRequestOps(
      v: CreateTransitGatewayRouteRequest
  ): CreateTransitGatewayRouteRequestOps = new CreateTransitGatewayRouteRequestOps(v)

}
