// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ExportTaskBuilderOps(val self: ExportTask.Builder) extends AnyVal {

  final def descriptionAsScala(value: Option[String]): ExportTask.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def exportTaskIdAsScala(value: Option[String]): ExportTask.Builder = {
    value.fold(self) { v =>
      self.exportTaskId(v)
    }
  }

  final def exportToS3TaskAsScala(value: Option[ExportToS3Task]): ExportTask.Builder = {
    value.fold(self) { v =>
      self.exportToS3Task(v)
    }
  }

  final def instanceExportDetailsAsScala(value: Option[InstanceExportDetails]): ExportTask.Builder = {
    value.fold(self) { v =>
      self.instanceExportDetails(v)
    }
  }

  final def stateAsScala(value: Option[ExportTaskState]): ExportTask.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def statusMessageAsScala(value: Option[String]): ExportTask.Builder = {
    value.fold(self) { v =>
      self.statusMessage(v)
    }
  }

}

final class ExportTaskOps(val self: ExportTask) extends AnyVal {

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def exportTaskIdAsScala: Option[String] = Option(self.exportTaskId)

  final def exportToS3TaskAsScala: Option[ExportToS3Task] = Option(self.exportToS3Task)

  final def instanceExportDetailsAsScala: Option[InstanceExportDetails] = Option(self.instanceExportDetails)

  final def stateAsScala: Option[ExportTaskState] = Option(self.state)

  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToExportTaskOps {

  implicit def toExportTaskBuilderOps(v: ExportTask.Builder): ExportTaskBuilderOps = new ExportTaskBuilderOps(v)

  implicit def toExportTaskOps(v: ExportTask): ExportTaskOps = new ExportTaskOps(v)

}
