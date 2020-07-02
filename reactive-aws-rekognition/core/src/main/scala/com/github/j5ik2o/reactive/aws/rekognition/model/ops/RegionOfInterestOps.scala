// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class RegionOfInterestBuilderOps(val self: RegionOfInterest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def boundingBoxAsScala(value: Option[BoundingBox]): RegionOfInterest.Builder = {
    value.fold(self) { v => self.boundingBox(v) }
  }

}

final class RegionOfInterestOps(val self: RegionOfInterest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def boundingBoxAsScala: Option[BoundingBox] = Option(self.boundingBox)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRegionOfInterestOps {

  implicit def toRegionOfInterestBuilderOps(v: RegionOfInterest.Builder): RegionOfInterestBuilderOps =
    new RegionOfInterestBuilderOps(v)

  implicit def toRegionOfInterestOps(v: RegionOfInterest): RegionOfInterestOps = new RegionOfInterestOps(v)

}
