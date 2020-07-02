// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListObjectsV2RequestBuilderOps(val self: ListObjectsV2Request.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): ListObjectsV2Request.Builder = {
    value.fold(self) { v => self.bucket(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def delimiterAsScala(value: Option[String]): ListObjectsV2Request.Builder = {
    value.fold(self) { v => self.delimiter(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encodingTypeAsScala(value: Option[EncodingType]): ListObjectsV2Request.Builder = {
    value.fold(self) { v => self.encodingType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxKeysAsScala(value: Option[Int]): ListObjectsV2Request.Builder = {
    value.fold(self) { v => self.maxKeys(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixAsScala(value: Option[String]): ListObjectsV2Request.Builder = {
    value.fold(self) { v => self.prefix(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def continuationTokenAsScala(value: Option[String]): ListObjectsV2Request.Builder = {
    value.fold(self) { v => self.continuationToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fetchOwnerAsScala(value: Option[Boolean]): ListObjectsV2Request.Builder = {
    value.fold(self) { v => self.fetchOwner(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startAfterAsScala(value: Option[String]): ListObjectsV2Request.Builder = {
    value.fold(self) { v => self.startAfter(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestPayerAsScala(value: Option[RequestPayer]): ListObjectsV2Request.Builder = {
    value.fold(self) { v => self.requestPayer(v) }
  }

}

final class ListObjectsV2RequestOps(val self: ListObjectsV2Request) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def delimiterAsScala: Option[String] = Option(self.delimiter)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encodingTypeAsScala: Option[EncodingType] = Option(self.encodingType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxKeysAsScala: Option[Int] = Option(self.maxKeys)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixAsScala: Option[String] = Option(self.prefix)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def continuationTokenAsScala: Option[String] = Option(self.continuationToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fetchOwnerAsScala: Option[Boolean] = Option(self.fetchOwner)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startAfterAsScala: Option[String] = Option(self.startAfter)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListObjectsV2RequestOps {

  implicit def toListObjectsV2RequestBuilderOps(v: ListObjectsV2Request.Builder): ListObjectsV2RequestBuilderOps =
    new ListObjectsV2RequestBuilderOps(v)

  implicit def toListObjectsV2RequestOps(v: ListObjectsV2Request): ListObjectsV2RequestOps =
    new ListObjectsV2RequestOps(v)

}
