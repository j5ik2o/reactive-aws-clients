// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class GeometryBuilderOps(val self: Geometry.Builder) extends AnyVal {

  final def boundingBoxAsScala(value: Option[BoundingBox]): Geometry.Builder = {
    value.fold(self) { v =>
      self.boundingBox(v)
    }
  }

  final def polygonAsScala(value: Option[Seq[Point]]): Geometry.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.polygon(v.asJava)
    }
  }

}

final class GeometryOps(val self: Geometry) extends AnyVal {

  final def boundingBoxAsScala: Option[BoundingBox] = Option(self.boundingBox)

  final def polygonAsScala: Option[Seq[Point]] = Option(self.polygon).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGeometryOps {

  implicit def toGeometryBuilderOps(v: Geometry.Builder): GeometryBuilderOps = new GeometryBuilderOps(v)

  implicit def toGeometryOps(v: Geometry): GeometryOps = new GeometryOps(v)

}
