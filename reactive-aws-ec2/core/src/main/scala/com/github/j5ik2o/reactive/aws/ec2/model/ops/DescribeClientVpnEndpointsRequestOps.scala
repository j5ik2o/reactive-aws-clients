// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeClientVpnEndpointsRequestBuilderOps(val self: DescribeClientVpnEndpointsRequest.Builder)
    extends AnyVal {

  final def clientVpnEndpointIdsAsScala(value: Option[Seq[String]]): DescribeClientVpnEndpointsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.clientVpnEndpointIds(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeClientVpnEndpointsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeClientVpnEndpointsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeClientVpnEndpointsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

}

final class DescribeClientVpnEndpointsRequestOps(val self: DescribeClientVpnEndpointsRequest) extends AnyVal {

  final def clientVpnEndpointIdsAsScala: Option[Seq[String]] = Option(self.clientVpnEndpointIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeClientVpnEndpointsRequestOps {

  implicit def toDescribeClientVpnEndpointsRequestBuilderOps(
      v: DescribeClientVpnEndpointsRequest.Builder
  ): DescribeClientVpnEndpointsRequestBuilderOps = new DescribeClientVpnEndpointsRequestBuilderOps(v)

  implicit def toDescribeClientVpnEndpointsRequestOps(
      v: DescribeClientVpnEndpointsRequest
  ): DescribeClientVpnEndpointsRequestOps = new DescribeClientVpnEndpointsRequestOps(v)

}
