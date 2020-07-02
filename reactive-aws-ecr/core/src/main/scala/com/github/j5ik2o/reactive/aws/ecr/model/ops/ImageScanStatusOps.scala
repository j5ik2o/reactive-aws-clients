// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class ImageScanStatusBuilderOps(val self: ImageScanStatus.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[ScanStatus]): ImageScanStatus.Builder = {
    value.fold(self) { v => self.status(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): ImageScanStatus.Builder = {
    value.fold(self) { v => self.description(v) }
  }

}

final class ImageScanStatusOps(val self: ImageScanStatus) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[ScanStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImageScanStatusOps {

  implicit def toImageScanStatusBuilderOps(v: ImageScanStatus.Builder): ImageScanStatusBuilderOps =
    new ImageScanStatusBuilderOps(v)

  implicit def toImageScanStatusOps(v: ImageScanStatus): ImageScanStatusOps = new ImageScanStatusOps(v)

}
