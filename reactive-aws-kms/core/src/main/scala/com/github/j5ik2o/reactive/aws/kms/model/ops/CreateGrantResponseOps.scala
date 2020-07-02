// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class CreateGrantResponseBuilderOps(val self: CreateGrantResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantTokenAsScala(value: Option[String]): CreateGrantResponse.Builder = {
    value.fold(self) { v => self.grantToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantIdAsScala(value: Option[String]): CreateGrantResponse.Builder = {
    value.fold(self) { v => self.grantId(v) }
  }

}

final class CreateGrantResponseOps(val self: CreateGrantResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantTokenAsScala: Option[String] = Option(self.grantToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantIdAsScala: Option[String] = Option(self.grantId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateGrantResponseOps {

  implicit def toCreateGrantResponseBuilderOps(v: CreateGrantResponse.Builder): CreateGrantResponseBuilderOps =
    new CreateGrantResponseBuilderOps(v)

  implicit def toCreateGrantResponseOps(v: CreateGrantResponse): CreateGrantResponseOps = new CreateGrantResponseOps(v)

}
