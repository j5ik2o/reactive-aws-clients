// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class GetParametersForImportRequestBuilderOps(val self: GetParametersForImportRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): GetParametersForImportRequest.Builder = {
    value.fold(self) { v => self.keyId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def wrappingAlgorithmAsScala(value: Option[AlgorithmSpec]): GetParametersForImportRequest.Builder = {
    value.fold(self) { v => self.wrappingAlgorithm(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def wrappingKeySpecAsScala(value: Option[WrappingKeySpec]): GetParametersForImportRequest.Builder = {
    value.fold(self) { v => self.wrappingKeySpec(v) }
  }

}

final class GetParametersForImportRequestOps(val self: GetParametersForImportRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def wrappingAlgorithmAsScala: Option[AlgorithmSpec] = Option(self.wrappingAlgorithm)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def wrappingKeySpecAsScala: Option[WrappingKeySpec] = Option(self.wrappingKeySpec)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetParametersForImportRequestOps {

  implicit def toGetParametersForImportRequestBuilderOps(
      v: GetParametersForImportRequest.Builder
  ): GetParametersForImportRequestBuilderOps = new GetParametersForImportRequestBuilderOps(v)

  implicit def toGetParametersForImportRequestOps(v: GetParametersForImportRequest): GetParametersForImportRequestOps =
    new GetParametersForImportRequestOps(v)

}
