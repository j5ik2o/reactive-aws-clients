package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class DeleteTableRequest(tableName: Option[String] = None) {
  def withTableName(value: Option[String]): DeleteTableRequest = copy(tableName = value)
}
