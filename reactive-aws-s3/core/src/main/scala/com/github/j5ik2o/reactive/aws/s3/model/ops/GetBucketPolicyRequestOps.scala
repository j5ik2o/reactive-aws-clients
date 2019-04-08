// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketPolicyRequestBuilderOps(val self: GetBucketPolicyRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): GetBucketPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

}

final class GetBucketPolicyRequestOps(val self: GetBucketPolicyRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketPolicyRequestOps {

  implicit def toGetBucketPolicyRequestBuilderOps(v: GetBucketPolicyRequest.Builder): GetBucketPolicyRequestBuilderOps =
    new GetBucketPolicyRequestBuilderOps(v)

  implicit def toGetBucketPolicyRequestOps(v: GetBucketPolicyRequest): GetBucketPolicyRequestOps =
    new GetBucketPolicyRequestOps(v)

}
