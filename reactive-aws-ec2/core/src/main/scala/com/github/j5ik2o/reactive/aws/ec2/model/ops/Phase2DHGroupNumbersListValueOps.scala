// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class Phase2DHGroupNumbersListValueBuilderOps(val self: Phase2DHGroupNumbersListValue.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[Int]): Phase2DHGroupNumbersListValue.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  }

}

final class Phase2DHGroupNumbersListValueOps(val self: Phase2DHGroupNumbersListValue) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[Int] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPhase2DHGroupNumbersListValueOps {

  implicit def toPhase2DHGroupNumbersListValueBuilderOps(
      v: Phase2DHGroupNumbersListValue.Builder
  ): Phase2DHGroupNumbersListValueBuilderOps = new Phase2DHGroupNumbersListValueBuilderOps(v)

  implicit def toPhase2DHGroupNumbersListValueOps(v: Phase2DHGroupNumbersListValue): Phase2DHGroupNumbersListValueOps =
    new Phase2DHGroupNumbersListValueOps(v)

}
