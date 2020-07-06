// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class StartSegmentDetectionFiltersBuilderOps(val self: StartSegmentDetectionFilters.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def technicalCueFilterAsScala(
      value: Option[StartTechnicalCueDetectionFilter]
  ): StartSegmentDetectionFilters.Builder = {
    value.fold(self) { v => self.technicalCueFilter(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def shotFilterAsScala(value: Option[StartShotDetectionFilter]): StartSegmentDetectionFilters.Builder = {
    value.fold(self) { v => self.shotFilter(v) }
  }

}

final class StartSegmentDetectionFiltersOps(val self: StartSegmentDetectionFilters) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def technicalCueFilterAsScala: Option[StartTechnicalCueDetectionFilter] = Option(self.technicalCueFilter)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def shotFilterAsScala: Option[StartShotDetectionFilter] = Option(self.shotFilter)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartSegmentDetectionFiltersOps {

  implicit def toStartSegmentDetectionFiltersBuilderOps(
      v: StartSegmentDetectionFilters.Builder
  ): StartSegmentDetectionFiltersBuilderOps = new StartSegmentDetectionFiltersBuilderOps(v)

  implicit def toStartSegmentDetectionFiltersOps(v: StartSegmentDetectionFilters): StartSegmentDetectionFiltersOps =
    new StartSegmentDetectionFiltersOps(v)

}
