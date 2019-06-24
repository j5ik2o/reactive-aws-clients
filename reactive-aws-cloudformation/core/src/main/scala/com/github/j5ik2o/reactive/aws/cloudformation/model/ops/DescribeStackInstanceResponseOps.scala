// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeStackInstanceResponseBuilderOps(val self: DescribeStackInstanceResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackInstanceAsScala(value: Option[StackInstance]): DescribeStackInstanceResponse.Builder = {
    value.fold(self) { v =>
      self.stackInstance(v)
    }
  }

}

final class DescribeStackInstanceResponseOps(val self: DescribeStackInstanceResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackInstanceAsScala: Option[StackInstance] = Option(self.stackInstance)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStackInstanceResponseOps {

  implicit def toDescribeStackInstanceResponseBuilderOps(
      v: DescribeStackInstanceResponse.Builder
  ): DescribeStackInstanceResponseBuilderOps = new DescribeStackInstanceResponseBuilderOps(v)

  implicit def toDescribeStackInstanceResponseOps(v: DescribeStackInstanceResponse): DescribeStackInstanceResponseOps =
    new DescribeStackInstanceResponseOps(v)

}
