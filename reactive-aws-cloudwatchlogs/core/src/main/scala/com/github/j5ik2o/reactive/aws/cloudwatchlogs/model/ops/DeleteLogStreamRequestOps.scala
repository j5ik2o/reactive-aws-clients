// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DeleteLogStreamRequestBuilderOps(val self: DeleteLogStreamRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala(value: Option[String]): DeleteLogStreamRequest.Builder = {
    value.fold(self) { v => self.logGroupName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logStreamNameAsScala(value: Option[String]): DeleteLogStreamRequest.Builder = {
    value.fold(self) { v => self.logStreamName(v) }
  }

}

final class DeleteLogStreamRequestOps(val self: DeleteLogStreamRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logStreamNameAsScala: Option[String] = Option(self.logStreamName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteLogStreamRequestOps {

  implicit def toDeleteLogStreamRequestBuilderOps(v: DeleteLogStreamRequest.Builder): DeleteLogStreamRequestBuilderOps =
    new DeleteLogStreamRequestBuilderOps(v)

  implicit def toDeleteLogStreamRequestOps(v: DeleteLogStreamRequest): DeleteLogStreamRequestOps =
    new DeleteLogStreamRequestOps(v)

}
