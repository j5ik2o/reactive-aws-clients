// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class ScheduleKeyDeletionRequestBuilderOps(val self: ScheduleKeyDeletionRequest.Builder) extends AnyVal {

  final def keyIdAsScala(value: Option[String]): ScheduleKeyDeletionRequest.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

  final def pendingWindowInDaysAsScala(value: Option[Int]): ScheduleKeyDeletionRequest.Builder = {
    value.fold(self) { v =>
      self.pendingWindowInDays(v)
    }
  }

}

final class ScheduleKeyDeletionRequestOps(val self: ScheduleKeyDeletionRequest) extends AnyVal {

  final def keyIdAsScala: Option[String] = Option(self.keyId)

  final def pendingWindowInDaysAsScala: Option[Int] = Option(self.pendingWindowInDays)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToScheduleKeyDeletionRequestOps {

  implicit def toScheduleKeyDeletionRequestBuilderOps(
      v: ScheduleKeyDeletionRequest.Builder
  ): ScheduleKeyDeletionRequestBuilderOps = new ScheduleKeyDeletionRequestBuilderOps(v)

  implicit def toScheduleKeyDeletionRequestOps(v: ScheduleKeyDeletionRequest): ScheduleKeyDeletionRequestOps =
    new ScheduleKeyDeletionRequestOps(v)

}
