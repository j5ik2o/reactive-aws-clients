// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class GetDataSourceRequestBuilderOps(val self: GetDataSourceRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala(value: Option[String]): GetDataSourceRequest.Builder = {
    value.fold(self) { v => self.apiId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): GetDataSourceRequest.Builder = {
    value.fold(self) { v => self.name(v) }
  }

}

final class GetDataSourceRequestOps(val self: GetDataSourceRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala: Option[String] = Option(self.apiId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetDataSourceRequestOps {

  implicit def toGetDataSourceRequestBuilderOps(v: GetDataSourceRequest.Builder): GetDataSourceRequestBuilderOps =
    new GetDataSourceRequestBuilderOps(v)

  implicit def toGetDataSourceRequestOps(v: GetDataSourceRequest): GetDataSourceRequestOps =
    new GetDataSourceRequestOps(v)

}
