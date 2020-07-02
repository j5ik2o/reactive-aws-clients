// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DisableFastSnapshotRestoreErrorItemBuilderOps(val self: DisableFastSnapshotRestoreErrorItem.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotIdAsScala(value: Option[String]): DisableFastSnapshotRestoreErrorItem.Builder = {
    value.fold(self) { v => self.snapshotId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fastSnapshotRestoreStateErrorsAsScala(
      value: Option[Seq[DisableFastSnapshotRestoreStateErrorItem]]
  ): DisableFastSnapshotRestoreErrorItem.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.fastSnapshotRestoreStateErrors(v.asJava)
    }
  }

}

final class DisableFastSnapshotRestoreErrorItemOps(val self: DisableFastSnapshotRestoreErrorItem) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotIdAsScala: Option[String] = Option(self.snapshotId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fastSnapshotRestoreStateErrorsAsScala: Option[Seq[DisableFastSnapshotRestoreStateErrorItem]] =
    Option(self.fastSnapshotRestoreStateErrors).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisableFastSnapshotRestoreErrorItemOps {

  implicit def toDisableFastSnapshotRestoreErrorItemBuilderOps(
      v: DisableFastSnapshotRestoreErrorItem.Builder
  ): DisableFastSnapshotRestoreErrorItemBuilderOps = new DisableFastSnapshotRestoreErrorItemBuilderOps(v)

  implicit def toDisableFastSnapshotRestoreErrorItemOps(
      v: DisableFastSnapshotRestoreErrorItem
  ): DisableFastSnapshotRestoreErrorItemOps = new DisableFastSnapshotRestoreErrorItemOps(v)

}
