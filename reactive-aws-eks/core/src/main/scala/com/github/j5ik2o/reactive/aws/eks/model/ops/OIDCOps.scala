// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class OIDCBuilderOps(val self: OIDC.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def issuerAsScala(value: Option[String]): OIDC.Builder = {
    value.fold(self) { v =>
      self.issuer(v)
    }
  }

}

final class OIDCOps(val self: OIDC) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def issuerAsScala: Option[String] = Option(self.issuer)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToOIDCOps {

  implicit def toOIDCBuilderOps(v: OIDC.Builder): OIDCBuilderOps = new OIDCBuilderOps(v)

  implicit def toOIDCOps(v: OIDC): OIDCOps = new OIDCOps(v)

}
