// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class CancelExportTaskRequestBuilderOps(val self: CancelExportTaskRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskIdAsScala(value: Option[String]): CancelExportTaskRequest.Builder = {
    value.fold(self) { v =>
      self.taskId(v)
    }
  }

}

final class CancelExportTaskRequestOps(val self: CancelExportTaskRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskIdAsScala: Option[String] = Option(self.taskId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCancelExportTaskRequestOps {

  implicit def toCancelExportTaskRequestBuilderOps(
      v: CancelExportTaskRequest.Builder
  ): CancelExportTaskRequestBuilderOps = new CancelExportTaskRequestBuilderOps(v)

  implicit def toCancelExportTaskRequestOps(v: CancelExportTaskRequest): CancelExportTaskRequestOps =
    new CancelExportTaskRequestOps(v)

}
