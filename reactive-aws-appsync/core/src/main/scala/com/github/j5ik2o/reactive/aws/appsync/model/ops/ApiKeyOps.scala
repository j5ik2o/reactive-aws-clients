// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ApiKeyBuilderOps(val self: ApiKey.Builder) extends AnyVal {

  final def idAsScala(value: Option[String]): ApiKey.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): ApiKey.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def expiresAsScala(value: Option[Long]): ApiKey.Builder = {
    value.fold(self) { v =>
      self.expires(v)
    }
  } // Long

}

final class ApiKeyOps(val self: ApiKey) extends AnyVal {

  final def idAsScala: Option[String] = Option(self.id) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def expiresAsScala: Option[Long] = Option(self.expires) // Long

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToApiKeyOps {

  implicit def toApiKeyBuilderOps(v: ApiKey.Builder): ApiKeyBuilderOps = new ApiKeyBuilderOps(v)

  implicit def toApiKeyOps(v: ApiKey): ApiKeyOps = new ApiKeyOps(v)

}
