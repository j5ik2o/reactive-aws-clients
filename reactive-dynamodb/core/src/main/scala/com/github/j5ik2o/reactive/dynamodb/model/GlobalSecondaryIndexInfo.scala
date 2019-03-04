package com.github.j5ik2o.reactive.dynamodb.model

final case class GlobalSecondaryIndexInfo(
    indexName: Option[String] = None,
    keySchema: Option[Seq[KeySchemaElement]] = None,
    projection: Option[Projection] = None,
    provisionedThroughput: Option[ProvisionedThroughput] = None
) {
  def withIndexName(value: Option[String]): GlobalSecondaryIndexInfo                = copy(indexName = value)
  def withKeySchema(value: Option[Seq[KeySchemaElement]]): GlobalSecondaryIndexInfo = copy(keySchema = value)
  def withProjection(value: Option[Projection]): GlobalSecondaryIndexInfo           = copy(projection = value)
  def withProvisionedThroughput(value: Option[ProvisionedThroughput]): GlobalSecondaryIndexInfo =
    copy(provisionedThroughput = value)

}
