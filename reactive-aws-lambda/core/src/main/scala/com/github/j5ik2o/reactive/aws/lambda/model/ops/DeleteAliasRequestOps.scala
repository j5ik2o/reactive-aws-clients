// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class DeleteAliasRequestBuilderOps(val self: DeleteAliasRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala(value: Option[String]): DeleteAliasRequest.Builder = {
    value.fold(self) { v => self.functionName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): DeleteAliasRequest.Builder = {
    value.fold(self) { v => self.name(v) }
  }

}

final class DeleteAliasRequestOps(val self: DeleteAliasRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala: Option[String] = Option(self.functionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteAliasRequestOps {

  implicit def toDeleteAliasRequestBuilderOps(v: DeleteAliasRequest.Builder): DeleteAliasRequestBuilderOps =
    new DeleteAliasRequestBuilderOps(v)

  implicit def toDeleteAliasRequestOps(v: DeleteAliasRequest): DeleteAliasRequestOps = new DeleteAliasRequestOps(v)

}
