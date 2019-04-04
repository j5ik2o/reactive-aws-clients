// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class HeadBucketResponseBuilderOps(val self: HeadBucketResponse.Builder) extends AnyVal {}

final class HeadBucketResponseOps(val self: HeadBucketResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToHeadBucketResponseOps {

  implicit def toHeadBucketResponseBuilderOps(v: HeadBucketResponse.Builder): HeadBucketResponseBuilderOps =
    new HeadBucketResponseBuilderOps(v)

  implicit def toHeadBucketResponseOps(v: HeadBucketResponse): HeadBucketResponseOps = new HeadBucketResponseOps(v)

}
