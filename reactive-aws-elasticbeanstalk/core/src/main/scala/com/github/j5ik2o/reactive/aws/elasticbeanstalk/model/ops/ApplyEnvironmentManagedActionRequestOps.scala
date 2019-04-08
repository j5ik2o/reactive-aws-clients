// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ApplyEnvironmentManagedActionRequestBuilderOps(val self: ApplyEnvironmentManagedActionRequest.Builder)
    extends AnyVal {

  final def environmentNameAsScala(value: Option[String]): ApplyEnvironmentManagedActionRequest.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  }

  final def environmentIdAsScala(value: Option[String]): ApplyEnvironmentManagedActionRequest.Builder = {
    value.fold(self) { v =>
      self.environmentId(v)
    }
  }

  final def actionIdAsScala(value: Option[String]): ApplyEnvironmentManagedActionRequest.Builder = {
    value.fold(self) { v =>
      self.actionId(v)
    }
  }

}

final class ApplyEnvironmentManagedActionRequestOps(val self: ApplyEnvironmentManagedActionRequest) extends AnyVal {

  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

  final def environmentIdAsScala: Option[String] = Option(self.environmentId)

  final def actionIdAsScala: Option[String] = Option(self.actionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToApplyEnvironmentManagedActionRequestOps {

  implicit def toApplyEnvironmentManagedActionRequestBuilderOps(
      v: ApplyEnvironmentManagedActionRequest.Builder
  ): ApplyEnvironmentManagedActionRequestBuilderOps = new ApplyEnvironmentManagedActionRequestBuilderOps(v)

  implicit def toApplyEnvironmentManagedActionRequestOps(
      v: ApplyEnvironmentManagedActionRequest
  ): ApplyEnvironmentManagedActionRequestOps = new ApplyEnvironmentManagedActionRequestOps(v)

}
