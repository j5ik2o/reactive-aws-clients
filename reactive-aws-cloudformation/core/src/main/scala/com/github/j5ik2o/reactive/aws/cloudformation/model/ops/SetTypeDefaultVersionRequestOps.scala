// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class SetTypeDefaultVersionRequestBuilderOps(val self: SetTypeDefaultVersionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala(value: Option[String]): SetTypeDefaultVersionRequest.Builder = {
    value.fold(self) { v => self.arn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[RegistryType]): SetTypeDefaultVersionRequest.Builder = {
    value.fold(self) { v => self.`type`(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeNameAsScala(value: Option[String]): SetTypeDefaultVersionRequest.Builder = {
    value.fold(self) { v => self.typeName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionIdAsScala(value: Option[String]): SetTypeDefaultVersionRequest.Builder = {
    value.fold(self) { v => self.versionId(v) }
  }

}

final class SetTypeDefaultVersionRequestOps(val self: SetTypeDefaultVersionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala: Option[String] = Option(self.arn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[RegistryType] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeNameAsScala: Option[String] = Option(self.typeName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionIdAsScala: Option[String] = Option(self.versionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSetTypeDefaultVersionRequestOps {

  implicit def toSetTypeDefaultVersionRequestBuilderOps(
      v: SetTypeDefaultVersionRequest.Builder
  ): SetTypeDefaultVersionRequestBuilderOps = new SetTypeDefaultVersionRequestBuilderOps(v)

  implicit def toSetTypeDefaultVersionRequestOps(v: SetTypeDefaultVersionRequest): SetTypeDefaultVersionRequestOps =
    new SetTypeDefaultVersionRequestOps(v)

}
