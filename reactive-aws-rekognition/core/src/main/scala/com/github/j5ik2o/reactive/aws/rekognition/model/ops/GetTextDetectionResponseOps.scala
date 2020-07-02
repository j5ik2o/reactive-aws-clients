// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class GetTextDetectionResponseBuilderOps(val self: GetTextDetectionResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobStatusAsScala(value: Option[VideoJobStatus]): GetTextDetectionResponse.Builder = {
    value.fold(self) { v => self.jobStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala(value: Option[String]): GetTextDetectionResponse.Builder = {
    value.fold(self) { v => self.statusMessage(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def videoMetadataAsScala(value: Option[VideoMetadata]): GetTextDetectionResponse.Builder = {
    value.fold(self) { v => self.videoMetadata(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def textDetectionsAsScala(value: Option[Seq[TextDetectionResult]]): GetTextDetectionResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.textDetections(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): GetTextDetectionResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def textModelVersionAsScala(value: Option[String]): GetTextDetectionResponse.Builder = {
    value.fold(self) { v => self.textModelVersion(v) }
  }

}

final class GetTextDetectionResponseOps(val self: GetTextDetectionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobStatusAsScala: Option[VideoJobStatus] = Option(self.jobStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def videoMetadataAsScala: Option[VideoMetadata] = Option(self.videoMetadata)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def textDetectionsAsScala: Option[Seq[TextDetectionResult]] =
    Option(self.textDetections).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def textModelVersionAsScala: Option[String] = Option(self.textModelVersion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetTextDetectionResponseOps {

  implicit def toGetTextDetectionResponseBuilderOps(
      v: GetTextDetectionResponse.Builder
  ): GetTextDetectionResponseBuilderOps = new GetTextDetectionResponseBuilderOps(v)

  implicit def toGetTextDetectionResponseOps(v: GetTextDetectionResponse): GetTextDetectionResponseOps =
    new GetTextDetectionResponseOps(v)

}
