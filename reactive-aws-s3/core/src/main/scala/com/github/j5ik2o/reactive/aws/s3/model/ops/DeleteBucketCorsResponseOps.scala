// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteBucketCorsResponseBuilderOps(val self: DeleteBucketCorsResponse.Builder) extends AnyVal {}

final class DeleteBucketCorsResponseOps(val self: DeleteBucketCorsResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteBucketCorsResponseOps {

  implicit def toDeleteBucketCorsResponseBuilderOps(
      v: DeleteBucketCorsResponse.Builder
  ): DeleteBucketCorsResponseBuilderOps = new DeleteBucketCorsResponseBuilderOps(v)

  implicit def toDeleteBucketCorsResponseOps(v: DeleteBucketCorsResponse): DeleteBucketCorsResponseOps =
    new DeleteBucketCorsResponseOps(v)

}
