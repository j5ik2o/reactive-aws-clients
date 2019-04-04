// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeletePublicAccessBlockResponseBuilderOps(val self: DeletePublicAccessBlockResponse.Builder)
    extends AnyVal {}

final class DeletePublicAccessBlockResponseOps(val self: DeletePublicAccessBlockResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeletePublicAccessBlockResponseOps {

  implicit def toDeletePublicAccessBlockResponseBuilderOps(
      v: DeletePublicAccessBlockResponse.Builder
  ): DeletePublicAccessBlockResponseBuilderOps = new DeletePublicAccessBlockResponseBuilderOps(v)

  implicit def toDeletePublicAccessBlockResponseOps(
      v: DeletePublicAccessBlockResponse
  ): DeletePublicAccessBlockResponseOps = new DeletePublicAccessBlockResponseOps(v)

}
