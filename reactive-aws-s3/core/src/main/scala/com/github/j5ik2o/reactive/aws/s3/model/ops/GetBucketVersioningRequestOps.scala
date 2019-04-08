// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketVersioningRequestBuilderOps(val self: GetBucketVersioningRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): GetBucketVersioningRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

}

final class GetBucketVersioningRequestOps(val self: GetBucketVersioningRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketVersioningRequestOps {

  implicit def toGetBucketVersioningRequestBuilderOps(
      v: GetBucketVersioningRequest.Builder
  ): GetBucketVersioningRequestBuilderOps = new GetBucketVersioningRequestBuilderOps(v)

  implicit def toGetBucketVersioningRequestOps(v: GetBucketVersioningRequest): GetBucketVersioningRequestOps =
    new GetBucketVersioningRequestOps(v)

}
