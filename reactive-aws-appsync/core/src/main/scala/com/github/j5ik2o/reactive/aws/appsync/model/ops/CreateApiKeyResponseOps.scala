// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class CreateApiKeyResponseBuilderOps(val self: CreateApiKeyResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiKeyAsScala(value: Option[ApiKey]): CreateApiKeyResponse.Builder = {
    value.fold(self) { v => self.apiKey(v) }
  }

}

final class CreateApiKeyResponseOps(val self: CreateApiKeyResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiKeyAsScala: Option[ApiKey] = Option(self.apiKey)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateApiKeyResponseOps {

  implicit def toCreateApiKeyResponseBuilderOps(v: CreateApiKeyResponse.Builder): CreateApiKeyResponseBuilderOps =
    new CreateApiKeyResponseBuilderOps(v)

  implicit def toCreateApiKeyResponseOps(v: CreateApiKeyResponse): CreateApiKeyResponseOps =
    new CreateApiKeyResponseOps(v)

}
