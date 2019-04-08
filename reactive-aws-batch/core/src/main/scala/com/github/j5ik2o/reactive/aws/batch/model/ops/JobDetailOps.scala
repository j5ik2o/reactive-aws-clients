// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class JobDetailBuilderOps(val self: JobDetail.Builder) extends AnyVal {

  final def jobNameAsScala(value: Option[String]): JobDetail.Builder = {
    value.fold(self) { v =>
      self.jobName(v)
    }
  }

  final def jobIdAsScala(value: Option[String]): JobDetail.Builder = {
    value.fold(self) { v =>
      self.jobId(v)
    }
  }

  final def jobQueueAsScala(value: Option[String]): JobDetail.Builder = {
    value.fold(self) { v =>
      self.jobQueue(v)
    }
  }

  final def statusAsScala(value: Option[JobStatus]): JobDetail.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def attemptsAsScala(value: Option[Seq[AttemptDetail]]): JobDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attempts(v.asJava)
    }
  }

  final def statusReasonAsScala(value: Option[String]): JobDetail.Builder = {
    value.fold(self) { v =>
      self.statusReason(v)
    }
  }

  final def createdAtAsScala(value: Option[Long]): JobDetail.Builder = {
    value.fold(self) { v =>
      self.createdAt(v)
    }
  }

  final def retryStrategyAsScala(value: Option[RetryStrategy]): JobDetail.Builder = {
    value.fold(self) { v =>
      self.retryStrategy(v)
    }
  }

  final def startedAtAsScala(value: Option[Long]): JobDetail.Builder = {
    value.fold(self) { v =>
      self.startedAt(v)
    }
  }

  final def stoppedAtAsScala(value: Option[Long]): JobDetail.Builder = {
    value.fold(self) { v =>
      self.stoppedAt(v)
    }
  }

  final def dependsOnAsScala(value: Option[Seq[JobDependency]]): JobDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.dependsOn(v.asJava)
    }
  }

  final def jobDefinitionAsScala(value: Option[String]): JobDetail.Builder = {
    value.fold(self) { v =>
      self.jobDefinition(v)
    }
  }

  final def parametersAsScala(value: Option[Map[String, String]]): JobDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parameters(v.asJava)
    }
  }

  final def containerAsScala(value: Option[ContainerDetail]): JobDetail.Builder = {
    value.fold(self) { v =>
      self.container(v)
    }
  }

  final def nodeDetailsAsScala(value: Option[NodeDetails]): JobDetail.Builder = {
    value.fold(self) { v =>
      self.nodeDetails(v)
    }
  }

  final def nodePropertiesAsScala(value: Option[NodeProperties]): JobDetail.Builder = {
    value.fold(self) { v =>
      self.nodeProperties(v)
    }
  }

  final def arrayPropertiesAsScala(value: Option[ArrayPropertiesDetail]): JobDetail.Builder = {
    value.fold(self) { v =>
      self.arrayProperties(v)
    }
  }

  final def timeoutAsScala(value: Option[JobTimeout]): JobDetail.Builder = {
    value.fold(self) { v =>
      self.timeout(v)
    }
  }

}

final class JobDetailOps(val self: JobDetail) extends AnyVal {

  final def jobNameAsScala: Option[String] = Option(self.jobName)

  final def jobIdAsScala: Option[String] = Option(self.jobId)

  final def jobQueueAsScala: Option[String] = Option(self.jobQueue)

  final def statusAsScala: Option[JobStatus] = Option(self.status)

  final def attemptsAsScala: Option[Seq[AttemptDetail]] = Option(self.attempts).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def statusReasonAsScala: Option[String] = Option(self.statusReason)

  final def createdAtAsScala: Option[Long] = Option(self.createdAt)

  final def retryStrategyAsScala: Option[RetryStrategy] = Option(self.retryStrategy)

  final def startedAtAsScala: Option[Long] = Option(self.startedAt)

  final def stoppedAtAsScala: Option[Long] = Option(self.stoppedAt)

  final def dependsOnAsScala: Option[Seq[JobDependency]] = Option(self.dependsOn).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def jobDefinitionAsScala: Option[String] = Option(self.jobDefinition)

  final def parametersAsScala: Option[Map[String, String]] = Option(self.parameters).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def containerAsScala: Option[ContainerDetail] = Option(self.container)

  final def nodeDetailsAsScala: Option[NodeDetails] = Option(self.nodeDetails)

  final def nodePropertiesAsScala: Option[NodeProperties] = Option(self.nodeProperties)

  final def arrayPropertiesAsScala: Option[ArrayPropertiesDetail] = Option(self.arrayProperties)

  final def timeoutAsScala: Option[JobTimeout] = Option(self.timeout)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToJobDetailOps {

  implicit def toJobDetailBuilderOps(v: JobDetail.Builder): JobDetailBuilderOps = new JobDetailBuilderOps(v)

  implicit def toJobDetailOps(v: JobDetail): JobDetailOps = new JobDetailOps(v)

}
