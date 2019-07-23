// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class ModerationLabelBuilderOps(val self: ModerationLabel.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala(value: Option[Float]): ModerationLabel.Builder = {
    value.fold(self) { v =>
      self.confidence(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): ModerationLabel.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parentNameAsScala(value: Option[String]): ModerationLabel.Builder = {
    value.fold(self) { v =>
      self.parentName(v)
    }
  }

}

final class ModerationLabelOps(val self: ModerationLabel) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala: Option[Float] = Option(self.confidence)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parentNameAsScala: Option[String] = Option(self.parentName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModerationLabelOps {

  implicit def toModerationLabelBuilderOps(v: ModerationLabel.Builder): ModerationLabelBuilderOps =
    new ModerationLabelBuilderOps(v)

  implicit def toModerationLabelOps(v: ModerationLabel): ModerationLabelOps = new ModerationLabelOps(v)

}
