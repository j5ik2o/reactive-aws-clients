// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ApplyEnvironmentManagedActionResponseBuilderOps(val self: ApplyEnvironmentManagedActionResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionIdAsScala(value: Option[String]): ApplyEnvironmentManagedActionResponse.Builder = {
    value.fold(self) { v =>
      self.actionId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionDescriptionAsScala(value: Option[String]): ApplyEnvironmentManagedActionResponse.Builder = {
    value.fold(self) { v =>
      self.actionDescription(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionTypeAsScala(value: Option[ActionType]): ApplyEnvironmentManagedActionResponse.Builder = {
    value.fold(self) { v =>
      self.actionType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[String]): ApplyEnvironmentManagedActionResponse.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class ApplyEnvironmentManagedActionResponseOps(val self: ApplyEnvironmentManagedActionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionIdAsScala: Option[String] = Option(self.actionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionDescriptionAsScala: Option[String] = Option(self.actionDescription)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionTypeAsScala: Option[ActionType] = Option(self.actionType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[String] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToApplyEnvironmentManagedActionResponseOps {

  implicit def toApplyEnvironmentManagedActionResponseBuilderOps(
      v: ApplyEnvironmentManagedActionResponse.Builder
  ): ApplyEnvironmentManagedActionResponseBuilderOps = new ApplyEnvironmentManagedActionResponseBuilderOps(v)

  implicit def toApplyEnvironmentManagedActionResponseOps(
      v: ApplyEnvironmentManagedActionResponse
  ): ApplyEnvironmentManagedActionResponseOps = new ApplyEnvironmentManagedActionResponseOps(v)

}
