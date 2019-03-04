package com.github.j5ik2o.reactive.aws.dynamodb.model
import java.time.Instant

final case class ListBackupsRequest(tableName: Option[String] = None,
                                    limit: Option[Int] = None,
                                    timeRangeLowerBound: Option[Instant] = None,
                                    timeRangeUpperBound: Option[Instant] = None,
                                    exclusiveStartBackupArn: Option[String] = None,
                                    backupType: Option[BackupType] = None) {

  def withTableName(value: Option[String]): ListBackupsRequest               = copy(tableName = value)
  def withLimit(value: Option[Int]): ListBackupsRequest                      = copy(limit = value)
  def withTimeRangeLowerBound(value: Option[Instant]): ListBackupsRequest    = copy(timeRangeLowerBound = value)
  def withTimeRangeUpperBound(value: Option[Instant]): ListBackupsRequest    = copy(timeRangeUpperBound = value)
  def withExclusiveStartBackupArn(value: Option[String]): ListBackupsRequest = copy(exclusiveStartBackupArn = value)
  def withBackupType(value: Option[BackupType]): ListBackupsRequest          = copy(backupType = value)

}
