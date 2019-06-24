// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class OpenIDConnectConfigBuilderOps(val self: OpenIDConnectConfig.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def issuerAsScala(value: Option[String]): OpenIDConnectConfig.Builder = {
    value.fold(self) { v =>
      self.issuer(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientIdAsScala(value: Option[String]): OpenIDConnectConfig.Builder = {
    value.fold(self) { v =>
      self.clientId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iatTTLAsScala(value: Option[Long]): OpenIDConnectConfig.Builder = {
    value.fold(self) { v =>
      self.iatTTL(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def authTTLAsScala(value: Option[Long]): OpenIDConnectConfig.Builder = {
    value.fold(self) { v =>
      self.authTTL(v)
    }
  }

}

final class OpenIDConnectConfigOps(val self: OpenIDConnectConfig) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def issuerAsScala: Option[String] = Option(self.issuer)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientIdAsScala: Option[String] = Option(self.clientId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iatTTLAsScala: Option[Long] = Option(self.iatTTL)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def authTTLAsScala: Option[Long] = Option(self.authTTL)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToOpenIDConnectConfigOps {

  implicit def toOpenIDConnectConfigBuilderOps(v: OpenIDConnectConfig.Builder): OpenIDConnectConfigBuilderOps =
    new OpenIDConnectConfigBuilderOps(v)

  implicit def toOpenIDConnectConfigOps(v: OpenIDConnectConfig): OpenIDConnectConfigOps = new OpenIDConnectConfigOps(v)

}
