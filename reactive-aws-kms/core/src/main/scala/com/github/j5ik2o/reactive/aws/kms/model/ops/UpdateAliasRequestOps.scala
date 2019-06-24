// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class UpdateAliasRequestBuilderOps(val self: UpdateAliasRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def aliasNameAsScala(value: Option[String]): UpdateAliasRequest.Builder = {
    value.fold(self) { v =>
      self.aliasName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetKeyIdAsScala(value: Option[String]): UpdateAliasRequest.Builder = {
    value.fold(self) { v =>
      self.targetKeyId(v)
    }
  }

}

final class UpdateAliasRequestOps(val self: UpdateAliasRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def aliasNameAsScala: Option[String] = Option(self.aliasName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetKeyIdAsScala: Option[String] = Option(self.targetKeyId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateAliasRequestOps {

  implicit def toUpdateAliasRequestBuilderOps(v: UpdateAliasRequest.Builder): UpdateAliasRequestBuilderOps =
    new UpdateAliasRequestBuilderOps(v)

  implicit def toUpdateAliasRequestOps(v: UpdateAliasRequest): UpdateAliasRequestOps = new UpdateAliasRequestOps(v)

}
