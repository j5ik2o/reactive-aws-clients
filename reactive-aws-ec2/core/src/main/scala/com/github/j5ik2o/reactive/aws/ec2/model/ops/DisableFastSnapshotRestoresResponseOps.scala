// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DisableFastSnapshotRestoresResponseBuilderOps(val self: DisableFastSnapshotRestoresResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def successfulAsScala(
      value: Option[Seq[DisableFastSnapshotRestoreSuccessItem]]
  ): DisableFastSnapshotRestoresResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.successful(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unsuccessfulAsScala(
      value: Option[Seq[DisableFastSnapshotRestoreErrorItem]]
  ): DisableFastSnapshotRestoresResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.unsuccessful(v.asJava)
    }
  }

}

final class DisableFastSnapshotRestoresResponseOps(val self: DisableFastSnapshotRestoresResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def successfulAsScala: Option[Seq[DisableFastSnapshotRestoreSuccessItem]] =
    Option(self.successful).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unsuccessfulAsScala: Option[Seq[DisableFastSnapshotRestoreErrorItem]] =
    Option(self.unsuccessful).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisableFastSnapshotRestoresResponseOps {

  implicit def toDisableFastSnapshotRestoresResponseBuilderOps(
      v: DisableFastSnapshotRestoresResponse.Builder
  ): DisableFastSnapshotRestoresResponseBuilderOps = new DisableFastSnapshotRestoresResponseBuilderOps(v)

  implicit def toDisableFastSnapshotRestoresResponseOps(
      v: DisableFastSnapshotRestoresResponse
  ): DisableFastSnapshotRestoresResponseOps = new DisableFastSnapshotRestoresResponseOps(v)

}
