// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketEncryptionResponseBuilderOps(val self: PutBucketEncryptionResponse.Builder) extends AnyVal {}

final class PutBucketEncryptionResponseOps(val self: PutBucketEncryptionResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketEncryptionResponseOps {

  implicit def toPutBucketEncryptionResponseBuilderOps(
      v: PutBucketEncryptionResponse.Builder
  ): PutBucketEncryptionResponseBuilderOps = new PutBucketEncryptionResponseBuilderOps(v)

  implicit def toPutBucketEncryptionResponseOps(v: PutBucketEncryptionResponse): PutBucketEncryptionResponseOps =
    new PutBucketEncryptionResponseOps(v)

}
