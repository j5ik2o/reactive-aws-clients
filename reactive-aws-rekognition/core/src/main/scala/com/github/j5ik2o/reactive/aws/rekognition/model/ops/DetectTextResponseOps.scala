// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DetectTextResponseBuilderOps(val self: DetectTextResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def textDetectionsAsScala(value: Option[Seq[TextDetection]]): DetectTextResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.textDetections(v.asJava)
    }
  }

}

final class DetectTextResponseOps(val self: DetectTextResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def textDetectionsAsScala: Option[Seq[TextDetection]] = Option(self.textDetections).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDetectTextResponseOps {

  implicit def toDetectTextResponseBuilderOps(v: DetectTextResponse.Builder): DetectTextResponseBuilderOps =
    new DetectTextResponseBuilderOps(v)

  implicit def toDetectTextResponseOps(v: DetectTextResponse): DetectTextResponseOps = new DetectTextResponseOps(v)

}
