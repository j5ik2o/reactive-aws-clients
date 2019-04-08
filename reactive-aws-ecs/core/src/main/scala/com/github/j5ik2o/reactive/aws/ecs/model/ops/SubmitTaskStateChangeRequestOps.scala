// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class SubmitTaskStateChangeRequestBuilderOps(val self: SubmitTaskStateChangeRequest.Builder) extends AnyVal {

  final def clusterAsScala(value: Option[String]): SubmitTaskStateChangeRequest.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

  final def taskAsScala(value: Option[String]): SubmitTaskStateChangeRequest.Builder = {
    value.fold(self) { v =>
      self.task(v)
    }
  }

  final def statusAsScala(value: Option[String]): SubmitTaskStateChangeRequest.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def reasonAsScala(value: Option[String]): SubmitTaskStateChangeRequest.Builder = {
    value.fold(self) { v =>
      self.reason(v)
    }
  }

  final def containersAsScala(value: Option[Seq[ContainerStateChange]]): SubmitTaskStateChangeRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.containers(v.asJava)
    }
  }

  final def attachmentsAsScala(value: Option[Seq[AttachmentStateChange]]): SubmitTaskStateChangeRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attachments(v.asJava)
    }
  }

  final def pullStartedAtAsScala(value: Option[java.time.Instant]): SubmitTaskStateChangeRequest.Builder = {
    value.fold(self) { v =>
      self.pullStartedAt(v)
    }
  }

  final def pullStoppedAtAsScala(value: Option[java.time.Instant]): SubmitTaskStateChangeRequest.Builder = {
    value.fold(self) { v =>
      self.pullStoppedAt(v)
    }
  }

  final def executionStoppedAtAsScala(value: Option[java.time.Instant]): SubmitTaskStateChangeRequest.Builder = {
    value.fold(self) { v =>
      self.executionStoppedAt(v)
    }
  }

}

final class SubmitTaskStateChangeRequestOps(val self: SubmitTaskStateChangeRequest) extends AnyVal {

  final def clusterAsScala: Option[String] = Option(self.cluster)

  final def taskAsScala: Option[String] = Option(self.task)

  final def statusAsScala: Option[String] = Option(self.status)

  final def reasonAsScala: Option[String] = Option(self.reason)

  final def containersAsScala: Option[Seq[ContainerStateChange]] = Option(self.containers).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def attachmentsAsScala: Option[Seq[AttachmentStateChange]] = Option(self.attachments).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def pullStartedAtAsScala: Option[java.time.Instant] = Option(self.pullStartedAt)

  final def pullStoppedAtAsScala: Option[java.time.Instant] = Option(self.pullStoppedAt)

  final def executionStoppedAtAsScala: Option[java.time.Instant] = Option(self.executionStoppedAt)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSubmitTaskStateChangeRequestOps {

  implicit def toSubmitTaskStateChangeRequestBuilderOps(
      v: SubmitTaskStateChangeRequest.Builder
  ): SubmitTaskStateChangeRequestBuilderOps = new SubmitTaskStateChangeRequestBuilderOps(v)

  implicit def toSubmitTaskStateChangeRequestOps(v: SubmitTaskStateChangeRequest): SubmitTaskStateChangeRequestOps =
    new SubmitTaskStateChangeRequestOps(v)

}
