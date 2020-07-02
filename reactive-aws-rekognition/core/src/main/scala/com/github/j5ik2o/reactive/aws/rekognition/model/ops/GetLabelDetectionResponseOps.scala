// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class GetLabelDetectionResponseBuilderOps(val self: GetLabelDetectionResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobStatusAsScala(value: Option[VideoJobStatus]): GetLabelDetectionResponse.Builder = {
    value.fold(self) { v => self.jobStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala(value: Option[String]): GetLabelDetectionResponse.Builder = {
    value.fold(self) { v => self.statusMessage(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def videoMetadataAsScala(value: Option[VideoMetadata]): GetLabelDetectionResponse.Builder = {
    value.fold(self) { v => self.videoMetadata(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): GetLabelDetectionResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def labelsAsScala(value: Option[Seq[LabelDetection]]): GetLabelDetectionResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.labels(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def labelModelVersionAsScala(value: Option[String]): GetLabelDetectionResponse.Builder = {
    value.fold(self) { v => self.labelModelVersion(v) }
  }

}

final class GetLabelDetectionResponseOps(val self: GetLabelDetectionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobStatusAsScala: Option[VideoJobStatus] = Option(self.jobStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def videoMetadataAsScala: Option[VideoMetadata] = Option(self.videoMetadata)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def labelsAsScala: Option[Seq[LabelDetection]] =
    Option(self.labels).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def labelModelVersionAsScala: Option[String] = Option(self.labelModelVersion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetLabelDetectionResponseOps {

  implicit def toGetLabelDetectionResponseBuilderOps(
      v: GetLabelDetectionResponse.Builder
  ): GetLabelDetectionResponseBuilderOps = new GetLabelDetectionResponseBuilderOps(v)

  implicit def toGetLabelDetectionResponseOps(v: GetLabelDetectionResponse): GetLabelDetectionResponseOps =
    new GetLabelDetectionResponseOps(v)

}
