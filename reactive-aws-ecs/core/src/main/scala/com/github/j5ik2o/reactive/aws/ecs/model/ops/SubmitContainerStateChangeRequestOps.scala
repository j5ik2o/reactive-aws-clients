// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class SubmitContainerStateChangeRequestBuilderOps(val self: SubmitContainerStateChangeRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala(value: Option[String]): SubmitContainerStateChangeRequest.Builder = {
    value.fold(self) { v => self.cluster(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskAsScala(value: Option[String]): SubmitContainerStateChangeRequest.Builder = {
    value.fold(self) { v => self.task(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerNameAsScala(value: Option[String]): SubmitContainerStateChangeRequest.Builder = {
    value.fold(self) { v => self.containerName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def runtimeIdAsScala(value: Option[String]): SubmitContainerStateChangeRequest.Builder = {
    value.fold(self) { v => self.runtimeId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[String]): SubmitContainerStateChangeRequest.Builder = {
    value.fold(self) { v => self.status(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exitCodeAsScala(value: Option[Int]): SubmitContainerStateChangeRequest.Builder = {
    value.fold(self) { v => self.exitCode(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reasonAsScala(value: Option[String]): SubmitContainerStateChangeRequest.Builder = {
    value.fold(self) { v => self.reason(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkBindingsAsScala(value: Option[Seq[NetworkBinding]]): SubmitContainerStateChangeRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.networkBindings(v.asJava)
    }
  }

}

final class SubmitContainerStateChangeRequestOps(val self: SubmitContainerStateChangeRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala: Option[String] = Option(self.cluster)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskAsScala: Option[String] = Option(self.task)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerNameAsScala: Option[String] = Option(self.containerName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def runtimeIdAsScala: Option[String] = Option(self.runtimeId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[String] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exitCodeAsScala: Option[Int] = Option(self.exitCode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reasonAsScala: Option[String] = Option(self.reason)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkBindingsAsScala: Option[Seq[NetworkBinding]] =
    Option(self.networkBindings).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSubmitContainerStateChangeRequestOps {

  implicit def toSubmitContainerStateChangeRequestBuilderOps(
      v: SubmitContainerStateChangeRequest.Builder
  ): SubmitContainerStateChangeRequestBuilderOps = new SubmitContainerStateChangeRequestBuilderOps(v)

  implicit def toSubmitContainerStateChangeRequestOps(
      v: SubmitContainerStateChangeRequest
  ): SubmitContainerStateChangeRequestOps = new SubmitContainerStateChangeRequestOps(v)

}
