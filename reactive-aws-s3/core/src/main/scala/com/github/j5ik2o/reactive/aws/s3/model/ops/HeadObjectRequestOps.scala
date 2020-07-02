// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class HeadObjectRequestBuilderOps(val self: HeadObjectRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): HeadObjectRequest.Builder = {
    value.fold(self) { v => self.bucket(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ifMatchAsScala(value: Option[String]): HeadObjectRequest.Builder = {
    value.fold(self) { v => self.ifMatch(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ifModifiedSinceAsScala(value: Option[java.time.Instant]): HeadObjectRequest.Builder = {
    value.fold(self) { v => self.ifModifiedSince(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ifNoneMatchAsScala(value: Option[String]): HeadObjectRequest.Builder = {
    value.fold(self) { v => self.ifNoneMatch(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ifUnmodifiedSinceAsScala(value: Option[java.time.Instant]): HeadObjectRequest.Builder = {
    value.fold(self) { v => self.ifUnmodifiedSince(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala(value: Option[String]): HeadObjectRequest.Builder = {
    value.fold(self) { v => self.key(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rangeAsScala(value: Option[String]): HeadObjectRequest.Builder = {
    value.fold(self) { v => self.range(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionIdAsScala(value: Option[String]): HeadObjectRequest.Builder = {
    value.fold(self) { v => self.versionId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerAlgorithmAsScala(value: Option[String]): HeadObjectRequest.Builder = {
    value.fold(self) { v => self.sseCustomerAlgorithm(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerKeyAsScala(value: Option[String]): HeadObjectRequest.Builder = {
    value.fold(self) { v => self.sseCustomerKey(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerKeyMD5AsScala(value: Option[String]): HeadObjectRequest.Builder = {
    value.fold(self) { v => self.sseCustomerKeyMD5(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestPayerAsScala(value: Option[RequestPayer]): HeadObjectRequest.Builder = {
    value.fold(self) { v => self.requestPayer(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def partNumberAsScala(value: Option[Int]): HeadObjectRequest.Builder = {
    value.fold(self) { v => self.partNumber(v) }
  }

}

final class HeadObjectRequestOps(val self: HeadObjectRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ifMatchAsScala: Option[String] = Option(self.ifMatch)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ifModifiedSinceAsScala: Option[java.time.Instant] = Option(self.ifModifiedSince)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ifNoneMatchAsScala: Option[String] = Option(self.ifNoneMatch)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ifUnmodifiedSinceAsScala: Option[java.time.Instant] = Option(self.ifUnmodifiedSince)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala: Option[String] = Option(self.key)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rangeAsScala: Option[String] = Option(self.range)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionIdAsScala: Option[String] = Option(self.versionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerKeyAsScala: Option[String] = Option(self.sseCustomerKey)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def partNumberAsScala: Option[Int] = Option(self.partNumber)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToHeadObjectRequestOps {

  implicit def toHeadObjectRequestBuilderOps(v: HeadObjectRequest.Builder): HeadObjectRequestBuilderOps =
    new HeadObjectRequestBuilderOps(v)

  implicit def toHeadObjectRequestOps(v: HeadObjectRequest): HeadObjectRequestOps = new HeadObjectRequestOps(v)

}
