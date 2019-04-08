// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class DisconnectCustomKeyStoreRequestBuilderOps(val self: DisconnectCustomKeyStoreRequest.Builder)
    extends AnyVal {

  final def customKeyStoreIdAsScala(value: Option[String]): DisconnectCustomKeyStoreRequest.Builder = {
    value.fold(self) { v =>
      self.customKeyStoreId(v)
    }
  }

}

final class DisconnectCustomKeyStoreRequestOps(val self: DisconnectCustomKeyStoreRequest) extends AnyVal {

  final def customKeyStoreIdAsScala: Option[String] = Option(self.customKeyStoreId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisconnectCustomKeyStoreRequestOps {

  implicit def toDisconnectCustomKeyStoreRequestBuilderOps(
      v: DisconnectCustomKeyStoreRequest.Builder
  ): DisconnectCustomKeyStoreRequestBuilderOps = new DisconnectCustomKeyStoreRequestBuilderOps(v)

  implicit def toDisconnectCustomKeyStoreRequestOps(
      v: DisconnectCustomKeyStoreRequest
  ): DisconnectCustomKeyStoreRequestOps = new DisconnectCustomKeyStoreRequestOps(v)

}
