// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class ExportTaskExecutionInfoBuilderOps(val self: ExportTaskExecutionInfo.Builder) extends AnyVal {

  final def creationTimeAsScala(value: Option[Long]): ExportTaskExecutionInfo.Builder = {
    value.fold(self) { v =>
      self.creationTime(v)
    }
  } // Long

  final def completionTimeAsScala(value: Option[Long]): ExportTaskExecutionInfo.Builder = {
    value.fold(self) { v =>
      self.completionTime(v)
    }
  } // Long

}

final class ExportTaskExecutionInfoOps(val self: ExportTaskExecutionInfo) extends AnyVal {

  final def creationTimeAsScala: Option[Long] = Option(self.creationTime) // Long

  final def completionTimeAsScala: Option[Long] = Option(self.completionTime) // Long

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToExportTaskExecutionInfoOps {

  implicit def toExportTaskExecutionInfoBuilderOps(
      v: ExportTaskExecutionInfo.Builder
  ): ExportTaskExecutionInfoBuilderOps = new ExportTaskExecutionInfoBuilderOps(v)

  implicit def toExportTaskExecutionInfoOps(v: ExportTaskExecutionInfo): ExportTaskExecutionInfoOps =
    new ExportTaskExecutionInfoOps(v)

}
