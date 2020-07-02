// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DescribeExportTasksResponseBuilderOps(val self: DescribeExportTasksResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exportTasksAsScala(value: Option[Seq[ExportTask]]): DescribeExportTasksResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.exportTasks(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeExportTasksResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeExportTasksResponseOps(val self: DescribeExportTasksResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exportTasksAsScala: Option[Seq[ExportTask]] =
    Option(self.exportTasks).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeExportTasksResponseOps {

  implicit def toDescribeExportTasksResponseBuilderOps(
      v: DescribeExportTasksResponse.Builder
  ): DescribeExportTasksResponseBuilderOps = new DescribeExportTasksResponseBuilderOps(v)

  implicit def toDescribeExportTasksResponseOps(v: DescribeExportTasksResponse): DescribeExportTasksResponseOps =
    new DescribeExportTasksResponseOps(v)

}
