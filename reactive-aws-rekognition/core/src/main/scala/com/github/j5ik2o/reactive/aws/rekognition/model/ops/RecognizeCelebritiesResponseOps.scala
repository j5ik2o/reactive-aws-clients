// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class RecognizeCelebritiesResponseBuilderOps(val self: RecognizeCelebritiesResponse.Builder) extends AnyVal {

  final def celebrityFacesAsScala(value: Option[Seq[Celebrity]]): RecognizeCelebritiesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.celebrityFaces(v.asJava)
    }
  }

  final def unrecognizedFacesAsScala(value: Option[Seq[ComparedFace]]): RecognizeCelebritiesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.unrecognizedFaces(v.asJava)
    }
  }

  final def orientationCorrectionAsScala(value: Option[OrientationCorrection]): RecognizeCelebritiesResponse.Builder = {
    value.fold(self) { v =>
      self.orientationCorrection(v)
    }
  }

}

final class RecognizeCelebritiesResponseOps(val self: RecognizeCelebritiesResponse) extends AnyVal {

  final def celebrityFacesAsScala: Option[Seq[Celebrity]] = Option(self.celebrityFaces).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def unrecognizedFacesAsScala: Option[Seq[ComparedFace]] = Option(self.unrecognizedFaces).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def orientationCorrectionAsScala: Option[OrientationCorrection] = Option(self.orientationCorrection)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRecognizeCelebritiesResponseOps {

  implicit def toRecognizeCelebritiesResponseBuilderOps(
      v: RecognizeCelebritiesResponse.Builder
  ): RecognizeCelebritiesResponseBuilderOps = new RecognizeCelebritiesResponseBuilderOps(v)

  implicit def toRecognizeCelebritiesResponseOps(v: RecognizeCelebritiesResponse): RecognizeCelebritiesResponseOps =
    new RecognizeCelebritiesResponseOps(v)

}
