// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class SegmentDetectionBuilderOps(val self: SegmentDetection.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[SegmentType]): SegmentDetection.Builder = {
    value.fold(self) { v => self.`type`(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startTimestampMillisAsScala(value: Option[Long]): SegmentDetection.Builder = {
    value.fold(self) { v => self.startTimestampMillis(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endTimestampMillisAsScala(value: Option[Long]): SegmentDetection.Builder = {
    value.fold(self) { v => self.endTimestampMillis(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def durationMillisAsScala(value: Option[Long]): SegmentDetection.Builder = {
    value.fold(self) { v => self.durationMillis(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startTimecodeSMPTEAsScala(value: Option[String]): SegmentDetection.Builder = {
    value.fold(self) { v => self.startTimecodeSMPTE(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endTimecodeSMPTEAsScala(value: Option[String]): SegmentDetection.Builder = {
    value.fold(self) { v => self.endTimecodeSMPTE(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def durationSMPTEAsScala(value: Option[String]): SegmentDetection.Builder = {
    value.fold(self) { v => self.durationSMPTE(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def technicalCueSegmentAsScala(value: Option[TechnicalCueSegment]): SegmentDetection.Builder = {
    value.fold(self) { v => self.technicalCueSegment(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def shotSegmentAsScala(value: Option[ShotSegment]): SegmentDetection.Builder = {
    value.fold(self) { v => self.shotSegment(v) }
  }

}

final class SegmentDetectionOps(val self: SegmentDetection) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[SegmentType] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startTimestampMillisAsScala: Option[Long] = Option(self.startTimestampMillis)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endTimestampMillisAsScala: Option[Long] = Option(self.endTimestampMillis)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def durationMillisAsScala: Option[Long] = Option(self.durationMillis)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startTimecodeSMPTEAsScala: Option[String] = Option(self.startTimecodeSMPTE)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endTimecodeSMPTEAsScala: Option[String] = Option(self.endTimecodeSMPTE)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def durationSMPTEAsScala: Option[String] = Option(self.durationSMPTE)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def technicalCueSegmentAsScala: Option[TechnicalCueSegment] = Option(self.technicalCueSegment)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def shotSegmentAsScala: Option[ShotSegment] = Option(self.shotSegment)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSegmentDetectionOps {

  implicit def toSegmentDetectionBuilderOps(v: SegmentDetection.Builder): SegmentDetectionBuilderOps =
    new SegmentDetectionBuilderOps(v)

  implicit def toSegmentDetectionOps(v: SegmentDetection): SegmentDetectionOps = new SegmentDetectionOps(v)

}
