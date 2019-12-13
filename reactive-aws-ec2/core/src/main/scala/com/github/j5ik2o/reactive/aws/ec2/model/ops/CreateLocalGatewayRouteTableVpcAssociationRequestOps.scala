// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateLocalGatewayRouteTableVpcAssociationRequestBuilderOps(
    val self: CreateLocalGatewayRouteTableVpcAssociationRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayRouteTableIdAsScala(
      value: Option[String]
  ): CreateLocalGatewayRouteTableVpcAssociationRequest.Builder = {
    value.fold(self) { v =>
      self.localGatewayRouteTableId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): CreateLocalGatewayRouteTableVpcAssociationRequest.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

}

final class CreateLocalGatewayRouteTableVpcAssociationRequestOps(
    val self: CreateLocalGatewayRouteTableVpcAssociationRequest
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayRouteTableIdAsScala: Option[String] = Option(self.localGatewayRouteTableId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateLocalGatewayRouteTableVpcAssociationRequestOps {

  implicit def toCreateLocalGatewayRouteTableVpcAssociationRequestBuilderOps(
      v: CreateLocalGatewayRouteTableVpcAssociationRequest.Builder
  ): CreateLocalGatewayRouteTableVpcAssociationRequestBuilderOps =
    new CreateLocalGatewayRouteTableVpcAssociationRequestBuilderOps(v)

  implicit def toCreateLocalGatewayRouteTableVpcAssociationRequestOps(
      v: CreateLocalGatewayRouteTableVpcAssociationRequest
  ): CreateLocalGatewayRouteTableVpcAssociationRequestOps = new CreateLocalGatewayRouteTableVpcAssociationRequestOps(v)

}
