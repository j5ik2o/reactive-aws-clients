// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class OwnerBuilderOps(val self: Owner.Builder) extends AnyVal {

  final def displayNameAsScala(value: Option[String]): Owner.Builder = {
    value.fold(self) { v =>
      self.displayName(v)
    }
  }

  final def idAsScala(value: Option[String]): Owner.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

}

final class OwnerOps(val self: Owner) extends AnyVal {

  final def displayNameAsScala: Option[String] = Option(self.displayName)

  final def idAsScala: Option[String] = Option(self.id)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToOwnerOps {

  implicit def toOwnerBuilderOps(v: Owner.Builder): OwnerBuilderOps = new OwnerBuilderOps(v)

  implicit def toOwnerOps(v: Owner): OwnerOps = new OwnerOps(v)

}
