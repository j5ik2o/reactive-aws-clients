// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketReplicationResponseBuilderOps(val self: PutBucketReplicationResponse.Builder) extends AnyVal {}

final class PutBucketReplicationResponseOps(val self: PutBucketReplicationResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketReplicationResponseOps {

  implicit def toPutBucketReplicationResponseBuilderOps(
      v: PutBucketReplicationResponse.Builder
  ): PutBucketReplicationResponseBuilderOps = new PutBucketReplicationResponseBuilderOps(v)

  implicit def toPutBucketReplicationResponseOps(v: PutBucketReplicationResponse): PutBucketReplicationResponseOps =
    new PutBucketReplicationResponseOps(v)

}
