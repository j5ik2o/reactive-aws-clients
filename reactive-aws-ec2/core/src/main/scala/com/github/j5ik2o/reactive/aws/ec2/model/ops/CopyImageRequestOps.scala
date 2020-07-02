// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CopyImageRequestBuilderOps(val self: CopyImageRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): CopyImageRequest.Builder = {
    value.fold(self) { v => self.clientToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): CopyImageRequest.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptedAsScala(value: Option[Boolean]): CopyImageRequest.Builder = {
    value.fold(self) { v => self.encrypted(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyIdAsScala(value: Option[String]): CopyImageRequest.Builder = {
    value.fold(self) { v => self.kmsKeyId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): CopyImageRequest.Builder = {
    value.fold(self) { v => self.name(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceImageIdAsScala(value: Option[String]): CopyImageRequest.Builder = {
    value.fold(self) { v => self.sourceImageId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceRegionAsScala(value: Option[String]): CopyImageRequest.Builder = {
    value.fold(self) { v => self.sourceRegion(v) }
  }

}

final class CopyImageRequestOps(val self: CopyImageRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptedAsScala: Option[Boolean] = Option(self.encrypted)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyIdAsScala: Option[String] = Option(self.kmsKeyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceImageIdAsScala: Option[String] = Option(self.sourceImageId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceRegionAsScala: Option[String] = Option(self.sourceRegion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCopyImageRequestOps {

  implicit def toCopyImageRequestBuilderOps(v: CopyImageRequest.Builder): CopyImageRequestBuilderOps =
    new CopyImageRequestBuilderOps(v)

  implicit def toCopyImageRequestOps(v: CopyImageRequest): CopyImageRequestOps = new CopyImageRequestOps(v)

}
