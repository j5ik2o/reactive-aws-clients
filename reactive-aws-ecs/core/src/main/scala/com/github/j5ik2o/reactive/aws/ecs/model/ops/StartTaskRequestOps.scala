// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class StartTaskRequestBuilderOps(val self: StartTaskRequest.Builder) extends AnyVal {

  final def clusterAsScala(value: Option[String]): StartTaskRequest.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

  final def taskDefinitionAsScala(value: Option[String]): StartTaskRequest.Builder = {
    value.fold(self) { v =>
      self.taskDefinition(v)
    }
  }

  final def overridesAsScala(value: Option[TaskOverride]): StartTaskRequest.Builder = {
    value.fold(self) { v =>
      self.overrides(v)
    }
  }

  final def containerInstancesAsScala(value: Option[Seq[String]]): StartTaskRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.containerInstances(v.asJava)
    }
  }

  final def startedByAsScala(value: Option[String]): StartTaskRequest.Builder = {
    value.fold(self) { v =>
      self.startedBy(v)
    }
  }

  final def groupAsScala(value: Option[String]): StartTaskRequest.Builder = {
    value.fold(self) { v =>
      self.group(v)
    }
  }

  final def networkConfigurationAsScala(value: Option[NetworkConfiguration]): StartTaskRequest.Builder = {
    value.fold(self) { v =>
      self.networkConfiguration(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): StartTaskRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def enableECSManagedTagsAsScala(value: Option[Boolean]): StartTaskRequest.Builder = {
    value.fold(self) { v =>
      self.enableECSManagedTags(v)
    }
  }

  final def propagateTagsAsScala(value: Option[PropagateTags]): StartTaskRequest.Builder = {
    value.fold(self) { v =>
      self.propagateTags(v)
    }
  }

}

final class StartTaskRequestOps(val self: StartTaskRequest) extends AnyVal {

  final def clusterAsScala: Option[String] = Option(self.cluster)

  final def taskDefinitionAsScala: Option[String] = Option(self.taskDefinition)

  final def overridesAsScala: Option[TaskOverride] = Option(self.overrides)

  final def containerInstancesAsScala: Option[Seq[String]] = Option(self.containerInstances).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def startedByAsScala: Option[String] = Option(self.startedBy)

  final def groupAsScala: Option[String] = Option(self.group)

  final def networkConfigurationAsScala: Option[NetworkConfiguration] = Option(self.networkConfiguration)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def enableECSManagedTagsAsScala: Option[Boolean] = Option(self.enableECSManagedTags)

  final def propagateTagsAsScala: Option[PropagateTags] = Option(self.propagateTags)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartTaskRequestOps {

  implicit def toStartTaskRequestBuilderOps(v: StartTaskRequest.Builder): StartTaskRequestBuilderOps =
    new StartTaskRequestBuilderOps(v)

  implicit def toStartTaskRequestOps(v: StartTaskRequest): StartTaskRequestOps = new StartTaskRequestOps(v)

}
