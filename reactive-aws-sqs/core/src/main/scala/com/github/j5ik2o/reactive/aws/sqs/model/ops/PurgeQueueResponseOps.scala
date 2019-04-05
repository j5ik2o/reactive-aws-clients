// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class PurgeQueueResponseBuilderOps(val self: PurgeQueueResponse.Builder) extends AnyVal {}

final class PurgeQueueResponseOps(val self: PurgeQueueResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPurgeQueueResponseOps {

  implicit def toPurgeQueueResponseBuilderOps(v: PurgeQueueResponse.Builder): PurgeQueueResponseBuilderOps =
    new PurgeQueueResponseBuilderOps(v)

  implicit def toPurgeQueueResponseOps(v: PurgeQueueResponse): PurgeQueueResponseOps = new PurgeQueueResponseOps(v)

}
