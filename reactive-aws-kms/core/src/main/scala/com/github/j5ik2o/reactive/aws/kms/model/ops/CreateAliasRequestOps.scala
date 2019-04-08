// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class CreateAliasRequestBuilderOps(val self: CreateAliasRequest.Builder) extends AnyVal {

  final def aliasNameAsScala(value: Option[String]): CreateAliasRequest.Builder = {
    value.fold(self) { v =>
      self.aliasName(v)
    }
  }

  final def targetKeyIdAsScala(value: Option[String]): CreateAliasRequest.Builder = {
    value.fold(self) { v =>
      self.targetKeyId(v)
    }
  }

}

final class CreateAliasRequestOps(val self: CreateAliasRequest) extends AnyVal {

  final def aliasNameAsScala: Option[String] = Option(self.aliasName)

  final def targetKeyIdAsScala: Option[String] = Option(self.targetKeyId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateAliasRequestOps {

  implicit def toCreateAliasRequestBuilderOps(v: CreateAliasRequest.Builder): CreateAliasRequestBuilderOps =
    new CreateAliasRequestBuilderOps(v)

  implicit def toCreateAliasRequestOps(v: CreateAliasRequest): CreateAliasRequestOps = new CreateAliasRequestOps(v)

}
