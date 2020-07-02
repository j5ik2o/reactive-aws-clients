// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class JobSummaryBuilderOps(val self: JobSummary.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobIdAsScala(value: Option[String]): JobSummary.Builder = {
    value.fold(self) { v => self.jobId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobNameAsScala(value: Option[String]): JobSummary.Builder = {
    value.fold(self) { v => self.jobName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdAtAsScala(value: Option[Long]): JobSummary.Builder = {
    value.fold(self) { v => self.createdAt(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[JobStatus]): JobSummary.Builder = {
    value.fold(self) { v => self.status(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusReasonAsScala(value: Option[String]): JobSummary.Builder = {
    value.fold(self) { v => self.statusReason(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startedAtAsScala(value: Option[Long]): JobSummary.Builder = {
    value.fold(self) { v => self.startedAt(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stoppedAtAsScala(value: Option[Long]): JobSummary.Builder = {
    value.fold(self) { v => self.stoppedAt(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerAsScala(value: Option[ContainerSummary]): JobSummary.Builder = {
    value.fold(self) { v => self.container(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arrayPropertiesAsScala(value: Option[ArrayPropertiesSummary]): JobSummary.Builder = {
    value.fold(self) { v => self.arrayProperties(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodePropertiesAsScala(value: Option[NodePropertiesSummary]): JobSummary.Builder = {
    value.fold(self) { v => self.nodeProperties(v) }
  }

}

final class JobSummaryOps(val self: JobSummary) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobIdAsScala: Option[String] = Option(self.jobId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobNameAsScala: Option[String] = Option(self.jobName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdAtAsScala: Option[Long] = Option(self.createdAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[JobStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusReasonAsScala: Option[String] = Option(self.statusReason)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startedAtAsScala: Option[Long] = Option(self.startedAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stoppedAtAsScala: Option[Long] = Option(self.stoppedAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerAsScala: Option[ContainerSummary] = Option(self.container)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arrayPropertiesAsScala: Option[ArrayPropertiesSummary] = Option(self.arrayProperties)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodePropertiesAsScala: Option[NodePropertiesSummary] = Option(self.nodeProperties)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToJobSummaryOps {

  implicit def toJobSummaryBuilderOps(v: JobSummary.Builder): JobSummaryBuilderOps = new JobSummaryBuilderOps(v)

  implicit def toJobSummaryOps(v: JobSummary): JobSummaryOps = new JobSummaryOps(v)

}
