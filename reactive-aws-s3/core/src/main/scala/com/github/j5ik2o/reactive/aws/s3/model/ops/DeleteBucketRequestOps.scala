// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteBucketRequestBuilderOps(val self: DeleteBucketRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): DeleteBucketRequest.Builder = {
    value.fold(self) { v => self.bucket(v) }
  }

}

final class DeleteBucketRequestOps(val self: DeleteBucketRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteBucketRequestOps {

  implicit def toDeleteBucketRequestBuilderOps(v: DeleteBucketRequest.Builder): DeleteBucketRequestBuilderOps =
    new DeleteBucketRequestBuilderOps(v)

  implicit def toDeleteBucketRequestOps(v: DeleteBucketRequest): DeleteBucketRequestOps = new DeleteBucketRequestOps(v)

}
