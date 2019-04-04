// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteBucketReplicationResponseBuilderOps(val self: DeleteBucketReplicationResponse.Builder)
    extends AnyVal {}

final class DeleteBucketReplicationResponseOps(val self: DeleteBucketReplicationResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteBucketReplicationResponseOps {

  implicit def toDeleteBucketReplicationResponseBuilderOps(
      v: DeleteBucketReplicationResponse.Builder
  ): DeleteBucketReplicationResponseBuilderOps = new DeleteBucketReplicationResponseBuilderOps(v)

  implicit def toDeleteBucketReplicationResponseOps(
      v: DeleteBucketReplicationResponse
  ): DeleteBucketReplicationResponseOps = new DeleteBucketReplicationResponseOps(v)

}
