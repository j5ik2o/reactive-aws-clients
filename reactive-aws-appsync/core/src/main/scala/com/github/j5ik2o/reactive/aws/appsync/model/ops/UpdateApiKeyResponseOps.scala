// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class UpdateApiKeyResponseBuilderOps(val self: UpdateApiKeyResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiKeyAsScala(value: Option[ApiKey]): UpdateApiKeyResponse.Builder = {
    value.fold(self) { v => self.apiKey(v) }
  }

}

final class UpdateApiKeyResponseOps(val self: UpdateApiKeyResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiKeyAsScala: Option[ApiKey] = Option(self.apiKey)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateApiKeyResponseOps {

  implicit def toUpdateApiKeyResponseBuilderOps(v: UpdateApiKeyResponse.Builder): UpdateApiKeyResponseBuilderOps =
    new UpdateApiKeyResponseBuilderOps(v)

  implicit def toUpdateApiKeyResponseOps(v: UpdateApiKeyResponse): UpdateApiKeyResponseOps =
    new UpdateApiKeyResponseOps(v)

}
