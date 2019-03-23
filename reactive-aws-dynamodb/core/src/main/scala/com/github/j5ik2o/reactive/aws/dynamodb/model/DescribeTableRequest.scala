package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class DescribeTableRequest(
    tableName: Option[String] = None
) {
  def withTableName(value: Option[String]): DescribeTableRequest =
    copy(tableName = value)
}
