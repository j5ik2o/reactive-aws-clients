// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketLoggingRequestBuilderOps(val self: PutBucketLoggingRequest.Builder) extends AnyVal {

  final def withBucketAsScala(value: Option[String]): PutBucketLoggingRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def withBucketLoggingStatusAsScala(value: Option[BucketLoggingStatus]): PutBucketLoggingRequest.Builder = {
    value.fold(self) { v =>
      self.bucketLoggingStatus(v)
    }
  } // BucketLoggingStatus

  final def withContentMD5AsScala(value: Option[String]): PutBucketLoggingRequest.Builder = {
    value.fold(self) { v =>
      self.contentMD5(v)
    }
  } // String

}

final class PutBucketLoggingRequestOps(val self: PutBucketLoggingRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def bucketLoggingStatusAsScala: Option[BucketLoggingStatus] =
    Option(self.bucketLoggingStatus) // BucketLoggingStatus

  final def contentMD5AsScala: Option[String] = Option(self.contentMD5) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketLoggingRequestOps {

  implicit def toPutBucketLoggingRequestBuilderOps(
      v: PutBucketLoggingRequest.Builder
  ): PutBucketLoggingRequestBuilderOps = new PutBucketLoggingRequestBuilderOps(v)

  implicit def toPutBucketLoggingRequestOps(v: PutBucketLoggingRequest): PutBucketLoggingRequestOps =
    new PutBucketLoggingRequestOps(v)

}
