package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class DescribeContinuousBackupsRequest(
    tableName: Option[String] = None
) {
  def withTableName(value: Option[String]): DescribeContinuousBackupsRequest =
    copy(tableName = value)
}
