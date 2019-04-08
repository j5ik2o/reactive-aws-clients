// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class JobSummaryBuilderOps(val self: JobSummary.Builder) extends AnyVal {

  final def jobIdAsScala(value: Option[String]): JobSummary.Builder = {
    value.fold(self) { v =>
      self.jobId(v)
    }
  }

  final def jobNameAsScala(value: Option[String]): JobSummary.Builder = {
    value.fold(self) { v =>
      self.jobName(v)
    }
  }

  final def createdAtAsScala(value: Option[Long]): JobSummary.Builder = {
    value.fold(self) { v =>
      self.createdAt(v)
    }
  }

  final def statusAsScala(value: Option[JobStatus]): JobSummary.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def statusReasonAsScala(value: Option[String]): JobSummary.Builder = {
    value.fold(self) { v =>
      self.statusReason(v)
    }
  }

  final def startedAtAsScala(value: Option[Long]): JobSummary.Builder = {
    value.fold(self) { v =>
      self.startedAt(v)
    }
  }

  final def stoppedAtAsScala(value: Option[Long]): JobSummary.Builder = {
    value.fold(self) { v =>
      self.stoppedAt(v)
    }
  }

  final def containerAsScala(value: Option[ContainerSummary]): JobSummary.Builder = {
    value.fold(self) { v =>
      self.container(v)
    }
  }

  final def arrayPropertiesAsScala(value: Option[ArrayPropertiesSummary]): JobSummary.Builder = {
    value.fold(self) { v =>
      self.arrayProperties(v)
    }
  }

  final def nodePropertiesAsScala(value: Option[NodePropertiesSummary]): JobSummary.Builder = {
    value.fold(self) { v =>
      self.nodeProperties(v)
    }
  }

}

final class JobSummaryOps(val self: JobSummary) extends AnyVal {

  final def jobIdAsScala: Option[String] = Option(self.jobId)

  final def jobNameAsScala: Option[String] = Option(self.jobName)

  final def createdAtAsScala: Option[Long] = Option(self.createdAt)

  final def statusAsScala: Option[JobStatus] = Option(self.status)

  final def statusReasonAsScala: Option[String] = Option(self.statusReason)

  final def startedAtAsScala: Option[Long] = Option(self.startedAt)

  final def stoppedAtAsScala: Option[Long] = Option(self.stoppedAt)

  final def containerAsScala: Option[ContainerSummary] = Option(self.container)

  final def arrayPropertiesAsScala: Option[ArrayPropertiesSummary] = Option(self.arrayProperties)

  final def nodePropertiesAsScala: Option[NodePropertiesSummary] = Option(self.nodeProperties)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToJobSummaryOps {

  implicit def toJobSummaryBuilderOps(v: JobSummary.Builder): JobSummaryBuilderOps = new JobSummaryBuilderOps(v)

  implicit def toJobSummaryOps(v: JobSummary): JobSummaryOps = new JobSummaryOps(v)

}
