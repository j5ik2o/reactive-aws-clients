// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class CreateServiceRequestBuilderOps(val self: CreateServiceRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala(value: Option[String]): CreateServiceRequest.Builder = {
    value.fold(self) { v => self.cluster(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceNameAsScala(value: Option[String]): CreateServiceRequest.Builder = {
    value.fold(self) { v => self.serviceName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskDefinitionAsScala(value: Option[String]): CreateServiceRequest.Builder = {
    value.fold(self) { v => self.taskDefinition(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def loadBalancersAsScala(value: Option[Seq[LoadBalancer]]): CreateServiceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.loadBalancers(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceRegistriesAsScala(value: Option[Seq[ServiceRegistry]]): CreateServiceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.serviceRegistries(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def desiredCountAsScala(value: Option[Int]): CreateServiceRequest.Builder = {
    value.fold(self) { v => self.desiredCount(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): CreateServiceRequest.Builder = {
    value.fold(self) { v => self.clientToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTypeAsScala(value: Option[LaunchType]): CreateServiceRequest.Builder = {
    value.fold(self) { v => self.launchType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityProviderStrategyAsScala(
      value: Option[Seq[CapacityProviderStrategyItem]]
  ): CreateServiceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.capacityProviderStrategy(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformVersionAsScala(value: Option[String]): CreateServiceRequest.Builder = {
    value.fold(self) { v => self.platformVersion(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleAsScala(value: Option[String]): CreateServiceRequest.Builder = {
    value.fold(self) { v => self.role(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deploymentConfigurationAsScala(value: Option[DeploymentConfiguration]): CreateServiceRequest.Builder = {
    value.fold(self) { v => self.deploymentConfiguration(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def placementConstraintsAsScala(value: Option[Seq[PlacementConstraint]]): CreateServiceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.placementConstraints(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def placementStrategyAsScala(value: Option[Seq[PlacementStrategy]]): CreateServiceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.placementStrategy(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkConfigurationAsScala(value: Option[NetworkConfiguration]): CreateServiceRequest.Builder = {
    value.fold(self) { v => self.networkConfiguration(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def healthCheckGracePeriodSecondsAsScala(value: Option[Int]): CreateServiceRequest.Builder = {
    value.fold(self) { v => self.healthCheckGracePeriodSeconds(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def schedulingStrategyAsScala(value: Option[SchedulingStrategy]): CreateServiceRequest.Builder = {
    value.fold(self) { v => self.schedulingStrategy(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deploymentControllerAsScala(value: Option[DeploymentController]): CreateServiceRequest.Builder = {
    value.fold(self) { v => self.deploymentController(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): CreateServiceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enableECSManagedTagsAsScala(value: Option[Boolean]): CreateServiceRequest.Builder = {
    value.fold(self) { v => self.enableECSManagedTags(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def propagateTagsAsScala(value: Option[PropagateTags]): CreateServiceRequest.Builder = {
    value.fold(self) { v => self.propagateTags(v) }
  }

}

final class CreateServiceRequestOps(val self: CreateServiceRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala: Option[String] = Option(self.cluster)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceNameAsScala: Option[String] = Option(self.serviceName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskDefinitionAsScala: Option[String] = Option(self.taskDefinition)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def loadBalancersAsScala: Option[Seq[LoadBalancer]] =
    Option(self.loadBalancers).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceRegistriesAsScala: Option[Seq[ServiceRegistry]] =
    Option(self.serviceRegistries).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def desiredCountAsScala: Option[Int] = Option(self.desiredCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTypeAsScala: Option[LaunchType] = Option(self.launchType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityProviderStrategyAsScala: Option[Seq[CapacityProviderStrategyItem]] =
    Option(self.capacityProviderStrategy).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformVersionAsScala: Option[String] = Option(self.platformVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleAsScala: Option[String] = Option(self.role)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deploymentConfigurationAsScala: Option[DeploymentConfiguration] = Option(self.deploymentConfiguration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def placementConstraintsAsScala: Option[Seq[PlacementConstraint]] =
    Option(self.placementConstraints).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def placementStrategyAsScala: Option[Seq[PlacementStrategy]] =
    Option(self.placementStrategy).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkConfigurationAsScala: Option[NetworkConfiguration] = Option(self.networkConfiguration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def healthCheckGracePeriodSecondsAsScala: Option[Int] = Option(self.healthCheckGracePeriodSeconds)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def schedulingStrategyAsScala: Option[SchedulingStrategy] = Option(self.schedulingStrategy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deploymentControllerAsScala: Option[DeploymentController] = Option(self.deploymentController)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enableECSManagedTagsAsScala: Option[Boolean] = Option(self.enableECSManagedTags)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def propagateTagsAsScala: Option[PropagateTags] = Option(self.propagateTags)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateServiceRequestOps {

  implicit def toCreateServiceRequestBuilderOps(v: CreateServiceRequest.Builder): CreateServiceRequestBuilderOps =
    new CreateServiceRequestBuilderOps(v)

  implicit def toCreateServiceRequestOps(v: CreateServiceRequest): CreateServiceRequestOps =
    new CreateServiceRequestOps(v)

}
