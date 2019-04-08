// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class GetLayerVersionRequestBuilderOps(val self: GetLayerVersionRequest.Builder) extends AnyVal {

  final def layerNameAsScala(value: Option[String]): GetLayerVersionRequest.Builder = {
    value.fold(self) { v =>
      self.layerName(v)
    }
  } // String

  final def versionNumberAsScala(value: Option[Long]): GetLayerVersionRequest.Builder = {
    value.fold(self) { v =>
      self.versionNumber(v)
    }
  } // Long

}

final class GetLayerVersionRequestOps(val self: GetLayerVersionRequest) extends AnyVal {

  final def layerNameAsScala: Option[String] = Option(self.layerName) // String

  final def versionNumberAsScala: Option[Long] = Option(self.versionNumber) // Long

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetLayerVersionRequestOps {

  implicit def toGetLayerVersionRequestBuilderOps(v: GetLayerVersionRequest.Builder): GetLayerVersionRequestBuilderOps =
    new GetLayerVersionRequestBuilderOps(v)

  implicit def toGetLayerVersionRequestOps(v: GetLayerVersionRequest): GetLayerVersionRequestOps =
    new GetLayerVersionRequestOps(v)

}
