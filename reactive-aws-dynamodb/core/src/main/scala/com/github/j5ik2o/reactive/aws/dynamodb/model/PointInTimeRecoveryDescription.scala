package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class PointInTimeRecoveryDescription(
    pointInTimeRecoveryStatus: Option[PointInTimeRecoveryStatus] = None,
    earliestRestorableDateTime: Option[java.time.Instant] = None,
    latestRestorableDateTime: Option[java.time.Instant] = None
) {
  def withPointInTimeRecoveryStatus(value: Option[PointInTimeRecoveryStatus]): PointInTimeRecoveryDescription =
    copy(pointInTimeRecoveryStatus = value)
  def withEarliestRestorableDateTime(value: Option[java.time.Instant]): PointInTimeRecoveryDescription =
    copy(earliestRestorableDateTime = value)
  def withLatestRestorableDateTime(value: Option[java.time.Instant]): PointInTimeRecoveryDescription =
    copy(latestRestorableDateTime = value)
}
