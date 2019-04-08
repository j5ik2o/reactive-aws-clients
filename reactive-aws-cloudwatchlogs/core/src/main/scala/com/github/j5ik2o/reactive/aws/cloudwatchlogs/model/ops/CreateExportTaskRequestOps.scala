// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class CreateExportTaskRequestBuilderOps(val self: CreateExportTaskRequest.Builder) extends AnyVal {

  final def taskNameAsScala(value: Option[String]): CreateExportTaskRequest.Builder = {
    value.fold(self) { v =>
      self.taskName(v)
    }
  }

  final def logGroupNameAsScala(value: Option[String]): CreateExportTaskRequest.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  }

  final def logStreamNamePrefixAsScala(value: Option[String]): CreateExportTaskRequest.Builder = {
    value.fold(self) { v =>
      self.logStreamNamePrefix(v)
    }
  }

  final def fromAsScala(value: Option[Long]): CreateExportTaskRequest.Builder = {
    value.fold(self) { v =>
      self.from(v)
    }
  }

  final def toAsScala(value: Option[Long]): CreateExportTaskRequest.Builder = {
    value.fold(self) { v =>
      self.to(v)
    }
  }

  final def destinationAsScala(value: Option[String]): CreateExportTaskRequest.Builder = {
    value.fold(self) { v =>
      self.destination(v)
    }
  }

  final def destinationPrefixAsScala(value: Option[String]): CreateExportTaskRequest.Builder = {
    value.fold(self) { v =>
      self.destinationPrefix(v)
    }
  }

}

final class CreateExportTaskRequestOps(val self: CreateExportTaskRequest) extends AnyVal {

  final def taskNameAsScala: Option[String] = Option(self.taskName)

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  final def logStreamNamePrefixAsScala: Option[String] = Option(self.logStreamNamePrefix)

  final def fromAsScala: Option[Long] = Option(self.from)

  final def toAsScala: Option[Long] = Option(self.to)

  final def destinationAsScala: Option[String] = Option(self.destination)

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
