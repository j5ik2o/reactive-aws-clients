// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class StartTaskRequestBuilderOps(val self: StartTaskRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala(value: Option[String]): StartTaskRequest.Builder = {
    value.fold(self) { v => self.cluster(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerInstancesAsScala(value: Option[Seq[String]]): StartTaskRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.containerInstances(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enableECSManagedTagsAsScala(value: Option[Boolean]): StartTaskRequest.Builder = {
    value.fold(self) { v => self.enableECSManagedTags(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupAsScala(value: Option[String]): StartTaskRequest.Builder = {
    value.fold(self) { v => self.group(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkConfigurationAsScala(value: Option[NetworkConfiguration]): StartTaskRequest.Builder = {
    value.fold(self) { v => self.networkConfiguration(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def overridesAsScala(value: Option[TaskOverride]): StartTaskRequest.Builder = {
    value.fold(self) { v => self.overrides(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def propagateTagsAsScala(value: Option[PropagateTags]): StartTaskRequest.Builder = {
    value.fold(self) { v => self.propagateTags(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def referenceIdAsScala(value: Option[String]): StartTaskRequest.Builder = {
    value.fold(self) { v => self.referenceId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startedByAsScala(value: Option[String]): StartTaskRequest.Builder = {
    value.fold(self) { v => self.startedBy(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): StartTaskRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskDefinitionAsScala(value: Option[String]): StartTaskRequest.Builder = {
    value.fold(self) { v => self.taskDefinition(v) }
  }

}

final class StartTaskRequestOps(val self: StartTaskRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala: Option[String] = Option(self.cluster)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerInstancesAsScala: Option[Seq[String]] =
    Option(self.containerInstances).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enableECSManagedTagsAsScala: Option[Boolean] = Option(self.enableECSManagedTags)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupAsScala: Option[String] = Option(self.group)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkConfigurationAsScala: Option[NetworkConfiguration] = Option(self.networkConfiguration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def overridesAsScala: Option[TaskOverride] = Option(self.overrides)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def propagateTagsAsScala: Option[PropagateTags] = Option(self.propagateTags)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def referenceIdAsScala: Option[String] = Option(self.referenceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startedByAsScala: Option[String] = Option(self.startedBy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskDefinitionAsScala: Option[String] = Option(self.taskDefinition)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartTaskRequestOps {

  implicit def toStartTaskRequestBuilderOps(v: StartTaskRequest.Builder): StartTaskRequestBuilderOps =
    new StartTaskRequestBuilderOps(v)

  implicit def toStartTaskRequestOps(v: StartTaskRequest): StartTaskRequestOps = new StartTaskRequestOps(v)

}
