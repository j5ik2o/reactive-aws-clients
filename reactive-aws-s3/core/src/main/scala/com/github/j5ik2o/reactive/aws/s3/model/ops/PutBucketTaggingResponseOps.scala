// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketTaggingResponseBuilderOps(val self: PutBucketTaggingResponse.Builder) extends AnyVal {}

final class PutBucketTaggingResponseOps(val self: PutBucketTaggingResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketTaggingResponseOps {

  implicit def toPutBucketTaggingResponseBuilderOps(
      v: PutBucketTaggingResponse.Builder
  ): PutBucketTaggingResponseBuilderOps = new PutBucketTaggingResponseBuilderOps(v)

  implicit def toPutBucketTaggingResponseOps(v: PutBucketTaggingResponse): PutBucketTaggingResponseOps =
    new PutBucketTaggingResponseOps(v)

}
