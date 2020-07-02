// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class DeleteApiCacheRequestBuilderOps(val self: DeleteApiCacheRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala(value: Option[String]): DeleteApiCacheRequest.Builder = {
    value.fold(self) { v => self.apiId(v) }
  }

}

final class DeleteApiCacheRequestOps(val self: DeleteApiCacheRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala: Option[String] = Option(self.apiId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteApiCacheRequestOps {

  implicit def toDeleteApiCacheRequestBuilderOps(v: DeleteApiCacheRequest.Builder): DeleteApiCacheRequestBuilderOps =
    new DeleteApiCacheRequestBuilderOps(v)

  implicit def toDeleteApiCacheRequestOps(v: DeleteApiCacheRequest): DeleteApiCacheRequestOps =
    new DeleteApiCacheRequestOps(v)

}
