// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateFleetErrorBuilderOps(val self: CreateFleetError.Builder) extends AnyVal {

  final def launchTemplateAndOverridesAsScala(
      value: Option[LaunchTemplateAndOverridesResponse]
  ): CreateFleetError.Builder = {
    value.fold(self) { v =>
      self.launchTemplateAndOverrides(v)
    }
  }

  final def lifecycleAsScala(value: Option[InstanceLifecycle]): CreateFleetError.Builder = {
    value.fold(self) { v =>
      self.lifecycle(v)
    }
  }

  final def errorCodeAsScala(value: Option[String]): CreateFleetError.Builder = {
    value.fold(self) { v =>
      self.errorCode(v)
    }
  }

  final def errorMessageAsScala(value: Option[String]): CreateFleetError.Builder = {
    value.fold(self) { v =>
      self.errorMessage(v)
    }
  }

}

final class CreateFleetErrorOps(val self: CreateFleetError) extends AnyVal {

  final def launchTemplateAndOverridesAsScala: Option[LaunchTemplateAndOverridesResponse] =
    Option(self.launchTemplateAndOverrides)

  final def lifecycleAsScala: Option[InstanceLifecycle] = Option(self.lifecycle)

  final def errorCodeAsScala: Option[String] = Option(self.errorCode)

  final def errorMessageAsScala: Option[String] = Option(self.errorMessage)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateFleetErrorOps {

  implicit def toCreateFleetErrorBuilderOps(v: CreateFleetError.Builder): CreateFleetErrorBuilderOps =
    new CreateFleetErrorBuilderOps(v)

  implicit def toCreateFleetErrorOps(v: CreateFleetError): CreateFleetErrorOps = new CreateFleetErrorOps(v)

}
