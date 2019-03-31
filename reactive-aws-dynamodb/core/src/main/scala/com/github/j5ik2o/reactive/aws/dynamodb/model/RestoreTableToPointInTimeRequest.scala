package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class RestoreTableToPointInTimeRequest(
    sourceTableName: Option[String] = None,
    targetTableName: Option[String] = None,
    useLatestRestorableTime: Option[Boolean] = None,
    restoreDateTime: Option[java.time.Instant] = None
) {
  def withSourceTableName(value: Option[String]): RestoreTableToPointInTimeRequest =
    copy(sourceTableName = value)
  def withTargetTableName(value: Option[String]): RestoreTableToPointInTimeRequest =
    copy(targetTableName = value)
  def withUseLatestRestorableTime(value: Option[Boolean]): RestoreTableToPointInTimeRequest =
    copy(useLatestRestorableTime = value)
  def withRestoreDateTime(value: Option[java.time.Instant]): RestoreTableToPointInTimeRequest =
    copy(restoreDateTime = value)
}
