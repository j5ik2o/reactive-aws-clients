// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DetectModerationLabelsResponseBuilderOps(val self: DetectModerationLabelsResponse.Builder) extends AnyVal {

  final def moderationLabelsAsScala(value: Option[Seq[ModerationLabel]]): DetectModerationLabelsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.moderationLabels(v.asJava)
    }
  }

  final def moderationModelVersionAsScala(value: Option[String]): DetectModerationLabelsResponse.Builder = {
    value.fold(self) { v =>
      self.moderationModelVersion(v)
    }
  }

}

final class DetectModerationLabelsResponseOps(val self: DetectModerationLabelsResponse) extends AnyVal {

  final def moderationLabelsAsScala: Option[Seq[ModerationLabel]] = Option(self.moderationLabels).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def moderationModelVersionAsScala: Option[String] = Option(self.moderationModelVersion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDetectModerationLabelsResponseOps {

  implicit def toDetectModerationLabelsResponseBuilderOps(
      v: DetectModerationLabelsResponse.Builder
  ): DetectModerationLabelsResponseBuilderOps = new DetectModerationLabelsResponseBuilderOps(v)

  implicit def toDetectModerationLabelsResponseOps(
      v: DetectModerationLabelsResponse
  ): DetectModerationLabelsResponseOps = new DetectModerationLabelsResponseOps(v)

}
