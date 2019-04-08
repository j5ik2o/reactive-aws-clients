// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class TagLogGroupResponseBuilderOps(val self: TagLogGroupResponse.Builder) extends AnyVal {}

final class TagLogGroupResponseOps(val self: TagLogGroupResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTagLogGroupResponseOps {

  implicit def toTagLogGroupResponseBuilderOps(v: TagLogGroupResponse.Builder): TagLogGroupResponseBuilderOps =
    new TagLogGroupResponseBuilderOps(v)

  implicit def toTagLogGroupResponseOps(v: TagLogGroupResponse): TagLogGroupResponseOps = new TagLogGroupResponseOps(v)

}
