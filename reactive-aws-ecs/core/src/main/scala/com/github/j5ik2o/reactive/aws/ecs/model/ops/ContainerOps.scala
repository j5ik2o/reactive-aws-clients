// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ContainerBuilderOps(val self: Container.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerArnAsScala(value: Option[String]): Container.Builder = {
    value.fold(self) { v => self.containerArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskArnAsScala(value: Option[String]): Container.Builder = {
    value.fold(self) { v => self.taskArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): Container.Builder = {
    value.fold(self) { v => self.name(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageAsScala(value: Option[String]): Container.Builder = {
    value.fold(self) { v => self.image(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageDigestAsScala(value: Option[String]): Container.Builder = {
    value.fold(self) { v => self.imageDigest(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def runtimeIdAsScala(value: Option[String]): Container.Builder = {
    value.fold(self) { v => self.runtimeId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastStatusAsScala(value: Option[String]): Container.Builder = {
    value.fold(self) { v => self.lastStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exitCodeAsScala(value: Option[Int]): Container.Builder = {
    value.fold(self) { v => self.exitCode(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reasonAsScala(value: Option[String]): Container.Builder = {
    value.fold(self) { v => self.reason(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkBindingsAsScala(value: Option[Seq[NetworkBinding]]): Container.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.networkBindings(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfacesAsScala(value: Option[Seq[NetworkInterface]]): Container.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.networkInterfaces(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def healthStatusAsScala(value: Option[HealthStatus]): Container.Builder = {
    value.fold(self) { v => self.healthStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cpuAsScala(value: Option[String]): Container.Builder = {
    value.fold(self) { v => self.cpu(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryAsScala(value: Option[String]): Container.Builder = {
    value.fold(self) { v => self.memory(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryReservationAsScala(value: Option[String]): Container.Builder = {
    value.fold(self) { v => self.memoryReservation(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def gpuIdsAsScala(value: Option[Seq[String]]): Container.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.gpuIds(v.asJava)
    }
  }

}

final class ContainerOps(val self: Container) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerArnAsScala: Option[String] = Option(self.containerArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskArnAsScala: Option[String] = Option(self.taskArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageAsScala: Option[String] = Option(self.image)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageDigestAsScala: Option[String] = Option(self.imageDigest)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def runtimeIdAsScala: Option[String] = Option(self.runtimeId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastStatusAsScala: Option[String] = Option(self.lastStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exitCodeAsScala: Option[Int] = Option(self.exitCode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reasonAsScala: Option[String] = Option(self.reason)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkBindingsAsScala: Option[Seq[NetworkBinding]] =
    Option(self.networkBindings).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfacesAsScala: Option[Seq[NetworkInterface]] =
    Option(self.networkInterfaces).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def healthStatusAsScala: Option[HealthStatus] = Option(self.healthStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cpuAsScala: Option[String] = Option(self.cpu)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryAsScala: Option[String] = Option(self.memory)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryReservationAsScala: Option[String] = Option(self.memoryReservation)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def gpuIdsAsScala: Option[Seq[String]] =
    Option(self.gpuIds).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToContainerOps {

  implicit def toContainerBuilderOps(v: Container.Builder): ContainerBuilderOps = new ContainerBuilderOps(v)

  implicit def toContainerOps(v: Container): ContainerOps = new ContainerOps(v)

}
