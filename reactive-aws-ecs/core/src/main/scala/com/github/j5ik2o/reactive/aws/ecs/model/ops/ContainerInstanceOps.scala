// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ContainerInstanceBuilderOps(val self: ContainerInstance.Builder) extends AnyVal {

  final def containerInstanceArnAsScala(value: Option[String]): ContainerInstance.Builder = {
    value.fold(self) { v =>
      self.containerInstanceArn(v)
    }
  }

  final def ec2InstanceIdAsScala(value: Option[String]): ContainerInstance.Builder = {
    value.fold(self) { v =>
      self.ec2InstanceId(v)
    }
  }

  final def versionAsScala(value: Option[Long]): ContainerInstance.Builder = {
    value.fold(self) { v =>
      self.version(v)
    }
  }

  final def versionInfoAsScala(value: Option[VersionInfo]): ContainerInstance.Builder = {
    value.fold(self) { v =>
      self.versionInfo(v)
    }
  }

  final def remainingResourcesAsScala(value: Option[Seq[Resource]]): ContainerInstance.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.remainingResources(v.asJava)
    }
  }

  final def registeredResourcesAsScala(value: Option[Seq[Resource]]): ContainerInstance.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.registeredResources(v.asJava)
    }
  }

  final def statusAsScala(value: Option[String]): ContainerInstance.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def agentConnectedAsScala(value: Option[Boolean]): ContainerInstance.Builder = {
    value.fold(self) { v =>
      self.agentConnected(v)
    }
  }

  final def runningTasksCountAsScala(value: Option[Int]): ContainerInstance.Builder = {
    value.fold(self) { v =>
      self.runningTasksCount(v)
    }
  }

  final def pendingTasksCountAsScala(value: Option[Int]): ContainerInstance.Builder = {
    value.fold(self) { v =>
      self.pendingTasksCount(v)
    }
  }

  final def agentUpdateStatusAsScala(value: Option[AgentUpdateStatus]): ContainerInstance.Builder = {
    value.fold(self) { v =>
      self.agentUpdateStatus(v)
    }
  }

  final def attributesAsScala(value: Option[Seq[Attribute]]): ContainerInstance.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributes(v.asJava)
    }
  }

  final def registeredAtAsScala(value: Option[java.time.Instant]): ContainerInstance.Builder = {
    value.fold(self) { v =>
      self.registeredAt(v)
    }
  }

  final def attachmentsAsScala(value: Option[Seq[Attachment]]): ContainerInstance.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attachments(v.asJava)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): ContainerInstance.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class ContainerInstanceOps(val self: ContainerInstance) extends AnyVal {

  final def containerInstanceArnAsScala: Option[String] = Option(self.containerInstanceArn)

  final def ec2InstanceIdAsScala: Option[String] = Option(self.ec2InstanceId)

  final def versionAsScala: Option[Long] = Option(self.version)

  final def versionInfoAsScala: Option[VersionInfo] = Option(self.versionInfo)

  final def remainingResourcesAsScala: Option[Seq[Resource]] = Option(self.remainingResources).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def registeredResourcesAsScala: Option[Seq[Resource]] = Option(self.registeredResources).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def statusAsScala: Option[String] = Option(self.status)

  final def agentConnectedAsScala: Option[Boolean] = Option(self.agentConnected)

  final def runningTasksCountAsScala: Option[Int] = Option(self.runningTasksCount)

  final def pendingTasksCountAsScala: Option[Int] = Option(self.pendingTasksCount)

  final def agentUpdateStatusAsScala: Option[AgentUpdateStatus] = Option(self.agentUpdateStatus)

  final def attributesAsScala: Option[Seq[Attribute]] = Option(self.attributes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def registeredAtAsScala: Option[java.time.Instant] = Option(self.registeredAt)

  final def attachmentsAsScala: Option[Seq[Attachment]] = Option(self.attachments).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToContainerInstanceOps {

  implicit def toContainerInstanceBuilderOps(v: ContainerInstance.Builder): ContainerInstanceBuilderOps =
    new ContainerInstanceBuilderOps(v)

  implicit def toContainerInstanceOps(v: ContainerInstance): ContainerInstanceOps = new ContainerInstanceOps(v)

}
