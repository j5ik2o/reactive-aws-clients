// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class Phase1EncryptionAlgorithmsRequestListValueBuilderOps(
    val self: Phase1EncryptionAlgorithmsRequestListValue.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[String]): Phase1EncryptionAlgorithmsRequestListValue.Builder = {
    value.fold(self) { v => self.value(v) }
  }

}

final class Phase1EncryptionAlgorithmsRequestListValueOps(val self: Phase1EncryptionAlgorithmsRequestListValue)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[String] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPhase1EncryptionAlgorithmsRequestListValueOps {

  implicit def toPhase1EncryptionAlgorithmsRequestListValueBuilderOps(
      v: Phase1EncryptionAlgorithmsRequestListValue.Builder
  ): Phase1EncryptionAlgorithmsRequestListValueBuilderOps = new Phase1EncryptionAlgorithmsRequestListValueBuilderOps(v)

  implicit def toPhase1EncryptionAlgorithmsRequestListValueOps(
      v: Phase1EncryptionAlgorithmsRequestListValue
  ): Phase1EncryptionAlgorithmsRequestListValueOps = new Phase1EncryptionAlgorithmsRequestListValueOps(v)

}
