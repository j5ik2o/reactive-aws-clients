// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class GetApiCacheRequestBuilderOps(val self: GetApiCacheRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala(value: Option[String]): GetApiCacheRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  }

}

final class GetApiCacheRequestOps(val self: GetApiCacheRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala: Option[String] = Option(self.apiId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetApiCacheRequestOps {

  implicit def toGetApiCacheRequestBuilderOps(v: GetApiCacheRequest.Builder): GetApiCacheRequestBuilderOps =
    new GetApiCacheRequestBuilderOps(v)

  implicit def toGetApiCacheRequestOps(v: GetApiCacheRequest): GetApiCacheRequestOps = new GetApiCacheRequestOps(v)

}
