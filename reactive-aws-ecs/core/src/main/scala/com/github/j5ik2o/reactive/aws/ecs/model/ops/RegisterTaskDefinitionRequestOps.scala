// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class RegisterTaskDefinitionRequestBuilderOps(val self: RegisterTaskDefinitionRequest.Builder) extends AnyVal {

  final def familyAsScala(value: Option[String]): RegisterTaskDefinitionRequest.Builder = {
    value.fold(self) { v =>
      self.family(v)
    }
  }

  final def taskRoleArnAsScala(value: Option[String]): RegisterTaskDefinitionRequest.Builder = {
    value.fold(self) { v =>
      self.taskRoleArn(v)
    }
  }

  final def executionRoleArnAsScala(value: Option[String]): RegisterTaskDefinitionRequest.Builder = {
    value.fold(self) { v =>
      self.executionRoleArn(v)
    }
  }

  final def networkModeAsScala(value: Option[NetworkMode]): RegisterTaskDefinitionRequest.Builder = {
    value.fold(self) { v =>
      self.networkMode(v)
    }
  }

  final def containerDefinitionsAsScala(
      value: Option[Seq[ContainerDefinition]]
  ): RegisterTaskDefinitionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.containerDefinitions(v.asJava)
    }
  }

  final def volumesAsScala(value: Option[Seq[Volume]]): RegisterTaskDefinitionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.volumes(v.asJava)
    }
  }

  final def placementConstraintsAsScala(
      value: Option[Seq[TaskDefinitionPlacementConstraint]]
  ): RegisterTaskDefinitionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.placementConstraints(v.asJava)
    }
  }

  final def requiresCompatibilitiesAsScala(value: Option[Seq[Compatibility]]): RegisterTaskDefinitionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.requiresCompatibilities(v.asJava)
    }
  }

  final def cpuAsScala(value: Option[String]): RegisterTaskDefinitionRequest.Builder = {
    value.fold(self) { v =>
      self.cpu(v)
    }
  }

  final def memoryAsScala(value: Option[String]): RegisterTaskDefinitionRequest.Builder = {
    value.fold(self) { v =>
      self.memory(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): RegisterTaskDefinitionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def pidModeAsScala(value: Option[PidMode]): RegisterTaskDefinitionRequest.Builder = {
    value.fold(self) { v =>
      self.pidMode(v)
    }
  }

  final def ipcModeAsScala(value: Option[IpcMode]): RegisterTaskDefinitionRequest.Builder = {
    value.fold(self) { v =>
      self.ipcMode(v)
    }
  }

}

final class RegisterTaskDefinitionRequestOps(val self: RegisterTaskDefinitionRequest) extends AnyVal {

  final def familyAsScala: Option[String] = Option(self.family)

  final def taskRoleArnAsScala: Option[String] = Option(self.taskRoleArn)

  final def executionRoleArnAsScala: Option[String] = Option(self.executionRoleArn)

  final def networkModeAsScala: Option[NetworkMode] = Option(self.networkMode)

  final def containerDefinitionsAsScala: Option[Seq[ContainerDefinition]] = Option(self.containerDefinitions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def volumesAsScala: Option[Seq[Volume]] = Option(self.volumes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def placementConstraintsAsScala: Option[Seq[TaskDefinitionPlacementConstraint]] =
    Option(self.placementConstraints).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def requiresCompatibilitiesAsScala: Option[Seq[Compatibility]] = Option(self.requiresCompatibilities).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def cpuAsScala: Option[String] = Option(self.cpu)

  final def memoryAsScala: Option[String] = Option(self.memory)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def pidModeAsScala: Option[PidMode] = Option(self.pidMode)

  final def ipcModeAsScala: Option[IpcMode] = Option(self.ipcMode)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRegisterTaskDefinitionRequestOps {

  implicit def toRegisterTaskDefinitionRequestBuilderOps(
      v: RegisterTaskDefinitionRequest.Builder
  ): RegisterTaskDefinitionRequestBuilderOps = new RegisterTaskDefinitionRequestBuilderOps(v)

  implicit def toRegisterTaskDefinitionRequestOps(v: RegisterTaskDefinitionRequest): RegisterTaskDefinitionRequestOps =
    new RegisterTaskDefinitionRequestOps(v)

}
