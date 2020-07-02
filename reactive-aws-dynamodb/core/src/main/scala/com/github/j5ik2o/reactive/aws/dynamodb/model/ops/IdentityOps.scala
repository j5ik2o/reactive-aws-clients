// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class IdentityBuilderOps(val self: Identity.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def principalIdAsScala(value: Option[String]): Identity.Builder = {
    value.fold(self) { v => self.principalId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[String]): Identity.Builder = {
    value.fold(self) { v => self.`type`(v) }
  }

}

final class IdentityOps(val self: Identity) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def principalIdAsScala: Option[String] = Option(self.principalId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[String] = Option(self.`type`)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToIdentityOps {

  implicit def toIdentityBuilderOps(v: Identity.Builder): IdentityBuilderOps = new IdentityBuilderOps(v)

  implicit def toIdentityOps(v: Identity): IdentityOps = new IdentityOps(v)

}
