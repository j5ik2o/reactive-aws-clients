// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpnGatewaysRequestBuilderOps(val self: DescribeVpnGatewaysRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeVpnGatewaysRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnGatewayIdsAsScala(value: Option[Seq[String]]): DescribeVpnGatewaysRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.vpnGatewayIds(v.asJava)
    }
  }

}

final class DescribeVpnGatewaysRequestOps(val self: DescribeVpnGatewaysRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala: Option[Seq[Filter]] =
    Option(self.filters).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnGatewayIdsAsScala: Option[Seq[String]] =
    Option(self.vpnGatewayIds).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVpnGatewaysRequestOps {

  implicit def toDescribeVpnGatewaysRequestBuilderOps(
      v: DescribeVpnGatewaysRequest.Builder
  ): DescribeVpnGatewaysRequestBuilderOps = new DescribeVpnGatewaysRequestBuilderOps(v)

  implicit def toDescribeVpnGatewaysRequestOps(v: DescribeVpnGatewaysRequest): DescribeVpnGatewaysRequestOps =
    new DescribeVpnGatewaysRequestOps(v)

}
