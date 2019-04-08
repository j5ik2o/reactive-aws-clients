// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class EnableKeyRotationRequestBuilderOps(val self: EnableKeyRotationRequest.Builder) extends AnyVal {

  final def keyIdAsScala(value: Option[String]): EnableKeyRotationRequest.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

}

final class EnableKeyRotationRequestOps(val self: EnableKeyRotationRequest) extends AnyVal {

  final def keyIdAsScala: Option[String] = Option(self.keyId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnableKeyRotationRequestOps {

  implicit def toEnableKeyRotationRequestBuilderOps(
      v: EnableKeyRotationRequest.Builder
  ): EnableKeyRotationRequestBuilderOps = new EnableKeyRotationRequestBuilderOps(v)

  implicit def toEnableKeyRotationRequestOps(v: EnableKeyRotationRequest): EnableKeyRotationRequestOps =
    new EnableKeyRotationRequestOps(v)

}
