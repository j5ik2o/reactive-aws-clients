// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketEncryptionRequestBuilderOps(val self: GetBucketEncryptionRequest.Builder) extends AnyVal {

  final def withBucketAsScala(value: Option[String]): GetBucketEncryptionRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

}

final class GetBucketEncryptionRequestOps(val self: GetBucketEncryptionRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketEncryptionRequestOps {

  implicit def toGetBucketEncryptionRequestBuilderOps(
      v: GetBucketEncryptionRequest.Builder
  ): GetBucketEncryptionRequestBuilderOps = new GetBucketEncryptionRequestBuilderOps(v)

  implicit def toGetBucketEncryptionRequestOps(v: GetBucketEncryptionRequest): GetBucketEncryptionRequestOps =
    new GetBucketEncryptionRequestOps(v)

}
