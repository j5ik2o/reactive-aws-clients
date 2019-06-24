// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeStackSetOperationResponseBuilderOps(val self: DescribeStackSetOperationResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetOperationAsScala(value: Option[StackSetOperation]): DescribeStackSetOperationResponse.Builder = {
    value.fold(self) { v =>
      self.stackSetOperation(v)
    }
  }

}

final class DescribeStackSetOperationResponseOps(val self: DescribeStackSetOperationResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetOperationAsScala: Option[StackSetOperation] = Option(self.stackSetOperation)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStackSetOperationResponseOps {

  implicit def toDescribeStackSetOperationResponseBuilderOps(
      v: DescribeStackSetOperationResponse.Builder
  ): DescribeStackSetOperationResponseBuilderOps = new DescribeStackSetOperationResponseBuilderOps(v)

  implicit def toDescribeStackSetOperationResponseOps(
      v: DescribeStackSetOperationResponse
  ): DescribeStackSetOperationResponseOps = new DescribeStackSetOperationResponseOps(v)

}
