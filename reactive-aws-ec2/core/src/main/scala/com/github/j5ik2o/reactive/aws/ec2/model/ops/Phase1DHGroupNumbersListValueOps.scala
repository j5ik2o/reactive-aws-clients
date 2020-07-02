// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class Phase1DHGroupNumbersListValueBuilderOps(val self: Phase1DHGroupNumbersListValue.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[Int]): Phase1DHGroupNumbersListValue.Builder = {
    value.fold(self) { v => self.value(v) }
  }

}

final class Phase1DHGroupNumbersListValueOps(val self: Phase1DHGroupNumbersListValue) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[Int] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPhase1DHGroupNumbersListValueOps {

  implicit def toPhase1DHGroupNumbersListValueBuilderOps(
      v: Phase1DHGroupNumbersListValue.Builder
  ): Phase1DHGroupNumbersListValueBuilderOps = new Phase1DHGroupNumbersListValueBuilderOps(v)

  implicit def toPhase1DHGroupNumbersListValueOps(v: Phase1DHGroupNumbersListValue): Phase1DHGroupNumbersListValueOps =
    new Phase1DHGroupNumbersListValueOps(v)

}
