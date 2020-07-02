// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class ConnectCustomKeyStoreRequestBuilderOps(val self: ConnectCustomKeyStoreRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customKeyStoreIdAsScala(value: Option[String]): ConnectCustomKeyStoreRequest.Builder = {
    value.fold(self) { v => self.customKeyStoreId(v) }
  }

}

final class ConnectCustomKeyStoreRequestOps(val self: ConnectCustomKeyStoreRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customKeyStoreIdAsScala: Option[String] = Option(self.customKeyStoreId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToConnectCustomKeyStoreRequestOps {

  implicit def toConnectCustomKeyStoreRequestBuilderOps(
      v: ConnectCustomKeyStoreRequest.Builder
  ): ConnectCustomKeyStoreRequestBuilderOps = new ConnectCustomKeyStoreRequestBuilderOps(v)

  implicit def toConnectCustomKeyStoreRequestOps(v: ConnectCustomKeyStoreRequest): ConnectCustomKeyStoreRequestOps =
    new ConnectCustomKeyStoreRequestOps(v)

}
