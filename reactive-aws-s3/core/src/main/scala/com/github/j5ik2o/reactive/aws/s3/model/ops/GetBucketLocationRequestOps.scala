// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketLocationRequestBuilderOps(val self: GetBucketLocationRequest.Builder) extends AnyVal {

  final def withBucketAsScala(value: Option[String]): GetBucketLocationRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

}

final class GetBucketLocationRequestOps(val self: GetBucketLocationRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketLocationRequestOps {

  implicit def toGetBucketLocationRequestBuilderOps(
      v: GetBucketLocationRequest.Builder
  ): GetBucketLocationRequestBuilderOps = new GetBucketLocationRequestBuilderOps(v)

  implicit def toGetBucketLocationRequestOps(v: GetBucketLocationRequest): GetBucketLocationRequestOps =
    new GetBucketLocationRequestOps(v)

}
