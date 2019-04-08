// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class GetLayerVersionPolicyRequestBuilderOps(val self: GetLayerVersionPolicyRequest.Builder) extends AnyVal {

  final def layerNameAsScala(value: Option[String]): GetLayerVersionPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.layerName(v)
    }
  }

  final def versionNumberAsScala(value: Option[Long]): GetLayerVersionPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.versionNumber(v)
    }
  }

}

final class GetLayerVersionPolicyRequestOps(val self: GetLayerVersionPolicyRequest) extends AnyVal {

  final def layerNameAsScala: Option[String] = Option(self.layerName)

  final def versionNumberAsScala: Option[Long] = Option(self.versionNumber)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetLayerVersionPolicyRequestOps {

  implicit def toGetLayerVersionPolicyRequestBuilderOps(
      v: GetLayerVersionPolicyRequest.Builder
  ): GetLayerVersionPolicyRequestBuilderOps = new GetLayerVersionPolicyRequestBuilderOps(v)

  implicit def toGetLayerVersionPolicyRequestOps(v: GetLayerVersionPolicyRequest): GetLayerVersionPolicyRequestOps =
    new GetLayerVersionPolicyRequestOps(v)

}
