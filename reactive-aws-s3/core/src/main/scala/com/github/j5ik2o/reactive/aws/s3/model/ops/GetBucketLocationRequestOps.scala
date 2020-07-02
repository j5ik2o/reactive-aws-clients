// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketLocationRequestBuilderOps(val self: GetBucketLocationRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): GetBucketLocationRequest.Builder = {
    value.fold(self) { v => self.bucket(v) }
  }

}

final class GetBucketLocationRequestOps(val self: GetBucketLocationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketLocationRequestOps {

  implicit def toGetBucketLocationRequestBuilderOps(
      v: GetBucketLocationRequest.Builder
  ): GetBucketLocationRequestBuilderOps = new GetBucketLocationRequestBuilderOps(v)

  implicit def toGetBucketLocationRequestOps(v: GetBucketLocationRequest): GetBucketLocationRequestOps =
    new GetBucketLocationRequestOps(v)

}
