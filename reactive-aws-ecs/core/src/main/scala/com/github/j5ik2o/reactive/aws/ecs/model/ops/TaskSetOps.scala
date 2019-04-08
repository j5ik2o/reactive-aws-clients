// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class TaskSetBuilderOps(val self: TaskSet.Builder) extends AnyVal {

  final def idAsScala(value: Option[String]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

  final def taskSetArnAsScala(value: Option[String]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.taskSetArn(v)
    }
  }

  final def startedByAsScala(value: Option[String]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.startedBy(v)
    }
  }

  final def externalIdAsScala(value: Option[String]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.externalId(v)
    }
  }

  final def statusAsScala(value: Option[String]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def taskDefinitionAsScala(value: Option[String]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.taskDefinition(v)
    }
  }

  final def computedDesiredCountAsScala(value: Option[Int]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.computedDesiredCount(v)
    }
  }

  final def pendingCountAsScala(value: Option[Int]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.pendingCount(v)
    }
  }

  final def runningCountAsScala(value: Option[Int]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.runningCount(v)
    }
  }

  final def createdAtAsScala(value: Option[java.time.Instant]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.createdAt(v)
    }
  }

  final def updatedAtAsScala(value: Option[java.time.Instant]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.updatedAt(v)
    }
  }

  final def launchTypeAsScala(value: Option[LaunchType]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.launchType(v)
    }
  }

  final def platformVersionAsScala(value: Option[String]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.platformVersion(v)
    }
  }

  final def networkConfigurationAsScala(value: Option[NetworkConfiguration]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.networkConfiguration(v)
    }
  }

  final def loadBalancersAsScala(value: Option[Seq[LoadBalancer]]): TaskSet.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.loadBalancers(v.asJava)
    }
  }

  final def scaleAsScala(value: Option[Scale]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.scale(v)
    }
  }

  final def stabilityStatusAsScala(value: Option[StabilityStatus]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.stabilityStatus(v)
    }
  }

  final def stabilityStatusAtAsScala(value: Option[java.time.Instant]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.stabilityStatusAt(v)
    }
  }

}

final class TaskSetOps(val self: TaskSet) extends AnyVal {

  final def idAsScala: Option[String] = Option(self.id)

  final def taskSetArnAsScala: Option[String] = Option(self.taskSetArn)

  final def startedByAsScala: Option[String] = Option(self.startedBy)

  final def externalIdAsScala: Option[String] = Option(self.externalId)

  final def statusAsScala: Option[String] = Option(self.status)

  final def taskDefinitionAsScala: Option[String] = Option(self.taskDefinition)

  final def computedDesiredCountAsScala: Option[Int] = Option(self.computedDesiredCount)

  final def pendingCountAsScala: Option[Int] = Option(self.pendingCount)

  final def runningCountAsScala: Option[Int] = Option(self.runningCount)

  final def createdAtAsScala: Option[java.time.Instant] = Option(self.createdAt)

  final def updatedAtAsScala: Option[java.time.Instant] = Option(self.updatedAt)

  final def launchTypeAsScala: Option[LaunchType] = Option(self.launchType)

  final def platformVersionAsScala: Option[String] = Option(self.platformVersion)

  final def networkConfigurationAsScala: Option[NetworkConfiguration] = Option(self.networkConfiguration)

  final def loadBalancersAsScala: Option[Seq[LoadBalancer]] = Option(self.loadBalancers).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def scaleAsScala: Option[Scale] = Option(self.scale)

  final def stabilityStatusAsScala: Option[StabilityStatus] = Option(self.stabilityStatus)

  final def stabilityStatusAtAsScala: Option[java.time.Instant] = Option(self.stabilityStatusAt)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTaskSetOps {

  implicit def toTaskSetBuilderOps(v: TaskSet.Builder): TaskSetBuilderOps = new TaskSetBuilderOps(v)

  implicit def toTaskSetOps(v: TaskSet): TaskSetOps = new TaskSetOps(v)

}
