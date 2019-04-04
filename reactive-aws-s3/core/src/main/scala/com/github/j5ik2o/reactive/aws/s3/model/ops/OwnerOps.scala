// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class OwnerBuilderOps(val self: Owner.Builder) extends AnyVal {

  final def withDisplayNameAsScala(value: Option[String]): Owner.Builder = {
    value.fold(self) { v =>
      self.displayName(v)
    }
  } // String

  final def withIdAsScala(value: Option[String]): Owner.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  } // String

}

final class OwnerOps(val self: Owner) extends AnyVal {

  final def displayNameAsScala: Option[String] = Option(self.displayName) // String

  final def idAsScala: Option[String] = Option(self.id) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToOwnerOps {

  implicit def toOwnerBuilderOps(v: Owner.Builder): OwnerBuilderOps = new OwnerBuilderOps(v)

  implicit def toOwnerOps(v: Owner): OwnerOps = new OwnerOps(v)

}
