// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackInstanceComprehensiveStatusBuilderOps(val self: StackInstanceComprehensiveStatus.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def detailedStatusAsScala(
      value: Option[StackInstanceDetailedStatus]
  ): StackInstanceComprehensiveStatus.Builder = {
    value.fold(self) { v => self.detailedStatus(v) }
  }

}

final class StackInstanceComprehensiveStatusOps(val self: StackInstanceComprehensiveStatus) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def detailedStatusAsScala: Option[StackInstanceDetailedStatus] = Option(self.detailedStatus)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackInstanceComprehensiveStatusOps {

  implicit def toStackInstanceComprehensiveStatusBuilderOps(
      v: StackInstanceComprehensiveStatus.Builder
  ): StackInstanceComprehensiveStatusBuilderOps = new StackInstanceComprehensiveStatusBuilderOps(v)

  implicit def toStackInstanceComprehensiveStatusOps(
      v: StackInstanceComprehensiveStatus
  ): StackInstanceComprehensiveStatusOps = new StackInstanceComprehensiveStatusOps(v)

}
