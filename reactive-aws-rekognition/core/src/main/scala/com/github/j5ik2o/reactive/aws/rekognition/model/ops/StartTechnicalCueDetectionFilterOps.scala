// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class StartTechnicalCueDetectionFilterBuilderOps(val self: StartTechnicalCueDetectionFilter.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minSegmentConfidenceAsScala(value: Option[Float]): StartTechnicalCueDetectionFilter.Builder = {
    value.fold(self) { v => self.minSegmentConfidence(v) }
  }

}

final class StartTechnicalCueDetectionFilterOps(val self: StartTechnicalCueDetectionFilter) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minSegmentConfidenceAsScala: Option[Float] = Option(self.minSegmentConfidence)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartTechnicalCueDetectionFilterOps {

  implicit def toStartTechnicalCueDetectionFilterBuilderOps(
      v: StartTechnicalCueDetectionFilter.Builder
  ): StartTechnicalCueDetectionFilterBuilderOps = new StartTechnicalCueDetectionFilterBuilderOps(v)

  implicit def toStartTechnicalCueDetectionFilterOps(
      v: StartTechnicalCueDetectionFilter
  ): StartTechnicalCueDetectionFilterOps = new StartTechnicalCueDetectionFilterOps(v)

}
