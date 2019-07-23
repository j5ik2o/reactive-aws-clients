// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeStackSetResponseBuilderOps(val self: DescribeStackSetResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetAsScala(value: Option[StackSet]): DescribeStackSetResponse.Builder = {
    value.fold(self) { v =>
      self.stackSet(v)
    }
  }

}

final class DescribeStackSetResponseOps(val self: DescribeStackSetResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetAsScala: Option[StackSet] = Option(self.stackSet)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStackSetResponseOps {

  implicit def toDescribeStackSetResponseBuilderOps(
      v: DescribeStackSetResponse.Builder
  ): DescribeStackSetResponseBuilderOps = new DescribeStackSetResponseBuilderOps(v)

  implicit def toDescribeStackSetResponseOps(v: DescribeStackSetResponse): DescribeStackSetResponseOps =
    new DescribeStackSetResponseOps(v)

}
