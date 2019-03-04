package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class DescribeGlobalTableSettingsRequest(globalTableName: Option[String] = None) {
  def withGlobalTableName(value: Option[String]): DescribeGlobalTableSettingsRequest = copy(globalTableName = value)
}
