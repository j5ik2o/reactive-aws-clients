// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class GetIntrospectionSchemaRequestBuilderOps(val self: GetIntrospectionSchemaRequest.Builder) extends AnyVal {

  final def apiIdAsScala(value: Option[String]): GetIntrospectionSchemaRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  } // String

  final def formatAsScala(value: Option[OutputType]): GetIntrospectionSchemaRequest.Builder = {
    value.fold(self) { v =>
      self.format(v)
    }
  } // String

}

final class GetIntrospectionSchemaRequestOps(val self: GetIntrospectionSchemaRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId) // String

  final def formatAsScala: Option[OutputType] = Option(self.format) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetIntrospectionSchemaRequestOps {

  implicit def toGetIntrospectionSchemaRequestBuilderOps(
      v: GetIntrospectionSchemaRequest.Builder
  ): GetIntrospectionSchemaRequestBuilderOps = new GetIntrospectionSchemaRequestBuilderOps(v)

  implicit def toGetIntrospectionSchemaRequestOps(v: GetIntrospectionSchemaRequest): GetIntrospectionSchemaRequestOps =
    new GetIntrospectionSchemaRequestOps(v)

}
