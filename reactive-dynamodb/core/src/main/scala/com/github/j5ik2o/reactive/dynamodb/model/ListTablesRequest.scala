package com.github.j5ik2o.reactive.dynamodb.model

final case class ListTablesRequest(exclusiveStartTableName: Option[String] = None, limit: Option[Int] = None) {
  def withExclusiveStartTableName(value: Option[String]): ListTablesRequest = copy(exclusiveStartTableName = value)
  def withLimit(value: Option[Int]): ListTablesRequest                      = copy(limit = value)
}
