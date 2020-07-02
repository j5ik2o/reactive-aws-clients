// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class RegisterJobDefinitionRequestBuilderOps(val self: RegisterJobDefinitionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobDefinitionNameAsScala(value: Option[String]): RegisterJobDefinitionRequest.Builder = {
    value.fold(self) { v => self.jobDefinitionName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[JobDefinitionType]): RegisterJobDefinitionRequest.Builder = {
    value.fold(self) { v => self.`type`(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parametersAsScala(value: Option[Map[String, String]]): RegisterJobDefinitionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.parameters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerPropertiesAsScala(value: Option[ContainerProperties]): RegisterJobDefinitionRequest.Builder = {
    value.fold(self) { v => self.containerProperties(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodePropertiesAsScala(value: Option[NodeProperties]): RegisterJobDefinitionRequest.Builder = {
    value.fold(self) { v => self.nodeProperties(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retryStrategyAsScala(value: Option[RetryStrategy]): RegisterJobDefinitionRequest.Builder = {
    value.fold(self) { v => self.retryStrategy(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeoutAsScala(value: Option[JobTimeout]): RegisterJobDefinitionRequest.Builder = {
    value.fold(self) { v => self.timeout(v) }
  }

}

final class RegisterJobDefinitionRequestOps(val self: RegisterJobDefinitionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobDefinitionNameAsScala: Option[String] = Option(self.jobDefinitionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[JobDefinitionType] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parametersAsScala: Option[Map[String, String]] =
    Option(self.parameters).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerPropertiesAsScala: Option[ContainerProperties] = Option(self.containerProperties)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodePropertiesAsScala: Option[NodeProperties] = Option(self.nodeProperties)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retryStrategyAsScala: Option[RetryStrategy] = Option(self.retryStrategy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeoutAsScala: Option[JobTimeout] = Option(self.timeout)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRegisterJobDefinitionRequestOps {

  implicit def toRegisterJobDefinitionRequestBuilderOps(
      v: RegisterJobDefinitionRequest.Builder
  ): RegisterJobDefinitionRequestBuilderOps = new RegisterJobDefinitionRequestBuilderOps(v)

  implicit def toRegisterJobDefinitionRequestOps(v: RegisterJobDefinitionRequest): RegisterJobDefinitionRequestOps =
    new RegisterJobDefinitionRequestOps(v)

}
