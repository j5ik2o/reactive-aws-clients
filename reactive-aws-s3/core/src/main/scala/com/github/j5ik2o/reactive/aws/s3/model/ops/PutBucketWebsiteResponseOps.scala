// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketWebsiteResponseBuilderOps(val self: PutBucketWebsiteResponse.Builder) extends AnyVal {}

final class PutBucketWebsiteResponseOps(val self: PutBucketWebsiteResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketWebsiteResponseOps {

  implicit def toPutBucketWebsiteResponseBuilderOps(
      v: PutBucketWebsiteResponse.Builder
  ): PutBucketWebsiteResponseBuilderOps = new PutBucketWebsiteResponseBuilderOps(v)

  implicit def toPutBucketWebsiteResponseOps(v: PutBucketWebsiteResponse): PutBucketWebsiteResponseOps =
    new PutBucketWebsiteResponseOps(v)

}
