// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GrantBuilderOps(val self: Grant.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def granteeAsScala(value: Option[Grantee]): Grant.Builder = {
    value.fold(self) { v => self.grantee(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def permissionAsScala(value: Option[Permission]): Grant.Builder = {
    value.fold(self) { v => self.permission(v) }
  }

}

final class GrantOps(val self: Grant) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def granteeAsScala: Option[Grantee] = Option(self.grantee)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def permissionAsScala: Option[Permission] = Option(self.permission)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGrantOps {

  implicit def toGrantBuilderOps(v: Grant.Builder): GrantBuilderOps = new GrantBuilderOps(v)

  implicit def toGrantOps(v: Grant): GrantOps = new GrantOps(v)

}
