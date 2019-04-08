// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpcEndpointServicesRequestBuilderOps(val self: DescribeVpcEndpointServicesRequest.Builder)
    extends AnyVal {

  final def serviceNamesAsScala(value: Option[Seq[String]]): DescribeVpcEndpointServicesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.serviceNames(v.asJava)
    }
  }

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeVpcEndpointServicesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeVpcEndpointServicesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeVpcEndpointServicesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeVpcEndpointServicesRequestOps(val self: DescribeVpcEndpointServicesRequest) extends AnyVal {

  final def serviceNamesAsScala: Option[Seq[String]] = Option(self.serviceNames).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVpcEndpointServicesRequestOps {

  implicit def toDescribeVpcEndpointServicesRequestBuilderOps(
      v: DescribeVpcEndpointServicesRequest.Builder
  ): DescribeVpcEndpointServicesRequestBuilderOps = new DescribeVpcEndpointServicesRequestBuilderOps(v)

  implicit def toDescribeVpcEndpointServicesRequestOps(
      v: DescribeVpcEndpointServicesRequest
  ): DescribeVpcEndpointServicesRequestOps = new DescribeVpcEndpointServicesRequestOps(v)

}
