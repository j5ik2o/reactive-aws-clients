// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketLoggingResponseBuilderOps(val self: PutBucketLoggingResponse.Builder) extends AnyVal {}

final class PutBucketLoggingResponseOps(val self: PutBucketLoggingResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketLoggingResponseOps {

  implicit def toPutBucketLoggingResponseBuilderOps(
      v: PutBucketLoggingResponse.Builder
  ): PutBucketLoggingResponseBuilderOps = new PutBucketLoggingResponseBuilderOps(v)

  implicit def toPutBucketLoggingResponseOps(v: PutBucketLoggingResponse): PutBucketLoggingResponseOps =
    new PutBucketLoggingResponseOps(v)

}
