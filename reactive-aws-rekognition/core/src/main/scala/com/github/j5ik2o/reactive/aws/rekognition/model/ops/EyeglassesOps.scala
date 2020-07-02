// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class EyeglassesBuilderOps(val self: Eyeglasses.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[Boolean]): Eyeglasses.Builder = {
    value.fold(self) { v => self.value(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala(value: Option[Float]): Eyeglasses.Builder = {
    value.fold(self) { v => self.confidence(v) }
  }

}

final class EyeglassesOps(val self: Eyeglasses) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[Boolean] = Option(self.value)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala: Option[Float] = Option(self.confidence)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEyeglassesOps {

  implicit def toEyeglassesBuilderOps(v: Eyeglasses.Builder): EyeglassesBuilderOps = new EyeglassesBuilderOps(v)

  implicit def toEyeglassesOps(v: Eyeglasses): EyeglassesOps = new EyeglassesOps(v)

}
