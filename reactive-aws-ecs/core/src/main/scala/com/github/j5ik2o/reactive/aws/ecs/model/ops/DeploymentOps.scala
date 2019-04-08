// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DeploymentBuilderOps(val self: Deployment.Builder) extends AnyVal {

  final def idAsScala(value: Option[String]): Deployment.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

  final def statusAsScala(value: Option[String]): Deployment.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def taskDefinitionAsScala(value: Option[String]): Deployment.Builder = {
    value.fold(self) { v =>
      self.taskDefinition(v)
    }
  }

  final def desiredCountAsScala(value: Option[Int]): Deployment.Builder = {
    value.fold(self) { v =>
      self.desiredCount(v)
    }
  }

  final def pendingCountAsScala(value: Option[Int]): Deployment.Builder = {
    value.fold(self) { v =>
      self.pendingCount(v)
    }
  }

  final def runningCountAsScala(value: Option[Int]): Deployment.Builder = {
    value.fold(self) { v =>
      self.runningCount(v)
    }
  }

  final def createdAtAsScala(value: Option[java.time.Instant]): Deployment.Builder = {
    value.fold(self) { v =>
      self.createdAt(v)
    }
  }

  final def updatedAtAsScala(value: Option[java.time.Instant]): Deployment.Builder = {
    value.fold(self) { v =>
      self.updatedAt(v)
    }
  }

  final def launchTypeAsScala(value: Option[LaunchType]): Deployment.Builder = {
    value.fold(self) { v =>
      self.launchType(v)
    }
  }

  final def platformVersionAsScala(value: Option[String]): Deployment.Builder = {
    value.fold(self) { v =>
      self.platformVersion(v)
    }
  }

  final def networkConfigurationAsScala(value: Option[NetworkConfiguration]): Deployment.Builder = {
    value.fold(self) { v =>
      self.networkConfiguration(v)
    }
  }

}

final class DeploymentOps(val self: Deployment) extends AnyVal {

  final def idAsScala: Option[String] = Option(self.id)

  final def statusAsScala: Option[String] = Option(self.status)

  final def taskDefinitionAsScala: Option[String] = Option(self.taskDefinition)

  final def desiredCountAsScala: Option[Int] = Option(self.desiredCount)

  final def pendingCountAsScala: Option[Int] = Option(self.pendingCount)

  final def runningCountAsScala: Option[Int] = Option(self.runningCount)

  final def createdAtAsScala: Option[java.time.Instant] = Option(self.createdAt)

  final def updatedAtAsScala: Option[java.time.Instant] = Option(self.updatedAt)

  final def launchTypeAsScala: Option[LaunchType] = Option(self.launchType)

  final def platformVersionAsScala: Option[String] = Option(self.platformVersion)

  final def networkConfigurationAsScala: Option[NetworkConfiguration] = Option(self.networkConfiguration)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeploymentOps {

  implicit def toDeploymentBuilderOps(v: Deployment.Builder): DeploymentBuilderOps = new DeploymentBuilderOps(v)

  implicit def toDeploymentOps(v: Deployment): DeploymentOps = new DeploymentOps(v)

}
