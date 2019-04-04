// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketVersioningResponseBuilderOps(val self: PutBucketVersioningResponse.Builder) extends AnyVal {}

final class PutBucketVersioningResponseOps(val self: PutBucketVersioningResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketVersioningResponseOps {

  implicit def toPutBucketVersioningResponseBuilderOps(
      v: PutBucketVersioningResponse.Builder
  ): PutBucketVersioningResponseBuilderOps = new PutBucketVersioningResponseBuilderOps(v)

  implicit def toPutBucketVersioningResponseOps(v: PutBucketVersioningResponse): PutBucketVersioningResponseOps =
    new PutBucketVersioningResponseOps(v)

}
