// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ApiCacheBuilderOps(val self: ApiCache.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ttlAsScala(value: Option[Long]): ApiCache.Builder = {
    value.fold(self) { v =>
      self.ttl(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiCachingBehaviorAsScala(value: Option[ApiCachingBehavior]): ApiCache.Builder = {
    value.fold(self) { v =>
      self.apiCachingBehavior(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitEncryptionEnabledAsScala(value: Option[Boolean]): ApiCache.Builder = {
    value.fold(self) { v =>
      self.transitEncryptionEnabled(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def atRestEncryptionEnabledAsScala(value: Option[Boolean]): ApiCache.Builder = {
    value.fold(self) { v =>
      self.atRestEncryptionEnabled(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[ApiCacheType]): ApiCache.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[ApiCacheStatus]): ApiCache.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class ApiCacheOps(val self: ApiCache) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ttlAsScala: Option[Long] = Option(self.ttl)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiCachingBehaviorAsScala: Option[ApiCachingBehavior] = Option(self.apiCachingBehavior)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitEncryptionEnabledAsScala: Option[Boolean] = Option(self.transitEncryptionEnabled)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def atRestEncryptionEnabledAsScala: Option[Boolean] = Option(self.atRestEncryptionEnabled)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[ApiCacheType] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[ApiCacheStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToApiCacheOps {

  implicit def toApiCacheBuilderOps(v: ApiCache.Builder): ApiCacheBuilderOps = new ApiCacheBuilderOps(v)

  implicit def toApiCacheOps(v: ApiCache): ApiCacheOps = new ApiCacheOps(v)

}
