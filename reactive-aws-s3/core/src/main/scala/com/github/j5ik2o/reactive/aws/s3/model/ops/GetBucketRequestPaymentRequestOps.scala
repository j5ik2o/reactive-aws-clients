// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketRequestPaymentRequestBuilderOps(val self: GetBucketRequestPaymentRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): GetBucketRequestPaymentRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

}

final class GetBucketRequestPaymentRequestOps(val self: GetBucketRequestPaymentRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

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
