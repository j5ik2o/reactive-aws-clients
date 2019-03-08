package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class CreateGlobalSecondaryIndexAction(
    indexName: Option[String] = None,
    keySchema: Option[Seq[KeySchemaElement]] = None,
    projection: Option[Projection] = None,
    provisionedThroughput: Option[ProvisionedThroughput] = None
) {
  def withIndexName(value: Option[String]): CreateGlobalSecondaryIndexAction =
    copy(indexName = value)
  def withKeySchema(value: Option[Seq[KeySchemaElement]]): CreateGlobalSecondaryIndexAction =
    copy(keySchema = value)
  def withProjection(value: Option[Projection]): CreateGlobalSecondaryIndexAction =
    copy(projection = value)
  def withProvisionedThroughput(value: Option[ProvisionedThroughput]): CreateGlobalSecondaryIndexAction =
    copy(provisionedThroughput = value)
}
