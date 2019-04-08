// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeClientVpnConnectionsResponseBuilderOps(val self: DescribeClientVpnConnectionsResponse.Builder)
    extends AnyVal {

  final def connectionsAsScala(
      value: Option[Seq[ClientVpnConnection]]
  ): DescribeClientVpnConnectionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.connections(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeClientVpnConnectionsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeClientVpnConnectionsResponseOps(val self: DescribeClientVpnConnectionsResponse) extends AnyVal {

  final def connectionsAsScala: Option[Seq[ClientVpnConnection]] = Option(self.connections).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeClientVpnConnectionsResponseOps {

  implicit def toDescribeClientVpnConnectionsResponseBuilderOps(
      v: DescribeClientVpnConnectionsResponse.Builder
  ): DescribeClientVpnConnectionsResponseBuilderOps = new DescribeClientVpnConnectionsResponseBuilderOps(v)

  implicit def toDescribeClientVpnConnectionsResponseOps(
      v: DescribeClientVpnConnectionsResponse
  ): DescribeClientVpnConnectionsResponseOps = new DescribeClientVpnConnectionsResponseOps(v)

}
