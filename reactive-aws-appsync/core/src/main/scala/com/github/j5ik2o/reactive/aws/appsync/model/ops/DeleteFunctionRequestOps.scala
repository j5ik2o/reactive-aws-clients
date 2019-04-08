// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class DeleteFunctionRequestBuilderOps(val self: DeleteFunctionRequest.Builder) extends AnyVal {

  final def apiIdAsScala(value: Option[String]): DeleteFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  }

  final def functionIdAsScala(value: Option[String]): DeleteFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.functionId(v)
    }
  }

}

final class DeleteFunctionRequestOps(val self: DeleteFunctionRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId)

  final def functionIdAsScala: Option[String] = Option(self.functionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteFunctionRequestOps {

  implicit def toDeleteFunctionRequestBuilderOps(v: DeleteFunctionRequest.Builder): DeleteFunctionRequestBuilderOps =
    new DeleteFunctionRequestBuilderOps(v)

  implicit def toDeleteFunctionRequestOps(v: DeleteFunctionRequest): DeleteFunctionRequestOps =
    new DeleteFunctionRequestOps(v)

}
