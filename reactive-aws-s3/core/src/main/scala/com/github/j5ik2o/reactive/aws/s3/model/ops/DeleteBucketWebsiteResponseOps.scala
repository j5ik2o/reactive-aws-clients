// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteBucketWebsiteResponseBuilderOps(val self: DeleteBucketWebsiteResponse.Builder) extends AnyVal {}

final class DeleteBucketWebsiteResponseOps(val self: DeleteBucketWebsiteResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteBucketWebsiteResponseOps {

  implicit def toDeleteBucketWebsiteResponseBuilderOps(
      v: DeleteBucketWebsiteResponse.Builder
  ): DeleteBucketWebsiteResponseBuilderOps = new DeleteBucketWebsiteResponseBuilderOps(v)

  implicit def toDeleteBucketWebsiteResponseOps(v: DeleteBucketWebsiteResponse): DeleteBucketWebsiteResponseOps =
    new DeleteBucketWebsiteResponseOps(v)

}
