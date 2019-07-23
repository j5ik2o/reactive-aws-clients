// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DeleteApplicationRequestBuilderOps(val self: DeleteApplicationRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala(value: Option[String]): DeleteApplicationRequest.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def terminateEnvByForceAsScala(value: Option[Boolean]): DeleteApplicationRequest.Builder = {
    value.fold(self) { v =>
      self.terminateEnvByForce(v)
    }
  }

}

final class DeleteApplicationRequestOps(val self: DeleteApplicationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def terminateEnvByForceAsScala: Option[Boolean] = Option(self.terminateEnvByForce)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteApplicationRequestOps {

  implicit def toDeleteApplicationRequestBuilderOps(
      v: DeleteApplicationRequest.Builder
  ): DeleteApplicationRequestBuilderOps = new DeleteApplicationRequestBuilderOps(v)

  implicit def toDeleteApplicationRequestOps(v: DeleteApplicationRequest): DeleteApplicationRequestOps =
    new DeleteApplicationRequestOps(v)

}
