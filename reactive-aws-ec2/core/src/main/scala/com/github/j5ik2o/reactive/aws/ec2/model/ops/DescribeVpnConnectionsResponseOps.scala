// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpnConnectionsResponseBuilderOps(val self: DescribeVpnConnectionsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnConnectionsAsScala(value: Option[Seq[VpnConnection]]): DescribeVpnConnectionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.vpnConnections(v.asJava)
    }
  }

}

final class DescribeVpnConnectionsResponseOps(val self: DescribeVpnConnectionsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnConnectionsAsScala: Option[Seq[VpnConnection]] =
    Option(self.vpnConnections).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVpnConnectionsResponseOps {

  implicit def toDescribeVpnConnectionsResponseBuilderOps(
      v: DescribeVpnConnectionsResponse.Builder
  ): DescribeVpnConnectionsResponseBuilderOps = new DescribeVpnConnectionsResponseBuilderOps(v)

  implicit def toDescribeVpnConnectionsResponseOps(
      v: DescribeVpnConnectionsResponse
  ): DescribeVpnConnectionsResponseOps = new DescribeVpnConnectionsResponseOps(v)

}
