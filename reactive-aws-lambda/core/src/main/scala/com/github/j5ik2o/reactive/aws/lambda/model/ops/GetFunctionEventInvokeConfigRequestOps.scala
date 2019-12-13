// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class GetFunctionEventInvokeConfigRequestBuilderOps(val self: GetFunctionEventInvokeConfigRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala(value: Option[String]): GetFunctionEventInvokeConfigRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def qualifierAsScala(value: Option[String]): GetFunctionEventInvokeConfigRequest.Builder = {
    value.fold(self) { v =>
      self.qualifier(v)
    }
  }

}

final class GetFunctionEventInvokeConfigRequestOps(val self: GetFunctionEventInvokeConfigRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala: Option[String] = Option(self.functionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def qualifierAsScala: Option[String] = Option(self.qualifier)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetFunctionEventInvokeConfigRequestOps {

  implicit def toGetFunctionEventInvokeConfigRequestBuilderOps(
      v: GetFunctionEventInvokeConfigRequest.Builder
  ): GetFunctionEventInvokeConfigRequestBuilderOps = new GetFunctionEventInvokeConfigRequestBuilderOps(v)

  implicit def toGetFunctionEventInvokeConfigRequestOps(
      v: GetFunctionEventInvokeConfigRequest
  ): GetFunctionEventInvokeConfigRequestOps = new GetFunctionEventInvokeConfigRequestOps(v)

}
