// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class SubmitJobRequestBuilderOps(val self: SubmitJobRequest.Builder) extends AnyVal {

  final def jobNameAsScala(value: Option[String]): SubmitJobRequest.Builder = {
    value.fold(self) { v =>
      self.jobName(v)
    }
  } // String

  final def jobQueueAsScala(value: Option[String]): SubmitJobRequest.Builder = {
    value.fold(self) { v =>
      self.jobQueue(v)
    }
  } // String

  final def arrayPropertiesAsScala(value: Option[ArrayProperties]): SubmitJobRequest.Builder = {
    value.fold(self) { v =>
      self.arrayProperties(v)
    }
  } // ArrayProperties

  final def dependsOnAsScala(value: Option[Seq[JobDependency]]): SubmitJobRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.dependsOn(v.asJava)
    } // Seq[JobDependency]
  }

  final def jobDefinitionAsScala(value: Option[String]): SubmitJobRequest.Builder = {
    value.fold(self) { v =>
      self.jobDefinition(v)
    }
  } // String

  final def parametersAsScala(value: Option[Map[String, String]]): SubmitJobRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parameters(v.asJava)
    } // Map[String, String]
  }

  final def containerOverridesAsScala(value: Option[ContainerOverrides]): SubmitJobRequest.Builder = {
    value.fold(self) { v =>
      self.containerOverrides(v)
    }
  } // ContainerOverrides

  final def nodeOverridesAsScala(value: Option[NodeOverrides]): SubmitJobRequest.Builder = {
    value.fold(self) { v =>
      self.nodeOverrides(v)
    }
  } // NodeOverrides

  final def retryStrategyAsScala(value: Option[RetryStrategy]): SubmitJobRequest.Builder = {
    value.fold(self) { v =>
      self.retryStrategy(v)
    }
  } // RetryStrategy

  final def timeoutAsScala(value: Option[JobTimeout]): SubmitJobRequest.Builder = {
    value.fold(self) { v =>
      self.timeout(v)
    }
  } // JobTimeout

}

final class SubmitJobRequestOps(val self: SubmitJobRequest) extends AnyVal {

  final def jobNameAsScala: Option[String] = Option(self.jobName) // String

  final def jobQueueAsScala: Option[String] = Option(self.jobQueue) // String

  final def arrayPropertiesAsScala: Option[ArrayProperties] = Option(self.arrayProperties) // ArrayProperties

  final def dependsOnAsScala: Option[Seq[JobDependency]] = Option(self.dependsOn).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[JobDependency]

  final def jobDefinitionAsScala: Option[String] = Option(self.jobDefinition) // String

  final def parametersAsScala: Option[Map[String, String]] = Option(self.parameters).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

  final def containerOverridesAsScala: Option[ContainerOverrides] =
    Option(self.containerOverrides) // ContainerOverrides

  final def nodeOverridesAsScala: Option[NodeOverrides] = Option(self.nodeOverrides) // NodeOverrides

  final def retryStrategyAsScala: Option[RetryStrategy] = Option(self.retryStrategy) // RetryStrategy

  final def timeoutAsScala: Option[JobTimeout] = Option(self.timeout) // JobTimeout

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSubmitJobRequestOps {

  implicit def toSubmitJobRequestBuilderOps(v: SubmitJobRequest.Builder): SubmitJobRequestBuilderOps =
    new SubmitJobRequestBuilderOps(v)

  implicit def toSubmitJobRequestOps(v: SubmitJobRequest): SubmitJobRequestOps = new SubmitJobRequestOps(v)

}
