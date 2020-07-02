// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class GetFunctionConfigurationRequestBuilderOps(val self: GetFunctionConfigurationRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala(value: Option[String]): GetFunctionConfigurationRequest.Builder = {
    value.fold(self) { v => self.functionName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def qualifierAsScala(value: Option[String]): GetFunctionConfigurationRequest.Builder = {
    value.fold(self) { v => self.qualifier(v) }
  }

}

final class GetFunctionConfigurationRequestOps(val self: GetFunctionConfigurationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala: Option[String] = Option(self.functionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def qualifierAsScala: Option[String] = Option(self.qualifier)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetFunctionConfigurationRequestOps {

  implicit def toGetFunctionConfigurationRequestBuilderOps(
      v: GetFunctionConfigurationRequest.Builder
  ): GetFunctionConfigurationRequestBuilderOps = new GetFunctionConfigurationRequestBuilderOps(v)

  implicit def toGetFunctionConfigurationRequestOps(
      v: GetFunctionConfigurationRequest
  ): GetFunctionConfigurationRequestOps = new GetFunctionConfigurationRequestOps(v)

}
