// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class CreateApiCacheResponseBuilderOps(val self: CreateApiCacheResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiCacheAsScala(value: Option[ApiCache]): CreateApiCacheResponse.Builder = {
    value.fold(self) { v => self.apiCache(v) }
  }

}

final class CreateApiCacheResponseOps(val self: CreateApiCacheResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiCacheAsScala: Option[ApiCache] = Option(self.apiCache)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateApiCacheResponseOps {

  implicit def toCreateApiCacheResponseBuilderOps(v: CreateApiCacheResponse.Builder): CreateApiCacheResponseBuilderOps =
    new CreateApiCacheResponseBuilderOps(v)

  implicit def toCreateApiCacheResponseOps(v: CreateApiCacheResponse): CreateApiCacheResponseOps =
    new CreateApiCacheResponseOps(v)

}
