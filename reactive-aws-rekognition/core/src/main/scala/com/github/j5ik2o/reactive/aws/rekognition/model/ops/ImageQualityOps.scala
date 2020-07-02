// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class ImageQualityBuilderOps(val self: ImageQuality.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def brightnessAsScala(value: Option[Float]): ImageQuality.Builder = {
    value.fold(self) { v => self.brightness(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sharpnessAsScala(value: Option[Float]): ImageQuality.Builder = {
    value.fold(self) { v => self.sharpness(v) }
  }

}

final class ImageQualityOps(val self: ImageQuality) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def brightnessAsScala: Option[Float] = Option(self.brightness)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sharpnessAsScala: Option[Float] = Option(self.sharpness)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImageQualityOps {

  implicit def toImageQualityBuilderOps(v: ImageQuality.Builder): ImageQualityBuilderOps = new ImageQualityBuilderOps(v)

  implicit def toImageQualityOps(v: ImageQuality): ImageQualityOps = new ImageQualityOps(v)

}
