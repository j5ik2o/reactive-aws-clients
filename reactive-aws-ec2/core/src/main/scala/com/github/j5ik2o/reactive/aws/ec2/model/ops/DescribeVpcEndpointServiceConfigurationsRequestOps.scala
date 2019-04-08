// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpcEndpointServiceConfigurationsRequestBuilderOps(
    val self: DescribeVpcEndpointServiceConfigurationsRequest.Builder
) extends AnyVal {

  final def serviceIdsAsScala(value: Option[Seq[String]]): DescribeVpcEndpointServiceConfigurationsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.serviceIds(v.asJava)
    }
  }

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeVpcEndpointServiceConfigurationsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeVpcEndpointServiceConfigurationsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeVpcEndpointServiceConfigurationsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeVpcEndpointServiceConfigurationsRequestOps(
    val self: DescribeVpcEndpointServiceConfigurationsRequest
) extends AnyVal {

  final def serviceIdsAsScala: Option[Seq[String]] = Option(self.serviceIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVpcEndpointServiceConfigurationsRequestOps {

  implicit def toDescribeVpcEndpointServiceConfigurationsRequestBuilderOps(
      v: DescribeVpcEndpointServiceConfigurationsRequest.Builder
  ): DescribeVpcEndpointServiceConfigurationsRequestBuilderOps =
    new DescribeVpcEndpointServiceConfigurationsRequestBuilderOps(v)

  implicit def toDescribeVpcEndpointServiceConfigurationsRequestOps(
      v: DescribeVpcEndpointServiceConfigurationsRequest
  ): DescribeVpcEndpointServiceConfigurationsRequestOps = new DescribeVpcEndpointServiceConfigurationsRequestOps(v)

}
