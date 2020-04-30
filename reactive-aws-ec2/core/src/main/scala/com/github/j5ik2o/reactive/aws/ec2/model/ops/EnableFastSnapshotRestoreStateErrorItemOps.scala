// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class EnableFastSnapshotRestoreStateErrorItemBuilderOps(val self: EnableFastSnapshotRestoreStateErrorItem.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def availabilityZoneAsScala(value: Option[String]): EnableFastSnapshotRestoreStateErrorItem.Builder = {
            value.fold(self){ v => self.availabilityZone(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def errorAsScala(value: Option[EnableFastSnapshotRestoreStateError]): EnableFastSnapshotRestoreStateErrorItem.Builder = {
            value.fold(self){ v => self.error(v) }
            } 


}

final class EnableFastSnapshotRestoreStateErrorItemOps(val self: EnableFastSnapshotRestoreStateErrorItem) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def errorAsScala: Option[EnableFastSnapshotRestoreStateError] = Option(self.error) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnableFastSnapshotRestoreStateErrorItemOps {

implicit def toEnableFastSnapshotRestoreStateErrorItemBuilderOps(v: EnableFastSnapshotRestoreStateErrorItem.Builder): EnableFastSnapshotRestoreStateErrorItemBuilderOps = new EnableFastSnapshotRestoreStateErrorItemBuilderOps(v)

implicit def toEnableFastSnapshotRestoreStateErrorItemOps(v: EnableFastSnapshotRestoreStateErrorItem): EnableFastSnapshotRestoreStateErrorItemOps = new EnableFastSnapshotRestoreStateErrorItemOps(v)

}

