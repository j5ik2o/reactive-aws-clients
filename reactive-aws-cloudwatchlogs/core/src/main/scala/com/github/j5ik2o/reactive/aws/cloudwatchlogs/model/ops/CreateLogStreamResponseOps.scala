// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class CreateLogStreamResponseBuilderOps(val self: CreateLogStreamResponse.Builder) extends AnyVal {}

final class CreateLogStreamResponseOps(val self: CreateLogStreamResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateLogStreamResponseOps {

  implicit def toCreateLogStreamResponseBuilderOps(
      v: CreateLogStreamResponse.Builder
  ): CreateLogStreamResponseBuilderOps = new CreateLogStreamResponseBuilderOps(v)

  implicit def toCreateLogStreamResponseOps(v: CreateLogStreamResponse): CreateLogStreamResponseOps =
    new CreateLogStreamResponseOps(v)

}
