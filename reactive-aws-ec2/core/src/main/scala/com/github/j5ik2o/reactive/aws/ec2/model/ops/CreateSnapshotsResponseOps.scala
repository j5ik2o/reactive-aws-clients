// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateSnapshotsResponseBuilderOps(val self: CreateSnapshotsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotsAsScala(value: Option[Seq[SnapshotInfo]]): CreateSnapshotsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.snapshots(v.asJava)
    }
  }

}

final class CreateSnapshotsResponseOps(val self: CreateSnapshotsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotsAsScala: Option[Seq[SnapshotInfo]] =
    Option(self.snapshots).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateSnapshotsResponseOps {

  implicit def toCreateSnapshotsResponseBuilderOps(
      v: CreateSnapshotsResponse.Builder
  ): CreateSnapshotsResponseBuilderOps = new CreateSnapshotsResponseBuilderOps(v)

  implicit def toCreateSnapshotsResponseOps(v: CreateSnapshotsResponse): CreateSnapshotsResponseOps =
    new CreateSnapshotsResponseOps(v)

}
