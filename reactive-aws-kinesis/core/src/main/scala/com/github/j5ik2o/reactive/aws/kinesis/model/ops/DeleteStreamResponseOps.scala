// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class DeleteStreamResponseBuilderOps(val self: DeleteStreamResponse.Builder) extends AnyVal {}

final class DeleteStreamResponseOps(val self: DeleteStreamResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteStreamResponseOps {

  implicit def toDeleteStreamResponseBuilderOps(v: DeleteStreamResponse.Builder): DeleteStreamResponseBuilderOps =
    new DeleteStreamResponseBuilderOps(v)

  implicit def toDeleteStreamResponseOps(v: DeleteStreamResponse): DeleteStreamResponseOps =
    new DeleteStreamResponseOps(v)

}
