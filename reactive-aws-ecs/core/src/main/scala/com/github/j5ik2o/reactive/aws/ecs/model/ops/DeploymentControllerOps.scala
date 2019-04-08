// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DeploymentControllerBuilderOps(val self: DeploymentController.Builder) extends AnyVal {

  final def typeAsScala(value: Option[DeploymentControllerType]): DeploymentController.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

}

final class DeploymentControllerOps(val self: DeploymentController) extends AnyVal {

  final def typeAsScala: Option[DeploymentControllerType] = Option(self.`type`)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeploymentControllerOps {

  implicit def toDeploymentControllerBuilderOps(v: DeploymentController.Builder): DeploymentControllerBuilderOps =
    new DeploymentControllerBuilderOps(v)

  implicit def toDeploymentControllerOps(v: DeploymentController): DeploymentControllerOps =
    new DeploymentControllerOps(v)

}
