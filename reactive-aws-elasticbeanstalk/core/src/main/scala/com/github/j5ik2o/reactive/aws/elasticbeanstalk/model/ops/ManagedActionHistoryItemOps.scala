// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ManagedActionHistoryItemBuilderOps(val self: ManagedActionHistoryItem.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionIdAsScala(value: Option[String]): ManagedActionHistoryItem.Builder = {
    value.fold(self) { v => self.actionId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionTypeAsScala(value: Option[ActionType]): ManagedActionHistoryItem.Builder = {
    value.fold(self) { v => self.actionType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionDescriptionAsScala(value: Option[String]): ManagedActionHistoryItem.Builder = {
    value.fold(self) { v => self.actionDescription(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failureTypeAsScala(value: Option[FailureType]): ManagedActionHistoryItem.Builder = {
    value.fold(self) { v => self.failureType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[ActionHistoryStatus]): ManagedActionHistoryItem.Builder = {
    value.fold(self) { v => self.status(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failureDescriptionAsScala(value: Option[String]): ManagedActionHistoryItem.Builder = {
    value.fold(self) { v => self.failureDescription(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def executedTimeAsScala(value: Option[java.time.Instant]): ManagedActionHistoryItem.Builder = {
    value.fold(self) { v => self.executedTime(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def finishedTimeAsScala(value: Option[java.time.Instant]): ManagedActionHistoryItem.Builder = {
    value.fold(self) { v => self.finishedTime(v) }
  }

}

final class ManagedActionHistoryItemOps(val self: ManagedActionHistoryItem) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionIdAsScala: Option[String] = Option(self.actionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionTypeAsScala: Option[ActionType] = Option(self.actionType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionDescriptionAsScala: Option[String] = Option(self.actionDescription)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failureTypeAsScala: Option[FailureType] = Option(self.failureType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[ActionHistoryStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failureDescriptionAsScala: Option[String] = Option(self.failureDescription)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def executedTimeAsScala: Option[java.time.Instant] = Option(self.executedTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def finishedTimeAsScala: Option[java.time.Instant] = Option(self.finishedTime)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToManagedActionHistoryItemOps {

  implicit def toManagedActionHistoryItemBuilderOps(
      v: ManagedActionHistoryItem.Builder
  ): ManagedActionHistoryItemBuilderOps = new ManagedActionHistoryItemBuilderOps(v)

  implicit def toManagedActionHistoryItemOps(v: ManagedActionHistoryItem): ManagedActionHistoryItemOps =
    new ManagedActionHistoryItemOps(v)

}
