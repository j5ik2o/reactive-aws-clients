// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateLocalGatewayRouteTableVpcAssociationResponseBuilderOps(
    val self: CreateLocalGatewayRouteTableVpcAssociationResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayRouteTableVpcAssociationAsScala(
      value: Option[LocalGatewayRouteTableVpcAssociation]
  ): CreateLocalGatewayRouteTableVpcAssociationResponse.Builder = {
    value.fold(self) { v =>
      self.localGatewayRouteTableVpcAssociation(v)
    }
  }

}

final class CreateLocalGatewayRouteTableVpcAssociationResponseOps(
    val self: CreateLocalGatewayRouteTableVpcAssociationResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayRouteTableVpcAssociationAsScala: Option[LocalGatewayRouteTableVpcAssociation] =
    Option(self.localGatewayRouteTableVpcAssociation)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateLocalGatewayRouteTableVpcAssociationResponseOps {

  implicit def toCreateLocalGatewayRouteTableVpcAssociationResponseBuilderOps(
      v: CreateLocalGatewayRouteTableVpcAssociationResponse.Builder
  ): CreateLocalGatewayRouteTableVpcAssociationResponseBuilderOps =
    new CreateLocalGatewayRouteTableVpcAssociationResponseBuilderOps(v)

  implicit def toCreateLocalGatewayRouteTableVpcAssociationResponseOps(
      v: CreateLocalGatewayRouteTableVpcAssociationResponse
  ): CreateLocalGatewayRouteTableVpcAssociationResponseOps =
    new CreateLocalGatewayRouteTableVpcAssociationResponseOps(v)

}
