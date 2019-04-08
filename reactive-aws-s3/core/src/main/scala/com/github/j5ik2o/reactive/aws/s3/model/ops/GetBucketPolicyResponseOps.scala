// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketPolicyResponseBuilderOps(val self: GetBucketPolicyResponse.Builder) extends AnyVal {

  final def policyAsScala(value: Option[String]): GetBucketPolicyResponse.Builder = {
    value.fold(self) { v =>
      self.policy(v)
    }
  }

}

final class GetBucketPolicyResponseOps(val self: GetBucketPolicyResponse) extends AnyVal {

  final def policyAsScala: Option[String] = Option(self.policy)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketPolicyResponseOps {

  implicit def toGetBucketPolicyResponseBuilderOps(
      v: GetBucketPolicyResponse.Builder
  ): GetBucketPolicyResponseBuilderOps = new GetBucketPolicyResponseBuilderOps(v)

  implicit def toGetBucketPolicyResponseOps(v: GetBucketPolicyResponse): GetBucketPolicyResponseOps =
    new GetBucketPolicyResponseOps(v)

}
