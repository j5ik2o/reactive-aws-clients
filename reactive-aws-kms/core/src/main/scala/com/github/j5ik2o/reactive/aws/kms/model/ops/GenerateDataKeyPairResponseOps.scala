// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class GenerateDataKeyPairResponseBuilderOps(val self: GenerateDataKeyPairResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateKeyCiphertextBlobAsScala(
      value: Option[software.amazon.awssdk.core.SdkBytes]
  ): GenerateDataKeyPairResponse.Builder = {
    value.fold(self) { v =>
      self.privateKeyCiphertextBlob(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateKeyPlaintextAsScala(
      value: Option[software.amazon.awssdk.core.SdkBytes]
  ): GenerateDataKeyPairResponse.Builder = {
    value.fold(self) { v =>
      self.privateKeyPlaintext(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publicKeyAsScala(
      value: Option[software.amazon.awssdk.core.SdkBytes]
  ): GenerateDataKeyPairResponse.Builder = {
    value.fold(self) { v =>
      self.publicKey(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): GenerateDataKeyPairResponse.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyPairSpecAsScala(value: Option[DataKeyPairSpec]): GenerateDataKeyPairResponse.Builder = {
    value.fold(self) { v =>
      self.keyPairSpec(v)
    }
  }

}

final class GenerateDataKeyPairResponseOps(val self: GenerateDataKeyPairResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateKeyCiphertextBlobAsScala: Option[software.amazon.awssdk.core.SdkBytes] =
    Option(self.privateKeyCiphertextBlob)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateKeyPlaintextAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.privateKeyPlaintext)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publicKeyAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.publicKey)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyPairSpecAsScala: Option[DataKeyPairSpec] = Option(self.keyPairSpec)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGenerateDataKeyPairResponseOps {

  implicit def toGenerateDataKeyPairResponseBuilderOps(
      v: GenerateDataKeyPairResponse.Builder
  ): GenerateDataKeyPairResponseBuilderOps = new GenerateDataKeyPairResponseBuilderOps(v)

  implicit def toGenerateDataKeyPairResponseOps(v: GenerateDataKeyPairResponse): GenerateDataKeyPairResponseOps =
    new GenerateDataKeyPairResponseOps(v)

}
