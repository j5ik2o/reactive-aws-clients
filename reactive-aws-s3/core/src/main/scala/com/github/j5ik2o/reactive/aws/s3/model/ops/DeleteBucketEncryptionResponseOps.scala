// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteBucketEncryptionResponseBuilderOps(val self: DeleteBucketEncryptionResponse.Builder) extends AnyVal {}

final class DeleteBucketEncryptionResponseOps(val self: DeleteBucketEncryptionResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteBucketEncryptionResponseOps {

  implicit def toDeleteBucketEncryptionResponseBuilderOps(
      v: DeleteBucketEncryptionResponse.Builder
  ): DeleteBucketEncryptionResponseBuilderOps = new DeleteBucketEncryptionResponseBuilderOps(v)

  implicit def toDeleteBucketEncryptionResponseOps(
      v: DeleteBucketEncryptionResponse
  ): DeleteBucketEncryptionResponseOps = new DeleteBucketEncryptionResponseOps(v)

}
