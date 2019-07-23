// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketPolicyStatusRequestBuilderOps(val self: GetBucketPolicyStatusRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): GetBucketPolicyStatusRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

}

final class GetBucketPolicyStatusRequestOps(val self: GetBucketPolicyStatusRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketPolicyStatusRequestOps {

  implicit def toGetBucketPolicyStatusRequestBuilderOps(
      v: GetBucketPolicyStatusRequest.Builder
  ): GetBucketPolicyStatusRequestBuilderOps = new GetBucketPolicyStatusRequestBuilderOps(v)

  implicit def toGetBucketPolicyStatusRequestOps(v: GetBucketPolicyStatusRequest): GetBucketPolicyStatusRequestOps =
    new GetBucketPolicyStatusRequestOps(v)

}
