// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DisableFastSnapshotRestoreStateErrorItemBuilderOps(val self: DisableFastSnapshotRestoreStateErrorItem.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def availabilityZoneAsScala(value: Option[String]): DisableFastSnapshotRestoreStateErrorItem.Builder = {
            value.fold(self){ v => self.availabilityZone(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def errorAsScala(value: Option[DisableFastSnapshotRestoreStateError]): DisableFastSnapshotRestoreStateErrorItem.Builder = {
            value.fold(self){ v => self.error(v) }
            } 


}

final class DisableFastSnapshotRestoreStateErrorItemOps(val self: DisableFastSnapshotRestoreStateErrorItem) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def errorAsScala: Option[DisableFastSnapshotRestoreStateError] = Option(self.error) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisableFastSnapshotRestoreStateErrorItemOps {

implicit def toDisableFastSnapshotRestoreStateErrorItemBuilderOps(v: DisableFastSnapshotRestoreStateErrorItem.Builder): DisableFastSnapshotRestoreStateErrorItemBuilderOps = new DisableFastSnapshotRestoreStateErrorItemBuilderOps(v)

implicit def toDisableFastSnapshotRestoreStateErrorItemOps(v: DisableFastSnapshotRestoreStateErrorItem): DisableFastSnapshotRestoreStateErrorItemOps = new DisableFastSnapshotRestoreStateErrorItemOps(v)

}

