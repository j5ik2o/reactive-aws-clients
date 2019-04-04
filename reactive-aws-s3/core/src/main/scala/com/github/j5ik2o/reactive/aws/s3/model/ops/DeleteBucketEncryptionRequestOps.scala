// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteBucketEncryptionRequestBuilderOps(val self: DeleteBucketEncryptionRequest.Builder) extends AnyVal {

  final def withBucketAsScala(value: Option[String]): DeleteBucketEncryptionRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

}

final class DeleteBucketEncryptionRequestOps(val self: DeleteBucketEncryptionRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteBucketEncryptionRequestOps {

  implicit def toDeleteBucketEncryptionRequestBuilderOps(
      v: DeleteBucketEncryptionRequest.Builder
  ): DeleteBucketEncryptionRequestBuilderOps = new DeleteBucketEncryptionRequestBuilderOps(v)

  implicit def toDeleteBucketEncryptionRequestOps(v: DeleteBucketEncryptionRequest): DeleteBucketEncryptionRequestOps =
    new DeleteBucketEncryptionRequestOps(v)

}
