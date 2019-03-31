package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class UpdateGlobalSecondaryIndexAction(
    indexName: Option[String] = None,
    provisionedThroughput: Option[ProvisionedThroughput] = None
) {
  def withIndexName(value: Option[String]): UpdateGlobalSecondaryIndexAction =
    copy(indexName = value)
  def withProvisionedThroughput(value: Option[ProvisionedThroughput]): UpdateGlobalSecondaryIndexAction =
    copy(provisionedThroughput = value)
}
