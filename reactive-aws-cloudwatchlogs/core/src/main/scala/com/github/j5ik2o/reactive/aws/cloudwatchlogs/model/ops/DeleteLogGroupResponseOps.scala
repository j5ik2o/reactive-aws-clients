// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DeleteLogGroupResponseBuilderOps(val self: DeleteLogGroupResponse.Builder) extends AnyVal {}

final class DeleteLogGroupResponseOps(val self: DeleteLogGroupResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteLogGroupResponseOps {

  implicit def toDeleteLogGroupResponseBuilderOps(v: DeleteLogGroupResponse.Builder): DeleteLogGroupResponseBuilderOps =
    new DeleteLogGroupResponseBuilderOps(v)

  implicit def toDeleteLogGroupResponseOps(v: DeleteLogGroupResponse): DeleteLogGroupResponseOps =
    new DeleteLogGroupResponseOps(v)

}
