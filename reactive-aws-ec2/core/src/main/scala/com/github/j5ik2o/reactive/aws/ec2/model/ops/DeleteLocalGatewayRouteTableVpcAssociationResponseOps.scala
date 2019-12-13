// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteLocalGatewayRouteTableVpcAssociationResponseBuilderOps(
    val self: DeleteLocalGatewayRouteTableVpcAssociationResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayRouteTableVpcAssociationAsScala(
      value: Option[LocalGatewayRouteTableVpcAssociation]
  ): DeleteLocalGatewayRouteTableVpcAssociationResponse.Builder = {
    value.fold(self) { v =>
      self.localGatewayRouteTableVpcAssociation(v)
    }
  }

}

final class DeleteLocalGatewayRouteTableVpcAssociationResponseOps(
    val self: DeleteLocalGatewayRouteTableVpcAssociationResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayRouteTableVpcAssociationAsScala: Option[LocalGatewayRouteTableVpcAssociation] =
    Option(self.localGatewayRouteTableVpcAssociation)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteLocalGatewayRouteTableVpcAssociationResponseOps {

  implicit def toDeleteLocalGatewayRouteTableVpcAssociationResponseBuilderOps(
      v: DeleteLocalGatewayRouteTableVpcAssociationResponse.Builder
  ): DeleteLocalGatewayRouteTableVpcAssociationResponseBuilderOps =
    new DeleteLocalGatewayRouteTableVpcAssociationResponseBuilderOps(v)

  implicit def toDeleteLocalGatewayRouteTableVpcAssociationResponseOps(
      v: DeleteLocalGatewayRouteTableVpcAssociationResponse
  ): DeleteLocalGatewayRouteTableVpcAssociationResponseOps =
    new DeleteLocalGatewayRouteTableVpcAssociationResponseOps(v)

}
