package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class ListStreamsRequest(
    tableName: Option[String] = None,
    limit: Option[Int] = None,
    exclusiveStartStreamArn: Option[String] = None
) {
  def withTableName(value: Option[String]): ListStreamsRequest =
    copy(tableName = value)
  def withLimit(value: Option[Int]): ListStreamsRequest =
    copy(limit = value)
  def withExclusiveStartStreamArn(value: Option[String]): ListStreamsRequest =
    copy(exclusiveStartStreamArn = value)
}
