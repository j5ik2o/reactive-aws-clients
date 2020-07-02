// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class CreateTaskSetRequestBuilderOps(val self: CreateTaskSetRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceAsScala(value: Option[String]): CreateTaskSetRequest.Builder = {
    value.fold(self) { v => self.service(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala(value: Option[String]): CreateTaskSetRequest.Builder = {
    value.fold(self) { v => self.cluster(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def externalIdAsScala(value: Option[String]): CreateTaskSetRequest.Builder = {
    value.fold(self) { v => self.externalId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskDefinitionAsScala(value: Option[String]): CreateTaskSetRequest.Builder = {
    value.fold(self) { v => self.taskDefinition(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkConfigurationAsScala(value: Option[NetworkConfiguration]): CreateTaskSetRequest.Builder = {
    value.fold(self) { v => self.networkConfiguration(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def loadBalancersAsScala(value: Option[Seq[LoadBalancer]]): CreateTaskSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.loadBalancers(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceRegistriesAsScala(value: Option[Seq[ServiceRegistry]]): CreateTaskSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.serviceRegistries(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTypeAsScala(value: Option[LaunchType]): CreateTaskSetRequest.Builder = {
    value.fold(self) { v => self.launchType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityProviderStrategyAsScala(
      value: Option[Seq[CapacityProviderStrategyItem]]
  ): CreateTaskSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.capacityProviderStrategy(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformVersionAsScala(value: Option[String]): CreateTaskSetRequest.Builder = {
    value.fold(self) { v => self.platformVersion(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scaleAsScala(value: Option[Scale]): CreateTaskSetRequest.Builder = {
    value.fold(self) { v => self.scale(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): CreateTaskSetRequest.Builder = {
    value.fold(self) { v => self.clientToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): CreateTaskSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class CreateTaskSetRequestOps(val self: CreateTaskSetRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceAsScala: Option[String] = Option(self.service)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala: Option[String] = Option(self.cluster)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def externalIdAsScala: Option[String] = Option(self.externalId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskDefinitionAsScala: Option[String] = Option(self.taskDefinition)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkConfigurationAsScala: Option[NetworkConfiguration] = Option(self.networkConfiguration)

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
  final def launchTypeAsScala: Option[LaunchType] = Option(self.launchType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityProviderStrategyAsScala: Option[Seq[CapacityProviderStrategyItem]] =
    Option(self.capacityProviderStrategy).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformVersionAsScala: Option[String] = Option(self.platformVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scaleAsScala: Option[Scale] = Option(self.scale)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateTaskSetRequestOps {

  implicit def toCreateTaskSetRequestBuilderOps(v: CreateTaskSetRequest.Builder): CreateTaskSetRequestBuilderOps =
    new CreateTaskSetRequestBuilderOps(v)

  implicit def toCreateTaskSetRequestOps(v: CreateTaskSetRequest): CreateTaskSetRequestOps =
    new CreateTaskSetRequestOps(v)

}
