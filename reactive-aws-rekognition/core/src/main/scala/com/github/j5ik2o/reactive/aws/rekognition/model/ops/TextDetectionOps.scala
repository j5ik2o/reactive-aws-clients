// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class TextDetectionBuilderOps(val self: TextDetection.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def detectedTextAsScala(value: Option[String]): TextDetection.Builder = {
    value.fold(self) { v => self.detectedText(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[TextTypes]): TextDetection.Builder = {
    value.fold(self) { v => self.`type`(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala(value: Option[Int]): TextDetection.Builder = {
    value.fold(self) { v => self.id(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parentIdAsScala(value: Option[Int]): TextDetection.Builder = {
    value.fold(self) { v => self.parentId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala(value: Option[Float]): TextDetection.Builder = {
    value.fold(self) { v => self.confidence(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def geometryAsScala(value: Option[Geometry]): TextDetection.Builder = {
    value.fold(self) { v => self.geometry(v) }
  }

}

final class TextDetectionOps(val self: TextDetection) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def detectedTextAsScala: Option[String] = Option(self.detectedText)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[TextTypes] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala: Option[Int] = Option(self.id)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parentIdAsScala: Option[Int] = Option(self.parentId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala: Option[Float] = Option(self.confidence)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def geometryAsScala: Option[Geometry] = Option(self.geometry)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTextDetectionOps {

  implicit def toTextDetectionBuilderOps(v: TextDetection.Builder): TextDetectionBuilderOps =
    new TextDetectionBuilderOps(v)

  implicit def toTextDetectionOps(v: TextDetection): TextDetectionOps = new TextDetectionOps(v)

}
