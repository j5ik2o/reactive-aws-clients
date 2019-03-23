package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class UpdateTimeToLiveRequest(
    tableName: Option[String] = None,
    timeToLiveSpecification: Option[TimeToLiveSpecification] = None
) {
  def withTableName(value: Option[String]): UpdateTimeToLiveRequest =
    copy(tableName = value)
  def withTimeToLiveSpecification(value: Option[TimeToLiveSpecification]): UpdateTimeToLiveRequest =
    copy(timeToLiveSpecification = value)
}
