// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResponseBuilderOps(
    val self: DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayRouteTableVirtualInterfaceGroupAssociationsAsScala(
      value: Option[Seq[LocalGatewayRouteTableVirtualInterfaceGroupAssociation]]
  ): DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._;
      self.localGatewayRouteTableVirtualInterfaceGroupAssociations(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(
      value: Option[String]
  ): DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResponseOps(
    val self: DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayRouteTableVirtualInterfaceGroupAssociationsAsScala
      : Option[Seq[LocalGatewayRouteTableVirtualInterfaceGroupAssociation]] =
    Option(self.localGatewayRouteTableVirtualInterfaceGroupAssociations).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResponseOps {

  implicit def toDescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResponseBuilderOps(
      v: DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResponse.Builder
  ): DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResponseBuilderOps =
    new DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResponseBuilderOps(v)

  implicit def toDescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResponseOps(
      v: DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResponse
  ): DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResponseOps =
    new DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResponseOps(v)

}
