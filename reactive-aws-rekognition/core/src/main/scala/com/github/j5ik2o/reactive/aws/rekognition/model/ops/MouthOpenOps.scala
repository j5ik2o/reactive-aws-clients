// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class MouthOpenBuilderOps(val self: MouthOpen.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[Boolean]): MouthOpen.Builder = {
    value.fold(self) { v => self.value(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala(value: Option[Float]): MouthOpen.Builder = {
    value.fold(self) { v => self.confidence(v) }
  }

}

final class MouthOpenOps(val self: MouthOpen) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[Boolean] = Option(self.value)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala: Option[Float] = Option(self.confidence)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMouthOpenOps {

  implicit def toMouthOpenBuilderOps(v: MouthOpen.Builder): MouthOpenBuilderOps = new MouthOpenBuilderOps(v)

  implicit def toMouthOpenOps(v: MouthOpen): MouthOpenOps = new MouthOpenOps(v)

}
