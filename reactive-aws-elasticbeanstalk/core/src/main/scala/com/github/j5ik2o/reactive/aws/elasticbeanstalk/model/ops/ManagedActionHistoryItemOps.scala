// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ManagedActionHistoryItemBuilderOps(val self: ManagedActionHistoryItem.Builder) extends AnyVal {

  final def actionIdAsScala(value: Option[String]): ManagedActionHistoryItem.Builder = {
    value.fold(self) { v =>
      self.actionId(v)
    }
  } // String

  final def actionTypeAsScala(value: Option[ActionType]): ManagedActionHistoryItem.Builder = {
    value.fold(self) { v =>
      self.actionType(v)
    }
  } // ActionType

  final def actionDescriptionAsScala(value: Option[String]): ManagedActionHistoryItem.Builder = {
    value.fold(self) { v =>
      self.actionDescription(v)
    }
  } // String

  final def failureTypeAsScala(value: Option[FailureType]): ManagedActionHistoryItem.Builder = {
    value.fold(self) { v =>
      self.failureType(v)
    }
  } // FailureType

  final def statusAsScala(value: Option[ActionHistoryStatus]): ManagedActionHistoryItem.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // ActionHistoryStatus

  final def failureDescriptionAsScala(value: Option[String]): ManagedActionHistoryItem.Builder = {
    value.fold(self) { v =>
      self.failureDescription(v)
    }
  } // String

  final def executedTimeAsScala(value: Option[java.time.Instant]): ManagedActionHistoryItem.Builder = {
    value.fold(self) { v =>
      self.executedTime(v)
    }
  } // java.time.Instant

  final def finishedTimeAsScala(value: Option[java.time.Instant]): ManagedActionHistoryItem.Builder = {
    value.fold(self) { v =>
      self.finishedTime(v)
    }
  } // java.time.Instant

}

final class ManagedActionHistoryItemOps(val self: ManagedActionHistoryItem) extends AnyVal {

  final def actionIdAsScala: Option[String] = Option(self.actionId) // String

  final def actionTypeAsScala: Option[ActionType] = Option(self.actionType) // ActionType

  final def actionDescriptionAsScala: Option[String] = Option(self.actionDescription) // String

  final def failureTypeAsScala: Option[FailureType] = Option(self.failureType) // FailureType

  final def statusAsScala: Option[ActionHistoryStatus] = Option(self.status) // ActionHistoryStatus

  final def failureDescriptionAsScala: Option[String] = Option(self.failureDescription) // String

  final def executedTimeAsScala: Option[java.time.Instant] = Option(self.executedTime) // java.time.Instant

  final def finishedTimeAsScala: Option[java.time.Instant] = Option(self.finishedTime) // java.time.Instant

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToManagedActionHistoryItemOps {

  implicit def toManagedActionHistoryItemBuilderOps(
      v: ManagedActionHistoryItem.Builder
  ): ManagedActionHistoryItemBuilderOps = new ManagedActionHistoryItemBuilderOps(v)

  implicit def toManagedActionHistoryItemOps(v: ManagedActionHistoryItem): ManagedActionHistoryItemOps =
    new ManagedActionHistoryItemOps(v)

}
