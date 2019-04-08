// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class DeleteCustomKeyStoreRequestBuilderOps(val self: DeleteCustomKeyStoreRequest.Builder) extends AnyVal {

  final def customKeyStoreIdAsScala(value: Option[String]): DeleteCustomKeyStoreRequest.Builder = {
    value.fold(self) { v =>
      self.customKeyStoreId(v)
    }
  }

}

final class DeleteCustomKeyStoreRequestOps(val self: DeleteCustomKeyStoreRequest) extends AnyVal {

  final def customKeyStoreIdAsScala: Option[String] = Option(self.customKeyStoreId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteCustomKeyStoreRequestOps {

  implicit def toDeleteCustomKeyStoreRequestBuilderOps(
      v: DeleteCustomKeyStoreRequest.Builder
  ): DeleteCustomKeyStoreRequestBuilderOps = new DeleteCustomKeyStoreRequestBuilderOps(v)

  implicit def toDeleteCustomKeyStoreRequestOps(v: DeleteCustomKeyStoreRequest): DeleteCustomKeyStoreRequestOps =
    new DeleteCustomKeyStoreRequestOps(v)

}
