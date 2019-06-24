// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class BeardBuilderOps(val self: Beard.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[Boolean]): Beard.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala(value: Option[Float]): Beard.Builder = {
    value.fold(self) { v =>
      self.confidence(v)
    }
  }

}

final class BeardOps(val self: Beard) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[Boolean] = Option(self.value)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala: Option[Float] = Option(self.confidence)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBeardOps {

  implicit def toBeardBuilderOps(v: Beard.Builder): BeardBuilderOps = new BeardBuilderOps(v)

  implicit def toBeardOps(v: Beard): BeardOps = new BeardOps(v)

}
