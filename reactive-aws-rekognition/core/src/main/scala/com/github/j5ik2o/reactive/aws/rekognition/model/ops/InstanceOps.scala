// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class InstanceBuilderOps(val self: Instance.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def boundingBoxAsScala(value: Option[BoundingBox]): Instance.Builder = {
    value.fold(self) { v =>
      self.boundingBox(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala(value: Option[Float]): Instance.Builder = {
    value.fold(self) { v =>
      self.confidence(v)
    }
  }

}

final class InstanceOps(val self: Instance) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def boundingBoxAsScala: Option[BoundingBox] = Option(self.boundingBox)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala: Option[Float] = Option(self.confidence)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceOps {

  implicit def toInstanceBuilderOps(v: Instance.Builder): InstanceBuilderOps = new InstanceBuilderOps(v)

  implicit def toInstanceOps(v: Instance): InstanceOps = new InstanceOps(v)

}
