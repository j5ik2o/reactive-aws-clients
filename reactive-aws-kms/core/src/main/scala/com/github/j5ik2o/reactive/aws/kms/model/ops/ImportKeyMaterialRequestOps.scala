// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class ImportKeyMaterialRequestBuilderOps(val self: ImportKeyMaterialRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): ImportKeyMaterialRequest.Builder = {
    value.fold(self) { v => self.keyId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def importTokenAsScala(
      value: Option[software.amazon.awssdk.core.SdkBytes]
  ): ImportKeyMaterialRequest.Builder = {
    value.fold(self) { v => self.importToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptedKeyMaterialAsScala(
      value: Option[software.amazon.awssdk.core.SdkBytes]
  ): ImportKeyMaterialRequest.Builder = {
    value.fold(self) { v => self.encryptedKeyMaterial(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def validToAsScala(value: Option[java.time.Instant]): ImportKeyMaterialRequest.Builder = {
    value.fold(self) { v => self.validTo(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expirationModelAsScala(value: Option[ExpirationModelType]): ImportKeyMaterialRequest.Builder = {
    value.fold(self) { v => self.expirationModel(v) }
  }

}

final class ImportKeyMaterialRequestOps(val self: ImportKeyMaterialRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def importTokenAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.importToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptedKeyMaterialAsScala: Option[software.amazon.awssdk.core.SdkBytes] =
    Option(self.encryptedKeyMaterial)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def validToAsScala: Option[java.time.Instant] = Option(self.validTo)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expirationModelAsScala: Option[ExpirationModelType] = Option(self.expirationModel)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImportKeyMaterialRequestOps {

  implicit def toImportKeyMaterialRequestBuilderOps(
      v: ImportKeyMaterialRequest.Builder
  ): ImportKeyMaterialRequestBuilderOps = new ImportKeyMaterialRequestBuilderOps(v)

  implicit def toImportKeyMaterialRequestOps(v: ImportKeyMaterialRequest): ImportKeyMaterialRequestOps =
    new ImportKeyMaterialRequestOps(v)

}
