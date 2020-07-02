// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class ImageBuilderOps(val self: Image.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bytesAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): Image.Builder = {
    value.fold(self) { v => self.bytes(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3ObjectAsScala(value: Option[S3Object]): Image.Builder = {
    value.fold(self) { v => self.s3Object(v) }
  }

}

final class ImageOps(val self: Image) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bytesAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.bytes)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3ObjectAsScala: Option[S3Object] = Option(self.s3Object)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImageOps {

  implicit def toImageBuilderOps(v: Image.Builder): ImageBuilderOps = new ImageBuilderOps(v)

  implicit def toImageOps(v: Image): ImageOps = new ImageOps(v)

}
