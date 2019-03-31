package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class ListBackupsRequest(
    tableName: Option[String] = None,
    limit: Option[Int] = None,
    timeRangeLowerBound: Option[java.time.Instant] = None,
    timeRangeUpperBound: Option[java.time.Instant] = None,
    exclusiveStartBackupArn: Option[String] = None,
    backupType: Option[BackupTypeFilter] = None
) {
  def withTableName(value: Option[String]): ListBackupsRequest =
    copy(tableName = value)
  def withLimit(value: Option[Int]): ListBackupsRequest =
    copy(limit = value)
  def withTimeRangeLowerBound(value: Option[java.time.Instant]): ListBackupsRequest =
    copy(timeRangeLowerBound = value)
  def withTimeRangeUpperBound(value: Option[java.time.Instant]): ListBackupsRequest =
    copy(timeRangeUpperBound = value)
  def withExclusiveStartBackupArn(value: Option[String]): ListBackupsRequest =
    copy(exclusiveStartBackupArn = value)
  def withBackupType(value: Option[BackupTypeFilter]): ListBackupsRequest =
    copy(backupType = value)
}
