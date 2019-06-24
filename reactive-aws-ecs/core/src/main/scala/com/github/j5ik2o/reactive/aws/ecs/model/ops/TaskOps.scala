// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class TaskBuilderOps(val self: Task.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskArnAsScala(value: Option[String]): Task.Builder = {
    value.fold(self) { v =>
      self.taskArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterArnAsScala(value: Option[String]): Task.Builder = {
    value.fold(self) { v =>
      self.clusterArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskDefinitionArnAsScala(value: Option[String]): Task.Builder = {
    value.fold(self) { v =>
      self.taskDefinitionArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerInstanceArnAsScala(value: Option[String]): Task.Builder = {
    value.fold(self) { v =>
      self.containerInstanceArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def overridesAsScala(value: Option[TaskOverride]): Task.Builder = {
    value.fold(self) { v =>
      self.overrides(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastStatusAsScala(value: Option[String]): Task.Builder = {
    value.fold(self) { v =>
      self.lastStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def desiredStatusAsScala(value: Option[String]): Task.Builder = {
    value.fold(self) { v =>
      self.desiredStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cpuAsScala(value: Option[String]): Task.Builder = {
    value.fold(self) { v =>
      self.cpu(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryAsScala(value: Option[String]): Task.Builder = {
    value.fold(self) { v =>
      self.memory(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containersAsScala(value: Option[Seq[Container]]): Task.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.containers(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startedByAsScala(value: Option[String]): Task.Builder = {
    value.fold(self) { v =>
      self.startedBy(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionAsScala(value: Option[Long]): Task.Builder = {
    value.fold(self) { v =>
      self.version(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stoppedReasonAsScala(value: Option[String]): Task.Builder = {
    value.fold(self) { v =>
      self.stoppedReason(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stopCodeAsScala(value: Option[TaskStopCode]): Task.Builder = {
    value.fold(self) { v =>
      self.stopCode(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectivityAsScala(value: Option[Connectivity]): Task.Builder = {
    value.fold(self) { v =>
      self.connectivity(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectivityAtAsScala(value: Option[java.time.Instant]): Task.Builder = {
    value.fold(self) { v =>
      self.connectivityAt(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pullStartedAtAsScala(value: Option[java.time.Instant]): Task.Builder = {
    value.fold(self) { v =>
      self.pullStartedAt(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pullStoppedAtAsScala(value: Option[java.time.Instant]): Task.Builder = {
    value.fold(self) { v =>
      self.pullStoppedAt(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def executionStoppedAtAsScala(value: Option[java.time.Instant]): Task.Builder = {
    value.fold(self) { v =>
      self.executionStoppedAt(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdAtAsScala(value: Option[java.time.Instant]): Task.Builder = {
    value.fold(self) { v =>
      self.createdAt(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startedAtAsScala(value: Option[java.time.Instant]): Task.Builder = {
    value.fold(self) { v =>
      self.startedAt(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stoppingAtAsScala(value: Option[java.time.Instant]): Task.Builder = {
    value.fold(self) { v =>
      self.stoppingAt(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stoppedAtAsScala(value: Option[java.time.Instant]): Task.Builder = {
    value.fold(self) { v =>
      self.stoppedAt(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupAsScala(value: Option[String]): Task.Builder = {
    value.fold(self) { v =>
      self.group(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTypeAsScala(value: Option[LaunchType]): Task.Builder = {
    value.fold(self) { v =>
      self.launchType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformVersionAsScala(value: Option[String]): Task.Builder = {
    value.fold(self) { v =>
      self.platformVersion(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentsAsScala(value: Option[Seq[Attachment]]): Task.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attachments(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def healthStatusAsScala(value: Option[HealthStatus]): Task.Builder = {
    value.fold(self) { v =>
      self.healthStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): Task.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class TaskOps(val self: Task) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskArnAsScala: Option[String] = Option(self.taskArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterArnAsScala: Option[String] = Option(self.clusterArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskDefinitionArnAsScala: Option[String] = Option(self.taskDefinitionArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerInstanceArnAsScala: Option[String] = Option(self.containerInstanceArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def overridesAsScala: Option[TaskOverride] = Option(self.overrides)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastStatusAsScala: Option[String] = Option(self.lastStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def desiredStatusAsScala: Option[String] = Option(self.desiredStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cpuAsScala: Option[String] = Option(self.cpu)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryAsScala: Option[String] = Option(self.memory)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containersAsScala: Option[Seq[Container]] = Option(self.containers).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startedByAsScala: Option[String] = Option(self.startedBy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionAsScala: Option[Long] = Option(self.version)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stoppedReasonAsScala: Option[String] = Option(self.stoppedReason)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stopCodeAsScala: Option[TaskStopCode] = Option(self.stopCode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectivityAsScala: Option[Connectivity] = Option(self.connectivity)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectivityAtAsScala: Option[java.time.Instant] = Option(self.connectivityAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pullStartedAtAsScala: Option[java.time.Instant] = Option(self.pullStartedAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pullStoppedAtAsScala: Option[java.time.Instant] = Option(self.pullStoppedAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def executionStoppedAtAsScala: Option[java.time.Instant] = Option(self.executionStoppedAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdAtAsScala: Option[java.time.Instant] = Option(self.createdAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startedAtAsScala: Option[java.time.Instant] = Option(self.startedAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stoppingAtAsScala: Option[java.time.Instant] = Option(self.stoppingAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stoppedAtAsScala: Option[java.time.Instant] = Option(self.stoppedAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupAsScala: Option[String] = Option(self.group)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTypeAsScala: Option[LaunchType] = Option(self.launchType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformVersionAsScala: Option[String] = Option(self.platformVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentsAsScala: Option[Seq[Attachment]] = Option(self.attachments).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def healthStatusAsScala: Option[HealthStatus] = Option(self.healthStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTaskOps {

  implicit def toTaskBuilderOps(v: Task.Builder): TaskBuilderOps = new TaskBuilderOps(v)

  implicit def toTaskOps(v: Task): TaskOps = new TaskOps(v)

}
