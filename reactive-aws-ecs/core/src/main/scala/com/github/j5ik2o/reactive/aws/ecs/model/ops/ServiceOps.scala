// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ServiceBuilderOps(val self: Service.Builder) extends AnyVal {

  final def serviceArnAsScala(value: Option[String]): Service.Builder = {
    value.fold(self) { v =>
      self.serviceArn(v)
    }
  }

  final def serviceNameAsScala(value: Option[String]): Service.Builder = {
    value.fold(self) { v =>
      self.serviceName(v)
    }
  }

  final def clusterArnAsScala(value: Option[String]): Service.Builder = {
    value.fold(self) { v =>
      self.clusterArn(v)
    }
  }

  final def loadBalancersAsScala(value: Option[Seq[LoadBalancer]]): Service.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.loadBalancers(v.asJava)
    }
  }

  final def serviceRegistriesAsScala(value: Option[Seq[ServiceRegistry]]): Service.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.serviceRegistries(v.asJava)
    }
  }

  final def statusAsScala(value: Option[String]): Service.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def desiredCountAsScala(value: Option[Int]): Service.Builder = {
    value.fold(self) { v =>
      self.desiredCount(v)
    }
  }

  final def runningCountAsScala(value: Option[Int]): Service.Builder = {
    value.fold(self) { v =>
      self.runningCount(v)
    }
  }

  final def pendingCountAsScala(value: Option[Int]): Service.Builder = {
    value.fold(self) { v =>
      self.pendingCount(v)
    }
  }

  final def launchTypeAsScala(value: Option[LaunchType]): Service.Builder = {
    value.fold(self) { v =>
      self.launchType(v)
    }
  }

  final def platformVersionAsScala(value: Option[String]): Service.Builder = {
    value.fold(self) { v =>
      self.platformVersion(v)
    }
  }

  final def taskDefinitionAsScala(value: Option[String]): Service.Builder = {
    value.fold(self) { v =>
      self.taskDefinition(v)
    }
  }

  final def deploymentConfigurationAsScala(value: Option[DeploymentConfiguration]): Service.Builder = {
    value.fold(self) { v =>
      self.deploymentConfiguration(v)
    }
  }

  final def taskSetsAsScala(value: Option[Seq[TaskSet]]): Service.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.taskSets(v.asJava)
    }
  }

  final def deploymentsAsScala(value: Option[Seq[Deployment]]): Service.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.deployments(v.asJava)
    }
  }

  final def roleArnAsScala(value: Option[String]): Service.Builder = {
    value.fold(self) { v =>
      self.roleArn(v)
    }
  }

  final def eventsAsScala(value: Option[Seq[ServiceEvent]]): Service.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.events(v.asJava)
    }
  }

  final def createdAtAsScala(value: Option[java.time.Instant]): Service.Builder = {
    value.fold(self) { v =>
      self.createdAt(v)
    }
  }

  final def placementConstraintsAsScala(value: Option[Seq[PlacementConstraint]]): Service.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.placementConstraints(v.asJava)
    }
  }

  final def placementStrategyAsScala(value: Option[Seq[PlacementStrategy]]): Service.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.placementStrategy(v.asJava)
    }
  }

  final def networkConfigurationAsScala(value: Option[NetworkConfiguration]): Service.Builder = {
    value.fold(self) { v =>
      self.networkConfiguration(v)
    }
  }

  final def healthCheckGracePeriodSecondsAsScala(value: Option[Int]): Service.Builder = {
    value.fold(self) { v =>
      self.healthCheckGracePeriodSeconds(v)
    }
  }

  final def schedulingStrategyAsScala(value: Option[SchedulingStrategy]): Service.Builder = {
    value.fold(self) { v =>
      self.schedulingStrategy(v)
    }
  }

  final def deploymentControllerAsScala(value: Option[DeploymentController]): Service.Builder = {
    value.fold(self) { v =>
      self.deploymentController(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): Service.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def createdByAsScala(value: Option[String]): Service.Builder = {
    value.fold(self) { v =>
      self.createdBy(v)
    }
  }

  final def enableECSManagedTagsAsScala(value: Option[Boolean]): Service.Builder = {
    value.fold(self) { v =>
      self.enableECSManagedTags(v)
    }
  }

  final def propagateTagsAsScala(value: Option[PropagateTags]): Service.Builder = {
    value.fold(self) { v =>
      self.propagateTags(v)
    }
  }

}

final class ServiceOps(val self: Service) extends AnyVal {

  final def serviceArnAsScala: Option[String] = Option(self.serviceArn)

  final def serviceNameAsScala: Option[String] = Option(self.serviceName)

  final def clusterArnAsScala: Option[String] = Option(self.clusterArn)

  final def loadBalancersAsScala: Option[Seq[LoadBalancer]] = Option(self.loadBalancers).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def serviceRegistriesAsScala: Option[Seq[ServiceRegistry]] = Option(self.serviceRegistries).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def statusAsScala: Option[String] = Option(self.status)

  final def desiredCountAsScala: Option[Int] = Option(self.desiredCount)

  final def runningCountAsScala: Option[Int] = Option(self.runningCount)

  final def pendingCountAsScala: Option[Int] = Option(self.pendingCount)

  final def launchTypeAsScala: Option[LaunchType] = Option(self.launchType)

  final def platformVersionAsScala: Option[String] = Option(self.platformVersion)

  final def taskDefinitionAsScala: Option[String] = Option(self.taskDefinition)

  final def deploymentConfigurationAsScala: Option[DeploymentConfiguration] = Option(self.deploymentConfiguration)

  final def taskSetsAsScala: Option[Seq[TaskSet]] = Option(self.taskSets).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def deploymentsAsScala: Option[Seq[Deployment]] = Option(self.deployments).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def roleArnAsScala: Option[String] = Option(self.roleArn)

  final def eventsAsScala: Option[Seq[ServiceEvent]] = Option(self.events).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def createdAtAsScala: Option[java.time.Instant] = Option(self.createdAt)

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

  final def createdByAsScala: Option[String] = Option(self.createdBy)

  final def enableECSManagedTagsAsScala: Option[Boolean] = Option(self.enableECSManagedTags)

  final def propagateTagsAsScala: Option[PropagateTags] = Option(self.propagateTags)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToServiceOps {

  implicit def toServiceBuilderOps(v: Service.Builder): ServiceBuilderOps = new ServiceBuilderOps(v)

  implicit def toServiceOps(v: Service): ServiceOps = new ServiceOps(v)

}
