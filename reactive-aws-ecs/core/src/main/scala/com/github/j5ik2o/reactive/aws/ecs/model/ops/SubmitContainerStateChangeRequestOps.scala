// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class SubmitContainerStateChangeRequestBuilderOps(val self: SubmitContainerStateChangeRequest.Builder)
    extends AnyVal {

  final def clusterAsScala(value: Option[String]): SubmitContainerStateChangeRequest.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

  final def taskAsScala(value: Option[String]): SubmitContainerStateChangeRequest.Builder = {
    value.fold(self) { v =>
      self.task(v)
    }
  }

  final def containerNameAsScala(value: Option[String]): SubmitContainerStateChangeRequest.Builder = {
    value.fold(self) { v =>
      self.containerName(v)
    }
  }

  final def statusAsScala(value: Option[String]): SubmitContainerStateChangeRequest.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def exitCodeAsScala(value: Option[Int]): SubmitContainerStateChangeRequest.Builder = {
    value.fold(self) { v =>
      self.exitCode(v)
    }
  }

  final def reasonAsScala(value: Option[String]): SubmitContainerStateChangeRequest.Builder = {
    value.fold(self) { v =>
      self.reason(v)
    }
  }

  final def networkBindingsAsScala(value: Option[Seq[NetworkBinding]]): SubmitContainerStateChangeRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.networkBindings(v.asJava)
    }
  }

}

final class SubmitContainerStateChangeRequestOps(val self: SubmitContainerStateChangeRequest) extends AnyVal {

  final def clusterAsScala: Option[String] = Option(self.cluster)

  final def taskAsScala: Option[String] = Option(self.task)

  final def containerNameAsScala: Option[String] = Option(self.containerName)

  final def statusAsScala: Option[String] = Option(self.status)

  final def exitCodeAsScala: Option[Int] = Option(self.exitCode)

  final def reasonAsScala: Option[String] = Option(self.reason)

  final def networkBindingsAsScala: Option[Seq[NetworkBinding]] = Option(self.networkBindings).map { v =>
    import scala.collection.JavaConverters._; v.asScala
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
