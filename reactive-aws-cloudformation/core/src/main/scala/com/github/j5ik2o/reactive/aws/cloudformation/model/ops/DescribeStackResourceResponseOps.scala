// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeStackResourceResponseBuilderOps(val self: DescribeStackResourceResponse.Builder) extends AnyVal {

  final def stackResourceDetailAsScala(value: Option[StackResourceDetail]): DescribeStackResourceResponse.Builder = {
    value.fold(self) { v =>
      self.stackResourceDetail(v)
    }
  }

}

final class DescribeStackResourceResponseOps(val self: DescribeStackResourceResponse) extends AnyVal {

  final def stackResourceDetailAsScala: Option[StackResourceDetail] = Option(self.stackResourceDetail)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStackResourceResponseOps {

  implicit def toDescribeStackResourceResponseBuilderOps(
      v: DescribeStackResourceResponse.Builder
  ): DescribeStackResourceResponseBuilderOps = new DescribeStackResourceResponseBuilderOps(v)

  implicit def toDescribeStackResourceResponseOps(v: DescribeStackResourceResponse): DescribeStackResourceResponseOps =
    new DescribeStackResourceResponseOps(v)

}
