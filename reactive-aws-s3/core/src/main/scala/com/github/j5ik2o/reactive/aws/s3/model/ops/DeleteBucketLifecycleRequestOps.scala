// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteBucketLifecycleRequestBuilderOps(val self: DeleteBucketLifecycleRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): DeleteBucketLifecycleRequest.Builder = {
    value.fold(self) { v => self.bucket(v) }
  }

}

final class DeleteBucketLifecycleRequestOps(val self: DeleteBucketLifecycleRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteBucketLifecycleRequestOps {

  implicit def toDeleteBucketLifecycleRequestBuilderOps(
      v: DeleteBucketLifecycleRequest.Builder
  ): DeleteBucketLifecycleRequestBuilderOps = new DeleteBucketLifecycleRequestBuilderOps(v)

  implicit def toDeleteBucketLifecycleRequestOps(v: DeleteBucketLifecycleRequest): DeleteBucketLifecycleRequestOps =
    new DeleteBucketLifecycleRequestOps(v)

}
