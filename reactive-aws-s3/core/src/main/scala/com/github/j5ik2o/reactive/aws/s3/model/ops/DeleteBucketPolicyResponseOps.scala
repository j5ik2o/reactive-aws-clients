// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteBucketPolicyResponseBuilderOps(val self: DeleteBucketPolicyResponse.Builder) extends AnyVal {}

final class DeleteBucketPolicyResponseOps(val self: DeleteBucketPolicyResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteBucketPolicyResponseOps {

  implicit def toDeleteBucketPolicyResponseBuilderOps(
      v: DeleteBucketPolicyResponse.Builder
  ): DeleteBucketPolicyResponseBuilderOps = new DeleteBucketPolicyResponseBuilderOps(v)

  implicit def toDeleteBucketPolicyResponseOps(v: DeleteBucketPolicyResponse): DeleteBucketPolicyResponseOps =
    new DeleteBucketPolicyResponseOps(v)

}
