// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class ContentModerationDetectionBuilderOps(val self: ContentModerationDetection.Builder) extends AnyVal {

  final def timestampAsScala(value: Option[Long]): ContentModerationDetection.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  }

  final def moderationLabelAsScala(value: Option[ModerationLabel]): ContentModerationDetection.Builder = {
    value.fold(self) { v =>
      self.moderationLabel(v)
    }
  }

}

final class ContentModerationDetectionOps(val self: ContentModerationDetection) extends AnyVal {

  final def timestampAsScala: Option[Long] = Option(self.timestamp)

  final def moderationLabelAsScala: Option[ModerationLabel] = Option(self.moderationLabel)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToContentModerationDetectionOps {

  implicit def toContentModerationDetectionBuilderOps(
      v: ContentModerationDetection.Builder
  ): ContentModerationDetectionBuilderOps = new ContentModerationDetectionBuilderOps(v)

  implicit def toContentModerationDetectionOps(v: ContentModerationDetection): ContentModerationDetectionOps =
    new ContentModerationDetectionOps(v)

}
