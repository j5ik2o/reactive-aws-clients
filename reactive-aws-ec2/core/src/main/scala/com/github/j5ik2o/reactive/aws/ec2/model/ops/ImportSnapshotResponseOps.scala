// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ImportSnapshotResponseBuilderOps(val self: ImportSnapshotResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): ImportSnapshotResponse.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def importTaskIdAsScala(value: Option[String]): ImportSnapshotResponse.Builder = {
    value.fold(self) { v => self.importTaskId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotTaskDetailAsScala(value: Option[SnapshotTaskDetail]): ImportSnapshotResponse.Builder = {
    value.fold(self) { v => self.snapshotTaskDetail(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): ImportSnapshotResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class ImportSnapshotResponseOps(val self: ImportSnapshotResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def importTaskIdAsScala: Option[String] = Option(self.importTaskId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotTaskDetailAsScala: Option[SnapshotTaskDetail] = Option(self.snapshotTaskDetail)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImportSnapshotResponseOps {

  implicit def toImportSnapshotResponseBuilderOps(v: ImportSnapshotResponse.Builder): ImportSnapshotResponseBuilderOps =
    new ImportSnapshotResponseBuilderOps(v)

  implicit def toImportSnapshotResponseOps(v: ImportSnapshotResponse): ImportSnapshotResponseOps =
    new ImportSnapshotResponseOps(v)

}
