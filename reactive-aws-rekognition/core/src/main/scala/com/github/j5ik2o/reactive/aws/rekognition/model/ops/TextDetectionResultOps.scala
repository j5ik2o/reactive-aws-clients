// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class TextDetectionResultBuilderOps(val self: TextDetectionResult.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampAsScala(value: Option[Long]): TextDetectionResult.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def textDetectionAsScala(value: Option[TextDetection]): TextDetectionResult.Builder = {
    value.fold(self) { v =>
      self.textDetection(v)
    }
  }

}

final class TextDetectionResultOps(val self: TextDetectionResult) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampAsScala: Option[Long] = Option(self.timestamp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def textDetectionAsScala: Option[TextDetection] = Option(self.textDetection)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTextDetectionResultOps {

  implicit def toTextDetectionResultBuilderOps(v: TextDetectionResult.Builder): TextDetectionResultBuilderOps =
    new TextDetectionResultBuilderOps(v)

  implicit def toTextDetectionResultOps(v: TextDetectionResult): TextDetectionResultOps = new TextDetectionResultOps(v)

}
