// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class SubmitJobRequestBuilderOps(val self: SubmitJobRequest.Builder) extends AnyVal {

  final def jobNameAsScala(value: Option[String]): SubmitJobRequest.Builder = {
    value.fold(self) { v =>
      self.jobName(v)
    }
  }

  final def jobQueueAsScala(value: Option[String]): SubmitJobRequest.Builder = {
    value.fold(self) { v =>
      self.jobQueue(v)
    }
  }

  final def arrayPropertiesAsScala(value: Option[ArrayProperties]): SubmitJobRequest.Builder = {
    value.fold(self) { v =>
      self.arrayProperties(v)
    }
  }

  final def dependsOnAsScala(value: Option[Seq[JobDependency]]): SubmitJobRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.dependsOn(v.asJava)
    }
  }

  final def jobDefinitionAsScala(value: Option[String]): SubmitJobRequest.Builder = {
    value.fold(self) { v =>
      self.jobDefinition(v)
    }
  }

  final def parametersAsScala(value: Option[Map[String, String]]): SubmitJobRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parameters(v.asJava)
    }
  }

  final def containerOverridesAsScala(value: Option[ContainerOverrides]): SubmitJobRequest.Builder = {
    value.fold(self) { v =>
      self.containerOverrides(v)
    }
  }

  final def nodeOverridesAsScala(value: Option[NodeOverrides]): SubmitJobRequest.Builder = {
    value.fold(self) { v =>
      self.nodeOverrides(v)
    }
  }

  final def retryStrategyAsScala(value: Option[RetryStrategy]): SubmitJobRequest.Builder = {
    value.fold(self) { v =>
      self.retryStrategy(v)
    }
  }

  final def timeoutAsScala(value: Option[JobTimeout]): SubmitJobRequest.Builder = {
    value.fold(self) { v =>
      self.timeout(v)
    }
  }

}

final class SubmitJobRequestOps(val self: SubmitJobRequest) extends AnyVal {

  final def jobNameAsScala: Option[String] = Option(self.jobName)

  final def jobQueueAsScala: Option[String] = Option(self.jobQueue)

  final def arrayPropertiesAsScala: Option[ArrayProperties] = Option(self.arrayProperties)

  final def dependsOnAsScala: Option[Seq[JobDependency]] = Option(self.dependsOn).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def jobDefinitionAsScala: Option[String] = Option(self.jobDefinition)

  final def parametersAsScala: Option[Map[String, String]] = Option(self.parameters).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def containerOverridesAsScala: Option[ContainerOverrides] = Option(self.containerOverrides)

  final def nodeOverridesAsScala: Option[NodeOverrides] = Option(self.nodeOverrides)

  final def retryStrategyAsScala: Option[RetryStrategy] = Option(self.retryStrategy)

  final def timeoutAsScala: Option[JobTimeout] = Option(self.timeout)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSubmitJobRequestOps {

  implicit def toSubmitJobRequestBuilderOps(v: SubmitJobRequest.Builder): SubmitJobRequestBuilderOps =
    new SubmitJobRequestBuilderOps(v)

  implicit def toSubmitJobRequestOps(v: SubmitJobRequest): SubmitJobRequestOps = new SubmitJobRequestOps(v)

}
