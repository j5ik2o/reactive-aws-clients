// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class UntagQueueResponseBuilderOps(val self: UntagQueueResponse.Builder) extends AnyVal {}

final class UntagQueueResponseOps(val self: UntagQueueResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUntagQueueResponseOps {

  implicit def toUntagQueueResponseBuilderOps(v: UntagQueueResponse.Builder): UntagQueueResponseBuilderOps =
    new UntagQueueResponseBuilderOps(v)

  implicit def toUntagQueueResponseOps(v: UntagQueueResponse): UntagQueueResponseOps = new UntagQueueResponseOps(v)

}
