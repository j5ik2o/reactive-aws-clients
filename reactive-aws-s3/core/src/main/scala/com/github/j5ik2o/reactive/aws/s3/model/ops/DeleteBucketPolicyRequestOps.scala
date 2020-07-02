// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteBucketPolicyRequestBuilderOps(val self: DeleteBucketPolicyRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): DeleteBucketPolicyRequest.Builder = {
    value.fold(self) { v => self.bucket(v) }
  }

}

final class DeleteBucketPolicyRequestOps(val self: DeleteBucketPolicyRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteBucketPolicyRequestOps {

  implicit def toDeleteBucketPolicyRequestBuilderOps(
      v: DeleteBucketPolicyRequest.Builder
  ): DeleteBucketPolicyRequestBuilderOps = new DeleteBucketPolicyRequestBuilderOps(v)

  implicit def toDeleteBucketPolicyRequestOps(v: DeleteBucketPolicyRequest): DeleteBucketPolicyRequestOps =
    new DeleteBucketPolicyRequestOps(v)

}
