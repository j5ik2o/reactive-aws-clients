// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class GetFaceDetectionResponseBuilderOps(val self: GetFaceDetectionResponse.Builder) extends AnyVal {

  final def jobStatusAsScala(value: Option[VideoJobStatus]): GetFaceDetectionResponse.Builder = {
    value.fold(self) { v =>
      self.jobStatus(v)
    }
  }

  final def statusMessageAsScala(value: Option[String]): GetFaceDetectionResponse.Builder = {
    value.fold(self) { v =>
      self.statusMessage(v)
    }
  }

  final def videoMetadataAsScala(value: Option[VideoMetadata]): GetFaceDetectionResponse.Builder = {
    value.fold(self) { v =>
      self.videoMetadata(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): GetFaceDetectionResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def facesAsScala(value: Option[Seq[FaceDetection]]): GetFaceDetectionResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.faces(v.asJava)
    }
  }

}

final class GetFaceDetectionResponseOps(val self: GetFaceDetectionResponse) extends AnyVal {

  final def jobStatusAsScala: Option[VideoJobStatus] = Option(self.jobStatus)

  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  final def videoMetadataAsScala: Option[VideoMetadata] = Option(self.videoMetadata)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def facesAsScala: Option[Seq[FaceDetection]] = Option(self.faces).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetFaceDetectionResponseOps {

  implicit def toGetFaceDetectionResponseBuilderOps(
      v: GetFaceDetectionResponse.Builder
  ): GetFaceDetectionResponseBuilderOps = new GetFaceDetectionResponseBuilderOps(v)

  implicit def toGetFaceDetectionResponseOps(v: GetFaceDetectionResponse): GetFaceDetectionResponseOps =
    new GetFaceDetectionResponseOps(v)

}
