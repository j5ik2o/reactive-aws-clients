// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class IdentityBuilderOps(val self: Identity.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def oidcAsScala(value: Option[OIDC]): Identity.Builder = {
    value.fold(self) { v => self.oidc(v) }
  }

}

final class IdentityOps(val self: Identity) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def oidcAsScala: Option[OIDC] = Option(self.oidc)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToIdentityOps {

  implicit def toIdentityBuilderOps(v: Identity.Builder): IdentityBuilderOps = new IdentityBuilderOps(v)

  implicit def toIdentityOps(v: Identity): IdentityOps = new IdentityOps(v)

}
