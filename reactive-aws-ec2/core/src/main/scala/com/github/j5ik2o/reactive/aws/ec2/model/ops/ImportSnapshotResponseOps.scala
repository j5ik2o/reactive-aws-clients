// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ImportSnapshotResponseBuilderOps(val self: ImportSnapshotResponse.Builder) extends AnyVal {

  final def descriptionAsScala(value: Option[String]): ImportSnapshotResponse.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def importTaskIdAsScala(value: Option[String]): ImportSnapshotResponse.Builder = {
    value.fold(self) { v =>
      self.importTaskId(v)
    }
  }

  final def snapshotTaskDetailAsScala(value: Option[SnapshotTaskDetail]): ImportSnapshotResponse.Builder = {
    value.fold(self) { v =>
      self.snapshotTaskDetail(v)
    }
  }

}

final class ImportSnapshotResponseOps(val self: ImportSnapshotResponse) extends AnyVal {

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def importTaskIdAsScala: Option[String] = Option(self.importTaskId)

  final def snapshotTaskDetailAsScala: Option[SnapshotTaskDetail] = Option(self.snapshotTaskDetail)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImportSnapshotResponseOps {

  implicit def toImportSnapshotResponseBuilderOps(v: ImportSnapshotResponse.Builder): ImportSnapshotResponseBuilderOps =
    new ImportSnapshotResponseBuilderOps(v)

  implicit def toImportSnapshotResponseOps(v: ImportSnapshotResponse): ImportSnapshotResponseOps =
    new ImportSnapshotResponseOps(v)

}
