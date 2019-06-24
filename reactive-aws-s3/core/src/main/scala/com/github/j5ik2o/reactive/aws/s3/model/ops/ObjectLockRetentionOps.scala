// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ObjectLockRetentionBuilderOps(val self: ObjectLockRetention.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def modeAsScala(value: Option[ObjectLockRetentionMode]): ObjectLockRetention.Builder = {
    value.fold(self) { v =>
      self.mode(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retainUntilDateAsScala(value: Option[java.time.Instant]): ObjectLockRetention.Builder = {
    value.fold(self) { v =>
      self.retainUntilDate(v)
    }
  }

}

final class ObjectLockRetentionOps(val self: ObjectLockRetention) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def modeAsScala: Option[ObjectLockRetentionMode] = Option(self.mode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retainUntilDateAsScala: Option[java.time.Instant] = Option(self.retainUntilDate)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToObjectLockRetentionOps {

  implicit def toObjectLockRetentionBuilderOps(v: ObjectLockRetention.Builder): ObjectLockRetentionBuilderOps =
    new ObjectLockRetentionBuilderOps(v)

  implicit def toObjectLockRetentionOps(v: ObjectLockRetention): ObjectLockRetentionOps = new ObjectLockRetentionOps(v)

}
