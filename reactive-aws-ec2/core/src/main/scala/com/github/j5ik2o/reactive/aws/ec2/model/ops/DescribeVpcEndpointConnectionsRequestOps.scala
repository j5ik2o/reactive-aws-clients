// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpcEndpointConnectionsRequestBuilderOps(val self: DescribeVpcEndpointConnectionsRequest.Builder)
    extends AnyVal {

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeVpcEndpointConnectionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeVpcEndpointConnectionsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeVpcEndpointConnectionsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeVpcEndpointConnectionsRequestOps(val self: DescribeVpcEndpointConnectionsRequest) extends AnyVal {

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVpcEndpointConnectionsRequestOps {

  implicit def toDescribeVpcEndpointConnectionsRequestBuilderOps(
      v: DescribeVpcEndpointConnectionsRequest.Builder
  ): DescribeVpcEndpointConnectionsRequestBuilderOps = new DescribeVpcEndpointConnectionsRequestBuilderOps(v)

  implicit def toDescribeVpcEndpointConnectionsRequestOps(
      v: DescribeVpcEndpointConnectionsRequest
  ): DescribeVpcEndpointConnectionsRequestOps = new DescribeVpcEndpointConnectionsRequestOps(v)

}
