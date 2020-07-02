// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class ReEncryptResponseBuilderOps(val self: ReEncryptResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ciphertextBlobAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): ReEncryptResponse.Builder = {
    value.fold(self) { v => self.ciphertextBlob(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceKeyIdAsScala(value: Option[String]): ReEncryptResponse.Builder = {
    value.fold(self) { v => self.sourceKeyId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): ReEncryptResponse.Builder = {
    value.fold(self) { v => self.keyId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceEncryptionAlgorithmAsScala(value: Option[EncryptionAlgorithmSpec]): ReEncryptResponse.Builder = {
    value.fold(self) { v => self.sourceEncryptionAlgorithm(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationEncryptionAlgorithmAsScala(value: Option[EncryptionAlgorithmSpec]): ReEncryptResponse.Builder = {
    value.fold(self) { v => self.destinationEncryptionAlgorithm(v) }
  }

}

final class ReEncryptResponseOps(val self: ReEncryptResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ciphertextBlobAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.ciphertextBlob)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceKeyIdAsScala: Option[String] = Option(self.sourceKeyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceEncryptionAlgorithmAsScala: Option[EncryptionAlgorithmSpec] = Option(self.sourceEncryptionAlgorithm)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationEncryptionAlgorithmAsScala: Option[EncryptionAlgorithmSpec] =
    Option(self.destinationEncryptionAlgorithm)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReEncryptResponseOps {

  implicit def toReEncryptResponseBuilderOps(v: ReEncryptResponse.Builder): ReEncryptResponseBuilderOps =
    new ReEncryptResponseBuilderOps(v)

  implicit def toReEncryptResponseOps(v: ReEncryptResponse): ReEncryptResponseOps = new ReEncryptResponseOps(v)

}
