// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetObjectRetentionRequestBuilderOps(val self: GetObjectRetentionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): GetObjectRetentionRequest.Builder = {
    value.fold(self) { v => self.bucket(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala(value: Option[String]): GetObjectRetentionRequest.Builder = {
    value.fold(self) { v => self.key(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionIdAsScala(value: Option[String]): GetObjectRetentionRequest.Builder = {
    value.fold(self) { v => self.versionId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestPayerAsScala(value: Option[RequestPayer]): GetObjectRetentionRequest.Builder = {
    value.fold(self) { v => self.requestPayer(v) }
  }

}

final class GetObjectRetentionRequestOps(val self: GetObjectRetentionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala: Option[String] = Option(self.key)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionIdAsScala: Option[String] = Option(self.versionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetObjectRetentionRequestOps {

  implicit def toGetObjectRetentionRequestBuilderOps(
      v: GetObjectRetentionRequest.Builder
  ): GetObjectRetentionRequestBuilderOps = new GetObjectRetentionRequestBuilderOps(v)

  implicit def toGetObjectRetentionRequestOps(v: GetObjectRetentionRequest): GetObjectRetentionRequestOps =
    new GetObjectRetentionRequestOps(v)

}
