package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class DeleteBackupRequest(
    backupArn: Option[String] = None
) {
  def withBackupArn(value: Option[String]): DeleteBackupRequest =
    copy(backupArn = value)
}
