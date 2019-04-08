// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class DeleteFunctionRequestBuilderOps(val self: DeleteFunctionRequest.Builder) extends AnyVal {

  final def functionNameAsScala(value: Option[String]): DeleteFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  } // String

  final def qualifierAsScala(value: Option[String]): DeleteFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.qualifier(v)
    }
  } // String

}

final class DeleteFunctionRequestOps(val self: DeleteFunctionRequest) extends AnyVal {

  final def functionNameAsScala: Option[String] = Option(self.functionName) // String

  final def qualifierAsScala: Option[String] = Option(self.qualifier) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteFunctionRequestOps {

  implicit def toDeleteFunctionRequestBuilderOps(v: DeleteFunctionRequest.Builder): DeleteFunctionRequestBuilderOps =
    new DeleteFunctionRequestBuilderOps(v)

  implicit def toDeleteFunctionRequestOps(v: DeleteFunctionRequest): DeleteFunctionRequestOps =
    new DeleteFunctionRequestOps(v)

}
