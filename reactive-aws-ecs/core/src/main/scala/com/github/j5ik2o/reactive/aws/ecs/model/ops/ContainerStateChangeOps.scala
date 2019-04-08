// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ContainerStateChangeBuilderOps(val self: ContainerStateChange.Builder) extends AnyVal {

  final def containerNameAsScala(value: Option[String]): ContainerStateChange.Builder = {
    value.fold(self) { v =>
      self.containerName(v)
    }
  }

  final def exitCodeAsScala(value: Option[Int]): ContainerStateChange.Builder = {
    value.fold(self) { v =>
      self.exitCode(v)
    }
  }

  final def networkBindingsAsScala(value: Option[Seq[NetworkBinding]]): ContainerStateChange.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.networkBindings(v.asJava)
    }
  }

  final def reasonAsScala(value: Option[String]): ContainerStateChange.Builder = {
    value.fold(self) { v =>
      self.reason(v)
    }
  }

  final def statusAsScala(value: Option[String]): ContainerStateChange.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class ContainerStateChangeOps(val self: ContainerStateChange) extends AnyVal {

  final def containerNameAsScala: Option[String] = Option(self.containerName)

  final def exitCodeAsScala: Option[Int] = Option(self.exitCode)

  final def networkBindingsAsScala: Option[Seq[NetworkBinding]] = Option(self.networkBindings).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def reasonAsScala: Option[String] = Option(self.reason)

  final def statusAsScala: Option[String] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToContainerStateChangeOps {

  implicit def toContainerStateChangeBuilderOps(v: ContainerStateChange.Builder): ContainerStateChangeBuilderOps =
    new ContainerStateChangeBuilderOps(v)

  implicit def toContainerStateChangeOps(v: ContainerStateChange): ContainerStateChangeOps =
    new ContainerStateChangeOps(v)

}
