// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class GetFunctionConcurrencyResponseBuilderOps(val self: GetFunctionConcurrencyResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedConcurrentExecutionsAsScala(value: Option[Int]): GetFunctionConcurrencyResponse.Builder = {
    value.fold(self) { v =>
      self.reservedConcurrentExecutions(v)
    }
  }

}

final class GetFunctionConcurrencyResponseOps(val self: GetFunctionConcurrencyResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedConcurrentExecutionsAsScala: Option[Int] = Option(self.reservedConcurrentExecutions)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetFunctionConcurrencyResponseOps {

  implicit def toGetFunctionConcurrencyResponseBuilderOps(
      v: GetFunctionConcurrencyResponse.Builder
  ): GetFunctionConcurrencyResponseBuilderOps = new GetFunctionConcurrencyResponseBuilderOps(v)

  implicit def toGetFunctionConcurrencyResponseOps(
      v: GetFunctionConcurrencyResponse
  ): GetFunctionConcurrencyResponseOps = new GetFunctionConcurrencyResponseOps(v)

}
