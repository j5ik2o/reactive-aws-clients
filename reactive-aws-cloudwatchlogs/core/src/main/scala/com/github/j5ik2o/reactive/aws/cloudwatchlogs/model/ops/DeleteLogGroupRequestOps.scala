// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DeleteLogGroupRequestBuilderOps(val self: DeleteLogGroupRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala(value: Option[String]): DeleteLogGroupRequest.Builder = {
    value.fold(self) { v => self.logGroupName(v) }
  }

}

final class DeleteLogGroupRequestOps(val self: DeleteLogGroupRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteLogGroupRequestOps {

  implicit def toDeleteLogGroupRequestBuilderOps(v: DeleteLogGroupRequest.Builder): DeleteLogGroupRequestBuilderOps =
    new DeleteLogGroupRequestBuilderOps(v)

  implicit def toDeleteLogGroupRequestOps(v: DeleteLogGroupRequest): DeleteLogGroupRequestOps =
    new DeleteLogGroupRequestOps(v)

}
