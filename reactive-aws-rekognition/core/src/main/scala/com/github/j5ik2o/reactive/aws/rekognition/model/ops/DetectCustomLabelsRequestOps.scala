// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DetectCustomLabelsRequestBuilderOps(val self: DetectCustomLabelsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectVersionArnAsScala(value: Option[String]): DetectCustomLabelsRequest.Builder = {
    value.fold(self) { v => self.projectVersionArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageAsScala(value: Option[Image]): DetectCustomLabelsRequest.Builder = {
    value.fold(self) { v => self.image(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DetectCustomLabelsRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minConfidenceAsScala(value: Option[Float]): DetectCustomLabelsRequest.Builder = {
    value.fold(self) { v => self.minConfidence(v) }
  }

}

final class DetectCustomLabelsRequestOps(val self: DetectCustomLabelsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectVersionArnAsScala: Option[String] = Option(self.projectVersionArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageAsScala: Option[Image] = Option(self.image)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minConfidenceAsScala: Option[Float] = Option(self.minConfidence)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDetectCustomLabelsRequestOps {

  implicit def toDetectCustomLabelsRequestBuilderOps(
      v: DetectCustomLabelsRequest.Builder
  ): DetectCustomLabelsRequestBuilderOps = new DetectCustomLabelsRequestBuilderOps(v)

  implicit def toDetectCustomLabelsRequestOps(v: DetectCustomLabelsRequest): DetectCustomLabelsRequestOps =
    new DetectCustomLabelsRequestOps(v)

}
