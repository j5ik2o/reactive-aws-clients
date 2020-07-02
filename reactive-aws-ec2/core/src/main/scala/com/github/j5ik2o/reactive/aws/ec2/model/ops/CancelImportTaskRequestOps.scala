// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CancelImportTaskRequestBuilderOps(val self: CancelImportTaskRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cancelReasonAsScala(value: Option[String]): CancelImportTaskRequest.Builder = {
    value.fold(self) { v => self.cancelReason(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def importTaskIdAsScala(value: Option[String]): CancelImportTaskRequest.Builder = {
    value.fold(self) { v => self.importTaskId(v) }
  }

}

final class CancelImportTaskRequestOps(val self: CancelImportTaskRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cancelReasonAsScala: Option[String] = Option(self.cancelReason)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def importTaskIdAsScala: Option[String] = Option(self.importTaskId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCancelImportTaskRequestOps {

  implicit def toCancelImportTaskRequestBuilderOps(
      v: CancelImportTaskRequest.Builder
  ): CancelImportTaskRequestBuilderOps = new CancelImportTaskRequestBuilderOps(v)

  implicit def toCancelImportTaskRequestOps(v: CancelImportTaskRequest): CancelImportTaskRequestOps =
    new CancelImportTaskRequestOps(v)

}
