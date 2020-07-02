// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class Phase1IntegrityAlgorithmsListValueBuilderOps(val self: Phase1IntegrityAlgorithmsListValue.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[String]): Phase1IntegrityAlgorithmsListValue.Builder = {
    value.fold(self) { v => self.value(v) }
  }

}

final class Phase1IntegrityAlgorithmsListValueOps(val self: Phase1IntegrityAlgorithmsListValue) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[String] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPhase1IntegrityAlgorithmsListValueOps {

  implicit def toPhase1IntegrityAlgorithmsListValueBuilderOps(
      v: Phase1IntegrityAlgorithmsListValue.Builder
  ): Phase1IntegrityAlgorithmsListValueBuilderOps = new Phase1IntegrityAlgorithmsListValueBuilderOps(v)

  implicit def toPhase1IntegrityAlgorithmsListValueOps(
      v: Phase1IntegrityAlgorithmsListValue
  ): Phase1IntegrityAlgorithmsListValueOps = new Phase1IntegrityAlgorithmsListValueOps(v)

}
