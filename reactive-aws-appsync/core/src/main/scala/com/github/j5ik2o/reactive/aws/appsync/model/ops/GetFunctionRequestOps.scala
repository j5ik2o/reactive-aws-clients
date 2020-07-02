// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class GetFunctionRequestBuilderOps(val self: GetFunctionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala(value: Option[String]): GetFunctionRequest.Builder = {
    value.fold(self) { v => self.apiId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionIdAsScala(value: Option[String]): GetFunctionRequest.Builder = {
    value.fold(self) { v => self.functionId(v) }
  }

}

final class GetFunctionRequestOps(val self: GetFunctionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala: Option[String] = Option(self.apiId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionIdAsScala: Option[String] = Option(self.functionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetFunctionRequestOps {

  implicit def toGetFunctionRequestBuilderOps(v: GetFunctionRequest.Builder): GetFunctionRequestBuilderOps =
    new GetFunctionRequestBuilderOps(v)

  implicit def toGetFunctionRequestOps(v: GetFunctionRequest): GetFunctionRequestOps = new GetFunctionRequestOps(v)

}
