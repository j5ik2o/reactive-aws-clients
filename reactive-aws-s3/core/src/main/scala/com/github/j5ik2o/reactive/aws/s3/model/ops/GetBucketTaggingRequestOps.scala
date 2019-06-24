// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketTaggingRequestBuilderOps(val self: GetBucketTaggingRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): GetBucketTaggingRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

}

final class GetBucketTaggingRequestOps(val self: GetBucketTaggingRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketTaggingRequestOps {

  implicit def toGetBucketTaggingRequestBuilderOps(
      v: GetBucketTaggingRequest.Builder
  ): GetBucketTaggingRequestBuilderOps = new GetBucketTaggingRequestBuilderOps(v)

  implicit def toGetBucketTaggingRequestOps(v: GetBucketTaggingRequest): GetBucketTaggingRequestOps =
    new GetBucketTaggingRequestOps(v)

}
