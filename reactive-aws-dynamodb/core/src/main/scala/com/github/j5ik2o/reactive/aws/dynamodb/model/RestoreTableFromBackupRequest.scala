package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class RestoreTableFromBackupRequest(targetTableName: Option[String] = None,
                                               backupArn: Option[String] = None) {
  def withTargetTableName(value: Option[String]): RestoreTableFromBackupRequest = copy(targetTableName = value)
  def withBackupArn(value: Option[String]): RestoreTableFromBackupRequest       = copy(backupArn = value)
}
