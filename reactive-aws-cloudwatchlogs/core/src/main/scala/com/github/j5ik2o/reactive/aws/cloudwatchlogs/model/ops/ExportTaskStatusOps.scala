// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class ExportTaskStatusBuilderOps(val self: ExportTaskStatus.Builder) extends AnyVal {

  final def codeAsScala(value: Option[ExportTaskStatusCode]): ExportTaskStatus.Builder = {
    value.fold(self) { v =>
      self.code(v)
    }
  } // ExportTaskStatusCode

  final def messageAsScala(value: Option[String]): ExportTaskStatus.Builder = {
    value.fold(self) { v =>
      self.message(v)
    }
  } // String

}

final class ExportTaskStatusOps(val self: ExportTaskStatus) extends AnyVal {

  final def codeAsScala: Option[ExportTaskStatusCode] = Option(self.code) // ExportTaskStatusCode

  final def messageAsScala: Option[String] = Option(self.message) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToExportTaskStatusOps {

  implicit def toExportTaskStatusBuilderOps(v: ExportTaskStatus.Builder): ExportTaskStatusBuilderOps =
    new ExportTaskStatusBuilderOps(v)

  implicit def toExportTaskStatusOps(v: ExportTaskStatus): ExportTaskStatusOps = new ExportTaskStatusOps(v)

}
