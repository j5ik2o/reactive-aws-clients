// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class TagQueueResponseBuilderOps(val self: TagQueueResponse.Builder) extends AnyVal {}

final class TagQueueResponseOps(val self: TagQueueResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTagQueueResponseOps {

  implicit def toTagQueueResponseBuilderOps(v: TagQueueResponse.Builder): TagQueueResponseBuilderOps =
    new TagQueueResponseBuilderOps(v)

  implicit def toTagQueueResponseOps(v: TagQueueResponse): TagQueueResponseOps = new TagQueueResponseOps(v)

}
