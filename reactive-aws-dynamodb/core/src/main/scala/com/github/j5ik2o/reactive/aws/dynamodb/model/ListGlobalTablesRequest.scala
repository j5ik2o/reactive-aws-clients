package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class ListGlobalTablesRequest(exclusiveStartGlobalTableName: Option[String] = None,
                                         limit: Option[Int] = None,
                                         regionName: Option[String] = None) {
  def withExclusiveStartGlobalTableName(value: Option[String]): ListGlobalTablesRequest =
    copy(exclusiveStartGlobalTableName = value)
  def withLimit(value: Option[Int]): ListGlobalTablesRequest         = copy(limit = value)
  def withRegionName(value: Option[String]): ListGlobalTablesRequest = copy(regionName = value)
}
