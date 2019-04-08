// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class GetParametersForImportResponseBuilderOps(val self: GetParametersForImportResponse.Builder) extends AnyVal {

  final def keyIdAsScala(value: Option[String]): GetParametersForImportResponse.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

  final def importTokenAsScala(
      value: Option[software.amazon.awssdk.core.SdkBytes]
  ): GetParametersForImportResponse.Builder = {
    value.fold(self) { v =>
      self.importToken(v)
    }
  }

  final def publicKeyAsScala(
      value: Option[software.amazon.awssdk.core.SdkBytes]
  ): GetParametersForImportResponse.Builder = {
    value.fold(self) { v =>
      self.publicKey(v)
    }
  }

  final def parametersValidToAsScala(value: Option[java.time.Instant]): GetParametersForImportResponse.Builder = {
    value.fold(self) { v =>
      self.parametersValidTo(v)
    }
  }

}

final class GetParametersForImportResponseOps(val self: GetParametersForImportResponse) extends AnyVal {

  final def keyIdAsScala: Option[String] = Option(self.keyId)

  final def importTokenAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.importToken)

  final def publicKeyAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.publicKey)

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
