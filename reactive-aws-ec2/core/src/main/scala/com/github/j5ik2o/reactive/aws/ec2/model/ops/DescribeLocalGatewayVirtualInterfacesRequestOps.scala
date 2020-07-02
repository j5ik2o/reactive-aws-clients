// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeLocalGatewayVirtualInterfacesRequestBuilderOps(
    val self: DescribeLocalGatewayVirtualInterfacesRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayVirtualInterfaceIdsAsScala(
      value: Option[Seq[String]]
  ): DescribeLocalGatewayVirtualInterfacesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.localGatewayVirtualInterfaceIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeLocalGatewayVirtualInterfacesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeLocalGatewayVirtualInterfacesRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeLocalGatewayVirtualInterfacesRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeLocalGatewayVirtualInterfacesRequestOps(val self: DescribeLocalGatewayVirtualInterfacesRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayVirtualInterfaceIdsAsScala: Option[Seq[String]] =
    Option(self.localGatewayVirtualInterfaceIds).map { v =>
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
trait ToDescribeLocalGatewayVirtualInterfacesRequestOps {

  implicit def toDescribeLocalGatewayVirtualInterfacesRequestBuilderOps(
      v: DescribeLocalGatewayVirtualInterfacesRequest.Builder
  ): DescribeLocalGatewayVirtualInterfacesRequestBuilderOps =
    new DescribeLocalGatewayVirtualInterfacesRequestBuilderOps(v)

  implicit def toDescribeLocalGatewayVirtualInterfacesRequestOps(
      v: DescribeLocalGatewayVirtualInterfacesRequest
  ): DescribeLocalGatewayVirtualInterfacesRequestOps = new DescribeLocalGatewayVirtualInterfacesRequestOps(v)

}
