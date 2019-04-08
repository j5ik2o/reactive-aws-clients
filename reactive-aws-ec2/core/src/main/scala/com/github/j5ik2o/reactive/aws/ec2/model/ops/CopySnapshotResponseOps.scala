// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CopySnapshotResponseBuilderOps(val self: CopySnapshotResponse.Builder) extends AnyVal {

  final def snapshotIdAsScala(value: Option[String]): CopySnapshotResponse.Builder = {
    value.fold(self) { v =>
      self.snapshotId(v)
    }
  }

}

final class CopySnapshotResponseOps(val self: CopySnapshotResponse) extends AnyVal {

  final def snapshotIdAsScala: Option[String] = Option(self.snapshotId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCopySnapshotResponseOps {

  implicit def toCopySnapshotResponseBuilderOps(v: CopySnapshotResponse.Builder): CopySnapshotResponseBuilderOps =
    new CopySnapshotResponseBuilderOps(v)

  implicit def toCopySnapshotResponseOps(v: CopySnapshotResponse): CopySnapshotResponseOps =
    new CopySnapshotResponseOps(v)

}
