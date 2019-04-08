// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DeleteLogStreamResponseBuilderOps(val self: DeleteLogStreamResponse.Builder) extends AnyVal {}

final class DeleteLogStreamResponseOps(val self: DeleteLogStreamResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteLogStreamResponseOps {

  implicit def toDeleteLogStreamResponseBuilderOps(
      v: DeleteLogStreamResponse.Builder
  ): DeleteLogStreamResponseBuilderOps = new DeleteLogStreamResponseBuilderOps(v)

  implicit def toDeleteLogStreamResponseOps(v: DeleteLogStreamResponse): DeleteLogStreamResponseOps =
    new DeleteLogStreamResponseOps(v)

}
