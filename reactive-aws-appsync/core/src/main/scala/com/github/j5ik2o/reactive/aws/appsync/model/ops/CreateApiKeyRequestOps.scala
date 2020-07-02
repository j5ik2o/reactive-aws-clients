// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class CreateApiKeyRequestBuilderOps(val self: CreateApiKeyRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala(value: Option[String]): CreateApiKeyRequest.Builder = {
    value.fold(self) { v => self.apiId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): CreateApiKeyRequest.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expiresAsScala(value: Option[Long]): CreateApiKeyRequest.Builder = {
    value.fold(self) { v => self.expires(v) }
  }

}

final class CreateApiKeyRequestOps(val self: CreateApiKeyRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala: Option[String] = Option(self.apiId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expiresAsScala: Option[Long] = Option(self.expires)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateApiKeyRequestOps {

  implicit def toCreateApiKeyRequestBuilderOps(v: CreateApiKeyRequest.Builder): CreateApiKeyRequestBuilderOps =
    new CreateApiKeyRequestBuilderOps(v)

  implicit def toCreateApiKeyRequestOps(v: CreateApiKeyRequest): CreateApiKeyRequestOps = new CreateApiKeyRequestOps(v)

}
