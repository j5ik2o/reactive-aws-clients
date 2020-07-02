// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class DescribeNodegroupResponseBuilderOps(val self: DescribeNodegroupResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodegroupAsScala(value: Option[Nodegroup]): DescribeNodegroupResponse.Builder = {
    value.fold(self) { v => self.nodegroup(v) }
  }

}

final class DescribeNodegroupResponseOps(val self: DescribeNodegroupResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodegroupAsScala: Option[Nodegroup] = Option(self.nodegroup)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeNodegroupResponseOps {

  implicit def toDescribeNodegroupResponseBuilderOps(
      v: DescribeNodegroupResponse.Builder
  ): DescribeNodegroupResponseBuilderOps = new DescribeNodegroupResponseBuilderOps(v)

  implicit def toDescribeNodegroupResponseOps(v: DescribeNodegroupResponse): DescribeNodegroupResponseOps =
    new DescribeNodegroupResponseOps(v)

}
