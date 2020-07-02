// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class SunglassesBuilderOps(val self: Sunglasses.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[Boolean]): Sunglasses.Builder = {
    value.fold(self) { v => self.value(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala(value: Option[Float]): Sunglasses.Builder = {
    value.fold(self) { v => self.confidence(v) }
  }

}

final class SunglassesOps(val self: Sunglasses) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[Boolean] = Option(self.value)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala: Option[Float] = Option(self.confidence)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSunglassesOps {

  implicit def toSunglassesBuilderOps(v: Sunglasses.Builder): SunglassesBuilderOps = new SunglassesBuilderOps(v)

  implicit def toSunglassesOps(v: Sunglasses): SunglassesOps = new SunglassesOps(v)

}
