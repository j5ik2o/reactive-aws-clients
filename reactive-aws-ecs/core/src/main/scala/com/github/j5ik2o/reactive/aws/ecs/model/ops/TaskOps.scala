// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class TaskBuilderOps(val self: Task.Builder) extends AnyVal {

  final def taskArnAsScala(value: Option[String]): Task.Builder = {
    value.fold(self) { v =>
      self.taskArn(v)
    }
  }

  final def clusterArnAsScala(value: Option[String]): Task.Builder = {
    value.fold(self) { v =>
      self.clusterArn(v)
    }
  }

  final def taskDefinitionArnAsScala(value: Option[String]): Task.Builder = {
    value.fold(self) { v =>
      self.taskDefinitionArn(v)
    }
  }

  final def containerInstanceArnAsScala(value: Option[String]): Task.Builder = {
    value.fold(self) { v =>
      self.containerInstanceArn(v)
    }
  }

  final def overridesAsScala(value: Option[TaskOverride]): Task.Builder = {
    value.fold(self) { v =>
      self.overrides(v)
    }
  }

  final def lastStatusAsScala(value: Option[String]): Task.Builder = {
    value.fold(self) { v =>
      self.lastStatus(v)
    }
  }

  final def desiredStatusAsScala(value: Option[String]): Task.Builder = {
    value.fold(self) { v =>
      self.desiredStatus(v)
    }
  }

  final def cpuAsScala(value: Option[String]): Task.Builder = {
    value.fold(self) { v =>
      self.cpu(v)
    }
  }

  final def memoryAsScala(value: Option[String]): Task.Builder = {
    value.fold(self) { v =>
      self.memory(v)
    }
  }

  final def containersAsScala(value: Option[Seq[Container]]): Task.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.containers(v.asJava)
    }
  }

  final def startedByAsScala(value: Option[String]): Task.Builder = {
    value.fold(self) { v =>
      self.startedBy(v)
    }
  }

  final def versionAsScala(value: Option[Long]): Task.Builder = {
    value.fold(self) { v =>
      self.version(v)
    }
  }

  final def stoppedReasonAsScala(value: Option[String]): Task.Builder = {
    value.fold(self) { v =>
      self.stoppedReason(v)
    }
  }

  final def stopCodeAsScala(value: Option[TaskStopCode]): Task.Builder = {
    value.fold(self) { v =>
      self.stopCode(v)
    }
  }

  final def connectivityAsScala(value: Option[Connectivity]): Task.Builder = {
    value.fold(self) { v =>
      self.connectivity(v)
    }
  }

  final def connectivityAtAsScala(value: Option[java.time.Instant]): Task.Builder = {
    value.fold(self) { v =>
      self.connectivityAt(v)
    }
  }

  final def pullStartedAtAsScala(value: Option[java.time.Instant]): Task.Builder = {
    value.fold(self) { v =>
      self.pullStartedAt(v)
    }
  }

  final def pullStoppedAtAsScala(value: Option[java.time.Instant]): Task.Builder = {
    value.fold(self) { v =>
      self.pullStoppedAt(v)
    }
  }

  final def executionStoppedAtAsScala(value: Option[java.time.Instant]): Task.Builder = {
    value.fold(self) { v =>
      self.executionStoppedAt(v)
    }
  }

  final def createdAtAsScala(value: Option[java.time.Instant]): Task.Builder = {
    value.fold(self) { v =>
      self.createdAt(v)
    }
  }

  final def startedAtAsScala(value: Option[java.time.Instant]): Task.Builder = {
    value.fold(self) { v =>
      self.startedAt(v)
    }
  }

  final def stoppingAtAsScala(value: Option[java.time.Instant]): Task.Builder = {
    value.fold(self) { v =>
      self.stoppingAt(v)
    }
  }

  final def stoppedAtAsScala(value: Option[java.time.Instant]): Task.Builder = {
    value.fold(self) { v =>
      self.stoppedAt(v)
    }
  }

  final def groupAsScala(value: Option[String]): Task.Builder = {
    value.fold(self) { v =>
      self.group(v)
    }
  }

  final def launchTypeAsScala(value: Option[LaunchType]): Task.Builder = {
    value.fold(self) { v =>
      self.launchType(v)
    }
  }

  final def platformVersionAsScala(value: Option[String]): Task.Builder = {
    value.fold(self) { v =>
      self.platformVersion(v)
    }
  }

  final def attachmentsAsScala(value: Option[Seq[Attachment]]): Task.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attachments(v.asJava)
    }
  }

  final def healthStatusAsScala(value: Option[HealthStatus]): Task.Builder = {
    value.fold(self) { v =>
      self.healthStatus(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): Task.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class TaskOps(val self: Task) extends AnyVal {

  final def taskArnAsScala: Option[String] = Option(self.taskArn)

  final def clusterArnAsScala: Option[String] = Option(self.clusterArn)

  final def taskDefinitionArnAsScala: Option[String] = Option(self.taskDefinitionArn)

  final def containerInstanceArnAsScala: Option[String] = Option(self.containerInstanceArn)

  final def overridesAsScala: Option[TaskOverride] = Option(self.overrides)

  final def lastStatusAsScala: Option[String] = Option(self.lastStatus)

  final def desiredStatusAsScala: Option[String] = Option(self.desiredStatus)

  final def cpuAsScala: Option[String] = Option(self.cpu)

  final def memoryAsScala: Option[String] = Option(self.memory)

  final def containersAsScala: Option[Seq[Container]] = Option(self.containers).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def startedByAsScala: Option[String] = Option(self.startedBy)

  final def versionAsScala: Option[Long] = Option(self.version)

  final def stoppedReasonAsScala: Option[String] = Option(self.stoppedReason)

  final def stopCodeAsScala: Option[TaskStopCode] = Option(self.stopCode)

  final def connectivityAsScala: Option[Connectivity] = Option(self.connectivity)

  final def connectivityAtAsScala: Option[java.time.Instant] = Option(self.connectivityAt)

  final def pullStartedAtAsScala: Option[java.time.Instant] = Option(self.pullStartedAt)

  final def pullStoppedAtAsScala: Option[java.time.Instant] = Option(self.pullStoppedAt)

  final def executionStoppedAtAsScala: Option[java.time.Instant] = Option(self.executionStoppedAt)

  final def createdAtAsScala: Option[java.time.Instant] = Option(self.createdAt)

  final def startedAtAsScala: Option[java.time.Instant] = Option(self.startedAt)

  final def stoppingAtAsScala: Option[java.time.Instant] = Option(self.stoppingAt)

  final def stoppedAtAsScala: Option[java.time.Instant] = Option(self.stoppedAt)

  final def groupAsScala: Option[String] = Option(self.group)

  final def launchTypeAsScala: Option[LaunchType] = Option(self.launchType)

  final def platformVersionAsScala: Option[String] = Option(self.platformVersion)

  final def attachmentsAsScala: Option[Seq[Attachment]] = Option(self.attachments).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def healthStatusAsScala: Option[HealthStatus] = Option(self.healthStatus)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTaskOps {

  implicit def toTaskBuilderOps(v: Task.Builder): TaskBuilderOps = new TaskBuilderOps(v)

  implicit def toTaskOps(v: Task): TaskOps = new TaskOps(v)

}
