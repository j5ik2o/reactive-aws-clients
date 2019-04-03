// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ProjectionBuilderOps(val self: Projection.Builder) extends AnyVal {

  final def withProjectionTypeAsScala(value: Option[ProjectionType]): Projection.Builder = {
    value.fold(self) { v =>
      self.projectionType(v)
    }
  } // String

  final def withNonKeyAttributesAsScala(value: Option[Seq[String]]): Projection.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.nonKeyAttributes(v.asJava)
    } // Seq[String]
  }

}

final class ProjectionOps(val self: Projection) extends AnyVal {

  final def projectionTypeAsScala: Option[ProjectionType] = Option(self.projectionType) // String

  final def nonKeyAttributesAsScala: Option[Seq[String]] = Option(self.nonKeyAttributes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToProjectionOps {

  implicit def toProjectionBuilderOps(v: Projection.Builder): ProjectionBuilderOps = new ProjectionBuilderOps(v)

  implicit def toProjectionOps(v: Projection): ProjectionOps = new ProjectionOps(v)

}
