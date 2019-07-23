// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class RestartAppServerRequestBuilderOps(val self: RestartAppServerRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentIdAsScala(value: Option[String]): RestartAppServerRequest.Builder = {
    value.fold(self) { v =>
      self.environmentId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala(value: Option[String]): RestartAppServerRequest.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  }

}

final class RestartAppServerRequestOps(val self: RestartAppServerRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentIdAsScala: Option[String] = Option(self.environmentId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRestartAppServerRequestOps {

  implicit def toRestartAppServerRequestBuilderOps(
      v: RestartAppServerRequest.Builder
  ): RestartAppServerRequestBuilderOps = new RestartAppServerRequestBuilderOps(v)

  implicit def toRestartAppServerRequestOps(v: RestartAppServerRequest): RestartAppServerRequestOps =
    new RestartAppServerRequestOps(v)

}
