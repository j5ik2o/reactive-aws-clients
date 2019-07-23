// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class UpdateServiceRequestBuilderOps(val self: UpdateServiceRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala(value: Option[String]): UpdateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceAsScala(value: Option[String]): UpdateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.service(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def desiredCountAsScala(value: Option[Int]): UpdateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.desiredCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskDefinitionAsScala(value: Option[String]): UpdateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.taskDefinition(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deploymentConfigurationAsScala(value: Option[DeploymentConfiguration]): UpdateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.deploymentConfiguration(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkConfigurationAsScala(value: Option[NetworkConfiguration]): UpdateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.networkConfiguration(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformVersionAsScala(value: Option[String]): UpdateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.platformVersion(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def forceNewDeploymentAsScala(value: Option[Boolean]): UpdateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.forceNewDeployment(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def healthCheckGracePeriodSecondsAsScala(value: Option[Int]): UpdateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.healthCheckGracePeriodSeconds(v)
    }
  }

}

final class UpdateServiceRequestOps(val self: UpdateServiceRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala: Option[String] = Option(self.cluster)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceAsScala: Option[String] = Option(self.service)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def desiredCountAsScala: Option[Int] = Option(self.desiredCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskDefinitionAsScala: Option[String] = Option(self.taskDefinition)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deploymentConfigurationAsScala: Option[DeploymentConfiguration] = Option(self.deploymentConfiguration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkConfigurationAsScala: Option[NetworkConfiguration] = Option(self.networkConfiguration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformVersionAsScala: Option[String] = Option(self.platformVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def forceNewDeploymentAsScala: Option[Boolean] = Option(self.forceNewDeployment)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def healthCheckGracePeriodSecondsAsScala: Option[Int] = Option(self.healthCheckGracePeriodSeconds)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateServiceRequestOps {

  implicit def toUpdateServiceRequestBuilderOps(v: UpdateServiceRequest.Builder): UpdateServiceRequestBuilderOps =
    new UpdateServiceRequestBuilderOps(v)

  implicit def toUpdateServiceRequestOps(v: UpdateServiceRequest): UpdateServiceRequestOps =
    new UpdateServiceRequestOps(v)

}
