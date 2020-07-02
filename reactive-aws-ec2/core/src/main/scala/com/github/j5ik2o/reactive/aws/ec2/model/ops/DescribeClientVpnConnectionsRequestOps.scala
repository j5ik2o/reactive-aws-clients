// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeClientVpnConnectionsRequestBuilderOps(val self: DescribeClientVpnConnectionsRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientVpnEndpointIdAsScala(value: Option[String]): DescribeClientVpnConnectionsRequest.Builder = {
    value.fold(self) { v => self.clientVpnEndpointId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeClientVpnConnectionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeClientVpnConnectionsRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeClientVpnConnectionsRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

}

final class DescribeClientVpnConnectionsRequestOps(val self: DescribeClientVpnConnectionsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala: Option[Seq[Filter]] =
    Option(self.filters).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeClientVpnConnectionsRequestOps {

  implicit def toDescribeClientVpnConnectionsRequestBuilderOps(
      v: DescribeClientVpnConnectionsRequest.Builder
  ): DescribeClientVpnConnectionsRequestBuilderOps = new DescribeClientVpnConnectionsRequestBuilderOps(v)

  implicit def toDescribeClientVpnConnectionsRequestOps(
      v: DescribeClientVpnConnectionsRequest
  ): DescribeClientVpnConnectionsRequestOps = new DescribeClientVpnConnectionsRequestOps(v)

}
