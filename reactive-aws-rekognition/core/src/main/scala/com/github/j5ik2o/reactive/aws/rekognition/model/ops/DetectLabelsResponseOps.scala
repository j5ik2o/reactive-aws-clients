// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DetectLabelsResponseBuilderOps(val self: DetectLabelsResponse.Builder) extends AnyVal {

  final def labelsAsScala(value: Option[Seq[Label]]): DetectLabelsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.labels(v.asJava)
    }
  }

  final def orientationCorrectionAsScala(value: Option[OrientationCorrection]): DetectLabelsResponse.Builder = {
    value.fold(self) { v =>
      self.orientationCorrection(v)
    }
  }

  final def labelModelVersionAsScala(value: Option[String]): DetectLabelsResponse.Builder = {
    value.fold(self) { v =>
      self.labelModelVersion(v)
    }
  }

}

final class DetectLabelsResponseOps(val self: DetectLabelsResponse) extends AnyVal {

  final def labelsAsScala: Option[Seq[Label]] = Option(self.labels).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def orientationCorrectionAsScala: Option[OrientationCorrection] = Option(self.orientationCorrection)

  final def labelModelVersionAsScala: Option[String] = Option(self.labelModelVersion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDetectLabelsResponseOps {

  implicit def toDetectLabelsResponseBuilderOps(v: DetectLabelsResponse.Builder): DetectLabelsResponseBuilderOps =
    new DetectLabelsResponseBuilderOps(v)

  implicit def toDetectLabelsResponseOps(v: DetectLabelsResponse): DetectLabelsResponseOps =
    new DetectLabelsResponseOps(v)

}
