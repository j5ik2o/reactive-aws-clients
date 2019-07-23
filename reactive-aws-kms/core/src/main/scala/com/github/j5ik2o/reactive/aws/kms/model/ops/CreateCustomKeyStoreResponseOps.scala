// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class CreateCustomKeyStoreResponseBuilderOps(val self: CreateCustomKeyStoreResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customKeyStoreIdAsScala(value: Option[String]): CreateCustomKeyStoreResponse.Builder = {
    value.fold(self) { v =>
      self.customKeyStoreId(v)
    }
  }

}

final class CreateCustomKeyStoreResponseOps(val self: CreateCustomKeyStoreResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customKeyStoreIdAsScala: Option[String] = Option(self.customKeyStoreId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateCustomKeyStoreResponseOps {

  implicit def toCreateCustomKeyStoreResponseBuilderOps(
      v: CreateCustomKeyStoreResponse.Builder
  ): CreateCustomKeyStoreResponseBuilderOps = new CreateCustomKeyStoreResponseBuilderOps(v)

  implicit def toCreateCustomKeyStoreResponseOps(v: CreateCustomKeyStoreResponse): CreateCustomKeyStoreResponseOps =
    new CreateCustomKeyStoreResponseOps(v)

}
