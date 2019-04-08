// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class RunTaskRequestBuilderOps(val self: RunTaskRequest.Builder) extends AnyVal {

  final def clusterAsScala(value: Option[String]): RunTaskRequest.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

  final def taskDefinitionAsScala(value: Option[String]): RunTaskRequest.Builder = {
    value.fold(self) { v =>
      self.taskDefinition(v)
    }
  }

  final def overridesAsScala(value: Option[TaskOverride]): RunTaskRequest.Builder = {
    value.fold(self) { v =>
      self.overrides(v)
    }
  }

  final def countAsScala(value: Option[Int]): RunTaskRequest.Builder = {
    value.fold(self) { v =>
      self.count(v)
    }
  }

  final def startedByAsScala(value: Option[String]): RunTaskRequest.Builder = {
    value.fold(self) { v =>
      self.startedBy(v)
    }
  }

  final def groupAsScala(value: Option[String]): RunTaskRequest.Builder = {
    value.fold(self) { v =>
      self.group(v)
    }
  }

  final def placementConstraintsAsScala(value: Option[Seq[PlacementConstraint]]): RunTaskRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.placementConstraints(v.asJava)
    }
  }

  final def placementStrategyAsScala(value: Option[Seq[PlacementStrategy]]): RunTaskRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.placementStrategy(v.asJava)
    }
  }

  final def launchTypeAsScala(value: Option[LaunchType]): RunTaskRequest.Builder = {
    value.fold(self) { v =>
      self.launchType(v)
    }
  }

  final def platformVersionAsScala(value: Option[String]): RunTaskRequest.Builder = {
    value.fold(self) { v =>
      self.platformVersion(v)
    }
  }

  final def networkConfigurationAsScala(value: Option[NetworkConfiguration]): RunTaskRequest.Builder = {
    value.fold(self) { v =>
      self.networkConfiguration(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): RunTaskRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def enableECSManagedTagsAsScala(value: Option[Boolean]): RunTaskRequest.Builder = {
    value.fold(self) { v =>
      self.enableECSManagedTags(v)
    }
  }

  final def propagateTagsAsScala(value: Option[PropagateTags]): RunTaskRequest.Builder = {
    value.fold(self) { v =>
      self.propagateTags(v)
    }
  }

}

final class RunTaskRequestOps(val self: RunTaskRequest) extends AnyVal {

  final def clusterAsScala: Option[String] = Option(self.cluster)

  final def taskDefinitionAsScala: Option[String] = Option(self.taskDefinition)

  final def overridesAsScala: Option[TaskOverride] = Option(self.overrides)

  final def countAsScala: Option[Int] = Option(self.count)

  final def startedByAsScala: Option[String] = Option(self.startedBy)

  final def groupAsScala: Option[String] = Option(self.group)

  final def placementConstraintsAsScala: Option[Seq[PlacementConstraint]] = Option(self.placementConstraints).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def placementStrategyAsScala: Option[Seq[PlacementStrategy]] = Option(self.placementStrategy).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def launchTypeAsScala: Option[LaunchType] = Option(self.launchType)

  final def platformVersionAsScala: Option[String] = Option(self.platformVersion)

  final def networkConfigurationAsScala: Option[NetworkConfiguration] = Option(self.networkConfiguration)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def enableECSManagedTagsAsScala: Option[Boolean] = Option(self.enableECSManagedTags)

  final def propagateTagsAsScala: Option[PropagateTags] = Option(self.propagateTags)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRunTaskRequestOps {

  implicit def toRunTaskRequestBuilderOps(v: RunTaskRequest.Builder): RunTaskRequestBuilderOps =
    new RunTaskRequestBuilderOps(v)

  implicit def toRunTaskRequestOps(v: RunTaskRequest): RunTaskRequestOps = new RunTaskRequestOps(v)

}
