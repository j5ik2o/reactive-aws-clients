// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpcEndpointsRequestBuilderOps(val self: DescribeVpcEndpointsRequest.Builder) extends AnyVal {

  final def vpcEndpointIdsAsScala(value: Option[Seq[String]]): DescribeVpcEndpointsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.vpcEndpointIds(v.asJava)
    }
  }

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeVpcEndpointsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeVpcEndpointsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeVpcEndpointsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeVpcEndpointsRequestOps(val self: DescribeVpcEndpointsRequest) extends AnyVal {

  final def vpcEndpointIdsAsScala: Option[Seq[String]] = Option(self.vpcEndpointIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVpcEndpointsRequestOps {

  implicit def toDescribeVpcEndpointsRequestBuilderOps(
      v: DescribeVpcEndpointsRequest.Builder
  ): DescribeVpcEndpointsRequestBuilderOps = new DescribeVpcEndpointsRequestBuilderOps(v)

  implicit def toDescribeVpcEndpointsRequestOps(v: DescribeVpcEndpointsRequest): DescribeVpcEndpointsRequestOps =
    new DescribeVpcEndpointsRequestOps(v)

}
