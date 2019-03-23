package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class BackupDetails(
    backupArn: Option[String] = None,
    backupName: Option[String] = None,
    backupSizeBytes: Option[Long] = None,
    backupStatus: Option[BackupStatus] = None,
    backupType: Option[BackupType] = None,
    backupCreationDateTime: Option[java.time.Instant] = None,
    backupExpiryDateTime: Option[java.time.Instant] = None
) {
  def withBackupArn(value: Option[String]): BackupDetails =
    copy(backupArn = value)
  def withBackupName(value: Option[String]): BackupDetails =
    copy(backupName = value)
  def withBackupSizeBytes(value: Option[Long]): BackupDetails =
    copy(backupSizeBytes = value)
  def withBackupStatus(value: Option[BackupStatus]): BackupDetails =
    copy(backupStatus = value)
  def withBackupType(value: Option[BackupType]): BackupDetails =
    copy(backupType = value)
  def withBackupCreationDateTime(value: Option[java.time.Instant]): BackupDetails =
    copy(backupCreationDateTime = value)
  def withBackupExpiryDateTime(value: Option[java.time.Instant]): BackupDetails =
    copy(backupExpiryDateTime = value)
}
