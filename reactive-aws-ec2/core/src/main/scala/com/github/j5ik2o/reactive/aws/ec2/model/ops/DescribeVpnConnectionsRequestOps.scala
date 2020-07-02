// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpnConnectionsRequestBuilderOps(val self: DescribeVpnConnectionsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeVpnConnectionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnConnectionIdsAsScala(value: Option[Seq[String]]): DescribeVpnConnectionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.vpnConnectionIds(v.asJava)
    }
  }

}

final class DescribeVpnConnectionsRequestOps(val self: DescribeVpnConnectionsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala: Option[Seq[Filter]] =
    Option(self.filters).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnConnectionIdsAsScala: Option[Seq[String]] =
    Option(self.vpnConnectionIds).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVpnConnectionsRequestOps {

  implicit def toDescribeVpnConnectionsRequestBuilderOps(
      v: DescribeVpnConnectionsRequest.Builder
  ): DescribeVpnConnectionsRequestBuilderOps = new DescribeVpnConnectionsRequestBuilderOps(v)

  implicit def toDescribeVpnConnectionsRequestOps(v: DescribeVpnConnectionsRequest): DescribeVpnConnectionsRequestOps =
    new DescribeVpnConnectionsRequestOps(v)

}
