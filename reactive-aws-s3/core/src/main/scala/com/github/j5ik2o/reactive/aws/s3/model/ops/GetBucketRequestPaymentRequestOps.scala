// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketRequestPaymentRequestBuilderOps(val self: GetBucketRequestPaymentRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): GetBucketRequestPaymentRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

}

final class GetBucketRequestPaymentRequestOps(val self: GetBucketRequestPaymentRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketRequestPaymentRequestOps {

  implicit def toGetBucketRequestPaymentRequestBuilderOps(
      v: GetBucketRequestPaymentRequest.Builder
  ): GetBucketRequestPaymentRequestBuilderOps = new GetBucketRequestPaymentRequestBuilderOps(v)

  implicit def toGetBucketRequestPaymentRequestOps(
      v: GetBucketRequestPaymentRequest
  ): GetBucketRequestPaymentRequestOps = new GetBucketRequestPaymentRequestOps(v)

}
