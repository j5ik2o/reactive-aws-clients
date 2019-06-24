// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class JobDefinitionBuilderOps(val self: JobDefinition.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobDefinitionNameAsScala(value: Option[String]): JobDefinition.Builder = {
    value.fold(self) { v =>
      self.jobDefinitionName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobDefinitionArnAsScala(value: Option[String]): JobDefinition.Builder = {
    value.fold(self) { v =>
      self.jobDefinitionArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def revisionAsScala(value: Option[Int]): JobDefinition.Builder = {
    value.fold(self) { v =>
      self.revision(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[String]): JobDefinition.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[String]): JobDefinition.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parametersAsScala(value: Option[Map[String, String]]): JobDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.parameters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retryStrategyAsScala(value: Option[RetryStrategy]): JobDefinition.Builder = {
    value.fold(self) { v =>
      self.retryStrategy(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerPropertiesAsScala(value: Option[ContainerProperties]): JobDefinition.Builder = {
    value.fold(self) { v =>
      self.containerProperties(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeoutAsScala(value: Option[JobTimeout]): JobDefinition.Builder = {
    value.fold(self) { v =>
      self.timeout(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodePropertiesAsScala(value: Option[NodeProperties]): JobDefinition.Builder = {
    value.fold(self) { v =>
      self.nodeProperties(v)
    }
  }

}

final class JobDefinitionOps(val self: JobDefinition) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobDefinitionNameAsScala: Option[String] = Option(self.jobDefinitionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobDefinitionArnAsScala: Option[String] = Option(self.jobDefinitionArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def revisionAsScala: Option[Int] = Option(self.revision)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[String] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[String] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parametersAsScala: Option[Map[String, String]] = Option(self.parameters).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retryStrategyAsScala: Option[RetryStrategy] = Option(self.retryStrategy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerPropertiesAsScala: Option[ContainerProperties] = Option(self.containerProperties)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeoutAsScala: Option[JobTimeout] = Option(self.timeout)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodePropertiesAsScala: Option[NodeProperties] = Option(self.nodeProperties)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToJobDefinitionOps {

  implicit def toJobDefinitionBuilderOps(v: JobDefinition.Builder): JobDefinitionBuilderOps =
    new JobDefinitionBuilderOps(v)

  implicit def toJobDefinitionOps(v: JobDefinition): JobDefinitionOps = new JobDefinitionOps(v)

}
