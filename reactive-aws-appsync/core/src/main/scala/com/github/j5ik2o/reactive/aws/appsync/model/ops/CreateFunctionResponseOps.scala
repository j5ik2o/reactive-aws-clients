// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class CreateFunctionResponseBuilderOps(val self: CreateFunctionResponse.Builder) extends AnyVal {

  final def functionConfigurationAsScala(value: Option[FunctionConfiguration]): CreateFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.functionConfiguration(v)
    }
  }

}

final class CreateFunctionResponseOps(val self: CreateFunctionResponse) extends AnyVal {

  final def functionConfigurationAsScala: Option[FunctionConfiguration] = Option(self.functionConfiguration)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateFunctionResponseOps {

  implicit def toCreateFunctionResponseBuilderOps(v: CreateFunctionResponse.Builder): CreateFunctionResponseBuilderOps =
    new CreateFunctionResponseBuilderOps(v)

  implicit def toCreateFunctionResponseOps(v: CreateFunctionResponse): CreateFunctionResponseOps =
    new CreateFunctionResponseOps(v)

}
