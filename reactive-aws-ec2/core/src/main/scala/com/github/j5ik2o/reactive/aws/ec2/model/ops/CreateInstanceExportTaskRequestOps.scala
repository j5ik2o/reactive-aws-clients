// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateInstanceExportTaskRequestBuilderOps(val self: CreateInstanceExportTaskRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): CreateInstanceExportTaskRequest.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exportToS3TaskAsScala(
      value: Option[ExportToS3TaskSpecification]
  ): CreateInstanceExportTaskRequest.Builder = {
    value.fold(self) { v => self.exportToS3Task(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala(value: Option[String]): CreateInstanceExportTaskRequest.Builder = {
    value.fold(self) { v => self.instanceId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetEnvironmentAsScala(value: Option[ExportEnvironment]): CreateInstanceExportTaskRequest.Builder = {
    value.fold(self) { v => self.targetEnvironment(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): CreateInstanceExportTaskRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSpecifications(v.asJava)
    }
  }

}

final class CreateInstanceExportTaskRequestOps(val self: CreateInstanceExportTaskRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exportToS3TaskAsScala: Option[ExportToS3TaskSpecification] = Option(self.exportToS3Task)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetEnvironmentAsScala: Option[ExportEnvironment] = Option(self.targetEnvironment)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] =
    Option(self.tagSpecifications).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

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
