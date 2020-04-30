// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class EnableFastSnapshotRestoreErrorItemBuilderOps(val self: EnableFastSnapshotRestoreErrorItem.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def snapshotIdAsScala(value: Option[String]): EnableFastSnapshotRestoreErrorItem.Builder = {
            value.fold(self){ v => self.snapshotId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def fastSnapshotRestoreStateErrorsAsScala(value: Option[Seq[EnableFastSnapshotRestoreStateErrorItem]]): EnableFastSnapshotRestoreErrorItem.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.fastSnapshotRestoreStateErrors(v.asJava) } 
            }


}

final class EnableFastSnapshotRestoreErrorItemOps(val self: EnableFastSnapshotRestoreErrorItem) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def snapshotIdAsScala: Option[String] = Option(self.snapshotId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def fastSnapshotRestoreStateErrorsAsScala: Option[Seq[EnableFastSnapshotRestoreStateErrorItem]] = Option(self.fastSnapshotRestoreStateErrors).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnableFastSnapshotRestoreErrorItemOps {

implicit def toEnableFastSnapshotRestoreErrorItemBuilderOps(v: EnableFastSnapshotRestoreErrorItem.Builder): EnableFastSnapshotRestoreErrorItemBuilderOps = new EnableFastSnapshotRestoreErrorItemBuilderOps(v)

implicit def toEnableFastSnapshotRestoreErrorItemOps(v: EnableFastSnapshotRestoreErrorItem): EnableFastSnapshotRestoreErrorItemOps = new EnableFastSnapshotRestoreErrorItemOps(v)

}

