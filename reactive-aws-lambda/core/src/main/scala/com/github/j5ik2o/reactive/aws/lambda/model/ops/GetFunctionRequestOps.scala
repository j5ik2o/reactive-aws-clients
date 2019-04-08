// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class GetFunctionRequestBuilderOps(val self: GetFunctionRequest.Builder) extends AnyVal {

  final def functionNameAsScala(value: Option[String]): GetFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  }

  final def qualifierAsScala(value: Option[String]): GetFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.qualifier(v)
    }
  }

}

final class GetFunctionRequestOps(val self: GetFunctionRequest) extends AnyVal {

  final def functionNameAsScala: Option[String] = Option(self.functionName)

  final def qualifierAsScala: Option[String] = Option(self.qualifier)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetFunctionRequestOps {

  implicit def toGetFunctionRequestBuilderOps(v: GetFunctionRequest.Builder): GetFunctionRequestBuilderOps =
    new GetFunctionRequestBuilderOps(v)

  implicit def toGetFunctionRequestOps(v: GetFunctionRequest): GetFunctionRequestOps = new GetFunctionRequestOps(v)

}
