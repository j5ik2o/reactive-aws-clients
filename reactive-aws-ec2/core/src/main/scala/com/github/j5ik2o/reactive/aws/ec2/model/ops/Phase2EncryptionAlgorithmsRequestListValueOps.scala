// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class Phase2EncryptionAlgorithmsRequestListValueBuilderOps(
    val self: Phase2EncryptionAlgorithmsRequestListValue.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[String]): Phase2EncryptionAlgorithmsRequestListValue.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  }

}

final class Phase2EncryptionAlgorithmsRequestListValueOps(val self: Phase2EncryptionAlgorithmsRequestListValue)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[String] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPhase2EncryptionAlgorithmsRequestListValueOps {

  implicit def toPhase2EncryptionAlgorithmsRequestListValueBuilderOps(
      v: Phase2EncryptionAlgorithmsRequestListValue.Builder
  ): Phase2EncryptionAlgorithmsRequestListValueBuilderOps = new Phase2EncryptionAlgorithmsRequestListValueBuilderOps(v)

  implicit def toPhase2EncryptionAlgorithmsRequestListValueOps(
      v: Phase2EncryptionAlgorithmsRequestListValue
  ): Phase2EncryptionAlgorithmsRequestListValueOps = new Phase2EncryptionAlgorithmsRequestListValueOps(v)

}
