// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ExistingObjectReplicationBuilderOps(val self: ExistingObjectReplication.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[ExistingObjectReplicationStatus]): ExistingObjectReplication.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class ExistingObjectReplicationOps(val self: ExistingObjectReplication) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[ExistingObjectReplicationStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToExistingObjectReplicationOps {

  implicit def toExistingObjectReplicationBuilderOps(
      v: ExistingObjectReplication.Builder
  ): ExistingObjectReplicationBuilderOps = new ExistingObjectReplicationBuilderOps(v)

  implicit def toExistingObjectReplicationOps(v: ExistingObjectReplication): ExistingObjectReplicationOps =
    new ExistingObjectReplicationOps(v)

}
