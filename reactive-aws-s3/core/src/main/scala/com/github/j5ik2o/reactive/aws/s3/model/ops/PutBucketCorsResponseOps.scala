// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketCorsResponseBuilderOps(val self: PutBucketCorsResponse.Builder) extends AnyVal {}

final class PutBucketCorsResponseOps(val self: PutBucketCorsResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketCorsResponseOps {

  implicit def toPutBucketCorsResponseBuilderOps(v: PutBucketCorsResponse.Builder): PutBucketCorsResponseBuilderOps =
    new PutBucketCorsResponseBuilderOps(v)

  implicit def toPutBucketCorsResponseOps(v: PutBucketCorsResponse): PutBucketCorsResponseOps =
    new PutBucketCorsResponseOps(v)

}
