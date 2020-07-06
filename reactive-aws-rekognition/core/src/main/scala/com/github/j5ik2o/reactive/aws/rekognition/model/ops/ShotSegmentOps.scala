// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class ShotSegmentBuilderOps(val self: ShotSegment.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexAsScala(value: Option[Long]): ShotSegment.Builder = {
    value.fold(self) { v => self.index(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala(value: Option[Float]): ShotSegment.Builder = {
    value.fold(self) { v => self.confidence(v) }
  }

}

final class ShotSegmentOps(val self: ShotSegment) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexAsScala: Option[Long] = Option(self.index)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala: Option[Float] = Option(self.confidence)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToShotSegmentOps {

  implicit def toShotSegmentBuilderOps(v: ShotSegment.Builder): ShotSegmentBuilderOps = new ShotSegmentBuilderOps(v)

  implicit def toShotSegmentOps(v: ShotSegment): ShotSegmentOps = new ShotSegmentOps(v)

}
