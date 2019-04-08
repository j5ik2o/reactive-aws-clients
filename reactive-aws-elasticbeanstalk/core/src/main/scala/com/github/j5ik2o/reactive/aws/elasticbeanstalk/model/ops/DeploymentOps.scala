// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DeploymentBuilderOps(val self: Deployment.Builder) extends AnyVal {

  final def versionLabelAsScala(value: Option[String]): Deployment.Builder = {
    value.fold(self) { v =>
      self.versionLabel(v)
    }
  }

  final def deploymentIdAsScala(value: Option[Long]): Deployment.Builder = {
    value.fold(self) { v =>
      self.deploymentId(v)
    }
  }

  final def statusAsScala(value: Option[String]): Deployment.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def deploymentTimeAsScala(value: Option[java.time.Instant]): Deployment.Builder = {
    value.fold(self) { v =>
      self.deploymentTime(v)
    }
  }

}

final class DeploymentOps(val self: Deployment) extends AnyVal {

  final def versionLabelAsScala: Option[String] = Option(self.versionLabel)

  final def deploymentIdAsScala: Option[Long] = Option(self.deploymentId)

  final def statusAsScala: Option[String] = Option(self.status)

  final def deploymentTimeAsScala: Option[java.time.Instant] = Option(self.deploymentTime)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeploymentOps {

  implicit def toDeploymentBuilderOps(v: Deployment.Builder): DeploymentBuilderOps = new DeploymentBuilderOps(v)

  implicit def toDeploymentOps(v: Deployment): DeploymentOps = new DeploymentOps(v)

}
