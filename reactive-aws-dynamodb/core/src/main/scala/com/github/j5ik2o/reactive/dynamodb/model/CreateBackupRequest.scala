package com.github.j5ik2o.reactive.dynamodb.model

final case class CreateBackupRequest(tableName: Option[String] = None, backupName: Option[String] = None) {
  def withTableName(value: Option[String]): CreateBackupRequest  = copy(tableName = value)
  def withBackupName(value: Option[String]): CreateBackupRequest = copy(backupName = value)
}
