// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class CreateApiCacheRequestBuilderOps(val self: CreateApiCacheRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala(value: Option[String]): CreateApiCacheRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ttlAsScala(value: Option[Long]): CreateApiCacheRequest.Builder = {
    value.fold(self) { v =>
      self.ttl(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitEncryptionEnabledAsScala(value: Option[Boolean]): CreateApiCacheRequest.Builder = {
    value.fold(self) { v =>
      self.transitEncryptionEnabled(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def atRestEncryptionEnabledAsScala(value: Option[Boolean]): CreateApiCacheRequest.Builder = {
    value.fold(self) { v =>
      self.atRestEncryptionEnabled(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiCachingBehaviorAsScala(value: Option[ApiCachingBehavior]): CreateApiCacheRequest.Builder = {
    value.fold(self) { v =>
      self.apiCachingBehavior(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[ApiCacheType]): CreateApiCacheRequest.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

}

final class CreateApiCacheRequestOps(val self: CreateApiCacheRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala: Option[String] = Option(self.apiId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ttlAsScala: Option[Long] = Option(self.ttl)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitEncryptionEnabledAsScala: Option[Boolean] = Option(self.transitEncryptionEnabled)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def atRestEncryptionEnabledAsScala: Option[Boolean] = Option(self.atRestEncryptionEnabled)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiCachingBehaviorAsScala: Option[ApiCachingBehavior] = Option(self.apiCachingBehavior)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[ApiCacheType] = Option(self.`type`)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateApiCacheRequestOps {

  implicit def toCreateApiCacheRequestBuilderOps(v: CreateApiCacheRequest.Builder): CreateApiCacheRequestBuilderOps =
    new CreateApiCacheRequestBuilderOps(v)

  implicit def toCreateApiCacheRequestOps(v: CreateApiCacheRequest): CreateApiCacheRequestOps =
    new CreateApiCacheRequestOps(v)

}
