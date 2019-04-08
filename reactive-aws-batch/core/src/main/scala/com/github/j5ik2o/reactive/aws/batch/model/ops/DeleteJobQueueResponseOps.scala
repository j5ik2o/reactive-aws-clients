// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class DeleteJobQueueResponseBuilderOps(val self: DeleteJobQueueResponse.Builder) extends AnyVal {}

final class DeleteJobQueueResponseOps(val self: DeleteJobQueueResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteJobQueueResponseOps {

  implicit def toDeleteJobQueueResponseBuilderOps(v: DeleteJobQueueResponse.Builder): DeleteJobQueueResponseBuilderOps =
    new DeleteJobQueueResponseBuilderOps(v)

  implicit def toDeleteJobQueueResponseOps(v: DeleteJobQueueResponse): DeleteJobQueueResponseOps =
    new DeleteJobQueueResponseOps(v)

}
