// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeStackSetOperationRequestBuilderOps(val self: DescribeStackSetOperationRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetNameAsScala(value: Option[String]): DescribeStackSetOperationRequest.Builder = {
    value.fold(self) { v => self.stackSetName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationIdAsScala(value: Option[String]): DescribeStackSetOperationRequest.Builder = {
    value.fold(self) { v => self.operationId(v) }
  }

}

final class DescribeStackSetOperationRequestOps(val self: DescribeStackSetOperationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetNameAsScala: Option[String] = Option(self.stackSetName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationIdAsScala: Option[String] = Option(self.operationId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStackSetOperationRequestOps {

  implicit def toDescribeStackSetOperationRequestBuilderOps(
      v: DescribeStackSetOperationRequest.Builder
  ): DescribeStackSetOperationRequestBuilderOps = new DescribeStackSetOperationRequestBuilderOps(v)

  implicit def toDescribeStackSetOperationRequestOps(
      v: DescribeStackSetOperationRequest
  ): DescribeStackSetOperationRequestOps = new DescribeStackSetOperationRequestOps(v)

}
