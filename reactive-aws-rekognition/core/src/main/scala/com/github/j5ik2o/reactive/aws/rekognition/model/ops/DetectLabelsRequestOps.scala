// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DetectLabelsRequestBuilderOps(val self: DetectLabelsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageAsScala(value: Option[Image]): DetectLabelsRequest.Builder = {
    value.fold(self) { v =>
      self.image(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxLabelsAsScala(value: Option[Int]): DetectLabelsRequest.Builder = {
    value.fold(self) { v =>
      self.maxLabels(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minConfidenceAsScala(value: Option[Float]): DetectLabelsRequest.Builder = {
    value.fold(self) { v =>
      self.minConfidence(v)
    }
  }

}

final class DetectLabelsRequestOps(val self: DetectLabelsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageAsScala: Option[Image] = Option(self.image)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxLabelsAsScala: Option[Int] = Option(self.maxLabels)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minConfidenceAsScala: Option[Float] = Option(self.minConfidence)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDetectLabelsRequestOps {

  implicit def toDetectLabelsRequestBuilderOps(v: DetectLabelsRequest.Builder): DetectLabelsRequestBuilderOps =
    new DetectLabelsRequestBuilderOps(v)

  implicit def toDetectLabelsRequestOps(v: DetectLabelsRequest): DetectLabelsRequestOps = new DetectLabelsRequestOps(v)

}
