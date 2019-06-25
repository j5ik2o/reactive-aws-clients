// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class TaskSetBuilderOps(val self: TaskSet.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala(value: Option[String]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskSetArnAsScala(value: Option[String]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.taskSetArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceArnAsScala(value: Option[String]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.serviceArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterArnAsScala(value: Option[String]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.clusterArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startedByAsScala(value: Option[String]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.startedBy(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def externalIdAsScala(value: Option[String]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.externalId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[String]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskDefinitionAsScala(value: Option[String]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.taskDefinition(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computedDesiredCountAsScala(value: Option[Int]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.computedDesiredCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pendingCountAsScala(value: Option[Int]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.pendingCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def runningCountAsScala(value: Option[Int]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.runningCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdAtAsScala(value: Option[java.time.Instant]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.createdAt(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def updatedAtAsScala(value: Option[java.time.Instant]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.updatedAt(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTypeAsScala(value: Option[LaunchType]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.launchType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformVersionAsScala(value: Option[String]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.platformVersion(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkConfigurationAsScala(value: Option[NetworkConfiguration]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.networkConfiguration(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def loadBalancersAsScala(value: Option[Seq[LoadBalancer]]): TaskSet.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.loadBalancers(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceRegistriesAsScala(value: Option[Seq[ServiceRegistry]]): TaskSet.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.serviceRegistries(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scaleAsScala(value: Option[Scale]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.scale(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stabilityStatusAsScala(value: Option[StabilityStatus]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.stabilityStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stabilityStatusAtAsScala(value: Option[java.time.Instant]): TaskSet.Builder = {
    value.fold(self) { v =>
      self.stabilityStatusAt(v)
    }
  }

}

final class TaskSetOps(val self: TaskSet) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala: Option[String] = Option(self.id)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskSetArnAsScala: Option[String] = Option(self.taskSetArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceArnAsScala: Option[String] = Option(self.serviceArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterArnAsScala: Option[String] = Option(self.clusterArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startedByAsScala: Option[String] = Option(self.startedBy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def externalIdAsScala: Option[String] = Option(self.externalId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[String] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskDefinitionAsScala: Option[String] = Option(self.taskDefinition)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computedDesiredCountAsScala: Option[Int] = Option(self.computedDesiredCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pendingCountAsScala: Option[Int] = Option(self.pendingCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def runningCountAsScala: Option[Int] = Option(self.runningCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdAtAsScala: Option[java.time.Instant] = Option(self.createdAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def updatedAtAsScala: Option[java.time.Instant] = Option(self.updatedAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTypeAsScala: Option[LaunchType] = Option(self.launchType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformVersionAsScala: Option[String] = Option(self.platformVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkConfigurationAsScala: Option[NetworkConfiguration] = Option(self.networkConfiguration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def loadBalancersAsScala: Option[Seq[LoadBalancer]] = Option(self.loadBalancers).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceRegistriesAsScala: Option[Seq[ServiceRegistry]] = Option(self.serviceRegistries).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scaleAsScala: Option[Scale] = Option(self.scale)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stabilityStatusAsScala: Option[StabilityStatus] = Option(self.stabilityStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stabilityStatusAtAsScala: Option[java.time.Instant] = Option(self.stabilityStatusAt)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTaskSetOps {

  implicit def toTaskSetBuilderOps(v: TaskSet.Builder): TaskSetBuilderOps = new TaskSetBuilderOps(v)

  implicit def toTaskSetOps(v: TaskSet): TaskSetOps = new TaskSetOps(v)

}
