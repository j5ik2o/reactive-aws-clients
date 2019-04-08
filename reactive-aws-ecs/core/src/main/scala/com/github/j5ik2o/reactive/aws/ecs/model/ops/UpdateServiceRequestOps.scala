// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class UpdateServiceRequestBuilderOps(val self: UpdateServiceRequest.Builder) extends AnyVal {

  final def clusterAsScala(value: Option[String]): UpdateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

  final def serviceAsScala(value: Option[String]): UpdateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.service(v)
    }
  }

  final def desiredCountAsScala(value: Option[Int]): UpdateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.desiredCount(v)
    }
  }

  final def taskDefinitionAsScala(value: Option[String]): UpdateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.taskDefinition(v)
    }
  }

  final def deploymentConfigurationAsScala(value: Option[DeploymentConfiguration]): UpdateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.deploymentConfiguration(v)
    }
  }

  final def networkConfigurationAsScala(value: Option[NetworkConfiguration]): UpdateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.networkConfiguration(v)
    }
  }

  final def platformVersionAsScala(value: Option[String]): UpdateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.platformVersion(v)
    }
  }

  final def forceNewDeploymentAsScala(value: Option[Boolean]): UpdateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.forceNewDeployment(v)
    }
  }

  final def healthCheckGracePeriodSecondsAsScala(value: Option[Int]): UpdateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.healthCheckGracePeriodSeconds(v)
    }
  }

}

final class UpdateServiceRequestOps(val self: UpdateServiceRequest) extends AnyVal {

  final def clusterAsScala: Option[String] = Option(self.cluster)

  final def serviceAsScala: Option[String] = Option(self.service)

  final def desiredCountAsScala: Option[Int] = Option(self.desiredCount)

  final def taskDefinitionAsScala: Option[String] = Option(self.taskDefinition)

  final def deploymentConfigurationAsScala: Option[DeploymentConfiguration] = Option(self.deploymentConfiguration)

  final def networkConfigurationAsScala: Option[NetworkConfiguration] = Option(self.networkConfiguration)

  final def platformVersionAsScala: Option[String] = Option(self.platformVersion)

  final def forceNewDeploymentAsScala: Option[Boolean] = Option(self.forceNewDeployment)

  final def healthCheckGracePeriodSecondsAsScala: Option[Int] = Option(self.healthCheckGracePeriodSeconds)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateServiceRequestOps {

  implicit def toUpdateServiceRequestBuilderOps(v: UpdateServiceRequest.Builder): UpdateServiceRequestBuilderOps =
    new UpdateServiceRequestBuilderOps(v)

  implicit def toUpdateServiceRequestOps(v: UpdateServiceRequest): UpdateServiceRequestOps =
    new UpdateServiceRequestOps(v)

}
