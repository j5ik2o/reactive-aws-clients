// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CreateMultipartUploadResponseBuilderOps(val self: CreateMultipartUploadResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def abortDateAsScala(value: Option[java.time.Instant]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v => self.abortDate(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def abortRuleIdAsScala(value: Option[String]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v => self.abortRuleId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v => self.bucket(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala(value: Option[String]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v => self.key(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadIdAsScala(value: Option[String]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v => self.uploadId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serverSideEncryptionAsScala(value: Option[ServerSideEncryption]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v => self.serverSideEncryption(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerAlgorithmAsScala(value: Option[String]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v => self.sseCustomerAlgorithm(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerKeyMD5AsScala(value: Option[String]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v => self.sseCustomerKeyMD5(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ssekmsKeyIdAsScala(value: Option[String]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v => self.ssekmsKeyId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ssekmsEncryptionContextAsScala(value: Option[String]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v => self.ssekmsEncryptionContext(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestChargedAsScala(value: Option[RequestCharged]): CreateMultipartUploadResponse.Builder = {
    value.fold(self) { v => self.requestCharged(v) }
  }

}

final class CreateMultipartUploadResponseOps(val self: CreateMultipartUploadResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def abortDateAsScala: Option[java.time.Instant] = Option(self.abortDate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def abortRuleIdAsScala: Option[String] = Option(self.abortRuleId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala: Option[String] = Option(self.key)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadIdAsScala: Option[String] = Option(self.uploadId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serverSideEncryptionAsScala: Option[ServerSideEncryption] = Option(self.serverSideEncryption)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ssekmsKeyIdAsScala: Option[String] = Option(self.ssekmsKeyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ssekmsEncryptionContextAsScala: Option[String] = Option(self.ssekmsEncryptionContext)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateMultipartUploadResponseOps {

  implicit def toCreateMultipartUploadResponseBuilderOps(
      v: CreateMultipartUploadResponse.Builder
  ): CreateMultipartUploadResponseBuilderOps = new CreateMultipartUploadResponseBuilderOps(v)

  implicit def toCreateMultipartUploadResponseOps(v: CreateMultipartUploadResponse): CreateMultipartUploadResponseOps =
    new CreateMultipartUploadResponseOps(v)

}
