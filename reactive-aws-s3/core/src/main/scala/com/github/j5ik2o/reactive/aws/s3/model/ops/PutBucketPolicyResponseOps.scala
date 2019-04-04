// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketPolicyResponseBuilderOps(val self: PutBucketPolicyResponse.Builder) extends AnyVal {}

final class PutBucketPolicyResponseOps(val self: PutBucketPolicyResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketPolicyResponseOps {

  implicit def toPutBucketPolicyResponseBuilderOps(
      v: PutBucketPolicyResponse.Builder
  ): PutBucketPolicyResponseBuilderOps = new PutBucketPolicyResponseBuilderOps(v)

  implicit def toPutBucketPolicyResponseOps(v: PutBucketPolicyResponse): PutBucketPolicyResponseOps =
    new PutBucketPolicyResponseOps(v)

}
