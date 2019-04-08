// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class DeleteAliasRequestBuilderOps(val self: DeleteAliasRequest.Builder) extends AnyVal {

  final def functionNameAsScala(value: Option[String]): DeleteAliasRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  } // String

  final def nameAsScala(value: Option[String]): DeleteAliasRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  } // String

}

final class DeleteAliasRequestOps(val self: DeleteAliasRequest) extends AnyVal {

  final def functionNameAsScala: Option[String] = Option(self.functionName) // String

  final def nameAsScala: Option[String] = Option(self.name) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteAliasRequestOps {

  implicit def toDeleteAliasRequestBuilderOps(v: DeleteAliasRequest.Builder): DeleteAliasRequestBuilderOps =
    new DeleteAliasRequestBuilderOps(v)

  implicit def toDeleteAliasRequestOps(v: DeleteAliasRequest): DeleteAliasRequestOps = new DeleteAliasRequestOps(v)

}
