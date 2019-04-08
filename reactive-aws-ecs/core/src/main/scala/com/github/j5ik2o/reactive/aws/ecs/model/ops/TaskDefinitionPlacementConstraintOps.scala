// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class TaskDefinitionPlacementConstraintBuilderOps(val self: TaskDefinitionPlacementConstraint.Builder)
    extends AnyVal {

  final def typeAsScala(
      value: Option[TaskDefinitionPlacementConstraintType]
  ): TaskDefinitionPlacementConstraint.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  final def expressionAsScala(value: Option[String]): TaskDefinitionPlacementConstraint.Builder = {
    value.fold(self) { v =>
      self.expression(v)
    }
  }

}

final class TaskDefinitionPlacementConstraintOps(val self: TaskDefinitionPlacementConstraint) extends AnyVal {

  final def typeAsScala: Option[TaskDefinitionPlacementConstraintType] = Option(self.`type`)

  final def expressionAsScala: Option[String] = Option(self.expression)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTaskDefinitionPlacementConstraintOps {

  implicit def toTaskDefinitionPlacementConstraintBuilderOps(
      v: TaskDefinitionPlacementConstraint.Builder
  ): TaskDefinitionPlacementConstraintBuilderOps = new TaskDefinitionPlacementConstraintBuilderOps(v)

  implicit def toTaskDefinitionPlacementConstraintOps(
      v: TaskDefinitionPlacementConstraint
  ): TaskDefinitionPlacementConstraintOps = new TaskDefinitionPlacementConstraintOps(v)

}
