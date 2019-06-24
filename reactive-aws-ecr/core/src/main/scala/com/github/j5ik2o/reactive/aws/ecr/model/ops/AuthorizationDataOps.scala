// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class AuthorizationDataBuilderOps(val self: AuthorizationData.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def authorizationTokenAsScala(value: Option[String]): AuthorizationData.Builder = {
    value.fold(self) { v =>
      self.authorizationToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expiresAtAsScala(value: Option[java.time.Instant]): AuthorizationData.Builder = {
    value.fold(self) { v =>
      self.expiresAt(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def proxyEndpointAsScala(value: Option[String]): AuthorizationData.Builder = {
    value.fold(self) { v =>
      self.proxyEndpoint(v)
    }
  }

}

final class AuthorizationDataOps(val self: AuthorizationData) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def authorizationTokenAsScala: Option[String] = Option(self.authorizationToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expiresAtAsScala: Option[java.time.Instant] = Option(self.expiresAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def proxyEndpointAsScala: Option[String] = Option(self.proxyEndpoint)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAuthorizationDataOps {

  implicit def toAuthorizationDataBuilderOps(v: AuthorizationData.Builder): AuthorizationDataBuilderOps =
    new AuthorizationDataBuilderOps(v)

  implicit def toAuthorizationDataOps(v: AuthorizationData): AuthorizationDataOps = new AuthorizationDataOps(v)

}
