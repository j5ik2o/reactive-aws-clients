// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class CreateExportTaskRequestBuilderOps(val self: CreateExportTaskRequest.Builder) extends AnyVal {

  final def taskNameAsScala(value: Option[String]): CreateExportTaskRequest.Builder = {
    value.fold(self) { v =>
      self.taskName(v)
    }
  } // String

  final def logGroupNameAsScala(value: Option[String]): CreateExportTaskRequest.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  } // String

  final def logStreamNamePrefixAsScala(value: Option[String]): CreateExportTaskRequest.Builder = {
    value.fold(self) { v =>
      self.logStreamNamePrefix(v)
    }
  } // String

  final def fromAsScala(value: Option[Long]): CreateExportTaskRequest.Builder = {
    value.fold(self) { v =>
      self.from(v)
    }
  } // Long

  final def toAsScala(value: Option[Long]): CreateExportTaskRequest.Builder = {
    value.fold(self) { v =>
      self.to(v)
    }
  } // Long

  final def destinationAsScala(value: Option[String]): CreateExportTaskRequest.Builder = {
    value.fold(self) { v =>
      self.destination(v)
    }
  } // String

  final def destinationPrefixAsScala(value: Option[String]): CreateExportTaskRequest.Builder = {
    value.fold(self) { v =>
      self.destinationPrefix(v)
    }
  } // String

}

final class CreateExportTaskRequestOps(val self: CreateExportTaskRequest) extends AnyVal {

  final def taskNameAsScala: Option[String] = Option(self.taskName) // String

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName) // String

  final def logStreamNamePrefixAsScala: Option[String] = Option(self.logStreamNamePrefix) // String

  final def fromAsScala: Option[Long] = Option(self.from) // Long

  final def toAsScala: Option[Long] = Option(self.to) // Long

  final def destinationAsScala: Option[String] = Option(self.destination) // String

  final def destinationPrefixAsScala: Option[String] = Option(self.destinationPrefix) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateExportTaskRequestOps {

  implicit def toCreateExportTaskRequestBuilderOps(
      v: CreateExportTaskRequest.Builder
  ): CreateExportTaskRequestBuilderOps = new CreateExportTaskRequestBuilderOps(v)

  implicit def toCreateExportTaskRequestOps(v: CreateExportTaskRequest): CreateExportTaskRequestOps =
    new CreateExportTaskRequestOps(v)

}
