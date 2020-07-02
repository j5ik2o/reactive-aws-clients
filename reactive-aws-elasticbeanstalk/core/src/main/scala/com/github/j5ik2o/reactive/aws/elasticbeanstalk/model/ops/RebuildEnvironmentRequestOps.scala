// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class RebuildEnvironmentRequestBuilderOps(val self: RebuildEnvironmentRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentIdAsScala(value: Option[String]): RebuildEnvironmentRequest.Builder = {
    value.fold(self) { v => self.environmentId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala(value: Option[String]): RebuildEnvironmentRequest.Builder = {
    value.fold(self) { v => self.environmentName(v) }
  }

}

final class RebuildEnvironmentRequestOps(val self: RebuildEnvironmentRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentIdAsScala: Option[String] = Option(self.environmentId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRebuildEnvironmentRequestOps {

  implicit def toRebuildEnvironmentRequestBuilderOps(
      v: RebuildEnvironmentRequest.Builder
  ): RebuildEnvironmentRequestBuilderOps = new RebuildEnvironmentRequestBuilderOps(v)

  implicit def toRebuildEnvironmentRequestOps(v: RebuildEnvironmentRequest): RebuildEnvironmentRequestOps =
    new RebuildEnvironmentRequestOps(v)

}
