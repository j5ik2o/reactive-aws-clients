// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeImportSnapshotTasksResponseBuilderOps(val self: DescribeImportSnapshotTasksResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def importSnapshotTasksAsScala(
      value: Option[Seq[ImportSnapshotTask]]
  ): DescribeImportSnapshotTasksResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.importSnapshotTasks(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeImportSnapshotTasksResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeImportSnapshotTasksResponseOps(val self: DescribeImportSnapshotTasksResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def importSnapshotTasksAsScala: Option[Seq[ImportSnapshotTask]] = Option(self.importSnapshotTasks).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeImportSnapshotTasksResponseOps {

  implicit def toDescribeImportSnapshotTasksResponseBuilderOps(
      v: DescribeImportSnapshotTasksResponse.Builder
  ): DescribeImportSnapshotTasksResponseBuilderOps = new DescribeImportSnapshotTasksResponseBuilderOps(v)

  implicit def toDescribeImportSnapshotTasksResponseOps(
      v: DescribeImportSnapshotTasksResponse
  ): DescribeImportSnapshotTasksResponseOps = new DescribeImportSnapshotTasksResponseOps(v)

}
