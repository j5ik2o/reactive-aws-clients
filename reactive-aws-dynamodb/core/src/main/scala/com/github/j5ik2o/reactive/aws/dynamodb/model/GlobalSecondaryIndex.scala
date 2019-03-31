package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class GlobalSecondaryIndex(
    indexName: Option[String] = None,
    keySchema: Option[Seq[KeySchemaElement]] = None,
    projection: Option[Projection] = None,
    provisionedThroughput: Option[ProvisionedThroughput] = None
) {
  def withIndexName(value: Option[String]): GlobalSecondaryIndex =
    copy(indexName = value)
  def withKeySchema(value: Option[Seq[KeySchemaElement]]): GlobalSecondaryIndex =
    copy(keySchema = value)
  def withProjection(value: Option[Projection]): GlobalSecondaryIndex =
    copy(projection = value)
  def withProvisionedThroughput(value: Option[ProvisionedThroughput]): GlobalSecondaryIndex =
    copy(provisionedThroughput = value)
}
