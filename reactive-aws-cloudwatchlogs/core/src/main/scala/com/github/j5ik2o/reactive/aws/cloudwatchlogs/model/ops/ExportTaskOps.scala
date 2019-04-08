// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class ExportTaskBuilderOps(val self: ExportTask.Builder) extends AnyVal {

  final def taskIdAsScala(value: Option[String]): ExportTask.Builder = {
    value.fold(self) { v =>
      self.taskId(v)
    }
  } // String

  final def taskNameAsScala(value: Option[String]): ExportTask.Builder = {
    value.fold(self) { v =>
      self.taskName(v)
    }
  } // String

  final def logGroupNameAsScala(value: Option[String]): ExportTask.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  } // String

  final def fromAsScala(value: Option[Long]): ExportTask.Builder = {
    value.fold(self) { v =>
      self.from(v)
    }
  } // Long

  final def toAsScala(value: Option[Long]): ExportTask.Builder = {
    value.fold(self) { v =>
      self.to(v)
    }
  } // Long

  final def destinationAsScala(value: Option[String]): ExportTask.Builder = {
    value.fold(self) { v =>
      self.destination(v)
    }
  } // String

  final def destinationPrefixAsScala(value: Option[String]): ExportTask.Builder = {
    value.fold(self) { v =>
      self.destinationPrefix(v)
    }
  } // String

  final def statusAsScala(value: Option[ExportTaskStatus]): ExportTask.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // ExportTaskStatus

  final def executionInfoAsScala(value: Option[ExportTaskExecutionInfo]): ExportTask.Builder = {
    value.fold(self) { v =>
      self.executionInfo(v)
    }
  } // ExportTaskExecutionInfo

}

final class ExportTaskOps(val self: ExportTask) extends AnyVal {

  final def taskIdAsScala: Option[String] = Option(self.taskId) // String

  final def taskNameAsScala: Option[String] = Option(self.taskName) // String

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName) // String

  final def fromAsScala: Option[Long] = Option(self.from) // Long

  final def toAsScala: Option[Long] = Option(self.to) // Long

  final def destinationAsScala: Option[String] = Option(self.destination) // String

  final def destinationPrefixAsScala: Option[String] = Option(self.destinationPrefix) // String

  final def statusAsScala: Option[ExportTaskStatus] = Option(self.status) // ExportTaskStatus

  final def executionInfoAsScala: Option[ExportTaskExecutionInfo] =
    Option(self.executionInfo) // ExportTaskExecutionInfo

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToExportTaskOps {

  implicit def toExportTaskBuilderOps(v: ExportTask.Builder): ExportTaskBuilderOps = new ExportTaskBuilderOps(v)

  implicit def toExportTaskOps(v: ExportTask): ExportTaskOps = new ExportTaskOps(v)

}
