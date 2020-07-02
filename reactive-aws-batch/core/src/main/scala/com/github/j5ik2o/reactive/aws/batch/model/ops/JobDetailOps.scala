// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class JobDetailBuilderOps(val self: JobDetail.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobNameAsScala(value: Option[String]): JobDetail.Builder = {
    value.fold(self) { v => self.jobName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobIdAsScala(value: Option[String]): JobDetail.Builder = {
    value.fold(self) { v => self.jobId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobQueueAsScala(value: Option[String]): JobDetail.Builder = {
    value.fold(self) { v => self.jobQueue(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[JobStatus]): JobDetail.Builder = {
    value.fold(self) { v => self.status(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attemptsAsScala(value: Option[Seq[AttemptDetail]]): JobDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attempts(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusReasonAsScala(value: Option[String]): JobDetail.Builder = {
    value.fold(self) { v => self.statusReason(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdAtAsScala(value: Option[Long]): JobDetail.Builder = {
    value.fold(self) { v => self.createdAt(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retryStrategyAsScala(value: Option[RetryStrategy]): JobDetail.Builder = {
    value.fold(self) { v => self.retryStrategy(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startedAtAsScala(value: Option[Long]): JobDetail.Builder = {
    value.fold(self) { v => self.startedAt(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stoppedAtAsScala(value: Option[Long]): JobDetail.Builder = {
    value.fold(self) { v => self.stoppedAt(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dependsOnAsScala(value: Option[Seq[JobDependency]]): JobDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.dependsOn(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobDefinitionAsScala(value: Option[String]): JobDetail.Builder = {
    value.fold(self) { v => self.jobDefinition(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parametersAsScala(value: Option[Map[String, String]]): JobDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.parameters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerAsScala(value: Option[ContainerDetail]): JobDetail.Builder = {
    value.fold(self) { v => self.container(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeDetailsAsScala(value: Option[NodeDetails]): JobDetail.Builder = {
    value.fold(self) { v => self.nodeDetails(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodePropertiesAsScala(value: Option[NodeProperties]): JobDetail.Builder = {
    value.fold(self) { v => self.nodeProperties(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arrayPropertiesAsScala(value: Option[ArrayPropertiesDetail]): JobDetail.Builder = {
    value.fold(self) { v => self.arrayProperties(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeoutAsScala(value: Option[JobTimeout]): JobDetail.Builder = {
    value.fold(self) { v => self.timeout(v) }
  }

}

final class JobDetailOps(val self: JobDetail) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobNameAsScala: Option[String] = Option(self.jobName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobIdAsScala: Option[String] = Option(self.jobId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobQueueAsScala: Option[String] = Option(self.jobQueue)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[JobStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attemptsAsScala: Option[Seq[AttemptDetail]] =
    Option(self.attempts).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusReasonAsScala: Option[String] = Option(self.statusReason)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdAtAsScala: Option[Long] = Option(self.createdAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retryStrategyAsScala: Option[RetryStrategy] = Option(self.retryStrategy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startedAtAsScala: Option[Long] = Option(self.startedAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stoppedAtAsScala: Option[Long] = Option(self.stoppedAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dependsOnAsScala: Option[Seq[JobDependency]] =
    Option(self.dependsOn).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobDefinitionAsScala: Option[String] = Option(self.jobDefinition)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parametersAsScala: Option[Map[String, String]] =
    Option(self.parameters).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerAsScala: Option[ContainerDetail] = Option(self.container)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeDetailsAsScala: Option[NodeDetails] = Option(self.nodeDetails)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodePropertiesAsScala: Option[NodeProperties] = Option(self.nodeProperties)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arrayPropertiesAsScala: Option[ArrayPropertiesDetail] = Option(self.arrayProperties)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeoutAsScala: Option[JobTimeout] = Option(self.timeout)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToJobDetailOps {

  implicit def toJobDetailBuilderOps(v: JobDetail.Builder): JobDetailBuilderOps = new JobDetailBuilderOps(v)

  implicit def toJobDetailOps(v: JobDetail): JobDetailOps = new JobDetailOps(v)

}
