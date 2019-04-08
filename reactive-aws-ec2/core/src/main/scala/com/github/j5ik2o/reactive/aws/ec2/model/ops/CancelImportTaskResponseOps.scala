// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CancelImportTaskResponseBuilderOps(val self: CancelImportTaskResponse.Builder) extends AnyVal {

  final def importTaskIdAsScala(value: Option[String]): CancelImportTaskResponse.Builder = {
    value.fold(self) { v =>
      self.importTaskId(v)
    }
  }

  final def previousStateAsScala(value: Option[String]): CancelImportTaskResponse.Builder = {
    value.fold(self) { v =>
      self.previousState(v)
    }
  }

  final def stateAsScala(value: Option[String]): CancelImportTaskResponse.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

}

final class CancelImportTaskResponseOps(val self: CancelImportTaskResponse) extends AnyVal {

  final def importTaskIdAsScala: Option[String] = Option(self.importTaskId)

  final def previousStateAsScala: Option[String] = Option(self.previousState)

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
