// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class BoundingBoxBuilderOps(val self: BoundingBox.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def widthAsScala(value: Option[Float]): BoundingBox.Builder = {
    value.fold(self) { v => self.width(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def heightAsScala(value: Option[Float]): BoundingBox.Builder = {
    value.fold(self) { v => self.height(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def leftAsScala(value: Option[Float]): BoundingBox.Builder = {
    value.fold(self) { v => self.left(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def topAsScala(value: Option[Float]): BoundingBox.Builder = {
    value.fold(self) { v => self.top(v) }
  }

}

final class BoundingBoxOps(val self: BoundingBox) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def widthAsScala: Option[Float] = Option(self.width)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def heightAsScala: Option[Float] = Option(self.height)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def leftAsScala: Option[Float] = Option(self.left)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def topAsScala: Option[Float] = Option(self.top)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBoundingBoxOps {

  implicit def toBoundingBoxBuilderOps(v: BoundingBox.Builder): BoundingBoxBuilderOps = new BoundingBoxBuilderOps(v)

  implicit def toBoundingBoxOps(v: BoundingBox): BoundingBoxOps = new BoundingBoxOps(v)

}
