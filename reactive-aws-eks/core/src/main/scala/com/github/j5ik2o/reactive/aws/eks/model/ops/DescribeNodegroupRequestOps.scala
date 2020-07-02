// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class DescribeNodegroupRequestBuilderOps(val self: DescribeNodegroupRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala(value: Option[String]): DescribeNodegroupRequest.Builder = {
    value.fold(self) { v => self.clusterName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodegroupNameAsScala(value: Option[String]): DescribeNodegroupRequest.Builder = {
    value.fold(self) { v => self.nodegroupName(v) }
  }

}

final class DescribeNodegroupRequestOps(val self: DescribeNodegroupRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala: Option[String] = Option(self.clusterName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodegroupNameAsScala: Option[String] = Option(self.nodegroupName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeNodegroupRequestOps {

  implicit def toDescribeNodegroupRequestBuilderOps(
      v: DescribeNodegroupRequest.Builder
  ): DescribeNodegroupRequestBuilderOps = new DescribeNodegroupRequestBuilderOps(v)

  implicit def toDescribeNodegroupRequestOps(v: DescribeNodegroupRequest): DescribeNodegroupRequestOps =
    new DescribeNodegroupRequestOps(v)

}
