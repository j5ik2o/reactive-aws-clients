// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeStackSetRequestBuilderOps(val self: DescribeStackSetRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetNameAsScala(value: Option[String]): DescribeStackSetRequest.Builder = {
    value.fold(self) { v => self.stackSetName(v) }
  }

}

final class DescribeStackSetRequestOps(val self: DescribeStackSetRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetNameAsScala: Option[String] = Option(self.stackSetName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStackSetRequestOps {

  implicit def toDescribeStackSetRequestBuilderOps(
      v: DescribeStackSetRequest.Builder
  ): DescribeStackSetRequestBuilderOps = new DescribeStackSetRequestBuilderOps(v)

  implicit def toDescribeStackSetRequestOps(v: DescribeStackSetRequest): DescribeStackSetRequestOps =
    new DescribeStackSetRequestOps(v)

}
