// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketLoggingRequestBuilderOps(val self: PutBucketLoggingRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): PutBucketLoggingRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketLoggingStatusAsScala(value: Option[BucketLoggingStatus]): PutBucketLoggingRequest.Builder = {
    value.fold(self) { v =>
      self.bucketLoggingStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentMD5AsScala(value: Option[String]): PutBucketLoggingRequest.Builder = {
    value.fold(self) { v =>
      self.contentMD5(v)
    }
  }

}

final class PutBucketLoggingRequestOps(val self: PutBucketLoggingRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketLoggingStatusAsScala: Option[BucketLoggingStatus] = Option(self.bucketLoggingStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentMD5AsScala: Option[String] = Option(self.contentMD5)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketLoggingRequestOps {

  implicit def toPutBucketLoggingRequestBuilderOps(
      v: PutBucketLoggingRequest.Builder
  ): PutBucketLoggingRequestBuilderOps = new PutBucketLoggingRequestBuilderOps(v)

  implicit def toPutBucketLoggingRequestOps(v: PutBucketLoggingRequest): PutBucketLoggingRequestOps =
    new PutBucketLoggingRequestOps(v)

}
