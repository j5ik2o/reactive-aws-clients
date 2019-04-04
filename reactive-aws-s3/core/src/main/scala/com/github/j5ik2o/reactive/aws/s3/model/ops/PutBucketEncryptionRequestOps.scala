// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketEncryptionRequestBuilderOps(val self: PutBucketEncryptionRequest.Builder) extends AnyVal {

  final def withBucketAsScala(value: Option[String]): PutBucketEncryptionRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def withContentMD5AsScala(value: Option[String]): PutBucketEncryptionRequest.Builder = {
    value.fold(self) { v =>
      self.contentMD5(v)
    }
  } // String

  final def withServerSideEncryptionConfigurationAsScala(
      value: Option[ServerSideEncryptionConfiguration]
  ): PutBucketEncryptionRequest.Builder = {
    value.fold(self) { v =>
      self.serverSideEncryptionConfiguration(v)
    }
  } // ServerSideEncryptionConfiguration

}

final class PutBucketEncryptionRequestOps(val self: PutBucketEncryptionRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def contentMD5AsScala: Option[String] = Option(self.contentMD5) // String

  final def serverSideEncryptionConfigurationAsScala: Option[ServerSideEncryptionConfiguration] =
    Option(self.serverSideEncryptionConfiguration) // ServerSideEncryptionConfiguration

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketEncryptionRequestOps {

  implicit def toPutBucketEncryptionRequestBuilderOps(
      v: PutBucketEncryptionRequest.Builder
  ): PutBucketEncryptionRequestBuilderOps = new PutBucketEncryptionRequestBuilderOps(v)

  implicit def toPutBucketEncryptionRequestOps(v: PutBucketEncryptionRequest): PutBucketEncryptionRequestOps =
    new PutBucketEncryptionRequestOps(v)

}
