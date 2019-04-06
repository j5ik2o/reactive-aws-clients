// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class OpenIDConnectConfigBuilderOps(val self: OpenIDConnectConfig.Builder) extends AnyVal {

  final def withIssuerAsScala(value: Option[String]): OpenIDConnectConfig.Builder = {
    value.fold(self) { v =>
      self.issuer(v)
    }
  } // String

  final def withClientIdAsScala(value: Option[String]): OpenIDConnectConfig.Builder = {
    value.fold(self) { v =>
      self.clientId(v)
    }
  } // String

  final def withIatTTLAsScala(value: Option[Long]): OpenIDConnectConfig.Builder = {
    value.fold(self) { v =>
      self.iatTTL(v)
    }
  } // Long

  final def withAuthTTLAsScala(value: Option[Long]): OpenIDConnectConfig.Builder = {
    value.fold(self) { v =>
      self.authTTL(v)
    }
  } // Long

}

final class OpenIDConnectConfigOps(val self: OpenIDConnectConfig) extends AnyVal {

  final def issuerAsScala: Option[String] = Option(self.issuer) // String

  final def clientIdAsScala: Option[String] = Option(self.clientId) // String

  final def iatTTLAsScala: Option[Long] = Option(self.iatTTL) // Long

  final def authTTLAsScala: Option[Long] = Option(self.authTTL) // Long

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToOpenIDConnectConfigOps {

  implicit def toOpenIDConnectConfigBuilderOps(v: OpenIDConnectConfig.Builder): OpenIDConnectConfigBuilderOps =
    new OpenIDConnectConfigBuilderOps(v)

  implicit def toOpenIDConnectConfigOps(v: OpenIDConnectConfig): OpenIDConnectConfigOps = new OpenIDConnectConfigOps(v)

}
