// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpnConnectionsResponseBuilderOps(val self: DescribeVpnConnectionsResponse.Builder) extends AnyVal {

  final def vpnConnectionsAsScala(value: Option[Seq[VpnConnection]]): DescribeVpnConnectionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.vpnConnections(v.asJava)
    }
  }

}

final class DescribeVpnConnectionsResponseOps(val self: DescribeVpnConnectionsResponse) extends AnyVal {

  final def vpnConnectionsAsScala: Option[Seq[VpnConnection]] = Option(self.vpnConnections).map { v =>
    import scala.collection.JavaConverters._; v.asScala
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
