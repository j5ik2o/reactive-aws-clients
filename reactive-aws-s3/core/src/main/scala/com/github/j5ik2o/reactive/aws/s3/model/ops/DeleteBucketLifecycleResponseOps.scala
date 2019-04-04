// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteBucketLifecycleResponseBuilderOps(val self: DeleteBucketLifecycleResponse.Builder) extends AnyVal {}

final class DeleteBucketLifecycleResponseOps(val self: DeleteBucketLifecycleResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteBucketLifecycleResponseOps {

  implicit def toDeleteBucketLifecycleResponseBuilderOps(
      v: DeleteBucketLifecycleResponse.Builder
  ): DeleteBucketLifecycleResponseBuilderOps = new DeleteBucketLifecycleResponseBuilderOps(v)

  implicit def toDeleteBucketLifecycleResponseOps(v: DeleteBucketLifecycleResponse): DeleteBucketLifecycleResponseOps =
    new DeleteBucketLifecycleResponseOps(v)

}
