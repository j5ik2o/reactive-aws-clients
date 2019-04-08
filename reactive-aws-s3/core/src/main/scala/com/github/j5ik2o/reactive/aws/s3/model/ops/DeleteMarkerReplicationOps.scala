// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteMarkerReplicationBuilderOps(val self: DeleteMarkerReplication.Builder) extends AnyVal {

  final def statusAsScala(value: Option[DeleteMarkerReplicationStatus]): DeleteMarkerReplication.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // DeleteMarkerReplicationStatus

}

final class DeleteMarkerReplicationOps(val self: DeleteMarkerReplication) extends AnyVal {

  final def statusAsScala: Option[DeleteMarkerReplicationStatus] = Option(self.status) // DeleteMarkerReplicationStatus

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteMarkerReplicationOps {

  implicit def toDeleteMarkerReplicationBuilderOps(
      v: DeleteMarkerReplication.Builder
  ): DeleteMarkerReplicationBuilderOps = new DeleteMarkerReplicationBuilderOps(v)

  implicit def toDeleteMarkerReplicationOps(v: DeleteMarkerReplication): DeleteMarkerReplicationOps =
    new DeleteMarkerReplicationOps(v)

}
