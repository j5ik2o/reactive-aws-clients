// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class GetAliasRequestBuilderOps(val self: GetAliasRequest.Builder) extends AnyVal {

  final def functionNameAsScala(value: Option[String]): GetAliasRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  }

  final def nameAsScala(value: Option[String]): GetAliasRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

}

final class GetAliasRequestOps(val self: GetAliasRequest) extends AnyVal {

  final def functionNameAsScala: Option[String] = Option(self.functionName)

  final def nameAsScala: Option[String] = Option(self.name)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetAliasRequestOps {

  implicit def toGetAliasRequestBuilderOps(v: GetAliasRequest.Builder): GetAliasRequestBuilderOps =
    new GetAliasRequestBuilderOps(v)

  implicit def toGetAliasRequestOps(v: GetAliasRequest): GetAliasRequestOps = new GetAliasRequestOps(v)

}
