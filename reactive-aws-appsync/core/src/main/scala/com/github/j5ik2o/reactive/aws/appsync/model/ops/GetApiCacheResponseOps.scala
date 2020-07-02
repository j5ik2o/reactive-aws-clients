// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class GetApiCacheResponseBuilderOps(val self: GetApiCacheResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiCacheAsScala(value: Option[ApiCache]): GetApiCacheResponse.Builder = {
    value.fold(self) { v => self.apiCache(v) }
  }

}

final class GetApiCacheResponseOps(val self: GetApiCacheResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiCacheAsScala: Option[ApiCache] = Option(self.apiCache)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetApiCacheResponseOps {

  implicit def toGetApiCacheResponseBuilderOps(v: GetApiCacheResponse.Builder): GetApiCacheResponseBuilderOps =
    new GetApiCacheResponseBuilderOps(v)

  implicit def toGetApiCacheResponseOps(v: GetApiCacheResponse): GetApiCacheResponseOps = new GetApiCacheResponseOps(v)

}
