// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class EncryptResponseBuilderOps(val self: EncryptResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ciphertextBlobAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): EncryptResponse.Builder = {
    value.fold(self) { v =>
      self.ciphertextBlob(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): EncryptResponse.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionAlgorithmAsScala(value: Option[EncryptionAlgorithmSpec]): EncryptResponse.Builder = {
    value.fold(self) { v =>
      self.encryptionAlgorithm(v)
    }
  }

}

final class EncryptResponseOps(val self: EncryptResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ciphertextBlobAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.ciphertextBlob)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionAlgorithmAsScala: Option[EncryptionAlgorithmSpec] = Option(self.encryptionAlgorithm)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEncryptResponseOps {

  implicit def toEncryptResponseBuilderOps(v: EncryptResponse.Builder): EncryptResponseBuilderOps =
    new EncryptResponseBuilderOps(v)

  implicit def toEncryptResponseOps(v: EncryptResponse): EncryptResponseOps = new EncryptResponseOps(v)

}
