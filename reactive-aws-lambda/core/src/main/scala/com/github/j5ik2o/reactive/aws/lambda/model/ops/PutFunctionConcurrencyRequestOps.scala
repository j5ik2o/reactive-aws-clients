// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class PutFunctionConcurrencyRequestBuilderOps(val self: PutFunctionConcurrencyRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala(value: Option[String]): PutFunctionConcurrencyRequest.Builder = {
    value.fold(self) { v => self.functionName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedConcurrentExecutionsAsScala(value: Option[Int]): PutFunctionConcurrencyRequest.Builder = {
    value.fold(self) { v => self.reservedConcurrentExecutions(v) }
  }

}

final class PutFunctionConcurrencyRequestOps(val self: PutFunctionConcurrencyRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala: Option[String] = Option(self.functionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedConcurrentExecutionsAsScala: Option[Int] = Option(self.reservedConcurrentExecutions)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutFunctionConcurrencyRequestOps {

  implicit def toPutFunctionConcurrencyRequestBuilderOps(
      v: PutFunctionConcurrencyRequest.Builder
  ): PutFunctionConcurrencyRequestBuilderOps = new PutFunctionConcurrencyRequestBuilderOps(v)

  implicit def toPutFunctionConcurrencyRequestOps(v: PutFunctionConcurrencyRequest): PutFunctionConcurrencyRequestOps =
    new PutFunctionConcurrencyRequestOps(v)

}
