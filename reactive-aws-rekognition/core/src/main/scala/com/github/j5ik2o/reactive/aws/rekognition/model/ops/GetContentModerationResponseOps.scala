// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class GetContentModerationResponseBuilderOps(val self: GetContentModerationResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobStatusAsScala(value: Option[VideoJobStatus]): GetContentModerationResponse.Builder = {
    value.fold(self) { v =>
      self.jobStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala(value: Option[String]): GetContentModerationResponse.Builder = {
    value.fold(self) { v =>
      self.statusMessage(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def videoMetadataAsScala(value: Option[VideoMetadata]): GetContentModerationResponse.Builder = {
    value.fold(self) { v =>
      self.videoMetadata(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def moderationLabelsAsScala(
      value: Option[Seq[ContentModerationDetection]]
  ): GetContentModerationResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.moderationLabels(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): GetContentModerationResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def moderationModelVersionAsScala(value: Option[String]): GetContentModerationResponse.Builder = {
    value.fold(self) { v =>
      self.moderationModelVersion(v)
    }
  }

}

final class GetContentModerationResponseOps(val self: GetContentModerationResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobStatusAsScala: Option[VideoJobStatus] = Option(self.jobStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def videoMetadataAsScala: Option[VideoMetadata] = Option(self.videoMetadata)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def moderationLabelsAsScala: Option[Seq[ContentModerationDetection]] = Option(self.moderationLabels).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def moderationModelVersionAsScala: Option[String] = Option(self.moderationModelVersion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetContentModerationResponseOps {

  implicit def toGetContentModerationResponseBuilderOps(
      v: GetContentModerationResponse.Builder
  ): GetContentModerationResponseBuilderOps = new GetContentModerationResponseBuilderOps(v)

  implicit def toGetContentModerationResponseOps(v: GetContentModerationResponse): GetContentModerationResponseOps =
    new GetContentModerationResponseOps(v)

}
