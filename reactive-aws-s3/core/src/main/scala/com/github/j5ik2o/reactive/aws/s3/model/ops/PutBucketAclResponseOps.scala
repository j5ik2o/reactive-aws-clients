// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketAclResponseBuilderOps(val self: PutBucketAclResponse.Builder) extends AnyVal {}

final class PutBucketAclResponseOps(val self: PutBucketAclResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketAclResponseOps {

  implicit def toPutBucketAclResponseBuilderOps(v: PutBucketAclResponse.Builder): PutBucketAclResponseBuilderOps =
    new PutBucketAclResponseBuilderOps(v)

  implicit def toPutBucketAclResponseOps(v: PutBucketAclResponse): PutBucketAclResponseOps =
    new PutBucketAclResponseOps(v)

}
