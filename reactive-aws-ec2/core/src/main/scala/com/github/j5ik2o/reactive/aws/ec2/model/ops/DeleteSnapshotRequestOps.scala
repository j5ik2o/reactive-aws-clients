// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteSnapshotRequestBuilderOps(val self: DeleteSnapshotRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def snapshotIdAsScala(value: Option[String]): DeleteSnapshotRequest.Builder = {
            value.fold(self){ v => self.snapshotId(v) }
            } 


}

final class DeleteSnapshotRequestOps(val self: DeleteSnapshotRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def snapshotIdAsScala: Option[String] = Option(self.snapshotId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteSnapshotRequestOps {

implicit def toDeleteSnapshotRequestBuilderOps(v: DeleteSnapshotRequest.Builder): DeleteSnapshotRequestBuilderOps = new DeleteSnapshotRequestBuilderOps(v)

implicit def toDeleteSnapshotRequestOps(v: DeleteSnapshotRequest): DeleteSnapshotRequestOps = new DeleteSnapshotRequestOps(v)

}

