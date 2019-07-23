// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class DisableKeyRotationRequestBuilderOps(val self: DisableKeyRotationRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): DisableKeyRotationRequest.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

}

final class DisableKeyRotationRequestOps(val self: DisableKeyRotationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisableKeyRotationRequestOps {

  implicit def toDisableKeyRotationRequestBuilderOps(
      v: DisableKeyRotationRequest.Builder
  ): DisableKeyRotationRequestBuilderOps = new DisableKeyRotationRequestBuilderOps(v)

  implicit def toDisableKeyRotationRequestOps(v: DisableKeyRotationRequest): DisableKeyRotationRequestOps =
    new DisableKeyRotationRequestOps(v)

}
