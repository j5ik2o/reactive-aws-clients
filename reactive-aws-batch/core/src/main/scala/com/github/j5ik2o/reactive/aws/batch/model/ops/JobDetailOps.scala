// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class JobDetailBuilderOps(val self: JobDetail.Builder) extends AnyVal {

  final def jobNameAsScala(value: Option[String]): JobDetail.Builder = {
    value.fold(self) { v =>
      self.jobName(v)
    }
  } // String

  final def jobIdAsScala(value: Option[String]): JobDetail.Builder = {
    value.fold(self) { v =>
      self.jobId(v)
    }
  } // String

  final def jobQueueAsScala(value: Option[String]): JobDetail.Builder = {
    value.fold(self) { v =>
      self.jobQueue(v)
    }
  } // String

  final def statusAsScala(value: Option[JobStatus]): JobDetail.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // String

  final def attemptsAsScala(value: Option[Seq[AttemptDetail]]): JobDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attempts(v.asJava)
    } // Seq[AttemptDetail]
  }

  final def statusReasonAsScala(value: Option[String]): JobDetail.Builder = {
    value.fold(self) { v =>
      self.statusReason(v)
    }
  } // String

  final def createdAtAsScala(value: Option[Long]): JobDetail.Builder = {
    value.fold(self) { v =>
      self.createdAt(v)
    }
  } // Long

  final def retryStrategyAsScala(value: Option[RetryStrategy]): JobDetail.Builder = {
    value.fold(self) { v =>
      self.retryStrategy(v)
    }
  } // RetryStrategy

  final def startedAtAsScala(value: Option[Long]): JobDetail.Builder = {
    value.fold(self) { v =>
      self.startedAt(v)
    }
  } // Long

  final def stoppedAtAsScala(value: Option[Long]): JobDetail.Builder = {
    value.fold(self) { v =>
      self.stoppedAt(v)
    }
  } // Long

  final def dependsOnAsScala(value: Option[Seq[JobDependency]]): JobDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.dependsOn(v.asJava)
    } // Seq[JobDependency]
  }

  final def jobDefinitionAsScala(value: Option[String]): JobDetail.Builder = {
    value.fold(self) { v =>
      self.jobDefinition(v)
    }
  } // String

  final def parametersAsScala(value: Option[Map[String, String]]): JobDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parameters(v.asJava)
    } // Map[String, String]
  }

  final def containerAsScala(value: Option[ContainerDetail]): JobDetail.Builder = {
    value.fold(self) { v =>
      self.container(v)
    }
  } // ContainerDetail

  final def nodeDetailsAsScala(value: Option[NodeDetails]): JobDetail.Builder = {
    value.fold(self) { v =>
      self.nodeDetails(v)
    }
  } // NodeDetails

  final def nodePropertiesAsScala(value: Option[NodeProperties]): JobDetail.Builder = {
    value.fold(self) { v =>
      self.nodeProperties(v)
    }
  } // NodeProperties

  final def arrayPropertiesAsScala(value: Option[ArrayPropertiesDetail]): JobDetail.Builder = {
    value.fold(self) { v =>
      self.arrayProperties(v)
    }
  } // ArrayPropertiesDetail

  final def timeoutAsScala(value: Option[JobTimeout]): JobDetail.Builder = {
    value.fold(self) { v =>
      self.timeout(v)
    }
  } // JobTimeout

}

final class JobDetailOps(val self: JobDetail) extends AnyVal {

  final def jobNameAsScala: Option[String] = Option(self.jobName) // String

  final def jobIdAsScala: Option[String] = Option(self.jobId) // String

  final def jobQueueAsScala: Option[String] = Option(self.jobQueue) // String

  final def statusAsScala: Option[JobStatus] = Option(self.status) // String

  final def attemptsAsScala: Option[Seq[AttemptDetail]] = Option(self.attempts).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[AttemptDetail]

  final def statusReasonAsScala: Option[String] = Option(self.statusReason) // String

  final def createdAtAsScala: Option[Long] = Option(self.createdAt) // Long

  final def retryStrategyAsScala: Option[RetryStrategy] = Option(self.retryStrategy) // RetryStrategy

  final def startedAtAsScala: Option[Long] = Option(self.startedAt) // Long

  final def stoppedAtAsScala: Option[Long] = Option(self.stoppedAt) // Long

  final def dependsOnAsScala: Option[Seq[JobDependency]] = Option(self.dependsOn).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[JobDependency]

  final def jobDefinitionAsScala: Option[String] = Option(self.jobDefinition) // String

  final def parametersAsScala: Option[Map[String, String]] = Option(self.parameters).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

  final def containerAsScala: Option[ContainerDetail] = Option(self.container) // ContainerDetail

  final def nodeDetailsAsScala: Option[NodeDetails] = Option(self.nodeDetails) // NodeDetails

  final def nodePropertiesAsScala: Option[NodeProperties] = Option(self.nodeProperties) // NodeProperties

  final def arrayPropertiesAsScala: Option[ArrayPropertiesDetail] =
    Option(self.arrayProperties) // ArrayPropertiesDetail

  final def timeoutAsScala: Option[JobTimeout] = Option(self.timeout) // JobTimeout

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToJobDetailOps {

  implicit def toJobDetailBuilderOps(v: JobDetail.Builder): JobDetailBuilderOps = new JobDetailBuilderOps(v)

  implicit def toJobDetailOps(v: JobDetail): JobDetailOps = new JobDetailOps(v)

}
