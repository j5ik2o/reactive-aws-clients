// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class GetFunctionConfigurationRequestBuilderOps(val self: GetFunctionConfigurationRequest.Builder)
    extends AnyVal {

  final def functionNameAsScala(value: Option[String]): GetFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  } // String

  final def qualifierAsScala(value: Option[String]): GetFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.qualifier(v)
    }
  } // String

}

final class GetFunctionConfigurationRequestOps(val self: GetFunctionConfigurationRequest) extends AnyVal {

  final def functionNameAsScala: Option[String] = Option(self.functionName) // String

  final def qualifierAsScala: Option[String] = Option(self.qualifier) // String

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
