// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CopySnapshotResponseBuilderOps(val self: CopySnapshotResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotIdAsScala(value: Option[String]): CopySnapshotResponse.Builder = {
    value.fold(self) { v => self.snapshotId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): CopySnapshotResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class CopySnapshotResponseOps(val self: CopySnapshotResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotIdAsScala: Option[String] = Option(self.snapshotId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCopySnapshotResponseOps {

  implicit def toCopySnapshotResponseBuilderOps(v: CopySnapshotResponse.Builder): CopySnapshotResponseBuilderOps =
    new CopySnapshotResponseBuilderOps(v)

  implicit def toCopySnapshotResponseOps(v: CopySnapshotResponse): CopySnapshotResponseOps =
    new CopySnapshotResponseOps(v)

}
