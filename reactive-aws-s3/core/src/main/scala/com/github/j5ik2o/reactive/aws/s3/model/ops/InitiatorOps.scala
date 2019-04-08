// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class InitiatorBuilderOps(val self: Initiator.Builder) extends AnyVal {

  final def idAsScala(value: Option[String]): Initiator.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

  final def displayNameAsScala(value: Option[String]): Initiator.Builder = {
    value.fold(self) { v =>
      self.displayName(v)
    }
  }

}

final class InitiatorOps(val self: Initiator) extends AnyVal {

  final def idAsScala: Option[String] = Option(self.id)

  final def displayNameAsScala: Option[String] = Option(self.displayName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInitiatorOps {

  implicit def toInitiatorBuilderOps(v: Initiator.Builder): InitiatorBuilderOps = new InitiatorBuilderOps(v)

  implicit def toInitiatorOps(v: Initiator): InitiatorOps = new InitiatorOps(v)

}
