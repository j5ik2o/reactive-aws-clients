// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class StartShotDetectionFilterBuilderOps(val self: StartShotDetectionFilter.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minSegmentConfidenceAsScala(value: Option[Float]): StartShotDetectionFilter.Builder = {
    value.fold(self) { v => self.minSegmentConfidence(v) }
  }

}

final class StartShotDetectionFilterOps(val self: StartShotDetectionFilter) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minSegmentConfidenceAsScala: Option[Float] = Option(self.minSegmentConfidence)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartShotDetectionFilterOps {

  implicit def toStartShotDetectionFilterBuilderOps(
      v: StartShotDetectionFilter.Builder
  ): StartShotDetectionFilterBuilderOps = new StartShotDetectionFilterBuilderOps(v)

  implicit def toStartShotDetectionFilterOps(v: StartShotDetectionFilter): StartShotDetectionFilterOps =
    new StartShotDetectionFilterOps(v)

}
