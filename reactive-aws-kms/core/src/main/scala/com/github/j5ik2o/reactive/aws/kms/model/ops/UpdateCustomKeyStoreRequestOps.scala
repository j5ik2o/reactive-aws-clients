// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class UpdateCustomKeyStoreRequestBuilderOps(val self: UpdateCustomKeyStoreRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customKeyStoreIdAsScala(value: Option[String]): UpdateCustomKeyStoreRequest.Builder = {
    value.fold(self) { v => self.customKeyStoreId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def newCustomKeyStoreNameAsScala(value: Option[String]): UpdateCustomKeyStoreRequest.Builder = {
    value.fold(self) { v => self.newCustomKeyStoreName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyStorePasswordAsScala(value: Option[String]): UpdateCustomKeyStoreRequest.Builder = {
    value.fold(self) { v => self.keyStorePassword(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cloudHsmClusterIdAsScala(value: Option[String]): UpdateCustomKeyStoreRequest.Builder = {
    value.fold(self) { v => self.cloudHsmClusterId(v) }
  }

}

final class UpdateCustomKeyStoreRequestOps(val self: UpdateCustomKeyStoreRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customKeyStoreIdAsScala: Option[String] = Option(self.customKeyStoreId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def newCustomKeyStoreNameAsScala: Option[String] = Option(self.newCustomKeyStoreName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyStorePasswordAsScala: Option[String] = Option(self.keyStorePassword)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cloudHsmClusterIdAsScala: Option[String] = Option(self.cloudHsmClusterId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateCustomKeyStoreRequestOps {

  implicit def toUpdateCustomKeyStoreRequestBuilderOps(
      v: UpdateCustomKeyStoreRequest.Builder
  ): UpdateCustomKeyStoreRequestBuilderOps = new UpdateCustomKeyStoreRequestBuilderOps(v)

  implicit def toUpdateCustomKeyStoreRequestOps(v: UpdateCustomKeyStoreRequest): UpdateCustomKeyStoreRequestOps =
    new UpdateCustomKeyStoreRequestOps(v)

}
