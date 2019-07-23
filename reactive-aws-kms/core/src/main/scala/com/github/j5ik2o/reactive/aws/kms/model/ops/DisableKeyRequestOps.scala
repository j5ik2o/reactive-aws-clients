// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class DisableKeyRequestBuilderOps(val self: DisableKeyRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): DisableKeyRequest.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

}

final class DisableKeyRequestOps(val self: DisableKeyRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisableKeyRequestOps {

  implicit def toDisableKeyRequestBuilderOps(v: DisableKeyRequest.Builder): DisableKeyRequestBuilderOps =
    new DisableKeyRequestBuilderOps(v)

  implicit def toDisableKeyRequestOps(v: DisableKeyRequest): DisableKeyRequestOps = new DisableKeyRequestOps(v)

}
