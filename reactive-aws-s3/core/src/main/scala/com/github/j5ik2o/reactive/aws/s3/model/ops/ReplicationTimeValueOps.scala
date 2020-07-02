// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ReplicationTimeValueBuilderOps(val self: ReplicationTimeValue.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minutesAsScala(value: Option[Int]): ReplicationTimeValue.Builder = {
    value.fold(self) { v => self.minutes(v) }
  }

}

final class ReplicationTimeValueOps(val self: ReplicationTimeValue) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minutesAsScala: Option[Int] = Option(self.minutes)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplicationTimeValueOps {

  implicit def toReplicationTimeValueBuilderOps(v: ReplicationTimeValue.Builder): ReplicationTimeValueBuilderOps =
    new ReplicationTimeValueBuilderOps(v)

  implicit def toReplicationTimeValueOps(v: ReplicationTimeValue): ReplicationTimeValueOps =
    new ReplicationTimeValueOps(v)

}
