// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeLocalGatewayVirtualInterfaceGroupsResponseBuilderOps(
    val self: DescribeLocalGatewayVirtualInterfaceGroupsResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayVirtualInterfaceGroupsAsScala(
      value: Option[Seq[LocalGatewayVirtualInterfaceGroup]]
  ): DescribeLocalGatewayVirtualInterfaceGroupsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._;
      self.localGatewayVirtualInterfaceGroups(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeLocalGatewayVirtualInterfaceGroupsResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeLocalGatewayVirtualInterfaceGroupsResponseOps(
    val self: DescribeLocalGatewayVirtualInterfaceGroupsResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayVirtualInterfaceGroupsAsScala: Option[Seq[LocalGatewayVirtualInterfaceGroup]] =
    Option(self.localGatewayVirtualInterfaceGroups).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeLocalGatewayVirtualInterfaceGroupsResponseOps {

  implicit def toDescribeLocalGatewayVirtualInterfaceGroupsResponseBuilderOps(
      v: DescribeLocalGatewayVirtualInterfaceGroupsResponse.Builder
  ): DescribeLocalGatewayVirtualInterfaceGroupsResponseBuilderOps =
    new DescribeLocalGatewayVirtualInterfaceGroupsResponseBuilderOps(v)

  implicit def toDescribeLocalGatewayVirtualInterfaceGroupsResponseOps(
      v: DescribeLocalGatewayVirtualInterfaceGroupsResponse
  ): DescribeLocalGatewayVirtualInterfaceGroupsResponseOps =
    new DescribeLocalGatewayVirtualInterfaceGroupsResponseOps(v)

}
