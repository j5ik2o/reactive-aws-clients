// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class CreateLogGroupResponseBuilderOps(val self: CreateLogGroupResponse.Builder) extends AnyVal {}

final class CreateLogGroupResponseOps(val self: CreateLogGroupResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateLogGroupResponseOps {

  implicit def toCreateLogGroupResponseBuilderOps(v: CreateLogGroupResponse.Builder): CreateLogGroupResponseBuilderOps =
    new CreateLogGroupResponseBuilderOps(v)

  implicit def toCreateLogGroupResponseOps(v: CreateLogGroupResponse): CreateLogGroupResponseOps =
    new CreateLogGroupResponseOps(v)

}
