package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class Stream(
    streamArn: Option[String] = None,
    tableName: Option[String] = None,
    streamLabel: Option[String] = None
) {
  def withStreamArn(value: Option[String]): Stream =
    copy(streamArn = value)
  def withTableName(value: Option[String]): Stream =
    copy(tableName = value)
  def withStreamLabel(value: Option[String]): Stream =
    copy(streamLabel = value)
}
