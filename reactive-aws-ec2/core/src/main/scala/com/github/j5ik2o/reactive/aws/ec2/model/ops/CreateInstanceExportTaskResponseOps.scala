// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateInstanceExportTaskResponseBuilderOps(val self: CreateInstanceExportTaskResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exportTaskAsScala(value: Option[ExportTask]): CreateInstanceExportTaskResponse.Builder = {
    value.fold(self) { v =>
      self.exportTask(v)
    }
  }

}

final class CreateInstanceExportTaskResponseOps(val self: CreateInstanceExportTaskResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exportTaskAsScala: Option[ExportTask] = Option(self.exportTask)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateInstanceExportTaskResponseOps {

  implicit def toCreateInstanceExportTaskResponseBuilderOps(
      v: CreateInstanceExportTaskResponse.Builder
  ): CreateInstanceExportTaskResponseBuilderOps = new CreateInstanceExportTaskResponseBuilderOps(v)

  implicit def toCreateInstanceExportTaskResponseOps(
      v: CreateInstanceExportTaskResponse
  ): CreateInstanceExportTaskResponseOps = new CreateInstanceExportTaskResponseOps(v)

}
