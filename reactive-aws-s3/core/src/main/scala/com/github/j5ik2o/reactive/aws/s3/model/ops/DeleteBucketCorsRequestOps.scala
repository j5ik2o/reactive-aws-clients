// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteBucketCorsRequestBuilderOps(val self: DeleteBucketCorsRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): DeleteBucketCorsRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

}

final class DeleteBucketCorsRequestOps(val self: DeleteBucketCorsRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteBucketCorsRequestOps {

  implicit def toDeleteBucketCorsRequestBuilderOps(
      v: DeleteBucketCorsRequest.Builder
  ): DeleteBucketCorsRequestBuilderOps = new DeleteBucketCorsRequestBuilderOps(v)

  implicit def toDeleteBucketCorsRequestOps(v: DeleteBucketCorsRequest): DeleteBucketCorsRequestOps =
    new DeleteBucketCorsRequestOps(v)

}
