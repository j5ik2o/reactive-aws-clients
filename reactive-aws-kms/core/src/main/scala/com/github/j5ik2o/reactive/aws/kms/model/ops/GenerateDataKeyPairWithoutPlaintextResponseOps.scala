// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class GenerateDataKeyPairWithoutPlaintextResponseBuilderOps(
    val self: GenerateDataKeyPairWithoutPlaintextResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateKeyCiphertextBlobAsScala(
      value: Option[software.amazon.awssdk.core.SdkBytes]
  ): GenerateDataKeyPairWithoutPlaintextResponse.Builder = {
    value.fold(self) { v =>
      self.privateKeyCiphertextBlob(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publicKeyAsScala(
      value: Option[software.amazon.awssdk.core.SdkBytes]
  ): GenerateDataKeyPairWithoutPlaintextResponse.Builder = {
    value.fold(self) { v =>
      self.publicKey(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): GenerateDataKeyPairWithoutPlaintextResponse.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyPairSpecAsScala(value: Option[DataKeyPairSpec]): GenerateDataKeyPairWithoutPlaintextResponse.Builder = {
    value.fold(self) { v =>
      self.keyPairSpec(v)
    }
  }

}

final class GenerateDataKeyPairWithoutPlaintextResponseOps(val self: GenerateDataKeyPairWithoutPlaintextResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateKeyCiphertextBlobAsScala: Option[software.amazon.awssdk.core.SdkBytes] =
    Option(self.privateKeyCiphertextBlob)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publicKeyAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.publicKey)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyPairSpecAsScala: Option[DataKeyPairSpec] = Option(self.keyPairSpec)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGenerateDataKeyPairWithoutPlaintextResponseOps {

  implicit def toGenerateDataKeyPairWithoutPlaintextResponseBuilderOps(
      v: GenerateDataKeyPairWithoutPlaintextResponse.Builder
  ): GenerateDataKeyPairWithoutPlaintextResponseBuilderOps =
    new GenerateDataKeyPairWithoutPlaintextResponseBuilderOps(v)

  implicit def toGenerateDataKeyPairWithoutPlaintextResponseOps(
      v: GenerateDataKeyPairWithoutPlaintextResponse
  ): GenerateDataKeyPairWithoutPlaintextResponseOps = new GenerateDataKeyPairWithoutPlaintextResponseOps(v)

}
