// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class GetParametersForImportResponseBuilderOps(val self: GetParametersForImportResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): GetParametersForImportResponse.Builder = {
    value.fold(self) { v => self.keyId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def importTokenAsScala(
      value: Option[software.amazon.awssdk.core.SdkBytes]
  ): GetParametersForImportResponse.Builder = {
    value.fold(self) { v => self.importToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publicKeyAsScala(
      value: Option[software.amazon.awssdk.core.SdkBytes]
  ): GetParametersForImportResponse.Builder = {
    value.fold(self) { v => self.publicKey(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parametersValidToAsScala(value: Option[java.time.Instant]): GetParametersForImportResponse.Builder = {
    value.fold(self) { v => self.parametersValidTo(v) }
  }

}

final class GetParametersForImportResponseOps(val self: GetParametersForImportResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def importTokenAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.importToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publicKeyAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.publicKey)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parametersValidToAsScala: Option[java.time.Instant] = Option(self.parametersValidTo)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetParametersForImportResponseOps {

  implicit def toGetParametersForImportResponseBuilderOps(
      v: GetParametersForImportResponse.Builder
  ): GetParametersForImportResponseBuilderOps = new GetParametersForImportResponseBuilderOps(v)

  implicit def toGetParametersForImportResponseOps(
      v: GetParametersForImportResponse
  ): GetParametersForImportResponseOps = new GetParametersForImportResponseOps(v)

}
