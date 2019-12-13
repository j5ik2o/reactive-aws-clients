// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class UpdateApiCacheRequestBuilderOps(val self: UpdateApiCacheRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala(value: Option[String]): UpdateApiCacheRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ttlAsScala(value: Option[Long]): UpdateApiCacheRequest.Builder = {
    value.fold(self) { v =>
      self.ttl(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiCachingBehaviorAsScala(value: Option[ApiCachingBehavior]): UpdateApiCacheRequest.Builder = {
    value.fold(self) { v =>
      self.apiCachingBehavior(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[ApiCacheType]): UpdateApiCacheRequest.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

}

final class UpdateApiCacheRequestOps(val self: UpdateApiCacheRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala: Option[String] = Option(self.apiId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ttlAsScala: Option[Long] = Option(self.ttl)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiCachingBehaviorAsScala: Option[ApiCachingBehavior] = Option(self.apiCachingBehavior)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[ApiCacheType] = Option(self.`type`)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateApiCacheRequestOps {

  implicit def toUpdateApiCacheRequestBuilderOps(v: UpdateApiCacheRequest.Builder): UpdateApiCacheRequestBuilderOps =
    new UpdateApiCacheRequestBuilderOps(v)

  implicit def toUpdateApiCacheRequestOps(v: UpdateApiCacheRequest): UpdateApiCacheRequestOps =
    new UpdateApiCacheRequestOps(v)

}
