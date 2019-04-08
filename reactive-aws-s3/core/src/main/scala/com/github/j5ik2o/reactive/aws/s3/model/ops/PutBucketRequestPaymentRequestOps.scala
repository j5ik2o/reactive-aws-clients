// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketRequestPaymentRequestBuilderOps(val self: PutBucketRequestPaymentRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): PutBucketRequestPaymentRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def contentMD5AsScala(value: Option[String]): PutBucketRequestPaymentRequest.Builder = {
    value.fold(self) { v =>
      self.contentMD5(v)
    }
  }

  final def requestPaymentConfigurationAsScala(
      value: Option[RequestPaymentConfiguration]
  ): PutBucketRequestPaymentRequest.Builder = {
    value.fold(self) { v =>
      self.requestPaymentConfiguration(v)
    }
  }

}

final class PutBucketRequestPaymentRequestOps(val self: PutBucketRequestPaymentRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def contentMD5AsScala: Option[String] = Option(self.contentMD5)

  final def requestPaymentConfigurationAsScala: Option[RequestPaymentConfiguration] =
    Option(self.requestPaymentConfiguration)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketRequestPaymentRequestOps {

  implicit def toPutBucketRequestPaymentRequestBuilderOps(
      v: PutBucketRequestPaymentRequest.Builder
  ): PutBucketRequestPaymentRequestBuilderOps = new PutBucketRequestPaymentRequestBuilderOps(v)

  implicit def toPutBucketRequestPaymentRequestOps(
      v: PutBucketRequestPaymentRequest
  ): PutBucketRequestPaymentRequestOps = new PutBucketRequestPaymentRequestOps(v)

}
