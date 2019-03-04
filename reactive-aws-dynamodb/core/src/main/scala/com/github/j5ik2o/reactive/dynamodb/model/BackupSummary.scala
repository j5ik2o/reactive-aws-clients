package com.github.j5ik2o.reactive.dynamodb.model

import java.time.Instant

final case class BackupSummary(tableName: Option[String] = None,
                               tableId: Option[String] = None,
                               tableArn: Option[String] = None,
                               backupArn: Option[String] = None,
                               backupName: Option[String] = None,
                               backupCreationDateTime: Option[Instant] = None,
                               backupExpiryDateTime: Option[Instant] = None,
                               backupStatus: Option[BackupStatus] = None,
                               backupType: Option[BackupType] = None,
                               backupSizeBytes: Option[Long] = None) {

  def withTableName(value: Option[String]): BackupSummary               = copy(tableName = value)
  def withTableId(value: Option[String]): BackupSummary                 = copy(tableId = value)
  def withTableArn(value: Option[String]): BackupSummary                = copy(tableArn = value)
  def withBackupArn(value: Option[String]): BackupSummary               = copy(backupArn = value)
  def withBackupName(value: Option[String]): BackupSummary              = copy(backupName = value)
  def withBackupCreationDateTime(value: Option[Instant]): BackupSummary = copy(backupCreationDateTime = value)
  def withBackupExpiryDateTime(value: Option[Instant]): BackupSummary   = copy(backupExpiryDateTime = value)
  def withBackupStatus(value: Option[BackupStatus]): BackupSummary      = copy(backupStatus = value)
  def withBackupType(value: Option[BackupType]): BackupSummary          = copy(backupType = value)
  def withBackupSizeBytes(value: Option[Long]): BackupSummary           = copy(backupSizeBytes = value)

}
