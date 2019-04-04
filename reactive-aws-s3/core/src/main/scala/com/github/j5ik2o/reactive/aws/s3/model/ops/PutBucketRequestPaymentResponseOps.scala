// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketRequestPaymentResponseBuilderOps(val self: PutBucketRequestPaymentResponse.Builder)
    extends AnyVal {}

final class PutBucketRequestPaymentResponseOps(val self: PutBucketRequestPaymentResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketRequestPaymentResponseOps {

  implicit def toPutBucketRequestPaymentResponseBuilderOps(
      v: PutBucketRequestPaymentResponse.Builder
  ): PutBucketRequestPaymentResponseBuilderOps = new PutBucketRequestPaymentResponseBuilderOps(v)

  implicit def toPutBucketRequestPaymentResponseOps(
      v: PutBucketRequestPaymentResponse
  ): PutBucketRequestPaymentResponseOps = new PutBucketRequestPaymentResponseOps(v)

}
