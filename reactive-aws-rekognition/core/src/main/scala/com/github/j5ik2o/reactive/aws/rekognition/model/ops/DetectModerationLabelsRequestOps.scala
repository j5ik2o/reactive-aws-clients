// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DetectModerationLabelsRequestBuilderOps(val self: DetectModerationLabelsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageAsScala(value: Option[Image]): DetectModerationLabelsRequest.Builder = {
    value.fold(self) { v =>
      self.image(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minConfidenceAsScala(value: Option[Float]): DetectModerationLabelsRequest.Builder = {
    value.fold(self) { v =>
      self.minConfidence(v)
    }
  }

}

final class DetectModerationLabelsRequestOps(val self: DetectModerationLabelsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageAsScala: Option[Image] = Option(self.image)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minConfidenceAsScala: Option[Float] = Option(self.minConfidence)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDetectModerationLabelsRequestOps {

  implicit def toDetectModerationLabelsRequestBuilderOps(
      v: DetectModerationLabelsRequest.Builder
  ): DetectModerationLabelsRequestBuilderOps = new DetectModerationLabelsRequestBuilderOps(v)

  implicit def toDetectModerationLabelsRequestOps(v: DetectModerationLabelsRequest): DetectModerationLabelsRequestOps =
    new DetectModerationLabelsRequestOps(v)

}
