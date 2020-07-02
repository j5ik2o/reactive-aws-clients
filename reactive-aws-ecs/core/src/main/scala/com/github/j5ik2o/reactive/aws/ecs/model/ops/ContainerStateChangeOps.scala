// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ContainerStateChangeBuilderOps(val self: ContainerStateChange.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerNameAsScala(value: Option[String]): ContainerStateChange.Builder = {
    value.fold(self) { v => self.containerName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageDigestAsScala(value: Option[String]): ContainerStateChange.Builder = {
    value.fold(self) { v => self.imageDigest(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def runtimeIdAsScala(value: Option[String]): ContainerStateChange.Builder = {
    value.fold(self) { v => self.runtimeId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exitCodeAsScala(value: Option[Int]): ContainerStateChange.Builder = {
    value.fold(self) { v => self.exitCode(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkBindingsAsScala(value: Option[Seq[NetworkBinding]]): ContainerStateChange.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.networkBindings(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reasonAsScala(value: Option[String]): ContainerStateChange.Builder = {
    value.fold(self) { v => self.reason(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[String]): ContainerStateChange.Builder = {
    value.fold(self) { v => self.status(v) }
  }

}

final class ContainerStateChangeOps(val self: ContainerStateChange) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerNameAsScala: Option[String] = Option(self.containerName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageDigestAsScala: Option[String] = Option(self.imageDigest)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def runtimeIdAsScala: Option[String] = Option(self.runtimeId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exitCodeAsScala: Option[Int] = Option(self.exitCode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkBindingsAsScala: Option[Seq[NetworkBinding]] =
    Option(self.networkBindings).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reasonAsScala: Option[String] = Option(self.reason)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[String] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToContainerStateChangeOps {

  implicit def toContainerStateChangeBuilderOps(v: ContainerStateChange.Builder): ContainerStateChangeBuilderOps =
    new ContainerStateChangeBuilderOps(v)

  implicit def toContainerStateChangeOps(v: ContainerStateChange): ContainerStateChangeOps =
    new ContainerStateChangeOps(v)

}
