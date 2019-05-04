// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class EyeOpenBuilderOps(val self: EyeOpen.Builder) extends AnyVal {

  final def valueAsScala(value: Option[Boolean]): EyeOpen.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  }

  final def confidenceAsScala(value: Option[Float]): EyeOpen.Builder = {
    value.fold(self) { v =>
      self.confidence(v)
    }
  }

}

final class EyeOpenOps(val self: EyeOpen) extends AnyVal {

  final def valueAsScala: Option[Boolean] = Option(self.value)

  final def confidenceAsScala: Option[Float] = Option(self.confidence)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEyeOpenOps {

  implicit def toEyeOpenBuilderOps(v: EyeOpen.Builder): EyeOpenBuilderOps = new EyeOpenBuilderOps(v)

  implicit def toEyeOpenOps(v: EyeOpen): EyeOpenOps = new EyeOpenOps(v)

}
