// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class RevokeGrantRequestBuilderOps(val self: RevokeGrantRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): RevokeGrantRequest.Builder = {
    value.fold(self) { v => self.keyId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantIdAsScala(value: Option[String]): RevokeGrantRequest.Builder = {
    value.fold(self) { v => self.grantId(v) }
  }

}

final class RevokeGrantRequestOps(val self: RevokeGrantRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantIdAsScala: Option[String] = Option(self.grantId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRevokeGrantRequestOps {

  implicit def toRevokeGrantRequestBuilderOps(v: RevokeGrantRequest.Builder): RevokeGrantRequestBuilderOps =
    new RevokeGrantRequestBuilderOps(v)

  implicit def toRevokeGrantRequestOps(v: RevokeGrantRequest): RevokeGrantRequestOps = new RevokeGrantRequestOps(v)

}
