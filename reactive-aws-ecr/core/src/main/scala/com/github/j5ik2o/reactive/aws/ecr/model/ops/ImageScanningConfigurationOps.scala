// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class ImageScanningConfigurationBuilderOps(val self: ImageScanningConfiguration.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scanOnPushAsScala(value: Option[Boolean]): ImageScanningConfiguration.Builder = {
    value.fold(self) { v =>
      self.scanOnPush(v)
    }
  }

}

final class ImageScanningConfigurationOps(val self: ImageScanningConfiguration) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scanOnPushAsScala: Option[Boolean] = Option(self.scanOnPush)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImageScanningConfigurationOps {

  implicit def toImageScanningConfigurationBuilderOps(
      v: ImageScanningConfiguration.Builder
  ): ImageScanningConfigurationBuilderOps = new ImageScanningConfigurationBuilderOps(v)

  implicit def toImageScanningConfigurationOps(v: ImageScanningConfiguration): ImageScanningConfigurationOps =
    new ImageScanningConfigurationOps(v)

}
