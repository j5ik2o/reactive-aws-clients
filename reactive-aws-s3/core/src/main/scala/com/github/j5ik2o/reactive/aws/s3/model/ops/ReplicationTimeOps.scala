// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ReplicationTimeBuilderOps(val self: ReplicationTime.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[ReplicationTimeStatus]): ReplicationTime.Builder = {
    value.fold(self) { v => self.status(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeAsScala(value: Option[ReplicationTimeValue]): ReplicationTime.Builder = {
    value.fold(self) { v => self.time(v) }
  }

}

final class ReplicationTimeOps(val self: ReplicationTime) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[ReplicationTimeStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeAsScala: Option[ReplicationTimeValue] = Option(self.time)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplicationTimeOps {

  implicit def toReplicationTimeBuilderOps(v: ReplicationTime.Builder): ReplicationTimeBuilderOps =
    new ReplicationTimeBuilderOps(v)

  implicit def toReplicationTimeOps(v: ReplicationTime): ReplicationTimeOps = new ReplicationTimeOps(v)

}
