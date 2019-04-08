// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class OpenIDConnectConfigBuilderOps(val self: OpenIDConnectConfig.Builder) extends AnyVal {

  final def issuerAsScala(value: Option[String]): OpenIDConnectConfig.Builder = {
    value.fold(self) { v =>
      self.issuer(v)
    }
  }

  final def clientIdAsScala(value: Option[String]): OpenIDConnectConfig.Builder = {
    value.fold(self) { v =>
      self.clientId(v)
    }
  }

  final def iatTTLAsScala(value: Option[Long]): OpenIDConnectConfig.Builder = {
    value.fold(self) { v =>
      self.iatTTL(v)
    }
  }

  final def authTTLAsScala(value: Option[Long]): OpenIDConnectConfig.Builder = {
    value.fold(self) { v =>
      self.authTTL(v)
    }
  }

}

final class OpenIDConnectConfigOps(val self: OpenIDConnectConfig) extends AnyVal {

  final def issuerAsScala: Option[String] = Option(self.issuer)

  final def clientIdAsScala: Option[String] = Option(self.clientId)

  final def iatTTLAsScala: Option[Long] = Option(self.iatTTL)

  final def authTTLAsScala: Option[Long] = Option(self.authTTL)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToOpenIDConnectConfigOps {

  implicit def toOpenIDConnectConfigBuilderOps(v: OpenIDConnectConfig.Builder): OpenIDConnectConfigBuilderOps =
    new OpenIDConnectConfigBuilderOps(v)

  implicit def toOpenIDConnectConfigOps(v: OpenIDConnectConfig): OpenIDConnectConfigOps = new OpenIDConnectConfigOps(v)

}
