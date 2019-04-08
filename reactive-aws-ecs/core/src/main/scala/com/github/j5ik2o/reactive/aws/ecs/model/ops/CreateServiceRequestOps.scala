// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class CreateServiceRequestBuilderOps(val self: CreateServiceRequest.Builder) extends AnyVal {

  final def clusterAsScala(value: Option[String]): CreateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

  final def serviceNameAsScala(value: Option[String]): CreateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.serviceName(v)
    }
  }

  final def taskDefinitionAsScala(value: Option[String]): CreateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.taskDefinition(v)
    }
  }

  final def loadBalancersAsScala(value: Option[Seq[LoadBalancer]]): CreateServiceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.loadBalancers(v.asJava)
    }
  }

  final def serviceRegistriesAsScala(value: Option[Seq[ServiceRegistry]]): CreateServiceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.serviceRegistries(v.asJava)
    }
  }

  final def desiredCountAsScala(value: Option[Int]): CreateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.desiredCount(v)
    }
  }

  final def clientTokenAsScala(value: Option[String]): CreateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  final def launchTypeAsScala(value: Option[LaunchType]): CreateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.launchType(v)
    }
  }

  final def platformVersionAsScala(value: Option[String]): CreateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.platformVersion(v)
    }
  }

  final def roleAsScala(value: Option[String]): CreateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.role(v)
    }
  }

  final def deploymentConfigurationAsScala(value: Option[DeploymentConfiguration]): CreateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.deploymentConfiguration(v)
    }
  }

  final def placementConstraintsAsScala(value: Option[Seq[PlacementConstraint]]): CreateServiceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.placementConstraints(v.asJava)
    }
  }

  final def placementStrategyAsScala(value: Option[Seq[PlacementStrategy]]): CreateServiceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.placementStrategy(v.asJava)
    }
  }

  final def networkConfigurationAsScala(value: Option[NetworkConfiguration]): CreateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.networkConfiguration(v)
    }
  }

  final def healthCheckGracePeriodSecondsAsScala(value: Option[Int]): CreateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.healthCheckGracePeriodSeconds(v)
    }
  }

  final def schedulingStrategyAsScala(value: Option[SchedulingStrategy]): CreateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.schedulingStrategy(v)
    }
  }

  final def deploymentControllerAsScala(value: Option[DeploymentController]): CreateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.deploymentController(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): CreateServiceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def enableECSManagedTagsAsScala(value: Option[Boolean]): CreateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.enableECSManagedTags(v)
    }
  }

  final def propagateTagsAsScala(value: Option[PropagateTags]): CreateServiceRequest.Builder = {
    value.fold(self) { v =>
      self.propagateTags(v)
    }
  }

}

final class CreateServiceRequestOps(val self: CreateServiceRequest) extends AnyVal {

  final def clusterAsScala: Option[String] = Option(self.cluster)

  final def serviceNameAsScala: Option[String] = Option(self.serviceName)

  final def taskDefinitionAsScala: Option[String] = Option(self.taskDefinition)

  final def loadBalancersAsScala: Option[Seq[LoadBalancer]] = Option(self.loadBalancers).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def serviceRegistriesAsScala: Option[Seq[ServiceRegistry]] = Option(self.serviceRegistries).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def desiredCountAsScala: Option[Int] = Option(self.desiredCount)

  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  final def launchTypeAsScala: Option[LaunchType] = Option(self.launchType)

  final def platformVersionAsScala: Option[String] = Option(self.platformVersion)

  final def roleAsScala: Option[String] = Option(self.role)

  final def deploymentConfigurationAsScala: Option[DeploymentConfiguration] = Option(self.deploymentConfiguration)

  final def placementConstraintsAsScala: Option[Seq[PlacementConstraint]] = Option(self.placementConstraints).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def placementStrategyAsScala: Option[Seq[PlacementStrategy]] = Option(self.placementStrategy).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def networkConfigurationAsScala: Option[NetworkConfiguration] = Option(self.networkConfiguration)

  final def healthCheckGracePeriodSecondsAsScala: Option[Int] = Option(self.healthCheckGracePeriodSeconds)

  final def schedulingStrategyAsScala: Option[SchedulingStrategy] = Option(self.schedulingStrategy)

  final def deploymentControllerAsScala: Option[DeploymentController] = Option(self.deploymentController)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def enableECSManagedTagsAsScala: Option[Boolean] = Option(self.enableECSManagedTags)

  final def propagateTagsAsScala: Option[PropagateTags] = Option(self.propagateTags)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateServiceRequestOps {

  implicit def toCreateServiceRequestBuilderOps(v: CreateServiceRequest.Builder): CreateServiceRequestBuilderOps =
    new CreateServiceRequestBuilderOps(v)

  implicit def toCreateServiceRequestOps(v: CreateServiceRequest): CreateServiceRequestOps =
    new CreateServiceRequestOps(v)

}
