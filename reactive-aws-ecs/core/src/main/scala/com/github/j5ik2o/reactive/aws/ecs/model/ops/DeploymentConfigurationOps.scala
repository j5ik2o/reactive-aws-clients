// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DeploymentConfigurationBuilderOps(val self: DeploymentConfiguration.Builder) extends AnyVal {

  final def maximumPercentAsScala(value: Option[Int]): DeploymentConfiguration.Builder = {
    value.fold(self) { v =>
      self.maximumPercent(v)
    }
  }

  final def minimumHealthyPercentAsScala(value: Option[Int]): DeploymentConfiguration.Builder = {
    value.fold(self) { v =>
      self.minimumHealthyPercent(v)
    }
  }

}

final class DeploymentConfigurationOps(val self: DeploymentConfiguration) extends AnyVal {

  final def maximumPercentAsScala: Option[Int] = Option(self.maximumPercent)

  final def minimumHealthyPercentAsScala: Option[Int] = Option(self.minimumHealthyPercent)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeploymentConfigurationOps {

  implicit def toDeploymentConfigurationBuilderOps(
      v: DeploymentConfiguration.Builder
  ): DeploymentConfigurationBuilderOps = new DeploymentConfigurationBuilderOps(v)

  implicit def toDeploymentConfigurationOps(v: DeploymentConfiguration): DeploymentConfigurationOps =
    new DeploymentConfigurationOps(v)

}
