// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class PointInTimeRecoveryDescriptionBuilderOps(val self: PointInTimeRecoveryDescription.Builder) extends AnyVal {

  final def pointInTimeRecoveryStatusAsScala(
      value: Option[PointInTimeRecoveryStatus]
  ): PointInTimeRecoveryDescription.Builder = {
    value.fold(self) { v =>
      self.pointInTimeRecoveryStatus(v)
    }
  }

  final def earliestRestorableDateTimeAsScala(
      value: Option[java.time.Instant]
  ): PointInTimeRecoveryDescription.Builder = {
    value.fold(self) { v =>
      self.earliestRestorableDateTime(v)
    }
  }

  final def latestRestorableDateTimeAsScala(
      value: Option[java.time.Instant]
  ): PointInTimeRecoveryDescription.Builder = {
    value.fold(self) { v =>
      self.latestRestorableDateTime(v)
    }
  }

}

final class PointInTimeRecoveryDescriptionOps(val self: PointInTimeRecoveryDescription) extends AnyVal {

  final def pointInTimeRecoveryStatusAsScala: Option[PointInTimeRecoveryStatus] = Option(self.pointInTimeRecoveryStatus)

  final def earliestRestorableDateTimeAsScala: Option[java.time.Instant] = Option(self.earliestRestorableDateTime)

  final def latestRestorableDateTimeAsScala: Option[java.time.Instant] = Option(self.latestRestorableDateTime)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPointInTimeRecoveryDescriptionOps {

  implicit def toPointInTimeRecoveryDescriptionBuilderOps(
      v: PointInTimeRecoveryDescription.Builder
  ): PointInTimeRecoveryDescriptionBuilderOps = new PointInTimeRecoveryDescriptionBuilderOps(v)

  implicit def toPointInTimeRecoveryDescriptionOps(
      v: PointInTimeRecoveryDescription
  ): PointInTimeRecoveryDescriptionOps = new PointInTimeRecoveryDescriptionOps(v)

}
