// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class PlacementConstraintBuilderOps(val self: PlacementConstraint.Builder) extends AnyVal {

  final def typeAsScala(value: Option[PlacementConstraintType]): PlacementConstraint.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  final def expressionAsScala(value: Option[String]): PlacementConstraint.Builder = {
    value.fold(self) { v =>
      self.expression(v)
    }
  }

}

final class PlacementConstraintOps(val self: PlacementConstraint) extends AnyVal {

  final def typeAsScala: Option[PlacementConstraintType] = Option(self.`type`)

  final def expressionAsScala: Option[String] = Option(self.expression)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPlacementConstraintOps {

  implicit def toPlacementConstraintBuilderOps(v: PlacementConstraint.Builder): PlacementConstraintBuilderOps =
    new PlacementConstraintBuilderOps(v)

  implicit def toPlacementConstraintOps(v: PlacementConstraint): PlacementConstraintOps = new PlacementConstraintOps(v)

}
