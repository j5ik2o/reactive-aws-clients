// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class DeleteQueueResponseBuilderOps(val self: DeleteQueueResponse.Builder) extends AnyVal {}

final class DeleteQueueResponseOps(val self: DeleteQueueResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteQueueResponseOps {

  implicit def toDeleteQueueResponseBuilderOps(v: DeleteQueueResponse.Builder): DeleteQueueResponseBuilderOps =
    new DeleteQueueResponseBuilderOps(v)

  implicit def toDeleteQueueResponseOps(v: DeleteQueueResponse): DeleteQueueResponseOps = new DeleteQueueResponseOps(v)

}
