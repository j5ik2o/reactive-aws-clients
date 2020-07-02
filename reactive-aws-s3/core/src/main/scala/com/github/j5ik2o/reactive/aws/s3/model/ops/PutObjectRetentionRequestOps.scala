// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutObjectRetentionRequestBuilderOps(val self: PutObjectRetentionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): PutObjectRetentionRequest.Builder = {
    value.fold(self) { v => self.bucket(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala(value: Option[String]): PutObjectRetentionRequest.Builder = {
    value.fold(self) { v => self.key(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retentionAsScala(value: Option[ObjectLockRetention]): PutObjectRetentionRequest.Builder = {
    value.fold(self) { v => self.retention(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestPayerAsScala(value: Option[RequestPayer]): PutObjectRetentionRequest.Builder = {
    value.fold(self) { v => self.requestPayer(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionIdAsScala(value: Option[String]): PutObjectRetentionRequest.Builder = {
    value.fold(self) { v => self.versionId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bypassGovernanceRetentionAsScala(value: Option[Boolean]): PutObjectRetentionRequest.Builder = {
    value.fold(self) { v => self.bypassGovernanceRetention(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentMD5AsScala(value: Option[String]): PutObjectRetentionRequest.Builder = {
    value.fold(self) { v => self.contentMD5(v) }
  }

}

final class PutObjectRetentionRequestOps(val self: PutObjectRetentionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala: Option[String] = Option(self.key)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retentionAsScala: Option[ObjectLockRetention] = Option(self.retention)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionIdAsScala: Option[String] = Option(self.versionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bypassGovernanceRetentionAsScala: Option[Boolean] = Option(self.bypassGovernanceRetention)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentMD5AsScala: Option[String] = Option(self.contentMD5)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutObjectRetentionRequestOps {

  implicit def toPutObjectRetentionRequestBuilderOps(
      v: PutObjectRetentionRequest.Builder
  ): PutObjectRetentionRequestBuilderOps = new PutObjectRetentionRequestBuilderOps(v)

  implicit def toPutObjectRetentionRequestOps(v: PutObjectRetentionRequest): PutObjectRetentionRequestOps =
    new PutObjectRetentionRequestOps(v)

}
