// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class CreateLogStreamRequestBuilderOps(val self: CreateLogStreamRequest.Builder) extends AnyVal {

  final def logGroupNameAsScala(value: Option[String]): CreateLogStreamRequest.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  } // String

  final def logStreamNameAsScala(value: Option[String]): CreateLogStreamRequest.Builder = {
    value.fold(self) { v =>
      self.logStreamName(v)
    }
  } // String

}

final class CreateLogStreamRequestOps(val self: CreateLogStreamRequest) extends AnyVal {

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName) // String

  final def logStreamNameAsScala: Option[String] = Option(self.logStreamName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateLogStreamRequestOps {

  implicit def toCreateLogStreamRequestBuilderOps(v: CreateLogStreamRequest.Builder): CreateLogStreamRequestBuilderOps =
    new CreateLogStreamRequestBuilderOps(v)

  implicit def toCreateLogStreamRequestOps(v: CreateLogStreamRequest): CreateLogStreamRequestOps =
    new CreateLogStreamRequestOps(v)

}
