// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class JobSummaryBuilderOps(val self: JobSummary.Builder) extends AnyVal {

  final def jobIdAsScala(value: Option[String]): JobSummary.Builder = {
    value.fold(self) { v =>
      self.jobId(v)
    }
  } // String

  final def jobNameAsScala(value: Option[String]): JobSummary.Builder = {
    value.fold(self) { v =>
      self.jobName(v)
    }
  } // String

  final def createdAtAsScala(value: Option[Long]): JobSummary.Builder = {
    value.fold(self) { v =>
      self.createdAt(v)
    }
  } // Long

  final def statusAsScala(value: Option[JobStatus]): JobSummary.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // String

  final def statusReasonAsScala(value: Option[String]): JobSummary.Builder = {
    value.fold(self) { v =>
      self.statusReason(v)
    }
  } // String

  final def startedAtAsScala(value: Option[Long]): JobSummary.Builder = {
    value.fold(self) { v =>
      self.startedAt(v)
    }
  } // Long

  final def stoppedAtAsScala(value: Option[Long]): JobSummary.Builder = {
    value.fold(self) { v =>
      self.stoppedAt(v)
    }
  } // Long

  final def containerAsScala(value: Option[ContainerSummary]): JobSummary.Builder = {
    value.fold(self) { v =>
      self.container(v)
    }
  } // ContainerSummary

  final def arrayPropertiesAsScala(value: Option[ArrayPropertiesSummary]): JobSummary.Builder = {
    value.fold(self) { v =>
      self.arrayProperties(v)
    }
  } // ArrayPropertiesSummary

  final def nodePropertiesAsScala(value: Option[NodePropertiesSummary]): JobSummary.Builder = {
    value.fold(self) { v =>
      self.nodeProperties(v)
    }
  } // NodePropertiesSummary

}

final class JobSummaryOps(val self: JobSummary) extends AnyVal {

  final def jobIdAsScala: Option[String] = Option(self.jobId) // String

  final def jobNameAsScala: Option[String] = Option(self.jobName) // String

  final def createdAtAsScala: Option[Long] = Option(self.createdAt) // Long

  final def statusAsScala: Option[JobStatus] = Option(self.status) // String

  final def statusReasonAsScala: Option[String] = Option(self.statusReason) // String

  final def startedAtAsScala: Option[Long] = Option(self.startedAt) // Long

  final def stoppedAtAsScala: Option[Long] = Option(self.stoppedAt) // Long

  final def containerAsScala: Option[ContainerSummary] = Option(self.container) // ContainerSummary

  final def arrayPropertiesAsScala: Option[ArrayPropertiesSummary] =
    Option(self.arrayProperties) // ArrayPropertiesSummary

  final def nodePropertiesAsScala: Option[NodePropertiesSummary] = Option(self.nodeProperties) // NodePropertiesSummary

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToJobSummaryOps {

  implicit def toJobSummaryBuilderOps(v: JobSummary.Builder): JobSummaryBuilderOps = new JobSummaryBuilderOps(v)

  implicit def toJobSummaryOps(v: JobSummary): JobSummaryOps = new JobSummaryOps(v)

}
