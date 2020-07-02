// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class InitiateLayerUploadResponseBuilderOps(val self: InitiateLayerUploadResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadIdAsScala(value: Option[String]): InitiateLayerUploadResponse.Builder = {
    value.fold(self) { v => self.uploadId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def partSizeAsScala(value: Option[Long]): InitiateLayerUploadResponse.Builder = {
    value.fold(self) { v => self.partSize(v) }
  }

}

final class InitiateLayerUploadResponseOps(val self: InitiateLayerUploadResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadIdAsScala: Option[String] = Option(self.uploadId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def partSizeAsScala: Option[Long] = Option(self.partSize)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInitiateLayerUploadResponseOps {

  implicit def toInitiateLayerUploadResponseBuilderOps(
      v: InitiateLayerUploadResponse.Builder
  ): InitiateLayerUploadResponseBuilderOps = new InitiateLayerUploadResponseBuilderOps(v)

  implicit def toInitiateLayerUploadResponseOps(v: InitiateLayerUploadResponse): InitiateLayerUploadResponseOps =
    new InitiateLayerUploadResponseOps(v)

}
