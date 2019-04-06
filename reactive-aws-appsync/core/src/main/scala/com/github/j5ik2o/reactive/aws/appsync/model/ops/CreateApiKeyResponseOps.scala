// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class CreateApiKeyResponseBuilderOps(val self: CreateApiKeyResponse.Builder) extends AnyVal {

  final def withApiKeyAsScala(value: Option[ApiKey]): CreateApiKeyResponse.Builder = {
    value.fold(self) { v =>
      self.apiKey(v)
    }
  } // ApiKey

}

final class CreateApiKeyResponseOps(val self: CreateApiKeyResponse) extends AnyVal {

  final def apiKeyAsScala: Option[ApiKey] = Option(self.apiKey) // ApiKey

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateApiKeyResponseOps {

  implicit def toCreateApiKeyResponseBuilderOps(v: CreateApiKeyResponse.Builder): CreateApiKeyResponseBuilderOps =
    new CreateApiKeyResponseBuilderOps(v)

  implicit def toCreateApiKeyResponseOps(v: CreateApiKeyResponse): CreateApiKeyResponseOps =
    new CreateApiKeyResponseOps(v)

}
