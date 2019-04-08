// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class EnableKeyRequestBuilderOps(val self: EnableKeyRequest.Builder) extends AnyVal {

  final def keyIdAsScala(value: Option[String]): EnableKeyRequest.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

}

final class EnableKeyRequestOps(val self: EnableKeyRequest) extends AnyVal {

  final def keyIdAsScala: Option[String] = Option(self.keyId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnableKeyRequestOps {

  implicit def toEnableKeyRequestBuilderOps(v: EnableKeyRequest.Builder): EnableKeyRequestBuilderOps =
    new EnableKeyRequestBuilderOps(v)

  implicit def toEnableKeyRequestOps(v: EnableKeyRequest): EnableKeyRequestOps = new EnableKeyRequestOps(v)

}
