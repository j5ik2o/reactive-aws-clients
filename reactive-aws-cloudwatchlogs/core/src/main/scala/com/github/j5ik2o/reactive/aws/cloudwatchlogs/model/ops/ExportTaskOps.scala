// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class ExportTaskBuilderOps(val self: ExportTask.Builder) extends AnyVal {

  final def taskIdAsScala(value: Option[String]): ExportTask.Builder = {
    value.fold(self) { v =>
      self.taskId(v)
    }
  }

  final def taskNameAsScala(value: Option[String]): ExportTask.Builder = {
    value.fold(self) { v =>
      self.taskName(v)
    }
  }

  final def logGroupNameAsScala(value: Option[String]): ExportTask.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  }

  final def fromAsScala(value: Option[Long]): ExportTask.Builder = {
    value.fold(self) { v =>
      self.from(v)
    }
  }

  final def toAsScala(value: Option[Long]): ExportTask.Builder = {
    value.fold(self) { v =>
      self.to(v)
    }
  }

  final def destinationAsScala(value: Option[String]): ExportTask.Builder = {
    value.fold(self) { v =>
      self.destination(v)
    }
  }

  final def destinationPrefixAsScala(value: Option[String]): ExportTask.Builder = {
    value.fold(self) { v =>
      self.destinationPrefix(v)
    }
  }

  final def statusAsScala(value: Option[ExportTaskStatus]): ExportTask.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def executionInfoAsScala(value: Option[ExportTaskExecutionInfo]): ExportTask.Builder = {
    value.fold(self) { v =>
      self.executionInfo(v)
    }
  }

}

final class ExportTaskOps(val self: ExportTask) extends AnyVal {

  final def taskIdAsScala: Option[String] = Option(self.taskId)

  final def taskNameAsScala: Option[String] = Option(self.taskName)

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  final def fromAsScala: Option[Long] = Option(self.from)

  final def toAsScala: Option[Long] = Option(self.to)

  final def destinationAsScala: Option[String] = Option(self.destination)

  final def destinationPrefixAsScala: Option[String] = Option(self.destinationPrefix)

  final def statusAsScala: Option[ExportTaskStatus] = Option(self.status)

  final def executionInfoAsScala: Option[ExportTaskExecutionInfo] = Option(self.executionInfo)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToExportTaskOps {

  implicit def toExportTaskBuilderOps(v: ExportTask.Builder): ExportTaskBuilderOps = new ExportTaskBuilderOps(v)

  implicit def toExportTaskOps(v: ExportTask): ExportTaskOps = new ExportTaskOps(v)

}
