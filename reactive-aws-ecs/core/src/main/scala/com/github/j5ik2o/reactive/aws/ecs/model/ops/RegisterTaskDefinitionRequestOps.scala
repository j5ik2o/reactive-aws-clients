// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class RegisterTaskDefinitionRequestBuilderOps(val self: RegisterTaskDefinitionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def familyAsScala(value: Option[String]): RegisterTaskDefinitionRequest.Builder = {
    value.fold(self) { v => self.family(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskRoleArnAsScala(value: Option[String]): RegisterTaskDefinitionRequest.Builder = {
    value.fold(self) { v => self.taskRoleArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def executionRoleArnAsScala(value: Option[String]): RegisterTaskDefinitionRequest.Builder = {
    value.fold(self) { v => self.executionRoleArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkModeAsScala(value: Option[NetworkMode]): RegisterTaskDefinitionRequest.Builder = {
    value.fold(self) { v => self.networkMode(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerDefinitionsAsScala(
      value: Option[Seq[ContainerDefinition]]
  ): RegisterTaskDefinitionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.containerDefinitions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumesAsScala(value: Option[Seq[Volume]]): RegisterTaskDefinitionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.volumes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def placementConstraintsAsScala(
      value: Option[Seq[TaskDefinitionPlacementConstraint]]
  ): RegisterTaskDefinitionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.placementConstraints(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requiresCompatibilitiesAsScala(value: Option[Seq[Compatibility]]): RegisterTaskDefinitionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.requiresCompatibilities(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cpuAsScala(value: Option[String]): RegisterTaskDefinitionRequest.Builder = {
    value.fold(self) { v => self.cpu(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryAsScala(value: Option[String]): RegisterTaskDefinitionRequest.Builder = {
    value.fold(self) { v => self.memory(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): RegisterTaskDefinitionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pidModeAsScala(value: Option[PidMode]): RegisterTaskDefinitionRequest.Builder = {
    value.fold(self) { v => self.pidMode(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipcModeAsScala(value: Option[IpcMode]): RegisterTaskDefinitionRequest.Builder = {
    value.fold(self) { v => self.ipcMode(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def proxyConfigurationAsScala(value: Option[ProxyConfiguration]): RegisterTaskDefinitionRequest.Builder = {
    value.fold(self) { v => self.proxyConfiguration(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def inferenceAcceleratorsAsScala(
      value: Option[Seq[InferenceAccelerator]]
  ): RegisterTaskDefinitionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.inferenceAccelerators(v.asJava)
    }
  }

}

final class RegisterTaskDefinitionRequestOps(val self: RegisterTaskDefinitionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def familyAsScala: Option[String] = Option(self.family)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskRoleArnAsScala: Option[String] = Option(self.taskRoleArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def executionRoleArnAsScala: Option[String] = Option(self.executionRoleArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkModeAsScala: Option[NetworkMode] = Option(self.networkMode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerDefinitionsAsScala: Option[Seq[ContainerDefinition]] =
    Option(self.containerDefinitions).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumesAsScala: Option[Seq[Volume]] =
    Option(self.volumes).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def placementConstraintsAsScala: Option[Seq[TaskDefinitionPlacementConstraint]] =
    Option(self.placementConstraints).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requiresCompatibilitiesAsScala: Option[Seq[Compatibility]] =
    Option(self.requiresCompatibilities).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cpuAsScala: Option[String] = Option(self.cpu)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryAsScala: Option[String] = Option(self.memory)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pidModeAsScala: Option[PidMode] = Option(self.pidMode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipcModeAsScala: Option[IpcMode] = Option(self.ipcMode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def proxyConfigurationAsScala: Option[ProxyConfiguration] = Option(self.proxyConfiguration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def inferenceAcceleratorsAsScala: Option[Seq[InferenceAccelerator]] =
    Option(self.inferenceAccelerators).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRegisterTaskDefinitionRequestOps {

  implicit def toRegisterTaskDefinitionRequestBuilderOps(
      v: RegisterTaskDefinitionRequest.Builder
  ): RegisterTaskDefinitionRequestBuilderOps = new RegisterTaskDefinitionRequestBuilderOps(v)

  implicit def toRegisterTaskDefinitionRequestOps(v: RegisterTaskDefinitionRequest): RegisterTaskDefinitionRequestOps =
    new RegisterTaskDefinitionRequestOps(v)

}
