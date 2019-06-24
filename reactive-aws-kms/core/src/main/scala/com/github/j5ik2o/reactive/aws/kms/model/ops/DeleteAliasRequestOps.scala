// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class DeleteAliasRequestBuilderOps(val self: DeleteAliasRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def aliasNameAsScala(value: Option[String]): DeleteAliasRequest.Builder = {
    value.fold(self) { v =>
      self.aliasName(v)
    }
  }

}

final class DeleteAliasRequestOps(val self: DeleteAliasRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def aliasNameAsScala: Option[String] = Option(self.aliasName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteAliasRequestOps {

  implicit def toDeleteAliasRequestBuilderOps(v: DeleteAliasRequest.Builder): DeleteAliasRequestBuilderOps =
    new DeleteAliasRequestBuilderOps(v)

  implicit def toDeleteAliasRequestOps(v: DeleteAliasRequest): DeleteAliasRequestOps = new DeleteAliasRequestOps(v)

}
