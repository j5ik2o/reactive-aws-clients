// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class Phase1EncryptionAlgorithmsListValueBuilderOps(val self: Phase1EncryptionAlgorithmsListValue.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[String]): Phase1EncryptionAlgorithmsListValue.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  }

}

final class Phase1EncryptionAlgorithmsListValueOps(val self: Phase1EncryptionAlgorithmsListValue) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[String] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPhase1EncryptionAlgorithmsListValueOps {

  implicit def toPhase1EncryptionAlgorithmsListValueBuilderOps(
      v: Phase1EncryptionAlgorithmsListValue.Builder
  ): Phase1EncryptionAlgorithmsListValueBuilderOps = new Phase1EncryptionAlgorithmsListValueBuilderOps(v)

  implicit def toPhase1EncryptionAlgorithmsListValueOps(
      v: Phase1EncryptionAlgorithmsListValue
  ): Phase1EncryptionAlgorithmsListValueOps = new Phase1EncryptionAlgorithmsListValueOps(v)

}
