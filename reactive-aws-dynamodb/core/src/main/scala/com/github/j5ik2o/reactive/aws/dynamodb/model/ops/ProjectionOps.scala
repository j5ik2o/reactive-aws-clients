// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ProjectionBuilderOps(val self: Projection.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectionTypeAsScala(value: Option[ProjectionType]): Projection.Builder = {
    value.fold(self) { v =>
      self.projectionType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nonKeyAttributesAsScala(value: Option[Seq[String]]): Projection.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.nonKeyAttributes(v.asJava)
    }
  }

}

final class ProjectionOps(val self: Projection) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectionTypeAsScala: Option[ProjectionType] = Option(self.projectionType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nonKeyAttributesAsScala: Option[Seq[String]] = Option(self.nonKeyAttributes).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToProjectionOps {

  implicit def toProjectionBuilderOps(v: Projection.Builder): ProjectionBuilderOps = new ProjectionBuilderOps(v)

  implicit def toProjectionOps(v: Projection): ProjectionOps = new ProjectionOps(v)

}
