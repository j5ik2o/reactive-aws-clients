// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class CancelExportTaskResponseBuilderOps(val self: CancelExportTaskResponse.Builder) extends AnyVal {}

final class CancelExportTaskResponseOps(val self: CancelExportTaskResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCancelExportTaskResponseOps {

  implicit def toCancelExportTaskResponseBuilderOps(
      v: CancelExportTaskResponse.Builder
  ): CancelExportTaskResponseBuilderOps = new CancelExportTaskResponseBuilderOps(v)

  implicit def toCancelExportTaskResponseOps(v: CancelExportTaskResponse): CancelExportTaskResponseOps =
    new CancelExportTaskResponseOps(v)

}
