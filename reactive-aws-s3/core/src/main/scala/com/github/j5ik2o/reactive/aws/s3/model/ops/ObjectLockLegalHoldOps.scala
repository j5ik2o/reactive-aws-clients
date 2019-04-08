// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ObjectLockLegalHoldBuilderOps(val self: ObjectLockLegalHold.Builder) extends AnyVal {

  final def statusAsScala(value: Option[ObjectLockLegalHoldStatus]): ObjectLockLegalHold.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class ObjectLockLegalHoldOps(val self: ObjectLockLegalHold) extends AnyVal {

  final def statusAsScala: Option[ObjectLockLegalHoldStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToObjectLockLegalHoldOps {

  implicit def toObjectLockLegalHoldBuilderOps(v: ObjectLockLegalHold.Builder): ObjectLockLegalHoldBuilderOps =
    new ObjectLockLegalHoldBuilderOps(v)

  implicit def toObjectLockLegalHoldOps(v: ObjectLockLegalHold): ObjectLockLegalHoldOps = new ObjectLockLegalHoldOps(v)

}
