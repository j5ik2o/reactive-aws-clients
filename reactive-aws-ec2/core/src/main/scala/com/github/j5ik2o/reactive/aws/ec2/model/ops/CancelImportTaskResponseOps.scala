// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CancelImportTaskResponseBuilderOps(val self: CancelImportTaskResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def importTaskIdAsScala(value: Option[String]): CancelImportTaskResponse.Builder = {
    value.fold(self) { v => self.importTaskId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def previousStateAsScala(value: Option[String]): CancelImportTaskResponse.Builder = {
    value.fold(self) { v => self.previousState(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[String]): CancelImportTaskResponse.Builder = {
    value.fold(self) { v => self.state(v) }
  }

}

final class CancelImportTaskResponseOps(val self: CancelImportTaskResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def importTaskIdAsScala: Option[String] = Option(self.importTaskId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def previousStateAsScala: Option[String] = Option(self.previousState)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[String] = Option(self.state)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCancelImportTaskResponseOps {

  implicit def toCancelImportTaskResponseBuilderOps(
      v: CancelImportTaskResponse.Builder
  ): CancelImportTaskResponseBuilderOps = new CancelImportTaskResponseBuilderOps(v)

  implicit def toCancelImportTaskResponseOps(v: CancelImportTaskResponse): CancelImportTaskResponseOps =
    new CancelImportTaskResponseOps(v)

}
