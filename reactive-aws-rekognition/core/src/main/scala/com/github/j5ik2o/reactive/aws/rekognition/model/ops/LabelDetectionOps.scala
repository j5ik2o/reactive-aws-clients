// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class LabelDetectionBuilderOps(val self: LabelDetection.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampAsScala(value: Option[Long]): LabelDetection.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def labelAsScala(value: Option[Label]): LabelDetection.Builder = {
    value.fold(self) { v =>
      self.label(v)
    }
  }

}

final class LabelDetectionOps(val self: LabelDetection) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampAsScala: Option[Long] = Option(self.timestamp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def labelAsScala: Option[Label] = Option(self.label)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLabelDetectionOps {

  implicit def toLabelDetectionBuilderOps(v: LabelDetection.Builder): LabelDetectionBuilderOps =
    new LabelDetectionBuilderOps(v)

  implicit def toLabelDetectionOps(v: LabelDetection): LabelDetectionOps = new LabelDetectionOps(v)

}
