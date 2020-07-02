// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketLoggingRequestBuilderOps(val self: GetBucketLoggingRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): GetBucketLoggingRequest.Builder = {
    value.fold(self) { v => self.bucket(v) }
  }

}

final class GetBucketLoggingRequestOps(val self: GetBucketLoggingRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketLoggingRequestOps {

  implicit def toGetBucketLoggingRequestBuilderOps(
      v: GetBucketLoggingRequest.Builder
  ): GetBucketLoggingRequestBuilderOps = new GetBucketLoggingRequestBuilderOps(v)

  implicit def toGetBucketLoggingRequestOps(v: GetBucketLoggingRequest): GetBucketLoggingRequestOps =
    new GetBucketLoggingRequestOps(v)

}
