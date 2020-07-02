// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class Phase1IntegrityAlgorithmsRequestListValueBuilderOps(
    val self: Phase1IntegrityAlgorithmsRequestListValue.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[String]): Phase1IntegrityAlgorithmsRequestListValue.Builder = {
    value.fold(self) { v => self.value(v) }
  }

}

final class Phase1IntegrityAlgorithmsRequestListValueOps(val self: Phase1IntegrityAlgorithmsRequestListValue)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[String] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPhase1IntegrityAlgorithmsRequestListValueOps {

  implicit def toPhase1IntegrityAlgorithmsRequestListValueBuilderOps(
      v: Phase1IntegrityAlgorithmsRequestListValue.Builder
  ): Phase1IntegrityAlgorithmsRequestListValueBuilderOps = new Phase1IntegrityAlgorithmsRequestListValueBuilderOps(v)

  implicit def toPhase1IntegrityAlgorithmsRequestListValueOps(
      v: Phase1IntegrityAlgorithmsRequestListValue
  ): Phase1IntegrityAlgorithmsRequestListValueOps = new Phase1IntegrityAlgorithmsRequestListValueOps(v)

}
