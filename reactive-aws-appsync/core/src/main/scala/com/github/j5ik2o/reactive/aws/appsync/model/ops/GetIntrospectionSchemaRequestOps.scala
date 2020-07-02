// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class GetIntrospectionSchemaRequestBuilderOps(val self: GetIntrospectionSchemaRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala(value: Option[String]): GetIntrospectionSchemaRequest.Builder = {
    value.fold(self) { v => self.apiId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def formatAsScala(value: Option[OutputType]): GetIntrospectionSchemaRequest.Builder = {
    value.fold(self) { v => self.format(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def includeDirectivesAsScala(value: Option[Boolean]): GetIntrospectionSchemaRequest.Builder = {
    value.fold(self) { v => self.includeDirectives(v) }
  }

}

final class GetIntrospectionSchemaRequestOps(val self: GetIntrospectionSchemaRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala: Option[String] = Option(self.apiId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def formatAsScala: Option[OutputType] = Option(self.format)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def includeDirectivesAsScala: Option[Boolean] = Option(self.includeDirectives)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetIntrospectionSchemaRequestOps {

  implicit def toGetIntrospectionSchemaRequestBuilderOps(
      v: GetIntrospectionSchemaRequest.Builder
  ): GetIntrospectionSchemaRequestBuilderOps = new GetIntrospectionSchemaRequestBuilderOps(v)

  implicit def toGetIntrospectionSchemaRequestOps(v: GetIntrospectionSchemaRequest): GetIntrospectionSchemaRequestOps =
    new GetIntrospectionSchemaRequestOps(v)

}
