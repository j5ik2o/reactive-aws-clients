// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class GetFunctionConcurrencyRequestBuilderOps(val self: GetFunctionConcurrencyRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala(value: Option[String]): GetFunctionConcurrencyRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  }

}

final class GetFunctionConcurrencyRequestOps(val self: GetFunctionConcurrencyRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala: Option[String] = Option(self.functionName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetFunctionConcurrencyRequestOps {

  implicit def toGetFunctionConcurrencyRequestBuilderOps(
      v: GetFunctionConcurrencyRequest.Builder
  ): GetFunctionConcurrencyRequestBuilderOps = new GetFunctionConcurrencyRequestBuilderOps(v)

  implicit def toGetFunctionConcurrencyRequestOps(v: GetFunctionConcurrencyRequest): GetFunctionConcurrencyRequestOps =
    new GetFunctionConcurrencyRequestOps(v)

}
