package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class DescribeBackupRequest(
    backupArn: Option[String] = None
) {
  def withBackupArn(value: Option[String]): DescribeBackupRequest =
    copy(backupArn = value)
}
