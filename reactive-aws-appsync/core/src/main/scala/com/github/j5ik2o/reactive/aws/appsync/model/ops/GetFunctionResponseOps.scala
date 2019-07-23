// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class GetFunctionResponseBuilderOps(val self: GetFunctionResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionConfigurationAsScala(value: Option[FunctionConfiguration]): GetFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.functionConfiguration(v)
    }
  }

}

final class GetFunctionResponseOps(val self: GetFunctionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionConfigurationAsScala: Option[FunctionConfiguration] = Option(self.functionConfiguration)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetFunctionResponseOps {

  implicit def toGetFunctionResponseBuilderOps(v: GetFunctionResponse.Builder): GetFunctionResponseBuilderOps =
    new GetFunctionResponseBuilderOps(v)

  implicit def toGetFunctionResponseOps(v: GetFunctionResponse): GetFunctionResponseOps = new GetFunctionResponseOps(v)

}
