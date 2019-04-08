// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeClientVpnRoutesRequestBuilderOps(val self: DescribeClientVpnRoutesRequest.Builder) extends AnyVal {

  final def clientVpnEndpointIdAsScala(value: Option[String]): DescribeClientVpnRoutesRequest.Builder = {
    value.fold(self) { v =>
      self.clientVpnEndpointId(v)
    }
  }

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeClientVpnRoutesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeClientVpnRoutesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeClientVpnRoutesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeClientVpnRoutesRequestOps(val self: DescribeClientVpnRoutesRequest) extends AnyVal {

  final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId)

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeClientVpnRoutesRequestOps {

  implicit def toDescribeClientVpnRoutesRequestBuilderOps(
      v: DescribeClientVpnRoutesRequest.Builder
  ): DescribeClientVpnRoutesRequestBuilderOps = new DescribeClientVpnRoutesRequestBuilderOps(v)

  implicit def toDescribeClientVpnRoutesRequestOps(
      v: DescribeClientVpnRoutesRequest
  ): DescribeClientVpnRoutesRequestOps = new DescribeClientVpnRoutesRequestOps(v)

}
