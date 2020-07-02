// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ManagedActionBuilderOps(val self: ManagedAction.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionIdAsScala(value: Option[String]): ManagedAction.Builder = {
    value.fold(self) { v => self.actionId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionDescriptionAsScala(value: Option[String]): ManagedAction.Builder = {
    value.fold(self) { v => self.actionDescription(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionTypeAsScala(value: Option[ActionType]): ManagedAction.Builder = {
    value.fold(self) { v => self.actionType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[ActionStatus]): ManagedAction.Builder = {
    value.fold(self) { v => self.status(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def windowStartTimeAsScala(value: Option[java.time.Instant]): ManagedAction.Builder = {
    value.fold(self) { v => self.windowStartTime(v) }
  }

}

final class ManagedActionOps(val self: ManagedAction) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionIdAsScala: Option[String] = Option(self.actionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionDescriptionAsScala: Option[String] = Option(self.actionDescription)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionTypeAsScala: Option[ActionType] = Option(self.actionType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[ActionStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def windowStartTimeAsScala: Option[java.time.Instant] = Option(self.windowStartTime)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToManagedActionOps {

  implicit def toManagedActionBuilderOps(v: ManagedAction.Builder): ManagedActionBuilderOps =
    new ManagedActionBuilderOps(v)

  implicit def toManagedActionOps(v: ManagedAction): ManagedActionOps = new ManagedActionOps(v)

}
