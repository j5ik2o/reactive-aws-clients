// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeLocalGatewayVirtualInterfaceGroupsRequestBuilderOps(
    val self: DescribeLocalGatewayVirtualInterfaceGroupsRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayVirtualInterfaceGroupIdsAsScala(
      value: Option[Seq[String]]
  ): DescribeLocalGatewayVirtualInterfaceGroupsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._;
      self.localGatewayVirtualInterfaceGroupIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeLocalGatewayVirtualInterfaceGroupsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeLocalGatewayVirtualInterfaceGroupsRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeLocalGatewayVirtualInterfaceGroupsRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeLocalGatewayVirtualInterfaceGroupsRequestOps(
    val self: DescribeLocalGatewayVirtualInterfaceGroupsRequest
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayVirtualInterfaceGroupIdsAsScala: Option[Seq[String]] =
    Option(self.localGatewayVirtualInterfaceGroupIds).map { v =>
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
trait ToDescribeLocalGatewayVirtualInterfaceGroupsRequestOps {

  implicit def toDescribeLocalGatewayVirtualInterfaceGroupsRequestBuilderOps(
      v: DescribeLocalGatewayVirtualInterfaceGroupsRequest.Builder
  ): DescribeLocalGatewayVirtualInterfaceGroupsRequestBuilderOps =
    new DescribeLocalGatewayVirtualInterfaceGroupsRequestBuilderOps(v)

  implicit def toDescribeLocalGatewayVirtualInterfaceGroupsRequestOps(
      v: DescribeLocalGatewayVirtualInterfaceGroupsRequest
  ): DescribeLocalGatewayVirtualInterfaceGroupsRequestOps = new DescribeLocalGatewayVirtualInterfaceGroupsRequestOps(v)

}
