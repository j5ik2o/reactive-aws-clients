// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class ExportTaskBuilderOps(val self: ExportTask.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskIdAsScala(value: Option[String]): ExportTask.Builder = {
    value.fold(self) { v => self.taskId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskNameAsScala(value: Option[String]): ExportTask.Builder = {
    value.fold(self) { v => self.taskName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala(value: Option[String]): ExportTask.Builder = {
    value.fold(self) { v => self.logGroupName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fromAsScala(value: Option[Long]): ExportTask.Builder = {
    value.fold(self) { v => self.from(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def toAsScala(value: Option[Long]): ExportTask.Builder = {
    value.fold(self) { v => self.to(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationAsScala(value: Option[String]): ExportTask.Builder = {
    value.fold(self) { v => self.destination(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationPrefixAsScala(value: Option[String]): ExportTask.Builder = {
    value.fold(self) { v => self.destinationPrefix(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[ExportTaskStatus]): ExportTask.Builder = {
    value.fold(self) { v => self.status(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def executionInfoAsScala(value: Option[ExportTaskExecutionInfo]): ExportTask.Builder = {
    value.fold(self) { v => self.executionInfo(v) }
  }

}

final class ExportTaskOps(val self: ExportTask) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskIdAsScala: Option[String] = Option(self.taskId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskNameAsScala: Option[String] = Option(self.taskName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fromAsScala: Option[Long] = Option(self.from)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def toAsScala: Option[Long] = Option(self.to)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationAsScala: Option[String] = Option(self.destination)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationPrefixAsScala: Option[String] = Option(self.destinationPrefix)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[ExportTaskStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def executionInfoAsScala: Option[ExportTaskExecutionInfo] = Option(self.executionInfo)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToExportTaskOps {

  implicit def toExportTaskBuilderOps(v: ExportTask.Builder): ExportTaskBuilderOps = new ExportTaskBuilderOps(v)

  implicit def toExportTaskOps(v: ExportTask): ExportTaskOps = new ExportTaskOps(v)

}
