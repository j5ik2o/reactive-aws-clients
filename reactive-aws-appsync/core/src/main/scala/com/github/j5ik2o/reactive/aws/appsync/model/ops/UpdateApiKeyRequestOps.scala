// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class UpdateApiKeyRequestBuilderOps(val self: UpdateApiKeyRequest.Builder) extends AnyVal {

  final def withApiIdAsScala(value: Option[String]): UpdateApiKeyRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  } // String

  final def withIdAsScala(value: Option[String]): UpdateApiKeyRequest.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  } // String

  final def withDescriptionAsScala(value: Option[String]): UpdateApiKeyRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def withExpiresAsScala(value: Option[Long]): UpdateApiKeyRequest.Builder = {
    value.fold(self) { v =>
      self.expires(v)
    }
  } // Long

}

final class UpdateApiKeyRequestOps(val self: UpdateApiKeyRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId) // String

  final def idAsScala: Option[String] = Option(self.id) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def expiresAsScala: Option[Long] = Option(self.expires) // Long

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateApiKeyRequestOps {

  implicit def toUpdateApiKeyRequestBuilderOps(v: UpdateApiKeyRequest.Builder): UpdateApiKeyRequestBuilderOps =
    new UpdateApiKeyRequestBuilderOps(v)

  implicit def toUpdateApiKeyRequestOps(v: UpdateApiKeyRequest): UpdateApiKeyRequestOps = new UpdateApiKeyRequestOps(v)

}
