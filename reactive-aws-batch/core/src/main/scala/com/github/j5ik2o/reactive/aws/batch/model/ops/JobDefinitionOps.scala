// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class JobDefinitionBuilderOps(val self: JobDefinition.Builder) extends AnyVal {

  final def jobDefinitionNameAsScala(value: Option[String]): JobDefinition.Builder = {
    value.fold(self) { v =>
      self.jobDefinitionName(v)
    }
  } // String

  final def jobDefinitionArnAsScala(value: Option[String]): JobDefinition.Builder = {
    value.fold(self) { v =>
      self.jobDefinitionArn(v)
    }
  } // String

  final def revisionAsScala(value: Option[Int]): JobDefinition.Builder = {
    value.fold(self) { v =>
      self.revision(v)
    }
  } // Int

  final def statusAsScala(value: Option[String]): JobDefinition.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // String

  final def typeAsScala(value: Option[String]): JobDefinition.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  } // String

  final def parametersAsScala(value: Option[Map[String, String]]): JobDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parameters(v.asJava)
    } // Map[String, String]
  }

  final def retryStrategyAsScala(value: Option[RetryStrategy]): JobDefinition.Builder = {
    value.fold(self) { v =>
      self.retryStrategy(v)
    }
  } // RetryStrategy

  final def containerPropertiesAsScala(value: Option[ContainerProperties]): JobDefinition.Builder = {
    value.fold(self) { v =>
      self.containerProperties(v)
    }
  } // ContainerProperties

  final def timeoutAsScala(value: Option[JobTimeout]): JobDefinition.Builder = {
    value.fold(self) { v =>
      self.timeout(v)
    }
  } // JobTimeout

  final def nodePropertiesAsScala(value: Option[NodeProperties]): JobDefinition.Builder = {
    value.fold(self) { v =>
      self.nodeProperties(v)
    }
  } // NodeProperties

}

final class JobDefinitionOps(val self: JobDefinition) extends AnyVal {

  final def jobDefinitionNameAsScala: Option[String] = Option(self.jobDefinitionName) // String

  final def jobDefinitionArnAsScala: Option[String] = Option(self.jobDefinitionArn) // String

  final def revisionAsScala: Option[Int] = Option(self.revision) // Int

  final def statusAsScala: Option[String] = Option(self.status) // String

  final def typeAsScala: Option[String] = Option(self.`type`) // String

  final def parametersAsScala: Option[Map[String, String]] = Option(self.parameters).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

  final def retryStrategyAsScala: Option[RetryStrategy] = Option(self.retryStrategy) // RetryStrategy

  final def containerPropertiesAsScala: Option[ContainerProperties] =
    Option(self.containerProperties) // ContainerProperties

  final def timeoutAsScala: Option[JobTimeout] = Option(self.timeout) // JobTimeout

  final def nodePropertiesAsScala: Option[NodeProperties] = Option(self.nodeProperties) // NodeProperties

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToJobDefinitionOps {

  implicit def toJobDefinitionBuilderOps(v: JobDefinition.Builder): JobDefinitionBuilderOps =
    new JobDefinitionBuilderOps(v)

  implicit def toJobDefinitionOps(v: JobDefinition): JobDefinitionOps = new JobDefinitionOps(v)

}
