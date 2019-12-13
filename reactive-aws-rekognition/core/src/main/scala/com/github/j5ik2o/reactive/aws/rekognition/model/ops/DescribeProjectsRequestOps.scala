// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DescribeProjectsRequestBuilderOps(val self: DescribeProjectsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeProjectsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeProjectsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

}

final class DescribeProjectsRequestOps(val self: DescribeProjectsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeProjectsRequestOps {

  implicit def toDescribeProjectsRequestBuilderOps(
      v: DescribeProjectsRequest.Builder
  ): DescribeProjectsRequestBuilderOps = new DescribeProjectsRequestBuilderOps(v)

  implicit def toDescribeProjectsRequestOps(v: DescribeProjectsRequest): DescribeProjectsRequestOps =
    new DescribeProjectsRequestOps(v)

}
