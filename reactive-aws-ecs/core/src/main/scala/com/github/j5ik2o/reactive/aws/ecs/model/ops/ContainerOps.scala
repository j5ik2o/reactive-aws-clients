// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ContainerBuilderOps(val self: Container.Builder) extends AnyVal {

  final def containerArnAsScala(value: Option[String]): Container.Builder = {
    value.fold(self) { v =>
      self.containerArn(v)
    }
  }

  final def taskArnAsScala(value: Option[String]): Container.Builder = {
    value.fold(self) { v =>
      self.taskArn(v)
    }
  }

  final def nameAsScala(value: Option[String]): Container.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def lastStatusAsScala(value: Option[String]): Container.Builder = {
    value.fold(self) { v =>
      self.lastStatus(v)
    }
  }

  final def exitCodeAsScala(value: Option[Int]): Container.Builder = {
    value.fold(self) { v =>
      self.exitCode(v)
    }
  }

  final def reasonAsScala(value: Option[String]): Container.Builder = {
    value.fold(self) { v =>
      self.reason(v)
    }
  }

  final def networkBindingsAsScala(value: Option[Seq[NetworkBinding]]): Container.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.networkBindings(v.asJava)
    }
  }

  final def networkInterfacesAsScala(value: Option[Seq[NetworkInterface]]): Container.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.networkInterfaces(v.asJava)
    }
  }

  final def healthStatusAsScala(value: Option[HealthStatus]): Container.Builder = {
    value.fold(self) { v =>
      self.healthStatus(v)
    }
  }

  final def cpuAsScala(value: Option[String]): Container.Builder = {
    value.fold(self) { v =>
      self.cpu(v)
    }
  }

  final def memoryAsScala(value: Option[String]): Container.Builder = {
    value.fold(self) { v =>
      self.memory(v)
    }
  }

  final def memoryReservationAsScala(value: Option[String]): Container.Builder = {
    value.fold(self) { v =>
      self.memoryReservation(v)
    }
  }

  final def gpuIdsAsScala(value: Option[Seq[String]]): Container.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.gpuIds(v.asJava)
    }
  }

}

final class ContainerOps(val self: Container) extends AnyVal {

  final def containerArnAsScala: Option[String] = Option(self.containerArn)

  final def taskArnAsScala: Option[String] = Option(self.taskArn)

  final def nameAsScala: Option[String] = Option(self.name)

  final def lastStatusAsScala: Option[String] = Option(self.lastStatus)

  final def exitCodeAsScala: Option[Int] = Option(self.exitCode)

  final def reasonAsScala: Option[String] = Option(self.reason)

  final def networkBindingsAsScala: Option[Seq[NetworkBinding]] = Option(self.networkBindings).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def networkInterfacesAsScala: Option[Seq[NetworkInterface]] = Option(self.networkInterfaces).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def healthStatusAsScala: Option[HealthStatus] = Option(self.healthStatus)

  final def cpuAsScala: Option[String] = Option(self.cpu)

  final def memoryAsScala: Option[String] = Option(self.memory)

  final def memoryReservationAsScala: Option[String] = Option(self.memoryReservation)

  final def gpuIdsAsScala: Option[Seq[String]] = Option(self.gpuIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToContainerOps {

  implicit def toContainerBuilderOps(v: Container.Builder): ContainerBuilderOps = new ContainerBuilderOps(v)

  implicit def toContainerOps(v: Container): ContainerOps = new ContainerOps(v)

}
