// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class EmotionBuilderOps(val self: Emotion.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[EmotionName]): Emotion.Builder = {
    value.fold(self) { v => self.`type`(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala(value: Option[Float]): Emotion.Builder = {
    value.fold(self) { v => self.confidence(v) }
  }

}

final class EmotionOps(val self: Emotion) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[EmotionName] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala: Option[Float] = Option(self.confidence)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEmotionOps {

  implicit def toEmotionBuilderOps(v: Emotion.Builder): EmotionBuilderOps = new EmotionBuilderOps(v)

  implicit def toEmotionOps(v: Emotion): EmotionOps = new EmotionOps(v)

}
