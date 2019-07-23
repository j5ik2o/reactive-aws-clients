// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteTransitGatewayRouteTableRequestBuilderOps(val self: DeleteTransitGatewayRouteTableRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayRouteTableIdAsScala(value: Option[String]): DeleteTransitGatewayRouteTableRequest.Builder = {
    value.fold(self) { v =>
      self.transitGatewayRouteTableId(v)
    }
  }

}

final class DeleteTransitGatewayRouteTableRequestOps(val self: DeleteTransitGatewayRouteTableRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayRouteTableIdAsScala: Option[String] = Option(self.transitGatewayRouteTableId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteTransitGatewayRouteTableRequestOps {

  implicit def toDeleteTransitGatewayRouteTableRequestBuilderOps(
      v: DeleteTransitGatewayRouteTableRequest.Builder
  ): DeleteTransitGatewayRouteTableRequestBuilderOps = new DeleteTransitGatewayRouteTableRequestBuilderOps(v)

  implicit def toDeleteTransitGatewayRouteTableRequestOps(
      v: DeleteTransitGatewayRouteTableRequest
  ): DeleteTransitGatewayRouteTableRequestOps = new DeleteTransitGatewayRouteTableRequestOps(v)

}
