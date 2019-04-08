// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class TaskDefinitionBuilderOps(val self: TaskDefinition.Builder) extends AnyVal {

  final def taskDefinitionArnAsScala(value: Option[String]): TaskDefinition.Builder = {
    value.fold(self) { v =>
      self.taskDefinitionArn(v)
    }
  }

  final def containerDefinitionsAsScala(value: Option[Seq[ContainerDefinition]]): TaskDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.containerDefinitions(v.asJava)
    }
  }

  final def familyAsScala(value: Option[String]): TaskDefinition.Builder = {
    value.fold(self) { v =>
      self.family(v)
    }
  }

  final def taskRoleArnAsScala(value: Option[String]): TaskDefinition.Builder = {
    value.fold(self) { v =>
      self.taskRoleArn(v)
    }
  }

  final def executionRoleArnAsScala(value: Option[String]): TaskDefinition.Builder = {
    value.fold(self) { v =>
      self.executionRoleArn(v)
    }
  }

  final def networkModeAsScala(value: Option[NetworkMode]): TaskDefinition.Builder = {
    value.fold(self) { v =>
      self.networkMode(v)
    }
  }

  final def revisionAsScala(value: Option[Int]): TaskDefinition.Builder = {
    value.fold(self) { v =>
      self.revision(v)
    }
  }

  final def volumesAsScala(value: Option[Seq[Volume]]): TaskDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.volumes(v.asJava)
    }
  }

  final def statusAsScala(value: Option[TaskDefinitionStatus]): TaskDefinition.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def requiresAttributesAsScala(value: Option[Seq[Attribute]]): TaskDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.requiresAttributes(v.asJava)
    }
  }

  final def placementConstraintsAsScala(
      value: Option[Seq[TaskDefinitionPlacementConstraint]]
  ): TaskDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.placementConstraints(v.asJava)
    }
  }

  final def compatibilitiesAsScala(value: Option[Seq[Compatibility]]): TaskDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.compatibilities(v.asJava)
    }
  }

  final def requiresCompatibilitiesAsScala(value: Option[Seq[Compatibility]]): TaskDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.requiresCompatibilities(v.asJava)
    }
  }

  final def cpuAsScala(value: Option[String]): TaskDefinition.Builder = {
    value.fold(self) { v =>
      self.cpu(v)
    }
  }

  final def memoryAsScala(value: Option[String]): TaskDefinition.Builder = {
    value.fold(self) { v =>
      self.memory(v)
    }
  }

  final def pidModeAsScala(value: Option[PidMode]): TaskDefinition.Builder = {
    value.fold(self) { v =>
      self.pidMode(v)
    }
  }

  final def ipcModeAsScala(value: Option[IpcMode]): TaskDefinition.Builder = {
    value.fold(self) { v =>
      self.ipcMode(v)
    }
  }

}

final class TaskDefinitionOps(val self: TaskDefinition) extends AnyVal {

  final def taskDefinitionArnAsScala: Option[String] = Option(self.taskDefinitionArn)

  final def containerDefinitionsAsScala: Option[Seq[ContainerDefinition]] = Option(self.containerDefinitions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def familyAsScala: Option[String] = Option(self.family)

  final def taskRoleArnAsScala: Option[String] = Option(self.taskRoleArn)

  final def executionRoleArnAsScala: Option[String] = Option(self.executionRoleArn)

  final def networkModeAsScala: Option[NetworkMode] = Option(self.networkMode)

  final def revisionAsScala: Option[Int] = Option(self.revision)

  final def volumesAsScala: Option[Seq[Volume]] = Option(self.volumes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def statusAsScala: Option[TaskDefinitionStatus] = Option(self.status)

  final def requiresAttributesAsScala: Option[Seq[Attribute]] = Option(self.requiresAttributes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def placementConstraintsAsScala: Option[Seq[TaskDefinitionPlacementConstraint]] =
    Option(self.placementConstraints).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def compatibilitiesAsScala: Option[Seq[Compatibility]] = Option(self.compatibilities).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def requiresCompatibilitiesAsScala: Option[Seq[Compatibility]] = Option(self.requiresCompatibilities).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def cpuAsScala: Option[String] = Option(self.cpu)

  final def memoryAsScala: Option[String] = Option(self.memory)

  final def pidModeAsScala: Option[PidMode] = Option(self.pidMode)

  final def ipcModeAsScala: Option[IpcMode] = Option(self.ipcMode)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTaskDefinitionOps {

  implicit def toTaskDefinitionBuilderOps(v: TaskDefinition.Builder): TaskDefinitionBuilderOps =
    new TaskDefinitionBuilderOps(v)

  implicit def toTaskDefinitionOps(v: TaskDefinition): TaskDefinitionOps = new TaskDefinitionOps(v)

}
