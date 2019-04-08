// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateInstanceExportTaskRequestBuilderOps(val self: CreateInstanceExportTaskRequest.Builder)
    extends AnyVal {

  final def descriptionAsScala(value: Option[String]): CreateInstanceExportTaskRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def exportToS3TaskAsScala(
      value: Option[ExportToS3TaskSpecification]
  ): CreateInstanceExportTaskRequest.Builder = {
    value.fold(self) { v =>
      self.exportToS3Task(v)
    }
  }

  final def instanceIdAsScala(value: Option[String]): CreateInstanceExportTaskRequest.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  final def targetEnvironmentAsScala(value: Option[ExportEnvironment]): CreateInstanceExportTaskRequest.Builder = {
    value.fold(self) { v =>
      self.targetEnvironment(v)
    }
  }

}

final class CreateInstanceExportTaskRequestOps(val self: CreateInstanceExportTaskRequest) extends AnyVal {

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def exportToS3TaskAsScala: Option[ExportToS3TaskSpecification] = Option(self.exportToS3Task)

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  final def targetEnvironmentAsScala: Option[ExportEnvironment] = Option(self.targetEnvironment)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateInstanceExportTaskRequestOps {

  implicit def toCreateInstanceExportTaskRequestBuilderOps(
      v: CreateInstanceExportTaskRequest.Builder
  ): CreateInstanceExportTaskRequestBuilderOps = new CreateInstanceExportTaskRequestBuilderOps(v)

  implicit def toCreateInstanceExportTaskRequestOps(
      v: CreateInstanceExportTaskRequest
  ): CreateInstanceExportTaskRequestOps = new CreateInstanceExportTaskRequestOps(v)

}
