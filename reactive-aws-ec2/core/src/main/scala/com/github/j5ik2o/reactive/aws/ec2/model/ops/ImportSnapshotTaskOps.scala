// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ImportSnapshotTaskBuilderOps(val self: ImportSnapshotTask.Builder) extends AnyVal {

  final def descriptionAsScala(value: Option[String]): ImportSnapshotTask.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def importTaskIdAsScala(value: Option[String]): ImportSnapshotTask.Builder = {
    value.fold(self) { v =>
      self.importTaskId(v)
    }
  }

  final def snapshotTaskDetailAsScala(value: Option[SnapshotTaskDetail]): ImportSnapshotTask.Builder = {
    value.fold(self) { v =>
      self.snapshotTaskDetail(v)
    }
  }

}

final class ImportSnapshotTaskOps(val self: ImportSnapshotTask) extends AnyVal {

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def importTaskIdAsScala: Option[String] = Option(self.importTaskId)

  final def snapshotTaskDetailAsScala: Option[SnapshotTaskDetail] = Option(self.snapshotTaskDetail)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImportSnapshotTaskOps {

  implicit def toImportSnapshotTaskBuilderOps(v: ImportSnapshotTask.Builder): ImportSnapshotTaskBuilderOps =
    new ImportSnapshotTaskBuilderOps(v)

  implicit def toImportSnapshotTaskOps(v: ImportSnapshotTask): ImportSnapshotTaskOps = new ImportSnapshotTaskOps(v)

}
