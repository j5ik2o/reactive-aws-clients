// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class LandmarkBuilderOps(val self: Landmark.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[LandmarkType]): Landmark.Builder = {
    value.fold(self) { v => self.`type`(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def xAsScala(value: Option[Float]): Landmark.Builder = {
    value.fold(self) { v => self.x(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def yAsScala(value: Option[Float]): Landmark.Builder = {
    value.fold(self) { v => self.y(v) }
  }

}

final class LandmarkOps(val self: Landmark) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[LandmarkType] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def xAsScala: Option[Float] = Option(self.x)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def yAsScala: Option[Float] = Option(self.y)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLandmarkOps {

  implicit def toLandmarkBuilderOps(v: Landmark.Builder): LandmarkBuilderOps = new LandmarkBuilderOps(v)

  implicit def toLandmarkOps(v: Landmark): LandmarkOps = new LandmarkOps(v)

}
