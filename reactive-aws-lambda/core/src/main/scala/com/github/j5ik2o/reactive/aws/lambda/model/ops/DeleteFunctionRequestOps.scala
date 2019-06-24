// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class DeleteFunctionRequestBuilderOps(val self: DeleteFunctionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala(value: Option[String]): DeleteFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def qualifierAsScala(value: Option[String]): DeleteFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.qualifier(v)
    }
  }

}

final class DeleteFunctionRequestOps(val self: DeleteFunctionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala: Option[String] = Option(self.functionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def qualifierAsScala: Option[String] = Option(self.qualifier)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteFunctionRequestOps {

  implicit def toDeleteFunctionRequestBuilderOps(v: DeleteFunctionRequest.Builder): DeleteFunctionRequestBuilderOps =
    new DeleteFunctionRequestBuilderOps(v)

  implicit def toDeleteFunctionRequestOps(v: DeleteFunctionRequest): DeleteFunctionRequestOps =
    new DeleteFunctionRequestOps(v)

}
