// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteBucketResponseBuilderOps(val self: DeleteBucketResponse.Builder) extends AnyVal {}

final class DeleteBucketResponseOps(val self: DeleteBucketResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteBucketResponseOps {

  implicit def toDeleteBucketResponseBuilderOps(v: DeleteBucketResponse.Builder): DeleteBucketResponseBuilderOps =
    new DeleteBucketResponseBuilderOps(v)

  implicit def toDeleteBucketResponseOps(v: DeleteBucketResponse): DeleteBucketResponseOps =
    new DeleteBucketResponseOps(v)

}
