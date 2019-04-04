// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteBucketTaggingResponseBuilderOps(val self: DeleteBucketTaggingResponse.Builder) extends AnyVal {}

final class DeleteBucketTaggingResponseOps(val self: DeleteBucketTaggingResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteBucketTaggingResponseOps {

  implicit def toDeleteBucketTaggingResponseBuilderOps(
      v: DeleteBucketTaggingResponse.Builder
  ): DeleteBucketTaggingResponseBuilderOps = new DeleteBucketTaggingResponseBuilderOps(v)

  implicit def toDeleteBucketTaggingResponseOps(v: DeleteBucketTaggingResponse): DeleteBucketTaggingResponseOps =
    new DeleteBucketTaggingResponseOps(v)

}
