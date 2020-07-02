// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ServiceBuilderOps(val self: Service.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceArnAsScala(value: Option[String]): Service.Builder = {
    value.fold(self) { v => self.serviceArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceNameAsScala(value: Option[String]): Service.Builder = {
    value.fold(self) { v => self.serviceName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterArnAsScala(value: Option[String]): Service.Builder = {
    value.fold(self) { v => self.clusterArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def loadBalancersAsScala(value: Option[Seq[LoadBalancer]]): Service.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.loadBalancers(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceRegistriesAsScala(value: Option[Seq[ServiceRegistry]]): Service.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.serviceRegistries(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[String]): Service.Builder = {
    value.fold(self) { v => self.status(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def desiredCountAsScala(value: Option[Int]): Service.Builder = {
    value.fold(self) { v => self.desiredCount(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def runningCountAsScala(value: Option[Int]): Service.Builder = {
    value.fold(self) { v => self.runningCount(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pendingCountAsScala(value: Option[Int]): Service.Builder = {
    value.fold(self) { v => self.pendingCount(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTypeAsScala(value: Option[LaunchType]): Service.Builder = {
    value.fold(self) { v => self.launchType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityProviderStrategyAsScala(value: Option[Seq[CapacityProviderStrategyItem]]): Service.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.capacityProviderStrategy(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformVersionAsScala(value: Option[String]): Service.Builder = {
    value.fold(self) { v => self.platformVersion(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskDefinitionAsScala(value: Option[String]): Service.Builder = {
    value.fold(self) { v => self.taskDefinition(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deploymentConfigurationAsScala(value: Option[DeploymentConfiguration]): Service.Builder = {
    value.fold(self) { v => self.deploymentConfiguration(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskSetsAsScala(value: Option[Seq[TaskSet]]): Service.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.taskSets(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deploymentsAsScala(value: Option[Seq[Deployment]]): Service.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.deployments(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleArnAsScala(value: Option[String]): Service.Builder = {
    value.fold(self) { v => self.roleArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventsAsScala(value: Option[Seq[ServiceEvent]]): Service.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.events(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdAtAsScala(value: Option[java.time.Instant]): Service.Builder = {
    value.fold(self) { v => self.createdAt(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def placementConstraintsAsScala(value: Option[Seq[PlacementConstraint]]): Service.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.placementConstraints(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def placementStrategyAsScala(value: Option[Seq[PlacementStrategy]]): Service.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.placementStrategy(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkConfigurationAsScala(value: Option[NetworkConfiguration]): Service.Builder = {
    value.fold(self) { v => self.networkConfiguration(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def healthCheckGracePeriodSecondsAsScala(value: Option[Int]): Service.Builder = {
    value.fold(self) { v => self.healthCheckGracePeriodSeconds(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def schedulingStrategyAsScala(value: Option[SchedulingStrategy]): Service.Builder = {
    value.fold(self) { v => self.schedulingStrategy(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deploymentControllerAsScala(value: Option[DeploymentController]): Service.Builder = {
    value.fold(self) { v => self.deploymentController(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): Service.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdByAsScala(value: Option[String]): Service.Builder = {
    value.fold(self) { v => self.createdBy(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enableECSManagedTagsAsScala(value: Option[Boolean]): Service.Builder = {
    value.fold(self) { v => self.enableECSManagedTags(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def propagateTagsAsScala(value: Option[PropagateTags]): Service.Builder = {
    value.fold(self) { v => self.propagateTags(v) }
  }

}

final class ServiceOps(val self: Service) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceArnAsScala: Option[String] = Option(self.serviceArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceNameAsScala: Option[String] = Option(self.serviceName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterArnAsScala: Option[String] = Option(self.clusterArn)

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
  final def statusAsScala: Option[String] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def desiredCountAsScala: Option[Int] = Option(self.desiredCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def runningCountAsScala: Option[Int] = Option(self.runningCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pendingCountAsScala: Option[Int] = Option(self.pendingCount)

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
  final def taskDefinitionAsScala: Option[String] = Option(self.taskDefinition)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deploymentConfigurationAsScala: Option[DeploymentConfiguration] = Option(self.deploymentConfiguration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskSetsAsScala: Option[Seq[TaskSet]] =
    Option(self.taskSets).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deploymentsAsScala: Option[Seq[Deployment]] =
    Option(self.deployments).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleArnAsScala: Option[String] = Option(self.roleArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventsAsScala: Option[Seq[ServiceEvent]] =
    Option(self.events).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdAtAsScala: Option[java.time.Instant] = Option(self.createdAt)

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
  final def createdByAsScala: Option[String] = Option(self.createdBy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enableECSManagedTagsAsScala: Option[Boolean] = Option(self.enableECSManagedTags)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def propagateTagsAsScala: Option[PropagateTags] = Option(self.propagateTags)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToServiceOps {

  implicit def toServiceBuilderOps(v: Service.Builder): ServiceBuilderOps = new ServiceBuilderOps(v)

  implicit def toServiceOps(v: Service): ServiceOps = new ServiceOps(v)

}
