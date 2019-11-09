// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class Phase2IntegrityAlgorithmsListValueBuilderOps(val self: Phase2IntegrityAlgorithmsListValue.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[String]): Phase2IntegrityAlgorithmsListValue.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  }

}

final class Phase2IntegrityAlgorithmsListValueOps(val self: Phase2IntegrityAlgorithmsListValue) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[String] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPhase2IntegrityAlgorithmsListValueOps {

  implicit def toPhase2IntegrityAlgorithmsListValueBuilderOps(
      v: Phase2IntegrityAlgorithmsListValue.Builder
  ): Phase2IntegrityAlgorithmsListValueBuilderOps = new Phase2IntegrityAlgorithmsListValueBuilderOps(v)

  implicit def toPhase2IntegrityAlgorithmsListValueOps(
      v: Phase2IntegrityAlgorithmsListValue
  ): Phase2IntegrityAlgorithmsListValueOps = new Phase2IntegrityAlgorithmsListValueOps(v)

}
