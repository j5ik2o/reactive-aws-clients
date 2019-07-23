// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteTransitGatewayRouteRequestBuilderOps(val self: DeleteTransitGatewayRouteRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayRouteTableIdAsScala(value: Option[String]): DeleteTransitGatewayRouteRequest.Builder = {
    value.fold(self) { v =>
      self.transitGatewayRouteTableId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationCidrBlockAsScala(value: Option[String]): DeleteTransitGatewayRouteRequest.Builder = {
    value.fold(self) { v =>
      self.destinationCidrBlock(v)
    }
  }

}

final class DeleteTransitGatewayRouteRequestOps(val self: DeleteTransitGatewayRouteRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayRouteTableIdAsScala: Option[String] = Option(self.transitGatewayRouteTableId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationCidrBlockAsScala: Option[String] = Option(self.destinationCidrBlock)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteTransitGatewayRouteRequestOps {

  implicit def toDeleteTransitGatewayRouteRequestBuilderOps(
      v: DeleteTransitGatewayRouteRequest.Builder
  ): DeleteTransitGatewayRouteRequestBuilderOps = new DeleteTransitGatewayRouteRequestBuilderOps(v)

  implicit def toDeleteTransitGatewayRouteRequestOps(
      v: DeleteTransitGatewayRouteRequest
  ): DeleteTransitGatewayRouteRequestOps = new DeleteTransitGatewayRouteRequestOps(v)

}
