// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class CreateExportTaskResponseBuilderOps(val self: CreateExportTaskResponse.Builder) extends AnyVal {

  final def taskIdAsScala(value: Option[String]): CreateExportTaskResponse.Builder = {
    value.fold(self) { v =>
      self.taskId(v)
    }
  }

}

final class CreateExportTaskResponseOps(val self: CreateExportTaskResponse) extends AnyVal {

  final def taskIdAsScala: Option[String] = Option(self.taskId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateExportTaskResponseOps {

  implicit def toCreateExportTaskResponseBuilderOps(
      v: CreateExportTaskResponse.Builder
  ): CreateExportTaskResponseBuilderOps = new CreateExportTaskResponseBuilderOps(v)

  implicit def toCreateExportTaskResponseOps(v: CreateExportTaskResponse): CreateExportTaskResponseOps =
    new CreateExportTaskResponseOps(v)

}
