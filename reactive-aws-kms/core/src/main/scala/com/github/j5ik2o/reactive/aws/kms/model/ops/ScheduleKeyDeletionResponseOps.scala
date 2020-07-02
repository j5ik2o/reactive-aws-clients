// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class ScheduleKeyDeletionResponseBuilderOps(val self: ScheduleKeyDeletionResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): ScheduleKeyDeletionResponse.Builder = {
    value.fold(self) { v => self.keyId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deletionDateAsScala(value: Option[java.time.Instant]): ScheduleKeyDeletionResponse.Builder = {
    value.fold(self) { v => self.deletionDate(v) }
  }

}

final class ScheduleKeyDeletionResponseOps(val self: ScheduleKeyDeletionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deletionDateAsScala: Option[java.time.Instant] = Option(self.deletionDate)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToScheduleKeyDeletionResponseOps {

  implicit def toScheduleKeyDeletionResponseBuilderOps(
      v: ScheduleKeyDeletionResponse.Builder
  ): ScheduleKeyDeletionResponseBuilderOps = new ScheduleKeyDeletionResponseBuilderOps(v)

  implicit def toScheduleKeyDeletionResponseOps(v: ScheduleKeyDeletionResponse): ScheduleKeyDeletionResponseOps =
    new ScheduleKeyDeletionResponseOps(v)

}
