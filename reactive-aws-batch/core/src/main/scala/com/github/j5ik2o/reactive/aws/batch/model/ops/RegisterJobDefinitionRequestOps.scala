// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class RegisterJobDefinitionRequestBuilderOps(val self: RegisterJobDefinitionRequest.Builder) extends AnyVal {

  final def jobDefinitionNameAsScala(value: Option[String]): RegisterJobDefinitionRequest.Builder = {
    value.fold(self) { v =>
      self.jobDefinitionName(v)
    }
  } // String

  final def typeAsScala(value: Option[JobDefinitionType]): RegisterJobDefinitionRequest.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  } // String

  final def parametersAsScala(value: Option[Map[String, String]]): RegisterJobDefinitionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parameters(v.asJava)
    } // Map[String, String]
  }

  final def containerPropertiesAsScala(value: Option[ContainerProperties]): RegisterJobDefinitionRequest.Builder = {
    value.fold(self) { v =>
      self.containerProperties(v)
    }
  } // ContainerProperties

  final def nodePropertiesAsScala(value: Option[NodeProperties]): RegisterJobDefinitionRequest.Builder = {
    value.fold(self) { v =>
      self.nodeProperties(v)
    }
  } // NodeProperties

  final def retryStrategyAsScala(value: Option[RetryStrategy]): RegisterJobDefinitionRequest.Builder = {
    value.fold(self) { v =>
      self.retryStrategy(v)
    }
  } // RetryStrategy

  final def timeoutAsScala(value: Option[JobTimeout]): RegisterJobDefinitionRequest.Builder = {
    value.fold(self) { v =>
      self.timeout(v)
    }
  } // JobTimeout

}

final class RegisterJobDefinitionRequestOps(val self: RegisterJobDefinitionRequest) extends AnyVal {

  final def jobDefinitionNameAsScala: Option[String] = Option(self.jobDefinitionName) // String

  final def typeAsScala: Option[JobDefinitionType] = Option(self.`type`) // String

  final def parametersAsScala: Option[Map[String, String]] = Option(self.parameters).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

  final def containerPropertiesAsScala: Option[ContainerProperties] =
    Option(self.containerProperties) // ContainerProperties

  final def nodePropertiesAsScala: Option[NodeProperties] = Option(self.nodeProperties) // NodeProperties

  final def retryStrategyAsScala: Option[RetryStrategy] = Option(self.retryStrategy) // RetryStrategy

  final def timeoutAsScala: Option[JobTimeout] = Option(self.timeout) // JobTimeout

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRegisterJobDefinitionRequestOps {

  implicit def toRegisterJobDefinitionRequestBuilderOps(
      v: RegisterJobDefinitionRequest.Builder
  ): RegisterJobDefinitionRequestBuilderOps = new RegisterJobDefinitionRequestBuilderOps(v)

  implicit def toRegisterJobDefinitionRequestOps(v: RegisterJobDefinitionRequest): RegisterJobDefinitionRequestOps =
    new RegisterJobDefinitionRequestOps(v)

}
