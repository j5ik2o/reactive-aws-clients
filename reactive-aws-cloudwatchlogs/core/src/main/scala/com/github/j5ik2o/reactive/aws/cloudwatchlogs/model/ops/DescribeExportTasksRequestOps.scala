// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DescribeExportTasksRequestBuilderOps(val self: DescribeExportTasksRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskIdAsScala(value: Option[String]): DescribeExportTasksRequest.Builder = {
    value.fold(self) { v => self.taskId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusCodeAsScala(value: Option[ExportTaskStatusCode]): DescribeExportTasksRequest.Builder = {
    value.fold(self) { v => self.statusCode(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeExportTasksRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitAsScala(value: Option[Int]): DescribeExportTasksRequest.Builder = {
    value.fold(self) { v => self.limit(v) }
  }

}

final class DescribeExportTasksRequestOps(val self: DescribeExportTasksRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskIdAsScala: Option[String] = Option(self.taskId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusCodeAsScala: Option[ExportTaskStatusCode] = Option(self.statusCode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitAsScala: Option[Int] = Option(self.limit)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeExportTasksRequestOps {

  implicit def toDescribeExportTasksRequestBuilderOps(
      v: DescribeExportTasksRequest.Builder
  ): DescribeExportTasksRequestBuilderOps = new DescribeExportTasksRequestBuilderOps(v)

  implicit def toDescribeExportTasksRequestOps(v: DescribeExportTasksRequest): DescribeExportTasksRequestOps =
    new DescribeExportTasksRequestOps(v)

}
