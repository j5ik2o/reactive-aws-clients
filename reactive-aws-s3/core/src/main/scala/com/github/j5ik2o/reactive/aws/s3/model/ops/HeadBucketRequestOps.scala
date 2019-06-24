// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class HeadBucketRequestBuilderOps(val self: HeadBucketRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): HeadBucketRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

}

final class HeadBucketRequestOps(val self: HeadBucketRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToHeadBucketRequestOps {

  implicit def toHeadBucketRequestBuilderOps(v: HeadBucketRequest.Builder): HeadBucketRequestBuilderOps =
    new HeadBucketRequestBuilderOps(v)

  implicit def toHeadBucketRequestOps(v: HeadBucketRequest): HeadBucketRequestOps = new HeadBucketRequestOps(v)

}
