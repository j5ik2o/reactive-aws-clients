// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DeleteLogGroupRequestBuilderOps(val self: DeleteLogGroupRequest.Builder) extends AnyVal {

  final def logGroupNameAsScala(value: Option[String]): DeleteLogGroupRequest.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  } // String

}

final class DeleteLogGroupRequestOps(val self: DeleteLogGroupRequest) extends AnyVal {

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteLogGroupRequestOps {

  implicit def toDeleteLogGroupRequestBuilderOps(v: DeleteLogGroupRequest.Builder): DeleteLogGroupRequestBuilderOps =
    new DeleteLogGroupRequestBuilderOps(v)

  implicit def toDeleteLogGroupRequestOps(v: DeleteLogGroupRequest): DeleteLogGroupRequestOps =
    new DeleteLogGroupRequestOps(v)

}
