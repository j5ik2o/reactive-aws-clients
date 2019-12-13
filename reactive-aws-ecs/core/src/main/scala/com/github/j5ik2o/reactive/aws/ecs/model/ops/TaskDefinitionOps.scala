// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class TaskDefinitionBuilderOps(val self: TaskDefinition.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskDefinitionArnAsScala(value: Option[String]): TaskDefinition.Builder = {
    value.fold(self) { v =>
      self.taskDefinitionArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerDefinitionsAsScala(value: Option[Seq[ContainerDefinition]]): TaskDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.containerDefinitions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def familyAsScala(value: Option[String]): TaskDefinition.Builder = {
    value.fold(self) { v =>
      self.family(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskRoleArnAsScala(value: Option[String]): TaskDefinition.Builder = {
    value.fold(self) { v =>
      self.taskRoleArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def executionRoleArnAsScala(value: Option[String]): TaskDefinition.Builder = {
    value.fold(self) { v =>
      self.executionRoleArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkModeAsScala(value: Option[NetworkMode]): TaskDefinition.Builder = {
    value.fold(self) { v =>
      self.networkMode(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def revisionAsScala(value: Option[Int]): TaskDefinition.Builder = {
    value.fold(self) { v =>
      self.revision(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumesAsScala(value: Option[Seq[Volume]]): TaskDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.volumes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[TaskDefinitionStatus]): TaskDefinition.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requiresAttributesAsScala(value: Option[Seq[Attribute]]): TaskDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.requiresAttributes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def placementConstraintsAsScala(
      value: Option[Seq[TaskDefinitionPlacementConstraint]]
  ): TaskDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.placementConstraints(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def compatibilitiesAsScala(value: Option[Seq[Compatibility]]): TaskDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.compatibilities(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requiresCompatibilitiesAsScala(value: Option[Seq[Compatibility]]): TaskDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.requiresCompatibilities(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cpuAsScala(value: Option[String]): TaskDefinition.Builder = {
    value.fold(self) { v =>
      self.cpu(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryAsScala(value: Option[String]): TaskDefinition.Builder = {
    value.fold(self) { v =>
      self.memory(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def inferenceAcceleratorsAsScala(value: Option[Seq[InferenceAccelerator]]): TaskDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.inferenceAccelerators(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pidModeAsScala(value: Option[PidMode]): TaskDefinition.Builder = {
    value.fold(self) { v =>
      self.pidMode(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipcModeAsScala(value: Option[IpcMode]): TaskDefinition.Builder = {
    value.fold(self) { v =>
      self.ipcMode(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def proxyConfigurationAsScala(value: Option[ProxyConfiguration]): TaskDefinition.Builder = {
    value.fold(self) { v =>
      self.proxyConfiguration(v)
    }
  }

}

final class TaskDefinitionOps(val self: TaskDefinition) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskDefinitionArnAsScala: Option[String] = Option(self.taskDefinitionArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerDefinitionsAsScala: Option[Seq[ContainerDefinition]] = Option(self.containerDefinitions).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def familyAsScala: Option[String] = Option(self.family)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskRoleArnAsScala: Option[String] = Option(self.taskRoleArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def executionRoleArnAsScala: Option[String] = Option(self.executionRoleArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkModeAsScala: Option[NetworkMode] = Option(self.networkMode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def revisionAsScala: Option[Int] = Option(self.revision)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumesAsScala: Option[Seq[Volume]] = Option(self.volumes).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[TaskDefinitionStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requiresAttributesAsScala: Option[Seq[Attribute]] = Option(self.requiresAttributes).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def placementConstraintsAsScala: Option[Seq[TaskDefinitionPlacementConstraint]] =
    Option(self.placementConstraints).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def compatibilitiesAsScala: Option[Seq[Compatibility]] = Option(self.compatibilities).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requiresCompatibilitiesAsScala: Option[Seq[Compatibility]] = Option(self.requiresCompatibilities).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cpuAsScala: Option[String] = Option(self.cpu)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryAsScala: Option[String] = Option(self.memory)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def inferenceAcceleratorsAsScala: Option[Seq[InferenceAccelerator]] = Option(self.inferenceAccelerators).map {
    v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pidModeAsScala: Option[PidMode] = Option(self.pidMode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipcModeAsScala: Option[IpcMode] = Option(self.ipcMode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def proxyConfigurationAsScala: Option[ProxyConfiguration] = Option(self.proxyConfiguration)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTaskDefinitionOps {

  implicit def toTaskDefinitionBuilderOps(v: TaskDefinition.Builder): TaskDefinitionBuilderOps =
    new TaskDefinitionBuilderOps(v)

  implicit def toTaskDefinitionOps(v: TaskDefinition): TaskDefinitionOps = new TaskDefinitionOps(v)

}
