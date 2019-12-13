// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteLocalGatewayRouteTableVpcAssociationRequestBuilderOps(
    val self: DeleteLocalGatewayRouteTableVpcAssociationRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayRouteTableVpcAssociationIdAsScala(
      value: Option[String]
  ): DeleteLocalGatewayRouteTableVpcAssociationRequest.Builder = {
    value.fold(self) { v =>
      self.localGatewayRouteTableVpcAssociationId(v)
    }
  }

}

final class DeleteLocalGatewayRouteTableVpcAssociationRequestOps(
    val self: DeleteLocalGatewayRouteTableVpcAssociationRequest
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayRouteTableVpcAssociationIdAsScala: Option[String] =
    Option(self.localGatewayRouteTableVpcAssociationId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteLocalGatewayRouteTableVpcAssociationRequestOps {

  implicit def toDeleteLocalGatewayRouteTableVpcAssociationRequestBuilderOps(
      v: DeleteLocalGatewayRouteTableVpcAssociationRequest.Builder
  ): DeleteLocalGatewayRouteTableVpcAssociationRequestBuilderOps =
    new DeleteLocalGatewayRouteTableVpcAssociationRequestBuilderOps(v)

  implicit def toDeleteLocalGatewayRouteTableVpcAssociationRequestOps(
      v: DeleteLocalGatewayRouteTableVpcAssociationRequest
  ): DeleteLocalGatewayRouteTableVpcAssociationRequestOps = new DeleteLocalGatewayRouteTableVpcAssociationRequestOps(v)

}
