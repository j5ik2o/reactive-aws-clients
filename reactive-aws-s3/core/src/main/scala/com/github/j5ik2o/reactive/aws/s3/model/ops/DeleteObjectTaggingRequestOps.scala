// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteObjectTaggingRequestBuilderOps(val self: DeleteObjectTaggingRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): DeleteObjectTaggingRequest.Builder = {
    value.fold(self) { v => self.bucket(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala(value: Option[String]): DeleteObjectTaggingRequest.Builder = {
    value.fold(self) { v => self.key(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionIdAsScala(value: Option[String]): DeleteObjectTaggingRequest.Builder = {
    value.fold(self) { v => self.versionId(v) }
  }

}

final class DeleteObjectTaggingRequestOps(val self: DeleteObjectTaggingRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala: Option[String] = Option(self.key)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionIdAsScala: Option[String] = Option(self.versionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteObjectTaggingRequestOps {

  implicit def toDeleteObjectTaggingRequestBuilderOps(
      v: DeleteObjectTaggingRequest.Builder
  ): DeleteObjectTaggingRequestBuilderOps = new DeleteObjectTaggingRequestBuilderOps(v)

  implicit def toDeleteObjectTaggingRequestOps(v: DeleteObjectTaggingRequest): DeleteObjectTaggingRequestOps =
    new DeleteObjectTaggingRequestOps(v)

}
