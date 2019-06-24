// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class GenderBuilderOps(val self: Gender.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[GenderType]): Gender.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala(value: Option[Float]): Gender.Builder = {
    value.fold(self) { v =>
      self.confidence(v)
    }
  }

}

final class GenderOps(val self: Gender) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[GenderType] = Option(self.value)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala: Option[Float] = Option(self.confidence)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGenderOps {

  implicit def toGenderBuilderOps(v: Gender.Builder): GenderBuilderOps = new GenderBuilderOps(v)

  implicit def toGenderOps(v: Gender): GenderOps = new GenderOps(v)

}
