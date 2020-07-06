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
    value.fold(self) { v => self.localGatewayRouteTableId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): CreateLocalGatewayRouteTableVpcAssociationRequest.Builder = {
    value.fold(self) { v => self.vpcId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala(
      value: Option[Seq[TagSpecification]]
  ): CreateLocalGatewayRouteTableVpcAssociationRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSpecifications(v.asJava)
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

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] =
    Option(self.tagSpecifications).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

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
