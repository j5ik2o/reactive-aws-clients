// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class DeleteFunctionConcurrencyRequestBuilderOps(val self: DeleteFunctionConcurrencyRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala(value: Option[String]): DeleteFunctionConcurrencyRequest.Builder = {
    value.fold(self) { v => self.functionName(v) }
  }

}

final class DeleteFunctionConcurrencyRequestOps(val self: DeleteFunctionConcurrencyRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala: Option[String] = Option(self.functionName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteFunctionConcurrencyRequestOps {

  implicit def toDeleteFunctionConcurrencyRequestBuilderOps(
      v: DeleteFunctionConcurrencyRequest.Builder
  ): DeleteFunctionConcurrencyRequestBuilderOps = new DeleteFunctionConcurrencyRequestBuilderOps(v)

  implicit def toDeleteFunctionConcurrencyRequestOps(
      v: DeleteFunctionConcurrencyRequest
  ): DeleteFunctionConcurrencyRequestOps = new DeleteFunctionConcurrencyRequestOps(v)

}
