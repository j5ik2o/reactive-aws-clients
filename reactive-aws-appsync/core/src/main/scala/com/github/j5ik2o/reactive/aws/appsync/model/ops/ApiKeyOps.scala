// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ApiKeyBuilderOps(val self: ApiKey.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala(value: Option[String]): ApiKey.Builder = {
    value.fold(self) { v => self.id(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): ApiKey.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expiresAsScala(value: Option[Long]): ApiKey.Builder = {
    value.fold(self) { v => self.expires(v) }
  }

}

final class ApiKeyOps(val self: ApiKey) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala: Option[String] = Option(self.id)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expiresAsScala: Option[Long] = Option(self.expires)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToApiKeyOps {

  implicit def toApiKeyBuilderOps(v: ApiKey.Builder): ApiKeyBuilderOps = new ApiKeyBuilderOps(v)

  implicit def toApiKeyOps(v: ApiKey): ApiKeyOps = new ApiKeyOps(v)

}
