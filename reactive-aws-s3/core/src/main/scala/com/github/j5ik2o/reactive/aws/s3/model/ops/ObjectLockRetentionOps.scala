// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ObjectLockRetentionBuilderOps(val self: ObjectLockRetention.Builder) extends AnyVal {

  final def withModeAsScala(value: Option[ObjectLockRetentionMode]): ObjectLockRetention.Builder = {
    value.fold(self) { v =>
      self.mode(v)
    }
  } // String

  final def withRetainUntilDateAsScala(value: Option[java.time.Instant]): ObjectLockRetention.Builder = {
    value.fold(self) { v =>
      self.retainUntilDate(v)
    }
  } // Instant

}

final class ObjectLockRetentionOps(val self: ObjectLockRetention) extends AnyVal {

  final def modeAsScala: Option[ObjectLockRetentionMode] = Option(self.mode) // String

  final def retainUntilDateAsScala: Option[java.time.Instant] = Option(self.retainUntilDate) // Instant

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToObjectLockRetentionOps {

  implicit def toObjectLockRetentionBuilderOps(v: ObjectLockRetention.Builder): ObjectLockRetentionBuilderOps =
    new ObjectLockRetentionBuilderOps(v)

  implicit def toObjectLockRetentionOps(v: ObjectLockRetention): ObjectLockRetentionOps = new ObjectLockRetentionOps(v)

}
