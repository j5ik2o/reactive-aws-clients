// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeImportSnapshotTasksResponseBuilderOps(val self: DescribeImportSnapshotTasksResponse.Builder)
    extends AnyVal {

  final def importSnapshotTasksAsScala(
      value: Option[Seq[ImportSnapshotTask]]
  ): DescribeImportSnapshotTasksResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.importSnapshotTasks(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeImportSnapshotTasksResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeImportSnapshotTasksResponseOps(val self: DescribeImportSnapshotTasksResponse) extends AnyVal {

  final def importSnapshotTasksAsScala: Option[Seq[ImportSnapshotTask]] = Option(self.importSnapshotTasks).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

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
