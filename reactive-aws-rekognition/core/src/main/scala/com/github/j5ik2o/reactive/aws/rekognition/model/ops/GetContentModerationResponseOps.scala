// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class GetContentModerationResponseBuilderOps(val self: GetContentModerationResponse.Builder) extends AnyVal {

  final def jobStatusAsScala(value: Option[VideoJobStatus]): GetContentModerationResponse.Builder = {
    value.fold(self) { v =>
      self.jobStatus(v)
    }
  }

  final def statusMessageAsScala(value: Option[String]): GetContentModerationResponse.Builder = {
    value.fold(self) { v =>
      self.statusMessage(v)
    }
  }

  final def videoMetadataAsScala(value: Option[VideoMetadata]): GetContentModerationResponse.Builder = {
    value.fold(self) { v =>
      self.videoMetadata(v)
    }
  }

  final def moderationLabelsAsScala(
      value: Option[Seq[ContentModerationDetection]]
  ): GetContentModerationResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.moderationLabels(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): GetContentModerationResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def moderationModelVersionAsScala(value: Option[String]): GetContentModerationResponse.Builder = {
    value.fold(self) { v =>
      self.moderationModelVersion(v)
    }
  }

}

final class GetContentModerationResponseOps(val self: GetContentModerationResponse) extends AnyVal {

  final def jobStatusAsScala: Option[VideoJobStatus] = Option(self.jobStatus)

  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  final def videoMetadataAsScala: Option[VideoMetadata] = Option(self.videoMetadata)

  final def moderationLabelsAsScala: Option[Seq[ContentModerationDetection]] = Option(self.moderationLabels).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

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
