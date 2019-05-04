// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class BoundingBoxBuilderOps(val self: BoundingBox.Builder) extends AnyVal {

  final def widthAsScala(value: Option[Float]): BoundingBox.Builder = {
    value.fold(self) { v =>
      self.width(v)
    }
  }

  final def heightAsScala(value: Option[Float]): BoundingBox.Builder = {
    value.fold(self) { v =>
      self.height(v)
    }
  }

  final def leftAsScala(value: Option[Float]): BoundingBox.Builder = {
    value.fold(self) { v =>
      self.left(v)
    }
  }

  final def topAsScala(value: Option[Float]): BoundingBox.Builder = {
    value.fold(self) { v =>
      self.top(v)
    }
  }

}

final class BoundingBoxOps(val self: BoundingBox) extends AnyVal {

  final def widthAsScala: Option[Float] = Option(self.width)

  final def heightAsScala: Option[Float] = Option(self.height)

  final def leftAsScala: Option[Float] = Option(self.left)

  final def topAsScala: Option[Float] = Option(self.top)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBoundingBoxOps {

  implicit def toBoundingBoxBuilderOps(v: BoundingBox.Builder): BoundingBoxBuilderOps = new BoundingBoxBuilderOps(v)

  implicit def toBoundingBoxOps(v: BoundingBox): BoundingBoxOps = new BoundingBoxOps(v)

}
