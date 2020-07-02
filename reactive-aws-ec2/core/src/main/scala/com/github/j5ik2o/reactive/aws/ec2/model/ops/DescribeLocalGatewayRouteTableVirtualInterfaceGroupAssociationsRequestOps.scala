// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequestBuilderOps(
    val self: DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayRouteTableVirtualInterfaceGroupAssociationIdsAsScala(
      value: Option[Seq[String]]
  ): DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._;
      self.localGatewayRouteTableVirtualInterfaceGroupAssociationIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(
      value: Option[Seq[Filter]]
  ): DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(
      value: Option[Int]
  ): DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(
      value: Option[String]
  ): DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequestOps(
    val self: DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayRouteTableVirtualInterfaceGroupAssociationIdsAsScala: Option[Seq[String]] =
    Option(self.localGatewayRouteTableVirtualInterfaceGroupAssociationIds).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala: Option[Seq[Filter]] =
    Option(self.filters).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequestOps {

  implicit def toDescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequestBuilderOps(
      v: DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest.Builder
  ): DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequestBuilderOps =
    new DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequestBuilderOps(v)

  implicit def toDescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequestOps(
      v: DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest
  ): DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequestOps =
    new DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequestOps(v)

}
