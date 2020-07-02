// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class TerminateEnvironmentRequestBuilderOps(val self: TerminateEnvironmentRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentIdAsScala(value: Option[String]): TerminateEnvironmentRequest.Builder = {
    value.fold(self) { v => self.environmentId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala(value: Option[String]): TerminateEnvironmentRequest.Builder = {
    value.fold(self) { v => self.environmentName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def terminateResourcesAsScala(value: Option[Boolean]): TerminateEnvironmentRequest.Builder = {
    value.fold(self) { v => self.terminateResources(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def forceTerminateAsScala(value: Option[Boolean]): TerminateEnvironmentRequest.Builder = {
    value.fold(self) { v => self.forceTerminate(v) }
  }

}

final class TerminateEnvironmentRequestOps(val self: TerminateEnvironmentRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentIdAsScala: Option[String] = Option(self.environmentId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def terminateResourcesAsScala: Option[Boolean] = Option(self.terminateResources)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def forceTerminateAsScala: Option[Boolean] = Option(self.forceTerminate)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTerminateEnvironmentRequestOps {

  implicit def toTerminateEnvironmentRequestBuilderOps(
      v: TerminateEnvironmentRequest.Builder
  ): TerminateEnvironmentRequestBuilderOps = new TerminateEnvironmentRequestBuilderOps(v)

  implicit def toTerminateEnvironmentRequestOps(v: TerminateEnvironmentRequest): TerminateEnvironmentRequestOps =
    new TerminateEnvironmentRequestOps(v)

}
