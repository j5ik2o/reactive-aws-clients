// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class GenerateDataKeyWithoutPlaintextResponseBuilderOps(val self: GenerateDataKeyWithoutPlaintextResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ciphertextBlobAsScala(
      value: Option[software.amazon.awssdk.core.SdkBytes]
  ): GenerateDataKeyWithoutPlaintextResponse.Builder = {
    value.fold(self) { v => self.ciphertextBlob(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): GenerateDataKeyWithoutPlaintextResponse.Builder = {
    value.fold(self) { v => self.keyId(v) }
  }

}

final class GenerateDataKeyWithoutPlaintextResponseOps(val self: GenerateDataKeyWithoutPlaintextResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ciphertextBlobAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.ciphertextBlob)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGenerateDataKeyWithoutPlaintextResponseOps {

  implicit def toGenerateDataKeyWithoutPlaintextResponseBuilderOps(
      v: GenerateDataKeyWithoutPlaintextResponse.Builder
  ): GenerateDataKeyWithoutPlaintextResponseBuilderOps = new GenerateDataKeyWithoutPlaintextResponseBuilderOps(v)

  implicit def toGenerateDataKeyWithoutPlaintextResponseOps(
      v: GenerateDataKeyWithoutPlaintextResponse
  ): GenerateDataKeyWithoutPlaintextResponseOps = new GenerateDataKeyWithoutPlaintextResponseOps(v)

}
