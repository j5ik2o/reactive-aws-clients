// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class DeleteApiKeyRequestBuilderOps(val self: DeleteApiKeyRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala(value: Option[String]): DeleteApiKeyRequest.Builder = {
    value.fold(self) { v => self.apiId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala(value: Option[String]): DeleteApiKeyRequest.Builder = {
    value.fold(self) { v => self.id(v) }
  }

}

final class DeleteApiKeyRequestOps(val self: DeleteApiKeyRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala: Option[String] = Option(self.apiId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala: Option[String] = Option(self.id)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteApiKeyRequestOps {

  implicit def toDeleteApiKeyRequestBuilderOps(v: DeleteApiKeyRequest.Builder): DeleteApiKeyRequestBuilderOps =
    new DeleteApiKeyRequestBuilderOps(v)

  implicit def toDeleteApiKeyRequestOps(v: DeleteApiKeyRequest): DeleteApiKeyRequestOps = new DeleteApiKeyRequestOps(v)

}
