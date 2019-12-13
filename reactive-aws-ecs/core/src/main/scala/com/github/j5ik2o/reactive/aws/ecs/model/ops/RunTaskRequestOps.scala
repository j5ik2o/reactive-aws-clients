// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class RunTaskRequestBuilderOps(val self: RunTaskRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityProviderStrategyAsScala(
      value: Option[Seq[CapacityProviderStrategyItem]]
  ): RunTaskRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.capacityProviderStrategy(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala(value: Option[String]): RunTaskRequest.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def countAsScala(value: Option[Int]): RunTaskRequest.Builder = {
    value.fold(self) { v =>
      self.count(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enableECSManagedTagsAsScala(value: Option[Boolean]): RunTaskRequest.Builder = {
    value.fold(self) { v =>
      self.enableECSManagedTags(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupAsScala(value: Option[String]): RunTaskRequest.Builder = {
    value.fold(self) { v =>
      self.group(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTypeAsScala(value: Option[LaunchType]): RunTaskRequest.Builder = {
    value.fold(self) { v =>
      self.launchType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkConfigurationAsScala(value: Option[NetworkConfiguration]): RunTaskRequest.Builder = {
    value.fold(self) { v =>
      self.networkConfiguration(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def overridesAsScala(value: Option[TaskOverride]): RunTaskRequest.Builder = {
    value.fold(self) { v =>
      self.overrides(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def placementConstraintsAsScala(value: Option[Seq[PlacementConstraint]]): RunTaskRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.placementConstraints(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def placementStrategyAsScala(value: Option[Seq[PlacementStrategy]]): RunTaskRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.placementStrategy(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformVersionAsScala(value: Option[String]): RunTaskRequest.Builder = {
    value.fold(self) { v =>
      self.platformVersion(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def propagateTagsAsScala(value: Option[PropagateTags]): RunTaskRequest.Builder = {
    value.fold(self) { v =>
      self.propagateTags(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def referenceIdAsScala(value: Option[String]): RunTaskRequest.Builder = {
    value.fold(self) { v =>
      self.referenceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startedByAsScala(value: Option[String]): RunTaskRequest.Builder = {
    value.fold(self) { v =>
      self.startedBy(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): RunTaskRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskDefinitionAsScala(value: Option[String]): RunTaskRequest.Builder = {
    value.fold(self) { v =>
      self.taskDefinition(v)
    }
  }

}

final class RunTaskRequestOps(val self: RunTaskRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityProviderStrategyAsScala: Option[Seq[CapacityProviderStrategyItem]] =
    Option(self.capacityProviderStrategy).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala: Option[String] = Option(self.cluster)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def countAsScala: Option[Int] = Option(self.count)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enableECSManagedTagsAsScala: Option[Boolean] = Option(self.enableECSManagedTags)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupAsScala: Option[String] = Option(self.group)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTypeAsScala: Option[LaunchType] = Option(self.launchType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkConfigurationAsScala: Option[NetworkConfiguration] = Option(self.networkConfiguration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def overridesAsScala: Option[TaskOverride] = Option(self.overrides)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def placementConstraintsAsScala: Option[Seq[PlacementConstraint]] = Option(self.placementConstraints).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def placementStrategyAsScala: Option[Seq[PlacementStrategy]] = Option(self.placementStrategy).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformVersionAsScala: Option[String] = Option(self.platformVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def propagateTagsAsScala: Option[PropagateTags] = Option(self.propagateTags)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def referenceIdAsScala: Option[String] = Option(self.referenceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startedByAsScala: Option[String] = Option(self.startedBy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskDefinitionAsScala: Option[String] = Option(self.taskDefinition)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRunTaskRequestOps {

  implicit def toRunTaskRequestBuilderOps(v: RunTaskRequest.Builder): RunTaskRequestBuilderOps =
    new RunTaskRequestBuilderOps(v)

  implicit def toRunTaskRequestOps(v: RunTaskRequest): RunTaskRequestOps = new RunTaskRequestOps(v)

}
