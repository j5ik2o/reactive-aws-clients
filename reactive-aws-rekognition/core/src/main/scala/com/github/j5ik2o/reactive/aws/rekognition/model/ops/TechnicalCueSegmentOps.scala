// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class TechnicalCueSegmentBuilderOps(val self: TechnicalCueSegment.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[TechnicalCueType]): TechnicalCueSegment.Builder = {
    value.fold(self) { v => self.`type`(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala(value: Option[Float]): TechnicalCueSegment.Builder = {
    value.fold(self) { v => self.confidence(v) }
  }

}

final class TechnicalCueSegmentOps(val self: TechnicalCueSegment) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[TechnicalCueType] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala: Option[Float] = Option(self.confidence)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTechnicalCueSegmentOps {

  implicit def toTechnicalCueSegmentBuilderOps(v: TechnicalCueSegment.Builder): TechnicalCueSegmentBuilderOps =
    new TechnicalCueSegmentBuilderOps(v)

  implicit def toTechnicalCueSegmentOps(v: TechnicalCueSegment): TechnicalCueSegmentOps = new TechnicalCueSegmentOps(v)

}
