// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class CreateExportTaskRequestBuilderOps(val self: CreateExportTaskRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskNameAsScala(value: Option[String]): CreateExportTaskRequest.Builder = {
    value.fold(self) { v => self.taskName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala(value: Option[String]): CreateExportTaskRequest.Builder = {
    value.fold(self) { v => self.logGroupName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logStreamNamePrefixAsScala(value: Option[String]): CreateExportTaskRequest.Builder = {
    value.fold(self) { v => self.logStreamNamePrefix(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fromAsScala(value: Option[Long]): CreateExportTaskRequest.Builder = {
    value.fold(self) { v => self.from(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def toAsScala(value: Option[Long]): CreateExportTaskRequest.Builder = {
    value.fold(self) { v => self.to(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationAsScala(value: Option[String]): CreateExportTaskRequest.Builder = {
    value.fold(self) { v => self.destination(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationPrefixAsScala(value: Option[String]): CreateExportTaskRequest.Builder = {
    value.fold(self) { v => self.destinationPrefix(v) }
  }

}

final class CreateExportTaskRequestOps(val self: CreateExportTaskRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskNameAsScala: Option[String] = Option(self.taskName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logStreamNamePrefixAsScala: Option[String] = Option(self.logStreamNamePrefix)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fromAsScala: Option[Long] = Option(self.from)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def toAsScala: Option[Long] = Option(self.to)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationAsScala: Option[String] = Option(self.destination)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationPrefixAsScala: Option[String] = Option(self.destinationPrefix)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateExportTaskRequestOps {

  implicit def toCreateExportTaskRequestBuilderOps(
      v: CreateExportTaskRequest.Builder
  ): CreateExportTaskRequestBuilderOps = new CreateExportTaskRequestBuilderOps(v)

  implicit def toCreateExportTaskRequestOps(v: CreateExportTaskRequest): CreateExportTaskRequestOps =
    new CreateExportTaskRequestOps(v)

}
