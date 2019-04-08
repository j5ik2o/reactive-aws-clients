// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CancelExportTaskRequestBuilderOps(val self: CancelExportTaskRequest.Builder) extends AnyVal {

  final def exportTaskIdAsScala(value: Option[String]): CancelExportTaskRequest.Builder = {
    value.fold(self) { v =>
      self.exportTaskId(v)
    }
  }

}

final class CancelExportTaskRequestOps(val self: CancelExportTaskRequest) extends AnyVal {

  final def exportTaskIdAsScala: Option[String] = Option(self.exportTaskId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCancelExportTaskRequestOps {

  implicit def toCancelExportTaskRequestBuilderOps(
      v: CancelExportTaskRequest.Builder
  ): CancelExportTaskRequestBuilderOps = new CancelExportTaskRequestBuilderOps(v)

  implicit def toCancelExportTaskRequestOps(v: CancelExportTaskRequest): CancelExportTaskRequestOps =
    new CancelExportTaskRequestOps(v)

}
