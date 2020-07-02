// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GranteeBuilderOps(val self: Grantee.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def displayNameAsScala(value: Option[String]): Grantee.Builder = {
    value.fold(self) { v => self.displayName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def emailAddressAsScala(value: Option[String]): Grantee.Builder = {
    value.fold(self) { v => self.emailAddress(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala(value: Option[String]): Grantee.Builder = {
    value.fold(self) { v => self.id(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[Type]): Grantee.Builder = {
    value.fold(self) { v => self.`type`(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uriAsScala(value: Option[String]): Grantee.Builder = {
    value.fold(self) { v => self.uri(v) }
  }

}

final class GranteeOps(val self: Grantee) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def displayNameAsScala: Option[String] = Option(self.displayName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def emailAddressAsScala: Option[String] = Option(self.emailAddress)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala: Option[String] = Option(self.id)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[Type] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uriAsScala: Option[String] = Option(self.uri)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGranteeOps {

  implicit def toGranteeBuilderOps(v: Grantee.Builder): GranteeBuilderOps = new GranteeBuilderOps(v)

  implicit def toGranteeOps(v: Grantee): GranteeOps = new GranteeOps(v)

}
