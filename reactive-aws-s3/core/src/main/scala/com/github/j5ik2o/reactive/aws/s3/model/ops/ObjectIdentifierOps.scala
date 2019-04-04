// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ObjectIdentifierBuilderOps(val self: ObjectIdentifier.Builder) extends AnyVal {

  final def withKeyAsScala(value: Option[String]): ObjectIdentifier.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def withVersionIdAsScala(value: Option[String]): ObjectIdentifier.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  } // String

}

final class ObjectIdentifierOps(val self: ObjectIdentifier) extends AnyVal {

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def versionIdAsScala: Option[String] = Option(self.versionId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToObjectIdentifierOps {

  implicit def toObjectIdentifierBuilderOps(v: ObjectIdentifier.Builder): ObjectIdentifierBuilderOps =
    new ObjectIdentifierBuilderOps(v)

  implicit def toObjectIdentifierOps(v: ObjectIdentifier): ObjectIdentifierOps = new ObjectIdentifierOps(v)

}
