// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class Phase2EncryptionAlgorithmsListValueBuilderOps(val self: Phase2EncryptionAlgorithmsListValue.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[String]): Phase2EncryptionAlgorithmsListValue.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  }

}

final class Phase2EncryptionAlgorithmsListValueOps(val self: Phase2EncryptionAlgorithmsListValue) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[String] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPhase2EncryptionAlgorithmsListValueOps {

  implicit def toPhase2EncryptionAlgorithmsListValueBuilderOps(
      v: Phase2EncryptionAlgorithmsListValue.Builder
  ): Phase2EncryptionAlgorithmsListValueBuilderOps = new Phase2EncryptionAlgorithmsListValueBuilderOps(v)

  implicit def toPhase2EncryptionAlgorithmsListValueOps(
      v: Phase2EncryptionAlgorithmsListValue
  ): Phase2EncryptionAlgorithmsListValueOps = new Phase2EncryptionAlgorithmsListValueOps(v)

}
