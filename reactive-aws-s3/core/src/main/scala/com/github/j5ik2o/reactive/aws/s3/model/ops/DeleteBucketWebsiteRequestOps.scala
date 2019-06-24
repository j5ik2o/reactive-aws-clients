// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteBucketWebsiteRequestBuilderOps(val self: DeleteBucketWebsiteRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): DeleteBucketWebsiteRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

}

final class DeleteBucketWebsiteRequestOps(val self: DeleteBucketWebsiteRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteBucketWebsiteRequestOps {

  implicit def toDeleteBucketWebsiteRequestBuilderOps(
      v: DeleteBucketWebsiteRequest.Builder
  ): DeleteBucketWebsiteRequestBuilderOps = new DeleteBucketWebsiteRequestBuilderOps(v)

  implicit def toDeleteBucketWebsiteRequestOps(v: DeleteBucketWebsiteRequest): DeleteBucketWebsiteRequestOps =
    new DeleteBucketWebsiteRequestOps(v)

}
