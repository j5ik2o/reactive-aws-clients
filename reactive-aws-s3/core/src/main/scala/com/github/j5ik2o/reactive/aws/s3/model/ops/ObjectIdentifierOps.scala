// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ObjectIdentifierBuilderOps(val self: ObjectIdentifier.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala(value: Option[String]): ObjectIdentifier.Builder = {
    value.fold(self) { v => self.key(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionIdAsScala(value: Option[String]): ObjectIdentifier.Builder = {
    value.fold(self) { v => self.versionId(v) }
  }

}

final class ObjectIdentifierOps(val self: ObjectIdentifier) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala: Option[String] = Option(self.key)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionIdAsScala: Option[String] = Option(self.versionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToObjectIdentifierOps {

  implicit def toObjectIdentifierBuilderOps(v: ObjectIdentifier.Builder): ObjectIdentifierBuilderOps =
    new ObjectIdentifierBuilderOps(v)

  implicit def toObjectIdentifierOps(v: ObjectIdentifier): ObjectIdentifierOps = new ObjectIdentifierOps(v)

}
