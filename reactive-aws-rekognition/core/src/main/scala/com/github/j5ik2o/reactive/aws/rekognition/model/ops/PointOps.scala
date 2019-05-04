// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class PointBuilderOps(val self: Point.Builder) extends AnyVal {

  final def xAsScala(value: Option[Float]): Point.Builder = {
    value.fold(self) { v =>
      self.x(v)
    }
  }

  final def yAsScala(value: Option[Float]): Point.Builder = {
    value.fold(self) { v =>
      self.y(v)
    }
  }

}

final class PointOps(val self: Point) extends AnyVal {

  final def xAsScala: Option[Float] = Option(self.x)

  final def yAsScala: Option[Float] = Option(self.y)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPointOps {

  implicit def toPointBuilderOps(v: Point.Builder): PointBuilderOps = new PointBuilderOps(v)

  implicit def toPointOps(v: Point): PointOps = new PointOps(v)

}
