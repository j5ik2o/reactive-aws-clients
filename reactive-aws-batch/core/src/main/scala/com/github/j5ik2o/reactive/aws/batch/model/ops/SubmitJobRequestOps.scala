// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class SubmitJobRequestBuilderOps(val self: SubmitJobRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobNameAsScala(value: Option[String]): SubmitJobRequest.Builder = {
    value.fold(self) { v => self.jobName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobQueueAsScala(value: Option[String]): SubmitJobRequest.Builder = {
    value.fold(self) { v => self.jobQueue(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arrayPropertiesAsScala(value: Option[ArrayProperties]): SubmitJobRequest.Builder = {
    value.fold(self) { v => self.arrayProperties(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dependsOnAsScala(value: Option[Seq[JobDependency]]): SubmitJobRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.dependsOn(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobDefinitionAsScala(value: Option[String]): SubmitJobRequest.Builder = {
    value.fold(self) { v => self.jobDefinition(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parametersAsScala(value: Option[Map[String, String]]): SubmitJobRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.parameters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerOverridesAsScala(value: Option[ContainerOverrides]): SubmitJobRequest.Builder = {
    value.fold(self) { v => self.containerOverrides(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeOverridesAsScala(value: Option[NodeOverrides]): SubmitJobRequest.Builder = {
    value.fold(self) { v => self.nodeOverrides(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retryStrategyAsScala(value: Option[RetryStrategy]): SubmitJobRequest.Builder = {
    value.fold(self) { v => self.retryStrategy(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeoutAsScala(value: Option[JobTimeout]): SubmitJobRequest.Builder = {
    value.fold(self) { v => self.timeout(v) }
  }

}

final class SubmitJobRequestOps(val self: SubmitJobRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobNameAsScala: Option[String] = Option(self.jobName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobQueueAsScala: Option[String] = Option(self.jobQueue)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arrayPropertiesAsScala: Option[ArrayProperties] = Option(self.arrayProperties)

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
  final def containerOverridesAsScala: Option[ContainerOverrides] = Option(self.containerOverrides)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeOverridesAsScala: Option[NodeOverrides] = Option(self.nodeOverrides)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retryStrategyAsScala: Option[RetryStrategy] = Option(self.retryStrategy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeoutAsScala: Option[JobTimeout] = Option(self.timeout)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSubmitJobRequestOps {

  implicit def toSubmitJobRequestBuilderOps(v: SubmitJobRequest.Builder): SubmitJobRequestBuilderOps =
    new SubmitJobRequestBuilderOps(v)

  implicit def toSubmitJobRequestOps(v: SubmitJobRequest): SubmitJobRequestOps = new SubmitJobRequestOps(v)

}
