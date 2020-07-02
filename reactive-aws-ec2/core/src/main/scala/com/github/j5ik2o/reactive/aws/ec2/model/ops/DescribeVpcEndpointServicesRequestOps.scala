// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpcEndpointServicesRequestBuilderOps(val self: DescribeVpcEndpointServicesRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceNamesAsScala(value: Option[Seq[String]]): DescribeVpcEndpointServicesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.serviceNames(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeVpcEndpointServicesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeVpcEndpointServicesRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeVpcEndpointServicesRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeVpcEndpointServicesRequestOps(val self: DescribeVpcEndpointServicesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceNamesAsScala: Option[Seq[String]] =
    Option(self.serviceNames).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala: Option[Seq[Filter]] =
    Option(self.filters).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
