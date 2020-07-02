// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class CreateLogStreamRequestBuilderOps(val self: CreateLogStreamRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala(value: Option[String]): CreateLogStreamRequest.Builder = {
    value.fold(self) { v => self.logGroupName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logStreamNameAsScala(value: Option[String]): CreateLogStreamRequest.Builder = {
    value.fold(self) { v => self.logStreamName(v) }
  }

}

final class CreateLogStreamRequestOps(val self: CreateLogStreamRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logStreamNameAsScala: Option[String] = Option(self.logStreamName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateLogStreamRequestOps {

  implicit def toCreateLogStreamRequestBuilderOps(v: CreateLogStreamRequest.Builder): CreateLogStreamRequestBuilderOps =
    new CreateLogStreamRequestBuilderOps(v)

  implicit def toCreateLogStreamRequestOps(v: CreateLogStreamRequest): CreateLogStreamRequestOps =
    new CreateLogStreamRequestOps(v)

}
