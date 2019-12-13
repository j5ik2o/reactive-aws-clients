// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DetectModerationLabelsResponseBuilderOps(val self: DetectModerationLabelsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def moderationLabelsAsScala(value: Option[Seq[ModerationLabel]]): DetectModerationLabelsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.moderationLabels(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def moderationModelVersionAsScala(value: Option[String]): DetectModerationLabelsResponse.Builder = {
    value.fold(self) { v =>
      self.moderationModelVersion(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def humanLoopActivationOutputAsScala(
      value: Option[HumanLoopActivationOutput]
  ): DetectModerationLabelsResponse.Builder = {
    value.fold(self) { v =>
      self.humanLoopActivationOutput(v)
    }
  }

}

final class DetectModerationLabelsResponseOps(val self: DetectModerationLabelsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def moderationLabelsAsScala: Option[Seq[ModerationLabel]] = Option(self.moderationLabels).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def moderationModelVersionAsScala: Option[String] = Option(self.moderationModelVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def humanLoopActivationOutputAsScala: Option[HumanLoopActivationOutput] = Option(self.humanLoopActivationOutput)

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
