// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketEncryptionRequestBuilderOps(val self: PutBucketEncryptionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): PutBucketEncryptionRequest.Builder = {
    value.fold(self) { v => self.bucket(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentMD5AsScala(value: Option[String]): PutBucketEncryptionRequest.Builder = {
    value.fold(self) { v => self.contentMD5(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serverSideEncryptionConfigurationAsScala(
      value: Option[ServerSideEncryptionConfiguration]
  ): PutBucketEncryptionRequest.Builder = {
    value.fold(self) { v => self.serverSideEncryptionConfiguration(v) }
  }

}

final class PutBucketEncryptionRequestOps(val self: PutBucketEncryptionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentMD5AsScala: Option[String] = Option(self.contentMD5)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serverSideEncryptionConfigurationAsScala: Option[ServerSideEncryptionConfiguration] =
    Option(self.serverSideEncryptionConfiguration)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketEncryptionRequestOps {

  implicit def toPutBucketEncryptionRequestBuilderOps(
      v: PutBucketEncryptionRequest.Builder
  ): PutBucketEncryptionRequestBuilderOps = new PutBucketEncryptionRequestBuilderOps(v)

  implicit def toPutBucketEncryptionRequestOps(v: PutBucketEncryptionRequest): PutBucketEncryptionRequestOps =
    new PutBucketEncryptionRequestOps(v)

}
