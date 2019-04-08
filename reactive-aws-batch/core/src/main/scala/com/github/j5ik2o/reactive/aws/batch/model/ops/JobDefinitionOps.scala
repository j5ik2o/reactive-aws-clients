// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class JobDefinitionBuilderOps(val self: JobDefinition.Builder) extends AnyVal {

  final def jobDefinitionNameAsScala(value: Option[String]): JobDefinition.Builder = {
    value.fold(self) { v =>
      self.jobDefinitionName(v)
    }
  }

  final def jobDefinitionArnAsScala(value: Option[String]): JobDefinition.Builder = {
    value.fold(self) { v =>
      self.jobDefinitionArn(v)
    }
  }

  final def revisionAsScala(value: Option[Int]): JobDefinition.Builder = {
    value.fold(self) { v =>
      self.revision(v)
    }
  }

  final def statusAsScala(value: Option[String]): JobDefinition.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def typeAsScala(value: Option[String]): JobDefinition.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  final def parametersAsScala(value: Option[Map[String, String]]): JobDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parameters(v.asJava)
    }
  }

  final def retryStrategyAsScala(value: Option[RetryStrategy]): JobDefinition.Builder = {
    value.fold(self) { v =>
      self.retryStrategy(v)
    }
  }

  final def containerPropertiesAsScala(value: Option[ContainerProperties]): JobDefinition.Builder = {
    value.fold(self) { v =>
      self.containerProperties(v)
    }
  }

  final def timeoutAsScala(value: Option[JobTimeout]): JobDefinition.Builder = {
    value.fold(self) { v =>
      self.timeout(v)
    }
  }

  final def nodePropertiesAsScala(value: Option[NodeProperties]): JobDefinition.Builder = {
    value.fold(self) { v =>
      self.nodeProperties(v)
    }
  }

}

final class JobDefinitionOps(val self: JobDefinition) extends AnyVal {

  final def jobDefinitionNameAsScala: Option[String] = Option(self.jobDefinitionName)

  final def jobDefinitionArnAsScala: Option[String] = Option(self.jobDefinitionArn)

  final def revisionAsScala: Option[Int] = Option(self.revision)

  final def statusAsScala: Option[String] = Option(self.status)

  final def typeAsScala: Option[String] = Option(self.`type`)

  final def parametersAsScala: Option[Map[String, String]] = Option(self.parameters).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def retryStrategyAsScala: Option[RetryStrategy] = Option(self.retryStrategy)

  final def containerPropertiesAsScala: Option[ContainerProperties] = Option(self.containerProperties)

  final def timeoutAsScala: Option[JobTimeout] = Option(self.timeout)

  final def nodePropertiesAsScala: Option[NodeProperties] = Option(self.nodeProperties)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToJobDefinitionOps {

  implicit def toJobDefinitionBuilderOps(v: JobDefinition.Builder): JobDefinitionBuilderOps =
    new JobDefinitionBuilderOps(v)

  implicit def toJobDefinitionOps(v: JobDefinition): JobDefinitionOps = new JobDefinitionOps(v)

}
