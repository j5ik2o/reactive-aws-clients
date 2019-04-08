// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ApplyEnvironmentManagedActionResponseBuilderOps(val self: ApplyEnvironmentManagedActionResponse.Builder)
    extends AnyVal {

  final def actionIdAsScala(value: Option[String]): ApplyEnvironmentManagedActionResponse.Builder = {
    value.fold(self) { v =>
      self.actionId(v)
    }
  } // String

  final def actionDescriptionAsScala(value: Option[String]): ApplyEnvironmentManagedActionResponse.Builder = {
    value.fold(self) { v =>
      self.actionDescription(v)
    }
  } // String

  final def actionTypeAsScala(value: Option[ActionType]): ApplyEnvironmentManagedActionResponse.Builder = {
    value.fold(self) { v =>
      self.actionType(v)
    }
  } // String

  final def statusAsScala(value: Option[String]): ApplyEnvironmentManagedActionResponse.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // String

}

final class ApplyEnvironmentManagedActionResponseOps(val self: ApplyEnvironmentManagedActionResponse) extends AnyVal {

  final def actionIdAsScala: Option[String] = Option(self.actionId) // String

  final def actionDescriptionAsScala: Option[String] = Option(self.actionDescription) // String

  final def actionTypeAsScala: Option[ActionType] = Option(self.actionType) // String

  final def statusAsScala: Option[String] = Option(self.status) // String

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
