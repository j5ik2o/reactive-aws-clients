// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class FlushApiCacheRequestBuilderOps(val self: FlushApiCacheRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala(value: Option[String]): FlushApiCacheRequest.Builder = {
    value.fold(self) { v => self.apiId(v) }
  }

}

final class FlushApiCacheRequestOps(val self: FlushApiCacheRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala: Option[String] = Option(self.apiId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFlushApiCacheRequestOps {

  implicit def toFlushApiCacheRequestBuilderOps(v: FlushApiCacheRequest.Builder): FlushApiCacheRequestBuilderOps =
    new FlushApiCacheRequestBuilderOps(v)

  implicit def toFlushApiCacheRequestOps(v: FlushApiCacheRequest): FlushApiCacheRequestOps =
    new FlushApiCacheRequestOps(v)

}
