package com.github.j5ik2o.reactive.dynamodb.model

import java.time.Instant

final case class PointInTimeRecoveryDescription(pointInTimeRecoveryStatus: Option[PointInTimeRecoveryStatus] = None,
                                                earliestRestorableDateTime: Option[Instant] = None,
                                                latestRestorableDateTime: Option[Instant] = None) {
  def withPointInTimeRecoveryStatus(value: Option[PointInTimeRecoveryStatus]): PointInTimeRecoveryDescription =
    copy(pointInTimeRecoveryStatus = value)
  def withEarliestRestorableDateTime(value: Option[Instant]): PointInTimeRecoveryDescription =
    copy(earliestRestorableDateTime = value)
  def withLatestRestorableDateTime(value: Option[Instant]): PointInTimeRecoveryDescription =
    copy(latestRestorableDateTime = value)
}
