// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class TextDetectionBuilderOps(val self: TextDetection.Builder) extends AnyVal {

  final def detectedTextAsScala(value: Option[String]): TextDetection.Builder = {
    value.fold(self) { v =>
      self.detectedText(v)
    }
  }

  final def typeAsScala(value: Option[TextTypes]): TextDetection.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  final def idAsScala(value: Option[Int]): TextDetection.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

  final def parentIdAsScala(value: Option[Int]): TextDetection.Builder = {
    value.fold(self) { v =>
      self.parentId(v)
    }
  }

  final def confidenceAsScala(value: Option[Float]): TextDetection.Builder = {
    value.fold(self) { v =>
      self.confidence(v)
    }
  }

  final def geometryAsScala(value: Option[Geometry]): TextDetection.Builder = {
    value.fold(self) { v =>
      self.geometry(v)
    }
  }

}

final class TextDetectionOps(val self: TextDetection) extends AnyVal {

  final def detectedTextAsScala: Option[String] = Option(self.detectedText)

  final def typeAsScala: Option[TextTypes] = Option(self.`type`)

  final def idAsScala: Option[Int] = Option(self.id)

  final def parentIdAsScala: Option[Int] = Option(self.parentId)

  final def confidenceAsScala: Option[Float] = Option(self.confidence)

  final def geometryAsScala: Option[Geometry] = Option(self.geometry)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTextDetectionOps {

  implicit def toTextDetectionBuilderOps(v: TextDetection.Builder): TextDetectionBuilderOps =
    new TextDetectionBuilderOps(v)

  implicit def toTextDetectionOps(v: TextDetection): TextDetectionOps = new TextDetectionOps(v)

}
