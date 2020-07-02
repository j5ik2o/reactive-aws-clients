// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeLocalGatewayVirtualInterfacesResponseBuilderOps(
    val self: DescribeLocalGatewayVirtualInterfacesResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayVirtualInterfacesAsScala(
      value: Option[Seq[LocalGatewayVirtualInterface]]
  ): DescribeLocalGatewayVirtualInterfacesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.localGatewayVirtualInterfaces(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeLocalGatewayVirtualInterfacesResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeLocalGatewayVirtualInterfacesResponseOps(val self: DescribeLocalGatewayVirtualInterfacesResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayVirtualInterfacesAsScala: Option[Seq[LocalGatewayVirtualInterface]] =
    Option(self.localGatewayVirtualInterfaces).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeLocalGatewayVirtualInterfacesResponseOps {

  implicit def toDescribeLocalGatewayVirtualInterfacesResponseBuilderOps(
      v: DescribeLocalGatewayVirtualInterfacesResponse.Builder
  ): DescribeLocalGatewayVirtualInterfacesResponseBuilderOps =
    new DescribeLocalGatewayVirtualInterfacesResponseBuilderOps(v)

  implicit def toDescribeLocalGatewayVirtualInterfacesResponseOps(
      v: DescribeLocalGatewayVirtualInterfacesResponse
  ): DescribeLocalGatewayVirtualInterfacesResponseOps = new DescribeLocalGatewayVirtualInterfacesResponseOps(v)

}
