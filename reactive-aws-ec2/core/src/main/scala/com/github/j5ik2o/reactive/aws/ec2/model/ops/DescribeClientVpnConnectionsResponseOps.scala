// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeClientVpnConnectionsResponseBuilderOps(val self: DescribeClientVpnConnectionsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionsAsScala(
      value: Option[Seq[ClientVpnConnection]]
  ): DescribeClientVpnConnectionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.connections(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeClientVpnConnectionsResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeClientVpnConnectionsResponseOps(val self: DescribeClientVpnConnectionsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionsAsScala: Option[Seq[ClientVpnConnection]] =
    Option(self.connections).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
