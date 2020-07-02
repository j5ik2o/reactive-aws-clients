// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class AbortEnvironmentUpdateRequestBuilderOps(val self: AbortEnvironmentUpdateRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentIdAsScala(value: Option[String]): AbortEnvironmentUpdateRequest.Builder = {
    value.fold(self) { v => self.environmentId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala(value: Option[String]): AbortEnvironmentUpdateRequest.Builder = {
    value.fold(self) { v => self.environmentName(v) }
  }

}

final class AbortEnvironmentUpdateRequestOps(val self: AbortEnvironmentUpdateRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentIdAsScala: Option[String] = Option(self.environmentId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAbortEnvironmentUpdateRequestOps {

  implicit def toAbortEnvironmentUpdateRequestBuilderOps(
      v: AbortEnvironmentUpdateRequest.Builder
  ): AbortEnvironmentUpdateRequestBuilderOps = new AbortEnvironmentUpdateRequestBuilderOps(v)

  implicit def toAbortEnvironmentUpdateRequestOps(v: AbortEnvironmentUpdateRequest): AbortEnvironmentUpdateRequestOps =
    new AbortEnvironmentUpdateRequestOps(v)

}
