// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class DescribeClusterRequestBuilderOps(val self: DescribeClusterRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): DescribeClusterRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

}

final class DescribeClusterRequestOps(val self: DescribeClusterRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeClusterRequestOps {

  implicit def toDescribeClusterRequestBuilderOps(v: DescribeClusterRequest.Builder): DescribeClusterRequestBuilderOps =
    new DescribeClusterRequestBuilderOps(v)

  implicit def toDescribeClusterRequestOps(v: DescribeClusterRequest): DescribeClusterRequestOps =
    new DescribeClusterRequestOps(v)

}
