// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DetectionFilterBuilderOps(val self: DetectionFilter.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minConfidenceAsScala(value: Option[Float]): DetectionFilter.Builder = {
    value.fold(self) { v => self.minConfidence(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minBoundingBoxHeightAsScala(value: Option[Float]): DetectionFilter.Builder = {
    value.fold(self) { v => self.minBoundingBoxHeight(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minBoundingBoxWidthAsScala(value: Option[Float]): DetectionFilter.Builder = {
    value.fold(self) { v => self.minBoundingBoxWidth(v) }
  }

}

final class DetectionFilterOps(val self: DetectionFilter) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minConfidenceAsScala: Option[Float] = Option(self.minConfidence)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minBoundingBoxHeightAsScala: Option[Float] = Option(self.minBoundingBoxHeight)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minBoundingBoxWidthAsScala: Option[Float] = Option(self.minBoundingBoxWidth)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDetectionFilterOps {

  implicit def toDetectionFilterBuilderOps(v: DetectionFilter.Builder): DetectionFilterBuilderOps =
    new DetectionFilterBuilderOps(v)

  implicit def toDetectionFilterOps(v: DetectionFilter): DetectionFilterOps = new DetectionFilterOps(v)

}
