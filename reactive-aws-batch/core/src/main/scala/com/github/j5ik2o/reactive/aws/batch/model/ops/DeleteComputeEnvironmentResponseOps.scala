// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class DeleteComputeEnvironmentResponseBuilderOps(val self: DeleteComputeEnvironmentResponse.Builder)
    extends AnyVal {}

final class DeleteComputeEnvironmentResponseOps(val self: DeleteComputeEnvironmentResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteComputeEnvironmentResponseOps {

  implicit def toDeleteComputeEnvironmentResponseBuilderOps(
      v: DeleteComputeEnvironmentResponse.Builder
  ): DeleteComputeEnvironmentResponseBuilderOps = new DeleteComputeEnvironmentResponseBuilderOps(v)

  implicit def toDeleteComputeEnvironmentResponseOps(
      v: DeleteComputeEnvironmentResponse
  ): DeleteComputeEnvironmentResponseOps = new DeleteComputeEnvironmentResponseOps(v)

}
