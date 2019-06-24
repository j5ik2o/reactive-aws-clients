// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class GetTypeRequestBuilderOps(val self: GetTypeRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala(value: Option[String]): GetTypeRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeNameAsScala(value: Option[String]): GetTypeRequest.Builder = {
    value.fold(self) { v =>
      self.typeName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def formatAsScala(value: Option[TypeDefinitionFormat]): GetTypeRequest.Builder = {
    value.fold(self) { v =>
      self.format(v)
    }
  }

}

final class GetTypeRequestOps(val self: GetTypeRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala: Option[String] = Option(self.apiId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeNameAsScala: Option[String] = Option(self.typeName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def formatAsScala: Option[TypeDefinitionFormat] = Option(self.format)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetTypeRequestOps {

  implicit def toGetTypeRequestBuilderOps(v: GetTypeRequest.Builder): GetTypeRequestBuilderOps =
    new GetTypeRequestBuilderOps(v)

  implicit def toGetTypeRequestOps(v: GetTypeRequest): GetTypeRequestOps = new GetTypeRequestOps(v)

}
