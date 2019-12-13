// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class EnableFastSnapshotRestoreStateErrorBuilderOps(val self: EnableFastSnapshotRestoreStateError.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeAsScala(value: Option[String]): EnableFastSnapshotRestoreStateError.Builder = {
    value.fold(self) { v =>
      self.code(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala(value: Option[String]): EnableFastSnapshotRestoreStateError.Builder = {
    value.fold(self) { v =>
      self.message(v)
    }
  }

}

final class EnableFastSnapshotRestoreStateErrorOps(val self: EnableFastSnapshotRestoreStateError) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeAsScala: Option[String] = Option(self.code)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala: Option[String] = Option(self.message)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnableFastSnapshotRestoreStateErrorOps {

  implicit def toEnableFastSnapshotRestoreStateErrorBuilderOps(
      v: EnableFastSnapshotRestoreStateError.Builder
  ): EnableFastSnapshotRestoreStateErrorBuilderOps = new EnableFastSnapshotRestoreStateErrorBuilderOps(v)

  implicit def toEnableFastSnapshotRestoreStateErrorOps(
      v: EnableFastSnapshotRestoreStateError
  ): EnableFastSnapshotRestoreStateErrorOps = new EnableFastSnapshotRestoreStateErrorOps(v)

}
