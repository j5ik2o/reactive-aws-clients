// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class UpdateApiCacheResponseBuilderOps(val self: UpdateApiCacheResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiCacheAsScala(value: Option[ApiCache]): UpdateApiCacheResponse.Builder = {
    value.fold(self) { v => self.apiCache(v) }
  }

}

final class UpdateApiCacheResponseOps(val self: UpdateApiCacheResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiCacheAsScala: Option[ApiCache] = Option(self.apiCache)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateApiCacheResponseOps {

  implicit def toUpdateApiCacheResponseBuilderOps(v: UpdateApiCacheResponse.Builder): UpdateApiCacheResponseBuilderOps =
    new UpdateApiCacheResponseBuilderOps(v)

  implicit def toUpdateApiCacheResponseOps(v: UpdateApiCacheResponse): UpdateApiCacheResponseOps =
    new UpdateApiCacheResponseOps(v)

}
