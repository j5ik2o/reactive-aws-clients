package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class DescribeGlobalTableRequest(globalTableName: Option[String] = None) {
  def withGlobalTableName(value: Option[String]): DescribeGlobalTableRequest = copy(globalTableName = value)
}
