// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class UntagLogGroupResponseBuilderOps(val self: UntagLogGroupResponse.Builder) extends AnyVal {}

final class UntagLogGroupResponseOps(val self: UntagLogGroupResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUntagLogGroupResponseOps {

  implicit def toUntagLogGroupResponseBuilderOps(v: UntagLogGroupResponse.Builder): UntagLogGroupResponseBuilderOps =
    new UntagLogGroupResponseBuilderOps(v)

  implicit def toUntagLogGroupResponseOps(v: UntagLogGroupResponse): UntagLogGroupResponseOps =
    new UntagLogGroupResponseOps(v)

}
